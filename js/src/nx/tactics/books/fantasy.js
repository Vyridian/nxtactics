'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_fantasy {

  /**
   * @function chapter_fantasy_overview
   * @return {chapter}
   */
  static t_chapter_fantasy_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_fantasy_overview = {
    vx_type: nx_tactics_books_fantasy.t_chapter_fantasy_overview
  }

  // (func chapter_fantasy_overview)
  static f_chapter_fantasy_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Fantasy Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Fantasy Armor",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Fantasy Armor",
          ":summary",
          "* Cloth Armor - Increases Magical Regeneration\n* Light Armor - Increases Critical Strike change\n* Heavy Armor - Maximum Defense",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Moon Disc",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Moon Disc",
              ":summary",
              "* A [Silver] Shield.",
              ":classification",
              "Shield"
            )
          )
        ),
        "Fantasy Weapons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Fantasy Weapons",
          ":summary",
          "* Faeblades"
        ),
        "Elder Tongue",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Elder Tongue",
          ":summary",
          "Prefixes\n* Alf - Elf\n* Dverg - Dwarf\n* Hel - Dead\n* Jotun - Giant\n* Man - Human\n* Muspel - Fire\n* Nifl - Mist\n* Svart - Dark\n* Yo - Demonic\nSuffixes\n* Ar - Race\n* Heim - Home\n* Ki - Soul\n* Ma - Creature\n* Traum - Dream\nWords\n* Alfar - Elvish Race\n* Albtraum - Elf Dream (Nightmare)\n* Alfheim - Land of Elves\n* Dvergar - Dwarven Race\n* Helar - Restless Dead\n* Helheim - Land of the dead\n* Manar - Human Race\n* Manheim - Land of Men\n* Muspelheim - Land of Fire\n* Niflheim - Land of Ice\n* Svartalfheim - Land of Dark Elves\n* Yoki - Demon Soul\n* Yoma - Demon"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_genshin_impact
   * @return {chapter}
   */
  static t_chapter_genshin_impact = {
    vx_type: vx_core.t_type
  }
  static e_chapter_genshin_impact = {
    vx_type: nx_tactics_books_fantasy.t_chapter_genshin_impact
  }

  // (func chapter_genshin_impact)
  static f_chapter_genshin_impact() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Genshin Impact",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Archons",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Archons",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Furina",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Furina",
              ":titles",
              "Focolor"
            ),
            ":Nahida",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Nahida"
            ),
            "Raiden Shogun",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Raiden Shogun",
              ":summary",
              "* The Raiden Shogun is the current Electro Archon. There are actually 3 versions of the Shogun that look almost identical: The twin sisters Ei and Makoto, and the artificial duplicate called the Puppet.\n* Makoto (Baal) - Makoto and Ei shared the title of Electro Archon, pretending to be a single being. Makoto was the diplomat and Ei was the warrior. Ei carried a sword, but she was not known to be a great warrior. Her electro powers were her main ability. Makoto died during the battle of Khaenri'ah.\n* Ei (Baalzebub) - Ei considered herself to be Makoto's shadow and mostly served as her muscle. After Makoto's death, she constructed the Puppet, tranfered her spirit into her sword, and mostly allowed the puppet to rule in her stead. Ei is divinely skilled in combat.\n* Puppet - The puppet is an advanced alchemical creation with power and combat ability perfectly equal to Ei in every way. Generally, the puppet is the only version of the Shogun that anyone sees. Even when Ei is in control, she is controlling the puppet, since she no longer has her own physical form.\n* Feats of Power\n** Musou no Hitotachi - A supposedly unblockable sword attack from the Shogun that is her supreme attack.\n** She easily defeats the traveller and nearly kills them.\n** She easily executes Signora and incinerates her.\n** She slew the god Orobashi and split the islands apart. Residual Electro still makes this area dangerous over 2000 years later.\n** She creates a perpetual storm around Inazuma for years.\n** She states that she can casually stop storms across the world to let people sleep.",
              ":titles",
              "Baal, Baalzebub, Ei, Makoto, Puppet, Shadow"
            ),
            ":Venti",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Venti",
              ":summary",
              "* Barbados splits the mountains in Mondstadt with a divine wind and sends entire mountains flying to become the Golden Apple Archepelego.\n* Barbados is easily considered to be the weakest of the Archons.",
              ":titles",
              "Barbados"
            ),
            "Zhong Li",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Zhong Li",
              ":summary",
              "* Zhong Li dominated the Archon War.",
              ":titles",
              "Morax, Rex Lapis"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_god_of_war
   * @return {chapter}
   */
  static t_chapter_god_of_war = {
    vx_type: vx_core.t_type
  }
  static e_chapter_god_of_war = {
    vx_type: nx_tactics_books_fantasy.t_chapter_god_of_war
  }

  // (func chapter_god_of_war)
  static f_chapter_god_of_war() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "God of War",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "God of War Equipment",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "God of War Equipment",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Pandora's Box",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pandora's Box",
              ":reference",
              "* The box was actually mistranslated.  It is actually Pandora's Jar.",
              ":summary",
              "* After the great war with the Titans, Zeus gathered the great evils of the war and bid Hephaestus construct a box\nto hold them.  Later Kratos seeks out the box to use the evils inside against Ares."
            )
          )
        ),
        "God of War Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "God of War Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Kratos",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Kratos",
              ":image",
              "Fantasy/Kratos.png"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_lord_of_the_rings
   * @return {chapter}
   */
  static t_chapter_lord_of_the_rings = {
    vx_type: vx_core.t_type
  }
  static e_chapter_lord_of_the_rings = {
    vx_type: nx_tactics_books_fantasy.t_chapter_lord_of_the_rings
  }

  // (func chapter_lord_of_the_rings)
  static f_chapter_lord_of_the_rings() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Lord of the Rings",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Lord of the Rings Units",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Lord of the Rings Units",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Galadriel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Galadriel",
              ":reference",
              "* If you ask it of me, I will give you the One Ring. You offer it to me\nfreely? I do not deny that my heart has greatly desired this. In the\nplace of a Dark Lord you would have a Queen! Not dark but beautiful and\nterrible as the Dawn! Treacherous as the Seas! Stronger than the\nfoundations of the Earth! All shall love me and despair! ... I passed\nthe test. I shall diminish, and go to the west, and remain Galadriel.\n- Frodo and Galadriel - Lord of the Rings"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_material_realm
   * @return {chapter}
   */
  static t_chapter_material_realm = {
    vx_type: vx_core.t_type
  }
  static e_chapter_material_realm = {
    vx_type: nx_tactics_books_fantasy.t_chapter_material_realm
  }

  // (func chapter_material_realm)
  static f_chapter_material_realm() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Material Realm",
      ":summary",
      "* Those places we can measure and understand.\n* The universe of Nexus Fantasy is different from the real world. The world is called Ur and the stars are all different planes of existence separated by the void of space and the Ether.\n* The Material Realm is described by coordinates for +x, +y, +z, +t (length, height, width, time)\n* Aeur - The sky (Aeurfolk)\n* Fyur - Flame (Fyurfolk)\n* Mur - The oceans (Murfolk, Murmen)\n* Ur - The land (Urfolk, Urmen)\n* The Primes",
      ":titles",
      "Areth, Archea, Gaia, Koltho, Material Realm, Middle Earth, Middle Kingdom, Middle Realm, Midgard, Mortal Realm, Mother Earth",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Africana",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Africana",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Aegyptus",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Aegyptus",
              ":reference",
              "Ancient Egypt",
              ":summary",
              "* Units - Charioteer, Necromancer, Pharoh, Sun Priest, Sorceror/Hieolphant\n* The Empire of the Sun - Aegyptus worship the sun and the nile river that brings life.\n* Sun Disc - Round shield with the image of the sun is a standard decoration.\n* Sun Spear - Spear with the image of the sun near its point.",
              ":titles",
              "Aegypta, Helios, Kemet",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Alexandria",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Alexandria",
                  ":summary",
                  "* Lighthouse of Alexandria - One of the Seven Wonders of the World\n* Library of Alexandra - The foremost center of learning in the world."
                ),
                "Great Pyramids",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Great Pyramids",
                  ":reference",
                  "* The Pyramid of Cheops was originally no less than four hundred and ninety feet high.  Its base covers 31 acres...contains 2,300,000 blocks of stone, each averaging two and a half tons...set with joints measuring one ten-thousandth of an inch wide. - Ancient Egypt, Its Culture and History",
                  ":summary",
                  "* One of the Seven Wonder of the World"
                ),
                ":Necropolis",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Necropolis",
                  ":summary",
                  "* Despite time, the elements, and cataclysmic upheavals, the ruins of the Citystate of Quaran still stands as grim reminders of that dark and nearly forgotten age. Here amidst stark stone towers and nightmarish effigies, once flourished the capital of the most sinister empire in human history.\n* Over the years, occultists, black magicians, and tomb robbers have come to the ruins in search dark and macabre secrets. Many cursed tomes, diabolical artifacts, and instruments of torture and death have been recovered, often to the great regret of those who discovered them. Countless more lie in tombs, vaults, and underground pits and tunnels, awaiting discovery by those who covet infernal knowledge above all other considerations."
                ),
                "Pyramid of Skulls",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Pyramid of Skulls",
                  ":summary",
                  "* The Quaran Necromancer-Kings erected a mountain of skulls 1000 feet high, representing untold millions of their victims. The mountain stands to this day and appears to be magically resistent to destruction."
                ),
                ":Thebes",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Thebes"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Kemet Tomb Robber",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Kemet Tomb Robber",
                  ":summary",
                  "* The tomb robbers are nomadic folk who have found a profitable lifestyle by digging in dangerous tombs for untold riches. They can act as guides for expeditions into the desert."
                )
              )
            ),
            ":Batrea",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Batrea",
              ":summary",
              "* Home of the Batrean people. The Batrean males and females visually appear to be entirely different races. The males are brutish and ugly while the females are graceful and incredibly beautiful. It is the peculiar custom of Batrean males to sell their females as concubines. The females do not seem to mind leaving their brutish husbands and thatch and mud hovels.\n* History - The Batreans are a primitive people when they were visited by a Warlock fleeing persecution. The natives marvelled at his magic, so he set up a little fiefdom for himself in the jungle. He took slaves and enchanted a few to be beautiful servants. Later, one of his lovely maidens killed him in his sleep. Unwittingly, however, he had set a selective breeding program in motion. The beautiful servants returned to their village where the males enslaved them and exiled the ordinary women. Within a generation, only the beautiful women reproduced and their daughters were as lovely as themselves while the sons remained simple and primitive. Generations later, the Batreans are a complicated people, completely split by gender.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Batrean Concubine",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Batrean Concubine",
                  ":summary",
                  "* Batreans women are engaging creatures, slender and lovely beyond compare. Their movements are graceful, and their manner of speech is charming and at times most eloquent. They are reknowned in other lands as the perfect concubines. Some say, however, that the Batrean women exhibit an uncanny ability to sublty influence their masters."
                ),
                "Batrean Grunt",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Batrean Grunt",
                  ":summary",
                  "* Batrean men are huge, slope shouldered, and remarkably ugly. They are slow and brutish and are constantly arguing and fighting among themselves. They generally ignore the beautiful females except during their week-long mating season."
                )
              )
            ),
            "Burning Waste",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Burning Waste",
              ":reference",
              "Sahara Desert",
              ":summary",
              "* The Burning Waste is a massive desert (the largest in the world) that stretches across the northern Africana continent. Where the desert meet the Mediterrainean, the water creates a long strip of jungles or swamps. These are also the only inhabited areas near the Burning Waste.\n* Red Iron - The sand of the Burning Wastes has a high iron content in the form of rust dust. With difficulty, the sand can be smelted back into iron. Typically, the red tinge is left in to show its origination.\n* Politics - Many nations claim large sections of the desert, but no one really maintains any ownership over such a harsh realm."
            ),
            ":Djaffa",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Djaffa",
              ":summary",
              "* Djaffir are a slender, wiry desert people famous for being masterful merchants who always drive a hard bargain. They wear flowing head-dresses, robes, cloaks, and leather masks. They do not remove their masks believing that the face is the mirror to the soul and believe the masks protect them from hostile magic. The more skeptical claim that they were masks to conceal their identities from those they intend to relive of their money.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Djaffir Bandit",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Djaffir Bandit",
                  ":summary",
                  "* There are small tribes of Djaffir bandits living in the desert preying on caravans. Though they will kill if provoked, they are not prone to wanton violence. Neither are they known to raid the caravans of the Djaffir Merchants, a fact which many attribute to collusion between the Sheiks of the two tribal groups. Some say the differnce between a merchant and a bandit is a matter of semantics."
                ),
                "Djaffir Merchant",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Djaffir Merchant",
                  ":summary",
                  "* They are shrewd hagglers, but fortunately they are very proud of their reputations so they typically only trade in high quality goods.\n* The merchants live in walled towns surrounding oases."
                ),
                "Djaffir Wizard",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Djaffir Wizard",
                  ":summary",
                  "* The Wizards are well regarded by their people as seers and mystics. Like the rest of their people they are superstitious and see omens everywhere."
                )
              )
            ),
            ":Dracarta",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Dracarta",
              ":summary",
              "* Trade - The Dracatans smelt Red Iron in large quantities, and export it throughout the area. Their prices remain low enough that it is not cost effective to compete with their efficient facilities.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Dracartan Cisterns",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Dracartan Cisterns",
                  ":summary",
                  "* The water supply of Dracarta is perhaps its most precious commodity. The supply is kept in a series of enormous underground cisterns. Tampering with the water supply in any way is a captial offense and there are numerous signs reinforcing that fact."
                ),
                "Dracata Halls of Infamy",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Dracata Halls of Infamy",
                  ":summary",
                  "* Here are arrayed the worst and most despicable criminals in Dracartan history. Their statue-like forms standing as warning to future offenders, preserved by immersion in Red Iron."
                ),
                "Dracata Halls of Justice",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Dracata Halls of Justice",
                  ":summary",
                  "* The Council of Elders, Dracarta's esteemed legisilative/judicial body holds sway in these large halls. The laws of the land are determined here. Serious crimes are also heard here in open court. Punishments include forced labor, banishment to the wilderness, or for truly heinous offenses: the sentence of Retribution (immersion in red iron)."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Dracartan Alchemist",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Dracartan Alchemist",
                  ":summary",
                  "* Dracartan Alchemists are employed to create storm crystals and adamantine for the duneships."
                ),
                "Dracartan Desert Scout",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Dracartan Desert Scout",
                  ":summary",
                  "* The Dracartan military is largely composed of these scouts. In order to survive in the desert they do not user heavy gear or weapons. When facing difficult foes they will use the desert as their primary weapon."
                ),
                "Dracartam Duneship",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Dracartam Duneship",
                  ":summary",
                  "* The legendary duneships of the Dracartan army. They race across the desert sand on adamantine runners. They are powered by storm crystals produced and ignited by the Alchemists into the huge wind funnels that propel the duneships across the sand.\n* The duneships serve as troop carriers and mobile siege engines. Light Ballistas and light greek fire catapults are typically carried.\n* Despite the name, duneships cannot climb hills and may only travel on level sand. They also lack manueverability and may not travel into headwinds by tacking.\n* The forward section of the hull can be lowered to allow mounts to enter and exit.\n* The duneships are expensive to use and maintain, so they are only deployed in special occassions, especially when a show of force is required."
                )
              )
            ),
            ":Carthage",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Carthage",
              ":summary",
              "* City/State\n* Worship the Devil King [Baal Moloch]."
            ),
            "Chana Jungles",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Chana Jungles",
              ":summary",
              "* Home of the Chana Wildmen, the jungles are also home numerous dangerous and noisome insects, snakes, leeches, and even plants.\n* Wildmen - Many large tribes of Wildmen live throughout the jungle living off of the rich vegetation and animal-life. The Wildmen are deeply addicted to [Skullcap] mushrooms and have been driven violently insane from its hallucinatory effects. They are also warlike in the extreme with tribes constantly ambushing one another to gain territory. In battle, they thrive on brutality, and mercy is considered a weakness. Prisoners are publicly skinned alive to the delight of the tribe.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Chana Warlord",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Chana Warlord",
                  ":summary",
                  "* The leaders of the wildmen tribes are horrible and immensely obese creatures that have gained power through demonic pacts and are said to be part demon themselves."
                ),
                "Chana Wildman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Chana Wildman",
                  ":summary",
                  "* The Wildmen are savage cannibals who cover themselves with terrifying body paints. They only respect bravery and any who show fear are ritually slain to their fearsome gods. They are very superstition and in awe of magic, so they obey the Witchmen without question. They live a nocturnal lifestyle and are skilled at axes, spears, and bolas."
                ),
                "Chana Witchman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Chana Witchman",
                  ":summary",
                  "* The Witchmen revere the forces of darkness and despise the enemies of their gods the forces of light. They live a completely nocturnal lifestyle and are skilled at witchcraft and herbalism.\n* They sing songs of fear and death that are said to strike madness in those that hear them.\n* They create shrunken heads from their victims and wear them as jujus. It is said that they can capture a person's soul and control their body like a mindless zombie.\n* Some have trained Death's Head Vipers as pets and wear them as bracelets.",
                  ":unitpowermap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitpowermap,
                    ":Sympathy",
                    vx_core.f_new(
                      nx_tactics_base.t_unitpower,
                      ":name",
                      "Sympathy"
                    ),
                    ":Enchantment",
                    vx_core.f_new(
                      nx_tactics_base.t_unitpower,
                      ":name",
                      "Enchantment"
                    ),
                    ":Naturalism",
                    vx_core.f_new(
                      nx_tactics_base.t_unitpower,
                      ":name",
                      "Naturalism"
                    ),
                    ":Madness",
                    vx_core.f_new(
                      nx_tactics_base.t_unitpower,
                      ":name",
                      "Madness"
                    )
                  ),
                  ":unitskillmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitskillmap,
                    "Animal Handling",
                    vx_core.f_new(
                      nx_tactics_base.t_unitskill,
                      ":name",
                      "Animal Handling",
                      ":unitabilitymap",
                      vx_core.f_new(
                        nx_tactics_base.t_unitabilitymap,
                        "Snake Charming",
                        vx_core.f_new(
                          nx_tactics_base.t_unitability,
                          ":name",
                          "Snake Charming"
                        )
                      )
                    )
                  )
                ),
                "Death's Head Viper",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Death's Head Viper",
                  ":summary",
                  "* A foot long poisonous viper that can be trained as a pet. Some can be trained to coil around an arm or neck and act as jewelry and as a deadly bodyguard. The Viper cannot be completely domesticated, however, and has been known to turn on their owners when startled.",
                  ":titles",
                  "Wrist Viper"
                )
              )
            ),
            ":Jhagara",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Jhagara",
              ":summary",
              "* Jhagara is a hot and humid land seldom travelled by visitors.\n* People - The Jhagarans are a primitive, superstitious race with ungainly, elongated limbs and elliptical heads. They are over six feet tall and very thin and wiry.\n* Outcasts - Strangest of the Jhagarans are the Outcasts, tribesmen who wander the furthests swamps and jungles. Though few in number, they wield great power. It is believed by the other Jhagarans that the Outcats carry the 'Sitgma of Doom'. Simply being touched by an Outcast immedidately brands one as an Outcast. He or she has two choices, commit suicide or leave the tribe and join the Outcasts. In order to avoid being tainted, the Jhagarans leave tributes to the Outcasts outside their settlements. If the tributes are insufficient, the Outcasts will approach the settlement until they are placated. There is no simple solution to the Cursed Ones. Killing an Outcast brings the curse upon the killer and his family. Sometimes they will try to convince or trick strangers into killing the Outcasts for them.\n* Concordance - Every seven months, for two weeks while a particular constellation moves across the horizon, the Jhagarans will not venture forth into the swamps at night. They believe an indescribable monster called the Horag stalks the marshes. Though no Jhagaran has ever seen the Horag, their belief in it is unshakable. During theses times, tribesmen accidentally caught in the marshes after sunset have reportedly slit their throats rather than face the terror of this fearsome monster.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Jhagaran Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Jhagaran Hunter"
                ),
                "Jhagaran Outcast",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Jhagaran Outcast"
                )
              )
            ),
            "Serpentine River",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Serpentine River",
              ":summary",
              "* The [Serpentine River] is actually more of a slow moving swamp that flows from the south and pours into the ocean. At the mouth of the river, a large set of thick posts have been sunk into the silt, simultaneously providing tradeships with a place to tie up while blocking entrance into the river.  Porters must then be paid to bring goods to [Fiaqua] by barge. This is mostly just another opportunity for corruption. The [Naga] in the area do not allow boat traffic farther upstream from [Fiaqua]."
            ),
            "Shadow Isles",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Shadow Isles",
              ":summary",
              "* These islands are inhabited by the Malum, a cabal of Arch-Spectres.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Obsidian Tower",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Obsidian Tower",
                  ":summary",
                  "* The Shadow Wizards live in ancient ruined towers of obscure origin. These dark towers dot the landscape of the Shadow Isles, and it is here that they perform their experiments night and day seemingly without rest. Some have entered the tower without molestation but have fled when they viewed the horrorific activities within."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Shadow Wizard",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Shadow Wizard",
                  ":summary",
                  "* Comprised of animate darkness, these spirits of deceased magicians resemble man-like shadows. They cloak themselves inn hooded vestments and bear ebony runestaves studded with black diamonds, and their eyes burn with a fiery incandescense.\n* They Shadow Wizards consort with beings from the lower planes and perform bizarre magical experiments. The reason for their actions remains unknown, but some fear they are creating an army of monstrosities to unleash upon an unsuspecting world."
                )
              )
            ),
            "Sinking Land",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Sinking Land",
              ":summary",
              "* The Sinking Lands is a vast, fetid swamp of waist-deep water covering a deep layer of loose mud and decomposing vegetation. The entire swamp is basically a quicksand pit that will slowly engulf anything that stands still on the bottom. Numerous creatures that swim, float, or flit across the water have made a home here despite the perils.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Sludge",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Sludge",
                  ":summary",
                  "* The Sludge are a man-sized race of semi-intelligent Slugs that live within the Sinking Land. They swim quickly through the shallow water pushing off of the bottom. The Sludge are very curious and gather around visitors in large numbers. Though intimidating and pushy, they are largely harmless and flee if harmed. The main danger is they have been known to accidentally capsize boats in their enthusiasm. They are knowledgable about the area, but their lack of language makes communication a challenge."
                )
              )
            ),
            ":Tunis",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Tunis",
              ":summary",
              "* Weather - Tunis is hot and humid all year round. The temperature varies from warm to sweltering. The hot weather encourages the laid back attitude of the locals.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Fiaqua",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Fiaqua",
                  ":reference",
                  "Las Vegas",
                  ":summary",
                  "* Level 6 [Settlement]\n* Fiaqua means 'The Flower on the Water'. It is named that way because of the beautiful flowers that naturally grow all over the surface of the city as well as for the Black Lotus trade that was the reason for the city's founding. Fiaqua is unofficially known as the 'City of Knives' because of the strong criminal element and rampant assassinations. It is not so much a city as a series of shacks built on planks and pontoons that extend from a sandbar in the [Serpentine River] into the surrounding swamps.\n* Geography - Fiaqua is a tiny city located a half mile inland on the [Serpentine River] in the country of [Tunis].\n* Politics - Fiaqua is currently ruled by Queen Amelia Tremont, a minor crimelord who fancies herself a queen. She assassinated her predecessor and has proven quite adept at maintaining a delicate balance between her criminal compatriots, the [Naga], and the neighboring nations that have made the Lotus trade illegal but tolerate it as long as it doesn't create a disruption.\n* History - Fiaqua was founded two hundred years ago when the [Black Lotus] flower was discovered there. Initially, only a small band of criminals harvested the Lotus, but their actions attracted the local [Naga] who owned the land. Conflicts continued for many years until a truce was established where the [Naga] cultivated the flower and the humans sold it. This arrangement has worked for over 150 years despite some rather dramatic conflicts.\n* Law - Few things are illegal in Fiaqua. Fewer still are enforced. Since Fiaqua is a criminal haven created for the express purpose of smuggling, criminal types are widely accepted. The local [Naga] serve as enforcers to keep the peace while also controlling the population of homeless and hopelessly drug addicted. It is widely known that one must not venture out alone at night. Besides the Black Lotus trade, Fiaqua also runs very successful gambling dens and brothels catering both to the wealthy elite and to the desperate.\n* Visitors - The drug trade attracts addicts and experimenters because of the Lotus' legal status in Fiaqua as well as the large sums that can be gained through smuggling. The wealthy are often attracted to the 'anything for a buck' nature of the city as well as the surprising safety (as long as you have personal bodyguards). Traders come to the city because its position in the swamp requires it to import most of its essentials including the very lumber that makes up the city. Prices are fairly cheap, but unfortunately service is terribly slow because of the rampant drug addiction.\n* Wildlife - The city is covered with blossoming flowers all the time. These bloom from creeping vines that help hold the decaying wooden structures together. Insects swarm around the city at all times, but the pest insects are kept under control by the ever present [Ekondo] lizards. These small lizards are trained to distinguish pests from pollinating insects and catch them from the sky with their absurdly long tongues.\n* Units - Drug Addict, Drug Merchant, Gambler, Loan Shark, Pimp, Prostitute, Smuggler, [Naga]",
                  ":titles",
                  "Flower on the Water, City of Knives"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Queen Amelia Tremont",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Queen Amelia Tremont"
                )
              )
            ),
            ":Shinsenkyo",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Shinsenkyo",
              ":reference",
              "* Hell's Paradise\n* In Chinese legend, Shinsenkyo is an island on which gods reside, a place of true beauty and nature.",
              ":summary",
              "* An island of great natural beauty, but it is filled with bizarre, unnatural beings. It is rumored to be the source of the Elixir of Life which is the source of its strange ecology."
            ),
            ":Wraeclast",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Wraeclast",
              ":reference",
              "* Alba, Madagascar, Australia, Count of Monte Cristo, Mayan civilization, Path of Exile",
              ":summary",
              "* Wraeclast is a large subtropical island in the southern hemisphere. It is infamous as a thoughly cursed place where criminals and political prisoners are exiled, never to return.\n* Cursed - An evil force prevades the land. Here the dead always rise again as zombies or worse. Sleep is filled with dark thoughts of madness and violence. The evil influence has twisted plants and animals into bizarre and hateful things.\n* Settlements - There are a handful of small towns composed of exiles and shipwreck survivors carving out a meager living from the hostile land. Agriculture is difficult, but ironically hunting is good for those who can avoid becoming the hunted themselves.\n* Ruins - Though there are no native people on Wraeclast, there is ample evidence of early advanced cultures, apparently predating the evil influences that currently makes civilization so challenging. Many speculate that this previous civilization was destroyed when they unleashed the curse that still devastates the land."
            )
          )
        ),
        ":Atlantia",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Atlantia",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Antilla",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Antilla",
              ":reference",
              "* Atlantis",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Antillan Triton",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Antillan Triton"
                )
              )
            ),
            ":Brittania",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Brittania",
              ":reference",
              "England",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Avalon",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Avalon",
                  ":summary",
                  "* Rogue\n* Serf\n* Squire"
                ),
                ":Saxony",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Saxony"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Avalan Footman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Avalan Footman"
                ),
                "Avalon Highwayman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Avalon Highwayman",
                  ":reference",
                  "Robin Hood"
                ),
                "Avalan Knight",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Avalan Knight"
                ),
                "Avalon Longbowman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Avalon Longbowman"
                ),
                "Avalan Shieldbearer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Avalan Shieldbearer"
                )
              )
            ),
            ":Eire",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Eire",
              ":reference",
              "Ireland",
              ":titles",
              "Emerald Island"
            ),
            ":Melnibone",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Melnibone",
              ":titles",
              "Dragon Isles",
              ":itemmap",
              vx_core.f_new(
                nx_tactics_base.t_itemmap,
                ":Mournblade",
                vx_core.f_new(
                  nx_tactics_base.t_item,
                  ":name",
                  "Mournblade"
                ),
                ":Stormbringer",
                vx_core.f_new(
                  nx_tactics_base.t_item,
                  ":name",
                  "Stormbringer",
                  ":reference",
                  "* Farewell, friend. I was a thousand times more evil than thou! - Stormbringer, Stormbringer"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Elric",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Elric",
                  ":reference",
                  "* You sought to imitate the Emperors of Melnibone... You mocked Elric of that line, you tortured him and you abducted his wife. You moulded her body into a hell-shape as you moulded the rest of the world... know how the folk of Melnibone toyed with such upstarts... Jagreen Lern took an hour to die and only because Moonglum begged Elric to finish him swiftly. - Elric, Stormbringer"
                ),
                ":Moonglum",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Moonglum"
                ),
                "Hunting Dogs of Dharzi",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Hunting Dogs of Dharzi"
                ),
                "Melnibonean Sorceror",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Melnibonean Sorceror"
                ),
                "Melnibonean Soldier",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Melnibonean Soldier"
                ),
                ":Yykroon",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Yykroon"
                ),
                ":Arioch",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arioch",
                  ":summary",
                  "* Arioch is one of the most powerful of the Dukes of Hell.\n* Arioch is the patron of Melniboné and has a personal relationship with Elric. He is sophisticated and highly intelligent, though possibly insane, and he usually (but certainly not always) appears as a beautiful youth, usually with blond hair.\n* He has also been known to take the form of a large black fly or a black alien shape, horrible to look upon.",
                  ":titles",
                  "Knight of the Swords, Lord of the Higher Hell, Lord of the Seven Darks"
                ),
                ":Donblas",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Donblas",
                  ":reference",
                  "* It was as if some enormous sun, thousands of times larger than earth's, had sent a ray of light pulsing through the cosmos, defying the flimsy barriers of Time and Space... the majestic Lords of Law, their earthly forms so beautiful that they challenged Elric's sanity... Leading them came Donblas, the Justic Maker, a smile upon his perfect lips. He carried a slender sword in his right hand, a sword that was straight and sharp and like a beam of light itself. - Stormbringer",
                  ":titles",
                  "Justice Bringer"
                ),
                ":Elenoin",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Elenoin"
                ),
                ":Kyrenee",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Kyrenee"
                ),
                ":Mabelrode",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Mabelrode",
                  ":summary",
                  "* Mabelrode is a Chaos Lord. He appears with his face perpetually in shadow, or simply with blank, featureless skin in place of a face.",
                  ":titles",
                  "Mabelode the Faceless, King of the Swords"
                ),
                ":Xiombarg",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Xiombarg",
                  ":summary",
                  "* Xiombarg is a Chaos Lord. She prefers to appear as a beautiful young woman but is sometimes referred to with the male pronoun. She is prone to shapeshifting and carries a giant sword. She sometimes rides a creature with the head of a lion and the body of a bull.\n* Though she prefers the form of a beautiful woman, it is possible her true form is more insect-like.",
                  ":titles",
                  "Queen of the Swords"
                )
              )
            ),
            "Sargasso Sea",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Sargasso Sea",
              ":summary",
              "* The Sargasso Sea is a section of calm water in the center of converging currents. The surrounding current draw seaweed and various debris to accumulate across a vast area. The still air and vast seaweed aspiration accumulates a cloying mist that limits visibility.\n* Many have found their ships stranded here by the calmed winds and cloying seaweed. Those who stay and survive have found that the Sargasso can support an unusual lifestyle floating in the ocean. Though survival can be a struggle, the Sargasso people have a strong sense of interdependence and enjoy their freedom from outside domination.\n* It is said that a giant squid calls the Sargasso home.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Sargassos Sea Nomad",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Sargassos Sea Nomad",
                  ":summary",
                  "* Expert fisherman and salvagers. The sea nomads can be known to be ruthless, since life in the Sargasso can be difficult."
                )
              )
            ),
            ":Y'ha-nthlei",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Y'ha-nthlei",
              ":reference",
              "We shall swim out to that brooding reef in the sea and dive down through black abysses to Cyclopean and many-columned Y'ha-nthlei, and in that lair of the Deep Ones we shall dwell amidst wonder and glory forever. - The Shadow Over Innsmouth",
              ":summary",
              "* Deep Ones, Human Hybrids, Human Slaves",
              ":titles",
              "City of the Deep Ones"
            )
          )
        ),
        ":Asiana",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Asiana",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Jade Empire",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Jade Empire",
              ":titles",
              "Quan Dynasty, Jade Kingdom",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Tian",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Tian",
                  ":summary",
                  "* The capital of the Jade Empire is situated on an island within a man-made lake. The metropolis can only be reached by boat. The city was constructed for the Emperor who demanded that the new capital surpass in beauty all of the cities of the world. Gilded towers and domes and the Palace of a thousand fountains are especially noteworthy.",
                  ":titles",
                  "Golden City"
                ),
                "Emperor's Canal",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Emperor's Canal",
                  ":summary",
                  "* A man-made waterway connects the River Shan with the lake that surrounds Tian. A system of locks allows traffic on the canal to be strictly monitored, and the canal is not large enough for warships."
                ),
                "Emperor's Forest",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Emperor's Forest",
                  ":summary",
                  "* East of the capital is an artificial forest created for the pleasure of the Emperor and the aristocracy, so they might hunt 'wild' game. The forest is continually restocked with dangerous creatures that have been rendered harmless by declawing and with sedatives."
                ),
                "Emperor's Road",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Emperor's Road",
                  ":summary",
                  "* This highway spans the length and breadth of the Jade Empire. It is extremely well maintained funded by tolls."
                ),
                "Shoalin Monastery",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Shoalin Monastery",
                  ":summary",
                  "* Are you worthy? It is a simple question.\n* You are a foreigner. Here you will be treated with hatred and disrespect because you are different. We provide aid to no one. If you find this unfair, you are always free to go. Few are strong enough to walk this path. It is up to you whether you are one of them."
                ),
                "Wudang Monastery",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Wudang Monastery"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Jade Militia",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Jade Militia",
                  ":summary",
                  "* The vast number of people in the Jade Empire are kept in check by a massive regional militia. Most militia are little more than thugs with cheap equipment and a badge."
                ),
                "Jade Guard",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Jade Guard",
                  ":summary",
                  "* The professional military that oversees the militia."
                ),
                "Quan Noble",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Quan Noble",
                  ":summary",
                  "* Once a barbarian people, the Quan people have grown rich at the expense of the people subjected long ago by their ancestors. They wield supreme power and are attended by hosts of fawning servitors and slaves. Among these perverse and degenerate folk, obesity is considered a sign of success and ostentatious displays of wealth are in vogue.\n* The nobles have highly refined tastes and lofty airs. They wave themselves with scented fans when in the presence of outsiders who they consider offensive in apperance and odor."
                ),
                "Shaolin Monk",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Shaolin Monk",
                  ":summary",
                  "* A Buddhist Monk"
                ),
                "Wudang Monk",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Wudang Monk",
                  ":summary",
                  "* A Taoist Monk"
                )
              )
            ),
            ":Nepal",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Nepal",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Himalaya Mountains",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Himalaya Mountains"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Nepal Sherpa",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nepal Sherpa"
                )
              )
            ),
            ":Nippon",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Nippon",
              ":titles",
              "Land of the Rising Sun",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Valley of the Mists",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Valley of the Mists"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Nippon Budoka",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nippon Budoka",
                  ":titles",
                  "Warrior Monk"
                ),
                "Nippon Gakusho",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nippon Gakusho",
                  ":titles",
                  "Priest"
                ),
                "Nippon Ninja",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nippon Ninja"
                ),
                "Nippon Samurai",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nippon Samurai"
                ),
                "Nippon Sohei",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nippon Sohei"
                )
              )
            ),
            ":Tibet",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Tibet",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Tibetan Monk",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Tibetan Monk"
                )
              )
            )
          )
        ),
        ":Caucasia",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Caucasia",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Anatolia",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Anatolia",
              ":reference",
              "* The Romani were erroneously believed to originate in Egypt (therefore Gypsy).",
              ":summary",
              "* Horseclans - Anatolian horsemen are widely believed to be the greatest light horsemen in the world.  The Horseclans live on the plains where their horsemen have maximum effect.  They live a semi-nomadic existance moving on when resources become scarce.\n* Romani - The Romani are a gregarious, nomadic people often travelling in wagons carrying all that they own. They are reknowned as artists, acrobats, fortune tellers, thieves, tricksters, or swindlers depending on your point of view. The Romani religion revolves around two demigods: Fortuna, the lovely but fickle goddess of luck, and the grim entity known as Death. They revere Fortuna but mock Death, whom they strive to cheat at every opportunity.\n* Carnevale of True Wonders - A large group of Romani and other assorted wanderer/adventurers have banded together to form a semi-organized travelling circus. They show up near a town and rent some unused plaza or farmland and set up their tents and stalls. Their shows are constantly varying including: acrobats, strong men, duelists, wrestlers, theater troupes, musicians, magicians, story tellers, fortune tellers, wonderous creatures, items, foods and drinks. Anyone can join the welcoming troupe. There are a few rules, however: all wonders must be real (per the name) and no theft, fraud, or swindles are allowed on Carnevale grounds.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Ephesus",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Ephesus",
                  ":summary",
                  "* Temple of Artemis - One of the Seven Wonders of the World.\n* The sacred site at Ephesus was far older than the Temple.  An archaic, pre-Hellenic fertility goddess was\nalready passionately venerated, and the Greeks associated her with Artemis."
                ),
                ":Galatia",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Galatia"
                ),
                ":Halicarnassus",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Halicarnassus",
                  ":reference",
                  "* Mausolus built the Mausoleum, and the term mausoleum has come to be used generically for any grand tomb.",
                  ":summary",
                  "* Mausoleum of Halicarnassus - One of the Seven Wonders of the World."
                ),
                ":Phrygia",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Phrygia"
                ),
                ":Witchwood",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Witchwood",
                  ":summary",
                  "* The forest home of the Dhuna.\n* Dhuana - The Dhuana are a primitive, reclusive people highly skilled at witchcraft. They live in huts deep in the forest and perform hedonistic rituals in the numerous ruins, groves, and standing stones in the area. They are mysterious but not unfriendly, and they reputed to have numerous extraordinary attributes including the ability capture a man's heart with a single kiss."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Anatolian Light Cavalry",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Anatolian Light Cavalry"
                ),
                "Anatolian Mounted Archer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Anatolian Mounted Archer"
                ),
                "Romani Acrobat",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Romani Acrobat",
                  ":titles",
                  "Juggler"
                ),
                "Romani Animal Trainer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Romani Animal Trainer"
                ),
                "Romani Charlatan",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Romani Charlatan",
                  ":titles",
                  "Magician, Mountebank, Swindler, Trickster"
                ),
                "Romani Dancer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Romani Dancer"
                ),
                "Romani Fortuneteller",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Romani Fortuneteller"
                ),
                "Romani Rogue",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Romani Rogue",
                  ":titles",
                  "Thief"
                ),
                "Romani Thespian",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Romani Thespian",
                  ":titles",
                  "Puppeteer"
                )
              )
            ),
            ":Balkan",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Balkan",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Dragon's Eye",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Dragon's Eye",
                  ":summary",
                  "* A small sea surrounded by mountainous, inhospitable terrain. There are many small islands in the Dragon's Eye, and it is rumored that the great dragon Tiamat lives on one of them.",
                  ":titles",
                  "Black Sea, Transylvania"
                ),
                ":Carpathia",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Carpathia",
                  ":summary",
                  "* The region suffered under a widespread magical disaster of unknown origin. Suddenly the dead began to rise in great numbers and overran the land. Small communities are allowed to live and are 'protected' by the Vampires that feed upon them.\n* Since the disaster, an unnatural fog surrounds the area. The fog seems to spawn undead and other monstrosities.",
                  ":titles",
                  "Deadlands"
                ),
                "Carpathian Mountains",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Carpathian Mountains"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Carpathian Witchhunter",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Carpathian Witchhunter",
                  ":summary",
                  "* Some of the survivors of the Carpathian disaster formed a group to discover the cause of the disaster and to repair it. They seek magical knowledge of all sorts and fund themselves by using their talents as bounty hunters for the more dangerous bounties.",
                  ":titles",
                  "Witcher"
                )
              )
            ),
            ":Byzantium",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Byzantium",
              ":reference",
              "Byzantine Empire",
              ":summary",
              "* Byzantium represents a sizable empire. They are an advanced people with an extensive legal system and extremely complex rules, religion, and politics.",
              ":titles",
              "Eastern Empire",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Constantinople",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Constantinople"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Byzantine Assassin",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Assassin"
                ),
                "Byzantine Emperor",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Emperor",
                  ":summary",
                  "* The emperor rules with divine right and is considered a god on earth."
                ),
                "Byzantine Guard",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Guard"
                ),
                "Byzantine Monk",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Monk"
                ),
                "Byzantine Noble",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Noble"
                ),
                "Byzantine Official",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Official"
                ),
                "Byzantine Priest",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Priest"
                ),
                "Byzantine Spy",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Byzantine Spy"
                )
              )
            ),
            "Caspian Sea",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Caspian Sea",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Caspian Corsair",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Caspian Corsair",
                  ":summary",
                  "* These corsairs are viscious cutthroats prone to violence and murder. There are a number of different pirate bands, all rivals to one another. In lean times they prey on one another and compete over plunder. When relaxing, they favor Ska-wae, a dangerous game played with curved knives and dice."
                ),
                "Caspian Mercenary",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Caspian Mercenary",
                  ":summary",
                  "* The Caspians are notable for their lack of discretion concerning the type of work they will take on. Unfortunately, they are also notable for disappearing when they see the risks getting too high."
                ),
                "Caspian Rogue",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Caspian Rogue"
                )
              )
            ),
            ":Hesperia",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Hesperia",
              ":reference",
              "Turkey",
              ":summary",
              "* Hippolyta - Queen of the Amazons. She was abducted and forced to wed the king of Athens. She was later cast off and returned to the Amazons\n* Warfare - Amazon combat philosophy takes a very long term view of victory. They do not put much value in military victories. Instead they believe in subverting, frustrating, and outlasting their opponents. They will avoid head-on battles, preferring flanking and strike and fade attacks. For this reason, they do not have maintain heavy units, but instead maintain superior skirmishers, spies, and assassins.\n* Religion - Amazons revere the image of Gaia, the All-Mother, but they do not worship her as as deity. Instead, the Amazons believe that the female is the natural mother of all things, and that each woman may find all the strength that she needs within herself. The Amazons further believe that with patience and proper nuturing, women will naturally assert their leadership across the world.\n* Politics - Amazons engage with other nations for trade, but their real power lies in their message of female power which they quietly spread around the world. This has created a vast spy network that spreads vital information as gossip.",
              ":titles",
              "Home of the Amazons, Sarmatia",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Amazon Archer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Amazon Archer",
                  ":summary",
                  "* Amazon dedication to archery is legendary. Some have one breast removed to prevent interference with the draw of their bow."
                ),
                "Amazon Assassin",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Amazon Assassin"
                ),
                "Amazon Infiltrator",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Amazon Infiltrator"
                ),
                "Amazon Peltast",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Amazon Peltast"
                ),
                "Amazon Scout",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Amazon Scout"
                ),
                "Amazon Trapper",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Amazon Trapper"
                ),
                "Amazon Warrior",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Amazon Warrior"
                )
              )
            ),
            ":Scythia",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Scythia",
              ":sectionmap",
              vx_core.f_new(
                nx_tactics_base.t_sectionmap,
                ":Arim",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Arim",
                  ":summary",
                  "* Arim is a land of rough and irregular hills. The weather is usually overcast and windy. It has substantial mineral wealth, especially iron.\n* People - The people of Arim are a dour and moody lot with swarthy complexions, and long black hair. The men tend to be gaunt and wiry with hatchet-life features. The women tend to be heavy-set and lacking in charm. They are generally a humorless people who have lived hard lives as miners.\n* Reputation - The Arimites have a not unwarranted reputation of being cutthroats and assassins.\n* Revenants - Revenant is the name of anyone who exacts revenge for money. If anyone feels they need redress for any offense, they can post a notice in a public place along with a reward, and if the reward is high enough they can expect it to be carried out. Almost any kind of vengence can be commissioned including arson, theft, mugging, extortion, murder, or even slander. Murder for hire is probably the most lucrative. Government officials, laborers, merchants, jealous lovers, and irrate housewifes have all been known to use the Revenants. It is so common, that the mere shaking of a change purse has become a threat of revenge.",
                  ":unitmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitmap,
                    "Arimite Knife Fighter",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Arimite Knife Fighter"
                    ),
                    "Arimite Revenant",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Arimite Revenant"
                    )
                  )
                )
              )
            ),
            "Shattered Lands",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Shattered Lands",
              ":summary",
              "* The Shattered Lands is bleak and desolate. The landscape is nightmarish: jagged spikes of rock jut upward from the cracked and barren earth. The violent upheavals have exposed many mineral deposits. Unfortunately, the residents of this land have used strip mining techniques which have badly polluted the air and rivers. The air is tinged with a fine ash, the waters are foul tasting, and there are many dangerous chemical waste products including bubbling pools of lye. Creatures living in the rivers and lakes are often deformed or mutated.\n* The Shattered Lands are home to many small, violent clans that violently compete with each other for the scarce resources in this bleak area.",
              ":titles",
              "Harak",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Urag",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Urag",
                  ":reference",
                  "* A group of scholars entered Urag with the contention that the Ur were not evil but were a product of their harsh environment. They encountered a small band of Ur and offered them gold, fragrant oils and gems. These the savages examined and discarded. Without apparent enmity, they slew the scholars, took their cloths and fed the remains to their hunting dogs. They then killed the scholars' mounts, butchered them for meat, and continued on their way.",
                  ":summary",
                  "* The nation of the barbarous Ur.\n* Ur - The Ur are a hard-hearted people utterly devoid of mercy or compassion. Ultimate survivalists, they view all other living creatures as prey. Forced by the circumstances of their existence, they are by nature fatalistic and grim. They take what they want, raiding both rival clans and neighboring lands. The Ur are nomadic, traveling from place to place in search of food and water - both precious commodities in this region. All Ur consider themselves to be warriors and trades not related to survival and warfare are considered useless."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Darkling Cutthroat",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Darkling Cutthroat",
                  ":summary",
                  "* The Ur have subjegated the Darkling race and use them as cannon fodder in battle. The Darklings are vile creatures and are extremely difficult to manage, so the Ur are ruthless when administering discipline."
                ),
                "Stryx Spearman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Stryx Spearman",
                  ":summary",
                  "* The vile Stryx have allied themselves with the Ur and nominally serve them. The Stryx, however, are loyal to no one and cannot be relied on in battle. The Ur find them frustrating but useful allies."
                ),
                "Ur Horseman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Ur Horseman",
                  ":summary",
                  "* Horses are rare in the Shattered Lands, so only the most decorated warriors receive them. However, with nearly no tradition of horsemanship, the Ur usually dismount before combat."
                ),
                "Ur Shaman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Ur Shaman",
                  ":summary",
                  "* The Ur have little education and are inept spell casters. They claim they are great seers though their predictions are always open to interpretation. The Ur military leaders use their 'prophesies' to support their own agendas."
                ),
                "Ur Warlord",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Ur Warlord",
                  ":summary",
                  "* The Ur clans are rules by a series of viscious warlords each trying to increase their own power and influence at the expense of others. The ceaseless infighting amond the Ur clans prevents them from being more than a regional threat."
                ),
                "Ur Warrior",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Ur Warrior",
                  ":summary",
                  "* The Ur Warrior is the typical shocktrooper of the Ur clans. Most adult Ur, male or female are considered warriors."
                )
              )
            ),
            "Volcanic Hills",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Volcanic Hills",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Dragon Rock Mountain",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Dragon Rock Mountain",
                  ":summary",
                  "* Dragon Rock is an active volcano that has blighted the Volcanic Hills with its many eruptions over the centuries. It has not erupted in recent memory and seems to be content pouring out smoke and lava creating the River of Fire. Dragon Rock is also so named because a number of Fire Dragons live in the area, apparently drawing strength from the volcano."
                ),
                ":Firefalls",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Firefalls",
                  ":summary",
                  "* The River of Fire ends at an enormous, seemingly bottomless chasm, The lava pours off the edge in a spectacular display before dropping into untold depths. The view is particularly impressive at night. Some believe the chasm is actually a portal to the underworld and the large number of fire demons in the area supports that claim."
                ),
                "River of Fire",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "River of Fire",
                  ":summary",
                  "* The River of Fire is actually an everflowing torrent of molten lava pouring from Dragon Rock Mountain and finally dropping over Firefalls. Fire Demons and Elementals are said to swim in the river and Fire Dragons have been seen consuming the lava."
                )
              )
            )
          )
        ),
        ":Northlands",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Northlands",
          ":titles",
          "Frozen North",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            "Plateau of Leng",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Plateau of Leng"
            ),
            "Unknown Kadath",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Unknown Kadath"
            )
          ),
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Aurorea",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Aurorea",
              ":reference",
              "* Greenland, Iceland\n* In Greek mythology the Hyperboreans were mythical people who lived 'beyond the North Wind'. The Greeks thought that Boreas, the god of the North Wind lived in Thrace, and therefore Hyperborea indicates a region that lay far to the north of Thrace.\n* This land was supposed to be perfect, with the sun shining twenty-four hours a day, which suggests a possible location within the Arctic Circle.",
              ":summary",
              "* Auroea is a land of vast snow fields, glittering ice peaks, and frozen lakes.\n* People - The Auroran people are tall and statuesque and live in crystalline, ice castles. Their artificers work with the unique material Adamant, the fabled permanent ice of lengend. The Aurorans have an amazing resistence to the cold but conversely they are only confortable in freezing temperatures.\n* Religion - The Aurorans revere Boreas the god of the North Wind. They do not create temples but instead build altars in the open wilderness where one can truly feel his presense.",
              ":titles",
              "Hyperborea",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Sea of Ice",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Sea of Ice",
                  ":summary",
                  "* An expanse of shimmering, perpertually frozen water, the Sea of Ice is traversed by the Aurorans on Ice Schooners and personal Ice Skimmers."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Auroran Alchemist",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Auroran Alchemist",
                  ":summary",
                  "* The Auroran Alchemists work with the Auroran Ice Witches to create permanent magical ice with similar properties to steel."
                ),
                "Auroran Banker",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Auroran Banker",
                  ":reference",
                  "* People say the Northland Bank's true currencies are blood and tears, but mayor, even speaking as a banker, that seems a little unconscionable. - Pantalone, Genshin Impact"
                ),
                "Auroran Ice Queen",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Auroran Ice Queen",
                  ":reference",
                  "* Elsa - Frozen"
                ),
                "Auroran Ice Witch",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Auroran Ice Witch",
                  ":summary",
                  "* Auroran Ice Witches serve as seers and priests of Boreas the god of winter and the North Wind. 	They are masters of cold magic.",
                  ":titles",
                  "Ice Warlock"
                ),
                "Auroran Tundra Scout",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Auroran Tundra Scout",
                  ":summary",
                  "* The army and hunters of the Auroran people. They are typical skirmishers with	phenomenal survival skills."
                ),
                "Auroran Ice Skimmer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Auroran Ice Skimmer"
                ),
                "Auroran Ice Schooner",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Auroran Ice Schooner",
                  ":titles",
                  "Ice Outrigger"
                )
              )
            ),
            ":Jotunheim",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Jotunheim",
              ":summary",
              "* Frost Giants - The Frost Giants wage perpetual war on all creatures especially the Aurorans and Nords.\nTheir lack of tactical ability is made up for by their phenomenal strength, endurance, and determination. Their bodies emminate extreme cold, so as they expand their territory the temperatures drop. Their goal actually seems to be to freeze the world.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Ymir's Teeth",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Ymir's Teeth",
                  ":summary",
                  "* A massive ridge of jagged moutains that the Frost Giants believe are the teeth of an inconceivably large god and that the world lies in its open maw awaiting the day when the being awakes.\n* Home of the Frost Giants, this is also the main location where blue diamonds can be found. Mining of blue diamonds began the war between the Aurorans and Ice Giants."
                )
              )
            ),
            ":Khazad",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Khazad",
              ":summary",
              "* A strange and unknown realm, Khazad is located in the furthest reaches of the world. It is practically inaccessible. A line of precipitous 200 foot cliffs runs the length of its eastern coast and a ridge of mountains extends along its eastern borders. To the north lie fields of ice and snow. As a result of these impediments to travel, much of what is known is based on a very few hardy adventurers who have survived journeys to this isolated area. According to accounts, the interior is also less than inviting. Patches of bleached and barren gall oak stand like skeletons silhouetted against a dreary purple-grey sky. Broken and irregular lines of hills are interspersed with moors, quagmires, and stagnant ponds. The air is heavy with the stench of moldering vegetation and exudes an unsettling, ancient quality.\n* Lost Kingdom - Scattered throughout the region are the ruins of a long forgotten civilization.\n* The eastern cliffs are sheer, 200 foot cliffs that ring the coastline. Giant diabolical visages have been carved into the cliff-sides along portions of the coast. A clan of flying devils makes its home in the mouths and eye-sockets of the immense stone effigies and fly out to attack those who draw too close.\n* Seas - The seas around Khazad are said to be home to many sea monsters including sea demons. The black ships of the Nefaratus are known to frequent these waters as well.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Khazad Burial Grounds",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Khazad Burial Grounds",
                  ":summary",
                  "* Far to the north are vast burial grounds, denoted by row upon row of age-worn stone markers. The remains of a man-like race have been found in massive sarcophagi of strange design. Some of the more important bodies were buried with gold funerary masks of frightening aspect. These masks are believed to be intended to ward demons or evil spirits from the deceased. Rarely these tombs contain brass urns sealed with paraffin. These artifacts were sometimes used to imprison Bottle Imps or safekeep the corpse-dust of departed wizards. Prized by curio collectors and necromancers, these relics bring high prices. Unfortunately, necrophages haunt the region, craving fresh corpses over the dry bones of the long dead."
                ),
                ":Necron",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Necron",
                  ":summary",
                  "* There are stories of an entire city and its inhabitants buried beneath the earth. All of its inhabitants supposedly mummified and interred in stone sarcophagi. Very little reliable information is available about this supposed necropolis."
                )
              )
            ),
            ":Nefaratus",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Nefaratus",
              ":summary",
              "* A bleak island nation, home to the Black Savants. Little is known of their isolated homeland culture or motives. What is known is that they seldom leave their obsidian towers and that they wield powerful magic. Here they stare into their obsidian mirrors and converse with unseen beings. Many believe that the Black Savants are diabolists and receive advice and consel from the giant devils known as Shaitan,",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Maledictus",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Maledictus",
                  ":summary",
                  "* The capital city of Nefaratus"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Black Savant",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Black Savant",
                  ":summary",
                  "* Black Savants are tall and gaunt with deathly pale white skin under their full black robes. They remain fully covered at all times, and it is said that they molder away to nothing after death. There are those who say that the Black Savants are not actually living creatures.\n* The Black Savants are greatly feared by other folk. They avoid contact with others and mainly communicate by means of arcane signs and gestures."
                ),
                "Black Ship",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Black Ship",
                  ":summary",
                  "* The Savant's midnight black vessels are said to sail the cursed waters at the edge of the world. It is claimed that they are propelled by demons chained to the oars with silver shackles and driven by giant copper skinned devils. These ships have been known to pull into port cities on moonless nights only to leave again before dawn."
                )
              )
            ),
            ":Nordland",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Nordland",
              ":reference",
              "Finland, Norse, Sweden",
              ":summary",
              "* The Nords are a large race of humans. Nords have relatively short lifespans, but they do not physically weaken with age until they are near death.\n* Personality - Nords are deeply emotional and prone to raucous laughter, deep brooding, and intense rage. They generally believe in living in the moment and do not typically hold regrets or grudges.\n* The Nord Way - The Nords have a tradition of stark minimalism reflecting there severe environment. They tend to discard any activity or tradition not directly related to survival. This simplicity sometimes surprises others to which the Nords steadily reply that it is the 'Nord Way'.\n* Marriage - The Nords do not formally marry. Instead they prefer to simply live together (The Nord Way) trusting that if they keep their love strong, they will naturally stay together.\n* Ma and Fa - Endearing terms for Mother and Father",
              ":titles",
              "Aesir, Aesyr, Frostland",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Skyrim",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Skyrim"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Nord Axemen",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nord Axemen"
                ),
                "Nord Berserkers",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nord Berserkers"
                ),
                "Nord Light Archers",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nord Light Archers"
                ),
                "Nord Skirmishers",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nord Skirmishers",
                  ":titles",
                  "Scouts"
                ),
                "Nord Spearmen",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nord Spearmen"
                ),
                "Nord Valkyrie",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Nord Valkyrie"
                )
              )
            ),
            "Worlds Edge",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Worlds Edge",
              ":summary",
              "*"
            )
          )
        ),
        ":Mediterranea",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mediterranea",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Aegea",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Aegea",
              ":reference",
              "Aegean Islands, Greece",
              ":summary",
              "* Scholar\n* Senator\n* Spartan\n* Gorgons\n* Harpies\n* Status - The Aegean navy dominates the Aegean island chain and enables a thriving merchant trade across Mediterranea.\n* History - The Aegean city states used to be individual monarchies until the Imperium swept in and conquered Hellas, the capital. During the invasion, the Hellenic leadership fled with its navy and united the other city states under the name Aegea. Since then, the Imperium sent it navy to conquer Crete and 	was disasterously routed by the Aegean navy. The Aegeans subsequently attempted to retake Hellas and was easily repelled. Now an uneasy truce exists with the Imperials unable to create the navy it needs for conquest and the Aegeans unable to create the army it needs to drive out the Imperials.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Crete",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Crete"
                ),
                ":Hellas",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Hellas",
                  ":summary",
                  "* Description - Currently a territory of the Imperium, Hellas is an orderly and socially advanced nation. They have a partial democracy (answerable to the Imperium) and a complex legal system that is surprisingly fair.\n* Universities - Hellan Universities are famous for acedemia, sciences, and philosophy. They do, however, share their Imperial neighbor's prejudices against Naturalism and the Arcane (except for Alchemy and Artifice which are considered sciences)."
                ),
                ":Knossus",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Knossus"
                ),
                ":Labyrinth",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Labyrinth",
                  ":summary",
                  "A natural maze of cracked basalt"
                ),
                "Mount Parnassus",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Mount Parnassus",
                  ":summary",
                  "* The Oracle of Delphi is on the slopes of Parnassus."
                ),
                ":Minoa",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Minoa"
                ),
                ":Olympia",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Olympia",
                  ":summary",
                  "* Statue of Zeus - One of the Seven Wonders of the World.\n* Olympiad - The Olympic games."
                ),
                ":Rhodes",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Rhodes",
                  ":summary",
                  "* Famous for the Colossus of Rhodes, a 30m tall statue of Helios and one of the Seven Wonders of the World.\n* It is said that the Colossus can move, though there is no evidence to support this.\n* The Colossus was constructed to celebrate the failure of an invasion force of 40,000 to take the city. Massive siege towers were necessary to take the walls. The first was mounted on six ships, but these capsized in a storm before they could be used. A larger, land-based tower was defeated when the defenders flooded the land in front of the walls so that the rolling tower could not move. The next year, a relief force arrived and the siege was abandoned. Much of the iron and bronze was reforged from the various weapons left behind, and the abandoned second siege tower was used for scaffolding."
                ),
                ":Sparta",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Sparta"
                ),
                "Swamp of Despair",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Swamp of Despair"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Hellenic Scholar",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Hellenic Scholar"
                ),
                "Seer of Delphi",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Seer of Delphi",
                  ":summary",
                  "* The seers are recluses who live on Mount Parnassus with the Oracle. Here they tirelessly record their visions in massive leather bound tomes. Those who manage the perilous climb visit the temple seeking knowledge are treated with hospitality and an endless series of questions about the outside world to compare with their visions. Those who seek personal gain may find the Seers to well prepared and to be less than personable hosts.\n* According to legend, the first great Oracle had a vision that after his death, he would travel in the afterlife for a long time, but that one day he would return to share his experience. It is said, the Seers gather knowledge to share the experiences of the living world with the Oracle when he returns. Though it may seem farfetched, many traditions reflect the expectation of the Oracle's return: lights in the windows at night, an extra place set at meals, an unoccupied bedroom spotlessly maintained, etc."
                ),
                "Spartan Warrior",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Spartan Warrior"
                )
              )
            ),
            ":Arden",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Arden",
              ":titles",
              "Alfar, Ljossalfar, Elder, Elf, Sidhe, Sidheni, Sylvan, Sylvus",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Alfheim",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Alfheim"
                ),
                ":Ardenwood",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Ardenwood",
                  ":reference",
                  "* We had entered the Ardenwoods on a scouting mission to probe the Sidhe defenses. We had only been in the woods for half an hour before arrows started raining from the trees. Forms flitted among the leaves and brush all around, but we never saw our attackers. We were forced to flee, and they allowed us to leave. The exact nature and numbers of their defenders remains unknown, but their 	effectiveness was clear. - Imperial Expeditionary Log"
                ),
                ":Ashwood",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Ashwood"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Arden Archer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Archer"
                ),
                "Arden Bard",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Bard"
                ),
                "Arden Defender",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Defender",
                  ":titles",
                  "Arden Warrior"
                ),
                "Arden Druid",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Druid"
                ),
                "Arden Healer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Healer"
                ),
                "Arden Hunter",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Hunter"
                ),
                "Arden Lyrist",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Lyrist"
                ),
                "Arden Ranger",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Ranger"
                ),
                "Arden Scout",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Scout"
                ),
                "Arden Unicorn Cavalry",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Arden Unicorn Cavalry"
                ),
                "Cu Sith Hunting Dog",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Cu Sith Hunting Dog",
                  ":summary",
                  "* An enormous fairy hound roughly the size of a cow.\n* Dark green in color with shaggy fur and a long braided or curled tail.\n* Capable of hunting silently\n* Will occasionally let out three terrifying barks that can be heard for long distances, including by ships at sea. This was said to be a warning to farmers to lock up their women, lest the beast abduct them and take them to a fairy mound to supply milk for fairy children.",
                  ":titles",
                  "Fairy Dog (pronounced coo shee), Cu Sidhe"
                ),
                "Goddess Selene",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Goddess Selene",
                  ":reference",
                  "* The Moon is our Goddess, the night her kingdom! - Diana, Legends of Runeterra",
                  ":summary",
                  "* Most Alfar revere the Moon Goddess Selene."
                )
              )
            ),
            ":Gaul",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Gaul",
              ":reference",
              "France, Gallia",
              ":summary",
              "* Syndicate - The Gaul Syndicate is a sophisticed crime cartel.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Catacombs",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Catacombs"
                ),
                ":Mistridge",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Mistridge",
                  ":summary",
                  "* A walled town housing the main lodge of the Order of Hermes magical society. Mistridge is loosely affiliated with the Arcanum to the East, but the members of the Mistridge lodge keep a low profile as opposed to the grandiose towers of the Arcanum."
                )
              ),
              ":sectionmap",
              vx_core.f_new(
                nx_tactics_base.t_sectionmap,
                ":Elysia",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Elysia",
                  ":reference",
                  "Southern France",
                  ":summary",
                  "* Elysia is a land of gentle hills and sparse woodlands shifting to deep woods along its northern border. It is named after Elysium, the legendary land of the Fae. Elysia was annexed by the Imperium 50 years ago, and no one seems to particularly mind the new owners.\n* People - The people of Elysia are fond of music, dance and all manner of stimulating pastimes. They enhance their features with makeup and dress in flamboyant apparel including velvet blouses and trousers, capes of silken brocade, soft slippers and so forth. The women hide their faces behind decorative fans to give the impression that they are shy and demure. This is hardly the case. The men are even less subtle and are widely regarded as lechers and philanderers in other lands. The Elysians consider romance to be a wonderful game to be played constantly.\n* Beliefs - The people believe that the world is filled with mysteries and that these mysteries are ultimately unsolvable. The point of life is not to pursue the answers but to marvel at the mysteries themselves. In these beliefs, there is no right or wrong, only perspective and sublty.\n* Law - The unusual way they see right and wrong, leads to a fairly\narbitrary justice system. Small crimes are basically ignored, so petty theft especially pickpocketing is rampant. Major crimes, on the other hand, are dealt with quickly and severely. Trials are held in public with justice determined by popular vote by those attending. Punishment is arbitrarily and creatively disposed by the Mayor of each city.\n* The Night of Fools - Once each year, the infamous festival known as the night of fools takes place. During this night almost no crimes are prosecuted. People dress in ludicrous costumes and take to the streets in an evening of revelry, debauchery, and mayhem. On the following day, order is restored.\n* Beggars - Begging is considered an honest, if unenviable, profession in Elysia. Though many are frauds and thieves, the Elysians are fond of their beggars and expect others to be equally open-minded. It is traditional to scatter coppers when beggars appear or suffer public scorn and ridicule.\n* Bath - Public and private bath houses (with or without masseuse) are a popular pasttime and meeting place similar to a tavern elsewhere complete with snacks and drinks.",
                  ":unitmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitmap,
                    "Elyisan Artisan",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Elyisan Artisan"
                    ),
                    "Elyisan Chevalier",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Elyisan Chevalier"
                    ),
                    "Elyisan Duelist",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Elyisan Duelist"
                    ),
                    "Elyisan Rogue",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Elyisan Rogue"
                    ),
                    "Proprietress Mazilda",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Proprietress Mazilda",
                      ":summary",
                      "* Mazilda was a passable sorcerous until she lost an arcane duel and was cursed with an obsession with cleanliness. She opened a bathhouse where she can make a living while she can clean herself as often as necessary. She is functionally a shut-in now, and longs for tales of the outside world to which she can no longer travel."
                    )
                  )
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Gallic Acrobat",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Gallic Acrobat"
                ),
                "Gallic Charlatan",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Gallic Charlatan"
                ),
                "Gallic Duelist",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Gallic Duelist"
                ),
                "Gallic Militia",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Gallic Militia"
                ),
                "Gallic Warrior",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Gallic Warrior"
                )
              )
            ),
            ":Bavaria",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Bavaria",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Blackmarsh",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Blackmarsh"
                )
              )
            ),
            ":Iberia",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Iberia",
              ":reference",
              "Portugal, Spain",
              ":sectionmap",
              vx_core.f_new(
                nx_tactics_base.t_sectionmap,
                "Order, The",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Order, The",
                  ":summary",
                  "* The Order is a large, theocratic nation which lies to the west of Elysia. Life in the Order is dominated by religion, the Hierophant, and the Theocracy.\n* Geography - The Order covers a large mountainous pennisula, separated from Elysia, and the Imperium by the Pyrenees mountains.\n* Daily Life - The influence of the religion is evident everywhere. Individualism has been throughly suppressed. All citizen dress alike, speak in tired cliches, and effect identical mannerisms.\n* Laws - Laws of the Order are extremely strict and narrowly interpreted. Those who commit even the slightest transgression are dragged to the Halls of Penance. At the discretion of the Inquisitors, non-believers may be forcibly converted or may simply 'disapper'.\n* Visitors - Travellers from other lands are rare and stand out like beacons. They are generally treated as inferiors and are only tolerated if their presense is of some advantage to the state.\n* Alms - A person's spiritual enlightenment is measured by the Theocrats in a spiritual value called Alms. Alms are awarded for specific contributions to the church including tithes, military service, good deeds, church titles, pilgrimages, etc. Each rank provides specific perks within society but is also intened to be a direct measure of the quality of the person's afterlife.\n* Clash of Champions - The Imperium has tried to invade the Order twice to no avail. The geography and religious zealots of the Order have proven too difficult to overcome. Since the last battle, the Order and Elysia (backed by the Imperium) have waged a propaganda war culminating in the annual event known as the Clash of Champions. Each year both nations scout for worthy (and expendible) warriors to represent their interests in a duel atop the main gates of the Order capital. The winner receives great rewards from their sponsor. Though not technically, a duel to the death, it is expected that the loser will be thrown or forced  off the gates to fall 20 feet below to the roar of the crowds. It is considered a particular coup to cause a vanquished foe to fall amongst his or her own supporters. Since the Order and Elysia could scarsely be more different in their outlooks on life, the winners consider their victory to be a referendum on the virtues of their philosophies. The Order takes the competition very seriously and, of course, gambling and drinking are not allowed within the city walls. Elyisians consider the Clash to be one of the social events of the season. Though they must travel through the mountain pass and they are not permitted entrance to the city, they still come in large numbers with their wagons, children, merchants, wenches, gamblers, acrobats, and performers. For the Elysians, the party is equally large whether they win or not.",
                  ":titles",
                  "Chantry, The Order, Papal States, Theocracy",
                  ":locationmap",
                  vx_core.f_new(
                    nx_tactics_base.t_locationmap,
                    "Halls of Penance",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Halls of Penance"
                    ),
                    "Order Catherdral",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Order Catherdral"
                    ),
                    "Order Monastery",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Order Monastery"
                    ),
                    "Order Nunnery",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Order Nunnery"
                    ),
                    "Order Reliquary",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Order Reliquary"
                    )
                  ),
                  ":unitmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitmap,
                    "Order Apostate",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Apostate",
                      ":summary",
                      "* An outcast who has lost his Alms and effectively forsaken the religion. Apostates are pariahs within the Order."
                    ),
                    "Order Brother",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Brother",
                      ":summary",
                      "* Monks of the Order swear numerous oaths of purity including oaths of poverty and celebacy. Most Brothers live in a Monestary, while others travel the world doing good works and spreading the word of their God."
                    ),
                    "Order Crusader",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Crusader",
                      ":summary",
                      "* The armored knights of the Order. They serve as the officers of the army and navy."
                    ),
                    "Order Evangelist",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Evangelist"
                    ),
                    "Order Father",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Father"
                    ),
                    "Order Hierophant",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Hierophant",
                      ":summary",
                      "* The Hierophant is the undisputed religious ruler of the nation. Though he theoretically holds no military power, he is considered to be infallible and a direct emissary of God, so he practically wields absolute power. His power is maintained by the Theocracy, so he must maintain their trust at all times."
                    ),
                    "Order Inquisitor",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Inquisitor",
                      ":summary",
                      "* The Inquisitors have a single task: to root out and elminate heretics. To this end they act as judges, secret police, and interrogators. Inquisitors preside over rituals desgined to purge unacceptable desires from penitent hearts using methods that some might call torture."
                    ),
                    "Order Mother Superior",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Mother Superior"
                    ),
                    "Order Priest",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Priest"
                    ),
                    "Order Sister",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Sister",
                      ":summary",
                      "* Nuns of the Order swear numerous oaths of purity including oaths of poverty and celebacy. Sisters live in a Nunery and seldom leave except to perform tasks in nearby towns."
                    ),
                    "Order Templar",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Templar",
                      ":summary",
                      "* An official Mage Hunter/Witch Hunter of the Order.\n* Since magic that is not sanctioned by the church is heresy, the Templars are commissioned to contain or eliminate enemies of the Order that are beyond the capabilities of the Inquisitors. They are given great authority to complete their missions and can rely on the Inquistors and Crusaders for aid."
                    ),
                    "Order Theocrat",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Order Theocrat",
                      ":summary",
                      "* The Theocracy serves as both a religious and government center. The Theocrats maintains the Library of Revelations which are the great books of religious canon that supposedly answer any question worth knowing. Interpreting these books allow the Theocrats to rule on all matters of daily life: clothing, trade, law enforcement, etc. These interpretations have led to a very rigid, conservative society where many acts are considered heretical."
                    )
                  )
                )
              )
            ),
            ":Imperium",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Imperium",
              ":reference",
              "Rome, United States",
              ":summary",
              "* Description - The Imperium is the most stable and advanced nation in history. It is known as a conquering nation that has taken over much of the modern world. Its reputation is somewhat exaggerated. The Imperial Legionnaires are the most devastating standing army on the planet, but the Imperium has had its share of defeats and finds it hard to hold territory that it 'conquers'. Fortunately, the Imperium is mostly concerned with trade and is very willing to negotiate with its neighbors and allow autonomy in its territories in order to concentrate on its borders to the east where it faces constant incursions from the Shattered Lands and from the Dragon's Eye.\n* Currency - Imperial Sovereigns (Imperials or Crowns) are made from gold, have eight sides, and have the image of the current emperor on the front and the imperial seal on the back. They are made of solid gold and are accepted almost everywhere.\n* Architecture - Imperia has a love of monolithic buildings with towering columns that reflect the Imperial ego.\n* Roads - The Imperium maintains excellent cobblestone roads throughout its own and its allies territories. All roads lead to Imperia and have armed forts at regular intervals with Centurions, an inn, and a trading post. The forts charge a toll to pass, prices at these forts are high, and any trade done is taxed, but forts are always professionally defended and are generally worth the price.  The roads benefit trade, but are also a reminder of the influence of the Imperium.",
              ":titles",
              "Italia, Sovereign",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Imperia",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Imperia",
                  ":summary",
                  "* The capital city of the Imperium.",
                  ":titles",
                  "Empire",
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
                          nx_tactics_base.t_location,
                          ":tag",
                          "place"
                        ),
                        ":severity",
                        2
                      )
                    )
                  )
                ),
                "Mount Vesuvius",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Mount Vesuvius"
                ),
                ":Pompeii",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Pompeii",
                  ":summary",
                  "* The story of the destruction of Pompeii when Mt. Versuvius erupted is widely known. The story is often used as a cautionary tale to obey the will of the gods.\n* Pompeii is now an empty ruin that functions as an enormous graveyard for the approximately 20,000 victims of the disaster. The dead remain at rest as long as the the area is undisturbed, and careful travellers may investigate the area at their peril. If there is any disturbance the bodies begin\nawakening as Burning Dead and are hysterically drawn to the living who will not long survive their embrace."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Imperial Centurion",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Imperial Centurion"
                ),
                "Imperial Gladiator",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Imperial Gladiator"
                ),
                "Imperial Legionnaire",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Imperial Legionnaire"
                ),
                "Imperial Senator",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Imperial Senator"
                ),
                "Imperial Slaver",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Imperial Slaver"
                ),
                "Borderland Legionnaire",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Borderland Legionnaire",
                  ":summary",
                  "* The far eastern outposts of the empire are manned by the Legion of the Borderlands. This is body of hard-bitten mercenaries, outcasts, and criminals from many lands. Being assigned to the Legion of the Borderlands one way that the Imperium makes use of troublemakers."
                )
              )
            ),
            ":Teuton",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Teuton",
              ":reference",
              "Germany",
              ":summary",
              "* Description - Currently claimed as a territory of the Imperium.\n* Dwarves",
              ":itemmap",
              vx_core.f_new(
                nx_tactics_base.t_itemmap,
                "Dark Forge",
                vx_core.f_new(
                  nx_tactics_base.t_item,
                  ":name",
                  "Dark Forge",
                  ":summary",
                  "* A legendary forge where a man may be forged into the body of an Iron Golem, at the cost of his humanity."
                )
              ),
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Iron Mountains",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Iron Mountains",
                  ":summary",
                  "* The home of a stout race of men who live their lives on the cliffs and in tunnels of the Iron Mountains."
                ),
                "Iron Citadel",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Iron Citadel",
                  ":summary",
                  "* The capital of the Iron Kingdom. It is an enormous castle built into a cliff-face. Though it is huge outside, the citadel is mostly within the mountain. The mountain face makes the citadel basically impregnible from the outside. The true danger, however, lies undergound..."
                ),
                "Deep Roads",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Deep Roads",
                  ":summary",
                  "* A fantastic labyrinth of inter-connected, underground tunnels deep within the earth. The tunnels were mostly created by volcanic activity and underground rivers ages ago. They are so extensive that many civilizations live within the Deep Roads.",
                  ":titles",
                  "Dark Roads, Underdark, Underlands"
                )
              )
            ),
            ":Zura",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Zura",
              ":reference",
              "Switzerland",
              ":summary",
              "* Zurans are small in stature but very well educated people. They are are highly materialistic and suspiscious of others. They prefer windowless towers to minimize the chance of theft. They typically hide and trap their valuables and carry hidden weapons all the time.",
              ":titles",
              "Gnomes of Zurich",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Zuran Academy",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Zuran Academy",
                  ":summary",
                  "* The Zuran Academy is large complex of buildings that house schools, libraries, laboratories, and forges. Here can be found worlds most advanced scientific pursuits including: Alchemy, Thaumaturgy, Artifce, Gold/Silversmithing, Timekeeping, Glassblowing, and Tinkering.\n* Masters take on students as apprentices to dedicate their lives to a craft."
                ),
                ":Zurich",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Zurich"
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Zuran Inventor",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Zuran Inventor",
                  ":summary",
                  "* Zuran Inventors are masters at fine mechanics including clockworks, locks, and traps."
                ),
                "Zuran Moneylender",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Zuran Moneylender",
                  ":summary",
                  "* These moneylenders are shrewd negotiators and are always looking for a way to make a profit and manage their risk. They hire enforcers to make sure payment is made in full."
                ),
                "Zuran Procurer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Zuran Procurer",
                  ":summary",
                  "* Zuran merchants are unusual in that they tend to not maintain any particular product. Instead, they use their connections to locate and procure whatever is required. They are expensive, but they take great pride in their work and ensure that their customers are always satisfied."
                ),
                "Zuran Sage",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Zuran Sage",
                  ":summary",
                  "* Zuran Sages are librarians, reasearchers and advisers."
                ),
                "Zuran Thief",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Zuran Thief",
                  ":summary",
                  "* Zuran thieves materialism of course leads many to steal what they want. The skilled thieves in Zuraare precisely why the Zurans are so paranoid of theft. The skilled locksmiths are met with equally skilled lockpickers in a security arms race."
                )
              )
            )
          )
        ),
        "Middle East",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Middle East",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Arabia",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Arabia",
              ":reference",
              "Saudi Arabia"
            ),
            ":Assyria",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Assyria",
              ":reference",
              "Babylon, Mesopotamia, Sumeria",
              ":summary",
              "* Twin Rivers - Assyria is a verdent valley nestled between the Tigris and Euphrates Rivers.",
              ":sectionmap",
              vx_core.f_new(
                nx_tactics_base.t_sectionmap,
                ":Magisterium",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Magisterium",
                  ":summary",
                  "* Magister\n* Maleficar - A practitioner of Black Magic\n* Librarian\n* Certamen - Arcane Duel\n* Templar",
                  ":titles",
                  "Magocracy",
                  ":locationmap",
                  vx_core.f_new(
                    nx_tactics_base.t_locationmap,
                    ":Arcanum",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Arcanum",
                      ":reference",
                      "Chantry, Ivory Tower, Tower of Babylon",
                      ":summary",
                      "* The Arcanum is a colossal, tiered, white tower that houses the wizards of the Magisterium and their servants.\n* Construction - The tower is continually being built wider and higher using a combination of wizardry and labor. Its towering height represents the wizards power and dominion over the area. There are those who argue that the height of the tower has become a liability, but building the tower holds great symbolic and traditional importance, so those voices carry little weight. Inside, the tower has concentric walls that were built outward over time like tree rings. The complex construction has left much room for hidden passages and chambers throughout.\n* The home of the Arcanum Society, a fraterity of wizards, sages, alchemists, and artificers. Though their only stated goal is the pursuit of arcane knowledge, they are widely known as power brokers across the known world (and perhaps some unknown ones).\n* Arcanum Awards - The Arcanum Society holds an annual dinner to recognize the greatest magical discoveries of the year."
                    ),
                    "Great Ziggurat",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Great Ziggurat"
                    ),
                    "Hanging Gardens",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Hanging Gardens",
                      ":reference",
                      "Hanging Gardens of Babylon",
                      ":summary",
                      "* One of the Seven Wonders of the World"
                    )
                  )
                )
              )
            ),
            ":Canaan",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Canaan",
              ":reference",
              "Israel",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Mount Zion",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Mount Zion"
                ),
                "Solomon's Temple",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Solomon's Temple"
                ),
                ":Zion",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Zion"
                ),
                "Dead Sea",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Dead Sea"
                )
              )
            ),
            ":Pars",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Pars",
              ":reference",
              "Persia",
              ":sectionmap",
              vx_core.f_new(
                nx_tactics_base.t_sectionmap,
                ":Farad",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Farad",
                  ":summary",
                  "* Farad is an ancient land.\n* People - The country is largely poor and overpopulated.\n* Politics - Farad is ruled by a figurehead Kaliph, but each city state is actually run by individual Sultans who answer to no one. Assassination is an artform. Their assassins are known for their cunning and ruthlessness.\n* Justice - Justice is harsh and arbitrary. The militia is highly corrupt, and anything can be gotten for a price.\n* Economics - Trade caravans and shipping are huge sources of wealth. Spices and exotic dyes and weaves are particularly large industries.",
                  ":locationmap",
                  vx_core.f_new(
                    nx_tactics_base.t_locationmap,
                    ":Faradin",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Faradin"
                    )
                  ),
                  ":unitmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitmap,
                    "Faradun Mercenary",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Faradun Mercenary",
                      ":summary",
                      "* Since almost all actual Faradun are merchants, the army and navy are all highly paid mercenaries from other lands."
                    ),
                    "Faradun Merchant",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Faradun Merchant",
                      ":summary",
                      "* Few actual Faraduns are not merchants. Other tasks are done by slaves, indentured servants, convicted felons, and hired laborers."
                    ),
                    "Faradun Procurer",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Faradun Procurer",
                      ":summary",
                      "* A specialized merchant skilled at obtaining any entertainment or diversion imaginable regardless of its legal status ... for the right price. Procurers are famous for their discretion in this 'no questions asked' business. The Farad legal system does not hold Procurers liable for the actions of their customers, so they act with impunity."
                    )
                  )
                ),
                ":Phatas",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Phatas",
                  ":locationmap",
                  vx_core.f_new(
                    nx_tactics_base.t_locationmap,
                    ":Phatasia",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Phatasia",
                      ":reference",
                      "* Joseph Jacobs, Jack and the Beanstalk\n* Stratos - Star Trek, The Cloud Minders",
                      ":summary",
                      "* Phantasia is a unique city. Half of the city is quite normal, the other half is literally floating on a cloud. Long ago when a local hero slew a Cloud Giant, and the giant's floating keep remained hovering over the town where he lived. After the creation of windships, the townsfolk began converting the giant's keep into a human city. The city has towering walls, but has limited floorspace, so only the wealthiest live in the clouds.\n* Windships - Over time, the town grew and eventually a brilliant wizard discovered a way to construct windships based on his studies of the floating city. He made a fortune by keeping the technique a closely guarded secret. Unfortunately, the secret seems to have died with its creator, and no one has been able create new windships since.\n* Weather - Phantasia can get chilly and severe weather can be very harrowing."
                    ),
                    "Bazaar of the Bizarre",
                    vx_core.f_new(
                      nx_tactics_base.t_location,
                      ":name",
                      "Bazaar of the Bizarre",
                      ":summary",
                      "* Each year for one week, the Phantasias hold an exhibition of oddities and diversions. To gain entrance, you must be attired in costume. Wearers of the most outlandish garb are awarded a silver goblet which allows them to drink for free during the festival.\n* Multi-colored tents and pavilions litter the festival grounds, each housing some sort of attraction: a duel of spell casters for wagers, abominations from the Aberrant Forest, Illusionary panoramas, romances, sensations, or improbabilities and other things which defy description. Visitors are invited to observer, partake of, or otherwise experience all he or she desires. Rare delicacies from around the world are available.\n* The climax is the award ceremonies when prizes are given in various categories including: 'Most Unique', 'Most Provacative', 'Most Absurd'. The final award is the most coveted: 'Most Bizarre'. A committee of 12 enchanters judge the competition, registering various degrees of approval or disapproval by means of magically enhanced facial expressions and gestures."
                    )
                  ),
                  ":unitmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitmap,
                    "Phantasian Dreamer",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Phantasian Dreamer",
                      ":summary",
                      "* The Dreamers use their [Dreaming] skill to capture and sell the exotic\n[Dream Essence] to those wealthy enough to afford such luxury."
                    ),
                    "Phantasian Windship",
                    vx_core.f_new(
                      nx_tactics_base.t_unit,
                      ":name",
                      "Phantasian Windship",
                      ":summary",
                      "* The windships are wonderous craft which sail upon the winds as sea vessels ply the waters. They are constructed of the lightest possible materials and are therefore somewhat fragile and require constant repair. Extreme weather conditions are a particular concern especially high winds and freezing rain, and lightning.\n* The sails and rigging are made of gossamer. Flight is maintained by magical devices called levitationals below decks. These levitationals only provide elevational control. Directional control and speed are all subject to the wind."
                    )
                  )
                )
              )
            ),
            ":Raja",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Raja",
              ":summary",
              "* Red Gold - The mines of Raja are rich with very impure gold deposits. Large slave colonies work the mines day and night. Rajans leave the red impurities in the smelting process leaving their gold with a swirled bloody look to it.\n* Rajan Glory - The only allowed currency of Raja are the blood red gold coins called Glories. They are simple and fearsome with a burning fire on one side and a cackling skull on the other. Like Rajan gold in general, the coins have a swirled bloody look to them and are only about 75% pure. Since Raja is 	considered a rogue state by other nations, possession of Rajan Glories is sufficient evidence to be imprisoned as a spy. On the black market the coins can get about 25% of their face value, especially in distant lands where the penalies for possession are lower.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Rajan Desert Warrior",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Rajan Desert Warrior",
                  ":summary",
                  "* An army of religious fanatics who believe that their service in life will be rewarded in the after life, so they obey without question."
                ),
                "Rajan Agent",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Rajan Agent",
                  ":summary",
                  "* The loyal servants the Black Mystics. They act as spies, assassins, terrorists, and secret police thoughout the country and beyond."
                ),
                "Rajan Inquisitor",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Rajan Inquisitor",
                  ":summary",
                  "* The elite religious agents of the Black Mystics. They are priest, healers, torturers, and personal bodyguards of the Black Mystics.",
                  ":titles",
                  "Torquar"
                ),
                "Rajan Black Mystic",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Rajan Black Mystic",
                  ":summary",
                  "* The Black Mystics are necromancer/priest who lead the Rajan cult. They are religious fanatics and believe that they channel the will of their dread gods.\n* Black Mystic religious ceremonies typically feature ritual executions symbolizing conversion of non-believers to the cult. Demons perform the executions which draw great crowds of worshippers to the temples."
                )
              )
            ),
            "Desert Wastes",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Desert Wastes",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "City of Brass",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "City of Brass",
                  ":summary",
                  "* The City of Brass is a major city of the [Ifrit]. It is a beautiful place with palaces, libraries, and cathedrals all built to giant scale and all built of brass to withstand the withering desert heat."
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Juzam Djinn",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Juzam Djinn",
                  ":summary",
                  "* The Juzam Djinn are 14 foot tall, brass skinned devils with curved horns and tusk-like fangs. They wield huge stone clubs carbed with the visages of leering devils. They wear only necklaces of skulls collected as mementos of their grisly conquests.\n* They are fond of men whom they regard as fine eating.\n* They entertain themselves by various games including hurling large rocks long distances to crush various animals. They are also extremely fond of games of chance and wagers, though they are not above using their magical powers to tilt games in their favor."
                )
              )
            )
          )
        ),
        ":Oceania",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Oceania",
          ":titles",
          "Pacific Ocean",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Cresent Isles",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Cresent Isles",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Nauticus Reef",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Nauticus Reef",
                  ":summary",
                  "* A great mass of coral filled with beautiful and dangerous sea life. The reef has been the cause of many shipwrecks over the years and is the subject of many perilous salvage operations over the years."
                )
              )
            ),
            ":Lemuria",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Lemuria"
            )
          )
        ),
        "Underground, The",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Underground, The",
          ":titles",
          "Underdark, Underdeep",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Underground Highway",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Underground Highway",
              ":summary",
              "* An extensive tunnel system that covers hundreds of miles and travels deep under many countries.\n* Ages ago an underground river flowed through this region carving out the massive tunnels and tributaries. The receding waters developed a vast underground ecosystem. Phosphorescent fungi even allowed sighted beings to thrive in this spectacular and bizarre underground world."
            )
          )
        ),
        ":Wilderlands",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Wilderlands",
          ":reference",
          "* Americas",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            "Aberrant Rainforest",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Aberrant Rainforest",
              ":summary",
              "* The Aberrant Rainforest is a weird and grotesque jungle the freakish origins of which are attributed to a magical mishap of unparalleled proportions.\n* All manner of rare and exotic vegetation can be found here, though nothing that grows here is as nature intended. The plants and trees appear heedless of natural law, growing to immense proportions or becoming gnarled and twisted in form. From the underbrush, animate tentrils of tanglewood reach out to ensnare the incautious. Among the reports of talking Mang trees, giant species of slugs and scavenger slimes, and strange insect-reptile hybrids are tales of intelligent plant creatures.\n* Murky streams flow uphill, stagnant ponds move slowly across the land, and the ground itself seems to pulse as if it were alive.\n* Because many varieties of unique and valuable herbs grow throughout the forest, visitors are not unknown."
            ),
            "Lost Sea",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Lost Sea",
              ":reference",
              "Salt Flats",
              ":summary",
              "* Deep within the Wilderlands is a flat wasteland known as the Lost Sea. This area appears to be a dry seabed littered with the ancient skeletons of giant aquatic monsters. The area gets little rain and is layered in salt from the former sea, so nothing lives here. It is said that the wrecks of ancient ships can be found in isolated places potentially carrying treasures from ancient civilizations."
            ),
            "Lost World",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Lost World",
              ":reference",
              "The Land that Time Forgot",
              ":summary",
              "* Deep within the Wilderland jungles is a towering ridge of a massive caldera formed\nby an ancient volcano. Within the caldera is a large expanse of jungle cut off from\nthe outside world for millions of years. Numerous creatures though to be extinct still\nsurvive in this safe haven.",
              ":titles",
              "Pangaea"
            ),
            "Salt Flats",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Salt Flats"
            ),
            "Sea of Glass",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Sea of Glass",
              ":summary",
              "* The sea of glass is a vast expanse of mostly flat glass. The sea was presumably\nformed by a massive firestorm detonating over a sandy desert, but no cause had been\ndiscovered. Travelling over the glass is similar to travelling over ice though the\nglass is much harder and the weather is very hot. The glass creates a blinding glare\nwhen the Sun is at the right angle, and the surface can seem like a giant frying pan\nunder the noonday Sun."
            )
          ),
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Azteka",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Azteka"
            ),
            ":Maya",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Maya"
            ),
            ":Mandragora",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Mandragora",
              ":summary",
              "* Mandragora is named for the unusual sentient plant-life, the Mandragore, who live here.\n* Mandragores - About three feet high and vaguely man-like, they are roughly humanoid in form with gnarled root-like limbs and leafy 'hair'. Their eyes are like dark knots and their mouths are like the twisted hollow of a tree. The Mandragore usually stand rooted and immobile during the day as they soak in sunlight. During this time, they are well camoflaged among the other plant-life. At night, they move about tending their chores and looking for trespassers who they attempt to capture with nets of vines and grasses. Their unfortunate victims are bound and buried alive as fertilizer.\n* Abilities - The Mandragore are weak fighters who rely on surprise and numbers to battle large foes.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Mandragore Herbalist",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Mandragore Herbalist",
                  ":unitpowermap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitpowermap,
                    ":Naturalism",
                    vx_core.f_new(
                      nx_tactics_base.t_unitpower,
                      ":name",
                      "Naturalism",
                      ":unitabilitymap",
                      vx_core.f_new(
                        nx_tactics_base.t_unitabilitymap,
                        "Warp Wood",
                        vx_core.f_new(
                          nx_tactics_base.t_unitability,
                          ":name",
                          "Warp Wood"
                        )
                      )
                    )
                  ),
                  ":unitskillmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitskillmap,
                    "Physical Weakness",
                    vx_core.f_new(
                      nx_tactics_base.t_unitskill,
                      ":name",
                      "Physical Weakness",
                      ":unitabilitymap",
                      vx_core.f_new(
                        nx_tactics_base.t_unitabilitymap,
                        "Vulnerable to Fire",
                        vx_core.f_new(
                          nx_tactics_base.t_unitability,
                          ":name",
                          "Vulnerable to Fire"
                        )
                      )
                    )
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
   * @function chapter_nexus_fantasy_characters
   * @return {chapter}
   */
  static t_chapter_nexus_fantasy_characters = {
    vx_type: vx_core.t_type
  }
  static e_chapter_nexus_fantasy_characters = {
    vx_type: nx_tactics_books_fantasy.t_chapter_nexus_fantasy_characters
  }

  // (func chapter_nexus_fantasy_characters)
  static f_chapter_nexus_fantasy_characters() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Nexus Fantasy Characters",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Nexus Fantasy Characters",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Nexus Fantasy Characters",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Arinni Taybor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Arinni Taybor",
              ":summary",
              "* Human Priest/Monk",
              ":titles",
              "Taybor the Red",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Melee",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Melee",
                  ":level",
                  "5",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    ":Quarterstaff",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "Quarterstaff"
                    )
                  )
                )
              )
            ),
            "Eldruf Grundel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Eldruf Grundel",
              ":summary",
              "Gnome Thief Magician"
            ),
            ":Flint",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Flint",
              ":image",
              "Fantasy/Flint.png",
              ":summary",
              "Half-Elven Thief",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Stealth",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Stealth",
                  ":level",
                  "9",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    ":Backstab",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Backstab"
                    )
                  )
                )
              )
            ),
            "Galamir Mirlesem",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Galamir Mirlesem",
              ":image",
              "Fantasy/GalamirMirlesem.png",
              ":summary",
              "* Human Mage\n* Personality - Galamir is a brilliant Wizard and strategist, but he is impatient with others and has no respect for politics or idle chit-chat.\n* History - Galamir was born to Chantry trainers, and as a child he was allowed special access to the arcane academy. As a teen, he became obsessed with magic and its effect on the world. His brilliance and magical aptitude were soon recognized and he was accepted into the academy. For the next 25 years he completed his full wizardry and elemental training and received top honors. He was a logical 	candidate to become a trainer himself, but he was bored of the cloistered life, so he began visiting other Chantries across the world. Along the way he encountered a naive, young half-elf rogue named Phirax living on a simple farm. Galamir recruited Phirax to join him to perform the more dangerous and mundane tasks while Galamir provided the leadership and strategy. Later, he recruited the Warrior Stam and the Cleric Sarak into their party to rounded out their abilities.",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Wizardry",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Wizardry",
                  ":level",
                  "11"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Physical Powers",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Physical Powers",
                  ":level",
                  "10"
                )
              )
            ),
            "Hetman Undrig",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hetman Undrig",
              ":summary",
              "* Orc Assassin\n* A pragmatic, hardened survivalist who began his career as a lowly militia man in the Orc Army who would later form the infamous mercenary guild, the Blackguard.\n* Personality - Hetman is noteworthy for his lack of personal pride or conscience. He dislikes authority.  He strongly believes the ends justify the means and has no compunction about using any means available.\n* The Blackguard - When establishing the Blackguard, he insisted that it should never have a central authority and that all decisions were made by popular vote.",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Melee",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Melee",
                  ":level",
                  "5",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    ":Longsword",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "Longsword"
                    ),
                    ":Dagger",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "Dagger"
                    )
                  )
                )
              )
            ),
            "Jaris Ransun",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jaris Ransun",
              ":image",
              "Fantasy/Ransun.png",
              ":summary",
              "Human Hunter",
              ":titles",
              "Valen the Hunter",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Defense",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Defense",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "Chain Mail Armor",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "Chain Mail Armor"
                    ),
                    ":Shield",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "Shield"
                    )
                  )
                )
              )
            ),
            "Phirax Alganon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Phirax Alganon",
              ":image",
              "Fantasy/PhiraxAlganon.png",
              ":summary",
              "* Half-Elven Bard\n* Personality - Phirax is an entertaining, friendly, perceptive person who is very focused on 'the now'. He applies all his attention to the current situation and the people around him which gives him a keen eye for detail, deception, and subtle clues of human behavior. He strongly believes he is on the right path in life and has developed very strong emotional confidence which lets him roll with the whatever comes his way. He appreciates plans and planners, but he feels that plans must always be flexible because they rarely predict a situation accurately.\n* Beliefs - Phirax believes that improving the lives of those around him will also improves his own life. He sees this as selfishness through selflessness, therefore it is always in his own interest to help others. He could easily manipulate those around him, but he abhors the idea of exploiting others and is quick to judge abusers of any kind. He follows the lesser god Seker on his mission to destroy undead, specifically those who feed on or otherwise exploit the living (which is pretty much all of them).\n* History - Phirax was born into a large family on a farm bordering the Arden Forest. During the day, he learned diverse combat and survival skills with the Elves of the forest. At night he practiced various social skills at the human tavern. He was planning to set out on his own soon when he encountered a rather awkward and self-important Wizard named Galamir. After he confirmed the Wizard's abilities, he agreed to join him as a pair of traveling adventurers. Soon after, the pair teamed up with a Warrior and a Cleric. With the party complete, they set out for danger and treasure.",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Empathy",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Empathy",
                  ":level",
                  "12",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    ":Demoralize",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Demoralize"
                    ),
                    ":Inspiration",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Inspiration"
                    )
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Stealth",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Stealth",
                  ":level",
                  "9",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    ":Backstab",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Backstab"
                    ),
                    "Hide in Shadows",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Hide in Shadows"
                    ),
                    "Move Silently",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Move Silently"
                    )
                  )
                )
              )
            ),
            "Sarak Ishimar",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sarak Ishimar",
              ":image",
              "Fantasy/SarakIshimar.png",
              ":summary",
              "Human Cleric",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Faith",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Faith",
                  ":level",
                  "8"
                ),
                ":Invocation",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Invocation",
                  ":level",
                  "10"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Physical Powers",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Physical Powers",
                  ":level",
                  "8"
                )
              )
            ),
            "Stam Domindor",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Stam Domindor",
              ":image",
              "Fantasy/Stam.png",
              ":summary",
              "Dwarven Warrior",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Ranged",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Ranged",
                  ":level",
                  "7",
                  ":unititemmap",
                  vx_core.f_new(
                    nx_tactics_base.t_unititemmap,
                    "Short Bow",
                    vx_core.f_new(
                      nx_tactics_base.t_unititem,
                      ":name",
                      "Short Bow"
                    )
                  )
                )
              )
            )
          )
        ),
        "Nexus Fantasy Actors",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Nexus Fantasy Actors",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Antios Teron",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Antios Teron",
              ":summary",
              "* Human Spy\n* Antios is a spy for Lord Aramel.\n* He is currently disguised as a mercenary for hire while travelling through the Imperium to assess their defenses. He has been authorized to assassinate any high ranking politician he should encounter to disrupt\nlocal politics. His mission has no time limit, and he is periodically scried by Lord Aramel's wizards.\n* He is a convincing actor who can play most parts well. He is particularly ruthless about his identity and will silence any who might compromise him or his mission.",
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                ":Espionage",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Espionage",
                  ":level",
                  "5"
                )
              )
            ),
            ":Blackguard",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Blackguard",
              ":summary",
              "* An elite mercenary cadre organized by Hetman Undrig.\n* Their base is a small, walled town dedicated to their needs.\n* The Dragoons are a loose group. Decisions and leaders are chosen by majority vote. Power can change at anytime (including during combat).\n* Dragoons pay no dues nor is there direct pay. The Dragoons make money by hiring out as mercenaries.  They charge double normal rates, but are reknowned for their excellent training and equipment. Dragoons take great pride in their high status and react poorly to those who do not recognize their talent.\n* Dragoons are trained professionals in their jobs and recognize the need for discretion. They care little for whether a job is legal or not, and the Dragoons are known for possessing certain 'subtle' skills that make covert missions possible. They do not, however, enjoy excessive risk and are not above abandoning very dangerous missions.",
              ":titles",
              "Black Dragoon"
            ),
            "Charn Aramel",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Charn Aramel",
              ":summary",
              "Human Dread Knight",
              ":titles",
              "Nighthook, Lord Aramel",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Conviction",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Conviction",
                  ":level",
                  "10"
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Psychic Powers",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Psychic Powers",
                  ":level",
                  "10"
                )
              )
            ),
            "Sarani Kalea",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Sarani Kalea",
              ":summary",
              "Human Priestess",
              ":titles",
              "Princess Kalea, High Priestess of Kali",
              ":unitpowermap",
              vx_core.f_new(
                nx_tactics_base.t_unitpowermap,
                ":Conviction",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Conviction",
                  ":level",
                  "12"
                ),
                ":Invocation",
                vx_core.f_new(
                  nx_tactics_base.t_unitpower,
                  ":name",
                  "Invocation",
                  ":level",
                  "16",
                  ":unitabilitymap",
                  vx_core.f_new(
                    nx_tactics_base.t_unitabilitymap,
                    ":Aspecting",
                    vx_core.f_new(
                      nx_tactics_base.t_unitability,
                      ":name",
                      "Aspecting"
                    )
                  )
                )
              ),
              ":unitskillmap",
              vx_core.f_new(
                nx_tactics_base.t_unitskillmap,
                "Psychic Powers",
                vx_core.f_new(
                  nx_tactics_base.t_unitskill,
                  ":name",
                  "Psychic Powers",
                  ":level",
                  "12"
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
   * @function chapter_realms_beyond
   * @return {chapter}
   */
  static t_chapter_realms_beyond = {
    vx_type: vx_core.t_type
  }
  static e_chapter_realms_beyond = {
    vx_type: nx_tactics_books_fantasy.t_chapter_realms_beyond
  }

  // (func chapter_realms_beyond)
  static f_chapter_realms_beyond() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Realms Beyond",
      ":reference",
      "* Reality is just your mind collapsing under what it doesn't understand, silly. - Zoe, Runeterra",
      ":summary",
      "* The realms beyond our mortal existence.\n* It is the origin of our souls, dreams, and imagination. It is also the home of spirits and demons.\n* All of the different realms are like closely packed soap bubbles. Where the bubbles touch, realms touch, and the presense of those realms can be felt.\n* The Realms Beyond are described by coordinates for +/-x, +/-y, +/-z, +/-t, +/-i (length, height, width, time, imaginary)\n* Realm Types:\n** Universe: +x, +y, +z, +t, 0i\n** Positive Planes: +x, +y, +z, +t, +i\n*** Hyperspace is when you travel through the Positive Planes: +i\n** Void -x, +y, -z, -t, +i\n** Antiverse: -x, -y, -z, +t, 0i\n** Limbo +x, -y, -z, +t, -i\n** Negative Planes +x, +y, +z, +t, -i\n*** Umbra/Subspace connects the Negative Planes -i\n** Temporal Realms +/-x, +/-y, +/-z, +/-t, 0i",
      ":titles",
      "Multiverse, Realties, Realms",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Universe",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Universe",
          ":summary",
          "* Location: +x, +y, +z, +t, 0i",
          ":titles",
          "Material Realm, Material Universe, Real World, Space"
        ),
        ":Antiverse",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Antiverse",
          ":summary",
          "* Antispace was created with the Big Bang. In this multiverse a larger amount of anti-matter than matter was created. They are very similar to the Material Realms, but their particles are deadly to beings from the Physical Realms and vis-versa.",
          ":titles",
          "Antispace, Anti Realm, Negative Zone"
        ),
        ":Void",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Void",
          ":summary",
          "* The Void was created with the Big Bang. In this multiverse a roughly equal amount of matter and anti-matter were created. Almost nothing remains in this desolate lightless physical multiverse."
        ),
        ":Limbo",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Limbo",
          ":summary",
          "* The Limbo was created with the Big Bang. In this multiverse a roughly equal amount of matter and anti-matter were created. Almost nothing remains in this desolate lightless spirit multiverse."
        ),
        "Positive Planes",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Positive Planes",
          ":titles",
          "Higher Realms, Order Realms, Positive Realms, Positive Space",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            ":Celestia",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Celestia"
            ),
            ":Hyperspace",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hyperspace",
              ":summary",
              "* Hyperspace is not an actual place, it is what one observes while travelling between Positive Planes."
            ),
            ":Source",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Source",
              ":reference",
              "* I am kindness. I am unity. I am bigotry. I am expansion. I am the end! The DEATH that comes for expansion! For existence! The NULL that comes unto us all. Because I AM the PHOENIX! Life and death INCARNATE! The resurrection and renewal that will never end. Memories reawakened. A life lived and ended, again and again. A perpetual cycle of joy and sorrow. Anger and gratitude. Bliss and grief. All of them, just small parts of what relentlessly perseveres. Infinite, Absolute, Unconditional. - Madelyn Prior, X-men",
              ":summary",
              "* Location: 0x, 0y, 0z, t, +infinity-i\n* The White Hot Room is a single point at the infinite edge of [Positive Space]. As such, it holds infinite energy.\n* It is the home of the [Phoenix Force].\n* It is speculated that beyond the Source, lies [Oblivion] in an endless cycle.\n* Some say all of reality is just shadows cast between the Source and Oblivion.",
              ":titles",
              "Absolute Order, Positive Infinity, The Beginning, The Fountain, The Source, The White Hole, True Order, White Hot Room"
            )
          )
        ),
        "Negative Space",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Negative Space",
          ":titles",
          "Lower Realms, Negative Realms, Negative Space, Negative Universe, Negaverse",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            ":Abyss",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Abyss",
              ":titles",
              "Pandemonium, The Well"
            ),
            ":Oblivion",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Oblivion",
              ":summary",
              "* It is speculated that beyond Oblivion, lies the [Source] in an endless cycle.",
              ":titles",
              "Absolute Chaos, The End, True Chaos"
            ),
            ":Umbra",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Umbra",
              ":summary",
              "* Hyperspace is not an actual place, it is what one observes while travelling between Positive Planes.",
              ":titles",
              "Subspace"
            ),
            ":Wyld",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Wyld",
              ":titles",
              "Wildspace, Wylderlands, Wyldspace"
            )
          )
        ),
        "Temporal Realms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Temporal Realms",
          ":summary",
          "* The Temporal Realms are described by coordinates for +/-x, +/-y, +/-z +/-t (length, height, width, time)",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            ":Vortex",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Vortex",
              ":reference",
              "* The Christmas tree, which can be traced in its origins back to pre-Christian European beliefs, represents an axis mundi.\n* The axis mundi (also cosmic axis, world axis, world pillar and center of the world) is a symbol representing the point of connection between sky and earth. It offers means of travel and correspondence between the two realms. It is also the place where the four compass directions unite.\n* It was an All-in-One and One-in-All of limitless being and self - not merely a thing of one Space-Time continuum, but allied to the ultimate animating essence of existence's whole unbounded sweep - the last, utter sweep which has no confines and which outreaches fancy and mathematics alike. It was perhaps that which certain secret cults of earth have whispered of as YOG-SOTHOTH, and which has been a deity under other names; that which the crustaceans of Yuggoth worship as the Beyond-One, and which the vaporous brains of the spiral nebulae know by an untranslatable Sign... - Through the Gates of the Silver Key",
              ":summary",
              "* The spiraling tunnel to infinity down all black holes, a corridor where the rules of time and space cease to have meaning. Some theorize that the Vortex is the eye of the storm within [Oblivion] and is the ultimate connection between [Oblivilion] and the [Source].\n* It is said that the World Tree's roots are the [Ley Line]s and its fruit are the stars. It grows up through the [Underworld] and soars into the heavens where it suspends the sky. The World Tree is eternal and is connected through both time and space.\n* The Norns are found here.",
              ":titles",
              "Axis Mundi, Chronos, Eye of Harmony, Irminsul, Temporal Zero Point, Tree of Life, Tree of Knowledge of Good and Evil, World Pillar, World Tree, Yggdrasil, Yog-Sothoth"
            )
          )
        ),
        "Inner Realms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Inner Realms",
          ":summary",
          "* The Periphery consists of a number of Realms that touch the Material Realm.\n* These Realms are forever separated from the mortal world by thin but strong membrane called the Veil.\n* Peripheral Vision - Sometimes a glimse of the Outer Realms may be seen at the edge of normal vision.\n* Gates - Gates are more easily created when both realms resemble each other at both ends of the Gate.\n* Realm Overlay - Sometimes when an area of both realms closely resembles one another, the areas overlap creating a natural Gate of sorts where one may accidentally wander from one Realm to the other without noticing.",
          ":titles",
          "Periphery",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            "Ley Line",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Ley Line",
              ":summary",
              "* Ley Lines are invisible, spiritual energy lines that pass through the universe and serve as the branches and roots of the World Tree. The Ley Lines influence the areas they pass through. Their existence transcends time. Contacting the Lines boosts spiritual powers and connects the past and future. They can be tapped to raise magical effects and they can spread the effect of tragic or corrupted areas, creating haunted or cursed areas.\n* Dragons are said to choose exposed Ley Lines as lairs and nests. It is possible that Ley Lines are the secret to their power.\n* Fault Lines and Volcanic activity are side effects of Ley Line power.\n* Ley Line Memories - Ley Lines exist through history, so it is sometimes possible to witness events from the past or future near the lines.\n* Ley Line Filth - When negative energy builds up over time near a Ley Line, so a Ley Line can sometimes leak solid dark energy that is called Filth or Corruption. This Filth corrupts the area, withering plants and contaminating animals and water. Since it is a spiritual corruption, it can only be repaired with purification magic or by somehow confronting and addressing the cause of the corruption.",
              ":titles",
              "Dragon Lines, Fate Lines, Lines of Power, Threads of Fate, Time Lines"
            ),
            "Digital Realm",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Digital Realm",
              ":titles",
              "Cyberspace, Cyberrealm"
            ),
            "Dreaming, The",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Dreaming, The",
              ":titles",
              "Dreamlands, Dreamworld, Fade, Imaginary World, Nod"
            ),
            "Fade, The",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Fade, The",
              ":summary",
              "* The Fade is a Mirror Realm that is a sort of Dream Realm but is driven by strong emotions.\n* Fade Curse - A Curse is a spirit that has manifested from strong emotions over a long period of time."
            ),
            ":Luna",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Luna",
              ":summary",
              "* The Spirit Realm of the Moon",
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
                      nx_tactics_base.t_location,
                      ":tag",
                      "unit"
                    ),
                    ":severity",
                    2
                  )
                )
              )
            ),
            "Hollow World",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hollow World"
            ),
            "Memory Realm",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Memory Realm",
              ":titles",
              "Land of Lost Things, Memory Lane"
            ),
            "Micro Realm",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Micro Realm",
              ":titles",
              "Microverse, Quantum Realm"
            ),
            "Mirrors Realms",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Mirrors Realms",
              ":reference",
              "* Alice in Wonderland\n* Kamen Rider Dragon Knight\n* Werewolf the Apocalypse\n* Star Trek - Mirror, Mirror\n* Stranger Things",
              ":summary",
              "* Beyond all mirrors lie worlds almost identical to our own but more a reflection of mind than of substance. There are an infinite number of these mirror universes, though each is accessible in a slightly different way.",
              ":titles",
              "Alternate Dimensions, Mirrorlands, Mirror Universe, Mirror World, Mirrorverse, Mirrors, The Upsidedown, Twilight Zone"
            ),
            "Negative Realms",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Negative Realms",
              ":summary",
              "* Negative Realms are described by coordinates for -x, -y, -z, t (length, height, width, time)\n* The Negative Realms are particular mirrors of the Material Realms. They were created at the same moment that the Material Realms were, but while the Material Realms were mostly filled with normal matter, the Negative Realms were mostly filled with anti-matter.",
              ":titles",
              "Anti-matter Universes"
            ),
            "Nexus of Realities",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Nexus of Realities",
              ":summary",
              "* The Nexus of Realities is a place that touches the [Vortex] and through it all other realities. So near the [Vortex], Time is meaningless here, so anyone entering will feel as if they have been in the Nexus for a very long time and may stay here as long as they want with no wants. When they leave, however, no time will have past and their time spent will be remembered like a dream.\n* Tanelorn - The city Tanelorn has been built at the Nexus and is a sort of waystation for those travelling to other worlds. Tanelorn exists in all inner realms and appears as a simple town native to each reality. One cannot look for Tanelorn for it does not appear on any map, but it can occasionally be stumbled upon by frustrated travellers seeking new horizons. As the existence of Tanelorn can never be proven, it remains a myth throughout the universe.",
              ":titles",
              "Tanelorn, Waystation"
            ),
            ":Pangea",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Pangea",
              ":titles",
              "Prehistoric Realm"
            ),
            ":Yuggoth",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Yuggoth",
              ":summary",
              "* The Spirit Realm of Pluto"
            ),
            ":Shadowland",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Shadowland",
              ":summary",
              "* The Realm of the recently dead.\n* The Shadowland is a dark [Mirrorland] superimposed on the regular living world. Here, the recently dead (Wraiths) can remain among the living, but they (mostly) cannot interact with the living world. Wraiths are invisible and intangible. They can even walk through solid objects but doing this disrupts the Wraith's energy, damaging it slightly.\n* Noncorporeal Undead - The Shadowlands is the native realm of non-corporeal undead and is where they are strongest.\n* Corporeal Undead - The remnants of the spirits of corporeal undead can be easily seen in the Shadowlands. Corporeal Undead are particularly vulnerable to exorcism or control from Shadowland attackers.\n* The [Veil] separating the Shadowland from the living world is called the Shroud.\n* Many portals lead from here to the [Underworld], but if a [Wraith] loses his connection to the living world, he may not return to the [Shadowlands]."
            ),
            ":Veil",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Veil",
              ":summary",
              "* The Veil is a barrier between the natural world and the supernatural worlds.\n* The Veil is not only a physical barrier but also has an effect on perception and memory. Those without supernatural abilities who encounter supernatural beings will tend to rationalize the supernatural aspects of the encounter, instead interpretting them as natural phenomenon. They will irrationally deny that any supernatural aspect was involved regardless of the evidence. This quality of the Veil applies to recordings and any other evidence and has kept the mythical status of supernatural beings for millenia.",
              ":titles",
              "Gauntlet, Mists, Shroud"
            )
          ),
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Elemental Air Realm",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Elemental Air Realm",
              ":summary",
              "* The realm of elemental air is a vast, empty space above the clouds of the world. Here there are no solids or liquids only gases without impurities (e.g. smoke).\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":h'Haarshann",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "h'Haarshann",
                  ":reference",
                  "Elric of Melnibone",
                  ":summary",
                  "* Wind Elemental Lord"
                )
              )
            ),
            "Elemental Cold Realm",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Elemental Cold Realm",
              ":summary",
              "* The realm of elemental cold is a vast, barren, snowscape under a sunless sky. Harsh blizzards sweep across the snow that covers the glaciers and frozen seas. There is no heat in this realm.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family."
            ),
            "Elemental Earth Realm",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Elemental Earth Realm",
              ":summary",
              "* The realm of elemental earth is a vast, solid space below the surface of the world. It is mostly solid rock, but cave systems, roots, and underground waterways exist as well.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Grome",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Grome",
                  ":reference",
                  "Elric of Melnibone",
                  ":summary",
                  "* Earth Elemental Lord"
                )
              )
            ),
            "Elemental Fire Realm",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Elemental Fire Realm",
              ":summary",
              "* The realm of elemental fire is a vast volcanic space seemingly from the dawn of the world. It is all lava, and scorching heat. Here, fire is pure without oxygen or smoke or fuel to burn.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family."
            ),
            "Elemental Lightning Realm",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Elemental Lightning Realm",
              ":summary",
              "* The realm of elemental lightning is a vast lightning storm lighting up the sky, pounding the ground, and electrifying the seas.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family."
            ),
            "Elemental Water Realm",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Elemental Water Realm",
              ":summary",
              "* The realm of elemental water is a vast space deep within the ocean depths of the world.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family.",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Straasha",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Straasha",
                  ":reference",
                  "Elric of Melnibone",
                  ":summary",
                  "* Water Elemental Lord"
                ),
                ":Pyaray",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Pyaray",
                  ":reference",
                  "Elric of Melnibone",
                  ":summary",
                  "* Pyaray is a Chaos Lord who rules the deepest parts of the ocean. He appears as a giant red octopus-like creature, and his soul is kept in a blue crystal on his head. Sailors who drown at sea are taken into his Chaos Fleet. One portent of the end of the world is the ascent of the Chaos Fleet to the surface. Pyaray and Straasha are bitter enemies.",
                  ":titles",
                  "Tentacled Whisperer of Impossible Secrets"
                )
              )
            ),
            ":Elysium",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Elysium",
              ":summary",
              "* The legendary homeland of the Fae. It is a wonderous place of myth and legend deep in the dream world.\n* Seasons - The Fae realm is driven by the seasons in an eternal cycle of death and rebirth.\n** Spring - \n*** Spring Bloom\n** Summer - \n** Autumn - \n*** Autumnal Harvest\n** Winter - \n* Courts - \n** Seelie Court - \n** Unseelie Court - \n* Archfae - \n* Fae Magic - Though the Fae trade in physical objects like gold or food, these things are actually made of imagination and Fae Magic. For the Fae, magic is the one true currency. Having it and using it is the sign of royalty. Those with no magic have no status and no value.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                ":Arcadia",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Arcadia",
                  ":summary",
                  "* The capital city of the Fae. It is a land partially of Dream and is not normally accessible to mortals."
                ),
                "Elysian Forest",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Elysian Forest",
                  ":summary",
                  "* The forests of Elysium are filled with living creatures including wild animals, large insects, Sprites, and Pixies."
                ),
                "Elysian Fields",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Elysian Fields"
                )
              )
            )
          )
        ),
        "Higher Realms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Higher Realms",
          ":titles",
          "Over Realms",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            "Celestial Realm",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Celestial Realm",
              ":summary",
              "* Powerful beings of order inhabit this Realm. They are not overtly hostile, but they unyielding and have a severe approach to justice that makes one wonder if anyone can survive their scrutiny.",
              ":titles",
              "Afterworld, Angelic Realm, Celestine Realm"
            ),
            "Imaginary Space",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Imaginary Space",
              ":reference",
              "* Though the story is fictional, as far as the characters are concerned, their fate is real. Therein lies the rub, are you and I the audience or characters on the stage? Nobody can know for sure. Afterall, nothing is easier to fool than the senses. - Furina, Genshin Impact",
              ":summary",
              "* The Imaginary Realm is the realm of the Mind and of possibilities. It connects all other realms, and some believe all realms are birthed from the infinite potential of the Imaginary Realm.\n* Description - The realm is filled with a glowing mist and motes of crackly energy called Astral Luminaries (Tachyons). Touching a luminary fills one with energy and inspiration, but contacting too many too quickly will overload the body in a violent explosion.\n* Transition - When entering the Imaginary Realm, there is a sudden, frightening sensation of fliping forward and sideways at once and then it is over.\n* Speed - In the Imaginary Realm, the speed of light is the lowest speed that an object can move though due to relativity, the speed of light is effectively zero speed. Here physical objects move at wildly accelerated speeds and can easily become lost or destroyed in the insane speeds and energies of this Realm.\n* Mind and Will - Everyone seems to experience the Imaginary Realm differently with many experiencing wild and terrible hallicinations. Those entering this Realm with just their minds find that their abilities are vastly increased. They appear as an idealized version of themselves with Body equal to Mind and all abilities may use Mind instead.\n* Body - Physical rules barely apply. All resistences use Will instead of Body.",
              ":titles",
              "Astral Plane, Astral Realm, Complex Space, Ether, Etheral Plane, Etheral Realm, Hyperspace, I-Space, Imaginary Realm, Subjective Reality, Subspace, Superspace, The Pale, Ultraspace"
            ),
            "Realm of Light",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Realm of Light",
              ":summary",
              "* This is an area of space near the center of the Universe. It is said to be based upon lines and angles instead of surfaces and curves, and it is known to be a region of intense and deadly energies. The realm appears much like a negative image of the known Universe with dark stars on a backdrop of intense light. Few organic creatures can survive in this region regardless of defenses, but this is the home of such creatures as the [Radiance] and the [Hounds of Tindalos].",
              ":titles",
              "Tindalos"
            ),
            ":Wyver",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Wyver",
              ":summary",
              "* Wyver is the Creator Being that manifests as a mirror dimension reflecting the world of order.\n* Travel - Creatures of order can enter Wyvr through any reflective surface.",
              ":titles",
              "Weaver"
            ),
            ":Wyld",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Wyld",
              ":summary",
              "* Wyld is the Life Bringer Being that manifests as a mirror dimension reflecting the natural world. It is thought that Wyld is the source of all life.\n* The Wild has stunning natural beauty, but is also a merciless place dominated by natural selection.\n* Travel - Natural creatures can enter Wyld through any reflective surface.",
              ":titles",
              "Manitou, Wellspring"
            ),
            ":Wyrm",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Wyrm",
              ":reference",
              "* Sitting in a bunker, here behind my wall. Waiting for the worms to come. In perfect isolation, , here behind my wall. Waiting for the worms to come. Waiting, to cut out the dead wood. Waiting, to clean up the city. Waiting, to follow the worms. Waiting, to put on a black shirt. Waiting, to weed out the weaklings. Waiting, to smash in their windows and kick in their doors. Waiting, for the final solution to strengthen the strain. Waiting, to follow the worms. - Waiting for the Worms, Pink Floyd",
              ":summary",
              "* Wyrm is the Time/Destructor Being that manifests as mirror dimension reflecting the world of entropy and  and corruption. Corrupted creatures can enter Wyrm through any reflective surface."
            )
          )
        ),
        "Lower Realms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Lower Realms",
          ":summary",
          "* Those places closest to the very beginning and the final end of the universe.",
          ":titles",
          "Under Realms",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            ":Oblivion",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Oblivion",
              ":reference",
              "* Leviathan - Hellraiser II\n* The Great Evil - The Fifth Element",
              ":summary",
              "* At the end of the Universe, lies a metaphysical Black Hole, the Anti-Sun: Oblivion.\n* It is null, ultimate order, ultimate death, the beginning and the end of the Universe.\n* Few living beings have managed to survive being close enough to see Oblivion.\n* As the [Underworld] is in many ways the reverse of the living world, Oblivion hangs above the [Underworld] like a massive Sun. Unlike a sun, however, Oblivion devours light and steals warmth. What little light and warmth that exists in the [Underworld] seeps instead from the land of the living.\n* Some believe that through Oblivion lies rebirth, but few are willing to personally put that theory to the test, and none who enter has ever returned.",
              ":titles",
              "Abyss, End of All Things, Heat Death of the Universe, Lakhesis, Order, Pattern, Primal Destroyer, Primal Void, The End"
            ),
            "Source, The",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Source, The",
              ":reference",
              "...I started with loathing when told of the monstrous nuclear chaos beyond angled space which the Necronomicon had mercifully cloaked under the name of Azathoth. - The Whisperer in Darkness",
              ":summary",
              "* The Source is the bubbling font at the beginning of existence. It lies at the opposite end of all existence from [Oblivion]. The Source is bursting with the densely packed proto matter/energy of all creation in the septillionth of a second before exploding into all realities. It is also, necessarily, the most destructive place in all existence.\n* Sublime - Those who somehow survive entering the Sublime find a very different existence. Where our multiverse is a vast empty space containing trace motes of dust, the Sublime is an endless fountain of possiblities. Everywhere you gaze, the Sublime offers a kaleidescope of intriguing details. Even infinity is meaningless where time, distance, and reality cease to matter.\n* Sublimating - Nothing physical can survive exposure to the Source, but it is possible to transcend the physical and enter Source. This is called Sublimating. There are many magical, spiritual and technological ways to enter the Sublime and entire civilizations have done so. Any who enter the Sublime begin to expand themselves. Absorbing and evolving with each eternal instant. Almost none who enter ever returns regardless of promises or bonds. The few that have returned are very different and almost always quickly return to the Sublime. After being exposed to the endless possiblities of existence, perhaps they no longer see the our existence or our way of understanding our existence as real or important anymore.",
              ":titles",
              "Ascension, Azathoth, Atropos, Apep, Apophis, Jormungand (Midgard Serpent), Primal Chaos, The Beginning, The Big Bang, The First Thing, Truth, Sublime"
            ),
            "Tempest, The",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Tempest, The",
              ":reference",
              "* The Galactic Barrier - Star Trek",
              ":summary",
              "* The final line before ultimate chaos. A swirling mass of chaos and fear on the border of annihilation.\n* Like a Black Hole, [Oblivion] has a swirling event horizon at its surface. It is the interface between substance and nothingness.\n* The [Tempest] is a sea of souls and madness. The dreams and memories of those lost within sometimes drift like flotsam in the Tempest.\n* The Tempest usually manifests as an roiling ocean, sometimes of water, sometimes of blood or souls.\n* It is rare to see the Tempest calm except in the presence of a [Ferryman].\n* Often it is a storm-tossed sea of towering waves and shrieking winds. Fog, foam, and spray obscures vision and rips the words from ones mouth.\n* Harrowing - [Wraiths] that are destroyed, fall into the sky toward [Oblivion]. Before entering [Oblivion] they pass through the Tempest and find themselves tested. The test is called a [Harrowing] and is always a spiritual confrontation with the [Wraith]'s own weakness. If the [Wraith] passes the test, it will find it has regained the strength to return to the [Underworld]. If it fails, it falls finally and eternally into the cold embrace of [Oblivion]. The appearance of the Tempest during a Harrowing is ever-changing: a drafty dripping dungeon with flagstones and chains, a subway tunnel with flickering buzzing fluorescent lights, a rough-hewn tunnel of sickly pink marble shot through with black veins.\n* Regardless of where one enters, all its twisting maze-like tunnels lead in the same direction: toward the dark heart of [Oblivion].",
              ":titles",
              "Event Horizon, The Great Barrier, The Edge of the World"
            ),
            ":Underworld",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Underworld",
              ":summary",
              "* The Underworld is a psychic realm of the dead. Similar to the [Dreaming], the Underworld is a Spiritual not a physical place.\n* Appearance - The Underworld seems like an inverted version of the living world. Initially, it appears as a dark, barren landscape with a large, black sun hanging in a cloudy, night sky. On further inspection, however, the dark sun is a black hole, the clouds are floating landscapes, and the night sky is the distant opposite side of what appears to be a hollow world with the black hole in the center.\n* Oblivion - The black hole at the center of the Underworld is [Oblivion], slowly drawing in everything to a final destruction.\n* Terraces - The floating landscapes are formed of spiritual flotsom from ages of dissolved dead. They slowly spiral upward eventually becoming the accretion disk of [Oblivion]. The higher one travels upward the more chaotic and intense the environment becomes until it becomes the [Tempest].\n* Falling - Spirits may travel freely on any surface in any orientation, but 'gravity' is always toward [Oblivion], so things not touching the 'ground' slowly fall upward with increasing speed.\n* Shadowland - Holes in the ground lead through long tunnels to the [Shadowland] above. Those who have lost their connections to their old lives (their fetters) will find that all the tunnels lead back to the Underworld.\n* Time - Time in the Underworld is distinctly different from the living world. Long periods can pass for some while little time has passed for others. Either way, little time passes in the living world compared to the ages that can seem to pass in the Underworld.",
              ":titles",
              "Netherworld, Netherrealm, Netherverse, Underrealm, Underverse"
            ),
            "Void, The",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Void, The",
              ":summary",
              "* The Void is an empty Realm between Realms. It is the Spiritual equivalent to outer space.\n* The Void is a realm of nothingness and contains no matter, energy, atmosphere, magnetism, inertia, gravity, or any other force.\n* Light, sound, and heat do not exist in the Void, but those with Spirits can see and hear normally. They also experience no discomfort despite the harsh conditions. Those without Spirits are blind, deaf, and lost in the endless void.\n* Attributes - Those with Spirits appear as idealistic versions of themselves in the Void. Body, Mind, Spirit, and Speed are increased to the higher of their Mind or Spirit.\n* Speed - As light and inertia do not exist in the Void, vessels may move much faster than light. Those with Spirits may move at astronomical speeds and can move at the equivalent of [Mind] or [Spirit] x 1 Light Day per second.\n* Void Ships - Ships created to travel between the realms. Note: physical travel into the Astral Realm by magical means may only be performed without observers.",
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
                      nx_tactics_base.t_location,
                      ":tag",
                      "unit"
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
                          nx_tactics_base.t_location,
                          ":tag",
                          "unit"
                        ),
                        ":severity",
                        2
                      )
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
                          nx_tactics_base.t_location,
                          ":tag",
                          "unit"
                        ),
                        ":severity",
                        2
                      )
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
                          nx_tactics_base.t_location,
                          ":tag",
                          "unit"
                        ),
                        ":severity",
                        2
                      )
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
                          nx_tactics_base.t_location,
                          ":tag",
                          "unit"
                        ),
                        ":severity",
                        2
                      )
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
                          nx_tactics_base.t_location,
                          ":tag",
                          "unit"
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
        "Outer Realms",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Outer Realms",
          ":reference",
          "Event Horizon",
          ":summary",
          "* These are the various part of the Spirit Realm where demons live. It is unclear whether these worlds are in distant parts of our dimension or in other dimensions entirely. They are certainly so distant that only dimensional travel can reach them.\n* Physics are often radically different from our own which often is sanity threatening.",
          ":titles",
          "Abyssal Realms, Chaos Realms, Demon Realms, Hells",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            "Hell of Being Cut to Pieces",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell of Being Cut to Pieces",
              ":summary",
              "* Souls who arrive here fall into a sea of razor-sharp blades that spin and cut sinners to shreds.\n* Souls - The domain is a place for those who make a living by violence."
            ),
            "Hell of Being Skinned Alive",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell of Being Skinned Alive",
              ":summary",
              "* If there is a worse place, no one has yet found it. At a glance it appear as a desert world, but it is infinitely worse. The winds have sculpted the rocks and mesas into horrifying shapes. Those who can see through the sandstorms can see demonic forms torturing souls, but their screams are covered by the winds.\n* The howling winds that forever whip across the red sands are enough to strip flesh from bone. Shards of glass and metal blown on these sonic-velocity winds can penetrate tank armor.\n* The winds frequently become funnel clouds sucking sand and souls miles up before letting them plummet onto the jagged rocks below.\n* The constant motion of wind and sand builds up electric charge, and victims are regularly subjected to bolts of lightning.\n* At first, the winds only flay only the body, but the worst is yet to come. Once flesh and muscle fall from the bones, the very essence of his being begins peeling off, layer by layer to be carried off in the winds. The only peace is when the winds subside, and the flayed bodies regenerate in these precious seconds. But once the pain begins to subside, the winds start howling again...\n* Souls trapped here are often those who hoarded and abused power. Such individuals are tormented after death by having everything ripped from them.\n* Tou Mu - The Yama King, Tou Mu, watches from her enormous upside-down palace high in orbit. Those that the Iron Empress takes note of are drawn up by the winds to the cold silent vacuum above. There she expresses her dissatisfaction personally.\n* Silent Stronghold - Her orbiting palace is where her allies stay, but as Tou Mu is paranoid, the crystal of this place renders unguarded thought into sound which echoes throughout the palace.\n* Sinister Fortress - One of the few structures on the surface of this hell, this iron fortress courses with the lightning that constantly strikes it. On the outer walls are lashed the bodies of those that Tou Mu has taken a special interst. Here they are constantly torn by winds and struck by lightning. The Iron Empress has never removed a victim from the wall since the first traitor was lashed there."
            ),
            "Hell of Boiling Oil",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell of Boiling Oil",
              ":summary",
              "* The name of this hell is a misnomer. The hell is not filled with boiling oil, but rather with rendered human fat. Gobbets of charred and burning fat float atop the ocean of thick, bubbling grease. A dark gray froth of overcooked scum floats to the surface in places.\n* The atmosphere is hazy with brown smoke and a fine mist of grease. The stench is intolerable. Individuals who manage to survive vomit uncontrollably. Those few who manage to leave this realm never entirely rid themselves of the smell.\n* This hell is the place of torment for the gluttonous. Corpulent executives and rotund bureaucrats are haunted by the excesses of their lives.\n* Ruler - This realm is ruled by Hluh, an island-sized, gelatinous, bright red jellyfish with sharp-toothed sucker mouths on each tentacle.\n* Devils - The devils of this have no names, no faces, and no sense of self. They realm resemble chitinous tapeworms or gigantic water striders that skim acoss the surface of the boiling sea."
            ),
            "Hell of Burrowing Maggots",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell of Burrowing Maggots",
              ":summary",
              "* A quick glance reveals this place to be a vast plain of white sand. There is no sun, but the overcast sky is not dark. The sand, however, is crawling. The stench of decay staggers any so unfortunate as to need to breathe.\n* Souls - This is a place of torment for sinners who have met their end by disease including radiation poisoning, cancer, and biological warfare. Boils and tumors grow enormous here and hang from the body and attract the maggots. Within days a soul can feel her skin crawl. Everywhere the worm-ridden souls cry out, tearing at their skin, and vainly trying to escape the worms that are eating them alive.\n* Ruler - Rangda, the Mistress of Pestilence rules here.\n* Demons - Maggots grow larger as they age. The largest of them are the size of a whale.\n* The Great Beast - What appears to be a large white mountain is actually an enormous carcass of an unknown beast. The maggots have been devouring it since the hell was created, and it appears it will take an eternity to complete the job. What the beast is is unknown. Some believe it is tied to creation and the the universe will cease when it is comsumed. A foolish mage once studied it from a distance, but days later he returned screaming gibberish and only said two coherent words before he took his own life: 'It moved.'"
            ),
            "Hell of Seven Burning Seas",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell of Seven Burning Seas",
              ":summary",
              "* If would be hard to chose a worse fate, burning or drowning. Those souls doomed to this hell do both. They may stay above water and have their garments burst into flame or submerge and boil themselves.\n* Souls - This hell houses sinners whose crimes involve the water. Pirates, polluters, mutineers, and murderers who drowned their victims are drawn here.\n* Ruler - No one has seen the Empress of Pearls who is rumored to live at the greatest depths of the Great Trench where no other creature can survive. Some believe she is a great 'devil-fish' that can cause tsunamis.\n* Devils - Devil crabs, devil sharks, and devil squid are some of the horrors that populate the depths."
            ),
            "Hell of Upside-Down Sinners",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell of Upside-Down Sinners",
              ":summary",
              "* This domain defies description. This is either the cleverest of the Yomi realms or the maddest hell devised by the sickest of minds. Time and space are inverted. Sensation and thought are twisted. Minutes pass like an eternity and millenia rush by in a blink of an eye. In this hell, the strong perish and the weak survive. That which is dull cuts while sharp objects bring comfort.\n* Souls - Recent arrivals are often driven mad as they begin to see odors, smell sounds, and hear sights. Emotions too become jumbled. Souls begin to hate those who helped them and love those who have done them wrong. They fear the helpless and refuse to flee certain destruction. Skills and powers do not work correctly here. The stronger the ability the more ineffectual it is.\n* Ruler - No one knows what inconceivable creature would create such a realm."
            ),
            "Hell: Kakuri, The Night Realm",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell: Kakuri, The Night Realm",
              ":summary",
              "* There is no end to the darkness in the Night Realm. There is no sun, no stars. The winds are bitterly cold, bearing dagger-sharp ice crystals. Facing into the wind is blinding. Fires flicker and die in the winds, but any light attracts the tormented and Shikome alike. The terrain is rocky and frozen black crystal that leech the energy of those who rest on them. Meadows and tree exist, but they are covered with dark crytal blades that tear at passersby.\n* Kakuri is the hell of those who have lost their honor. The land is therefore the anti-thesis of honor. There are no great battles, no great challenges, no bragging enemies. There is no duty, no honor, and no way to escape. There are no flesh eating devils, no pits of burning oil, no grand ministries of torment. In a land without hope, there don't need to be.\n* Ruler: Emma-o, perhaps the greatest of the Yama-kings.\n* Shikome: Beautiful, cold, female devils that delight in speeding their victims to despair. They are subtle and can appear as tormented souls or as friends or lovers. Whatever their form, they will drain the [Spirit] from their victims leaving them to wander in hopelessness and despair.\n* Kyuden No Kakuri - The Castle of Kakuri is the stronghold of Emma-o.  It is situated at the top of an unassailable peak. The castle has elaborate obsidian walls and are a testament to his vanity and conceit.\n* Cave of Maidens - One of Emma-o's favored traps, the caves appear an oasis from the icy torment and occasionally a way out of Yomi. Edible fungi, shelter, and pretty prisoners can be found in the caves. The prisoners will dote on the visitors, but they will suddenly accuse them of theft, rape, murder, or worse. The visitors are beaten and driven from the caves. The power of the Shikome lets them trick their victims again and again with the lure of false hope. Amazingly, there is actually a chance that a cave is actually an exit from the Hell, the ultimate lure for lost souls."
            ),
            "Hell: Pit of Iron and Salt",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell: Pit of Iron and Salt",
              ":summary",
              "* The Pit is a vast salt mine with seemingly no bottom. Iron citadels dot the inside of the pit, so the pit resembles a great gaping maw with the citadels resembling teeth. The landscape is unchanging and sterile. It is not a place of shock or disgust, but a hell of quiet oppression.\n* Souls - Those who labor here do so in the false hope that through hard work they will eventually be relieved of their suffering. They search for treasure they will never find beneath the lashes of cruel overseers.  Cuts and lashes are inflamed by the salt everywhere.\n* Ruler - Yama-king Wu Hua lives at the the bottom of the pit in a great iron city surrounded by six enormous barbed spires on which hundreds of bodies are impaled. Sputtering greenish fires can be seen from a distance that hint at grotesque rituals and obscene torments, but what exactly goes on inside is unknown.\n* Iron Citadels - The citadels are places of decadence and depravity. The souls are intermittently rotated from the mines to the citadel to act as slaves. Most mine workers view the change as desirable, but every soul chosen learns that this is not the case. In reality, the souls are treated worse here than anywhere else in the domain. Their suffering is more valuable to Wu Hua because it is so much more 'personal'."
            ),
            "Hell: Wicked City",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Hell: Wicked City",
              ":summary",
              "* Wicked City is a place of endless urban blight stretching to the horizon in all directions. The perpetually overcast air is dark and thick with acrid vapors and burning smog. The stench of urine, vomit, blood, and excrement blows out of every alley. The streets and buildings are packed with the souls who mindlessly slave away in inescapable agonies and the power-mad demons who torment them.\n* Souls - This hell is the destination of those who have fallen into the corruption, isolation, and anoymity of urban life. Politicians, artists, criminals, wage slaves, executive, and police are pulled into the sweat shops and dark streets of this doomed megalopolis. The souls are worked beyond their limits, and when they falter or fail the foremen arrive instantly to punish them for their incompetence. Their routine jobs continue day after day with no hope of improving their lot, and their pitiful wages allow them to almost support themselves. Those that fail to keep up are laughed out of their offices and become the homeless of Wicked City, available for demons and embittered salary drones to beat, torture, or set ablaze. There are no safe places in Wicked City. Every coworker could be a demon. Even the doomed may betray each other for advancement. It is a place where the worst elements of greed and capitalism meet.\n* Ruler - The Yama-king Mikaboshi rules this realm from the Mikaboshi Tower. The tower is a hideous tower of blackened steel and glass whose peak disappears into the clouds. Mikaboshi's executives administer Wicked City from this lofty tower, and Mikaboshi himself is often linked directly into the tower's strange devices allowing him to see, hear, and feel any part of Wicked City.\n* Undercity - The twisted spires are built atop the crumbling temples and castles of eras past. The cities are built upon cities upon cities, and the farther down one goes, the more monstrous the demonic inhabitants. Some creatures have not seen the sky in centuries. What these monsters have become is unknown, but no one who has entered the abandoned tunnels and subways has returned sane (if they return at all).\n* Feng Shui - The Yama-king Mikaboshi wants all those who see his city to understand his grand vision of a hellish metropolis. He undermines the known and comfortable trapping of the daily world to increase his subjects' feelings of dread and suffering, and his power over them. The feng shui of the Wicked city is beyond negative, bordering on the impossible. The entire landscape assaults the Chi of the city's victims. 'Poison Arrows' point everywhere, spiraling in directions that cause veritgo from the merest glance. Disharmony saps the will and impedes rational thought.\n* Gates - It is possible to travel to Wicked City from many of the worst urban hellholes in the mortal world. In these places of corruption and anguish, the [Veil] is weak. The door also swings both ways and denizens of this hell sometimes travel to the mortal realm in search of new souls."
            )
          ),
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Pandemonium",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Pandemonium",
              ":reference",
              "* Dante's Inferno",
              ":summary",
              "* Pandemonium (literally the Place of All Demons), the capital of Hell, the High Capital, of Satan and his Peers, built by the fallen angels at the suggestion of Mammon. The demons built it in about an hour, but it far surpassed all human palaces or dwellings. It was also reputed to be made of solid gold.",
              ":titles",
              "Pandaemonium, Place of All Demons",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "Council-Chamber of Pandæmonium",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Council-Chamber of Pandæmonium",
                  ":summary",
                  "* The Stygian Council debates here."
                )
              )
            ),
            ":Phyrexia",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Phyrexia",
              ":reference",
              "* We must improve! We must evolve! - Victor, Runeterra\n* Metal is perfection. - Victor, Runeterra",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Yawgmoth",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Yawgmoth",
                  ":titles",
                  "Father of Machines, Ineffable"
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
   * @function chapter_story_ideas
   * @return {chapter}
   */
  static t_chapter_story_ideas = {
    vx_type: vx_core.t_type
  }
  static e_chapter_story_ideas = {
    vx_type: nx_tactics_books_fantasy.t_chapter_story_ideas
  }

  // (func chapter_story_ideas)
  static f_chapter_story_ideas() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Story Ideas",
      ":summary",
      "* Accompany zealots on a pilgrimage to holy places.\n* Participate in a Witch Hunt in the forests.\n* Protect an individual of status from the assassin's guild.\n* Go on patrol with Knife Fighters\n* Sail to obtain concubines, either legally or illicitly. Be wary of the creatures and brutish males, to say nothing of the subtle charms of the concubines themselves.\n* Join the desert scouts in raids against the Black Mystics.\n* Commission tomb raiders to unearth ancient sarcophagi.\n* Sail the far seas in search of adventure, braving corsairs, cannibals, sea serpents, and the black hulled vessels of the Necromancers.\n* Mine green crystal from the Sea of Glass.\n* Visit Sactuary the safe haven of thieves and scoundels.\n* Prowl the jungles looking for rare herbs and black diamonds.\n* Rescue a captive of the Witchmen who keep shrunken heads as grisly trophies.\n* Visit the Ice Castles of the north and fight side by side against the Ice Giants.\n* Trade with the Sea Nomads of Oceanus, a city that floats freely on the water.\n* Take a windship to the isle of Phantas and visit the Cabal Magicus, home of the Phantasian Dream Merchants.\n* Travel to the Jade Empire and visit the capital Tian called the Golden City for good reason.\n* Hire a guide and search for the buried city of Necron where legend has it an entire city and its populace were once interred.\n* Visit the magical fair, a gala festival attended by magicians, wizards, and charaltans from across the continent. Engage in a duel for wagers with a reknowned spell caster or haggle for potions, powders, and other rare items.\n* Negotiate a deal with a Zuran moneylender to finance an expedition in return for a cut of the profits.\n* Attend the Festival of the Bizarre where individuals display oddities and compete in the contest for the title of 'Most Bizarre'.\n* Accompany a Wizard Hunter on a quest of revenge.\n* Partake in the 'Night of Fools' when all laws are suspended for a single evening.\n* Help locate a suitable applicant for the Battle of Champions or enter the competition yourself."
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
    vx_type: nx_tactics_books_fantasy.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Fantasy",
      ":image",
      "DaveDormanEasternTerritories.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Fantasy Overview",
        nx_tactics_books_fantasy.f_chapter_fantasy_overview(),
        "Genshin Impact",
        nx_tactics_books_fantasy.f_chapter_genshin_impact(),
        "God of War",
        nx_tactics_books_fantasy.f_chapter_god_of_war(),
        "Lord of the Rings",
        nx_tactics_books_fantasy.f_chapter_lord_of_the_rings(),
        "Nexus Fantasy Characters",
        nx_tactics_books_fantasy.f_chapter_nexus_fantasy_characters(),
        "Material Realm",
        nx_tactics_books_fantasy.f_chapter_material_realm(),
        "Realms Beyond",
        nx_tactics_books_fantasy.f_chapter_realms_beyond(),
        "Story Ideas",
        nx_tactics_books_fantasy.f_chapter_story_ideas()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_fantasy_overview": nx_tactics_books_fantasy.e_chapter_fantasy_overview,
      "chapter_genshin_impact": nx_tactics_books_fantasy.e_chapter_genshin_impact,
      "chapter_god_of_war": nx_tactics_books_fantasy.e_chapter_god_of_war,
      "chapter_lord_of_the_rings": nx_tactics_books_fantasy.e_chapter_lord_of_the_rings,
      "chapter_material_realm": nx_tactics_books_fantasy.e_chapter_material_realm,
      "chapter_nexus_fantasy_characters": nx_tactics_books_fantasy.e_chapter_nexus_fantasy_characters,
      "chapter_realms_beyond": nx_tactics_books_fantasy.e_chapter_realms_beyond,
      "chapter_story_ideas": nx_tactics_books_fantasy.e_chapter_story_ideas,
      "tacticsbook": nx_tactics_books_fantasy.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_fantasy_overview": nx_tactics_books_fantasy.t_chapter_fantasy_overview,
      "chapter_genshin_impact": nx_tactics_books_fantasy.t_chapter_genshin_impact,
      "chapter_god_of_war": nx_tactics_books_fantasy.t_chapter_god_of_war,
      "chapter_lord_of_the_rings": nx_tactics_books_fantasy.t_chapter_lord_of_the_rings,
      "chapter_material_realm": nx_tactics_books_fantasy.t_chapter_material_realm,
      "chapter_nexus_fantasy_characters": nx_tactics_books_fantasy.t_chapter_nexus_fantasy_characters,
      "chapter_realms_beyond": nx_tactics_books_fantasy.t_chapter_realms_beyond,
      "chapter_story_ideas": nx_tactics_books_fantasy.t_chapter_story_ideas,
      "tacticsbook": nx_tactics_books_fantasy.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/fantasy",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_fantasy_overview)
    nx_tactics_books_fantasy.t_chapter_fantasy_overview['vx_value'] = {
      name          : "chapter_fantasy_overview",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_fantasy_overview
    }

    // (func chapter_genshin_impact)
    nx_tactics_books_fantasy.t_chapter_genshin_impact['vx_value'] = {
      name          : "chapter_genshin_impact",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_genshin_impact
    }

    // (func chapter_god_of_war)
    nx_tactics_books_fantasy.t_chapter_god_of_war['vx_value'] = {
      name          : "chapter_god_of_war",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_god_of_war
    }

    // (func chapter_lord_of_the_rings)
    nx_tactics_books_fantasy.t_chapter_lord_of_the_rings['vx_value'] = {
      name          : "chapter_lord_of_the_rings",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_lord_of_the_rings
    }

    // (func chapter_material_realm)
    nx_tactics_books_fantasy.t_chapter_material_realm['vx_value'] = {
      name          : "chapter_material_realm",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_material_realm
    }

    // (func chapter_nexus_fantasy_characters)
    nx_tactics_books_fantasy.t_chapter_nexus_fantasy_characters['vx_value'] = {
      name          : "chapter_nexus_fantasy_characters",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_nexus_fantasy_characters
    }

    // (func chapter_realms_beyond)
    nx_tactics_books_fantasy.t_chapter_realms_beyond['vx_value'] = {
      name          : "chapter_realms_beyond",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_realms_beyond
    }

    // (func chapter_story_ideas)
    nx_tactics_books_fantasy.t_chapter_story_ideas['vx_value'] = {
      name          : "chapter_story_ideas",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_chapter_story_ideas
    }

    // (func tacticsbook)
    nx_tactics_books_fantasy.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/fantasy",
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
      fn            : nx_tactics_books_fantasy.f_tacticsbook
    }

  }
}