'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_horror {

  /**
   * @function chapter_call_of_cthulhu
   * @return {chapter}
   */
  static t_chapter_call_of_cthulhu = {}
  static e_chapter_call_of_cthulhu = {vx_type: nx_tactics_books_horror.t_chapter_call_of_cthulhu}

  // (func chapter_call_of_cthulhu)
  static f_chapter_call_of_cthulhu() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Call of Cthulhu",
      ":reference",
      "* Premise that common human laws and interests and emotions have no validity or significance in the vast cosmos-at-large... To achieve the essence of real externality, whether of space or time or dimension, one must forget that such things as organic life, good and evil, love and hate, and all such local attributes of a negligible and temporary race called mankind, have any existence at all.",
      ":summary",
      "* Most of the intelligent Mythos creatures are masters of [Necromancy] and have long ago reanimated their physical bodies into part physical/part spiritual forms that humans would call [Undead].\n* Like [Undead], they exist partially in the [Spirit Realm], are immune to most hostile environments, and appear blurry in photograph and other recordings.\n* If their body is destroyed, their Spirit leaves the body and enters the [Spirit Realm] fully. Their bodies age will rapidly catch up to it usually causing it to deteriorate rapidly. Normally their spirit never returns to the physical world, but if they are powerful enough, they may find their way back through the Veil and even death may not stop them from returning.",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Mythos Places",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mythos Places",
          ":locationmap",
          vx_core.f_new(
            nx_tactics_base.t_locationmap,
            ":Carcosa",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Carcosa",
              ":reference",
              "* ... my eyes became riveted to the open page, and with a cry of terror or perhaps it was of joy so poinant that I suffered in every nerve... I read it and re-read it and wept and laughed and trembled with a horror which at times assails me yet. This the thing that troubles me, for I cannot forget Carcosa. Where black stars hang in the heavens. Where the shadows of men's thoughts lengthen in the afternoon. ... I pray God will curse the writer as the writer has cursed he has cursed the world with this beautiful stupendous creation. Terrible in its simplicity, irresistible in its truth, a world which now trembles before the King in Yellow. - Robert W. Chambers, The Repairer of Reputations",
              ":titles",
              "Lost Carcosa"
            ),
            ":R'yleh",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "R'yleh",
              ":image",
              "Cthulhu/Ryleh.jpg",
              ":reference",
              "That is not dead which can eternal lie, And with strange aeons even death may die."
            ),
            ":Yaddith",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Yaddith"
            ),
            ":Yuggoth",
            vx_core.f_new(
              nx_tactics_base.t_location,
              ":name",
              "Yuggoth"
            )
          ),
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            ":Dreamlands",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Dreamlands",
              ":reference",
              "* Dream Quest of Unknown Kadath\n* But some of us awake in the night with strange phantasms of enchanted hills and gardens, of fountains that sing in the sun, of golden cliffs overhanging murmuring seas, of plains that stretch down to sleeping cities of bronze and stone, and of shadowy companies of heroes that ride caparisoned white horses along the edges of thick forests; and then we know that we have looked back through the ivory gates into that world of wonder which was ours before we were wise and unhappy. - Celephais",
              ":summary",
              "* The Dreamlands is a vast [Dreamworld] that is a favorite of many Earth dreamers. Experienced dreamers are among the most powerful inhabitants of the Dreamlands and some become permanent residents after their physical deaths.\n* To reach the Dreamlands, a sleeper must find an unusual stairway in a conventional dream and walk down the Seventy Steps of Light Slumber to face the judgment of powerful gatekeepers named Nasht and Kaman-Tha. If judged worthy (that is, able to survive the dangers of the Dreamlands), the dreamer is allowed to descend the Seven Hundred Steps of Deeper Slumber and emerges in the Enchanted Wood.\n* When entering the Dreamlands this way, the person leaves his or her physical body safely in the waking world. If the dreamer is killed during his or her travels, the person's corporeal body will suffer only a shock. Sometimes, however, this can be fatal - dream death of this kind makes return to the Dreamlands impossible. Waking up causes a person's dream self to disappear; thus the individual may have difficulty recalling anything learned or experienced while asleep (similar to conventional dreaming). A dreamer who dies in the real world while his dream self is still alive may have the option of retiring to the Dreamlands for the remainder of his dream self's 'life.'\n* The Dreamlands can be entered in other ways, including physically. This usually requires passing through very dangerous areas of both the waking world and the Dreamlands. Consequently, real death becomes a risk. However, the visitor does receive the prolonged lifespan of a native of the Dreamlands, so the traveler's time there is no longer limited to the duration of a night's sleep on earth.\n* Time flows at a different rate in the Dreamlands - each hour on earth represents a week or more there. Consequently, a traveler can spend months in the Dreamlands during a single night's sleep on earth. Fortunately for dreamers, inhabitants of the Dreamlands are either long-lived or immortal, provided they avoid injury or disease.\n* Despite its accelerated time, the Dreamlands rarely experiences change.  Its geography, politics, and population remain fairly static.  Dreamers, however, can exert great change over the topography, such as by creating entire cities with accompanying populations.\n\nGeography\n* The West is the most well-known region of the Dreamlands and is probably the most inhabited as well. It is where dreamers emerge from the Steps of Deeper Slumber. The port of Dylath-Leen, the largest city of the Dreamlands, lies on its coast. The town of Ulthar, where no man may kill a cat, is also located here. Other important cities are Hlanith (a coastal jungle city) and Ilarnek (a desert trade capital). The land of Mnar and the ruins of Sarnath are found at the southern border. The Enchanted Wood of the zoogs is also found here. It joins the South.\n* The South is the southern coastal region of the continent shared by the West along with the islands of the Southern Sea, including the isle of Oriab, the largest. The South's land-locked regions and its coastal areas are known as the Fantastic Realms, because they contain nightmarish and sometimes incomprehensible zones. Otherwise, the islands of the Southern Sea are fairly normal.\n* The East is a continent that is largely uninhabited, except for Ooth-Nargai. The city of Celephais the capital of Ooth-Nargai and was created from whole cloth by its monarch King Kuranes, the greatest of all recorded dreamers. Beyond Ooth-Nargai are The Forbidden Lands, dangerous realms into which travel is interdicted.\n* The North is a cold, mountainous continent notorious for its Plateau of [Leng], a violent region shared by man-eating spiders and satyr-like beings known as the &quot;Men of Leng&quot;. The North also has a number of friendlier places, such as the city of Inganok, famous for its onyx quarries. The deepest reaches of the North are said to hold Unknown [[Kadath]], the home of the Great Ones.\n* The Underworld is a subterranean region that runs beneath the whole of the Dreamlands. Its principle inhabitants are ghouls, who can physically enter the waking world through crypts. The Underworld is also home to the gugs, monstrous giants banished from the surface for untold blasphemies. The Underworld's deepest realm is the Vale of Pnath, a dangerous lightless chasm inhabited by enormous unseen beasts called bholes. Bholes are likely the ancestors of the Dholes of Yaddith.\n* The Moon has a parallel in the Dreamlands and is inhabited by the dreaded moon-beasts, amorphous frog-like creatures allied with Nyarlathotep. Interestingly, it is possible for a ship to sail off the edge of the Dreamlands and travel through space to the moon.\n* Kadath - Kadath or Unknown Kadath is the dwelling place of the Great Ones. It is a gigantic castle found atop an immense cosmic mountain in the Cold Waste.  Kadath is the place where the dreamlands gods dwell, but it is inaccessible to mortals because the gods do not want to be bothered.",
              ":locationmap",
              vx_core.f_new(
                nx_tactics_base.t_locationmap,
                "City of the Gugs",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "City of the Gugs",
                  ":summary",
                  "* The City of the Gugs is a colossal, horrifying cityscape of soaring, cyclopean towers. It is the dwelling place of the gugs, banished to the underworld by a covenant of the gods. Its most prominent landmark is the Tower of Koth, which contains a legendary stairway that leads to the surface.\n* Close by the city is the cemetery of the gugs, its graves marked by huge stone monoliths. Ghouls often dine here; a deceased gug feeds them for almost a year."
                ),
                "Crag of the Ghouls",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Crag of the Ghouls",
                  ":summary",
                  "* The Crag of the Ghouls is a rugged cliff in the Peaks of Thok from which the ghouls of deeper dreamland pitch the leftover bones of their sepulchral feasts. Uncounted miles below the crag is the bone-filled [Vale of Pnath]."
                ),
                "Great Abyss",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Great Abyss",
                  ":summary",
                  "* The Great Abyss is a realm that lies below the ruins of Sarkomand and is possibly a massive cavern that joins with all parts of the underworld. It connects with the upper Dreamlands by a stairway in Sarkomand.\n* The Abyss is ruled by the god Nodens, who is served by the night-gaunts. Nodens' influence seems very languid in the underworld and does not appear to extend much beyond the Abyss itself; except perhaps to Ngranek on the isle of Oriab, whose upper slopes are guarded by his night-gaunts."
                ),
                "Jungle of Kled",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Jungle of Kled",
                  ":summary",
                  "* Several abandoned ivory palaces are laid within Kled.\n* The perfumed Jungle of Kled can be reached by traveling North from the Enchanted Wood to Thran. At Thran a elephant caravan can be taken over land or a river boat can be taken to Hlanith where passage on a ship can be found to Kled."
                ),
                "Library at Ultar",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Library at Ultar",
                  ":summary",
                  "* Library at Ultar - The Library is a great circular stone building. It is\nenchanted and appears at different places in Ultar at different times, and it\nis impossible to find by accident.\n* Architecture - There is a central 200 foot dome filled with tables and\nchairs. The walls are covered with paintings and hallways radiate from the\nmain chamber. The room is lit by sunlight pouring through wide windows\noverhead. This sunlight never changes despite weather or time of day.\n* Hallways - The radiating spokes of hallways are lined with bookshelves and\ngo a long distance into darkness. Halls connecting the spokes appear every\n100 feet. The books are divided by subject but are then only organized by age\nwith newer books closer to the center. A light source is needed if one travels\ndown the corridors. After several hundred yards the parchment scrolls and\nconventional books give way to carved wooden, stone, clay, or metal plaques.\nBeyond these even more bizarre methods of information storing appear, formed\nfrom crystals, ghosts enslaved to repeat specific lore, huge bottles of\nsinister looking liquid that must be drank to obtain the knowledge, and so\nforth. The languages used become more alien, and dreamers may encounter\nSerpent People or Elder Things in the very distant past.\n* Librarian - In the center of the dome can be found the desk of the\nlibrarian, Tukor. Tukor is a normal man from Ultar and can find most of the\nrecent books from memory.\n* Paintings - The paintings in the room have a variety of subject matter.\nSome are famous characters. Others are bizarre - panoramas of endless\ncemeteries, twisted trees hung with countless skulls, dinosaurs stalking\nruined cities. One is a portrait of a scientist or physician in the grisly\nact of dissecting himself with a scalpel and examining his organs under\nmagnification. The entire scene is splashed with blood, and below the\npainting is a metal bucket collecting the occasional drops of blood that fall\nfrom the painting."
                ),
                "Peaks of Thok",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Peaks of Thok",
                  ":summary",
                  "* The Peaks of Thok (or Throk) is a frightening range of towering granite\nmountains in the underworld."
                ),
                "Stony Desert",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Stony Desert",
                  ":summary",
                  "* The desert is a bleak and barren waste, dull gray in color, and lit by a\nglaring sun. Huge slabs of shattered stone lie everywhere. No sign of life is\nvisible.\n* The Stony Desert lies north-west of Ultar. At the south end of the desert\nrises the mountain of the gods, Mt. Hatheg-Kla."
                ),
                ":Hatheg-Kla",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Hatheg-Kla",
                  ":summary",
                  "* Approach - Hatheg-Kla lies in the [Stony Desert] which is covered with\nbroken slabs of stone. As one approaches the mountain, smoe of the slabs are\nstill turned upright in the ground and bear traces of ancient carvings.\nSoon it becomes obvious that they are travelling in a titanic graveyard.\n* Description - This mountain rises like a rock statue in a silent temple.\nMists always surround the peak, for mists are the memories of the gods, and\nthe gods lived Hatheg-Kla when they dwelt upon it in the old days. Often the\ngods of earth visit in their ships of cloud.\n* Climbing - The climb up the mountain is made perilous by chasms, cliffs, and\nfalling stones. By night it is cold and snowy. Higher up the air grows thin,\nthough the mists grow thicker.\n* On the North-West side of Hatheg Kla, a cave can be seen 2000 feet up.\nTwo colossal statues flank the cave, and 1000 feet below the cave can be seen\na large dead tree with large birds flying about. The branchs are hung with\nmany white globes. On closer examination, the birds are Byahkee and the globes\nare human skulls."
                ),
                ":Ultar",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Ultar",
                  ":summary",
                  "* Ulthar - Ulthar is a pleasant city, well-known to dreamers for its ban on\nharming cats and the enormous number of cats that make Ulthar their home."
                ),
                "Vale of Pnath",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Vale of Pnath",
                  ":summary",
                  "* The vale of Pnath (or Pnoth) is a vast pit in the underworld. It is flanked\nby the Peaks of Thok and is mostly lightless. The vale is filled with a\nmountain-sized heap of bones and is the spot into which all the ghouls of\nthe waking world cast the refuse of their feastings. Enormous worm-like\ndholes burrow through the vale. Night-gaunts often carry helpless victims to\nthe vale, where they are left to die."
                ),
                "Vaults of Zin",
                vx_core.f_new(
                  nx_tactics_base.t_location,
                  ":name",
                  "Vaults of Zin",
                  ":summary",
                  "* The Vaults of Zin is a huge cavern in the underworld. It lies near the\ncemetery of the gugs and opens onto a large cave that is the mouth of vaults\nof Zin, and the vindictive ghasts are always on watch there for those\ndenizens of the upper abyss'. The ghasts who dwell in the Vaults of Zin prey\non ghouls and gugs, and sometimes even one another.\n* It is possible that a well in the monastery of the High Priest Not to Be\nDescribed in the Plateau of Leng connects with the Vaults of Zin."
                )
              )
            )
          )
        ),
        "Mythos Items",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mythos Items",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Book of Eibon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Book of Eibon",
              ":image",
              "Cthulhu/CthaatAquadingen.jpg",
              ":summary",
              "* The Book of Eibon is a work of the legendary magician Eibon of Mhu-Thulan. The book\nwas produced after Eibon's disapearance by his former aprentice Cryon of Varaad.\n* Contents -  The book deals with magic he practised, records of the area and\nhistorical acounts of other mages. It also contains records of the habits of Great Old\nOnes such as Abhoth, Atlach-Nacha, Rlim Shaikorth and Tsathoggua (the later being a\ndeity whom Eibon was particularly favored by). There is a limited amount of\ninformation on the Drowners; Bugg-Shash and Yibb-Tsll.\n* Spells - The Book of Eibon also contains a huge number of spells. Among them are the\nprocedures required to create a spatial gateway, numerous prayers to Tsathoggua, an\nincantation used to call one of the former's children to you, how to make protective\nsymbol effective against the servants of Nyarlathotep, a simple spell to raise a small\ncurtain of mist and a potent curse to cripple a foe. It is said that the early edition\ncontained a formula capable of calling a Dhole to Earth and controlling it.\n* Hyperborean Version - The original version was made by Cryon of Varaad who complied\nhis master's notes, journals and records into one volume. It was orignaly written on a\nform of vellum in the Hyperborean language of Tsath-Yo.\n* Atlantean Version - Later in prehistory stone Tablets containing the Hyperborean\ntext of the Book of Eibon were found by the Atlanteans. They were eventualy translated\nfrom there original Tsath-Yo into Atlantean Senzar by the High Priest Klarkash-Ton.\n* Kishitic Version - The Kishites made a translation in there langauge from the\nAtlanteans relics they unearthed. Information about this version of the book is\nsketchy at best.\n* Egyptian Version - Some copies of the Kisihtic edition where preserved on papyri and\ntranslated by the latter Egyptians into hieroglyphs. Tablets and tomb paintings\ncontaining these hieroglyphs may still exisit.\n* Libor Ivonis - In aproximately 900 AD a Latin translation known as the Libor Ivonis\nwas made by the monk Caius Phillippus Faber. It was finally printed during 1622 in\nRoman. This translation is over five hundred pages long.\n* Libre d'Ivon - In 1240 Gaspard du Nord of Aivonge translated his former teacher's\ncopy of the Libor Ivonis into French.\n* Book of Eibon - This english translation was made by an unknown author sometime\nbetween the fifthteenth and sixteenth centuries.",
              ":titles",
              "Liber Ivonis, Livre d'Eibon",
              ":classification",
              "Book"
            ),
            "Celaeno Fragments",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Celaeno Fragments",
              ":image",
              "Cthulhu/CelaenoFragments.jpg",
              ":summary",
              "225 million years ago, the stone tablets that become the Celaeno Fragments are scribed\naround the middle Triassic (presumably by Serpent People). One set of the tablets is\neventually taken to the Great Library of Celaeno, on the fourth planet around the star\nCelaeno.",
              ":classification",
              "Book"
            ),
            "Cthaat Aquadingen",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cthaat Aquadingen",
              ":image",
              "Cthulhu/CthaatAquadingen.jpg",
              ":summary",
              "* The Cthäat Aquadingen, possibly meaning Things of the Water, this text, by an\nunknown author, deals with Cthulhu and other sea-horrors, such as Inpesca. It also\ncontains many so-called Sathlattae, rituals and spells related to Ubbo-Sathla. It is\nfirst mentioned as appearing in northern Germany around 400 AD. A Latin version was\napparently written between the 11th and 12th century, as was an English translation\nthat appeared sometime in the 14th century.\n* The version found in the [Library at Ultar] is bound in soft, human skin, still\npliable, and always moist from perspiration welling from its pores. Simply handling\nthe book is creepy.",
              ":classification",
              "Book"
            ),
            "Cultes De Goules",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Cultes De Goules",
              ":summary",
              "* Cultes des Goules is a book of black magic written by Francois-Honore Balfour\n(Comte d'Erlette) in 1702. It was published in France and later denounced by the\nchurch. Only a handful of copies are in existence. One of the known copies was kept\nfor 91 years in an arcane library of the Church of Starry Wisdom in Providence, Rhode\nIsland. After Robert Blake’s mysterious death in 1935, Doctor Dexter removed the\ngrimoire and added it to his library.",
              ":classification",
              "Book"
            ),
            "De Vermis Misteriis",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "De Vermis Misteriis",
              ":image",
              "Cthulhu/DeVermisMisteriis.jpg",
              ":summary",
              "* De Vermis Mysteriis is the work of one Ludvig Prinn; a Flemish alchemist and\nsupposed sorcerer. Prinn had spent a great deal of time traveling in the east and\nclaimed to have obtained a great age through the use of his sorcery. Eventualy Prinn\nwas captured by the Inquisition and sentanced to death. While awaiting execution in\nhis cell he wrote the volume he called De Vermiss Mysteriis. How Prinn managed to have\nthe blasphemous manuscript smuggled past his captors is unknown.\n* Contents - The De Vermis Mysteriis is slightly over 700 pages long. It deals with\nsubjects such as Irim City of the Pillars, The Priesthood of Nephren Ka and the\navatars of Nyarlathotep worshipped in the east.\n* Spells - Part of the last chapter deals with a bizarre time drug that alters one's\nperception of time. It also contains instructions for creating the Pnakotic Pentangle.\nAnother of the later chapters entitiled the Saracenic Rituals, focuses on the\nsummoning and controlling other worldly beings. Other supposed spells include a ritual\nfor summoning a child of Shub-Niggurath, a formula for calling up the spirit from the\nremains of its corpse, and instructions on how to craft a certain symbol Prinn claims\nto be a powerful aid in banishing entities.",
              ":titles",
              "The Mysteries of the Worm",
              ":classification",
              "Book"
            ),
            "Elder Sign",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Elder Sign",
              ":image",
              "Cthulhu/ElderSign.jpg",
              ":reference",
              "H.P. Lovecraft (who had created the Elder Sign without ever describing what it looked\nlike) had drawn a picture of the Elder Sign in a letter. This branch-like image is\nconsidered by many to be the true Elder Sign."
            ),
            "Mi-Go Armor",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mi-Go Armor",
              ":image",
              "Cthulhu/MigoArmor.jpg",
              ":classification",
              "Med. Armor"
            ),
            "Mi-Go Brain Bottle",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Mi-Go Brain Bottle",
              ":image",
              "Cthulhu/BrainCase.jpg"
            ),
            ":Necronomicon",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Necronomicon",
              ":image",
              "Cthulhu/Necronomicon.jpg",
              ":reference",
              "* They walk unseen and foul in lonely places where the Words have been\nspoken... They bend the forest and crush the city, yet may not forest or city\nbehold the hand that smites... Great Cthulhu is Their cousin, yet can he spy\nThem only dimly. Iä! Shub-Niggurath! As a foulness shall ye know Them. Their\nhand is at your throats, yet ye see Them not; and Their habitation is even one with your\nguarded threshold... After summer is winter, after winter summer. They wait\npatient and potent, for here shall They reign again.",
              ":classification",
              "Book"
            ),
            "Pnakotic Manuscripts",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pnakotic Manuscripts",
              ":image",
              "Cthulhu/PnakoticManuscripts.jpg",
              ":classification",
              "Book"
            ),
            "R'lyeh Text",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "R'lyeh Text",
              ":image",
              "Cthulhu/RlyehText.jpg",
              ":classification",
              "Book"
            ),
            "True Magick",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "True Magick",
              ":image",
              "Cthulhu/TrueMagick.jpg",
              ":classification",
              "Book"
            )
          )
        ),
        "Mythos Independent Races",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mythos Independent Races",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Colour Out of Space",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Colour Out of Space",
              ":image",
              "Cthulhu/ColourOutOfSpace.png",
              ":reference",
              "In terms of matter I suppose the thing Ammi described would be called a gas, but this gas obeyed the laws that\nare not of our cosmos ... This was no breath from the skies whose motions and dimensions our astronomers\nmeasure or deem too vast to measure.  It was just a colour out of space - a frightful messenger from unformed\nrealms of infinity beyond all Nature as we know it. - The Colour Out of Space"
            ),
            ":Cthonian",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cthonian",
              ":image",
              "Cthulhu/Cthonian.png"
            ),
            "Elder Thing",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Elder Thing",
              ":image",
              "Cthulhu/ElderThing.png",
              ":reference",
              "* The toughness of the things was almost incredible. Even the terrific pressure of the\ndeepest sea bottoms appeared powerless to harm them. Very few seemed to die at all except\nfor violence, and their burial places were very limited. - At the Mountains of Madness",
              ":summary",
              "* Their metabolism is based on carbon dioxide instead of oxygen; their blood is dark\ngreen in color. The nervous system of the Elder Things is quite complex, with five-lobed\nbrains and many ganglial centers. The prismatic cilia on top of the creatures' head suggest\nthat they have senses other than sight, smell, touch, hearing, and taste. Elder Things\nreproduce through spores. They can derive nourishment from inorganic substances, but prefer\nto feed on organic life."
            ),
            "Flying Polyp",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Flying Polyp",
              ":summary",
              "* The flying polyps came to Earth from space as conquerors about 750 million years ago.\nThey built basalt cities with high windowless towers. When they attempted to colonize the\noceans, the polyps were driven back by the Elder Things. Thereafter, they restricted\ntheir habitats to the surface world.\n* Their senses did not include sight, but what senses they had could penetrate all\nmaterial obstructions. They were only partially matter, but still solid enough to affect\nand be stopped by normal materials; this additionally gave them resistance, if not\noutright invulnerability, to normal means of damage, though they could be destroyed by\ncertain forms of electrical energy. Their minds were so strange that the Great Race of\nYith could not perform psychic transfers with them.\n* They are able to levitate and fly despite lacking any visible means of doing so, and\nleave telltale massive footprints when on the ground. Their amorphous bodies can turn\ninvisible at will, though this ability appears somewhat negated by whistling noises\nassociated with them in general. In battle, their ability to control and direct powerful\nwinds is put to use as a weapon.\n* When the Great Race of Yith came to Earth, they warred with the polyps and soon drove\nthem underground with their advanced technology. The Great Race then sealed the entryways\nto the polyps' subterranean abode with trapdoors, which afterwards were diligently\nguarded. The polyps' cities were left abandoned, perhaps as a reminder of the horrors\nthat dwelt below.\n* Eventually, the polyps rose up and almost exterminated the Great Race, afterwards\nreturning to their subterranean haunts. Having no conception of light, the polyps seem\ncontent to remain there, annihilating the few intruders that chance upon them. The\nentrances to their dwellings are mostly deep within ancient ruins where there are great\nwells sealed over with stone."
            ),
            "Great Race of Yith",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Great Race of Yith",
              ":image",
              "Cthulhu/GreatRaceOfYith.png"
            ),
            "Hound of Tindalos",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hound of Tindalos",
              ":image",
              "Cthulhu/HoundOfTindalos.png",
              ":reference",
              "* All the evil in the universe was concentrated in their lean, hungry bodies.  Or had they bodies?  I saw them\nonly for a moment, I cannot be certain. - Frank Belknap Long, The Hounds of Tindalos",
              ":summary",
              "* The Hounds of Tindalos dwell in the distant past of the earth, when normal life had not yet advanced past\none-celled animals.  They are said to inhabit the angles of time, while other beings descend from curves.  The\nHounds are thought to be immortal and are believed to lust after something in humankind and other normal life,\nand will follow victims through time and space to get it.\n* Their appearance is unknown because no characters who meet them survive long enough to give a description.  It\nis said that they have long, hollow tongues or proboscis to drain victims' body-fluids, and that they excrete a\nstrange blue pus or ichor.\n* Though the Hounds are sometimes pictured as canine, it is not likely that they appear as such.  Their name\nrefers more to the creatures' habits than their appearance.\n* Because of their relationship with the angles of time, they can materialize through any corner if it is fairly\nsharp—120 degress or less.  When a Hound is about to appear, it materializes first as smoke pouring from the\ncorner, and finally the head emerges followed by the body.  It is said that once a human becomes known to one of\nthese creatures, a Hound of Tindalos will pursue the victim through anything to reach its quarry.  A person risks\nattracting their attention by travelling through time."
            ),
            "Hunting Horror",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hunting Horror",
              ":image",
              "Cthulhu/HuntingHorror.png"
            ),
            ":Mi-Go",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Mi-Go",
              ":image",
              "Cthulhu/MiGo.png",
              ":reference",
              "* Fact: Migoi or Mi-go (pronounced mey-goo) is a Tibetan name for the Yeti and translates as 'wild man'.",
              ":summary",
              "* Mi-go are an alien race of fungus-like creatures, approximately man-sized, pinkish in color, with crustaceous\nbodies bearing vast pairs of membranous wings and several sets of articulate limbs.  The Mi-Go have a sort of\nconvoluted ellipsoid where its head should be, covered with a multitude of very short antennae.\n* They have a colony on Pluto (i.e. Yuggoth) and have mining colonies in high mountains looking for rare minerals.\n* The Mi-go are not wholly native to our phyical universe.  Thus, they cannot eat food from Earth, and photographs\nof them are blurry and indistinct.  They can also fly unassisted through interstellar space at fantastic speeds.\nThey dissolve shortly after death.\n* They seem to be highly focused on their scientific pursuits and are most often encountered in search of obscure\nminerals in remote locations.  Trespassers are usually eliminated, though they have been known to have human agents\nwork on their behalf.\n* Mi-go have access to a number of advanced weapons.  The mist projector releases a cloud of frigid gas.  They have\nan organic 'armor' that humans can use, but it is extremely sticky and will damage the user each time it is removed.\nThe armor will also weaken each day unless immersed in the proper nutrient bath.\n* The Mi-Go are advanced in the sphere of surgery.  With surgical alterations the Mi-Go are able to speak human\nlanguages, though their voice is buzzy and irritating.  They can also surgically move the brain of other species\ninto metal cylinders for transportation to other worlds through space.",
              ":titles",
              "Fungi from Yuggoth"
            ),
            ":Shoggoth",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Shoggoth",
              ":image",
              "Cthulhu/Shoggoth.png",
              ":reference",
              "This was the dream in which I saw a shoggoth for the first time, and the sight set me awake in a frenzy\nof screaming. - The Shadow Over Innsmouth"
            )
          )
        ),
        "Mythos Servitor Races",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mythos Servitor Races",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Dark Young of Shub-Niggurath",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dark Young of Shub-Niggurath",
              ":image",
              "Cthulhu/DarkYoung.png",
              ":reference",
              "Something black in the road, something that wasn't a tree.  Something big and black and ropy, just\nsquatting there, waiting, with ropy arms squirming and reaching ... It came crawling up the\nhillside ... and it was the black thing of my dreams ... that black, ropy, slime jelly tree-thing out of\nthe woods.  It crawled up and it flowed up on its hoofs and mouths and snaky arms."
            ),
            ":Nightgaunt",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Nightgaunt",
              ":image",
              "Cthulhu/Nightgaunt.png",
              ":reference",
              "Shocking and uncouth black beings with smooth, oily, whale-like surfaces, unpleasant horns that curved inward\ntoward each other, bat-wings whose beating made no sound, ugly prehensile paws, and barbed tails that\nlashed needlessly and disquietingly.  And worst of all, they never spoke or laughed, and never smiled\nbecause they had no faces at all to smile with, but only a suggestive blankness where a face ought to\nbe.  All they ever did was clutch and fly and tickle; that was the way of night-gaunts. - The\nDream-Quest of Unknown Kadath"
            ),
            "Seed of Azathoth",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Seed of Azathoth",
              ":summary",
              "* While the [Spawn of Azathoth] are the size of dwarf stars, the seeds of Azathoth\nare the size of small comets. They are periodically cast off from Spawns during\nmajor upheavals or impacts with other bodies. The Seeds do not direct themselves\nthrough space, but if one impacts a planetary body, it slowly burns its way to\nthe core where it grows over millenia. Eventually, it matures to a full\n[Spawn of Azathoth] and shatters what remains of the planet into rubble."
            ),
            "Spawn of Azathoth",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spawn of Azathoth",
              ":summary",
              "* The massive Outer God Azathoth mindlessly casts off small parts of itself, the\nSpawn of Azathoth. Though small compared to Azathoth, these bodies are the size of\nsmall, brown dwarf stars. From Azathoth, they hurtle through time and space\nforever. Sometimes they pass near ordinary stellar systems and wreak havoc,\ncolliding with worlds or suns, causing gravitational catastrophes, or raining its\nseeds ([Seed of Azathoth]) upon them.",
              ":titles",
              "Nemesis"
            ),
            "Spawn of Cthulhu",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Spawn of Cthulhu",
              ":image",
              "Cthulhu/SpawnOfCthulhu.png"
            )
          )
        ),
        "Elder Gods",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Elder Gods",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Nodens",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Nodens",
              ":image",
              "Cthulhu/Nodens.png"
            ),
            ":Yibb-Tstll",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Yibb-Tstll",
              ":image",
              "Cthulhu/Yibb-Tstll.jpg",
              ":summary",
              "* Yibb-Tsttl is an obscure entity said to lie at the center of time and space and\nis able to see all things in the universe at any time making it so wise that only\nthe omnipotent Yog-Sothoth can surpass it in wisdom.\n* Appearance - Often envisioned as an immobile dark mass of tentacles with a\ndeformed head, detatched eyes and large bat wings under which countless\nNightgaunts suckle from innumerable breasts (heavily implying this monstrosity is\neither female or more likely a hermaphrodite). The mere sight of this creature\ncan drive humans insane and even thinking too hard on the monstrous being is said\nto attract its malevolent intent.\n* The Black - Yibb-Tstll's blood is alien and can be utilised as a weapon known\nas 'The Black', which takes the form of black snowflakes that stick to a victim\nand smothers them. The Black is a separate entity that is called upon by\nsorcerors more that Yibb-Tstll itself.\n* Reversal - The touch of Yibb-Tstll causes the hideous reversal. Typically this\nchange with kill the living or drive the sane mad, but like its name implies, it\ncan also do the opposite.",
              ":titles",
              "The Patient One"
            )
          )
        ),
        "Great Old Ones",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Great Old Ones",
          ":reference",
          "Behind the Veil what gulfs of Time and Space?  What blinking mowing Shapes to blast the sight?  I shrink\nbefore a vague colossal Face...Born in the mad immensities of Night. - Robert E. Howard, An Open Window",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Cthulhu",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Cthulhu",
              ":image",
              "Cthulhu/Cthulhu.png",
              ":reference",
              "Cthulhu is eponymous with the mythos. If you know nothing else of Lovecraft's body of works, you at least know the visage of this subterranean horror. Which is interesting, because he's relatively tame compared to the Outer Gods. Although he may be worshipped like a god by many, he isn't one. Not really. ... One might call him a priest. ... Since the dawn of man, these beings have been guiding the species through dreams and through psychic manipulation. Someday, when mankind has abandoned its morals and descended into madness, They will wake Cthulhu from his slumber, and he will raise the Old Ones from death and all the world will flame with a holocaust of ecstacy and freedom. ... Cthulhu is not oblivious or indifferent to mankind. He isn't even malevolent. He is Lovecraft's simple promise of evanescence. Nothing belongs to man. Not this world, not the home they've built on it, not even the human mind. It is the ultimate destiny of this species to unravel into primal chaos, as all Things must. To the sounds of their laughter and exultant shouts, all man has ever built will one day fade away. - Tale Foundry"
            ),
            ":Dagon",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dagon",
              ":image",
              "Cthulhu/Dagon.png",
              ":reference",
              "* I cannot think of the deep sea without shuddering at the nameless things that may at this very moment be crawling and floundering on its slimy bed, worshipping their ancient stone idols and carving their own detestable likenesses on submarine obelisks of water-soaked granite. I dream of a day when they may rise above the billows to drag down in their reeking talons the remnants of puny, war-exhausted mankind—of a day when the land shall sink, and the dark ocean floor shall ascend amidst universal pandemonium. - Dagon"
            ),
            "Hastur the Unspeakable",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Hastur the Unspeakable",
              ":image",
              "Cthulhu/Hastur.png",
              ":titles",
              "The King in Yellow"
            ),
            "Ithaqua the Windwalker",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ithaqua the Windwalker",
              ":image",
              "Cthulhu/Ithaqua.png"
            )
          )
        ),
        "Outer Gods",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Outer Gods",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            ":Azathoth",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Azathoth",
              ":image",
              "Cthulhu/Azathoth.png",
              ":reference",
              "This is about at close as Lovecraft's mythos ever come to establishing a\ncreator deity. It was Azathoth who birthed the Darkness and the Nameless\nmists from which nearly all the other gods and deities sprang. It was he who\ncreated the universe and he who will one day be its destruction. ...\nknow that Azathoth is neither malevolent nor benevolent - that he is entropy\nincarnate; a mindless, indiffernt force of pure chaos. The Blind, Idiot God.\nThere is nothing to be gained from calling on him and literally everything\nto lose. ... He is the epitome of cosmic horror in the mythos, embodying the\ncold, indifference of the cosmos and the sheer insignificance of intelligent\nlife. - Tale Foundry",
              ":summary",
              "* At the center of the universe, deep within a self-created abyss past time and space, dwells the blind idiot god Azathoth. Possessing True Immortality, Azathoth cannot be destroyed. The concept of death only exists within his dreams. Long ago, all was Azathoth. His dreams are all of existence and we are in his dreams. The mad piping attempts to keep Azathoth slumbering for when he wakes, all things will end and all will become Azathoth again.\n* Azathoth is perhaps the most powerful being in fiction.",
              ":titles",
              "Daemon Sultan, The Blind, Idiot God"
            ),
            ":Nyarlathotep",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Nyarlathotep",
              ":image",
              "Cthulhu/Nyarlathotep.png",
              ":reference",
              "Nyarlathotep is nothing like the other Outer Gods. He travels by his own laws,\ninto and out of the known cosmos, acting as a messenger to and from the Outer\nGods. His strange personality, or perhaps the simple fact that he has a\npersonality, baffles them. ... To lesser intelligences, he's a trickster,\nmalevolent and cruel, bequeathing gifts of wisdom and power to those who seek\nit, and whom he knows cannot handle it. Where Nyarlathotep goes, madness\nfollows. He is the Crawling Chaos, and as the only direct offspring of Azathoth,\nhe revels in it. To Lovecraft, Nyarlathotep must have been a perfect\nmanisfestation of his racism and xenophobia. He is not only the outside seeping\nin, but a malevolent, undetectable outside seeping in. - Tale Foundry",
              ":summary",
              "* Like the other Outer Gods, Nyarlathotep is a primal being of unimaginable power.\nUnlike the others, however, his power is knowledge and Nyarlathotep may be a\ncreature entirely of the mind. Though he typically appears as a man, he has\ninnumerable other forms and may be able to appear in any form he wishes. He seens\nto specifically target and toy with humanity by offering dangerous knowledge and\nobserving the results. This is probably an overly simplistic view of his actions.\nLike the other Outer Gods, he is too grand a figure to care about humanity. More\nlikely, he acts like Yog-Sothoth and simply appears as an avatar and provides\nKnowledge to those who seek him without regard to what we do with it. In this way,\nNyarlathotep is like Prometheus providing fire to humanity. It is possible that\nNyarlathotep is constantly offering knowledge, but we are generally unable to\nrecognize it. Perhaps Nyarlathotep is the Muse behind all discoveries.",
              ":titles",
              "The Crawling Chaos"
            ),
            ":Shub-Niggurath",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Shub-Niggurath",
              ":image",
              "Cthulhu/ShubNiggurath.png",
              ":reference",
              "Imagine a roiling, miasmic mass of twisting tendrils and drooling mouths, so\ntenuous in composition that its limbs vanish as quickly as they materialize,\nits very form dividing constantly into a surplus of smaller abominations that\nare either reabsorbed into its great form, or that escape to some hideous life\nelsewhere. Not the spitting image of a fertility goddess but this is as close\nas the mythos gets. Shub-Niggurath may well be the most widely revered amoung\nthe outer gods, infuence reaching not only to the Greeks, Cretans, Egyptions,\nand some druids, but to races so far-flung across the cosmos as the Mi-go of\nYuggoth, and the Dhole and Nug-Soth of Yaddith. ... Usually the creation of new\nlife, especially intelligent life, is held as a sacred act. Many humans derive\njoy and self-import from the notion that their kind was toild over by some\nkind of divine intelligence. Shub-Niggurath with her blind, indifferent,\nprolific procreation, undermines this idea. ... Shub-Niggurath was Lovecraft's\naffirmation that life itself is nothing extrodinary. - Tale Foundry",
              ":titles",
              "The Black Goat of the Woods with a Thousand Young"
            ),
            ":Yog-Sothoth",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Yog-Sothoth",
              ":image",
              "Cthulhu/YogSothoth.png",
              ":reference",
              "Locked away at the border of reality, there exists an intelligence. Rather, the\nintelligence. All of it. Yog-Sothoth holds the knowledge of all that is, all that\nwas, and all that will be. ... For this reason, he is one of the most heavily\nworshipped entities among the Outer Gods. His name is frequently invoked during\nthe rituals and incantations of those seeking hidden knowledge. And often, he\nanswers. Sadly for the ones who call on him, the knowledge he grants almost always\nleads to madness and self-destruction. Not because Yog-Sothoth is evil or\nmalevolent. He doesn't force anyone to turn the key or step through the gate. ...\nHe is both the danger of knowledge and the inability of man to handle it. His role\nin the mythos mirrors Lovecraft's own self-taught obsession with the sciences as\nwell as his acedemic failings. - Tale Foundry",
              ":titles",
              "Beyond-One, The Key and the Gate, The Vortex"
            )
          )
        ),
        "Mythos Scenarios",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Mythos Scenarios",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Seeds of Azathoth",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Seeds of Azathoth",
              ":summary",
              "* Nemesis - Since 1984, a theory attempts to explain the mass extinctions that occur\nevery 27 million years. The theory submits that a brown dwarf star orbits our sun at\n95,000 AUs and every 27 million years it approaches close enough to rain comets throughout\nthe solar system causing climate change, mass-extinctions, and similar catastrophes.\n* Seeds of Azathoth - Nemesis is, in reality, a Spawn of Azathoth that has clung to orbit\naround the Sun. Occasionally, pieces of Nemesis break free, falling into the solar\nsystem: the Seeds of Azathoth. Seeds that strike the Sun are destroyed, but if a seed\nstrikes a planet, it can melt into the planet's core where it grows immensely, eventually\nforming a new Spawn which emerges from the broken planet like a snake from an egg. Our\nsystem's original fifth world was so parasitized. Its remnants compose the asteroid belt.\n* For millenia, human and other astronomers have seen in comets, 'hairy stars',\napproaching disaster and ill-fortune. In ancient texts, comets have been blamed for\nthe revolt of the Shoggoths against the Elder Things, the doom of the dinosaurs, the\nfall of the empire of the Serpent People, the destruction of Hyperborea, the sinking of\nAtlantis, and even the two ages of chaos that struck early Egypt.\n* The most recent effect of Nemesis took place in central Siberia, June 30, 1908, when a\ntremendous explosion rocked the area for hundreds of miles. There was a pillar of fire\nand shock waves powerful enough to knock down horses 400 miles away.",
              ":sectionmap",
              vx_core.f_new(
                nx_tactics_base.t_sectionmap,
                "The Case of Phillip Baxter",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "The Case of Phillip Baxter",
                  ":scenariomap",
                  vx_core.f_new(
                    nx_tactics_base.t_scenariomap,
                    "Figure in the Night",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Figure in the Night",
                      ":summary",
                      "* An investigator wakes suddenly in the night to see the room bathed in pale\ngreen light and a strange musky smell. A vague, ghostly figure gestures toward\nthe investigator. Suddenly, a portion of its head disappears as if bitten off.\nThe spectre stumbles and thrashes around the room as more of the head is eaten\nuntil it is completely headless. The figure goes rigid and fades away leaving\nthe room in darkness.\n* After contemplation, the figure is recognized as Professor Phillip Baxter a\nformer teacher of the investigator.\n* Contacting Phillip's home gets the distraught housekeeper, Angela Vincenzo. She\ninforms them that Phillip passed away yesterday of a sudden illness. She invites\nthem to the funeral the next morning.\n* A successful Occult roll indicates that an apparition usually appears at the\nmoment of death instead of a day later."
                    ),
                    "Funeral of Phillip Baxter",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Funeral of Phillip Baxter",
                      ":summary",
                      "The services are in the rain and attended by:\n* Julian Baxter, the priest, in a wheelchair.\n* Matthew, the priest's personal attendant, who is a large, silent man.\n* Emmott Baxter, elder son of the deceased.\n* Dr. Douglas Walters, the family physician.\n* Silas Patterson, anthropologist and member of the Tuesday Night Academy.\n* Judge Braddock, executor of the estate.\n* Angela, the housekeeper.\n* Alvin Beswick, undertaker and hearse driver."
                    ),
                    "Legacy of Phillip Baxter",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Legacy of Phillip Baxter",
                      ":summary",
                      "* Angela receives the property\n* Half of his cash goes to the Tuesday Night Academy\n* The remaining half goes to his three children Emmott, Colin,\nand Cynthia. Cynthia's portion to be donated to the Catholic Widow's Relief Fund as\nshe requested.\n* At this, Emmott accuses Silas Patterson and his Tuesday Night\nAcademy of wasting all his father's money in life and now in death.\n* Finally, a packet of papers is given to the investigators according to the will.\nThis packet contains Phillip's dream journal and an short note about why he thought\nthe investigators might be interested."
                    ),
                    "Dream Journal of Phillip Baxter",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Dream Journal of Phillip Baxter",
                      ":summary",
                      "* The enclosed note describes that his dreams had become more vivid and\nrecurring recently and that he felt that he needed to write them down and give\nthem to someone who might find the account scientifically interesting.\n* He had traveled to Ultar and visited the library there. In the library, he\nfound the book, the [Cthaat Aquadingen] which gave important insight into his\ncurrent research. As Phillip left the library, he saw an evil-looking dwarf\nthat he had seen in a carnival he passed on the way into the city. The dwarf\nwas discretely following him. Phillip managed to shake him before he woke up.\n* Anyone experienced in the Dreamlands will recognize the entrance to the\nDreamlands and Ultar."
                    ),
                    "Home of Phillip Baxter",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Home of Phillip Baxter",
                      ":summary",
                      "* Angela Vincenzo, the former housekeeper is now the only resident in the roomy\nthree bedroom home.\n* The study contains various paperwork including:\n** A letter from Phillip's daughter Cynthia describing that her supposed kidnapping\nby natives was not as serious as he was led to believe and that she is perfectly\nfine. She has sent a box of coconuts as a present.\n** Notes on the Tuesday Night Academy's purchase of a large telescope and their\nsearch for a 'Dark Star' called Nemesis.\n** An anthropology book authored by Silas Patterson with marked section describing\nsoutheast Indian tribes displaying remnants of ritual cannibalism. Most are symbolic\nacts upon the death of a family member or friend, but on occasion the ritual is\nactually performed using a monkey or ape substitued for a human. Of particular\ninterest is a brain eating custom where the brain is exposed and eaten directly from\nthe skull while still warm. An elderly native said that he had seen apes killing\nsmaller monkeys and eating their brains in similar manner.\n** A diary including comments about:\n*** His brother Julian sudden sickness and retirement after returning from the\nAndaman Islands.\n*** Julian's subsequent suicide attempt\n*** Cynthia's trip to the Andaman Islands and subsequent abduction by savages.\n*** Her later release\n*** Arguments with his sons over favoritism\n*** His recent series of nightmares\n*** His therapy with Julian over his nightmares and the drug Julian prepared to help\nhim sleep.\n*** The ultra-realistic new dreams after the drug put him into an especially deep\nsleep.\n*** Julian's refusal to provide more of the drug.\n*** Phillip's break-in of Julian's house and the successful theft of the drug.\n* The basement contains an unopened crate of coconuts with a small hole chewed\nthrough the side.\n* The attic contains a formerly extinct prehistoric spider that was in the crate of\ncoconuts. It had bitten Phillip in his sleep and put him into a deep coma that was\nmistaken for death. The spider venom causes unconsciousness in 10 minutes, but the\nvictim will revive on its own within two days."
                    )
                  )
                ),
                "Search for the Seed",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Search for the Seed",
                  ":scenariomap",
                  vx_core.f_new(
                    nx_tactics_base.t_scenariomap,
                    "The Garrison Observatory",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "The Garrison Observatory",
                      ":summary",
                      "* The Tuesday Night Academy has spent a large sum of money to erect an\nobservatory in Garrison Montana. They experiment with prisms to try to\ndetect the dark star that their research claims has had a sweeping effect\non history.\n* The Observatory is deep in the woods and is only accessible on\nhorseback."
                    ),
                    "The Defenders of the Seed",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "The Defenders of the Seed",
                      ":summary",
                      "* The Seed - A Seed of Azathoth has been hurtling through space for\ncenturies and has finally been drawn to Earth. As it approached, the\nspecial prisms in the telescope attracted it like sunlight off a mirror.\nThe Seed swept across the sky and crashed in the woods. Its strange\ngreen fire trail attracted the attention of many including those at\nthe observatory and a group of local hunters.\n* Sasquatch - When the hunters found and examined the asteroid, they were\nexposed to the horrific radiations of the Seed. Those that survived,\nregressed to a primitive state. They are terrified by the Seed, but are\ncompulsively drawn to it. They have buried the Seed in an alcove of the\ncave in which they live. The Seed is slowly killing them, and as they\ndie, they dissolve into a primordial soup before actually dying.\n* Sylvian Englund - Sylvia is a pleasant woman in her late sixties who\nlives off the land in the woods since the death of her husband. She has\nrecently discovered the regressed hunters and believes that they are\nSasquatch. She has been feeding them and has gained their trust. She\nenjoys her discovery and does not want outsiders to ruin her\nfriendship with the sasquatch."
                    ),
                    "The Race for the Seed",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "The Race for the Seed",
                      ":summary",
                      "* Fungi From Yuggoth - A team of four Mi-go have observed the Seed's\nlanding from their underground outpost on the Moon. Their goal is to\nretrieve the Seed to use as an magical energy source. Interesting humans\ncaptured along the way are to be de-brained and the brains carried back in\ncylinders for questioning later.\n* They each carry a machine that looks like a silver whorl. It fires a\nbeam of deadly radiance that eats blackening holes in whatever it touches.\nAny damage prevented by armor is instead applied against the armor itself.\nThe weapons have 37 charges and may not be recharged. The weapons have no\nrange limitations and are excellent sniper weapons.\n* Their first target is the firetower where they slay Ranger Marshall and\nuse the tower as a base of operations.\n* The next day they spray a nervous tissue solvent in the direct vicinity\nof the firetower to prevent intrusions. The spray forms a low fog that\nshort circuits animal nervous systems driving them mad. A Grizzley Bear\nand Jules, Sylvia Englund's dog, are the first victims of the gas. Both\nroam the countryside acting randomly.\n* Later the same day, the Fungi search the observatory, leaving many\ntell-tale signs.\n* The next day, they capture Sylvia Englund near her ranch. They de-brain\nher and hide the body in the house.\n* Toward the end of the day, they move on the Seed. They make quick work\nof the hunters defending it. They carefully put the seed in a shielded\ncontainer and fly it to the firetower. They gather their belongings,\nincluding the Seed and any captured brains, drop a bomb on the firetower\nto destroy any evidence, and fly back to the Moon."
                    )
                  )
                ),
                "Death in St. Augustine",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Death in St. Augustine",
                  ":scenariomap",
                  vx_core.f_new(
                    nx_tactics_base.t_scenariomap,
                    "Investigating Colin Baxter",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Investigating Colin Baxter",
                      ":summary",
                      "* Colin Baxter, Phillip's youngest child, is due a healthy piece of\nPhillip's estate, but he must be located first. His last known location\nwas St. Augstine, Florida. Judge Braddock is concerned with the series of\nbizarre occurences and hires the investigators to track Colin down and\ncheck on his safety.\n* St. Augustine is a city in northeast Florida and the oldest continuously\noccupied European-established settlement in the continental United States.\n* Colin is indeed still here, but he has fallen on hard times and turned\nto alcohol. He can be found in a local speakeasy hidden behind a\ngrocery store.\n* Harry Spitz - The grocery store/speakeasy is owned by Harry Spitz who\nruns the bar. He pays protection money to the police and is in no danger\nof police action.\n* Billy Wolff - Billy is a close friend of Colin's and will steadfastly\ndefend his buddy in all circumstances, especially when drinking.\n* Esmerelda - Esmerelda is a Cuban born, hot-headed friend of Colin's.\nShe is an illegal immigrant and will not reveal her last name under any\ncircumstances to, somehow, protect her family."
                    ),
                    "Colin's Treasure",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Colin's Treasure",
                      ":summary",
                      "* Colin has a history of get rich quick schemes and his current one is to\nfind a fortune in sunken treasure. Unfortunately, his business partner\nran away taking their remaining cash and Colin's girlfriend with him.\nSince then, Colin has been drinking his troubles away.\n* The inheritance money helps, but Colin is still short $2,000. He will\noffer the characters 50% of the profits if they chip in the money.\n* He believes that the wreck of the treasure galleon, La Rosaria can be\nfound off Bimini. He claims to have an accurate map to the location. His\nmap is hand copied from an original kept in the library of the 200 year\nold Spanish church.\n* Father Garcia - At the church they meet Father Garcia who is a friend of\nEsmerelda. Father Garcia is friendly but guarded. With the help of\nEsmerelda he admits that he fears that someone is watching him. He also\nadmits to seeing figures moving in the dark on the church grounds, though\nhe feels he must be imagining things. After gaining his trust, Father\nGarcia shares the church library. Though Colin's research is shoddy,\nfuther research supports his findings that the map is an authentic map of\nthe location of	the La Rosaria."
                    ),
                    "Colin's Wreck",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Colin's Wreck",
                      ":summary",
                      "* The Palencia - Colin invites the party aboard the old steamer he has\nbought and retrofitted for large scale salvage. The crew is mostly Cubans\nand blacks. As they depart, someone spots a reflection from the coast.\nUsing binoculars, they see someone observing them back with binoculars\nbefore the person ducks away.\n* The Voyage - The map shows a location off Bimini, 300 miles south of St.\nAugustine. The voyage takes less than 24 hours on calm seas.\n* Diving - The diving pumps have enough pressure for no more than 2 divers\nat once. Wolff operates the pumps. Colin would prefer to dive with a\npartner and asks for volunteers. The divers reach the bottom in 2 minutes\nand tug twice on the line to indicate they are at bottom. The water is\nparticularly clear and well illuminated by sunlight. Only 20 minutes later\nthey spot the wreck and tug twice again. The divers return to the surface\nand describe that the wreck is in only 50 feet of water but is stuck on a\nreef hanging over a sharp drop off on one side.\n* Coral Outcropping - A protruding coral outcropping has pierced the hold\nof the hull. Anyone exploring this area will be the victim of a single\nsudden attack by the [Moray Eel] that makes its home here. The attack is\nnot life threatening, but if the person bleeds the divers will have to\nreturn to the surface for fear of attracting sharks.\n* The Drop Off - Anyone foolish enough to explore the deck near the\ndrop off, suddenly causes a section of the hull to break off and fall into\nthe drop off. The falling diver can attempt to jump free, failing that he\ncan scramble to grab the coral reef as he falls, otherwise he slowly falls\n30 feet before the coral cuts his air hose and he drowns. The boat pulls\nhim up, but it will be too late to save him unless he is extremely\naccomplished at holding his breath.\n* Captain's Cabin - Colin is most interested in the Captain's cabin where\nhe finds a heavy lock box which needs to be winched to the surface. In it\nthere can be found 22 forty pound silver bars worth $10000 total and a\nstrange, large necklace. The necklace is carved with strange figures of\nanimalistic humans celebrating a great comet with a tail that goes on\nforever. After a few days investigation, it is clear that the wreck does\nnot contain the riches that Colin hoped for. Colin will be left deeply in\ndebt. However, any characters who invested will double their investment."
                    ),
                    "Colin's Ruins",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Colin's Ruins",
                      ":summary",
                      "* The Ruins - Colin desperately hopes that the treasure fell from the\nwreck before it landed at the bottom and begins retracing the ship's path.\nAbout a 300 yards away, he discovers what probably sank the La Rosaia: a\nsunken ruin whose stone ceiling lies just below the water line. No\ntreasure is found, but Colin is desperate to find anything of value, so he\nmoves to explore the Ruins.\n* Temple - The ruin is a stone temple in a bowl shaped depression with curved\nsteps going down 20 feet before entering an archway. The temple itself is only\n30 feet across and has many crabs and octopi. The walls are covered by mosaic\ntile that depicts people suffering during multiple terrible disasters. Above\neach disaster are tiles depicting an orb with a shining light nearby.\n* The Pit - In the center of the temple is a dark pit of indeterminate depth.\nBefore the pit is a metal orb on a stone slab. The orb has a metal rod\nprojecting from one side at the end of which is a shiny topaz. The rod can\norbit the orb and telescope in or out, but its current position is very close\nto the orb. A mechanism inside the orb operates the rod and is apparently\nstill active. The pit reaches about 100 feet before a rock cave-in blocks the\nway. Within the pit is a single, strange dolphin.\n* The Dolphin - If multiple lights are shined down the pit, a motionless\ndolphin can be seen. Suddenly, the normally peaceful dolphin swims up and\nattempts to ram people with incredible force. It will continue attacking\nunless the invaders leave or it is killed."
                    ),
                    "Death of the Father",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Death of the Father",
                      ":summary",
                      "* Homecoming - As the Palencia arrives at port, police can be seen on the\ndocks. When the Palencia docks, officers rush on board and arrest Colin and\nWolff for the murder of Father Garcia.\n* Murder - Father Garcia was murdered the same day that Colin and the\ninvestigators went to the library. Witnesses say that Colin and Wolff\nreturned drunk later that night and ransacked the library. That morning the\npriest was found in the church with his skull crushed. The reality is that\nthe ghoul cult has been robbing graves for years. Father Garcia has been\nnoticing activity in the night and has been hiding in the church at night to\ntry to catch someone in the act. Unfortunately, he found the graverobbers and\nconfronted them. They immediately killed him and called the Detective to\ncover up the murder. What the killers did not realize was that Esmerelda was\ncoming home from the speakeasy when she heard a commotion from the church.\nShe rushed over and observed the killers discussing what to do with the\nFather's body.\n* Detective Morris Packard - The detective is the head of the police force\nwhile the chief is on extended medical leave. He is also a member of a secret\ndeath cult that worships ghouls. His cult was graverobbing for their riturals\nwhen the Father caught them and he was dispensed with. Colin's drinking made\nhim a convenient scapegoat, so the Detective is constructing circumstantial\nevidence to arrest Colin. Later he will arrange for Colin to hang himself in\njail. If the investigators get too close to the cult, he will arrange an\nambush to eliminate them.\n* Esmerelda - Esmerelda is conspicuously missing. After witnessing the murder\nscene, she packed her things and fled to her parents house in Clearwater.\nShe fears for her safety and doesn't want to get involved, but when she\niscovers that Colin has been frames, she writes a letter with what she saw to\nthe investigators and Colin.\n* Crime Scene - Trampled in the dirt can be found a pin from the local\nalligator farm that was dropped in the scuffle.\n* St. Augustine Library - The local library carries copies of newspapers.\nSeveral stories can be found in the Jacksonville Sentinel that may be\nrelevant. Older material is harder to discover.\n** 1571 - A yellowed document in Spanish written by Father Rolando Tortulla\nof Toledo Spain. The document reports to the King, the state of the French\nheretics held prisoner in vaults below the monastery. They are wild and\ndegenerate and are guilty of cannibalism. They will be held until they die.\n** 1641 - A yellowed document in Spanish describes the construction of the\nCastillo de San Marcos that incorporates the catacombs of the old monastery.\nA violent french prisoner was transferred to a new cell.\n** 1662 - A yellowed document in Spanish describes the horrid state of the\nFrench prisoner. His toes are missing and he limps around his cell scratching\non the walls saying only gibberish. He will be held until he perishes.\n** 1682 - A yellowed document in Spanish describes the escape of the french\nprisoner. Stones were removed from the wall of the cell and the prisoner\nfled into a tiny tunnel behind the wall. After a brief attempt to locate him,\nthe tunnel was filled, sealing the fate of the horrible prisoner. Drawings\nwere scratched into the ceiling showing comets and fire raining from the sky.\n** 1792 - A religious paphlet describes an ancient evil unloosed by Satan.\nThey are inhuman but walk among us like men. Many officials of the city, both\npast and present, belong to this secret, godless faith.\n** February 1890 - A freshly buried body was stolen from a cemetary south of\nSt. Augustine. No suspects were found.\n** May 1927 - Grisly Find at Alligator Farm. Eli Simpson, an employee of the\nfarm, saw a shoe in the large crocodile pool which turned out to also contain\na severed human foot. No identification was found, and police theorize that\na vagrant snuck onto the farm and fell into the pool. No charges were filed.\n** October 1920 - A recently buried body of an indigent was stolen from the\nold St. Augustine church graveyard. No motive or suspects were found.\n* St. Augustine Herald - The local paper is a weekly that promotes local\nbusinesses and tourist trade. The editor/owner is Fred Boswell who bought the\npaper 3 years ago. Strangely, the original owners destroyed all their files\nbefore they left.\n* Jacksonville Sentinel - Sold next to the Herald is a real paper published\nin Jacksonville, a 2 hour drive up the coast."
                    ),
                    "Korsky's Alligator Farm",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Korsky's Alligator Farm",
                      ":summary",
                      "* Eli Simpson - Eli found the severed foot and was subsequently fired by\nMaynard Korsky for alerting the police before discussing it with him first.\nIt was not the only time he found strange meat in the pens, but it was the\nonly thing he could clearly identify.\n* Maynard Korsky, Dell Korsky, and Kenny Durham run the farm. They use the\ngators to destroy the leftovers of the cult, but do not do any other cult\nbusiness at the farm.\n* The Farm - If the investigators investigate the farm during the day, the\nKorskys and Kenny Durham are no help and the cult is alerted to their\ninvestigation. If they investigate at night, the farm is not guarded, but\nthe gators have destroyed any evidence that might have been found."
                    ),
                    "Castillo de San Marcos",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Castillo de San Marcos",
                      ":summary",
                      "* A monumental castle started in 1638 and took over a century to complete.\nThe upper levels are open to the public, but the lower levels are considered\nhazardous and are sealed off with packlocked plywood doors. It is easy enough\nto pry the plywood loose but not without leaving evidence of tampering. The\ncells of the degenerate prisoners are easy to locate. The walls and ceiling\nare covered with scratchings of spiders and comets and skulls. In the final\ncell, a stone can be removed revealing a low tunnel sloping downard. Crawling\non hands and knees for fifty yards reveals a hallway from the original\nFranciscan monastery that predated the fort. The hall leads to a small room\nwith two chairs and black robes hanging from pegs. The room is the same as\nthe one depicted in the films from Thornton's Camera Shop."
                    ),
                    "Thornton Camera Store",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Thornton Camera Store",
                      ":summary",
                      "* The camera store has a view of the castle. William Thornton works here all\nday selling cameras, lens, and film. There is also a darkroom where he\ndevelops photos.\n* If the investigators break in they can find some smuggled Cuban ponography\nand three recent silent films in a locked box.\n* The Films - Each film is roughly the same depicting a dead body in a chair\nin a small stone room surrounded by hooded figures. A veiled female figure\nlimps over and begins a ritual. The body seems to gain some semblence of life\nand then the figures leap upon the body and begin eating it at which point\nthe film ends.\n* If confronted with the films, Thornton claims he received them by accident\nalong with the Cuban films and that they are obviously some kind of homemade\nhoax."
                    ),
                    "Thornton House",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Thornton House",
                      ":summary",
                      "* Mother Thornton - Mother Thornton is the matriarch of the death cult and has\nnearly completely transformed into a ghoul. She never goes out in public and\nwears a veiled hat even in private.\n* William will normally be at home after 5pm. During the day, the front door is\nnot locked. If Mother Thornton hears intruders, she will stay in her room\npretending to be sleeping in a chair. If she is exposed, she throws off the veil\nand tries to escape the house. She will leap out the second story window lope\ndown the street scattering the citizenry. Any disturbance here will have the\npolice arrive in five minutes where they will arrest anyone in the Thornton\nhome for the murder of Mother Thornton. Even if she is killed the story will be\nthat they killed a deformed and crippled old woman.\n* Gray Binding - Among her possessions is a book that teaches the Gray Binding\nspell that animates a corpse into a mindless zombie."
                    ),
                    "St. Augustine Ambush",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "St. Augustine Ambush",
                      ":summary",
                      "* The Note - If the investigators are discovered, Detective Packard will\narrange a deadly ambush for them. He will kidnap Eli Simpson, Esmerelda, or\nanyone else who they think can lure the investigators. The victim leaves a\nnote to the investigators that they have new information and to meet at the\nchurch graveyard and night.\n* The Churchyard - The gator farm truck is hidden to the north of the\nchurch, and the Maynards and Packard wait in ambush with pistols and\nblackjacks behind tombstones. At the center of the graveyard, the contact\nsits on a tombstone under the moonlight. Unfortunately, the victim is already\ndead and is merely propped up. The ambushers try to take the investigators\nalive, but will open fire if they have no other choice.\n* The Ritual - If the investigators are captured, they are taken to the ritual\nchamber where one of them is eaten alive while the others watch. Before the\ngrisley feast is complete, a number of ghouls come down the tunnel and tear\nthe cultists apart. The ghouls drag away the dead and ignore the living\ninvestigators."
                    ),
                    "Exposing the Cult",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Exposing the Cult",
                      ":summary",
                      "* Exposing the Cult - Since Detective Packard is a cultist, any involvement\nwith local police will get the investigators in trouble. If they can bring\nhard evidence to the Florida State Police, who will move in and clean up the\nmess, though they will cover up the messier parts to maintain their vital\ntourist trade."
                    )
                  )
                ),
                "Investigating the Andamans",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Investigating the Andamans",
                  ":scenariomap",
                  vx_core.f_new(
                    nx_tactics_base.t_scenariomap,
                    "Trip to the Adamans",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Trip to the Adamans",
                      ":summary",
                      "* The Andaman Islands are a narrow chain of islands 590 miles southeast of India.\n* Weather - The temperature is mild and ranges from 64F to 92F. Except for October\nand March, the islands are hit by daily monsoons.\n* Wildlife - There are no large predatory animals, just all manner of bats, rats,\nspiders, turtles, wild pigs, and native cats.\n* Population - The natives are primitive Negritoes, belived to have lived here since\nthe Pleistocene era. Uniquely among modern man, they have no knowledge of fire\nbuilding and must continually keep a fire burning. They are divided into 12 tribes\nwith different dialects of the same language. They have a long reputation as\nviscious killers and cannibals. For centuries, shipwrecked sailors had been\nsystematically slain (but not eaten). Over time, the islands have become safe to\noutsiders except in remote areas.\n* Port Blair - The British established a penal colony on the islands where convicts\nare forced to live and work. The colonly is a primitive jungle colony with a dock,\ngeneral store, a wireless, and faily complete medical facilities. Port Blair is also\nthe only deep water anchorage on the islands, so all ships must dock here.\n* Major Ashley Nichols - Major Nichols is the commissioner of the Andamans. He\noversees the trade of exotic lumber, coffee, cocoa, tea, and coconuts. He also\ncommands a small battalion of Indian solders. Nichols is happy to meet civilized\nwesterners and will places his services and those of the British Government at their\ndisposal.\n* Arrival - The Andamans are 10,000 miles from America. If the investigators use\nColin's ship, the trip takes 3-4 weeks. If they book other passage, they will have\nto travel to Calcutta first.\n* Office Records - Major Nichols has nothing to hide and allows full access to the\noffice records where a report of Cynthia Baxter's abduction can be found. In the\nnarrative, it is found that although the abductors initially tried to take her by\nforce, that after a short conversatiion, she agreed to go with them and was returned\nsafely the next day. Major Nichols has only met Cynthia twice, since she rarely\ncomes to Port Blair."
                    ),
                    "Trek across the Adamans",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Trek across the Adamans",
                      ":summary",
                      "* Guides - If they request, Major Nichols will provide two Indian guides to lead\nthem to Cynthia's clinic 45 miles away. However, he does warn that the two are\ncriminals, working off their crimes. Worse, there are 2 escaped criminals\nknown to be in the area. They are desperate killers and could be extremely\ndangerous.\n* Sikander - A Hindu in his mid-thirties with a wife and three children on the\nisland. He stole a horse and has served eight years so far but is mostly\ntrustworthy. He will, however, steal a weapon for protecting his family if he\ngets the chance. If successful, he will hide the weapon in the jungle for future\nretrieval.\n* Mahbub - A Moslem from Delhi who has served twenty years so far for murder. He\nspeaks little English and is neither garrulous nor energetic.\n* The Jungle - The trip to Cynthia's clinic starts on timber roads, then\nfootpaths, but before the first day is over they are struggling through thick\ngrowths and shallow swamps with no path. The trip takes three days or more, and\nthe guides prove able servants, doing all the work of setting up camp, building\na fire, and preparing meals.\n* The Villiage - A loud buzzing noise emanates from a clearing ahead with a tiny,\nabandoned villiage. The buzzing comes from a tree with a crude platform 25 feet\nup. Atop the platform is a rotted human form covered in a mass of undulating\ninsects that are devouring it. Although the Andamanese normally bury their dead,\nif a particularly revered chief dies, he is bundled in a tree and the clan abandons\ntheir villiage for three months in reverence. If the body is disturbed, the Jarawan\nhunters will track the intruders and attempt to kill them for their blasphemy.\n* The Mission - Cynthia has a small wooden building that serves as her clinic\nsurrounded by the huts of 20 Andamanese. Nearly a mile from the beach can be seen\na 6 mile island covered with dense jungle. If local tribesman believe the island is\nevil, and only Cynthia has returned alive from it. The inhabitants of the island\nrarely leave, and when they do it is only to kidnap and kill.\n* Cynthia Baxter - Cynthia is a large woman, big-boned and slightly overweight. She\nis very near-sighted, and her voice is high pitched and squeaky. Cynthia will act\nhospitable to strangers, but she is highly suspiscious of those who would appear\nat this critical moment in her life. She lost her mother at 8 year old. She nearly\ndied from a spider bite and 12 and began thinking of becoming a catholic nun.\nInstead, with the encouragement of Uncle Julian, she studied medicine in college.\nJulian helped her get through medical school, and she is deeply grateful to him. To\nimpress Julian, she became a medical missionary and travelled to the Adamans in\n1913. In 1918, she was kidnapped by the Tcho-Tchos from the small island across the\nstrait. The Tcho-Tcho priest saw the mark of the spider on her, and trained her in\nthe nature of Atlach-Nacha, their horrible spider god. Cynthia never had a strong\npersonality and was easily brainwashed and converted to the terrible worship. The\npriest has convinced her that she has a special detiny (which is horribly true),\nand now only Julian might be able to turn her from her path.\n* Cynthia's Journal - In her hut is a journal that describes her facination with the\nteachings of the Tcho-Tcho priest and her belief that a new sun shall appear in the\nsky. The journal describes the arrival of Silas Patterson and his interest in the\nTcho-Tcho rituals. She also writes of her mixed feeling about sending the 'present'\nto her father, but the priest insists that he cannot be allowed to interfere."
                    ),
                    "Tcho Tcho Island",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Tcho Tcho Island",
                      ":summary",
                      "* Kidnapping - The arrival of strangers, convinces the priest that the moment has\ncome. He sends men in the night to meet with Cynthia, and she eagarly goes with\nthem. The local Adamanese raise an alarm and many flickering torch lights can\nbe seen from the island.\n* Tcho Tcho Tribesman - The Tcho Tcho are more asian in appearance than the average\nAdaman. They are all violent fanatics and will hunt down and capture anyone who\ninvades their island. There are 10 males, 6 females, and 3 children on the\nisland.\n* Tcho Tcho Priest - The Tcho Tcho priest leads his tribe. He is a long time\nexplorer in the Dreamlands and there he has the form of a twisted dwarf (reflecting\nhis personality). In combat, the priest stands back and casts spells (Dread\nCurse of Azathoth and Withered Limb) while his comrades fight and die.\n* Fossil Quarry - An exposed rock in the jungle is covered with fossils of\nprehistoric arthopods including millipedes, scorpions, and spiders. This rock is\nthe source of the spider from the Baxter home, brought to life by the Child of\nAtlach-Nacha spell cast by the Tcho Tcho priest. A single enormous spider\nsix-feet across can be found here, and the priest will animate this spider if\nhe gets the chance. Note: Any damaged fossil cannot be reanimated.\n* Obelisk - In a clearing near the villiage rises a black stone, twenty foot\nmonolith. Though weathered by time, precise geometric designs are clearly\nvisible. These designs are are disturbing to the eye and create a sense of\nvertigo. Out of the corner of one's eye, they seem to swirl and pulse. If one\nlistens to the stone an almost impercetible rhythmic throbbing can be heard.\nCrude stones are set up around the obelisk covered in primitive drawings of\nspiders chasing and consuming tiny humans as shooting stars fall from the\nheavens.\n* Metamorphosis - On the night Cynthia is 'kidnapped', she goes directly to\nthe Obelisk. There the tribesmen have gathered to begin the ceremony. Near the\nObelisk are bound the 2 escaped killers that Major Nichols warned of as well\nas any other captured males. Cynthia stands before the altar, removes her\nclothes and sways to the Tcho Tcho songs. Eventually, she stops, bends over,\nand the skin along her back splits wide open, revealing a shiny black surface\nthat pulses horribly. As the wrinkling empty skin of Cynthia Baxter is pushed\nforward, multple legs spill out from the discarded molt, waving feebly, as the\nhuge spider-thing pushes clear. The priest dones Cynthia's discarded skin and\nwears it like a coat.\n* The Wedding Feast - Cynthia's new form is not hard enough to move freely\nuntil dawn. In the meantime, she is ceremonially wedded to the male sacrifices\nbefore she drags herself to each one and begins eating the flesh from the\nvictims head. She finally sucks the brains out through the eyesockets. Each\nfeast takes 20 minutes, and after each is consumed, the still animate corpses\nwith exposed skulls are freed and shamble mindlessly off into the forest. The\nOnge people sense the threat of the Tcho Tcho and attack the Tcho Tcho. The\nTcho Tcho defend Cynthia and the priest as they escape. The Onge will not\npursue the Tcho Tcho into jungle at night. Instead the free any remaining\nprisoners and wait for light. The priest makes his way to the prehistoric rock\nand casts Child of Atlach-Nacha to animate the giant spider there.\n* Daughter of Atlach-Nacha - At dawn, Cynthia is fully formed and begins a\n3 hour trek across the island to the Caverns of Atlach-Nacha. She is\naccompanied by hordes of spiders that crawl around and over her. Any who\nfollow will constantly be treading on spiders and have spiders dropping upon\nthem from the trees. Their bites are painful but are not dangerous.\n* Caverns of Atlach-Nacha - Cynthia travels to a 20 foot cave opening where\nher father dwells. If she is pursued, she will wait in ambush for her pursuers.\nIf the investigators are foolish enough to continue searching, they will\ntravel through twisting caverns deeper and deeper for over an hour before the\ncave opens into a vast chasm nearly filled with thick, ropy webs. Continued\nactivity attracts [Atlach-Nacha] himself who resembles a hideous, black, hairy\nspider with a strange, remotely human-like face with little red, hair-rimmed\neyes."
                    )
                  )
                ),
                "Ulthar and Beyond",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Ulthar and Beyond",
                  ":scenariomap",
                  vx_core.f_new(
                    nx_tactics_base.t_scenariomap,
                    "Exploring Ultar",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Exploring Ultar",
                      ":summary",
                      "* Phillip Baxter's dream journal leads the investigators to start exploring\n[Ulthar] in the Dreamlands.\n* Phillip's Dreamform - At some point someone will notice that Phillip Baxter\nis watching them from a distance. If anyone approaches, his head disappears\nin a cloud of mist and then he vanishes.\n* Procession of Burgomaster Kranon - Trumpets announce a parade throught the\nstreets for Burgomaster Kranon. The Burgomaster is immediately recognizable\nas Matthew, Julian Baxter's ward. In the Dreamlands, his emotional and mental\nhandicaps don't exist. If the investigators can get an audience, Krannon can\nbe convinced to help them, both here and in the real world.\n* Cthaat Aquadingen - At the [Library at Ultar], the investigators can\nsearch for the [Cthaat Aquadingen]. The book is bound in soft, human skin,\nstill pliable, and always moist from perspiration welling from its pores.\nSimply handling the book is creepy. Within the book can be found a quote:\nThe stars fall, the beast bred of stone rampages, and a time of great change\ncomes. Deep within perfumed Kled, where life turns to death, the Watcher in\nthe Glade knows the time and place of the coming. Chinese notes are written\nin the margin of the page. If they are translated, they comment that the\nPnankotic Manuscripts mentions the Watcher in the Glade.\n* Pnakotic Manuscripts - If read, the manuscripts describe that the Watcher\nin the Glade is the Great Old One Yibb-Tstil. Priests of Yibb-Tstil meet at\nthe great pool in front of the ivory palace. Priests then grovel on hands and\nknees before Yibb-Tstil and must not look upon him.\npriests of\n* Carnival - While leaving Ultar, the dreamers chance upon a carnival tent. A\nbarker announces that they have the only captive Colossal purple spider from\nthe distant north. Admission is a dime or anything of value. The interior of\nthe tent is larger than the outside would suggest, and in a barred cage at\nthe back of the tent is a purple spider the size of a car hovering over the\ndessicated body of a sheep. If anyone tries to talk to the spider, it speaks\nin a thin, dry voice. It is, however, not helpful and eventually hisses. The\nbarker comes running in and ushers them out. If they want to speak more, the\nbarker says: 'It is not up to me you see'. The spider then says: 'After all, I\nam the master here.' If the barker is questioned about the dwarf who works\nhere, he tells them the dwarf quit some time ago and headed to Kled."
                    ),
                    "Journey to Kled",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Journey to Kled",
                      ":summary",
                      "* The perfumed Jungle of Kled can be reached by traveling North from the\nEnchanted Wood to Thran. At Thran a elephant caravan can be taken over land or\na river boat can be taken to Hlanith where passage on a ship can be found to\nKled.\n* Numerous ivory palaces dot the jungles. If the dreamers ask about the great\npool mentioned in the Pnakotic Manuscripts, the guides recognize it as the\nPalace of the Sacred Fount.\n* Palace of the Sacred Fount - The palaces is one of the less feared locations,\nthough it is still avoided. As with other ivory palaces in Kled, the palace\nis somehow physically in perfect condition though the rooms are empty and the\nfloors are thick with dirt and leaves. The smell in the area is a unique musky\nodor that immediately reminds the dreamers of the smell during the dream of\nthe death of Phillip Baxter. The front hallway is an atrium where rain water\nfalls to collect in a rectangular pool. At the far end of the pool stands a\nhuge jade statue of an evil-looking hyena. The statue leers with gaping jaws\nover the pool. The apparently bottomless pool is dark and filthly from rotting\nleaves, a peculiar oily film covers its surface. Despite its appearance the\npool is not dangerous.\n* Phillip's Ghost - A distant cackling sound can be heard. Following the\nsound, the dreamers find a stairway going down many flights with torchlight\nbelow. At the bottom of the stairs, the dreamers find a torchlit hallway with\na cell at the end. Within a cackling dwarf uses a human femur to visciously\nbeat a glowing, partially headless, staggering figure. The dwarf is hunched\nand misshapen and has a terrible, inhuman face. Its lips are drawn into a\nsnarl over three-inch fangs. Its eyes are glowing red pits. The figure is\nthe dreamform of Phillip Baxter. If he is rescued, his headless form is\nmindless and helpless. The dwarf with not help under any circumstances.\n* Path to Yib-Tstll - Behind the Palace the jungle becomes stunted and\ntwisted, tree trunks are bent at odd angles, and a general sense of\ndisease pervades the growth. Futher on, alien foliage begins to appear\nincluding quivering fungi and twisting weird ferns. Further still, a\ngreat stone arch can be seen surrounded by dead trees. Through the arch\ncan be seen another alien jungle evidently on a far-off world. The arch\nis clearly a permanent gate, and plants and insects can be seen crossing\nboth ways as if the arch were simple stone.\n* World of Yib-Tstll - Beyond the arch, the sky is dark green and\nstarless. Swollen insects swoop ominously from deadly-looking blooms.\nFlying horrors with veinous wings fly high above. Not far away, a vast,\nblack clearing is visible.\n* The Clearing - The clearing is roughly a mile across. The black surface\nis composed of fine flakes like snow, but it is warm to the touch. If the\ndreamers heed the Pnakotic Manuscripts, they should crawl on hands and\nknees across the black clearing facing the ground to avoid actually seeing\nYibb-Tstll. As the dreamers near the center, Yib-Tstll rises suddenly\nfrom the black clearing. Dreamers may attempt to avert their gaze or\nsuffer the madness induced by his presence.\n* [Yibb-Tstll] - The massive being speaks telepathically with a booming\nalien voice. Each dreamer must make a [Spirit] test or Yibb-Tstll will\nignore that person completely. If the test is completely failed,\nYibb-Tstll will touch the person and impart its feared reversal.\nYibb-Tstll is suprisingly helpful and will answer questions about the\nCthulhu Mythos and things of cosmic import including Nemesis, but he will\nonly give a single answer on a subject and will not clarify himself.\n* Reversals - Any dreamer who suffers a reversal will instantly be\ndriven insane or his human form or dream form will be permanently killed.\nIf an insane dreamer is brought to him, Yibb-Tstll will fully restore\nhis sanity. If the dwarf is present, Yibb-Tstll will reverse him, and his\ndream form will change into the Tcho-Tcho priest while his real form will\nbecome the dwarf. If the headless form and the ghoul's page are brought\nbefore him, he touches them both and Phillip Baxter's dream fomr is\nrestored, but back in the real world, Silas Patterson has become a mad\nimitation of Phillip Baxter.\n* Web of Eibon - Yibb-Tstll instructed Eibon in his construction of the\nWeb of Eibon spell with which he planned to freeze time around Nemesis\n(and Earth) to prevent Earth's destruction. Yibb-Tstll knows his efforts\nwill fail in the end, but it provided the instructions anyway."
                    ),
                    "The Quest of Ghouls",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "The Quest of Ghouls",
                      ":summary",
                      "* Ghoul Dream - After the events at St. Augustine and the Dreamlands, one\nnight the investigators find themselves having hazy dreams of the\ngraveyard at St. Augustine. Suddenly, the dream sharpens and 3 figures\nstart crawling from an open grave: ghouls like the ones that may have\nbeen seen at St. Augustine. The ghouls stinking breath reeks of death and\ndecay. The ghouls do not appear to be hostile, instead they start urging\nthe investigators to come with them to see the wise man and there is\nlittle time left before dawn. A terrific stench issues from the open\ngrave. Below rotten bits of wood and fabric lie on the grave floor and a\nnarrow, twisting tunnel leads into darkness. The ghouls gibber that they\nmust hurry and start climbing down the hole. If the dreamers don't follow\nthe tunnel begins to slowly close. If the dreamers still do not follow,\nthey awake normally, but the opportunity to learn more has been lost. If\nthey do follow, the tunnel collapses behind them and they will have to\nfollow the ghouls forward.\n* Grath the Leader - Young and handsome by ghoul standards, Grath leads\nthe group and most often speaks with the dreamers. He had a riding zebra,\nbut the group got hungry and ate most of it.\n* Mairpl the Big - Mairpl is much larger than the others, speaks little,\nand wields a club in battle.\n* Ug the Hungry - The worst and most degenerate of them, Ug speak no\nhuman language and spends most of his time on four legs. He avoids the\nhumans, but can often be seen staring and drooling over them. He possess\nno threat, but he likes to fantasize.\n* The Page - At the end of the tunnel waits the Page. The Page is wrapped\nin a dirty brown cloak with his face hidden. His body is bent forward\nand staggers under the weight of an enormous tombstone chained to his\nback. The ghouls order the Page around and play viscious practical jokes\non him. Below the hood can be found Sila Patterson's face, though it\nshows no recognition. Upon the tombstone is written 'Phillip A. Baxter\n1865-1925.' The Page is, of course, the dream form of Silas Patterson,\nsuffering from the guilt of the death of his friend.\n* The Quest - The ghoul gang seeks to rescue a female ghoul Horella who\nhas disappeared. The ghouls are fairly melodramatic about how beautiful\nshe is and how they must rescue her from whatever peril she is in. To\nfind Horella, they seek the insight of the wise Man of the Mountain. This\nman supposedly is very wise and will answer any questions.\n* Social Ettiquette - After a few hours of travel, the ghouls stop for\nnourishment. They squat down and rummage through their stained sacks.\nThey produce vaguely familiar cuts of raw meat with tinges of green along\nwith sour wine. The source of the meat is all too obvious. The ghouls\nlike their food well-aged and, out of respect, offer their guests the\noldest pieces. The bags also contain the remains of Grath's zebra which\nthe ghouls are more than happy to hand over, leaving the tastier pieces\nfor themselves."
                    ),
                    "Journey to the Stony Desert",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Journey to the Stony Desert",
                      ":summary",
                      "* The Underworld - The ghoul tunnel leads to the Underworld. Once in the\nUnderworld, the tunnel leads upward for 3 days through the center of a\nhuge mountain. Many ohter tunnels branch off, but the ghouls seem to know\ntheir way. Drinking water oozes down the rock wall. Bloated fungi, pale,\nfoot-long crickets, and eyeless carnivorous rats server as food. Most of\nthe trip is in complete darkness. Occasionally, luminescent fungi provide\na tiny amount of light. The tunnels connect the Vaults of Zin where\ndangerous ghasts, serpent folk, or worse may be encountered. Eventually,\nthe group exits the Underworld at the border of the [Stony Desert].\n* [Stony Desert] - Grath says the journey eastward across the desert will\nonly take a few days. They seek the sacred mountain [Mt. Hatheg-Kla] where\na holy man can tell them where fair Horella can be found.\n* Walker of the Stony Desert - A few days journey into the desert, the\ndreamers see, off in the distance, a man leading a horse. They will meet\nin about an hour. As they draw near, it is clear that the man is enormous,\ntowering over the horse. He is 8 feet tall, 400 lbs, and dressed all in\nblack. His horse seems old and tired and lags behind being pulled by a\nrope. The horse is an elderly nag with cataract films covering both eyes.\nThe ghouls are terrified of the man and will not approach. He does not\nstop walking unless he is attacked. This being is the dream-form of Eibon.\nthe Hyperborean wizard who, like the spell he cast to capture Eibon is\nbound to travel back and forth across the Stony Desert. A legend says\nthat one day he shall find a way out of the desert. On that day, the\nhorse shall be healthy and the man shall then ride the horse. Where he\ngoes then, he does not know for the horse shall be the master. He freely\ndiscusses his trip across the desert, Mythos knowledge, Nemesis, and his\nspell the Web of Eibon that Yibb-Tstl taught him. He now knows that\nstagnation is worse than destruction by Nemesis. If asked about Nemesis,\nhe produces a large, shining jewel from the air and offers it to the\ndreamers. He says simply that all brave souls will know what to do when\nthe time comes. Any attempt to attack Eibon results in him disappearing\nand reappearing far in the distance continuing his endless travels."
                    ),
                    "The Man on the Mountain",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "The Man on the Mountain",
                      ":summary",
                      "* [Hatheg-Kla] - A day or two after meeting the Walker, the slabs become\nmore numerous. As they approach Mt. Hatheg-Kla, smoe of the slabs are\nstill turned upright in the ground and bear traces of ancient carvings.\nSoon it becomes obvious that they are travelling in a titanic graveyard.\n* Climbing Hatheg-Kla - Mairpl assures them that this is the only way to\nsee the holy man and ask where Horella is being kept. The other ghouls\nwill wait here while Mairpl and any brave dreamers attempt the climb.\nThe way up seems somewhat trecherous and will require a [Climb] roll to\nsucceed. If that roll fails, a second [Climb] roll must be made to catch\nyourself before you fall to your doom. Unfortunately, Mairpl fails both\nrolls and falls far below splattering on the rocks and potentially\ninjuring those below. After a short period of remorse, Grath and Ug\ngather some of the larger pieces and add them to their provision bags.\n* The Man on the Mountain - Near the skull tree, an old, bearded man in a\nyellow robe sits on a heap of corpses plundered from the cemetary below.\nHe deftly uses a silver hatchet to cut pieces of the corpses and flings\nthe dripping gobbets above his head as the circling Byakhees swoop down\nto catch them from the air. As the dreamers approach, the Byakhee scream\nand chatter, but the man pays them no mind. If hailed, he smiles warmly,\nand if asked questions he will honestly answer based on his vast\nknowledge of the Dreamlands and the Mythos. Knowledge comes at a price,\nso before he answers each question, he hurls his hatchet at the questioner\nwhich instantly slices off an appendage, starting with a hand. The Byakhee\nswoop down and eat the tidbit. The wound does not bleed and only hurts for\na moment. The damage is permanent in the Dreamlands, but each time a\ndreamer returns to the Dreamlands one wound is healed. If asked, he tells\nthat Horella is at the castle of Bombel, the giant, in the hills to the\neast of the [Stony Desert]. Anyone foolish enough to attach the man, is\nattacked by the Byakhee, rended to pieces, and eaten.\n* Cave of the Child God - Behind the tree, the shear face of Hatheg-Kla\nrises another 1000 feet before the cave entrance. A flight of steps, each\none foot wide, criss-crosses back and forth up the slope. Anyone nearing\nthe opening hears a deep sobbing and suckling sound as if from some\nenormous infant. The cave itself is completely black and no light will\npenetrate it. If anyone enters, a few seconds later, horrifying screams\nof agony echo from the cave accompanied by sucking, popping sounds and\na soft, cooing voice. The screams continue for almost a minute before\nthey are choked off by a gurgling, bubbling sound and a huge spray of\nblood that shoots from the cave. The character's dream-self is dead, and\nhis waking self has been driven mad by the horrific dreamform of Nemesis."
                    ),
                    "Castle of Bombel",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Castle of Bombel",
                      ":summary",
                      "* To the Castle - The Man on the Mountain has directed the dreamers\ntoward a castle to the east of the [Stony Desert]. The trip takes a few\ndays through the desert and another day throught wooded hills.\n* The Castle - The rude, three-story castle is in a clearing. It has a\nsingle window at the top and a door at the bottom.\n* Bombel - Near the castle, sitting on a boulder is a huge [Gug]. At the\nfirst sign of intruders, it rushes to the attack.\n* Horella - Shortly after Bombel starts fighting, a foul-looking, scaly\nghoul appears in the window. This is Horella, and she immediately begins\nhurling vile insults and rocks at the Gug. The ghouls are cheered on by\nher presence, but if someone listens they realize that she is exhorting\nBombel to kill the intruders. Dreamers may also notice previous bruises\non Bombel's head. If Bombel falls, Horella turns her insults and rocks\nat her would-be rescuers. Any remaining ghouls grab a chain from their\nbags, say 'To the rescue', capture Horella, and drag her bumping down\nthe stairs. The ghouls bid farewell and will offer the page as a reward\nfor the dreamers help."
                    )
                  )
                ),
                "Nemesis: Spawn of Azathoth",
                vx_core.f_new(
                  nx_tactics_base.t_section,
                  ":name",
                  "Nemesis: Spawn of Azathoth",
                  ":scenariomap",
                  vx_core.f_new(
                    nx_tactics_base.t_scenariomap,
                    "Trip to Darjeeling",
                    vx_core.f_new(
                      nx_tactics_base.t_scenario,
                      ":name",
                      "Trip to Darjeeling",
                      ":summary",
                      "* Francis Wilson - Francis is one of the Tuesday Night Academy. He was at Phillip's funeral and he has been in Russia researching the Tunguska Blast and its possible relationship to Nemesis. He has made some discoveries and sends a telegram to Judge Braddock who forwards it along. The message says to leave immediately for Darjeeling, India and to meet Colonel Hugh Huntley of the British Foreign Office.\n* Darjeeling -\n* Colonel Hugh Huntley - Francis has arranged with the British Foreign Office to allow the investigators to travel to Lhasa, Tibet to aid him in his research. Colonel Huntley provides them with papers and can help arrange transport to the British Legation in Lhasa where Francis Wilson is staying.\n* Road to Lhasa - The 400 mile journey to Lhasa can only be taken on foot or via horse-drawn caravan. The route is heavily trafficked by pilgrims, traders, smugglers, and spies. The journey takes weeks and is alternately terrifying, boring, facinating, cold, and misery-making.\n* Lhasa - Lhasa is a sprawling squat city with no building taller than 2 stories except for the Potala, the home of the Dalai Lama. The Potala is a bulky, stone structure that is imposing but unattractive.\n* The British Legation - The Legation is on the outskirts of Lhasa. Here Francis Wilson has residence. He seems thinner and more stressed than at the funeral. He has been researching the Tunguska Blast and mad Rasputin's apparent presence at the blast. After piecing together his research, he illegally entered the Soviet Union and stole parts of Rasputin's journal. He then fled to Tibet through Mongolia. He has been translating sections since then. He claims that Rasputin met someone called Eibon in his dreams, and that this Eibon told him of his own death. Eibon also warned him of a dark star that would fall from the sky. This Eibon gave him a stone that he used to destoy the star. He further foretells another dark star that would fall long after Rasputin's death in Tibet. Francis guesses that the location may be near an abandoned temple roughly 300 miles north of Lhasa. He has found a guide Lha-bzang who studied in the temple as a child.\n* Lha-bzang - Francis plans to travel there soon with a native Tibetan, Lha-bzang. Lha-bzang is a domden, a Tibetan mortician. A skilled Anthropologist may recall that Tibetan funeral rites involve the corpse being hacked to bits by the axe-wielding domden and then fed to ravens or vultures. Lha-bzang's dream form is the holy man on the mountain. Lha-bzang is going on the journey to expand his spiritual understanding. Unfortunately, he has also been paid off by a Soviet spy. If questioned about the temple, he says he was sold as a slave as a child but he fled the temple when he realized that their teachings were not Buddhist.\n* Ivan Dorkyev - A Soviet spy who has been tracking Francis down since Francis stole Rasputin's journal in Leningrad. He is over 6 feet tall and is dressed in the tattered robes of a yak-herder. Beneath, he carries two pistols, a knife, and a bandolier of ammo. He hides at his camp in the mountains near the ruins waiting for Lha-bzang to bring Francis.\n* Trip to the Ruins - Lha-bzang leads the expedition 300 miles through a tangle of steep mountain passes, brackish lakes, and arid valleys. On the way, they encounter kay-herders, small mountain monasteries, and moutain farms. About 2 weeks in to the trip, while camped, a minor earth tremor shakes everyone awake. A week laker, they arrive at the Nenmka temple, sitting on the slope of a mountain.\n* The Temple - The temple is now just a windswept ruin. A Mythos knowledge test reveals that the fallen columns have inscriptions used to invoke Hastur. The Soviet spy has watched the investigators approach and waits in hiding nearby. Lha-bzang finds a section of flooring with symbols on a tile. Here he will perform a ceremony to discover more about Nemesis.\n* The Ceremony - Lha-bzang sits and lights a clay pipe containing a tarball of hashish. He passes the pipe around and then begins a droning wail. After 30 minutes, he retrieves a knife and a freshly severed human hand from his bag. He cuts his own palm, smears blood on the hand, and binds the cut. He then passes the knife to each person to do the same. If any will not, he gestures for them to leave the prayer circle. After another 5 minutes, the hand twitches and then turns toward Lha-bzang. He asks where can they find the Seed of Nemesis. The hand then crawls to a symbols on the ground indicating 'not far' and 'north-east'. Additional questions may be asked but each question causes the questioner to receive a minor Sanity Wound. Answers are always very short, and the hand only knows local events. The Soviet spy waits nearby but has accepted Lha-bzang's demand to allow the ceremony to complete before acting.\n* Confrontation - Just as the ceremony is concluded, Ivan steps into the room brandishing his pistols and warning everyone to stay where they are. He is deadly serious and will gun down anyone who makes sudden movements. Ivan plans to take Francis back to the Soviet Union to stand trial for the many laws he has broken and suspiscion of being a spy. He has no knowledge of Nemesis and has nothing but contempt for the superstitious, religious ritual. If given the chance, he will tie up the investigators and then take Francis and Lha-bzang (his ally) in the morning.\n* The Fallen Seed - In the early morning, everything changes. Along with the bright sun, a halo forms in the sky, though this halo does not surround anything visible, yet. Dorkyev is thunder-struck; he and Francis exchange words in Russian. Ever the pragmatist, Dorkyev frees everyone and begins a descent toward the valley under the halo. Within the valley, the halo light is flat and oily, and its color melts through shades of yellow and green as though through a prism. Lha-bzang vomits and flees. Suddenly, all present feel their hair stand on end as the halo darkens and takes on a dull gun-metal hue. The slight wind disappears and everything is silent. Then, high above a sizzling sound grows in intensity. Suddenly a hideous scream is heard followed by a thunderous blast that knocks everyone off their feet. Everyone suffer partial hearing loss and if a check versus [Body] is completely failed, the loss is permanent. A blinding light rips through the sky and crashes to Earth over the valley ridge that Lha-bzang crossed. A massive explosion rocks the ground and a curtain of flame passes overhead. If not for the ridge, everyone would have been incinerated along with Lha-bzang.\n* Crater - Peeking over the ridge, a 20 foot crater can be seen with a sickly, green light emanating from it. Wilson frantically says that Eibon's symbol must be placed on the Seed or it will destroy the Earth. Those who have witnessed the Seed in Montana know that any who approach the Seed will die: quickly or slowly. If no one volunteers and no one has a plan, Dorkyev swears, snears of their cowardice, and takes the jewel to the crater. Alas, just as he climbs the crater and is exposed to the light, he screams and immediately melts into a puddle before everyone's horrified sight. Worse, he drops the jewel into the crater. If someone uses a mirror, they can see the jewel near the Seed which is slowly melting the rock around it with its terrible power. Wilson adamantly refuses to go (and will melt if pushed), so someone will have to sacrifice themself or watch the Seed sink into the ground and doom the world.\n* Eye to Azathoh - The doomed person must resist the corrupting rays, retrieve the jewel, and then touch it to the Seed. Nothing happens for a few moments, then the Seed suddenly shimmers and disappers with a sharp pop. The Seed is gone but a black, marble tunnel lies in its place. The jewel lies on the ground before the tunnel. Hyperborean symbols line the tunnel. This is Eibon's work. When the jewel crosses the threshold, it suddenly reverts to the heavy glowing stone from the Dreamlands. There is a steady breeze down the tunnel and a light can be seen ahead. After 100 meters, a room 250 meter, circular opens up. The room is the exact same shape as the jewel. The breeze has become a howling gale ending in a 5 meter gateway in the center of the other end of the room. The gateway in the center of the oval room gives the impression of an eye looking out into space.\n* Gateway - The gateway can be reached by a ramp that slopes upward 50 meters. Stars can clearly be seen through the opening, and it is clear that the gate leads directly into outer space. Anyone who has been exposed to the Seed radiance, has an intense desire to go through the gate and join Nemesis. Anyone approaching the gate will need ropes or climbing skill to cling to the reliefs on the floor or be sucked into oblivion. Also, the jewel gains weight as it approaches the gate, as if it is resisting, eventually becoming over 100lbs. If someone can get close or has binoculars, that person will see that the area of space beyond the portal is filled with criss-crossing black lines forming a faint web. Someone may recognize the black substance and The Black associated with Yibb-Tsll. This is Eibon's Web taught to him by Yibb-Tsll. Within the web, an observers intuitively senses that time is slowing to a crawl. Further, the web is creeping through the portal into our world. This is how mad Eibon hoped to save mankind, by freezing us forever in time, so Nemesis can never destroy us.\n* The End - If the jewel is brought near the gate, in addition to its increased weight, the Black lines start to reach toward the jewel. Simply hurling the jewel through the portal will gather all the webs onto the jewel which breaks the spell of Eibon. If anyone returns to the Stony Desert, they will no longer find Eibon there. The world will no longer be trapped forever in frozen time, but Nemesis will still return some day to end the world, but it will not be today."
                    )
                  )
                )
              ),
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Julian Baxter",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Julian Baxter",
                  ":summary",
                  "* Julian Baxter is a priest and brother of Phillip Baxter. He is confined to a\nwheelchair and is heavily dependent on his son Matthew. Before becoming a priest,\nJulian was educated as a psychotherapist. He has traveled the world on missions, but\nsince becoming crippled he has returned to his home town.\n* Julian has a copy of the Book of Eibon in his library. It has a section\nwhere Eibon fortells the end of mankind with the coming of Nemesis. Eibon\nwas obcessed with preventing man's destruction and spent the rest of his\nlife developing a ritual call the Web of Fate that would supposedly save\nmankind when the time was right. Eibon claims that as Nemesis approaches,\nthe Web of Fate will draw together seemingly unrelated events, defeat\nNemesis, and create an eternal golden age for mankind. The reading clearly\nshows Eibon's progressive descent into madness."
                ),
                "Matthew Baxter",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Matthew Baxter",
                  ":summary",
                  "* Matthew is the adopted, grown son of Julian Baxter. He is strong, but he is also\nmute and aeuteistic. This combination makes him appear simple, but he is actually\nquite competent. He is an avid dreamer where there is no trace of his aeutism. In\ndreams he is a city council member in Ultar. He can be a strong ally, but he must\nbe approached in the Dreamlands, as it is impossible to gain his friendship in the\nreal world."
                ),
                "Silas Patterson",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Silas Patterson",
                  ":summary",
                  "* Silas is a friend of both Phillip and Julian Baxter, a past professor at Brown\nUniversity, a former antrhopologist, and a member of the Tuesday Night Academy. He is\nquite fit considering his age.\n* Silas met Julian Baxter in the Congo in 1904 and became friends. In 1919, he met\nCynthia Baxter, Julian's niece in the Andaman Islands. In 1920, he came to Providence\nwhere he met Phillip and joined the Tuesday Night Academy. Phillip soon after helped\nhim get a teaching position at Brown.\n* Silas practices a form of cannibalism he learned in New Guinea at the instruction\nof a degenerate Tcho-Tcho priest. The ceremony involves eating the brains of a\nrecently slain primate to gain extended life. This habit made him lose his job at\nBrown when it was discovered that he was stealing monkey corpse from the lab. He has\nsince made an arrangement with a local undertaker with low moral character, Alvin\nBeswick. Silas told Beswick that he was performing brain research, but Beswick is\njust concerned with the money. Beswick allows him access to closed coffin corpses\nfor a price. He was given access to Phillip's corpse and noticed the small bite marks\non the scalp. While devouring the brain, Phillip suddenly lurched back to\nconsciousness and thrased wilding before dying. Silas was terrified and is wracked\nwith guilt over his friend's death. He is maintaining his sanity through denial, and\nif he is forced to confront what he has done, he will retreat inward and become\ncatatonic and need to be institutionalized.\n* Silas is friendly, but he not only knows his role in Phillip's death but is\nreasonably sure that Cynthia was involved. He is planning to return to the Andaman\nIslands to investigate Cynthia's activities and also because it is getting hard to\nhide his youth in Providence.\n* In Sila's desk can be found notes for his next book, about cannibalism. The notes\nindicate that Silas is unbalanaced. In his files can be found the lease to a\nfarmhouse.\n* Investigating the farmhouse, leads to the table where Phillip met his end. No\nattempt has been mde to cover up the crime."
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
   * @function chapter_deadly_beasts
   * @return {chapter}
   */
  static t_chapter_deadly_beasts = {}
  static e_chapter_deadly_beasts = {vx_type: nx_tactics_books_horror.t_chapter_deadly_beasts}

  // (func chapter_deadly_beasts)
  static f_chapter_deadly_beasts() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Deadly Beasts",
      ":reference",
      "* Jaws, Phase IV, Them"
    )
    return output
  }

  /**
   * @function chapter_horror_overview
   * @return {chapter}
   */
  static t_chapter_horror_overview = {}
  static e_chapter_horror_overview = {vx_type: nx_tactics_books_horror.t_chapter_horror_overview}

  // (func chapter_horror_overview)
  static f_chapter_horror_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Horror Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Horror?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Horror?"
        )
      )
    )
    return output
  }

  /**
   * @function chapter_kingdom_of_the_gods
   * @return {chapter}
   */
  static t_chapter_kingdom_of_the_gods = {}
  static e_chapter_kingdom_of_the_gods = {vx_type: nx_tactics_books_horror.t_chapter_kingdom_of_the_gods}

  // (func chapter_kingdom_of_the_gods)
  static f_chapter_kingdom_of_the_gods() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Kingdom of the Gods",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Kingdom Undead",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Kingdom Undead",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            "Resurrection Herb",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Resurrection Herb",
              ":summary",
              "* This rare herb is believed to return the dead to life. Actually, it is the tiny worm eggs that grow on the plant that infect the host and turn them into a zombie.\n* Infection - The worms can infect a living host if worms, their eggs, or infected flesh are eaten (even cooking is not a guarantee of safety) or the worms transfer via an ghoul bite. A recently deceased host may also be infected if the eggs are injected directly into the brain.\n* Transformation - Once infected the worms rapidly multiply by division and move through the body. Once fully infected, the worms act as replacement nervous system, stimulating the cells and retarding cell death. The worms stimulate the primitive sections of the brain to cause it to seek more hosts for the worms. The When they first activate the body, its movements are jerky and extreme, but the body quickly adapts and becomes quite agile over time.\n* Pack - The worms are a colony creature and are aware of nearby worms in infected creatures. They, therefore, do not attack other infecteds and tend to collect together in groups.\n* Intelligence Level - Though they are savagely murderous and largely fearless, they do retain an animalistic survival instinct and take shelter and avoid fire and heat which would kill their worms."
            )
          ),
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Kingdom Ghoul",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Kingdom Ghoul",
              ":summary",
              "* Strengths:\n** Agility and endurance: In some scenes, they were able to bring down a full-size horse and nearly match the speed of one for short, sustained periods of time.\n** Short incubation period: It takes about 15 seconds to 1 minute for a victim to turn into an undead zombie. Making them effectively at multiplying and overwhelming urban centres. However, this can vary. One main character was able to resist the infection for over 2 minutes.\n** Durability: It has been observed that even if their internal organs are exposed or took a direct stab from a sword to their chest, this doesn't kill them.\n** Heightened sense of smell: A fresh drop of blood from an uninfected human can attract other infected bodies many meters away.\n* Weakness:\n** Decapitation: They're capable of taking damage that would be fatal to most men. It was found that decapitation or destruction of the head is the most effective in killing them.\n** Aversion to water bodies: It has been observed they will generally avoid travelling on water bodies. They have no ability to swim, and when they are pushed into deeper waters, they will immediately sink to the bottom.\n** Heat: They have been observed to immediately seek shelter when the day begins to break in order to escape the heat of direct sunlight. As a result, during spring or summer, they are only active during the day and hibernate at night.\n** Fire: Fire can be used to keep infected at bay.\n** Reduced vision: The milky eyes limits their vision to basic movements, so they rely on smell and hearing to hunt.\n** Blood: Blood can be used to distract or bait the zombies to behave in certain ways. Although dangerous, using fresh blood on rooftops is shown to be an effective means to lure zombies if needed."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_night_of_the_living_dead
   * @return {chapter}
   */
  static t_chapter_night_of_the_living_dead = {}
  static e_chapter_night_of_the_living_dead = {vx_type: nx_tactics_books_horror.t_chapter_night_of_the_living_dead}

  // (func chapter_night_of_the_living_dead)
  static f_chapter_night_of_the_living_dead() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Night of the Living Dead"
    )
    return output
  }

  /**
   * @function chapter_serial_killers
   * @return {chapter}
   */
  static t_chapter_serial_killers = {}
  static e_chapter_serial_killers = {vx_type: nx_tactics_books_horror.t_chapter_serial_killers}

  // (func chapter_serial_killers)
  static f_chapter_serial_killers() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Serial Killers",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        ":Freaks",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Freaks",
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Backwoods Crazies",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Backwoods Crazies",
              ":reference",
              "* Deliverance, Hills Have Eyes, Texas Chainsaw Massacre"
            )
          )
        ),
        "Unstoppable Killer",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Unstoppable Killer",
          ":reference",
          "* Friday the 13th, Nightmare on Elm Street"
        )
      )
    )
    return output
  }

  /**
   * @function tacticsbook
   * @return {book}
   */
  static t_tacticsbook = {}
  static e_tacticsbook = {vx_type: nx_tactics_books_horror.t_tacticsbook}

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Horror",
      ":image",
      "Cthulhu.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Horror Overview",
        nx_tactics_books_horror.f_chapter_horror_overview(),
        "Call of Cthulhu",
        nx_tactics_books_horror.f_chapter_call_of_cthulhu(),
        "Kingdom of the Gods",
        nx_tactics_books_horror.f_chapter_kingdom_of_the_gods(),
        "Night of the Living Dead",
        nx_tactics_books_horror.f_chapter_night_of_the_living_dead(),
        "Serial Killers",
        nx_tactics_books_horror.f_chapter_serial_killers(),
        "Deadly Beasts",
        nx_tactics_books_horror.f_chapter_deadly_beasts()
      )
    )
    return output
  }

  // empty types


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_call_of_cthulhu": nx_tactics_books_horror.e_chapter_call_of_cthulhu,
      "chapter_deadly_beasts": nx_tactics_books_horror.e_chapter_deadly_beasts,
      "chapter_horror_overview": nx_tactics_books_horror.e_chapter_horror_overview,
      "chapter_kingdom_of_the_gods": nx_tactics_books_horror.e_chapter_kingdom_of_the_gods,
      "chapter_night_of_the_living_dead": nx_tactics_books_horror.e_chapter_night_of_the_living_dead,
      "chapter_serial_killers": nx_tactics_books_horror.e_chapter_serial_killers,
      "tacticsbook": nx_tactics_books_horror.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_call_of_cthulhu": nx_tactics_books_horror.t_chapter_call_of_cthulhu,
      "chapter_deadly_beasts": nx_tactics_books_horror.t_chapter_deadly_beasts,
      "chapter_horror_overview": nx_tactics_books_horror.t_chapter_horror_overview,
      "chapter_kingdom_of_the_gods": nx_tactics_books_horror.t_chapter_kingdom_of_the_gods,
      "chapter_night_of_the_living_dead": nx_tactics_books_horror.t_chapter_night_of_the_living_dead,
      "chapter_serial_killers": nx_tactics_books_horror.t_chapter_serial_killers,
      "tacticsbook": nx_tactics_books_horror.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/horror",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_call_of_cthulhu)
    nx_tactics_books_horror.t_chapter_call_of_cthulhu['vx_type'] = vx_core.t_type
    nx_tactics_books_horror.t_chapter_call_of_cthulhu['vx_value'] = {
      name          : "chapter_call_of_cthulhu",
      pkgname       : "nx/tactics/books/horror",
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
      fn            : nx_tactics_books_horror.f_chapter_call_of_cthulhu
    }

    // (func chapter_deadly_beasts)
    nx_tactics_books_horror.t_chapter_deadly_beasts['vx_type'] = vx_core.t_type
    nx_tactics_books_horror.t_chapter_deadly_beasts['vx_value'] = {
      name          : "chapter_deadly_beasts",
      pkgname       : "nx/tactics/books/horror",
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
      fn            : nx_tactics_books_horror.f_chapter_deadly_beasts
    }

    // (func chapter_horror_overview)
    nx_tactics_books_horror.t_chapter_horror_overview['vx_type'] = vx_core.t_type
    nx_tactics_books_horror.t_chapter_horror_overview['vx_value'] = {
      name          : "chapter_horror_overview",
      pkgname       : "nx/tactics/books/horror",
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
      fn            : nx_tactics_books_horror.f_chapter_horror_overview
    }

    // (func chapter_kingdom_of_the_gods)
    nx_tactics_books_horror.t_chapter_kingdom_of_the_gods['vx_type'] = vx_core.t_type
    nx_tactics_books_horror.t_chapter_kingdom_of_the_gods['vx_value'] = {
      name          : "chapter_kingdom_of_the_gods",
      pkgname       : "nx/tactics/books/horror",
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
      fn            : nx_tactics_books_horror.f_chapter_kingdom_of_the_gods
    }

    // (func chapter_night_of_the_living_dead)
    nx_tactics_books_horror.t_chapter_night_of_the_living_dead['vx_type'] = vx_core.t_type
    nx_tactics_books_horror.t_chapter_night_of_the_living_dead['vx_value'] = {
      name          : "chapter_night_of_the_living_dead",
      pkgname       : "nx/tactics/books/horror",
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
      fn            : nx_tactics_books_horror.f_chapter_night_of_the_living_dead
    }

    // (func chapter_serial_killers)
    nx_tactics_books_horror.t_chapter_serial_killers['vx_type'] = vx_core.t_type
    nx_tactics_books_horror.t_chapter_serial_killers['vx_value'] = {
      name          : "chapter_serial_killers",
      pkgname       : "nx/tactics/books/horror",
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
      fn            : nx_tactics_books_horror.f_chapter_serial_killers
    }

    // (func tacticsbook)
    nx_tactics_books_horror.t_tacticsbook['vx_type'] = vx_core.t_type
    nx_tactics_books_horror.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/horror",
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
      fn            : nx_tactics_books_horror.f_tacticsbook
    }

  }
}
