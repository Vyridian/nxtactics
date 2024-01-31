package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Magic {

  /**
   * @function chapter_magic_items
   * @return {chapter}
   * (func chapter_magic_items)
   */
  public static interface Func_chapter_magic_items extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_magic_items();
  }

  public static class Class_chapter_magic_items extends Core.Class_base implements Func_chapter_magic_items {

    @Override
    public Func_chapter_magic_items vx_new(Object... vals) {
      Class_chapter_magic_items output = new Class_chapter_magic_items();
      return output;
    }

    @Override
    public Func_chapter_magic_items vx_copy(Object... vals) {
      Class_chapter_magic_items output = new Class_chapter_magic_items();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/magic", // pkgname
        "chapter_magic_items", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
    }

    @Override
    public Func_chapter_magic_items vx_empty() {return e_chapter_magic_items;}
    @Override
    public Func_chapter_magic_items vx_type() {return t_chapter_magic_items;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Magic.f_chapter_magic_items();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_magic_items() {
      return Magic.f_chapter_magic_items();
    }

  }

  public static final Func_chapter_magic_items e_chapter_magic_items = new Magic.Class_chapter_magic_items();
  public static final Func_chapter_magic_items t_chapter_magic_items = new Magic.Class_chapter_magic_items();

  public static Base.Type_chapter f_chapter_magic_items() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Magic Items"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Garb"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Garb"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Fox Mask"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fox Mask")
                      )
                    ),
                    Core.vx_new_string("Oni Mask"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oni Mask")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Miscellaneous Magic"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Miscellaneous Magic"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Fan of the Winds"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fan of the Winds")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Magic Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Magic Weapons"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ascalan Lance"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ascalan Lance"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The lance (or in some versions of the story, sword) that Saint George used to slay the dragon, named after the city Ashkelon."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dragon Slayer Lance")
                      )
                    ),
                    Core.vx_new_string(":Firebrand"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Firebrand"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Flame Tongue")
                      )
                    ),
                    Core.vx_new_string(":Frostbrand"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Frostbrand")
                      )
                    ),
                    Core.vx_new_string(":Moonblade"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Moonblade"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("A silver sword that is as hard as steel")
                      )
                    ),
                    Core.vx_new_string("Poseidon's Net"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poseidon's Net")
                      )
                    ),
                    Core.vx_new_string("Poseidon's Trident"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Poseidon's Trident")
                      )
                    ),
                    Core.vx_new_string(":Runestaff"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Runestaff"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A staff with one or more Runes incribed upon it.")
                      )
                    ),
                    Core.vx_new_string(":Runesword"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Runesword"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A sword with one or more Runes incribed upon it.")
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_magic_overview
   * @return {chapter}
   * (func chapter_magic_overview)
   */
  public static interface Func_chapter_magic_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_magic_overview();
  }

  public static class Class_chapter_magic_overview extends Core.Class_base implements Func_chapter_magic_overview {

    @Override
    public Func_chapter_magic_overview vx_new(Object... vals) {
      Class_chapter_magic_overview output = new Class_chapter_magic_overview();
      return output;
    }

    @Override
    public Func_chapter_magic_overview vx_copy(Object... vals) {
      Class_chapter_magic_overview output = new Class_chapter_magic_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/magic", // pkgname
        "chapter_magic_overview", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
    }

    @Override
    public Func_chapter_magic_overview vx_empty() {return e_chapter_magic_overview;}
    @Override
    public Func_chapter_magic_overview vx_type() {return t_chapter_magic_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Magic.f_chapter_magic_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_magic_overview() {
      return Magic.f_chapter_magic_overview();
    }

  }

  public static final Func_chapter_magic_overview e_chapter_magic_overview = new Magic.Class_chapter_magic_overview();
  public static final Func_chapter_magic_overview t_chapter_magic_overview = new Magic.Class_chapter_magic_overview();

  public static Base.Type_chapter f_chapter_magic_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Magic Overview"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* The Art\n\nClassifications\n* Abjuration - Protective Magic.  They create barriers, negate abilities, harm\ntrespassers, or banish those who do not\nbelong.  It includes Barriers and Wards.")
      )
    );
    return output;
  }

  /**
   * @function chapter_magical_skills
   * @return {chapter}
   * (func chapter_magical_skills)
   */
  public static interface Func_chapter_magical_skills extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_magical_skills();
  }

  public static class Class_chapter_magical_skills extends Core.Class_base implements Func_chapter_magical_skills {

    @Override
    public Func_chapter_magical_skills vx_new(Object... vals) {
      Class_chapter_magical_skills output = new Class_chapter_magical_skills();
      return output;
    }

    @Override
    public Func_chapter_magical_skills vx_copy(Object... vals) {
      Class_chapter_magical_skills output = new Class_chapter_magical_skills();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/magic", // pkgname
        "chapter_magical_skills", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
    }

    @Override
    public Func_chapter_magical_skills vx_empty() {return e_chapter_magical_skills;}
    @Override
    public Func_chapter_magical_skills vx_type() {return t_chapter_magical_skills;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Magic.f_chapter_magical_skills();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_magical_skills() {
      return Magic.f_chapter_magical_skills();
    }

  }

  public static final Func_chapter_magical_skills e_chapter_magical_skills = new Magic.Class_chapter_magical_skills();
  public static final Func_chapter_magical_skills t_chapter_magical_skills = new Magic.Class_chapter_magical_skills();

  public static Base.Type_chapter f_chapter_magical_skills() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Magical Skills"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Magic Items"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Magic Items"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Magic Weapons ignore armor equal to their + value.\n* Magic Armor ignores damage equal to their + value.")
              )
            ),
            Core.vx_new_string("Arcane Magic"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Arcane Magic"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Magic/Magick is not capable of producing 'miracles' or violating the physical laws of the universe (e.g., it cannot cause a solar eclipse), although it is theoretically possible to cause in any object any change of which that object is capable by nature - Aleister Crowley\n* Every intentional (Willed) act is a Magical act. - Aleister Crowley\n* Magick is the Science of understanding oneself and one's conditions. It is the Art of applying that 	understanding in action. - Aleister Crowley"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Those who pursue the arcane arts believe that by aligning their own minds to the patterns of reality, they may turn those patterns to their own ends.\n* Many believe that one must Awaken before being able to wield Magic.\n* Arcanists focus on the will of the individual to bend the world to their desires. This individual supremicist viewpoint is typically reflected in their egos as well."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Arcanist"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Alchemy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Alchemy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Alchemy is the art of creating acids, dusts, philter, and potions.\n* Benefits: Alchemical substances may be prepared ahead of time, used by others, and sold for profit. Their signature talent is the creation of the Philosopher's Stone that transmutes lead into gold. Because their talents benefit others, Alchemists are in high demand.\n* Penalties: Alchemical substances MUST be prepared ahead of time and require exotic ingredients. Their preparation normally requires the use of a laboratory and special equipment (See Equipment / Alchemical Devices)."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Alchemist, Apothecary, Brewer, Chemist, Concocter, Drug Merchant, Libationist, Potioner, Snake Oil Salesman, Witcher"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Animate Colossus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animate Colossus")
                              )
                            ),
                            Core.vx_new_string("Animate Homunculus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animate Homunculus")
                              )
                            ),
                            Core.vx_new_string("Animate Statue"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animate Statue"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Terra Cotta Warriors\n* Kali - The Golden Voyage of Sinbad")
                              )
                            ),
                            Core.vx_new_string("Ashes to Ashes"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ashes to Ashes"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Force a substance to age as if hundreds of years had passed.  Stone wears to powder, wood turns to ashes, metal\ncorrodes, colors fade.")
                              )
                            ),
                            Core.vx_new_string("Exract Rare Earths"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Exract Rare Earths"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Rare Earths are the most important of all alchemical ingredients because they are the catalysts that unleash the\ninnate powers of other ingredients.\n* To those without Alchemical skill, they are indistinguishable from normal soil or sand.  An Alchemist, however,\nmay tell the difference and may extract [Hits] drams of Rare Earths from any soil in an hour.")
                              )
                            ),
                            Core.vx_new_string("Forge Orichalcum"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Forge Orichalcum"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* See Equipment / Metals / Orichalcum")
                              )
                            ),
                            Core.vx_new_string("Forge Rebis"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Forge Rebis"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Rebis (from the Latin res bina, meaning dual or double matter) is the end product of the alchemical magnum opus or great work.\n* After one has gone through the stages of putrefaction and purification, separating opposing qualities, those qualities are united once more in what is sometimes described as the divine hermaphrodite, a reconciliation of spirit and matter, a being of both male and female qualities as indicated by the male and female head within a single body. The sun and moon correspond to the male and female halves, just as the Red King and White Queen are similarly associated.")
                              )
                            ),
                            Core.vx_new_string(":Imbue"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imbue")
                              )
                            ),
                            Core.vx_new_string("Magnum Opus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnum Opus"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The process of working with the prima materia to create the philosopher's stone. It has been used to describe personal and spiritual transmutation.\n* Prima Materia - The ubiquitous starting material required for the magnum opus. It is the primitive formless base of all matter similar to chaos, the quintessence or aether.\n* Process philosophy - An approach to philosophy that identifies processes, changes, or shifting relationships as the only true elements of the ordinary, everyday real world. It treats other real elements (examples: enduring physical objects, thoughts) as abstractions from, or dependents on, processes.\n* Stages of the Magnum Opus\n** Nigredo - The blackening or melanosis means putrefaction or decomposition. After gathering the Prima Materia, the material and the Alchemist must undergo putrefactio. The material is processed until it turns completely black. This is by far the longest and most difficult stage. It is often known as the 'dark night of the soul.' We are being asked to let go of all within us and outside of us that is not in full alignment with the truth of who we are. This is a truth as it exists on a soul level, far beyond the ego and its limited ideas or illusions about who we 'should' be. It is made far more difficult by the resistance and defenses we put up against it. Many of us will resist for years, remaining unwilling to accept that our lives, as we know them, are over. Few of us are quick to grasp the fact that there is new life waiting for us if we would only let go of the limited vision of existence we usually try so desperately to cling to. It is only when we become willing to surrender that the alchemical process truly begins. Only when we are willing to die do we have the chance to one day be reborn.\n** Albedo - The whitening or leucosis is the perfect purification. The material is further processed removing all blackness until only pure white remains. Then it is said that life has conquered death, that the king has been revived. When one has purified his awareness of Self, during meditation, by eliminating thoughts, or otherwise, then at a certain point, light appears. The light that appears is also metaphoric for an absolute clear, pure awareness of Self. In that state one is in a very fixed position, that is, very stable, very much in the here and now, in total clarity of Self. In Whiteness, the material has attained a degree of Fixedness that fire cannot destroy.\n** Rubedo - The reddening, purpling, or iosis. When the White stone or the White Elixir has been made, it needs to purified further, sublimated, until the material becomes totally Fixed and is completely stable. Then we have the Red Sulfur, the red stone, the Red Elixir, the Stone of the Wise. When the divine light has emerged during meditation, one needs to make it last. this demands a continued effort of holding one's attention to this pure awareness, not only for the length of the meditation session, but also during every day life. At a certain point the pure awareness of one's divine self will be permanent."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("The Great Work")
                              )
                            ),
                            Core.vx_new_string("Prepare Alchemical Substance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Alchemical Substance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Each substance requires a separate ability to be taken.\n* See Equipment / Alchemical Substances")
                              )
                            ),
                            Core.vx_new_string("Prepare Medicine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Medicine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Each medicine requires a separate ability to be taken.\n* See Equipment / Medicines")
                              )
                            ),
                            Core.vx_new_string("Prepare Powder"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Powder"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Each powder requires a separate ability to be taken.\n* See Equipment / Powders")
                              )
                            ),
                            Core.vx_new_string("Transmute State"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transmute State"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Supposedly, the ancient Egyptians could create ice from water by placing water out under the stars."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Force a substance to make a minor state change (e.g. Liquids become solids, soft substances turn to liquid, hard substances become soft, water evaporates, ice melts.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Artifice"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Artifice"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Synergy with Mechanics"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Artificer, Engineer, Inventor, Inventress, Machinist, Mechanic"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Construct Automaton"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Construct Automaton"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Minaton - Sinbad and the Eye of the Tiger"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Purpose - When constructing an Automaton, it must be given one or more purposes. These are similar to skills, for example: Farming, Construction, Medicine, Melee, Ranged Combat, Strength, etc. The purpose must be trained by an expert in the field and an extended roll determines the level of the Skill. Once the level is determined, specialties and abilities may be chosen equal to the level.")
                              )
                            ),
                            Core.vx_new_string("Construct Balloon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Construct Balloon")
                              )
                            ),
                            Core.vx_new_string("Construct Device"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Construct Device")
                              )
                            ),
                            Core.vx_new_string("Construct Flying Machine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Construct Flying Machine")
                              )
                            ),
                            Core.vx_new_string("Construct Machina"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Construct Machina")
                              )
                            ),
                            Core.vx_new_string(":Firepower"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firepower"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Temporarily increase the damage done by a mechanical weapon.")
                              )
                            ),
                            Core.vx_new_string("Fulfill your Purpose"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fulfill your Purpose"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Bomb, this is Lt. Doolittle. You are NOT to detonate in the bomb bay. I repeat, you are NOT to detonate in the bomb bay! - Dark Star"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Machines want nothing more than to fulfill their designed purpose, so it is simple to convince them to perform this purpose, even when it is not supposed to.")
                              )
                            ),
                            Core.vx_new_string("Ghost in the Shell"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ghost in the Shell")
                              )
                            ),
                            Core.vx_new_string("Imbued Nails"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imbued Nails"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Empower nails to produce massive splitting damage when struck.")
                              )
                            ),
                            Core.vx_new_string(":Invention"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Invention")
                              )
                            ),
                            Core.vx_new_string(":Haywire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Haywire")
                              )
                            ),
                            Core.vx_new_string(":Malfunction"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Malfunction")
                              )
                            ),
                            Core.vx_new_string("Override Machine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Override Machine")
                              )
                            ),
                            Core.vx_new_string("Speak with Machines"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Speak with Machines")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Astrology"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Astrology"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Astrology is the study of the [Stars] and the [Astral Realm]\n* Planetary days: Each day of the year is related to one of the planets, the moon and the sun. Energies differ in accordance with the position of the planets.\n* Lunar cycle: The cycle of the visible phase of the moon. This is a very powerful time for ritual ceremonies to be preformed."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Astrologer, Astromancer, Celestial Magic, Stargazer"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Aim of Sagittarius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aim of Sagittarius"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Target gains [Synergy] for the next ranged [Attack].")
                              )
                            ),
                            Core.vx_new_string("Astral Projection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astral Projection"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("Units/Magic/AstralProjection.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Body fall unconscious with Spirit enters the [Spirit Realm].  The Spirit may travel as long as it wants, but if no one tends to the Body, it will die of dehydration in 3 days.\n* [Death]: At the moment of death, Spirit may permanently enter the [Spirit Realm].")
                              )
                            ),
                            Core.vx_new_string("Astral Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astral Sight")
                              )
                            ),
                            Core.vx_new_string("Astral Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Astral Ward")
                              )
                            ),
                            Core.vx_new_string("Balance of Libra"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Balance of Libra"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Place the Balance of Libra card on this unit. At any time you may discard the Balance of Libra card to cause a unit that has done damage to you to immediately suffer the same amount of damage.")
                              )
                            ),
                            Core.vx_new_string("Calm of Cancer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Calm of Cancer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Targets ignore all [Mind] penalties for the duration of this\nability.")
                              )
                            ),
                            Core.vx_new_string("Celestial Convergence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Celestial Convergence")
                              )
                            ),
                            Core.vx_new_string("Chariot of the Sun"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chariot of the Sun"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Extended Action]: At dawn, if the sun is visible, summon a blazing chariot with horses of flame that can carry the user and up to level passengers high into the sky all day. At sunset, the chariot lands anywhere the user chooses where the sun is visible.")
                              )
                            ),
                            Core.vx_new_string("Charm of Virgo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Charm of Virgo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Gain [Synergy] on unit's next communication skill. Duration 1\nturn.")
                              )
                            ),
                            Core.vx_new_string("Cleansing of Aquarius"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cleansing of Aquarius"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Aquarius is not a water sign. It's an air sign. The mix up often comes about from Aquarius' overarching symbol, the water-bearer."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Remove X [Poison], [Disease], or [Corruption] cards from the target.")
                              )
                            ),
                            Core.vx_new_string("Courage of Leo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Courage of Leo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Remove X [Retreat] tokens from all target in range.")
                              )
                            ),
                            Core.vx_new_string(":Daybreak"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Daybreak"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Banishes fatigue in diurnal (daytime) creatures.\n* Causes noturnal creatures to fall asleep.")
                              )
                            ),
                            Core.vx_new_string("Déjà Vu"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Déjà Vu"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* You have seen this situation before and are not surprised by it.\n* [Action]: The next time you are [Suprised], ignore all penalties for [Surprise].")
                              )
                            ),
                            Core.vx_new_string("Depth of Pisces"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Depth of Pisces"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Extended Action]: Gain [Synergy] on the next [Search], [Research], or\n[Investigation] [Action].")
                              )
                            ),
                            Core.vx_new_string("Determination of Aries"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Determination of Aries"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Target ignores all movement penalties (including terrain) for\nthe duration of this effect.")
                              )
                            ),
                            Core.vx_new_string("Duality of Gemini"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Duality of Gemini"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Take on a different personality with different mannerisms. This can be the basis for a very convincing disguise.")
                              )
                            ),
                            Core.vx_new_string(":Eclipse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eclipse"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Extended Action]: Predict where, when, and the intensity of the next solar or lunar eclipse. The eclipse is very impressive to others and is almost always tied to important mystical events.\n* Both the Solar Eclipse and Lunar Eclipse (Blood Moon) provide the following benefits or penalties: +2 [Astrology], +2 [Black Magic]. +1 [Sorcery], -1 [Thergy], -1 [Nature Magic]")
                              )
                            ),
                            Core.vx_new_string("Eye of Jupiter"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eye of Jupiter")
                              )
                            ),
                            Core.vx_new_string("Full Moon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Full Moon")
                              )
                            ),
                            Core.vx_new_string("Hand of Fate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hand of Fate")
                              )
                            ),
                            Core.vx_new_string("Hide from the Stars"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hide from the Stars"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Protects from the divinations of others.")
                              )
                            ),
                            Core.vx_new_string("Meteor Shower"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Meteor Shower"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Extended Action]: Call meteors"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Starfall")
                              )
                            ),
                            Core.vx_new_string("Moon Bridge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Moon Bridge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Opens a bridge to the Ethereal version of the Moon.")
                              )
                            ),
                            Core.vx_new_string("New Moon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("New Moon")
                              )
                            ),
                            Core.vx_new_string("Ring of Saturn"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ring of Saturn")
                              )
                            ),
                            Core.vx_new_string("Secrets of Scorpio"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Secrets of Scorpio"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Extended Action]: Learn a secret about a subject.")
                              )
                            ),
                            Core.vx_new_string("Star of Ill Omen"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Star of Ill Omen")
                              )
                            ),
                            Core.vx_new_string(":Stargazing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stargazing")
                              )
                            ),
                            Core.vx_new_string(":Starsight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Starsight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* See clearly at night while under the stars.")
                              )
                            ),
                            Core.vx_new_string("Steadiness of Capricorn"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Steadiness of Capricorn"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Target gains [Synergy] for the next physical, non-attack [Action].")
                              )
                            ),
                            Core.vx_new_string(":Sunlight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sunlight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Cause a light the unit holds to become bright sunlight. The light produces warmth like a campfire and will cause damage to creatures harmed by sunlight.")
                              )
                            ),
                            Core.vx_new_string("Waning Moon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Waning Moon")
                              )
                            ),
                            Core.vx_new_string("Waxing Moon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Waxing Moon")
                              )
                            ),
                            Core.vx_new_string("Will of Taurus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Will of Taurus"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Targets ignore all attack penalties for the duration of this ability.")
                              )
                            ),
                            Core.vx_new_string("Written in the Stars"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Written in the Stars"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Foresee a random event that will happen in [Time] level.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Chronomancy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chronomancy"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Delay"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Delay")
                              )
                            ),
                            Core.vx_new_string("Reverse Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reverse Time"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* If I could turn back time... - Cher")
                              )
                            ),
                            Core.vx_new_string("Slow Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Slow Time")
                              )
                            ),
                            Core.vx_new_string("Temporal Vision"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Temporal Vision")
                              )
                            ),
                            Core.vx_new_string("Tempus Fugit"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tempus Fugit"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Speeds time in an area"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Time Flies")
                              )
                            ),
                            Core.vx_new_string("Time Heals All Wounds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Heals All Wounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* After healing the physical effects of a wound, the ability can remove the mental scars by actually removing the wounds from the past. The level of the ability determines the number of years in the past from which the wound is erased. If the entire history is erased the wound will have never occurred and no one will remember it except the caster. The person's life history is rewritten without the wound. This can result in significant changes if the wound was debilitating. The power of this ability ensures that any changes will never be worse than the current situation.")
                              )
                            ),
                            Core.vx_new_string("Time Shift"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Shift")
                              )
                            ),
                            Core.vx_new_string("Time Stop"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Time Stop"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Time Freeze")
                              )
                            ),
                            Core.vx_new_string("Wall of Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall of Time")
                              )
                            ),
                            Core.vx_new_string("Warp Time"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Warp Time"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Let's do the Time Warp again... - The Rocky Horror Picture Show"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Time Warp")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Conjuration"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Conjuration"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Conjuration is the art of creating things directly from the imagination. Conjured items are relatively fragile and erode quickly with use, but otherwise will last indefinitely. An item is perfectly visualized and then drawn into reality from the Astral Realm. Conjuration is similar to [Illusion], but its creations are real though they are rarely permanent.\n* Action: Check Skill vs. the Value of the item to create. If successful, the item can be used a number of times equal to the result before disintegrating. If the user has a specialty with an item, that specialty may be applied to the check.\n* Benefits - Conjuration is the natural ability of the Astral Realm and Dream Realm. All abilities are +1 in these Realms.\n* Limitations - Creation magic is exceedingly difficult with only relatively minor creations possible. The process of Conjuration is different from natural things, so all Conjured things have some imperfection or mark that distinquishes itself from a natural thing.\n* Concidental - Conjuring in ways that appear like the object was already there is [Coincidental Magic]. E.g. Drawing an illusionary sword from a real scabbard."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Conjurer, Creation, Creator, Manifestation"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Conjure Weapon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conjure Weapon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Conjure a weapon out of thin air.\n* [Limited]: By the user's skill in the weapon created.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Divergence"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Divergence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The opposite of Convergence, Divergence specializes on objects moving apart."),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Mind"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Amplify Repulsion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amplify Repulsion"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Massively increase the repulsive force between two objects. This can increase magnetic repulsion and also increase the movement of two objects that have just collided to increase Knockback.")
                              )
                            ),
                            Core.vx_new_string("Pressor Force"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pressor Force"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Apply low but steady pressure pushing an object away.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Paper Magic"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Paper Magic"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ofuda"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Binding Paper"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Binding Paper")
                              )
                            ),
                            Core.vx_new_string("Binding Symbol"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Binding Symbol")
                              )
                            ),
                            Core.vx_new_string("Giant Kite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Giant Kite")
                              )
                            ),
                            Core.vx_new_string("House of Cards"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("House of Cards")
                              )
                            ),
                            Core.vx_new_string("Paper Airplane"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Airplane")
                              )
                            ),
                            Core.vx_new_string("Paper Crane"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Crane")
                              )
                            ),
                            Core.vx_new_string("Paper Darts"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Darts")
                              )
                            ),
                            Core.vx_new_string("Paper Doll"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Doll")
                              )
                            ),
                            Core.vx_new_string("Paper Dragon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Dragon")
                              )
                            ),
                            Core.vx_new_string("Paper Flurry"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Flurry")
                              )
                            ),
                            Core.vx_new_string("Paper Mache"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Mache")
                              )
                            ),
                            Core.vx_new_string("Paper Plane"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Plane")
                              )
                            ),
                            Core.vx_new_string("Paper Shuriken"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Shuriken")
                              )
                            ),
                            Core.vx_new_string("Paper Snowflake"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Snowflake")
                              )
                            ),
                            Core.vx_new_string("Paper Tiger"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paper Tiger")
                              )
                            ),
                            Core.vx_new_string(":Pinwheel"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pinwheel")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Sorcery"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sorcery"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* This is forbidden. This is a summoning. I cannot speak this!... There is no light here. You came to the darkness for knowledge... And all the knowledge you seek is here. Surrender. Speak the words. Call her home. By three thay come. By three thy way opens. By the blood of the willing. We call thee home. Hail, daughter of hatred. Hail, Lilith. - Diablo IV"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Sorcerer, Sorceress, Sorceress Queen, Summoner"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Banishment"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Banishment"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Return any [Outsider] to its original realm. This ability may only be attempted on a particular being once per month.")
                              )
                            ),
                            Core.vx_new_string(":Binding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Binding"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Any subject successfully summoned is attuned to the caster and is subject to a binding. The caster may bind immediately or parley first and use the binding as a threat.\n* [Requires]: The caster must describe the subject's past in detail and name his/her demands. If the description is in error or the demand cannot be completed, the Binding automatically fails.\n* [Action]: If successful, the caster will know the subject is bound and it will perform the demand to the letter, but the subject is unwilling and will seek to defeat the caster's wishes through semantics or in passive/agressive ways.")
                              )
                            ),
                            Core.vx_new_string("Binding Contract"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Binding Contract"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Like [Binding], any subject successfully summoned is attuned to the caster and is subject to a binding. The caster may parley and use the binding to enforce an agreement.\n* [Requires]: The caster must name his/her demands and offer compensation to the subject. They may then negotiate for as long as desired.\n* [Action]: If the subject refuses to bargain, the caster may still cast or threaten a [Binding]. If the subject agrees to the bargain, the subject and the caster are automatically bound to the terms of the bargain, and both must fulfill their commitments or be immediately subject to a [Summoning] and automatically successful forced [Binding] (even if neither party has these abilities).")
                              )
                            ),
                            Core.vx_new_string("Containment Jar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Containment Jar"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Evil Containment Wave - Dragon Ball"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A summoned being may be captured in a special container that permanently imprisons the creature.\n* The being in the jar can telepathically communicate with anyone touching the jar. If the jar is broken, the being is immediately freed. The being may bargain for its freedom, and if it does so, it must fulfill its bargain.\n* Imprisonment in a jar can be used as a threat or the caster may simply imprison the being to be used later."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Soulbind")
                              )
                            ),
                            Core.vx_new_string("Create Elder Sign"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Create Elder Sign")
                              )
                            ),
                            Core.vx_new_string("Daedalus Gateway"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Daedalus Gateway"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A subtle gate that moves a person to a different Realm without them realizing. Both locations must be nearly identical.")
                              )
                            ),
                            Core.vx_new_string("Dimension Door"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimension Door"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cross through a doorway or arch of some sort and appear through another similar arch some distance away.")
                              )
                            ),
                            Core.vx_new_string("Dimensional Gateway"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dimensional Gateway"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Open a portal to another dimension.")
                              )
                            ),
                            Core.vx_new_string(":Gateway"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gateway"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Open a portal to another location.")
                              )
                            ),
                            Core.vx_new_string(":Pentagram"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pentagram"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Triangle enclosed in a circle. A double triangle will form a Pentagram.\n* The five points represent the four elements with the spirit presiding at the top. The triangles form a doorway.\n* Time allowing, it is usually meticulously inscribed and used with a [Protective Circle].\n* It serves to contain any being (and its minions) summoned by the caster.\n* It provides defense equal to the success roll versus any being (and its minions) summoned by the caster. This defense applies to ALL attempts to act across the Pentagram. If an attack exceeds the defense of the Pentagram, the defense reduces by one."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Binding Circle, Devil's Door, Thaumaturgic Triangle")
                              )
                            ),
                            Core.vx_new_string(":Protection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Protection"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A protective barrier inscribed on the ground to protect the caster from summoned beings (usually his own).\n* A typical size for a circle is nine feet in diameter, though the size can vary depending on the purpose of the circle.\n* Some practitioners choose to mark the physical boundary of their circle, either before or prior to the actual casting. This can be done using a cord, a chalk line, a line drawn in the soil, or small objects such as stones.\n* Some practitioners mark the four cardinal points with candles, either white, or of colors representative of the elements:\n** North: green for the element of Earth\n** East: yellow for the element of Air\n** South: red for the element of Fire\n** West: blue for the element of Water\n* Cutting a door - The barrier is fragile and sensitive to things passing through it. Leaving or passing through the circle often weakens or dispels the barrier. This is referred to as 'breaking the circle'. Practitioners should not leave the circle unless absolutely necessary. In order to leave a circle and keep it intact, a door must be cut in the energy of the circle. Using the athame, a doorway is cut in the circle, at which point anything may pass through without harming the circle. This opening must be closed afterwards by reconnecting the lines of the circle."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Circle of Protection, Protective Circle")
                              )
                            ),
                            Core.vx_new_string("Soul Pact"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Soul Pact"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Death: Enter a specified Demon Realm. This ability is automatic and is not optional.")
                              )
                            ),
                            Core.vx_new_string("Summon Demon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Demon"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Demonic Summoning")
                              )
                            ),
                            Core.vx_new_string("Summon Devil"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Devil"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Diabolic Summoning")
                              )
                            ),
                            Core.vx_new_string("Summon Familiar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Familiar"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Animal companions, such as cats, that are either trained to assist in magic, or are used as a mascot."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Summon an animal shaped familiar spirit to serve as a companion, servant, spy, etc.\n* The Familiar is highly intelligent and must be bargained with before it agrees to serve.\n* Duration: Indefinite.\n* The Familiar will age with its master.\n* The Familiar can gain abilities that its master possesses.\n* Three mystic cords are constructed to link the Familiar to its master.\n** Golden Cord - Connects magical abilities.\n** Silver Cord - Connects the minds.\n** Bronze Cord - Connects the bodies.\n!Familiar Skills\n* Shapechange to Human Form\n* Giant Growth (Self)\n* Communicate with Master\n* Speech")
                              )
                            ),
                            Core.vx_new_string("Summon Item"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Item"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A single item may be attuned to a summoning.  Later that item may be summoned to the owner's hand.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Thaumaturgy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Thaumaturgy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The interface between Magic and Science. Mathematics, Biology, Geology and Chemistry are studied to manifest amazing creations.\n* Thaumaturgy can create permanent artificial life.\n* Thaumaturgy favors crytals and gemstones for power supplies."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("The Art Mathematical, Wonder Working"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Create Homonculus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Create Homonculus")
                              )
                            ),
                            Core.vx_new_string("Prepare Lightning in a Bottle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prepare Lightning in a Bottle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create [Lightning in a Bottle].")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Wizardry"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wizardry"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Conventional Wizardry believes that everything in the universe holds massive energy potential waiting to be unleashed.\n* Wizardry is the study of Magic itself. As such it is a sort of meta-Magic, focused on altering magical energies."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Archmagi, Magi, Wizard"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Analyze Magic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Analyze Magic"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Gain understanding of a magical item or effect.")
                              )
                            ),
                            Core.vx_new_string(":Counterspell"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Counterspell"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Interrupt]: Roll a defense roll against a magical ability. If the defense succeeds, the ability has no effect.")
                              )
                            ),
                            Core.vx_new_string(":Dampen"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dampen"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Magic can easily be reduced since magic already has a tentative hold on reality.")
                              )
                            ),
                            Core.vx_new_string(":Dispel"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dispel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack a placed magical ability.  Each hit weakens its abilities.")
                              )
                            ),
                            Core.vx_new_string(":Fork"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fork"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Duplicate an allied caster's magical ability. The other caster fully\ncontrols both abilities but may not aim both at the same target.")
                              )
                            ),
                            Core.vx_new_string(":Magnify"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magnify"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Magnify draws from the potential energy in all things to increase the power in an existing force.\n* Note: Magic cannot be magnified. Magic only simulates reality and has no hidden reserves to tap.\n!Examples\n* An arrow can hit with devastating force.\n* A bird's weight can be increased so it falls.\n* A fire can be enhanced into an inferno while not burning fuel faster or producing additional smoke. The fuel has near infinite reserves to draw upon.")
                              )
                            ),
                            Core.vx_new_string("Mana Burn"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mana Burn")
                              )
                            ),
                            Core.vx_new_string("Mana Leak"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mana Leak")
                              )
                            ),
                            Core.vx_new_string("Mana Shield"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mana Shield"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Forms an transparent crytal shell in front of the caster, but if they moves, the shield will drop.\n* [Defend]: Protected with level Armor from all [Physical] [Damage].")
                              )
                            ),
                            Core.vx_new_string("Mirror Shield"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror Shield"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Forms an transparent crytal shell in front of the caster, but if they moves, the shield will drop.\n* [Defend]: If defender was targetted by an [Energy] attack lower than level, the Attacker also suffers the attack.\n* Wall that reflects attacks back to its source.")
                              )
                            ),
                            Core.vx_new_string("Mirror Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror Wall"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wall that reflects [Energy] attacks lower than level back to their source. Any attack higher than level will destoy the Wall.")
                              )
                            ),
                            Core.vx_new_string("Paradigm Shift"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Paradigm Shift"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Change one rule of nature for a moment.")
                              )
                            ),
                            Core.vx_new_string("Power Sink"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Power Sink")
                              )
                            ),
                            Core.vx_new_string("Power Surge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Power Surge")
                              )
                            ),
                            Core.vx_new_string(":Redirect"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Redirect"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Reaction]: Redirect an Energy or Physical Ranged attack that has a single target to another target.")
                              )
                            ),
                            Core.vx_new_string(":Stasis"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stasis"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Place an equal number of White Stasis Tokens on yourself and your target.")
                              )
                            ),
                            Core.vx_new_string("White Noise"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("White Noise"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Sounds are garbled preventing eavesdropping")
                              )
                            ),
                            Core.vx_new_string("Wizard Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wizard Armor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Defense against Energy that creates [Feedback].")
                              )
                            ),
                            Core.vx_new_string("Wizard Lock"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wizard Lock"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wizard Lock alters an existing magical effect by freezing it in place. It becomes permanent until dispelled, but it no longer has an active effect. In this way a wall of fire would be a permanent wall that does not move or produce heat. This is often used to make a seal last indefinitely.")
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
            Core.vx_new_string("Black Magic"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Black Magic"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Blood Magic"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blood Magic"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Each use of Blood Magic requires a blood sacrifice. The user immediately suffers one [Blood Loss], or if a captured sacrifice is available, the user may instead use the blood of the sacrifice.\n* Blood magic is a favorite of Vampires who can recover from [Blood Loss] quickly."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Blood Brother, Blood Mage, Blood Witch, Vampire"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Blood Bath"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Bath"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Bathe in the blood of of the young and healthy. Gain [Vampiric Blood] (even if not a [Vampire]) equal to the number of victims drained up to [Blood Magic].")
                              )
                            ),
                            Core.vx_new_string("Blood Bind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Bind")
                              )
                            ),
                            Core.vx_new_string("Blood Blade"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Blade"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a sword, knife, or axe from blood. Blood Weapons always cause [Bleeding].")
                              )
                            ),
                            Core.vx_new_string("Blood Borne"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Borne"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Target: [Bleeding]. Apply [Sickness] to a [Bleeding] target.")
                              )
                            ),
                            Core.vx_new_string("Blood Brother"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Brother")
                              )
                            ),
                            Core.vx_new_string("Blood Feud"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Feud")
                              )
                            ),
                            Core.vx_new_string("Blood Lust"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Lust"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: +1 [Attack] and +1 [Damage], take -1 [Body]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Blood Rage")
                              )
                            ),
                            Core.vx_new_string("Blood Oath"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Oath")
                              )
                            ),
                            Core.vx_new_string("Blood Spear"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Spear"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a spear or javelin from blood. Blood Weapons always cause [Bleeding].")
                              )
                            ),
                            Core.vx_new_string("Blood Whip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blood Whip"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a whip or rope from blood. Blood Weapons always cause [Bleeding].")
                              )
                            ),
                            Core.vx_new_string("Boil Blood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Boil Blood"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Touch, Fire Attack, Criticals are only Damage.")
                              )
                            ),
                            Core.vx_new_string("Call for Blood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call for Blood")
                              )
                            ),
                            Core.vx_new_string(":Hecatomb"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hecatomb"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* In ancient Greece or Rome, a great public sacrifice, originally of a hundred oxen.\n* An extensive loss of life for some cause.")
                              )
                            ),
                            Core.vx_new_string(":Lifeblood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lifeblood"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Use Blood to heal yourself.\n* [Action]: Take a [Blood Loss]. Change 1 [Critical Damage] to a normal [Damage] or\nchange 1 [Damage] to a [Blood Loss].")
                              )
                            ),
                            Core.vx_new_string("Out for Blood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Out for Blood")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Chaos"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chaos"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Do what thou wilt shall be the whole of the Law. - Alesiter Crowley, Book of the Law\n* The Butterfly Effect - Any 'seemingly' insignificant event in the universe has the potential to trigger a chain reaction that will change the whole system.\n* Do I really look like a plan? ... I just...do things. The mob has plans. The cops have plans. Gordon's got plans. They're schemers, schemers trying to control their little worlds. I'm not a schemer. I try to show the schemers how pathetic their attempts to control things really are. ... I just do what I do best, I took your little plan and turned it on itself. Look at what happened to this city with a few drums of gas and a couple of bullets. ... Introduce a little anarchy. Upset the established order and everything becomes chaos. I'm an agent of chaos. - Joker, The Dark Knight"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Belief is a tool that can be applied at will rather than unconsciously.\n* Trying unusual, and often bizarre beliefs is in itself an experience worth having\n* Flexibility of belief is a form of power\n* Be outside of all categories - world views, theories, beliefs, opinions, habits and even personalities are tools that may be chosen arbitrarily in order to understand or manipulate the world one sees and creates around oneself.\n* Be tolerant - whatever one might disagree over is merely an opinion, and hence interchangeable, anyway.\n* Chaos magic is unique among magical traditions in that it does not attribute significance to any particular symbol or deity."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Chaos Lord, Discordian, Logros Master, Lord of Chaos"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Anarchy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anarchy")
                              )
                            ),
                            Core.vx_new_string(":Bedlam"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bedlam")
                              )
                            ),
                            Core.vx_new_string(":Breakdown"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Breakdown"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Causes machinery to fail.  The more complex the device the more dramatic the failure.")
                              )
                            ),
                            Core.vx_new_string(":Deconstruct"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deconstruct"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* People and planets and stars will become...dust...and the dust will become atoms...and the atoms will become...nothing. - Davros, Doctor Who"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Break apart an object into simpler pieces. Each successive use breaks down an object further. E.g. Wheel -> Tire -> Rubber -> Chemicals -> Atoms -> Particles")
                              )
                            ),
                            Core.vx_new_string("Manipulate Luck"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Manipulate Luck")
                              )
                            ),
                            Core.vx_new_string(":Pandemonium"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pandemonium")
                              )
                            ),
                            Core.vx_new_string("Sea of Chaos"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sea of Chaos")
                              )
                            ),
                            Core.vx_new_string("Shroud of Uncertainty"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shroud of Uncertainty")
                              )
                            ),
                            Core.vx_new_string("Tendrils of Chaos"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tendrils of Chaos")
                              )
                            ),
                            Core.vx_new_string("Wild Ride"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wild Ride"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allow the whims of fate to carry you to a destination of their choosing.")
                              )
                            ),
                            Core.vx_new_string(":Unravelling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Unravelling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Knots untie, locks unfasten, etc.")
                              )
                            ),
                            Core.vx_new_string("Winds of Change"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Winds of Change")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Corruption"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Corruption"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* How do we begin to covet? We begin by coveting what we see every day. - The Silence of the Lambs\n* Deadite: I'll swallow your soul! Ash: Come get some. - Ash, Army of Darkness\n* There is nothin' fair in this world... No... There is nothin' safe in this world... And there's nothin' sure in this world... And there's nothin' pure in this world... Look for something left in this world... Start again! - Billy Idol, White Wedding"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Blight Caster, Contaminator, Corrupter, Defiler, Filth, Plague Bearer, Plague Lord, Plague Walker, Sin, Sin Lord, Scourge, Tainted"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Balefire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Balefire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Balefire is a magical, corrupting fire that appears as a sickly pale, greenish flame that flows like a liquid. It burns like napalm and is not extinquished by water. Prolonged exposure produces damage like [Radiation]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hellfire, Witchfire")
                              )
                            ),
                            Core.vx_new_string(":Befoul"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Befoul")
                              )
                            ),
                            Core.vx_new_string(":Blight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Damage plant life in an area.")
                              )
                            ),
                            Core.vx_new_string(":Contaminate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Contaminate")
                              )
                            ),
                            Core.vx_new_string(":Corrosion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Corrosion")
                              )
                            ),
                            Core.vx_new_string(":Corrupt"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Corrupt")
                              )
                            ),
                            Core.vx_new_string(":Decay"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Decay")
                              )
                            ),
                            Core.vx_new_string(":Defile"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Defile")
                              )
                            ),
                            Core.vx_new_string(":Despoil"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Despoil")
                              )
                            ),
                            Core.vx_new_string(":Deteriorate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deteriorate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Magnify any existing negative tokens.")
                              )
                            ),
                            Core.vx_new_string(":Epidemic"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Epidemic"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Copies all conditions from target to all targets in the area around the target.")
                              )
                            ),
                            Core.vx_new_string("Eye of Corruption"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eye of Corruption")
                              )
                            ),
                            Core.vx_new_string(":Miasma"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Miasma")
                              )
                            ),
                            Core.vx_new_string(":Pestilence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pestilence")
                              )
                            ),
                            Core.vx_new_string(":Plague"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plague")
                              )
                            ),
                            Core.vx_new_string("Plague Carrier"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plague Carrier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This ability inflicts a contagious disease on a subject while also providing some immunity to the victim.\n* The subject then spreads the disease to others."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Plague Bearer, Typhoid Mary")
                              )
                            ),
                            Core.vx_new_string("Plague Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plague Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Add [Disease] Criticals to a normal attack.")
                              )
                            ),
                            Core.vx_new_string(":Pollute"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pollute"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Add Poison or Disease to any fluid or food.")
                              )
                            ),
                            Core.vx_new_string(":Putrefy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Putrefy")
                              )
                            ),
                            Core.vx_new_string("Putrid Explosion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Putrid Explosion")
                              )
                            ),
                            Core.vx_new_string(":Rot"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rot")
                              )
                            ),
                            Core.vx_new_string(":Ruin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ruin"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cause a structure to age and take structural damage."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Raze")
                              )
                            ),
                            Core.vx_new_string(":Sicken"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sicken")
                              )
                            ),
                            Core.vx_new_string("Tainted Land"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tainted Land")
                              )
                            ),
                            Core.vx_new_string(":Wither"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wither"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Shrivelling")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Darkness"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Darkness"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The blackness gathers about, so thick, so clinging, so penetrating, so oppressive, that all other darkness that I have ever conceived would be like bright light beside it. - Aleister Crowley, Magick Without Tears\n* When the shadows are devoured by even darker shadows, the curtain pulls back and reveals a world without light! - Dark Signers, Yugioh 5Ds\n* To go in the dark with a light is to know the light. To know the dark, go dark. Go without sight and find that the dark, too, blooms and sings, and is traveled by dark feet and dark wings. - Wendell Berry, To Know the Dark"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dark Lord, Dark Magician, Dark Master, Dread Knight, Lord of Night, Shadow Caster, Shadow Knight, Shadow Lord, Shadow Mage, Shadow Master, Shadow Rider, Shadow Walker, Shadow Warrior"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Cast Shadows"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cast Shadows"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Animate shadows. Like [Illusions], they have full power but are destroyed on any hit.")
                              )
                            ),
                            Core.vx_new_string("Circle of Darkness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Circle of Darkness")
                              )
                            ),
                            Core.vx_new_string("Cloak of Shadows"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cloak of Shadows"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Increase Stealth"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Shroud of Night")
                              )
                            ),
                            Core.vx_new_string("Darkest Hour"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Darkest Hour"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Witching Hour")
                              )
                            ),
                            Core.vx_new_string("Eye of Shadow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eye of Shadow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* See perfectly in any form of darkness."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dark Sight, Night Vision")
                              )
                            ),
                            Core.vx_new_string("Heart of Darkness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heart of Darkness")
                              )
                            ),
                            Core.vx_new_string(":Nightfall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nightfall"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Gain +1 [Darkness] Skill for the first hour after the dusk.")
                              )
                            ),
                            Core.vx_new_string(":Oubliette"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Oubliette"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Trap a target in a prison of absolute darkness.")
                              )
                            ),
                            Core.vx_new_string("Shadow Step"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shadow Step"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Step into a shadow and appear from a nearby shadow, though failure will leave the unit trapped in shadow.")
                              )
                            ),
                            Core.vx_new_string("Shadow Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shadow Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Add [Blindness] Criticals to a normal attack.")
                              )
                            ),
                            Core.vx_new_string("Tendrils of Night"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tendrils of Night")
                              )
                            ),
                            Core.vx_new_string("Wall of Darkness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall of Darkness")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Demon Soul"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Demon Soul"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Claymore\n* Ghost Rider\n* Prototype"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Demon Soul is when a user has been partially or completely possessed by a demonic entity.\n* Demon Soul allows the user a number of physical advantages including regeneration and natural weaponry, however each use of an ability at full strength (higher than level - 2) risks increasing the Beast inside until it eventually dominates the user's Spirit."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Yoma"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Beast")
                      )
                    ),
                    Core.vx_new_string(":Fleshcraft"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fleshcraft"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This mastery of the flesh defies traditional life and death. Body parts may be removed, reattched, molded to create abominations or fiendish beauty.\n* Stats may be rearranged depending on the success roll. Only magical healing will repair."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Flesh Molder, Sadist"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Body Sculpting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Body Sculpting"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Stats may be rearranged depending on the success roll. Only magical healing will repair.")
                              )
                            ),
                            Core.vx_new_string("Flesh Molding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flesh Molding"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Body can be scuplted like clay. This is a very powerful but impercise ability. It can be further refined with [Body Scuplting].")
                              )
                            ),
                            Core.vx_new_string(":Grafting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grafting"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Frankenstein's Monster"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Separate living organs from their host and graft them to another.")
                              )
                            ),
                            Core.vx_new_string(":Hybridize"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hybridize"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create new lifeforms by growing hybridized cells.")
                              )
                            ),
                            Core.vx_new_string(":Pain"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pain"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* And to think, I hesitated... - Hellraiser II\n* Oh, Kirsty.  So eager to play, so reluctant to admit it. - Pinhead, Hellraiser II\n* I guess I'm always hoping that you'll end this reign.   But it's my destiny to be the king of pain - The Police, King of Pain")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Necromancy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Necromancy"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Necromancy is the communication with the spirits of the dead sometimes via a ouija board, on which messages are spelled out and interpreted."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Black Savant, Bone Caster, Grave Robber, Necromancer, Necrosavant"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Shadow"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Bone Harvest"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bone Harvest")
                              )
                            ),
                            Core.vx_new_string("Brush with Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Brush with Death")
                              )
                            ),
                            Core.vx_new_string("Call the Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call the Death"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Bring out your dead! - Monty Python and the Holy Grail"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attract undead creatures to your location.")
                              )
                            ),
                            Core.vx_new_string("Command the Dead"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command the Dead"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Compel undead creatures to serve you for the duration of the ability.")
                              )
                            ),
                            Core.vx_new_string("Corpse Explosion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Corpse Explosion")
                              )
                            ),
                            Core.vx_new_string("Dance of the Dead"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dance of the Dead"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Force a dead spirit to perform a task for you.")
                              )
                            ),
                            Core.vx_new_string("Dead Eye"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dead Eye"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Sixth Sense"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Necromancer's eyes become white with cataracts obscuring the real world while seeing through the [Shroud] into the [Underworld]. The Necromancer can see and speak with the dead in the [Shadowlands].  The dead, however, are generally not fond of being used by Necromancers.")
                              )
                            ),
                            Core.vx_new_string("Dead Man Walking"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dead Man Walking"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Necromancer becomes corpselike and is treated as [Undead] by other [Undead].")
                              )
                            ),
                            Core.vx_new_string(":Deathgrip"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deathgrip")
                              )
                            ),
                            Core.vx_new_string("Death's Door"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Death's Door"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Project your spirit into the [Underworld] while the body lies in a coma.\n* [Death]: Enter the Underworld")
                              )
                            ),
                            Core.vx_new_string("Drain Life"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drain Life")
                              )
                            ),
                            Core.vx_new_string("Draining Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Draining Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* While this ability is active, gain 1 Health when the user deals at least 1 [Health] damage with a [Close Combat] [Strike].")
                              )
                            ),
                            Core.vx_new_string(":Embalming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Embalming"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By preparing a corpse both phyically and magically, the body can avoid most negative effects of decay.\n* Embalmed undead created through Reanimation can last indefinitely.")
                              )
                            ),
                            Core.vx_new_string("Ghost Wind"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ghost Wind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Summon terrifying spirits that cause fear in an area.")
                              )
                            ),
                            Core.vx_new_string("Hand of Glory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hand of Glory"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Hand of Glory is the dried and pickled hand of a man who has been hanged, often specified as being the left (Latin: sinister) hand, or, if the man were hanged for murder, the hand that 'did the deed.'\n* Old European beliefs attribute great powers to a Hand of Glory combined with a candle made from fat from the corpse of the same malefactor who died on the gallows. The candle so made, lighted, and placed (as if in a candlestick) in the Hand of Glory, would have rendered motionless all persons to whom it was presented.")
                              )
                            ),
                            Core.vx_new_string(":Harrowing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Harrowing")
                              )
                            ),
                            Core.vx_new_string("Living Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Living Death"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Temporarily turns the caster into a [Lich].")
                              )
                            ),
                            Core.vx_new_string(":Manifestation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Manifestation"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allows a dead spirit to temporarily interact with the living world.")
                              )
                            ),
                            Core.vx_new_string("Moment of Death"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Moment of Death"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Touch a corpse and view its death.")
                              )
                            ),
                            Core.vx_new_string(":Mummification"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mummification"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A complex ritual to turn the target into a [Mummy] or [Lich].  A perfectly created undead appears like a completely normal living being (though it is no longer alive).  Flaws is the casting make the being more monstrous.")
                              )
                            ),
                            Core.vx_new_string(":Necropotence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Necropotence"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduce your own health to increase another magical effect.")
                              )
                            ),
                            Core.vx_new_string(":Necroscope"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Necroscope")
                              )
                            ),
                            Core.vx_new_string("Prolong Life"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prolong Life")
                              )
                            ),
                            Core.vx_new_string(":Reanimation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reanimation"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Reanimator"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The corpse of a dead unit may be reanimated returning it to an [Undead] semblance of life.\n* This ability does not give any control of the [Undead] to the caster unless the caster is somehow reanimating his own body.\n* [Action] - [Success] indicate the new maximum [Body] of the corpse up to its original [Body]. The closer the corpse gets to its full original [Body], the more alive it will appear.\n* Some otherworldly beings defy death by Reanimating themselves.")
                              )
                            ),
                            Core.vx_new_string("Rigor Mortis"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rigor Mortis")
                              )
                            ),
                            Core.vx_new_string(":Seance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seance"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Draw ghosts to you and allow them to speak through you.")
                              )
                            ),
                            Core.vx_new_string("Sever Soul"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sever Soul"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Target whose spirit has left its body.\n* [Action]: Cut the connection between the spirit and its body.  The spirit may become lost, and the body falls into a coma. The soulless body is now an attractive target for possession.")
                              )
                            ),
                            Core.vx_new_string(":Undeath"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Undeath"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Similar to [Resurrect], this ritual allows a being to permanently transform a [Living] being into an [Undying] one.\n* This can be used to create [Zombie] and [Skeletons] servants or create indepenent undead like [Ghouls] and [Vampires].")
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
            Core.vx_new_string(":Thergy"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Thergy"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Pray, not for the gods, or the betterment of others, but for yourself - Rosaria, Genshin Impact"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Channelling, Miracle Working, White Magic"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Asceticism"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Asceticism"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Snow White"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Aura\n* All Purity skills are at -1 for each level of [Shadow]. Ironically, the [Beast] is natural and therefore is not impure.\n\nThere are said to be 'Four Affirmations' of the spirit:\n* Tradition and the family - The family is seen as the main mechanism by which traditions are reserved.  Their main celebrations relate to birth and marriage.\n* Love of nature - Nature is sacred; to be in contact with nature is to be close to the sacred spirits.  Natural objects are worshipped as containing sacred spirits. Killing living beings should be done with reverence for taking a life to continue one's own, and should be kept to a minimum.\n* Physical cleanliness - Take baths, wash hands, and rinse mouths often.\n* Festivals - Any festival dedicated to the Spirits, of which there are many each year."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Angel, Banisher, Brother, Buddist, Exorcist, Father, Friar, Hearth Mage, Monk, Mother Superior, Nun, Paladin, Penitent, Purifier, Purity, Shintoist, Sister"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Spirit"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Absolution"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Absolution"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A ritual of cleansing of sin. Absolution can be a difficult journey depending on the person and the sins. To be absolved, one must fully express, accept and atone for one's sins, only then may absolution be found."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Atonement")
                              )
                            ),
                            Core.vx_new_string("Arrow of Purity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arrow of Purity"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Kakome, Inuyasha\n* Mirana, DOTA"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An arrow or other projectile can be enhanced to destroy corruption.\n* +1 Attack and +1 Damage vs. [Corrupted] or [Chaotic]")
                              )
                            ),
                            Core.vx_new_string("Blaze of Glory"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blaze of Glory")
                              )
                            ),
                            Core.vx_new_string("Calm Animal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Calm Animal")
                              )
                            ),
                            Core.vx_new_string("Chime of Purity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chime of Purity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The user sounds a bell or chime, and its piercingly pure tones are unbearable to otherworldly beings.")
                              )
                            ),
                            Core.vx_new_string(":Cleaning"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cleaning"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By simply rubbing any dirty surface with a wet cloth, the material immediately becomes cleaner regardless of the contamination. All harmful contaminents are cleaned off as well.")
                              )
                            ),
                            Core.vx_new_string(":Cleanse"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cleanse"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Those who believe see a silvery shower wash over the target and cleaning away [Disease] or [Poison] like dirt.\n* Reduces [Poison] and [Disease] damage rolls by the skill level.")
                              )
                            ),
                            Core.vx_new_string(":Exorcism"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Exorcism"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Banish a spirit that is possessing a person, item, or location.")
                              )
                            ),
                            Core.vx_new_string(":Halo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Halo"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Magnificient halo of light appears behind the user's head.  Observers are awed by the sight.\n* [Action] - +1 on Social abiliites."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Godshead")
                              )
                            ),
                            Core.vx_new_string(":Introspection"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Introspection")
                              )
                            ),
                            Core.vx_new_string(":Pacifism"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pacifism")
                              )
                            ),
                            Core.vx_new_string(":Penance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Penance")
                              )
                            ),
                            Core.vx_new_string(":Purify"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Purify"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Contamination including filth, [Disease], [Poison], or [Raditation] may be cleansed in a small area.")
                              )
                            ),
                            Core.vx_new_string(":Purge"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Purge")
                              )
                            ),
                            Core.vx_new_string(":Sanctuary"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sanctuary"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* From the user's perspective, it is like being on stage. While chanting, a spotlight seems to come upon the user, all other lights dim, and enemies cease to notice the user's presence.")
                              )
                            ),
                            Core.vx_new_string("Sense Corruption"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sense Corruption")
                              )
                            ),
                            Core.vx_new_string(":Serenity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Serenity")
                              )
                            ),
                            Core.vx_new_string("Throw Salt"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Throw Salt")
                              )
                            ),
                            Core.vx_new_string("True Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("True Sight")
                              )
                            ),
                            Core.vx_new_string("Vow of Chastity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vow of Chastity"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Celibacy")
                              )
                            ),
                            Core.vx_new_string("Vow of Obedience"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vow of Obedience"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("To dream the impossible dream\nTo fight the unbeatable foe\nTo bear with unbearable sorrow\nAnd to run where the brave dare not go\n\nTo right the unrightable wrong\nAnd to love pure and chaste from afar\nTo try when your arms are too weary\nTo reach the unreachable star\n\nThis is my quest\nTo follow that star\nNo matter how hopeless\nNo matter how far\n\nTo fight for the right\nWithout question or pause\nTo be willing to march, march into Hell\nFor that heavenly cause\n\nAnd I know if I'll only be true\nTo this glorious quest\nThat my heart will lie peaceful and calm\nWhen I'm laid to my rest - Don Quixote, The Impossible Dream"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The vow of obedience is a commitment to truly follow the direction of ones beliefs regardless of obstacles or consequences knowing that whatever the outcome, it was always the true, right outcome.")
                              )
                            ),
                            Core.vx_new_string("Vow of Poverty"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vow of Poverty")
                              )
                            ),
                            Core.vx_new_string("Vow of Silence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vow of Silence")
                              )
                            ),
                            Core.vx_new_string("Ward Undead"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ward Undead")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Conviction"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Conviction"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Being religious is a form of conceit. the faith in which I was brought up assured me that I was better than other people; I was 'saved,' they were 'damned'... Our hymns were loaded with arrogance - self-congratulation... With a touch more confidence and a liberal helping of ignorance, I would have been a famous evangelist... A confidence man knows he's lying; that limits his scope. But a successful shaman believes what he says - and belief is contagious; there is no limit to his scope.  - Jubal, Stranger in a Strange Land"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Crusader, Faithful, Fanatic, Grand Inquisitor, Inquisitor, Paladin, Zealot"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Spirit"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Crusade"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crusade"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Jihad")
                              )
                            ),
                            Core.vx_new_string(":Defiance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Defiance")
                              )
                            ),
                            Core.vx_new_string(":Demonize"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demonize")
                              )
                            ),
                            Core.vx_new_string(":Devotion"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Devotion")
                              )
                            ),
                            Core.vx_new_string("Do or Die"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Do or Die")
                              )
                            ),
                            Core.vx_new_string("Eternal Vigilance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eternal Vigilance")
                              )
                            ),
                            Core.vx_new_string("Faith Sustains Me"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Faith Sustains Me"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* May fast as long as skill roll exceeds number of weeks of fasting.")
                              )
                            ),
                            Core.vx_new_string(":Fanaticism"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fanaticism")
                              )
                            ),
                            Core.vx_new_string("Holy Armor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Holy Armor")
                              )
                            ),
                            Core.vx_new_string("Holy Shield"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Holy Shield")
                              )
                            ),
                            Core.vx_new_string("Holy Strength"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Holy Strength")
                              )
                            ),
                            Core.vx_new_string(":Persecute"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Persecute")
                              )
                            ),
                            Core.vx_new_string(":Rapture"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rapture")
                              )
                            ),
                            Core.vx_new_string(":Righteousness"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Righteousness")
                              )
                            ),
                            Core.vx_new_string(":Sacrifice"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sacrifice")
                              )
                            ),
                            Core.vx_new_string(":Smite"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Smite"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Imbue weapon and body with the strength of your Conviction.\n* [Melee] or [Close Combat] vs. [Undead], [Devil] or [Demon]: use Conviction instead of weapon to determine damage.")
                              )
                            ),
                            Core.vx_new_string("Singular Will"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Singular Will"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Gain +1 to Defense when fighting in single combat with no other combatants around.")
                              )
                            ),
                            Core.vx_new_string("Soul Blast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Soul Blast")
                              )
                            ),
                            Core.vx_new_string(":Tithing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tithing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Pay 10% of your income to your superior and gain 10% of the income of your followers. This income must be completely spent on the faith.")
                              )
                            ),
                            Core.vx_new_string(":Zeal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zeal")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Convergence"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Convergence"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Divine power surrounds the petitioner and those deemed allies.\n* [Focus]: +1 [Defense]"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Blessing, Protection"),
                        Core.vx_new_string(":stat"),
                        Core.vx_new_string("Spirit"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Bless Object"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bless Object"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Apply a different blessing to object. That object can hold the blessing until triggered.\n* Duration: Level hours\n* Only level objects may be blessed at one time. If exceeded the earliest one is erased.")
                              )
                            ),
                            Core.vx_new_string("Blessing against Cold"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blessing against Cold"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Focus]: +1 [Defense] and +1 [Armor] vs. Cold")
                              )
                            ),
                            Core.vx_new_string("Blessing against Electricity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blessing against Electricity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Focus]: +1 [Defense] and +1 [Armor] vs. Electricity")
                              )
                            ),
                            Core.vx_new_string("Blessing against Fire"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blessing against Fire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Focus]: +1 [Defense] and +1 [Armor] vs. Fire")
                              )
                            ),
                            Core.vx_new_string("Blessing against Projectiles"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blessing against Projectiles"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Focus]: +1 [Defense] and +1 [Armor] vs. projectilees.")
                              )
                            ),
                            Core.vx_new_string("Blessing against Weapons"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blessing against Weapons"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Focus]: +1 [Defense] and +1 [Armor] vs. melee weapons. Unarmed combat is unaffected.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Enhance Blessing"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Enhance Blessing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When user activates a Blessing on an item, that Blessing has increased effect.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Divine"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Divine"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* It might take the suffering or worship of 10,000 souls to produce a grain of Divinity...but a single grain is beyond all the power of this world."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The ability to absorb the worship of others. Level determines the amount of Divinity that can be held at once."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Prime, Primal"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Divine Accuracy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divine Accuracy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack: Spend a [Divinity]. The attack cannot miss. The minimum number of hits is 1 Critical.")
                              )
                            ),
                            Core.vx_new_string("Divine Blessing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divine Blessing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: Transfer any amount of [Divinity] to the target.")
                              )
                            ),
                            Core.vx_new_string("Divine Grace"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divine Grace"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: Spend a [Divinity]. Perform another non-attack Action. That action cannot fail. The minimum success is 1 Critical.")
                              )
                            ),
                            Core.vx_new_string("Divine Shield"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divine Shield"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Action: Choose a shield or armor and spend a [Divinity]. For the next 3 turns, the shield or armor cannot be penetrated by force that is not also Divine.")
                              )
                            ),
                            Core.vx_new_string("Divine Strike"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divine Strike"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Attack: Spend a [Divinity].  If the attack hits, The damage is always at least 1 Critical.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Invocation"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Invocation"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* And he shall separate them one from another, as a shepherd divideth his sheep from the goats. And he shall set the sheep on his right, but the goats on his left. - Matthew 25: 32-33\n* Many cultures have regarded left-handedness as evil. Words such as sinister, which in Latin means both left and unlucky. Consequently, the left hand has often symbolized the rejection of traditional religion.\n* The word 'right' derives from the Hebrew term 'yamin' from the Old Testament, meaning 'stronger'. In Hebrew, the term for 'left' is 'smowl', meaning 'dark'.\n* It is possible that this division also derives from the practice of using the left hand for purposes of personal hygiene after defecation in some cultures, rendering the left hand 'unclean'."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Calling or summoning a spirit, demon, god or other supernatural agent for assistance.\n* Right Hand Path - Elevates spirituality, the strict observance of moral codes, and the worship of deities. The goal is to attain proximity to divinity, or integration with divinity.\n* Left Hand Path - Conversely, Left Hand Path values the advancement and preservation of the self, glorification of more temporal and terrestrial goals, and personal power rather than ephemeral spiritual attainments. Rather than valuing proximity to the divine, followers of Left-Hand Path belief systems seek to become divinities in their own right."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cabalist, Cleric, Diabolist, Evoker, Exorcist, Invoker, Minister, Priest, Ritualist"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Angelic Chorus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Angelic Chorus"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Divine Chorus")
                              )
                            ),
                            Core.vx_new_string(":Armageddon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Armageddon"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cataclysm")
                              )
                            ),
                            Core.vx_new_string(":Aspecting"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aspecting"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The practitioner manifests a particular aspect of a goddess or god (whether in speech, appearanve, behaviour or thought).")
                              )
                            ),
                            Core.vx_new_string(":Avatar"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avatar"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("The practitioner becomes a version of the goddess or god.")
                              )
                            ),
                            Core.vx_new_string("Burnt Offering"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Burnt Offering")
                              )
                            ),
                            Core.vx_new_string("Dark Ritual"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dark Ritual")
                              )
                            ),
                            Core.vx_new_string("Divine Intervention"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divine Intervention")
                              )
                            ),
                            Core.vx_new_string("Divine Favor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Divine Favor")
                              )
                            ),
                            Core.vx_new_string(":Drought"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drought")
                              )
                            ),
                            Core.vx_new_string(":Geis"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Geis"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Geas")
                              )
                            ),
                            Core.vx_new_string(":Flood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flood")
                              )
                            ),
                            Core.vx_new_string("Heaven's Gate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heaven's Gate"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Divine Gate, Hell's Gate")
                              )
                            ),
                            Core.vx_new_string(":Incarnation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Incarnation")
                              )
                            ),
                            Core.vx_new_string("Plague of Beetles"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plague of Beetles"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Flesh eating beetles burrow from the ground and sweep over the area like a carpet.")
                              )
                            ),
                            Core.vx_new_string("Plague of Locusts"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plague of Locusts"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A swarm of locusts descends on the area. They devour all food, clog intakes, short out equipment, and terrify people.")
                              )
                            ),
                            Core.vx_new_string("Plague of Sores"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plague of Sores"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A horrific disease descends on the area. Victims appear horrific and without treatment will be permanently scarred. Naturally, the disease is highly contagious.")
                              )
                            ),
                            Core.vx_new_string("Rain of Frogs"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rain of Frogs"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A torrent of frogs fall from the sky, splattering on any hard surfaces.  Fragile exposed items of all sorts are destroyed.")
                              )
                            ),
                            Core.vx_new_string(":Worship"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Worship"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Must choose a 'higher being' to worship.  Each higher being provides a bonus to a single specific ability.")
                              )
                            ),
                            Core.vx_new_string(":Tribute"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tribute")
                              )
                            ),
                            Core.vx_new_string(":Sacrifice"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sacrifice")
                              )
                            ),
                            Core.vx_new_string("Wrath of God"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wrath of God")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Life"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Life"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Aneurysm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Aneurysm")
                              )
                            ),
                            Core.vx_new_string("Cure Disease"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cure Disease")
                              )
                            ),
                            Core.vx_new_string("Heal Major Wound"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heal Major Wound")
                              )
                            ),
                            Core.vx_new_string("Heal Minor Wound"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heal Minor Wound")
                              )
                            ),
                            Core.vx_new_string("Heal Scars"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heal Scars")
                              )
                            ),
                            Core.vx_new_string("Heart Attack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heart Attack")
                              )
                            ),
                            Core.vx_new_string("Poison Backlash"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Poison Backlash"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Touch a unit with a [Poison] ability.  The target is affected as if the ability was used against itself at full strength.")
                              )
                            ),
                            Core.vx_new_string(":Regenerate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Regenerate")
                              )
                            ),
                            Core.vx_new_string(":Replenish"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Replenish")
                              )
                            ),
                            Core.vx_new_string(":Resurrect"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Resurrect"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The ability to truly bring the dead back to life is one of the most desired and difficult of all abilities. The ritual is long and complicated with a high chance of failure.  Only one of the same race as the deceased has sufficient self understanding to succeed at all.  The caster must also get at least 10 [Successes] and/or [Criticals] or the ritual fails.  Each subsequent attempt to raise the same target requires 1 additional success.")
                              )
                            ),
                            Core.vx_new_string(":Simulacrum"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Simulacrum"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grow a physical copy of a living creature. It possesses no mind or spirit unless given one through other means."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Clone")
                              )
                            ),
                            Core.vx_new_string(":Succor"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Succor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Relieves pain\n* Can ignore the negative effects of all tokens while this is in effect."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Comfort")
                              )
                            ),
                            Core.vx_new_string(":Transference"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Transference")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Radiant"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Radiant"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Bright, Light, Lightbringer"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Blinding Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blinding Light")
                              )
                            ),
                            Core.vx_new_string("Blinding Wall"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blinding Wall"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Wall of Light")
                              )
                            ),
                            Core.vx_new_string(":Daybreak"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Daybreak"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Gain +1 [Light] Skill for the first hour after the crack of dawn.")
                              )
                            ),
                            Core.vx_new_string("Command Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Command Light"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Redirect a [Light] ability to a new target.")
                              )
                            ),
                            Core.vx_new_string(":Moonbeam"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Moonbeam")
                              )
                            ),
                            Core.vx_new_string("Purifying Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Purifying Light"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Glowing rays of light appear to emanate from any light the user possesses. Vermin, undead, demons, devils, or any user of [Corruption] will be damaged by the light as if it were [Fire]. All pure beings struck by the rays may remove a [Stun] Token."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Divine Light, Holy Light")
                              )
                            ),
                            Core.vx_new_string("Summon Radiance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Summon Radiance")
                              )
                            ),
                            Core.vx_new_string(":Sunbeam"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sunbeam")
                              )
                            ),
                            Core.vx_new_string("Swords of Revealing Light"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swords of Revealing Light"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Blazing rays of light shine around the user, revealing hidden or disguised things.\n* [Action]: Any hidden or disguised thing directly in front of the user, reduces its chance to stay concealed by the [Successes].")
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
            Core.vx_new_string("Nature Magic"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Nature Magic"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Animal Control"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Animal Control"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Restrictions - Must not harm animals."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Beast Lord, Beast Master"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Animal Magnetism"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animal Magnetism")
                              )
                            ),
                            Core.vx_new_string("Animal Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animal Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("[Ward] - Defends against animals.")
                              )
                            ),
                            Core.vx_new_string("Banish Vermin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Banish Vermin")
                              )
                            ),
                            Core.vx_new_string("Beast Lore"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Beast Lore")
                              )
                            ),
                            Core.vx_new_string("Beast Tongue"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Beast Tongue"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("[Tongue] - Speak with Animal")
                              )
                            ),
                            Core.vx_new_string("Bird's Eye"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bird's Eye"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Have a bird spy for you.")
                              )
                            ),
                            Core.vx_new_string("Call of the Wild"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call of the Wild"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Make an emotional plea for aid to any [Beast]s or [Animal]s within [Range]. Note that creatures will only help if it serves their own interests, and they will act indepentently according to their intelligence and nature.")
                              )
                            ),
                            Core.vx_new_string("Calm the Beast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Calm the Beast")
                              )
                            ),
                            Core.vx_new_string("Commune with Animals"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Commune with Animals"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Sense if animals in [Range] notice anything significant. The higher the [Success], the more subtle information received.")
                              )
                            ),
                            Core.vx_new_string("Control Beast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Beast")
                              )
                            ),
                            Core.vx_new_string("Purge Venom"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Purge Venom"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By sucking on a bite, the user may rapidly remove a creature's venom from a wound.\n* [Action]: Remove 1 Poison Counter for each success.")
                              )
                            ),
                            Core.vx_new_string("Creeping Doom"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Creeping Doom")
                              )
                            ),
                            Core.vx_new_string("Giant Animal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Giant Animal")
                              )
                            ),
                            Core.vx_new_string(":Infestation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Infestation")
                              )
                            ),
                            Core.vx_new_string("Insect Swarm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Insect Swarm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Distracts targets and transfers up to 3 conditions from you to the target.")
                              )
                            ),
                            Core.vx_new_string("Locate Animal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Locate Animal")
                              )
                            ),
                            Core.vx_new_string("Nature of the Beast"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nature of the Beast")
                              )
                            ),
                            Core.vx_new_string("Natural Order"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Natural Order")
                              )
                            ),
                            Core.vx_new_string("Scent of the Wild"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scent of the Wild"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Cover the unnatural and threatening scent of creatures and gear in range. Natural creatures will treat them as if they were large herbivores.")
                              )
                            ),
                            Core.vx_new_string("Shrink Animal"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shrink Animal")
                              )
                            ),
                            Core.vx_new_string("Speak with Animals"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Speak with Animals")
                              )
                            ),
                            Core.vx_new_string("Survival of the Fittest"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Survival of the Fittest"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Natural Selection")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Naturalism"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Naturalism"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Restrictions - Must not harm plants."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Botomancy, Druid, Hierophant, Nature Master"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Animate Plant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Animate Plant")
                              )
                            ),
                            Core.vx_new_string("Awaken Tree"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Awaken Tree"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Awakens a tree and permanently gives it consciousness.  Some say that all trees were once awake.")
                              )
                            ),
                            Core.vx_new_string("Back to Nature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Back to Nature"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dead wood or hide rapid decays.")
                              )
                            ),
                            Core.vx_new_string("Banish Weeds"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Banish Weeds")
                              )
                            ),
                            Core.vx_new_string(":Barkskin"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Barkskin")
                              )
                            ),
                            Core.vx_new_string("Binding Vines"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Binding Vines")
                              )
                            ),
                            Core.vx_new_string("Call the Creep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call the Creep")
                              )
                            ),
                            Core.vx_new_string("Call the Trees"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call the Trees")
                              )
                            ),
                            Core.vx_new_string("Commune with Nature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Commune with Nature")
                              )
                            ),
                            Core.vx_new_string("Choking Fungus"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Choking Fungus"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Fungus spontaneously grows in the area and releases spores that cause uncontrollable coughing to anyone who breathes without a fine filter in the area.")
                              )
                            ),
                            Core.vx_new_string("Drink from the Earth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Drink from the Earth")
                              )
                            ),
                            Core.vx_new_string("Fertile Crops"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fertile Crops")
                              )
                            ),
                            Core.vx_new_string("Food from the Sun"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Food from the Sun")
                              )
                            ),
                            Core.vx_new_string("Force of Nature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Force of Nature")
                              )
                            ),
                            Core.vx_new_string("Heal Nature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Heal Nature")
                              )
                            ),
                            Core.vx_new_string("Knock on Wood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knock on Wood"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Touch Wood and Remove a Token and place it on the Wood.")
                              )
                            ),
                            Core.vx_new_string("Locate Plant"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Locate Plant")
                              )
                            ),
                            Core.vx_new_string("Nature Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nature Sight")
                              )
                            ),
                            Core.vx_new_string("Nature Walk"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nature Walk"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Merlin, Excalibur"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Travel at exceptional speed through forests while appearing to walk calmly appearing and reappearing at greater distances.\n* [Continuous]: Ignore [Success] movement penalties in [Forest], [Jungle], [Swamp] and other overgrown terrain. Additionally, [Success] is applied as a penalty for anything attempting to [Track] you.")
                              )
                            ),
                            Core.vx_new_string(":Overgroth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Overgroth")
                              )
                            ),
                            Core.vx_new_string("Plant Lore"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plant Lore")
                              )
                            ),
                            Core.vx_new_string("Plant Mastery"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plant Mastery")
                              )
                            ),
                            Core.vx_new_string("Plant Tongue"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plant Tongue"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Speak with Plant")
                              )
                            ),
                            Core.vx_new_string("Plant Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Plant Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Defends against Plants")
                              )
                            ),
                            Core.vx_new_string(":Purification"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Purification")
                              )
                            ),
                            Core.vx_new_string(":Root"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Root")
                              )
                            ),
                            Core.vx_new_string("Tree Form"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tree Form")
                              )
                            ),
                            Core.vx_new_string("Wall of Thorns"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall of Thorns"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Wall]\n* May only be cast on [Forest].\n* The wall gains double Terrain Penalty.")
                              )
                            ),
                            Core.vx_new_string("Warp Wood"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Warp Wood")
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
            Core.vx_new_string(":Spiritualism"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Spiritualism"),
                Core.vx_new_string(":powermap"),
                Core.f_new(
                  Base.t_powermap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Divination"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Divination"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Casting: In various methods of divination, stones, cards, sticks and other objects are cast onto the ground or a special cloth so that an insight into the life patterns can be revealed.\n* Querent: In divination and ritual, the querent is the asker of questions.\n* Scrying: This is the area of divining by gazing into a reflecting surface."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Divination is the practice of discovering the unknown.  It can foresee the future, find hidden things, uncover lost lore, and reveal deception.\n* Practitioners may see the many roads to the future and may choose the path that favors themselves and hinders their foes.\n* Fortune telling is more interested in predicting future events.  Rather, divination tends to be more about discovering information.\n* It is an accepted truism within magick that divination is imperfect."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Augur, Diviner, Fortune Teller, Oracle, Prophet, Seer, Soothsayer, Visionary"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("All Seeing Eye"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("All Seeing Eye"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Eye of  Providence")
                              )
                            ),
                            Core.vx_new_string(":Augury"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Augury")
                              )
                            ),
                            Core.vx_new_string(":Cartomancy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cartomancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The art of reading the future through playing cards or tarot cards.")
                              )
                            ),
                            Core.vx_new_string(":Clairaudience"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Clairaudience")
                              )
                            ),
                            Core.vx_new_string(":Clairvoyance"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Clairvoyance")
                              )
                            ),
                            Core.vx_new_string(":Dowsing"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dowsing"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Through the use of a divining rod the user may detect desired items hidden underground below them.")
                              )
                            ),
                            Core.vx_new_string("Fortune Telling"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fortune Telling"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Deploy]: Roll vs. target Spirit.  If you succeed, you receive +1 on all actions against him this encounter.\n* Casting - In various methods of divination, bones, stones, cards, sticks and other objects are cast onto the ground or a special cloth so that an insight into the life patterns can be revealed.\n* Bibliomancy - Reading random passages from a book, such as Liber Legis or the I Ching.\n* Tea Leaves\n* Tarot")
                              )
                            ),
                            Core.vx_new_string(":Hallmark"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hallmark"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Analyze a magical effect to learn information about its caster.")
                              )
                            ),
                            Core.vx_new_string(":Kismet"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kismet")
                              )
                            ),
                            Core.vx_new_string("Mirror of Truth"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mirror of Truth"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Enchant a reflective surface to show the true nature of the reflected scene. This reveals illusions, hidden things, and can even reveal the nature of those concealing terrible secrets.")
                              )
                            ),
                            Core.vx_new_string(":Portent"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Portent"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Determine if a chosen course of action will tend to be beneficial to the user or not. How it might be beneficial is not known."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Omen")
                              )
                            ),
                            Core.vx_new_string(":Postcognition"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Postcognition")
                              )
                            ),
                            Core.vx_new_string(":Precognition"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Precognition")
                              )
                            ),
                            Core.vx_new_string(":Prediction"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prediction")
                              )
                            ),
                            Core.vx_new_string(":Premonition"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Premonition")
                              )
                            ),
                            Core.vx_new_string(":Prophesy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Prophesy")
                              )
                            ),
                            Core.vx_new_string(":Providence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Providence"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Divine a time and place nearby that will be beneficial if the user goes there. The roll result is not known by the user, and the success determines the benefit.")
                              )
                            ),
                            Core.vx_new_string(":Revelation"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Revelation")
                              )
                            ),
                            Core.vx_new_string(":Foresight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Foresight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Foresight is a passive form of extra-sensory perception whereby a person spontaneously perceives information, in the form of vision, about future events before they happen.  It is distinguished from [Precognition] in that it is passive.")
                              )
                            ),
                            Core.vx_new_string("Twist of Fate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Twist of Fate")
                              )
                            ),
                            Core.vx_new_string(":Visions"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Visions")
                              )
                            ),
                            Core.vx_new_string(":Wyrding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wyrding")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":specialtymap"),
                        Core.f_new(
                          Base.t_specialtymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Hepatomancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hepatomancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The art of divining the future through the examination of a creature's entrails.")
                              )
                            ),
                            Core.vx_new_string(":Numerology"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Numerology"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The art of divining the future through the examination of numbers and dates.")
                              )
                            ),
                            Core.vx_new_string(":Osteomancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Osteomancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The art of divining the future through decaying bones.")
                              )
                            ),
                            Core.vx_new_string("Rune Casting"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rune Casting"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The art of divining the future through the throwing of small tiles with runes on them.")
                              )
                            ),
                            Core.vx_new_string(":Scrying"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Scrying"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This is the art of divining by gazing into a reflecting surface.")
                              )
                            ),
                            Core.vx_new_string(":Tasseomancy"),
                            Core.f_new(
                              Base.t_specialty,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tasseomancy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reading the patterns of tea leaves or coffee grounds left after the person drink it.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Dreaming"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dreaming"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I don't believe it.  That is why you fail.  Luke and Yoda - Empire Strikes Back"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This is the magical art of the [Fae].\n* Every child has a sense of wonder that comes with being new to the world. Adults must, of necessity, murder that special innocence in order to grow up.\n* When humanity turned its collective back on Dreaming, a terrible scourge of disbelief and negation smote the world. Hope, trust, and imagination were replaced with reason, pessimism, and scrutiny. By dismissing hope and faith, humanity avoids being hurt by its failure. Shutting out mystery and dreams anesthetizes fear, but deadens beauty as well and leads to apathy, callosuness, and close-mindedness. Though Banality is a mindless force, it is feared by the [Fae] more than any monster or villain. It is an enemy unlike anything the [Fae] have ever encountered, and they are largely helpless in its grasp.\n* Dreaming is never the same, so any Dreaming effect must be a uniquely crafted idea or it will automatically fail."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Glamour"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("As if in a Dream"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("As if in a Dream"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Confuse a target's senses to perceive a single thing incorrectly.")
                              )
                            ),
                            Core.vx_new_string("Concoct Dream Essence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Concoct Dream Essence"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dreams caught with [Dreamcatching] can be contained in a bottle called [Dream Essence]. Opening the bottle releases the experience of the dream to all surrounding it.")
                              )
                            ),
                            Core.vx_new_string("Create Chimera"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Create Chimera"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("A Chimera is an imaginary creation. It exists only to the user, though those with magical abilities, young children and the mentally impaired may see them. They only can affect those who can see them.")
                              )
                            ),
                            Core.vx_new_string("Down the Rabbit Hole"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Down the Rabbit Hole"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: A hole that leads somewhere unknown.\n* [Action]: By entering a hole, the Dreamer may travel to the [Spirit Realm].  If the Dreamer is a native of the [Spirit Realm], he may stay as long as he wants. If not, he will return to the real world after [Skill] hours as if waking from a dream.")
                              )
                            ),
                            Core.vx_new_string(":Dreamcatching"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dreamcatching")
                              )
                            ),
                            Core.vx_new_string(":Dreamquest"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dreamquest"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Requires]: Sleeping\n* [Action]: While asleep, Spirit enters the [Spirit Realm].  The Spirit may travel as long as it wants, but whenever the Body awakens, the Spirit immediately returns.\n* [Death]: Spirit may permanently enter the [Spirit Realm].")
                              )
                            ),
                            Core.vx_new_string("Dream Effectively"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dream Effectively"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I was just thinking. Wouldn't it be funny if I wasn't the only one who could dream effectively? What if everybody could do it? And reality was being pulled out from under us all the time - and we didn't even know it? - George Orr, The Lathe of Heaven\n* Oh, my God... I just killed six billion people... - George Orr, The Lathe of Heaven")
                              )
                            ),
                            Core.vx_new_string("Dream Riding"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dream Riding"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Ability to enter another person's dream.")
                              )
                            ),
                            Core.vx_new_string("Dream Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dream Sight")
                              )
                            ),
                            Core.vx_new_string("Dream Speak"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dream Speak"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Grants the ability to converse with things that cannot normally speak including plants, animals, and inanimate objects. Such beings have knowledge and personalities limited by their natures.")
                              )
                            ),
                            Core.vx_new_string("Dream Weaving"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dream Weaving"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* She was shaping a world. She could envision the world, feel the spring of the earth beneath her bare feet, the warmth of the sun, the vibrant green of the grass, the hazy blue of distant mountains. 'Do you feel it?' 'Yes.' 'Then make it real.' She brought all of her will to paint all the details of the dream onto a new reality. She opened her eyes and gazed out upon the land she had already seen in her mind. It was so beautiful it took her breath away ... and failed to return it. She gasped as her lungs emptied and her vision faded to black ... 'A useful lesson. You forgot to breathe in the scents of your world that would indicate air. Remember even the smallest detail is crucial.' - Tales of Magick")
                              )
                            ),
                            Core.vx_new_string(":Epiphany"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Epiphany"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A moment of ecstasy, delight, and intense revelation. During epiphanies, disparate things suddenly synchronize and make sense. Ephipanies often trigger major changes in personality or goals.")
                              )
                            ),
                            Core.vx_new_string("Eyes of a Child"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Eyes of a Child"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* All Chimera become visible to those you chose.")
                              )
                            ),
                            Core.vx_new_string("Fond Memories"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fond Memories"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Eternal Sunshine of the Spotless Mind"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This ability makes every childhood dream and ambition real again. Every imaginary friend is remembered clearly and the happiest moments from youth return with the intensity of a first kiss and the excitement of Christmas. Then, suddenly, its over. In their absence, depression can crash down.  Truly fallen beings can become suicidal. The remembrance can be uplifting in the end, allowing one to relive the best moments of life.")
                              )
                            ),
                            Core.vx_new_string("Imaginary Friend"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imaginary Friend"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* As I was walking up the stair, I met a man who wasn't there. He wasn't there again today. If only he would go away. - Children's Nursery Rhyme\n* Mother, do you remember when I was little, I had a friend, he was make-believe? No. Don't you remember? Only I could see him? No, I don't remember Drop Dead Fred at all. - Drop Dead Fred\n* Let's write something on the carpet... I know how about 'Mother SUCKS'. - Drop Dead Fred"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Create a character with a distinct personality of your choice that only the target can see.")
                              )
                            ),
                            Core.vx_new_string("Living Nightmare"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Living Nightmare"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A chimerical monster formed from nightmares or madness."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Waking Nightmare")
                              )
                            ),
                            Core.vx_new_string("Nightmare Essence"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nightmare Essence"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Nightmares caught with [Dreamcatching] can be contained in a bottle. Opening the bottle releases the experience of the dream to all surrounding it. These can be used as grenades.")
                              )
                            ),
                            Core.vx_new_string("Pillow Fort"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pillow Fort"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* By exercising one's imagination, a soft barrier can provide real defense but only for the Dreamer.\n* [Action]: Any material may be chosen to provide [Skill] defense for the user.")
                              )
                            ),
                            Core.vx_new_string(":Rapture"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rapture"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An extremely difficult and rare ability of self-discovery to create Glamour from oneself. Only at a moment of sudden self-realization can a Rapture be attained.\n* [Passive] - While in a Rapture, all [Critical] results generate [Glamour Token]s.")
                              )
                            ),
                            Core.vx_new_string(":Ravaging"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ravaging"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Drain creativity from a subject. The subject must be well known and a good knowledge of how the subject dreams is required. After that, the subject must simply be touched and he/she will experience a wave of depression and fear as the Glamour is drained from them.\n* [Action]: Touch the subject. Roll [Banality]. Gain +1 [Glamour Token] if any successes. If no [Glamour] is gained, both the user and subject gain +1 [Banality] instead.")
                              )
                            ),
                            Core.vx_new_string(":Reverie"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reverie"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Say or suggest things that inspire others to wonderful ideas and creations. This is a time-consuming process to discover they subtle things that inspire another to great works.\n* [Extended Action]: Inspire someone while they create.\n* [Action]: View a work of art created during Reverie. Gain +1 [Glamour Token]. A particular work of art may only grant this bonus once a year."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Muse")
                              )
                            ),
                            Core.vx_new_string(":Seeming"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seeming"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Take on the appearance of another.")
                              )
                            ),
                            Core.vx_new_string("Shattered Dreams"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shattered Dreams")
                              )
                            ),
                            Core.vx_new_string("Wall of Wonders"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wall of Wonders"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A wall of dreams. Causes [Fascination] in those who view it.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Enchantment"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Enchantment"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Enchantment/Witchcraft focuses on enchantments that alter the fate of the target.\n* The deities of Witchcraft are embodiments of a life-force manifest in nature. The Goddess and God are seen as complementary polarities and this balance is seen in nature. They are sometimes symbolised as the Sun and Moon, and from her lunar associations the Goddess becomes a Triple Goddess with aspects of Maiden, Mother, and Crone. Some hold the Goddess to be pre-eminent, since she contains and conceives all. The God is the spark of life and inspiration within her, simultaneously her lover and her child."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Abjuration, Beguiler, Enchanter, Enchantress, Entrancer, Hexer, Warlock, Witch, Witchcraft, Witchdoctor"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Barren Loins"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Barren Loins"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Target cannot conceive a child while under this curse.")
                              )
                            ),
                            Core.vx_new_string(":Charm"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Charm"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The opposite of [Malediction]. Charm reduces the severity of negative effects.\n* [Requires]: Target cannot have any [Charm] Tokens.\n* [Action]: Roll vs. Spirit and add a Black [Charm] Token for each [Hit]."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Warding Sign")
                              )
                            ),
                            Core.vx_new_string("Death Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Death Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against undead beings.")
                              )
                            ),
                            Core.vx_new_string("Evil Eye"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Evil Eye"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Spirit")
                              )
                            ),
                            Core.vx_new_string("Fertile Loins"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fertile Loins"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Next intercourse will have doubled chance to conceive a child, if possible.")
                              )
                            ),
                            Core.vx_new_string(":Haste"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Haste"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Effect]: +1 Move\n* [Target]: [Area]\n* [Duration]: [Hits]")
                              )
                            ),
                            Core.vx_new_string("Inscribe Rune"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Inscribe Rune"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allows the permanent addition of magical properties to an item.")
                              )
                            ),
                            Core.vx_new_string("Inscribe Symbol"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Inscribe Symbol"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Allows the temporary addition of magical properties to an item, portal, or area.")
                              )
                            ),
                            Core.vx_new_string(":Malediction"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Malediction"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The opposite of [Charm]. Malediction increases the severity of negative effects.\n* [Action]: Roll vs. Spirit and add a Black [Curse] Token for each [Hit].")
                              )
                            ),
                            Core.vx_new_string("Magic Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magic Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against magical creatures.")
                              )
                            ),
                            Core.vx_new_string("Mental Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mental Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against mental attacks.")
                              )
                            ),
                            Core.vx_new_string("Metal Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Metal Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against predominately metal weapons.")
                              )
                            ),
                            Core.vx_new_string("Nature Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nature Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against Animals, and weather.")
                              )
                            ),
                            Core.vx_new_string(":Palsy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Palsy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Move")
                              )
                            ),
                            Core.vx_new_string(":Pox"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pox"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Social Skills")
                              )
                            ),
                            Core.vx_new_string("Rule of Three"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rule of Three"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Ever mind the Rule of Three, three times what thou givest returns to thee, this lesson well, thou must learn, thee only gets what thou dost earn."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Whatever energy a person puts out into the world, be it positive or negative, will be returned to that person three times.")
                              )
                            ),
                            Core.vx_new_string(":Safekeep"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Safekeep"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Enchant an item to prevent loss or theft. Any effect that would remove, loose, or damage the item must roll vs. Safekeep or fail in addition to any other checks.")
                              )
                            ),
                            Core.vx_new_string(":Slow"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Slow"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Effect]: -1 Move\n* [Target]: [Area]\n* [Duration]: [Hits]")
                              )
                            ),
                            Core.vx_new_string("Spirit Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spirit Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against spirit beings and attack against [Spirit].")
                              )
                            ),
                            Core.vx_new_string("Stone Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stone Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against predominately stone weapons.")
                              )
                            ),
                            Core.vx_new_string(":Weaken"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Weaken"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Reduces Body")
                              )
                            ),
                            Core.vx_new_string("Wood Ward"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wood Ward"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Provides increased defense against predominately wooden weapons.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Shamanism"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shamanism"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Shaman, Spirit Caller, Witch Doctor"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Call Spirits"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Call Spirits")
                              )
                            ),
                            Core.vx_new_string("Control Spirit"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Control Spirit")
                              )
                            ),
                            Core.vx_new_string(":Reincarnate"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Reincarnate"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Similar to [Resurrect], this ability allows a being to return to life in a new body if this ritual is performed soon after death. The reincarnated being will be physically different from the original, potentially different age, abilities, gender, race, or species. The being will have most of its original memories, but will often have a substantially different personality. If any [Successes] are made, the reincarnation succeeds and the character must be created again with significant differences and will appear in a location consistent with its new identity. The new character is built at a level equal to it original level or the reincarnate skill level whichever is lower. If the reincarnate skill level is lower than 10, the reincarnated being will be -10% younger than before for each level below 10.")
                              )
                            ),
                            Core.vx_new_string("Second Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Second Sight"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* I've got electric light, and I've got second sight.  I've got amazing...powers...of observation.  And that is how I know...When I try to get through...On the telephone to you...There will be nobody home. - Pink Floyd, Nobody Home"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Second sight is the ability to see the spiritual essence of beings. It quickly identifies the living from the unliving and can detect disease both phyiscal and mental.")
                              )
                            ),
                            Core.vx_new_string("Spirit Guide"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spirit Guide")
                              )
                            ),
                            Core.vx_new_string("Spiritual Affinity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spiritual Affinity"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Death: Enter the Spirit Realm")
                              )
                            ),
                            Core.vx_new_string(":Totem"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Totem")
                              )
                            ),
                            Core.vx_new_string("Vision Quest"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vision Quest")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Sympathy"),
                    Core.f_new(
                      Base.t_power,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sympathy"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Synchronicity is a phenomenon where people interpret two seemingly unrelated experiences as being meaningfully intertwined."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Sympathetic magic is using a symbol to represent the thing you want to affect with your magic. Whatever you do to the symbol, you do to the target. The object and the thing it represents are 'in sympathy'; they are aligned. Sympathetic magic is a useful idea because often, your target is something non-physical, or something you can’t otherwise interact with directly. You could banish negative thoughts directly, but it’s easier to tie them to something physical by writing them down and then burning the paper. As the paper burns, so does the negativity. Correspondences are related to this. For example, different-colored candles represent different desires (like green for money, red for love, black for banishment, etc.) and as the candle burns down, your spell is cast. Wearing different stones or crystals can attract luck or success to you.   \n				* Cursed Energy - Cursed energy is born from negative emotions such as grief and anger. These negative feelings are common in human society so almost everyone possesses cursed energy. Cursed Energy can be controlled and focused to perform various magical feats.\n				* Cursed Spirit - Cursed Spirits are apparitions manifested entirely from cursed energy. Even their bodies are composed of cursed energy, making cursed spirits invisible to non-sorcerers. The emission of cursed energy from humans collects like sediment until a cursed spirit is born from the collective negative energy. Cursed Spirits born with strong feelings directed toward a certain aspect are especially strong. The stronger humanity's fear and anger is directed at cursing a certain aspect of the world, like natural disasters, the more powerful Curse Spirits spawned from those negative sentiments will be.\n				* Law of Similarity - Like produces like. An effect resembles its cause.\n				* Law of Contact/Contagion - Things which have once been in contact with each other continue to act on each other at a distance."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Correspondence, Curses, Sympathetic Magic, Synchonicity, Voodoo, Witch man, Witchdoctor"),
                        Core.vx_new_string(":abilitymap"),
                        Core.f_new(
                          Base.t_abilitymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Black Vise"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Black Vise"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Target must use a special [Ability] each [Turn] or take a [Stun].")
                              )
                            ),
                            Core.vx_new_string("Breath of Life"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Breath of Life"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create an [Animated] creature."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Cursed Corpse")
                              )
                            ),
                            Core.vx_new_string("Cursed Sight"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cursed Sight"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Curses and Cursed Spirits are normally invisibile, but this ability allows them to be seen.")
                              )
                            ),
                            Core.vx_new_string("Cursed Tool"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cursed Tool")
                              )
                            ),
                            Core.vx_new_string("Cursed Weapon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cursed Weapon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Cursed Item - Items can also be infused with Curse Energy including such as cursed tools, cursed objects, and cursed corpses.")
                              )
                            ),
                            Core.vx_new_string("Dominant Possession"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dominant Possession"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* After defeating a target in mental combat, the user possesses the body of the target. The user keeps his Mind and Will stats and uses the target's Body."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Skinriding")
                              )
                            ),
                            Core.vx_new_string(":Effigy"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Effigy"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Poppet, Voodoo Doll"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a figure representing the target. The target can be a being, a vehicle, a building, etc. The figure can be a doll, a wax figurine, an Origami, a sculpture, a drawing, or any other image created by hand by the caster. In addition, the Effigy must have some item linking it to the target. This can be a possession, a hair, a body part, etc. The more significant the better.\n* Spells may then be cast upon the figure as if the figure was at 4 spaces range regardless of actual distance or line of sight. This ability can create any number of effects, but it cannot actually cause physical damage. All Body damage becomes [Stun] if the target cannot take anymore [Stun], the excess is ignored.\n* The ability level of any Spells cast are [Limited] by the skill with which the Effigy is created and the significance of the item linked to the Effigy."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Straw Man")
                              )
                            ),
                            Core.vx_new_string(":Fetish"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fetish"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A fetish is a small object that can be used to bind a spirit. The item must be unique and may be found or created.\n* [Action]: If you killed an extradimensional creatures last turn, you may capture the spirit of that creature in the Fetish.\n* [Action]: Release the spirit in the fetish to perform one task that turn. The spirit must perform the task if it is able though it does so under duress and may twist the intentions or deceive the user. Regardless of outcome, the spirit is released and will disappear.")
                              )
                            ),
                            Core.vx_new_string(":Figurine"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Figurine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A miniature of a small creature grows into a full size version.")
                              )
                            ),
                            Core.vx_new_string("Iron Maiden"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iron Maiden"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Target takes 1 Stun Token for each point of combat damage it inflicts."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Thorns")
                              )
                            ),
                            Core.vx_new_string(":Juju"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Juju"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The most horrific of fetishes, the shrunken head permanently holds the spirit of the slain person in an undead limbo. A shrunken head may only be created immediately after the user directly slays a person. After that a gruesome series of rituals over the next week mummifies the head and binds the spirit to the head.\n* [Action]: Once per day, for 1 hour, the user may speak to the head and the head will telepathically respond. The head is effectively a prisoner of the user, and the user may interrogate or torment the head as he sees fit. The head cannot remain silent, but it does not have to be helpful or truthful."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Shrunken Head, Tsantsa")
                              )
                            ),
                            Core.vx_new_string("Life-like Art"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Life-like Art")
                              )
                            ),
                            Core.vx_new_string("Life-like Tattoo"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Life-like Tattoo")
                              )
                            ),
                            Core.vx_new_string("Living Tool"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Living Tool"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Animates a small tool which makes the next skill easier.\n* [Requires]: A simple tool with no moving parts.\n* [Action]: On the next action the tool may be used at [+1 Skill].")
                              )
                            ),
                            Core.vx_new_string("Living Weapon"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Living Weapon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Animates a melee weapon which makes the next attack easier.\n* [Requires]: A melee weapon with no moving parts.\n* [Action]: On the next action the weapon may be used at [+1 Skill].")
                              )
                            ),
                            Core.vx_new_string(":Miniature"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Miniature"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A miniature of a simple item grows into a full size version.")
                              )
                            ),
                            Core.vx_new_string(":Puppeteer"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Puppeteer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* When this unit acts the target unit must perform the same actions.")
                              )
                            ),
                            Core.vx_new_string(":Rack"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rack"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Each time Target uses a special [Ability] it takes a [Stun].")
                              )
                            ),
                            Core.vx_new_string(":Serendipity"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Serendipity")
                              )
                            ),
                            Core.vx_new_string("Spirit Bottle"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spirit Bottle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a bottle, mirror, or vase that captures and holds the Spirit of a being. If the being's body dies, the spirit continues to exist in the bottle. The spirit may mentally communicate with anyone touching the bottle.")
                              )
                            ),
                            Core.vx_new_string("Spirit Link"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spirit Link"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Create a bond with target. Each time it does damage to a target, remove 1 white token from yourself.")
                              )
                            ),
                            Core.vx_new_string("Subtle Possession"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Subtle Possession"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The user's spirit secretly enters the body of the target. The user acts as a manipulative inner voice to the target.")
                              )
                            ),
                            Core.vx_new_string("Sympathetic Bond"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sympathetic Bond"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* [Action]: Bond with a willing unit.\n* [Action]: Transmit an emotion to a bonded unit.")
                              )
                            ),
                            Core.vx_new_string("True Name"),
                            Core.f_new(
                              Base.t_ability,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("True Name"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* If the user knows the True Name of his subject, he gains +1 [Synchonicity] against that subject.")
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
        )
      )
    );
    return output;
  }

  /**
   * @function tacticsbook
   * @return {book}
   * (func tacticsbook)
   */
  public static interface Func_tacticsbook extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_tacticsbook();
  }

  public static class Class_tacticsbook extends Core.Class_base implements Func_tacticsbook {

    @Override
    public Func_tacticsbook vx_new(Object... vals) {
      Class_tacticsbook output = new Class_tacticsbook();
      return output;
    }

    @Override
    public Func_tacticsbook vx_copy(Object... vals) {
      Class_tacticsbook output = new Class_tacticsbook();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/magic", // pkgname
        "tacticsbook", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "book", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
    }

    @Override
    public Func_tacticsbook vx_empty() {return e_tacticsbook;}
    @Override
    public Func_tacticsbook vx_type() {return t_tacticsbook;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Magic.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Magic.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Magic.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Magic.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Magic"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("Magick.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Magic Overview"),
            Magic.f_chapter_magic_overview(),
            Core.vx_new_string("Magical Skills"),
            Magic.f_chapter_magical_skills(),
            Core.vx_new_string("Magic Items"),
            Magic.f_chapter_magic_items()
          )
        )
      )
    );
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("chapter_magic_items", Magic.t_chapter_magic_items);
    mapfunc.put("chapter_magic_overview", Magic.t_chapter_magic_overview);
    mapfunc.put("chapter_magical_skills", Magic.t_chapter_magical_skills);
    mapfunc.put("tacticsbook", Magic.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/magic", maptype, mapconst, mapfunc);
  }

}
