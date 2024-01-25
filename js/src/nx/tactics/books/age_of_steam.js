'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_age_of_steam {

  /**
   * @function bk
   * @return {book}
   */
  static t_bk = {}
  static e_bk = {vx_type: nx_tactics_books_age_of_steam.t_bk}

  // (func bk)
  static f_bk() {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      nx_tactics_base.t_book,
      ":name",
      "Age of Steam",
      ":image",
      "WildWest.jpg",
      ":chaptermap",
      vx_core.f_new(
        nx_tactics_base.t_chaptermap,
        "Age of Steam Overview",
        vx_core.f_new(
          nx_tactics_base.t_chapter,
          ":name",
          "Age of Steam Overview",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Why Tactics: Age of Steam?",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Why Tactics: Age of Steam?"
            ),
            "Age of Steam Personal Combat",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Age of Steam Personal Combat",
              ":summary",
              "* Dueling\n* Civil War\n* Cowboys\n* Indians\n* Bandits\n* Cattle Rustlers\n* Marksman"
            ),
            "Age of Steam Land Warfare",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Age of Steam Land Warfare",
              ":summary",
              "* Infantry\n* Cavalry\n* Pistols\n* Rifles\n* Cannons\n* Artillery\n* Gatling Guns\n* Trains"
            ),
            "Age of Steam Naval Warfare",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Age of Steam Naval Warfare",
              ":summary",
              "* Wind\n* Large Ships\n* Small Ships\n* Solid Shot\n* Burning Shot\n* Chain Shot"
            )
          )
        ),
        "Age of Steam Equipment",
        vx_core.f_new(
          nx_tactics_base.t_chapter,
          ":name",
          "Age of Steam Equipment",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Age of Steam Weaponry",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Age of Steam Weaponry",
              vx_core.f_new(
                vx_core.t_msgblock,
                ":msgs",
                vx_core.f_new(
                  vx_core.t_msglist,
                  vx_core.f_new(
                    vx_core.t_msg,
                    ":code",
                    ":invalidtagfound",
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
                        ":severity",
                        2
                      )
                    )
                  )
                )
              )
            ),
            "Steam Age Vehicles",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Vehicles",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Horseless  Carriage",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Horseless  Carriage"
                ),
                "Mailplane Biplane",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Mailplane Biplane"
                ),
                "Ocean Liner",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Ocean Liner",
                  ":titles",
                  "Liner, Steam Liner"
                ),
                ":Stagecoach",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Stagecoach"
                ),
                "Steam Ferry",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Steam Ferry"
                ),
                "Steam Train Boxcar",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Steam Train Boxcar"
                ),
                "Steam Train Caboose",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Steam Train Caboose"
                ),
                "Steam Train Coach",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Steam Train Coach"
                ),
                "Steam Train Locomotive",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Steam Train Locomotive"
                ),
                "Steam Train Private Coach",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Steam Train Private Coach"
                ),
                ":Steamboat",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Steamboat"
                ),
                "Tramp Freighter",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Tramp Freighter"
                ),
                ":Zepplin",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Zepplin",
                  ":titles",
                  "Dirigible"
                )
              )
            )
          )
        ),
        "Steam Age Maps",
        vx_core.f_new(
          nx_tactics_base.t_chapter,
          ":name",
          "Steam Age Maps",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Steam Age Terrain",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Terrain",
              ":rulemap",
              vx_core.f_new(
                nx_tactics_base.t_rulemap,
                ":Mine",
                vx_core.f_new(
                  nx_tactics_base.t_rule,
                  ":name",
                  "Mine"
                ),
                ":Tumbleweed",
                vx_core.f_new(
                  nx_tactics_base.t_rule,
                  ":name",
                  "Tumbleweed"
                ),
                "Western Town",
                vx_core.f_new(
                  nx_tactics_base.t_rule,
                  ":name",
                  "Western Town"
                )
              )
            )
          )
        ),
        "Civil War",
        vx_core.f_new(
          nx_tactics_base.t_chapter,
          ":name",
          "Civil War",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Civil War Scenarios",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Civil War Scenarios",
              vx_core.f_new(
                vx_core.t_msgblock,
                ":msgs",
                vx_core.f_new(
                  vx_core.t_msglist,
                  vx_core.f_new(
                    vx_core.t_msg,
                    ":code",
                    ":invalidtagfound",
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
                        ":severity",
                        2
                      )
                    )
                  )
                )
              )
            ),
            "Confederate Army",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Confederate Army",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Confederate Cannon",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Confederate Cannon"
                ),
                "Confederate Conscript",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Confederate Conscript"
                ),
                "Confederate Gatling Gunner",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Confederate Gatling Gunner"
                ),
                "Confederate Medic",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Confederate Medic"
                ),
                "Confederate Officer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Confederate Officer"
                ),
                "Confederate Veteran",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Confederate Veteran"
                )
              )
            ),
            "Confederate Navy",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Confederate Navy",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Merrimack",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Merrimack",
                  ":titles",
                  "CSS Virginia",
                  ":mass",
                  "4500tons",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidproperty",
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
                            ":invalidproperty",
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
                            ":invalidproperty",
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
                            ":invalidproperty",
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
            "Union Army",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Union Army",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Union Cannon",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Union Cannon"
                ),
                "Union Conscript",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Union Conscript"
                ),
                "Union Gatling Gunner",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Union Gatling Gunner"
                ),
                "Union Medic",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Union Medic"
                ),
                "Union Officer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Union Officer"
                ),
                "Union Veteran",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Union Veteran"
                )
              )
            ),
            "Union Navy",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Union Navy",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "USS Monitor",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "USS Monitor",
                  ":mass",
                  "1000tons",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidproperty",
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
                            ":invalidproperty",
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
                            ":invalidproperty",
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
                            ":invalidproperty",
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
                            ":severity",
                            2
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        ),
        "Victorian England",
        vx_core.f_new(
          nx_tactics_base.t_chapter,
          ":name",
          "Victorian England",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Victoraian Characters",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Victoraian Characters",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Dr. John Watson",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Dr. John Watson"
                ),
                "Herbert George Wells",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Herbert George Wells"
                ),
                "Jack the Ripper",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Jack the Ripper"
                ),
                "Sherlock Holmes",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Sherlock Holmes",
                  ":reference",
                  "* Watson: What made like this?\n* Sherlock: Oh, dear Watson. Nothing made me ... I made me."
                )
              )
            )
          )
        ),
        "Wild West",
        vx_core.f_new(
          nx_tactics_base.t_chapter,
          ":name",
          "Wild West",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Western Scenarios",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Western Scenarios",
              vx_core.f_new(
                vx_core.t_msgblock,
                ":msgs",
                vx_core.f_new(
                  vx_core.t_msglist,
                  vx_core.f_new(
                    vx_core.t_msg,
                    ":code",
                    ":invalidtagfound",
                    ":severity",
                    2
                  )
                )
              )
            ),
            "Steam Age Outlaws",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Outlaws",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Bandito",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Bandito",
                  ":image",
                  "Western/BanditoToken.png",
                  ":reference",
                  "You think you're better than I am?  Where we came from, if one did not want to die of poverty, one became a\npriest or a bandit! ...You became a priest because you were... too much of a coward to do what I do! - Tuco. The\nGood, the Bad, and the Ugly.",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidproperty",
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
                            ":severity",
                            2
                          )
                        )
                      )
                    )
                  )
                ),
                ":Gunslinger",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Gunslinger",
                  ":image",
                  "Western/GunslingerToken.png",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidproperty",
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
                            ":severity",
                            2
                          )
                        )
                      )
                    )
                  )
                ),
                "Man with No Name",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Man with No Name",
                  ":image",
                  "Western/ManWithNoNameToken.png",
                  ":reference",
                  "* [to Tuco] Tut, tut. Such ingratitude after all the times I saved your life. - Blondie, The Good, the Bad, and\nthe Ugly\n* There are two kinds of people in the world...Those who have a loaded gun and those who dig. You dig! - Blondie,\nThe Good, the Bad, and the Ugly",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidproperty",
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
                            ":severity",
                            2
                          )
                        )
                      )
                    )
                  )
                ),
                "Professional Killer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Professional Killer",
                  ":image",
                  "Western/ProfessionalKiller.png",
                  ":reference",
                  "He paid me a thousand.  I think his idea was that I kill you.  But you know, the pity is when I'm paid, I always\nfollow my job through. - Angel Eyes, The Good, the Bad, and the Ugly",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidproperty",
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
            "Steam Age Lawmen",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Lawmen",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Deputy",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Deputy"
                ),
                ":Sheriff",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Sheriff"
                ),
                "US Marshall",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "US Marshall",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidtagfound",
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
            "Steam Age Indians",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Indians",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Sioux Gunfighter",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Sioux Gunfighter",
                  ":image",
                  "Western/IndianAxe.jpg",
                  ":reference",
                  "Spotted Horse cannot be killed by a bullet! - Spotted Horse, The Quick and the Dead"
                )
              )
            ),
            "Steam Age Townsfolk",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Townsfolk",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Chinese Monk",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Chinese Monk",
                  ":reference",
                  "I seek not to know the answers, but to understand the questions. - Kwai Chang Caine, Kung Fu TV Series"
                ),
                "Chinese Rail worker",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Chinese Rail worker"
                ),
                ":Cowboy",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Cowboy"
                ),
                ":Dentist",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Dentist"
                ),
                ":Farmer",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Farmer"
                ),
                "General Store Owner",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "General Store Owner"
                ),
                ":Judge",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Judge"
                ),
                ":Preacher",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Preacher"
                ),
                "Saloon Barkeep",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Saloon Barkeep"
                ),
                ":Undertaker",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Undertaker"
                ),
                "Whore with a Heart of Gold",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Whore with a Heart of Gold"
                )
              )
            ),
            "Steam Age Travelers",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Travelers",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                "Carpet Bagger",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Carpet Bagger"
                ),
                ":Gambler",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Gambler",
                  ":summary",
                  "This is a very special pack.  See, I put an ace in every time I kill a man.  (The deck is all aces) - Ace, The Quick and the Dead"
                ),
                ":Prospector",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Prospector"
                ),
                "Snake Oil Salesman",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Snake Oil Salesman"
                )
              )
            ),
            "Steam Age Tycoons",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Steam Age Tycoons",
              ":unitmap",
              vx_core.f_new(
                nx_tactics_base.t_unitmap,
                ":Banker",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Banker"
                ),
                "Land Baron",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Land Baron",
                  ":reference",
                  "All I hear from you...is how poor you are; how you can't afford my taxes.  Yet somehow, you managed to find the\nmoney to hire a gunfighter to kill me.  If ya got so much money, I'm just gonna have to take some more. - John\nHerod,  The Quick and the Dead",
                  vx_core.f_new(
                    vx_core.t_msgblock,
                    ":msgs",
                    vx_core.f_new(
                      vx_core.t_msglist,
                      vx_core.f_new(
                        vx_core.t_msg,
                        ":code",
                        ":invalidtagfound",
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
                            ":severity",
                            2
                          )
                        )
                      )
                    )
                  )
                ),
                "Oil Baron",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Oil Baron"
                ),
                "Railroad Tycoon",
                vx_core.f_new(
                  nx_tactics_base.t_unit,
                  ":name",
                  "Railroad Tycoon"
                )
              )
            )
          )
        ),
        "Examples of Play",
        vx_core.f_new(
          nx_tactics_base.t_chapter,
          ":name",
          "Examples of Play",
          ":sectionmap",
          vx_core.f_new(
            nx_tactics_base.t_sectionmap,
            "Western Gunfight",
            vx_core.f_new(
              nx_tactics_base.t_section,
              ":name",
              "Western Gunfight",
              ":summary",
              "Round 1 - Turn 1\nInitiative\nGunslinger player starts with the initiative, but the Marshall wants to 'Take the Initiative'\nEach Player rolls 2 dice.\n+1 for the player who currently holds initiative.\n+1 for highest skill.\n-1 if most Damaged or Stunned.\nA tie means simultaneous actions.\nGunslinger rolls 6 + 1 (holds initiative) = 7.\nMarshall rolls 8.  Marshall takes the initiative.\nMove\nMarshall is within range of his weapon, so chooses not to move to get the best chance to hit.\nAction\nFast Draw - Marshall is in weapon range and chooses to use Fast Draw to draw his weapon and fire.\nAttack - Fast Draw was a Free Action and Marshall chooses to fire.  He uses his Handgun Skill and any modifiers to determine attack dice.  5 (Handguns) +1 (Accuracy) - 1 (Hip Shoot) = 6 Dice\nMarshall rolls 6 dice and gets 1 (miss), 2 (miss), 2 (miss), 3 (miss), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus die and gets another 6 (critical hit and bonus die).  He rolls the bonus die and gets a 3 (flag).\nMarshall's total roll is 1 hit, 1 critical, and a flag.\nDefense\nGunslinger now rolls dice equal to appropriate defense:  4 Body = 4 Dice\nGunslinger rolls 3 dice and gets 1 (miss), 3 (miss), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus die and gets a 4 (critical hit).\nGunslinger's  total is 2 hits and 1 critical.\nGunslinger's 1 hit cancels one of  Marshall's hits and his 1 critical hit cancels one of Marshall's critical hits.  This leaves Marshall with only a single flag,  Gunslinger had rolled a second hit, but since it can only cancel other hits, it has no effect.\nEffects\nFlags - Gunslinger gains a Flag Token and must retreat one space for each flag.  He therefore retreats 1 space away from Marshall.\nAttack Damage - Since no damage was rolled, Marshall's turn is over.\nRound 1 - Turn 2\nInitiative\nGunslinger player regains the initiative.  Marshall has already taken a turn and cannot do so again this round.\nWhite Tokens - After initiative is determined, Gunslinger must remove a White Token if any.  He removes the Flag token.\nMove\nGunslinger was forced to back by the Flag but is still in his weapon's range, so he will not take an attack penalty.  However, if he moves closer he will take a penalty for moving, so he opts to stay still and fire.\nAction\nFast Draw - Gunslinger also uses Fast Draw to draw and fire.\nAttack - He uses his Handgun Skill and any modifiers to determine attack dice.  5 (Handguns) +1 (Accuracy)  -1 (Hip Shoot) = 5 Dice.\nGunslinger rolls 5 dice and gets 1 (miss), 3 (miss), 4 (hit), 5 (hit), and 5 (hit).  His total roll is 3 hits.  Nice.\nDefense\nMarshall now rolls dice equal to appropriate defense.  4 Body = 4 Dice.\nMarshall rolls 4 dice and gets 1 (miss), 1 (miss), 3 (miss), and 4 (hit).\nMarshall's total is 1 hit.\nMarshall cancels 1 of Gunslinger's hits.  This leaves Gunslinger with 2 hits.\nEffects\nDamage Rating - Since Gunslinger rolled at least 1 hit or critical hit (he scored 2), he checks the damage rating of his Schofield .45.  Its damage rating is 4.  If Gunslinger had rolled less than 4 dice, the Schofield would allow him to roll the difference in additional damage dice.  However, Gunslinger rolled 4 dice already, so he receives no additional dice.\nHits - The first hit is converted to a Stun Token.\nDamage - All subsequent hits are converted to Damage Tokens.\nDamage Summary - 1 Stun Token and 1 Damage Token.\nHit Location - Since we are using Hit Location and did some form of damage, roll 2 dice.  The first determines side of the body: 1-2 is left side, 3-4 is center, and 5-6 is right side.  The second die determines height on the body: 1-2 is low, 3-4 is middle, 5-6 is high.  Marshall rolls 6 (right), 2 (low): Right Shin/Foot.  The 1 Damage Token is therefore on Marshall's Right Shin.  This will limit his movement.\nTurn End\nRound End - Since all units have acted, the round ends.\nRound 2 - Turn 1\nInitiative\nMarshall has the initiative since Gunslinger player ended with the initiative, but Gunslinger predictably wants to 'Take the Initiative' back.  Marshall desperately needs to win initiative to recover a bit from the last hit.\nEach Player rolls 2 dice.\n+1 for the player who currently holds initiative.\n+1 for highest skill.\n-1 if most Damaged or Stunned.\nA tie means simultaneous actions.\nMarshall rolls 4 + 1 (holds initiative) -1 (most Damaged) = 4.\nGunslinger rolls 8 and takes the initiative.  Gunslinger grins.\nWhite Tokens - Gunslinger has no White Tokens.\nMove\nGunslinger presses his advantage and stays and fires hoping to finish this battle.\nAction\nSince their guns are already drawn, neither unit needs to fire from the hip anymore.\nAttack - Gunslinger determines attack dice.  5 (Handguns) +1 (Accuracy)  = 6 Dice.\nGunslinger rolls 6 dice and gets 1 (miss), 1 (miss), 3 (miss), 5 (hit), 5 (hit), and 6 (hit and bonus die).  He rolls the bonus and gets 1 (flag).  His total roll is 3 hits and a flag.  Looking good.\nDefense\nMarshall now rolls dice equal to appropriate defense.  4 Body -1 (Damage) -1 (Stun) = 2 Dice.  Need some good rolls about now.\nMarshall rolls 2 dice and gets 1 (miss) and 1 (miss).  Nothing.\nMarshall is hit dead-on by the Gunslinger.\nEffects\nDamage Rating - Since Gunslinger rolled at least 1 hit or critical hit (he scored 3), he checks the damage rating of his Schofield .45.  Its damage rating is 4 is not more than his 6 dice rolled so no additional dice.\nHits - The first hit is converted to a Stun Token.\nDamage - All subsequent hits are converted to Damage Tokens.\nDamage Summary - 1 Stun Token and 2 Damage Tokens.\nHit Location - Since we are using Hit Location and did some form of damage, roll 2 dice.  The first determines side of the body: 1-2 is left side, 3-4 is center, and 5-6 is right side.  The second die determines height on the body: 1-2 is low, 3-4 is middle, 5-6 is high.  Marshall rolls 2 (left), 4 (center): Left Thigh.  The 2 Damage Tokens are therefore on Marshall's Left Thigh.  This will limit his movement even more.\nDamage Total - 2 Stun Tokens and 3 Damage Tokens (1 on Right Shin, 2 on Left Thigh).  The total of -5 is greater than the Marshall's 4 Body, so he drops to the ground.\nRound 2 - Turn 2\nInitiative\nMarshall has the initiative since Gunslinger has already acted this round.\nWhite Tokens - Marshall removes a  White Token if any.  He removes 1 of the Stun tokens.\nMove\nMarshall is prone and has no Move left to even crawl (Move 4 - 1 (Stun) - 3 (Damage)).\nAction\nMarshall could attack with 5 (Handguns) + 1 (Accuracy) - 1 (Stun) - 3 (Damage) = 2 Dice, but he has no dice to defend next turn, he is Prone (+1) and Helpless (+1) for a total of 8 Gunslinger Dice against his own 0 Dice.  What's more the gunslinger doesn't have a scratch on him.\nThe duel is clearly over, and the Marshall drops his gun and begs for his life."
            )
          )
        )
      )
    )
    return output
  }

  // empty types


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "bk": nx_tactics_books_age_of_steam.e_bk
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "bk": nx_tactics_books_age_of_steam.t_bk
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/age_of_steam",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func bk)
    nx_tactics_books_age_of_steam.t_bk['vx_type'] = vx_core.t_type
    nx_tactics_books_age_of_steam.t_bk['vx_value'] = {
      name          : "bk",
      pkgname       : "nx/tactics/books/age_of_steam",
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
      fn            : nx_tactics_books_age_of_steam.f_bk
    }

  }
}
