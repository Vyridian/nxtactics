'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_space_and_time {

  /**
   * @function chapter_dimensional_travel
   * @return {chapter}
   */
  static t_chapter_dimensional_travel = {
    vx_type: vx_core.t_type
  }
  static e_chapter_dimensional_travel = {
    vx_type: nx_tactics_books_space_and_time.t_chapter_dimensional_travel
  }

  // (func chapter_dimensional_travel)
  static f_chapter_dimensional_travel() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Dimensional Travel",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Dimensional Rules",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Dimensional Rules",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Parallel Dimensions",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Parallel Dimensions"
            ),
            "Dimensional Ripples",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Dimensional Ripples",
              ":summary",
              "* Changes made to one dimension can cause similar changes to nearby parallel dimensions like ripples in a pond. Temporal Distortion Waves always cause Dimensional Ripples."
            ),
            "Dimensional Storm",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Dimensional Storm",
              ":summary",
              "* A Dimensional Storm is a theoretical disaster where the barriers between dimensions are broken and events from unrelated time periods and dimensions become mixed up creating chaos across multiple dimensions."
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_space
   * @return {chapter}
   */
  static t_chapter_space = {
    vx_type: vx_core.t_type
  }
  static e_chapter_space = {
    vx_type: nx_tactics_books_space_and_time.t_chapter_space
  }

  // (func chapter_space)
  static f_chapter_space() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Space",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Space Maps",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Space Maps",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Space Scale",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Space Scale",
              ":summary",
              "* 1 Turn = ?\n* 1 Space = ?\n* 24 x 20 map = ?"
            ),
            "Planetary Scale",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Planetary Scale",
              ":summary",
              "* 1 Turn = ?\n* 1 Space = ?\n* 24 x 20 map = ?"
            ),
            "Interplanetary Scale",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Interplanetary Scale",
              ":summary",
              "* 1 Turn = ?\n* 1 Space = ?\n* 24 x 20 map = ?"
            ),
            "Stellar Scale",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Stellar Scale",
              ":summary",
              "* 1 Turn = ?\n* 1 Space = ?\n* 24 x 20 map = ?"
            ),
            "Galactic Scale",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Galactic Scale",
              ":summary",
              "* 1 Turn = ?\n* 1 Space = ?\n* 24 x 20 map = ?"
            )
          )
        ),
        ":Universe",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Universe",
          ":reference",
          "* The story so far: In the beginning the Universe was created. This has made a lot of people\nvery angry and been widely regarded as a bad move. - Douglas Adams, The Restaurant at the\nEnd of the Universe."
        ),
        "Solar System",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Solar System",
          ":itemmap",
          vx_core.f_new(
            nx_tactics_base.t_itemmap,
            ":Europa",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Europa",
              ":reference",
              "* It's a ocean that is perhaps 10 times as deep as Earth's ocean. It is an ocean\nthat is global and may contain 2 to 3 times the volume of all the liquid water on\nEarth. - Europa: Ocean World",
              ":summary",
              "* Europa is a ball of ice composed of frozen water and methane. Its surface ice is\n10km thick covering a liquid water ocean 100km deep. Gravitatioal flux occasionally\ncreates water vapor geysers out of the long brown cracks zigzagging across the\nsurface. These plumes quickly freeze and slowly fall back down as ice crystals."
            ),
            ":Io",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Io",
              ":reference",
              "* The movie Outland takes place on Io.",
              ":summary",
              "* Io is a ball of sulfur and sulfer dioxide convered with enormous geysers spitting plumes 300-1400km high. Its core is overheated by gravitational flux between Jupiter and Europa."
            ),
            ":Saturn",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Saturn",
              ":image",
              "SpaceAndTime/Saturn.png",
              ":summary",
              "* 763 times the volume of Earth\n* Optimal Travel Time from Earth: .01g=2.5 months, .1g=26 days, 1g=9 days",
              ":length",
              "120Mm",
              ":mass",
              "5.7x10^23tons"
            ),
            ":Titan",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Titan",
              ":image",
              "SpaceAndTime/Titan.png",
              ":length",
              "5Mm",
              ":mass",
              "1.3x10^20tons"
            ),
            ":Uranus",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Uranus",
              ":image",
              "SpaceAndTime/Uranus.png",
              ":length",
              "51Mm",
              ":mass",
              "6.7x10^22tons"
            ),
            ":Neptune",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Neptune",
              ":image",
              "SpaceAndTime/Neptune.png",
              ":length",
              "49Mm",
              ":mass",
              "1x10^23tons"
            ),
            ":Pluto",
            vx_core.f_new(
              nx_tactics_base.t_item,
              ":name",
              "Pluto",
              ":image",
              "SpaceAndTime/Pluto.png",
              ":length",
              "2Mm",
              ":mass",
              "1.3x10^19tons"
            )
          ),
          ":placemap",
          vx_core.f_new(
            nx_tactics_base.t_placemap,
            ":Sun",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Sun",
              ":image",
              "SpaceAndTime/Sun.png",
              ":reference",
              "Far out in the uncharted backwaters of the unfashionable end of the western spiral arm of the Galaxy lies a\nsmall unregarded yellow sun. - Hitchhiker's Guide to the Galaxy",
              ":mass",
              "2x10^27tons"
            ),
            ":Mercury",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Mercury",
              ":image",
              "SpaceAndTime/Mercury.png",
              ":summary",
              "* Optimal Travel Time from Earth: .01g=16 days, .1g=7 days, 1g=2 days",
              ":mass",
              "3x10^20tons",
              ":length",
              "4.8Mm"
            ),
            ":Venus",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Venus",
              ":image",
              "SpaceAndTime/Venus.png",
              ":summary",
              "* Optimal Travel Time from Earth: .01g=10 days, .1g=4 days, 1g=1.5 days",
              ":titles",
              "Evening Star, Morning Star",
              ":mass",
              "5x10^21tons",
              ":length",
              "12.1Mm"
            ),
            ":Earth",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Earth",
              ":image",
              "SpaceAndTime/Earth.png",
              ":reference",
              "Though below me, I feel no motion\nStanding on these mountains and plains\nFar away from the rolling ocean\nStill my dry land heart can say\nI've been sailing all my life now\nNever harbor or port have I known\nThe wide universe is the ocean I travel\nAnd the earth is my blue boat home\n\nSun, my sail, and moon my rudder\nAs I ply the starry sea\nLeaning over the edge in wonder\nCasting questions into the deep\nDrifting here with my ship's companions\nAll we kindred pilgrim souls\nMaking our way by the lights of the heavens\nIn our beautiful blue boat home\n\nI give thanks to the waves upholding me\nHail the great winds urging me on\nGreet the infinite sea before me\nSing the sky my sailor's song\nI was born upon the fathoms\nNever harbor or port have I known\nThe wide universe is the ocean I travel\nAnd the earth is my blue boat home - Peter Mayer, Blue Boat Home",
              ":mass",
              "6x10^21tons",
              ":length",
              "12.6Mm"
            ),
            ":Moon",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Moon",
              ":image",
              "SpaceAndTime/Moon.png",
              ":reference",
              "* The monthly cycle of the moon, in contrast to the annual cycle of the sun's path, has been implicitly linked to women's menstrual cycles by many cultures, although rarely explicitly stated. Many of the most well-known mythologies feature female lunar deities.",
              ":summary",
              "* The moon rotates on its axis in about 27 days. Daytime on one side of the moon lasts about 13 and a half days, followed by 13 and a half nights of darkness. When sunlight hits the moon's surface, the temperature can reach 253 degrees F (123 C). The dark side can have temperatures dipping to minus 243 F (minus 153 C).\n* New Moon - A person born under the new moon will have an underlying sense of youthful enthusiasm and optimism. They will probably prefer to take the initiative, especially in romance, and will be ready to look for new interests in life, new people and new ideas. The person will see how things can be improved and can spur others to action, before leaving them to finish the project. They need to guard against selfishness and taking others by surprise with over quick and hasty reactions.\n* Waxing Moon - A person born under a waxing moon will be ambitious and sociable. The person will be locked into their goals and have a strong need to create something which will be remembered by others. They will have a charismatic personality that draws others to them, but may instinctively use others for their own ends, rather than help them. They prefer a career where they are out in front and have attention and status. The person will be slow to anger, but formidable when aroused, and hates to be hurried or presented with a fait accompli. However, they won't mind doing this to others if it tips the odds in their favor.\n* Full Moon - A person born under a full moon will be sensitive to the needs of others and expects others to be sensitive to their own needs. There is an underlying sense of watchfulness. The person will need friendships, colleagues and  relationships, and will relate well to others. They will either be drawn to highly successful people and help them achieve their goals, or else achieve success themselves with the help of others. There is a tension and nervousness at play which can lead to a short attention span and a constant search for new people and experiences, and sex will play some kind of transformative role in their life.\n* Waning Moon - A person born under a waning moon will finish the projects that others start, and reorganize and sort out the problems left by others. They will often have clairvoyant insight and follow hunches rather than be logical. The person can be too sensitive and become upset by the demands of others, and can also be too inclined to sit back and let things happen.",
              ":mass",
              "7x10^19tons"
            ),
            ":Mars",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Mars",
              ":image",
              "SpaceAndTime/Mars.png",
              ":summary",
              "* Has two moons: Phobos and Deimos which may be captured asteroids.\n* Optimal Travel Time from Earth: .01g=15 days, .1g=6 days, 1g=2 days",
              ":titles",
              "Red Planet",
              ":mass",
              "6.4x10^20tons",
              ":length",
              "6.8Mm"
            ),
            "Asteroid Belt",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Asteroid Belt",
              ":image",
              "SpaceAndTime/AsteroidBelt.png",
              ":summary",
              "* Gravitational pull from Jupiter prevented the asteroid field from forming into a planet. It has far too little mass to have ever been a planet.\n* This belt is now estimated to contain between 1.1 and 1.9 million asteroids larger than 1 km (0.6 mi) in diameter and millions of smaller ones."
            ),
            "Asteroid C Type",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Asteroid C Type",
              ":summary",
              "* Chondrite Asteroids - most common, clay and silicate rocks"
            ),
            "Asteroid M Type",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Asteroid M Type",
              ":summary",
              "* Metallic Asteroids"
            ),
            "Asteroid S Type",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Asteroid S Type",
              ":summary",
              "* Stony Asteroids"
            ),
            ":Ceres",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Ceres",
              ":image",
              "SpaceAndTime/Ceres.png",
              ":summary",
              "* Ceres - With a diameter of about 950km, Ceres is by far the largest and most massive body in the asteroid belt, and contains approximately a third of the belt's total mass. The surface of Ceres is probably made of a mixture of water ice and various hydrated minerals like carbonates and clays. It may harbour an ocean of liquid water, which makes it a target of current searches for extraterrestrial life. Ceres may be surrounded by a tenuous atmosphere containing water vapour.\n* Optimal Travel Time from Earth: .01g=32 days, .1g=12 days, 1g=4 days",
              ":mass",
              "9x10^17tons",
              ":length",
              "950km"
            ),
            ":Jupiter",
            vx_core.f_new(
              nx_tactics_base.t_place,
              ":name",
              "Jupiter",
              ":image",
              "SpaceAndTime/Jupiter.png",
              ":reference",
              "* The movie Outland takes place on Io, one of Jupiter's moons.",
              ":summary",
              "* Optimal Travel Time from Earth: .01g=1.75 months, .1g=18 days, 1g=6 days",
              ":mass",
              "2x10^24tons",
              ":length",
              "143Mm",
              ":placemap",
              nx_tactics_base.f_placemap_from_placelist(
                vx_core.f_new(
                  nx_tactics_base.t_place,
                  ":name",
                  "Jupiter Trojan Asteroid Belt",
                  ":summary",
                  "* There are 2 Asteroid fields at the Lagrange points at both sides of Jupiter. They may be as many asteroids here as in the asteroid belt."
                )
              )
            )
          )
        ),
        "Space Terrain",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Space Terrain",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Magnetic Storm",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Magnetic Storm",
              ":image",
              "Units/SpaceAndTime/MagneticStorm.jpg",
              ":summary",
              "* [+1 Hazard]\n* Blocks [Line of Sight]\n* A Magnetic Storm is treated as a [Nebula] with the following additional effects.\n* [-1 Communications] per space from the edge of the field.\n* [-1 Shielding] per space from the edge of the field."
            ),
            "Micro-meteor Field",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Micro-meteor Field"
            ),
            ":Nebula",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Nebula",
              ":image",
              "Units/SpaceAndTime/Nebula.jpg",
              ":summary",
              "* Nebulas are placed randomly on the map.\n* At the beginning of the game roll 1 die to determine Speed and 1 die to randomize direction.\n* At the end of each turn all nebulas move their Speed in the given direction.\n* [+1 Hazard]\n* Blocks [Line of Sight]"
            ),
            "Solar Flare",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Solar Flare",
              ":image",
              "Units/SpaceAndTime/SolarFlare.jpg",
              ":reference",
              "This photograph shows one of the most spectacular solar flares ever recorded; the base of the flare is more than 591Mm across."
            )
          ),
          ":unitmap",
          vx_core.f_new(
            nx_tactics_base.t_unitmap,
            "Arctic World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Arctic World"
            ),
            "Arid World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Arid World"
            ),
            "Asteroid Field",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Asteroid Field",
              ":image",
              "Units/SpaceAndTime/Asteroid.png",
              ":summary",
              "* Asteroid fields are placed randomly on the map.\n* At the beginning of the game roll 1 die to determine Speed and 1 die to randomize direction.\n* At the end of each turn all asteroids move their Speed in the given direction.\n* If they collide with a unit, use the asteroid's and the unit's Speed and Body to determine damage.\n* [+2 Hazard]",
              ":height",
              "500km",
              ":length",
              "500m",
              ":width",
              "500m"
            ),
            "Black Hole",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Black Hole",
              ":image",
              "Units/SpaceAndTime/BlackHole.png",
              ":summary",
              "* Accretion Disk\n* Event Horizon",
              ":titles",
              "Singularity"
            ),
            "Blue Giant Star",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Blue Giant Star"
            ),
            ":Comet",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Comet",
              ":image",
              "Units/SpaceAndTime/Comet.png"
            ),
            "Debris Field",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Debris Field",
              ":image",
              "Units/SpaceAndTime/SpaceDebris.jpg",
              ":summary",
              "* [+2 Hazard]\n* Debris Fields are treated as an [Asteroid Field].\n* Any large unit that explodes is replaced with a Debris Field."
            ),
            "Desert World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Desert World"
            ),
            "Dyson Sphere",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Dyson Sphere"
            ),
            "Gas Giant",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Gas Giant"
            ),
            "Greenhouse World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Greenhouse World"
            ),
            "Ionized Atmosphere World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ionized Atmosphere World",
              ":summary",
              "* Atmosphere is heavily ionized which produces powerful lightning storms and regularly disrupts electrical systems and communications."
            ),
            "Irradiated World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Irradiated World"
            ),
            "Jungle World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Jungle World"
            ),
            ":Meteorite",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Meteorite",
              ":reference",
              "Armaggeddon"
            ),
            "Methane Ocean World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Methane Ocean World"
            ),
            "Neutron Star",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Neutron Star",
              ":image",
              "Units/SpaceAndTime/NeutronStar.png",
              ":reference",
              "* 12 miles across and 1.4 times the mass of the sun.  One teaspoonful would weigh a billion tons.",
              ":mass",
              "2x10^27tons",
              ":length",
              "20km"
            ),
            "Ocean World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ocean World"
            ),
            "Proto World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Proto World"
            ),
            ":Pulsar",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Pulsar",
              ":image",
              "Units/SpaceAndTime/Pulsar.png"
            ),
            "Red Giant Star",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Red Giant Star"
            ),
            "Ring World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ring World"
            ),
            "Ringed Gas Giant",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Ringed Gas Giant"
            ),
            "Solar Storm World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Solar Storm World",
              ":summary",
              "* This planet is routinely bombarded by intense solar radiation. The planet itself is not radioactive, but when solar storms appear all life is scoured from any exposed surface. Life underground or underwater is possible."
            ),
            "Seasonally Extreme World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Seasonally Extreme World",
              ":summary",
              "* A planet with a very oblong orbit and high axial shift will produce severe changes in seasons shifting from artic to tropic environments during the year. Such a punishing environment is difficult for complex life to develop. Simple life forms will tend toward short life spans or hibernation during winter months with a massive spring bloom and fall die off."
            ),
            "Seasonless World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Seasonless World",
              ":summary",
              "* A planet with a nearly circular orbit and minor axial shift will produce bands of terrain where the seasons don't change throughout the year. Polar areas are uniformly cold and equatorial areas are uniformly hot. Such a predictable environment is ideal for life to develop."
            ),
            "Seismic World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Seismic World"
            ),
            "Stony World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Stony World"
            ),
            "Storm World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Storm World"
            ),
            "Swamp World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Swamp World",
              ":summary",
              "* The combination of mild greenhouse effect and high amounts of surface water creates a world where most land masses are densely covered with vegetation. Very little dry land exists and the vegetation mostly has its roots underwater. Some particularly dense vegetation can be walked on. Quicksand, parasites, insects, water predators, and other threats are common."
            ),
            "Toxic World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Toxic World"
            ),
            "Tropical World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tropical World"
            ),
            "Tundra World",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Tundra World"
            ),
            "Yellow Star",
            vx_core.f_new(
              nx_tactics_base.t_unit,
              ":name",
              "Yellow Star"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_space_and_time_overview
   * @return {chapter}
   */
  static t_chapter_space_and_time_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_space_and_time_overview = {
    vx_type: nx_tactics_books_space_and_time.t_chapter_space_and_time_overview
  }

  // (func chapter_space_and_time_overview)
  static f_chapter_space_and_time_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Space and Time Overview",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Why Tactics: Space and Time?",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Why Tactics: Space and Time?",
          ":summary",
          "* Space is deadly to any normal lifeforms.\n* Militarily space represents the ultimate high ground.  Anyone in orbit can see everything below and can reach any place on a planet in minutes."
        )
      )
    )
    return output
  }

  /**
   * @function chapter_space_travel
   * @return {chapter}
   */
  static t_chapter_space_travel = {
    vx_type: vx_core.t_type
  }
  static e_chapter_space_travel = {
    vx_type: nx_tactics_books_space_and_time.t_chapter_space_travel
  }

  // (func chapter_space_travel)
  static f_chapter_space_travel() {
    let output = nx_tactics_base.e_chapter
    vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Space Travel",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Space Travel Rules",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Space Travel Rules",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Planetary Gravity",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Planetary Gravity",
              ":summary",
              "* Microgravity - 0G to .2G - Microgravity only exists in space and on moons. Low gravity favors the development of tall, slight frames who will have much difficulty in 1G environments. Worlds with such low gravities do not maintain an atmosphere.\n* Very Low Gravity - .2G to .5G - Very Low gravity exists on small planets and large moons. Low gravity favors the development of tall, slight frames who will have difficulty in 1G environments. Worlds with such low gravities do not maintain an atmosphere.\n* Low Gravity - .5G to .8G - Low exists on smaller planets. Low gravity favors the development of tall frames. Worlds with low gravities will have thin atmospheres and consequently be exposed to higher levels of radiation.\n* Terran Gravity - .8G to 1.2G\n* High Gravity - 1.2G to 1.5G - High gravity exists on larger planets. High gravity favors short, heavy frames.\n* Very High Gravity - 1.5G to 2.5G - Very high gravity exists on larger planets. Very high gravity favors short, heavy frames.\n* Intense Gravity - 1.8G to 2.5G - Intense gravity exists on gas giant planets like Jupiter. Few creatures can survive such extreme gravity where the atmosphere is extremely dense.\n* Extreme Gravity - 2.5G+ - Extreme gravity exists on stars like the Sun (28G) with the extreme end being a Neutron star (300,000,000,000G) or a black hole."
            ),
            "Planetary Atmosphere",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Planetary Atmosphere",
              ":summary",
              "* Micropressure - 0 to .5 atmospheres - Micropressure only exists in space and even on\nTerran-sized planets (such as Mars). Most creatures cannot survive such low\npressure.\n* Low Pressure - .5 to .8 atmospheres - Low pressure can exist on Terran-sized\nplanets and very large moons. Low pressure favors the development of expanded lung\ncapacity and relative resistance to hypoxia. Conversely such creatures struggle\nwhen breathing the 'soup' of higher pressure environments and may require\nbreathing aids.\n* Terran Gravity - .8 to 1.5 atmospheres - Terran normal\n* High Presssure - 1.5 to 4 atmospheres - High pressure exists on larger planets\nand underwater on any planet.\n* Very High Pressure - 4 to 100 atmospheres -\n* Intense Pressure - 100 to 1000 atmospheres - Equal to the bottom of the terran\nocean.\n* Extreme Pressure - 1000+ atmospheres -"
            ),
            "Space Heat Disspation",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Space Heat Disspation",
              ":summary",
              "* There are three modes of heat transfer: conduction, convection, and radiation.\nThe first two require a medium that space does not provide, so most heat is\ndissipated via radiation, but when necessary, heat can also be dissipated by\nvaporizing a small amount of reaction mass."
            ),
            "Space Movement",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Space Movement",
              ":summary",
              "* Use [Vector Movement] rules with the following modifications.\n* All objects are always moving.  Only the relative difference in speed is important, not the speed itself.\n* In space, [Speed] represents acceleration/deceleration and is measured in g's (1g=10m/s/s).\n* Given sufficient fuel, there is no practical maximum to the speed attainable.  It would take 3.5 days at 1g to reach\n1% of the speed of light."
            ),
            "Space Combat",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Space Combat",
              ":reference",
              "* He's intelligent, but not experienced.  His pattern indicates two-dimensional thinking. - Spock, Star Trek II",
              ":summary",
              "* Any dropped items, including clouds and mines continue moving at the same speed and direction of the dropping unit."
            ),
            "Space Travel",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Space Travel",
              ":reference",
              "* At least 100 times the total energy output of the entire world would be required for the voyage to Alpha Centauri in\nunder 100 years.",
              ":summary",
              "* Space Travel is a two-piece problem; accelerate for half time (and half distance), then decelerate the other half time (and distance).\n* Travel Time: If you know the desired acceleration of your spacecraft (generally one g or 9.81 m/s2) and wish to calculate the transit time, the Brachistochrone equation is:\n** T = 2 * sqrt[ D/A ]\n** where T = transit time (seconds), D = distance (meters), A = acceleration (m/s2)\n\n* Travel Time with Coasting: Spacecraft that cannot accelerate the entire distance must coast during the middle of the trip and use the following calculation:\n** T = ((D - (A * t^2)) / (A * t)) + (2*t)\n** where T = transit time (seconds), D = distance (meters), A = acceleration (m/s2), t = duration of acceleration\nphase (seconds), just the acceleration phase only, NOT the acceleration+deceleration phase.\n* Note that the coast duration time is of course = T - (2*t)\n* Acceleration: If you know the desired transit time and wish to calculate the required acceleration, the equation\nis: A = (4 * D) / T2"
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_time_travel
   * @return {chapter}
   */
  static t_chapter_time_travel = {
    vx_type: vx_core.t_type
  }
  static e_chapter_time_travel = {
    vx_type: nx_tactics_books_space_and_time.t_chapter_time_travel
  }

  // (func chapter_time_travel)
  static f_chapter_time_travel() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      nx_tactics_base.t_chapter,
      ":name",
      "Time Travel",
      ":reference",
      "* Philosophy - Though we are now able to travel through time, there remains much speculation over how time travel actually works. The general concensus is that the term 'Time Stream' may be an accurate description. Time acts like a river of water, and we are travelers on that river. But our boats are unpowered, so we drift with the current until we hit the shore. Now, with the power of the Time Rotor, we may move against the current of time to any time or place we choose.",
      ":summary",
      "* The Vortex - The Vortex is a temporal zero-point where time does not exist. The Vortex appears as a tunnel headed away from the viewer regardless of which direction the viewer looks. Entering the Vortex is feels like dying (and probably is a death). Exiting the Vortex is like being born (or reborn).\n* Beings and objects may travel through the the [Vortex] emerging at another point in Time. Every point in time is equi-distant from the [Vortex].",
      ":sectionmap",
      vx_core.f_new(
        nx_tactics_base.t_sectionmap,
        "Time Travel Rules",
        vx_core.f_new(
          nx_tactics_base.t_section,
          ":name",
          "Time Travel Rules",
          ":rulemap",
          vx_core.f_new(
            nx_tactics_base.t_rulemap,
            "Laws of Time",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Laws of Time",
              ":summary",
              "Time Travellers\n* Emphemeral - Those who have never traveled in time are called Ephemerals. All the events of their lives may be altered repeatedly by one or more time travelers, and they will not sense anything is amiss or remember anything about the previous time stream.\n* Temporal - Once a being travels through time, it is permanently separated from the normal time stream and is called a Temporal. The events of a Temporal's life may also be changed by other time travelers, but a Temporal will remember some or all of the previous time stream."
            ),
            "History Can Be Changed",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "History Can Be Changed"
            ),
            "Law of Death",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Law of Death",
              ":reference",
              "Final Destination",
              ":summary",
              "* A Temporal has one limitation that Emphemerals do not: the moment of death of a Temporal cannot be undone. Since only living beings may travel through time, when a Temporal dies, he or she can no longer move forward in time. Even if time is rewritten to prevent the Temporal's death, the time traveler will still die at the exact age of his original death regardless of the circumstances. The cause of death may vary, but death will always occur at the exact age that the original death happened."
            ),
            "Law of Preservation",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Law of Preservation",
              ":summary",
              "* Jumping through time necessarily causes a number of paradoxes, but Time seems to have a self-healing mechanism that limits the scope of changes to the Timeline, provided the changes are small enough. One of these effects is when a person makes a time jump, that jump cannot cause a series of events that ultimately prevents itself. For example: say a person jumped back in time because of a temporal disturbance. He then prevented the disturbance from ever happening. Logically, this is a paradox. If the disturbance never happened, then he would never go back to prevent the disturbance, so the disturbance would happen, so he would go back to prevent the disturbance, etc. Instead the last jump that prevents the disturbance occurs, the disturbance never occurs, and all memory of what happened during the paradox is lost. This time period has become complex but is stable. Of course, a further time jump might erase the actions of the previous jump, since the last jump will always stand despite any paradoxes created."
            ),
            "Loop Trap Paradox",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Loop Trap Paradox",
              ":summary",
              "* Whenever two versions of same person exist at the same point in time, a Loop Trap Paradox is created. The future version of the person immediately vanishes and the past version of the person performs the same actions that the future version did eventually returning to the same moment where both versions exist at the same time and the cycle continues eternally. The person is doomed to repeat the same actions over and over again unless another time traveler intervenes.\n* To avoid Loop Traps, it is vitally important that a time traveler keeps accurate track of every period of time to which he or she has traveled."
            ),
            "Matter Suppression",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Matter Suppression",
              ":summary",
              "* Matter cannot normally travel through time, but time technology allows certain narrow exceptions. Living matter can travel freely through time, seemingly based only on the will to live. Non-living matter, however, decomposes rapidly when moved through time. Non-living objects that travel backwards in time decompose faster the farther back in time they travel. Non-living objects that travel forward in time beyond their original time period decompose immediately. For this reason, no one has been able to travel to a future beyond their time machines 'present' because their time machines vanish stranding them in the Vortex."
            ),
            "Messages in Time",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Messages in Time",
              ":summary",
              "* With the benefit of hindsight, there are many times when it would be convenient to send a message to a past version of yourself to change a course of action. Of course, this would be a paradox: if you don't take the same action in the past, you would never send the message to change the action. If you did attempt to leave a message to a past self, the rule of Matter Suppression would cause the message to disappear to prevent the paradox. However, by placing a message in the Time Rotor, the message can resist Matter Suppression for up to 1 day. If the message is successfully delivered, the future self will typically vanish immediately since that future will have been erased in favor of a new future created by the message.\n* Self Preventing Mission - Using a Message in Time, it is possible to prevent every reason why the initial Time Travel was made. In this case, the mission never occurs, though memories of the trip may remain."
            ),
            "Temporal Disaster Wave",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Temporal Disaster Wave",
              ":summary",
              "* Sometimes massive changes to history will cause such an enormous [Temporal Distortion Wave] that it travels all the way through history to the present. These are called Temporal Disaster Waves. A Disaster Wave will have wide-sweeping ramifications and are far too dangerous and random to allow."
            ),
            "Temporal Distortion",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Temporal Distortion"
            ),
            "Temporal Distortion Wave",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Temporal Distortion Wave",
              ":reference",
              "History Tends to Repeat Itself",
              ":summary",
              "* Major temporal alterations can be made without significantly altering history. Major changes will, however, create a Temporal Distortion Wave. This wave in time will slowly flow around the changed events, making minor alterations in names and events as it goes. Eventually, the wave subsides when history goes back on course with only minor changes to the history books. For Example: killing Hitler as a baby will have little effect on history, because the time stream will find someone else to fill his role, and the history books will just have different names.\n* Severity - A Distortion Wave is rated based on the number of years it will travel before the time stream returns to its normal course. History during this period is altered, but time futureward of the wave is relatively normal.\n* Detection - A person that experiences a wave washing through his/her time stream will experience radical changes to events. Of course, only time travelers will notice these changes as unusual. Those that can analyze the time stream can see the wave traveling through time. If a person is futureward of the wave, he/she will not detect any changes until the wave approaches.\n* Stopping the Wave - A Wave can still be stopped by jumping forward in time past the wave and choosing major events that took place in the normal time stream and forcing them to happen again despite the changes the oncoming Wave would create. This action will act as a dam, preventing the Wave from doing further damage to the future. The time stream is now safe, but the work is not complete because a Standing Wave has been created.\n* Standing Wave- A Distortion Wave that has been stopped futureward will be reflected back to the past changing history back again until it reaches its origin and reflected futureward again repeatining the process, changing time back and forth infinitely in what is called a Standing Wave. A Standing Wave remains very dangerous and can only be ended by preventing the original source of the wave which will return the time stream to normal."
            ),
            "Temporal Memory",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Temporal Memory",
              ":summary",
              "* When a Temporal has his time stream rewritten by another Time Traveler, it is possible to retain dream-like memories of the time line that no longer exists."
            ),
            "Traveling Futureward",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Traveling Futureward",
              ":summary",
              "* Traveling to Ones Own Future - Time machines cannot travel farther forward in time beyond their 'present'. Any attempt to do so results in the immediate disintegration of the time machine and passengers are stranded in the Vortex.\n* Futureward Time Hops - The simplest way of performing multiple time hops is to travel back to a time period and then make a number of futureward hops from there. In this way one can see the development of a subject over time such as the construction of a building. It also allow one to view the consequences of any changes made to history.\n* Futureward Time Hops Complications - Making forward hops essentially avoids paradoxes, but other problems can occur. People may recognize you which can be a problem if your appearance hasn't changed. They may ask questions about the intervening time and why they never kept in touch. If you keep arriving in the same spot at different times, you may set yourself up for an ambush. Be cautious and change your physical destination as well as your temporal on each jump."
            ),
            "Traveling Pastward",
            vx_core.f_new(
              nx_tactics_base.t_rule,
              ":name",
              "Traveling Pastward",
              ":summary",
              "* Traveling to Ones Own Past - Any attempt to enter a time period where you have already been creates a [Loop Trap Paradox]. Your future version immediately vanishes and the past version infinitely repeats the steps leading to the Loop Trap.\n* Pastward Time Hops - Multiple jumps back in time are often desirable because as one learns more about the current situation it is usually easier to go further back in time to alter the situation before it has fully developed. When done perfectly, the original problem can be prevented entirely.\n* Pastward Time Hops Complications - Altering the past is the way to create paradoxes. Multiple pastward hops increases the risk with each hop. As you progressively change the past, you may also cause changes to your own past. You can find yourself appearing in a time period with no memory of why."
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
    vx_type: nx_tactics_books_space_and_time.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Space and Time",
      ":image",
      "Space.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Space and Time Overview",
        nx_tactics_books_space_and_time.f_chapter_space_and_time_overview(),
        "Space Travel",
        nx_tactics_books_space_and_time.f_chapter_space_travel(),
        "Space",
        nx_tactics_books_space_and_time.f_chapter_space(),
        "Dimensional Travel",
        nx_tactics_books_space_and_time.f_chapter_dimensional_travel(),
        "Time Travel",
        nx_tactics_books_space_and_time.f_chapter_time_travel()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_dimensional_travel": nx_tactics_books_space_and_time.e_chapter_dimensional_travel,
      "chapter_space": nx_tactics_books_space_and_time.e_chapter_space,
      "chapter_space_and_time_overview": nx_tactics_books_space_and_time.e_chapter_space_and_time_overview,
      "chapter_space_travel": nx_tactics_books_space_and_time.e_chapter_space_travel,
      "chapter_time_travel": nx_tactics_books_space_and_time.e_chapter_time_travel,
      "tacticsbook": nx_tactics_books_space_and_time.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_dimensional_travel": nx_tactics_books_space_and_time.t_chapter_dimensional_travel,
      "chapter_space": nx_tactics_books_space_and_time.t_chapter_space,
      "chapter_space_and_time_overview": nx_tactics_books_space_and_time.t_chapter_space_and_time_overview,
      "chapter_space_travel": nx_tactics_books_space_and_time.t_chapter_space_travel,
      "chapter_time_travel": nx_tactics_books_space_and_time.t_chapter_time_travel,
      "tacticsbook": nx_tactics_books_space_and_time.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/space_and_time",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_dimensional_travel)
    nx_tactics_books_space_and_time.t_chapter_dimensional_travel['vx_value'] = {
      name          : "chapter_dimensional_travel",
      pkgname       : "nx/tactics/books/space_and_time",
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
      fn            : nx_tactics_books_space_and_time.f_chapter_dimensional_travel
    }

    // (func chapter_space)
    nx_tactics_books_space_and_time.t_chapter_space['vx_value'] = {
      name          : "chapter_space",
      pkgname       : "nx/tactics/books/space_and_time",
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
      fn            : nx_tactics_books_space_and_time.f_chapter_space
    }

    // (func chapter_space_and_time_overview)
    nx_tactics_books_space_and_time.t_chapter_space_and_time_overview['vx_value'] = {
      name          : "chapter_space_and_time_overview",
      pkgname       : "nx/tactics/books/space_and_time",
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
      fn            : nx_tactics_books_space_and_time.f_chapter_space_and_time_overview
    }

    // (func chapter_space_travel)
    nx_tactics_books_space_and_time.t_chapter_space_travel['vx_value'] = {
      name          : "chapter_space_travel",
      pkgname       : "nx/tactics/books/space_and_time",
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
      fn            : nx_tactics_books_space_and_time.f_chapter_space_travel
    }

    // (func chapter_time_travel)
    nx_tactics_books_space_and_time.t_chapter_time_travel['vx_value'] = {
      name          : "chapter_time_travel",
      pkgname       : "nx/tactics/books/space_and_time",
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
      fn            : nx_tactics_books_space_and_time.f_chapter_time_travel
    }

    // (func tacticsbook)
    nx_tactics_books_space_and_time.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/space_and_time",
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
      fn            : nx_tactics_books_space_and_time.f_tacticsbook
    }

  }
}
