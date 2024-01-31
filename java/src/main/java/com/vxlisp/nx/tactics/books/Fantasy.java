package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Fantasy {

  /**
   * @function chapter_fantasy_overview
   * @return {chapter}
   * (func chapter_fantasy_overview)
   */
  public static interface Func_chapter_fantasy_overview extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_fantasy_overview();
  }

  public static class Class_chapter_fantasy_overview extends Core.Class_base implements Func_chapter_fantasy_overview {

    @Override
    public Func_chapter_fantasy_overview vx_new(Object... vals) {
      Class_chapter_fantasy_overview output = new Class_chapter_fantasy_overview();
      return output;
    }

    @Override
    public Func_chapter_fantasy_overview vx_copy(Object... vals) {
      Class_chapter_fantasy_overview output = new Class_chapter_fantasy_overview();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_fantasy_overview", // name
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
    public Func_chapter_fantasy_overview vx_empty() {return e_chapter_fantasy_overview;}
    @Override
    public Func_chapter_fantasy_overview vx_type() {return t_chapter_fantasy_overview;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_fantasy_overview();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_fantasy_overview() {
      return Fantasy.f_chapter_fantasy_overview();
    }

  }

  public static final Func_chapter_fantasy_overview e_chapter_fantasy_overview = new Fantasy.Class_chapter_fantasy_overview();
  public static final Func_chapter_fantasy_overview t_chapter_fantasy_overview = new Fantasy.Class_chapter_fantasy_overview();

  public static Base.Type_chapter f_chapter_fantasy_overview() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Fantasy Overview"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Fantasy Armor"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantasy Armor"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Cloth Armor - Increases Magical Regeneration\n* Light Armor - Increases Critical Strike change\n* Heavy Armor - Maximum Defense"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Moon Disc"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Moon Disc"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A [Silver] Shield."),
                        Core.vx_new_string(":classification"),
                        Core.vx_new_string("Shield")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Fantasy Weapons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Fantasy Weapons"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Faeblades")
              )
            ),
            Core.vx_new_string("Elder Tongue"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Elder Tongue"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("Prefixes\n* Alf - Elf\n* Dverg - Dwarf\n* Hel - Dead\n* Jotun - Giant\n* Man - Human\n* Muspel - Fire\n* Nifl - Mist\n* Svart - Dark\n* Yo - Demonic\nSuffixes\n* Ar - Race\n* Heim - Home\n* Ki - Soul\n* Ma - Creature\n* Traum - Dream\nWords\n* Alfar - Elvish Race\n* Albtraum - Elf Dream (Nightmare)\n* Alfheim - Land of Elves\n* Dvergar - Dwarven Race\n* Helar - Restless Dead\n* Helheim - Land of the dead\n* Manar - Human Race\n* Manheim - Land of Men\n* Muspelheim - Land of Fire\n* Niflheim - Land of Ice\n* Svartalfheim - Land of Dark Elves\n* Yoki - Demon Soul\n* Yoma - Demon")
              )
            )
          )
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_genshin_impact
   * @return {chapter}
   * (func chapter_genshin_impact)
   */
  public static interface Func_chapter_genshin_impact extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_genshin_impact();
  }

  public static class Class_chapter_genshin_impact extends Core.Class_base implements Func_chapter_genshin_impact {

    @Override
    public Func_chapter_genshin_impact vx_new(Object... vals) {
      Class_chapter_genshin_impact output = new Class_chapter_genshin_impact();
      return output;
    }

    @Override
    public Func_chapter_genshin_impact vx_copy(Object... vals) {
      Class_chapter_genshin_impact output = new Class_chapter_genshin_impact();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_genshin_impact", // name
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
    public Func_chapter_genshin_impact vx_empty() {return e_chapter_genshin_impact;}
    @Override
    public Func_chapter_genshin_impact vx_type() {return t_chapter_genshin_impact;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_genshin_impact();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_genshin_impact() {
      return Fantasy.f_chapter_genshin_impact();
    }

  }

  public static final Func_chapter_genshin_impact e_chapter_genshin_impact = new Fantasy.Class_chapter_genshin_impact();
  public static final Func_chapter_genshin_impact t_chapter_genshin_impact = new Fantasy.Class_chapter_genshin_impact();

  public static Base.Type_chapter f_chapter_genshin_impact() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Genshin Impact"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Archons"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Archons"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Furina"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Furina"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Focolor")
                      )
                    ),
                    Core.vx_new_string(":Nahida"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nahida")
                      )
                    ),
                    Core.vx_new_string("Raiden Shogun"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Raiden Shogun"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Raiden Shogun is the current Electro Archon. There are actually 3 versions of the Shogun that look almost identical: The twin sisters Ei and Makoto, and the artificial duplicate called the Puppet.\n* Makoto (Baal) - Makoto and Ei shared the title of Electro Archon, pretending to be a single being. Makoto was the diplomat and Ei was the warrior. Ei carried a sword, but she was not known to be a great warrior. Her electro powers were her main ability. Makoto died during the battle of Khaenri'ah.\n* Ei (Baalzebub) - Ei considered herself to be Makoto's shadow and mostly served as her muscle. After Makoto's death, she constructed the Puppet, tranfered her spirit into her sword, and mostly allowed the puppet to rule in her stead. Ei is divinely skilled in combat.\n* Puppet - The puppet is an advanced alchemical creation with power and combat ability perfectly equal to Ei in every way. Generally, the puppet is the only version of the Shogun that anyone sees. Even when Ei is in control, she is controlling the puppet, since she no longer has her own physical form.\n* Feats of Power\n** Musou no Hitotachi - A supposedly unblockable sword attack from the Shogun that is her supreme attack.\n** She easily defeats the traveller and nearly kills them.\n** She easily executes Signora and incinerates her.\n** She slew the god Orobashi and split the islands apart. Residual Electro still makes this area dangerous over 2000 years later.\n** She creates a perpetual storm around Inazuma for years.\n** She states that she can casually stop storms across the world to let people sleep."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Baal, Baalzebub, Ei, Makoto, Puppet, Shadow")
                      )
                    ),
                    Core.vx_new_string(":Venti"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Venti"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Barbados splits the mountains in Mondstadt with a divine wind and sends entire mountains flying to become the Golden Apple Archepelego.\n* Barbados is easily considered to be the weakest of the Archons."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Barbados")
                      )
                    ),
                    Core.vx_new_string("Zhong Li"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zhong Li"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Zhong Li dominated the Archon War."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Morax, Rex Lapis")
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
   * @function chapter_god_of_war
   * @return {chapter}
   * (func chapter_god_of_war)
   */
  public static interface Func_chapter_god_of_war extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_god_of_war();
  }

  public static class Class_chapter_god_of_war extends Core.Class_base implements Func_chapter_god_of_war {

    @Override
    public Func_chapter_god_of_war vx_new(Object... vals) {
      Class_chapter_god_of_war output = new Class_chapter_god_of_war();
      return output;
    }

    @Override
    public Func_chapter_god_of_war vx_copy(Object... vals) {
      Class_chapter_god_of_war output = new Class_chapter_god_of_war();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_god_of_war", // name
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
    public Func_chapter_god_of_war vx_empty() {return e_chapter_god_of_war;}
    @Override
    public Func_chapter_god_of_war vx_type() {return t_chapter_god_of_war;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_god_of_war();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_god_of_war() {
      return Fantasy.f_chapter_god_of_war();
    }

  }

  public static final Func_chapter_god_of_war e_chapter_god_of_war = new Fantasy.Class_chapter_god_of_war();
  public static final Func_chapter_god_of_war t_chapter_god_of_war = new Fantasy.Class_chapter_god_of_war();

  public static Base.Type_chapter f_chapter_god_of_war() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("God of War"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("God of War Equipment"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("God of War Equipment"),
                Core.vx_new_string(":itemmap"),
                Core.f_new(
                  Base.t_itemmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Pandora's Box"),
                    Core.f_new(
                      Base.t_item,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pandora's Box"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The box was actually mistranslated.  It is actually Pandora's Jar."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* After the great war with the Titans, Zeus gathered the great evils of the war and bid Hephaestus construct a box\nto hold them.  Later Kratos seeks out the box to use the evils inside against Ares.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("God of War Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("God of War Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Kratos"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Kratos"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Kratos.png")
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
   * @function chapter_lord_of_the_rings
   * @return {chapter}
   * (func chapter_lord_of_the_rings)
   */
  public static interface Func_chapter_lord_of_the_rings extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_lord_of_the_rings();
  }

  public static class Class_chapter_lord_of_the_rings extends Core.Class_base implements Func_chapter_lord_of_the_rings {

    @Override
    public Func_chapter_lord_of_the_rings vx_new(Object... vals) {
      Class_chapter_lord_of_the_rings output = new Class_chapter_lord_of_the_rings();
      return output;
    }

    @Override
    public Func_chapter_lord_of_the_rings vx_copy(Object... vals) {
      Class_chapter_lord_of_the_rings output = new Class_chapter_lord_of_the_rings();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_lord_of_the_rings", // name
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
    public Func_chapter_lord_of_the_rings vx_empty() {return e_chapter_lord_of_the_rings;}
    @Override
    public Func_chapter_lord_of_the_rings vx_type() {return t_chapter_lord_of_the_rings;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_lord_of_the_rings();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_lord_of_the_rings() {
      return Fantasy.f_chapter_lord_of_the_rings();
    }

  }

  public static final Func_chapter_lord_of_the_rings e_chapter_lord_of_the_rings = new Fantasy.Class_chapter_lord_of_the_rings();
  public static final Func_chapter_lord_of_the_rings t_chapter_lord_of_the_rings = new Fantasy.Class_chapter_lord_of_the_rings();

  public static Base.Type_chapter f_chapter_lord_of_the_rings() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Lord of the Rings"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Lord of the Rings Units"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lord of the Rings Units"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Galadriel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Galadriel"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* If you ask it of me, I will give you the One Ring. You offer it to me\nfreely? I do not deny that my heart has greatly desired this. In the\nplace of a Dark Lord you would have a Queen! Not dark but beautiful and\nterrible as the Dawn! Treacherous as the Seas! Stronger than the\nfoundations of the Earth! All shall love me and despair! ... I passed\nthe test. I shall diminish, and go to the west, and remain Galadriel.\n- Frodo and Galadriel - Lord of the Rings")
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
   * @function chapter_material_realm
   * @return {chapter}
   * (func chapter_material_realm)
   */
  public static interface Func_chapter_material_realm extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_material_realm();
  }

  public static class Class_chapter_material_realm extends Core.Class_base implements Func_chapter_material_realm {

    @Override
    public Func_chapter_material_realm vx_new(Object... vals) {
      Class_chapter_material_realm output = new Class_chapter_material_realm();
      return output;
    }

    @Override
    public Func_chapter_material_realm vx_copy(Object... vals) {
      Class_chapter_material_realm output = new Class_chapter_material_realm();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_material_realm", // name
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
    public Func_chapter_material_realm vx_empty() {return e_chapter_material_realm;}
    @Override
    public Func_chapter_material_realm vx_type() {return t_chapter_material_realm;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_material_realm();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_material_realm() {
      return Fantasy.f_chapter_material_realm();
    }

  }

  public static final Func_chapter_material_realm e_chapter_material_realm = new Fantasy.Class_chapter_material_realm();
  public static final Func_chapter_material_realm t_chapter_material_realm = new Fantasy.Class_chapter_material_realm();

  public static Base.Type_chapter f_chapter_material_realm() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Material Realm"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Those places we can measure and understand.\n* The universe of Nexus Fantasy is different from the real world. The world is called Ur and the stars are all different planes of existence separated by the void of space and the Ether.\n* The Material Realm is described by coordinates for +x, +y, +z, +t (length, height, width, time)\n* Aeur - The sky (Aeurfolk)\n* Fyur - Flame (Fyurfolk)\n* Mur - The oceans (Murfolk, Murmen)\n* Ur - The land (Urfolk, Urmen)\n* The Primes"),
        Core.vx_new_string(":titles"),
        Core.vx_new_string("Areth, Archea, Gaia, Koltho, Material Realm, Middle Earth, Middle Kingdom, Middle Realm, Midgard, Mortal Realm, Mother Earth"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Africana"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Africana"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Aegyptus"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aegyptus"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Ancient Egypt"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Units - Charioteer, Necromancer, Pharoh, Sun Priest, Sorceror/Hieolphant\n* The Empire of the Sun - Aegyptus worship the sun and the nile river that brings life.\n* Sun Disc - Round shield with the image of the sun is a standard decoration.\n* Sun Spear - Spear with the image of the sun near its point."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aegypta, Helios, Kemet"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Alexandria"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alexandria"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Lighthouse of Alexandria - One of the Seven Wonders of the World\n* Library of Alexandra - The foremost center of learning in the world.")
                              )
                            ),
                            Core.vx_new_string("Great Pyramids"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Great Pyramids"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The Pyramid of Cheops was originally no less than four hundred and ninety feet high.  Its base covers 31 acres...contains 2,300,000 blocks of stone, each averaging two and a half tons...set with joints measuring one ten-thousandth of an inch wide. - Ancient Egypt, Its Culture and History"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* One of the Seven Wonder of the World")
                              )
                            ),
                            Core.vx_new_string(":Necropolis"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Necropolis"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Despite time, the elements, and cataclysmic upheavals, the ruins of the Citystate of Quaran still stands as grim reminders of that dark and nearly forgotten age. Here amidst stark stone towers and nightmarish effigies, once flourished the capital of the most sinister empire in human history.\n* Over the years, occultists, black magicians, and tomb robbers have come to the ruins in search dark and macabre secrets. Many cursed tomes, diabolical artifacts, and instruments of torture and death have been recovered, often to the great regret of those who discovered them. Countless more lie in tombs, vaults, and underground pits and tunnels, awaiting discovery by those who covet infernal knowledge above all other considerations.")
                              )
                            ),
                            Core.vx_new_string("Pyramid of Skulls"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pyramid of Skulls"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Quaran Necromancer-Kings erected a mountain of skulls 1000 feet high, representing untold millions of their victims. The mountain stands to this day and appears to be magically resistent to destruction.")
                              )
                            ),
                            Core.vx_new_string(":Thebes"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Thebes")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Kemet Tomb Robber"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kemet Tomb Robber"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The tomb robbers are nomadic folk who have found a profitable lifestyle by digging in dangerous tombs for untold riches. They can act as guides for expeditions into the desert.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Batrea"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Batrea"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Home of the Batrean people. The Batrean males and females visually appear to be entirely different races. The males are brutish and ugly while the females are graceful and incredibly beautiful. It is the peculiar custom of Batrean males to sell their females as concubines. The females do not seem to mind leaving their brutish husbands and thatch and mud hovels.\n* History - The Batreans are a primitive people when they were visited by a Warlock fleeing persecution. The natives marvelled at his magic, so he set up a little fiefdom for himself in the jungle. He took slaves and enchanted a few to be beautiful servants. Later, one of his lovely maidens killed him in his sleep. Unwittingly, however, he had set a selective breeding program in motion. The beautiful servants returned to their village where the males enslaved them and exiled the ordinary women. Within a generation, only the beautiful women reproduced and their daughters were as lovely as themselves while the sons remained simple and primitive. Generations later, the Batreans are a complicated people, completely split by gender."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Batrean Concubine"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Batrean Concubine"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Batreans women are engaging creatures, slender and lovely beyond compare. Their movements are graceful, and their manner of speech is charming and at times most eloquent. They are reknowned in other lands as the perfect concubines. Some say, however, that the Batrean women exhibit an uncanny ability to sublty influence their masters.")
                              )
                            ),
                            Core.vx_new_string("Batrean Grunt"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Batrean Grunt"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Batrean men are huge, slope shouldered, and remarkably ugly. They are slow and brutish and are constantly arguing and fighting among themselves. They generally ignore the beautiful females except during their week-long mating season.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Burning Waste"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Burning Waste"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Sahara Desert"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Burning Waste is a massive desert (the largest in the world) that stretches across the northern Africana continent. Where the desert meet the Mediterrainean, the water creates a long strip of jungles or swamps. These are also the only inhabited areas near the Burning Waste.\n* Red Iron - The sand of the Burning Wastes has a high iron content in the form of rust dust. With difficulty, the sand can be smelted back into iron. Typically, the red tinge is left in to show its origination.\n* Politics - Many nations claim large sections of the desert, but no one really maintains any ownership over such a harsh realm.")
                      )
                    ),
                    Core.vx_new_string(":Djaffa"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Djaffa"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Djaffir are a slender, wiry desert people famous for being masterful merchants who always drive a hard bargain. They wear flowing head-dresses, robes, cloaks, and leather masks. They do not remove their masks believing that the face is the mirror to the soul and believe the masks protect them from hostile magic. The more skeptical claim that they were masks to conceal their identities from those they intend to relive of their money."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Djaffir Bandit"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Djaffir Bandit"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* There are small tribes of Djaffir bandits living in the desert preying on caravans. Though they will kill if provoked, they are not prone to wanton violence. Neither are they known to raid the caravans of the Djaffir Merchants, a fact which many attribute to collusion between the Sheiks of the two tribal groups. Some say the differnce between a merchant and a bandit is a matter of semantics.")
                              )
                            ),
                            Core.vx_new_string("Djaffir Merchant"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Djaffir Merchant"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* They are shrewd hagglers, but fortunately they are very proud of their reputations so they typically only trade in high quality goods.\n* The merchants live in walled towns surrounding oases.")
                              )
                            ),
                            Core.vx_new_string("Djaffir Wizard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Djaffir Wizard"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Wizards are well regarded by their people as seers and mystics. Like the rest of their people they are superstitious and see omens everywhere.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Dracarta"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dracarta"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Trade - The Dracatans smelt Red Iron in large quantities, and export it throughout the area. Their prices remain low enough that it is not cost effective to compete with their efficient facilities."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dracartan Cisterns"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dracartan Cisterns"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The water supply of Dracarta is perhaps its most precious commodity. The supply is kept in a series of enormous underground cisterns. Tampering with the water supply in any way is a captial offense and there are numerous signs reinforcing that fact.")
                              )
                            ),
                            Core.vx_new_string("Dracata Halls of Infamy"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dracata Halls of Infamy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Here are arrayed the worst and most despicable criminals in Dracartan history. Their statue-like forms standing as warning to future offenders, preserved by immersion in Red Iron.")
                              )
                            ),
                            Core.vx_new_string("Dracata Halls of Justice"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dracata Halls of Justice"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Council of Elders, Dracarta's esteemed legisilative/judicial body holds sway in these large halls. The laws of the land are determined here. Serious crimes are also heard here in open court. Punishments include forced labor, banishment to the wilderness, or for truly heinous offenses: the sentence of Retribution (immersion in red iron).")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dracartan Alchemist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dracartan Alchemist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dracartan Alchemists are employed to create storm crystals and adamantine for the duneships.")
                              )
                            ),
                            Core.vx_new_string("Dracartan Desert Scout"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dracartan Desert Scout"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Dracartan military is largely composed of these scouts. In order to survive in the desert they do not user heavy gear or weapons. When facing difficult foes they will use the desert as their primary weapon.")
                              )
                            ),
                            Core.vx_new_string("Dracartam Duneship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dracartam Duneship"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The legendary duneships of the Dracartan army. They race across the desert sand on adamantine runners. They are powered by storm crystals produced and ignited by the Alchemists into the huge wind funnels that propel the duneships across the sand.\n* The duneships serve as troop carriers and mobile siege engines. Light Ballistas and light greek fire catapults are typically carried.\n* Despite the name, duneships cannot climb hills and may only travel on level sand. They also lack manueverability and may not travel into headwinds by tacking.\n* The forward section of the hull can be lowered to allow mounts to enter and exit.\n* The duneships are expensive to use and maintain, so they are only deployed in special occassions, especially when a show of force is required.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Carthage"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Carthage"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* City/State\n* Worship the Devil King [Baal Moloch].")
                      )
                    ),
                    Core.vx_new_string("Chana Jungles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Chana Jungles"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Home of the Chana Wildmen, the jungles are also home numerous dangerous and noisome insects, snakes, leeches, and even plants.\n* Wildmen - Many large tribes of Wildmen live throughout the jungle living off of the rich vegetation and animal-life. The Wildmen are deeply addicted to [Skullcap] mushrooms and have been driven violently insane from its hallucinatory effects. They are also warlike in the extreme with tribes constantly ambushing one another to gain territory. In battle, they thrive on brutality, and mercy is considered a weakness. Prisoners are publicly skinned alive to the delight of the tribe."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Chana Warlord"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chana Warlord"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The leaders of the wildmen tribes are horrible and immensely obese creatures that have gained power through demonic pacts and are said to be part demon themselves.")
                              )
                            ),
                            Core.vx_new_string("Chana Wildman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chana Wildman"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Wildmen are savage cannibals who cover themselves with terrifying body paints. They only respect bravery and any who show fear are ritually slain to their fearsome gods. They are very superstition and in awe of magic, so they obey the Witchmen without question. They live a nocturnal lifestyle and are skilled at axes, spears, and bolas.")
                              )
                            ),
                            Core.vx_new_string("Chana Witchman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Chana Witchman"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Witchmen revere the forces of darkness and despise the enemies of their gods the forces of light. They live a completely nocturnal lifestyle and are skilled at witchcraft and herbalism.\n* They sing songs of fear and death that are said to strike madness in those that hear them.\n* They create shrunken heads from their victims and wear them as jujus. It is said that they can capture a person's soul and control their body like a mindless zombie.\n* Some have trained Death's Head Vipers as pets and wear them as bracelets."),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Sympathy"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Sympathy")
                                      )
                                    ),
                                    Core.vx_new_string(":Enchantment"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Enchantment")
                                      )
                                    ),
                                    Core.vx_new_string(":Naturalism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Naturalism")
                                      )
                                    ),
                                    Core.vx_new_string(":Madness"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Madness")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Animal Handling"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Animal Handling"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Snake Charming"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Snake Charming")
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
                            Core.vx_new_string("Death's Head Viper"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Death's Head Viper"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A foot long poisonous viper that can be trained as a pet. Some can be trained to coil around an arm or neck and act as jewelry and as a deadly bodyguard. The Viper cannot be completely domesticated, however, and has been known to turn on their owners when startled."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Wrist Viper")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Jhagara"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jhagara"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Jhagara is a hot and humid land seldom travelled by visitors.\n* People - The Jhagarans are a primitive, superstitious race with ungainly, elongated limbs and elliptical heads. They are over six feet tall and very thin and wiry.\n* Outcasts - Strangest of the Jhagarans are the Outcasts, tribesmen who wander the furthests swamps and jungles. Though few in number, they wield great power. It is believed by the other Jhagarans that the Outcats carry the 'Sitgma of Doom'. Simply being touched by an Outcast immedidately brands one as an Outcast. He or she has two choices, commit suicide or leave the tribe and join the Outcasts. In order to avoid being tainted, the Jhagarans leave tributes to the Outcasts outside their settlements. If the tributes are insufficient, the Outcasts will approach the settlement until they are placated. There is no simple solution to the Cursed Ones. Killing an Outcast brings the curse upon the killer and his family. Sometimes they will try to convince or trick strangers into killing the Outcasts for them.\n* Concordance - Every seven months, for two weeks while a particular constellation moves across the horizon, the Jhagarans will not venture forth into the swamps at night. They believe an indescribable monster called the Horag stalks the marshes. Though no Jhagaran has ever seen the Horag, their belief in it is unshakable. During theses times, tribesmen accidentally caught in the marshes after sunset have reportedly slit their throats rather than face the terror of this fearsome monster."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Jhagaran Hunter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jhagaran Hunter")
                              )
                            ),
                            Core.vx_new_string("Jhagaran Outcast"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jhagaran Outcast")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Serpentine River"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Serpentine River"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The [Serpentine River] is actually more of a slow moving swamp that flows from the south and pours into the ocean. At the mouth of the river, a large set of thick posts have been sunk into the silt, simultaneously providing tradeships with a place to tie up while blocking entrance into the river.  Porters must then be paid to bring goods to [Fiaqua] by barge. This is mostly just another opportunity for corruption. The [Naga] in the area do not allow boat traffic farther upstream from [Fiaqua].")
                      )
                    ),
                    Core.vx_new_string("Shadow Isles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shadow Isles"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* These islands are inhabited by the Malum, a cabal of Arch-Spectres."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Obsidian Tower"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Obsidian Tower"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Shadow Wizards live in ancient ruined towers of obscure origin. These dark towers dot the landscape of the Shadow Isles, and it is here that they perform their experiments night and day seemingly without rest. Some have entered the tower without molestation but have fled when they viewed the horrorific activities within.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Shadow Wizard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shadow Wizard"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Comprised of animate darkness, these spirits of deceased magicians resemble man-like shadows. They cloak themselves inn hooded vestments and bear ebony runestaves studded with black diamonds, and their eyes burn with a fiery incandescense.\n* They Shadow Wizards consort with beings from the lower planes and perform bizarre magical experiments. The reason for their actions remains unknown, but some fear they are creating an army of monstrosities to unleash upon an unsuspecting world.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Sinking Land"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sinking Land"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Sinking Lands is a vast, fetid swamp of waist-deep water covering a deep layer of loose mud and decomposing vegetation. The entire swamp is basically a quicksand pit that will slowly engulf anything that stands still on the bottom. Numerous creatures that swim, float, or flit across the water have made a home here despite the perils."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Sludge"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sludge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Sludge are a man-sized race of semi-intelligent Slugs that live within the Sinking Land. They swim quickly through the shallow water pushing off of the bottom. The Sludge are very curious and gather around visitors in large numbers. Though intimidating and pushy, they are largely harmless and flee if harmed. The main danger is they have been known to accidentally capsize boats in their enthusiasm. They are knowledgable about the area, but their lack of language makes communication a challenge.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Tunis"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tunis"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Weather - Tunis is hot and humid all year round. The temperature varies from warm to sweltering. The hot weather encourages the laid back attitude of the locals."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Fiaqua"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fiaqua"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Las Vegas"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Level 6 [Settlement]\n* Fiaqua means 'The Flower on the Water'. It is named that way because of the beautiful flowers that naturally grow all over the surface of the city as well as for the Black Lotus trade that was the reason for the city's founding. Fiaqua is unofficially known as the 'City of Knives' because of the strong criminal element and rampant assassinations. It is not so much a city as a series of shacks built on planks and pontoons that extend from a sandbar in the [Serpentine River] into the surrounding swamps.\n* Geography - Fiaqua is a tiny city located a half mile inland on the [Serpentine River] in the country of [Tunis].\n* Politics - Fiaqua is currently ruled by Queen Amelia Tremont, a minor crimelord who fancies herself a queen. She assassinated her predecessor and has proven quite adept at maintaining a delicate balance between her criminal compatriots, the [Naga], and the neighboring nations that have made the Lotus trade illegal but tolerate it as long as it doesn't create a disruption.\n* History - Fiaqua was founded two hundred years ago when the [Black Lotus] flower was discovered there. Initially, only a small band of criminals harvested the Lotus, but their actions attracted the local [Naga] who owned the land. Conflicts continued for many years until a truce was established where the [Naga] cultivated the flower and the humans sold it. This arrangement has worked for over 150 years despite some rather dramatic conflicts.\n* Law - Few things are illegal in Fiaqua. Fewer still are enforced. Since Fiaqua is a criminal haven created for the express purpose of smuggling, criminal types are widely accepted. The local [Naga] serve as enforcers to keep the peace while also controlling the population of homeless and hopelessly drug addicted. It is widely known that one must not venture out alone at night. Besides the Black Lotus trade, Fiaqua also runs very successful gambling dens and brothels catering both to the wealthy elite and to the desperate.\n* Visitors - The drug trade attracts addicts and experimenters because of the Lotus' legal status in Fiaqua as well as the large sums that can be gained through smuggling. The wealthy are often attracted to the 'anything for a buck' nature of the city as well as the surprising safety (as long as you have personal bodyguards). Traders come to the city because its position in the swamp requires it to import most of its essentials including the very lumber that makes up the city. Prices are fairly cheap, but unfortunately service is terribly slow because of the rampant drug addiction.\n* Wildlife - The city is covered with blossoming flowers all the time. These bloom from creeping vines that help hold the decaying wooden structures together. Insects swarm around the city at all times, but the pest insects are kept under control by the ever present [Ekondo] lizards. These small lizards are trained to distinguish pests from pollinating insects and catch them from the sky with their absurdly long tongues.\n* Units - Drug Addict, Drug Merchant, Gambler, Loan Shark, Pimp, Prostitute, Smuggler, [Naga]"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Flower on the Water, City of Knives")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Queen Amelia Tremont"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Queen Amelia Tremont")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Shinsenkyo"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shinsenkyo"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Hell's Paradise\n* In Chinese legend, Shinsenkyo is an island on which gods reside, a place of true beauty and nature."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An island of great natural beauty, but it is filled with bizarre, unnatural beings. It is rumored to be the source of the Elixir of Life which is the source of its strange ecology.")
                      )
                    ),
                    Core.vx_new_string(":Wraeclast"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wraeclast"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Alba, Madagascar, Australia, Count of Monte Cristo, Mayan civilization, Path of Exile"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wraeclast is a large subtropical island in the southern hemisphere. It is infamous as a thoughly cursed place where criminals and political prisoners are exiled, never to return.\n* Cursed - An evil force prevades the land. Here the dead always rise again as zombies or worse. Sleep is filled with dark thoughts of madness and violence. The evil influence has twisted plants and animals into bizarre and hateful things.\n* Settlements - There are a handful of small towns composed of exiles and shipwreck survivors carving out a meager living from the hostile land. Agriculture is difficult, but ironically hunting is good for those who can avoid becoming the hunted themselves.\n* Ruins - Though there are no native people on Wraeclast, there is ample evidence of early advanced cultures, apparently predating the evil influences that currently makes civilization so challenging. Many speculate that this previous civilization was destroyed when they unleashed the curse that still devastates the land.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Atlantia"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Atlantia"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Antilla"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antilla"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Atlantis"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Antillan Triton"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Antillan Triton")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Brittania"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Brittania"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("England"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Avalon"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avalon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Rogue\n* Serf\n* Squire")
                              )
                            ),
                            Core.vx_new_string(":Saxony"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Saxony")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Avalan Footman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avalan Footman")
                              )
                            ),
                            Core.vx_new_string("Avalon Highwayman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avalon Highwayman"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Robin Hood")
                              )
                            ),
                            Core.vx_new_string("Avalan Knight"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avalan Knight")
                              )
                            ),
                            Core.vx_new_string("Avalon Longbowman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avalon Longbowman")
                              )
                            ),
                            Core.vx_new_string("Avalan Shieldbearer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Avalan Shieldbearer")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Eire"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eire"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Ireland"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Emerald Island")
                      )
                    ),
                    Core.vx_new_string(":Melnibone"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Melnibone"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dragon Isles"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Mournblade"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mournblade")
                              )
                            ),
                            Core.vx_new_string(":Stormbringer"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stormbringer"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Farewell, friend. I was a thousand times more evil than thou! - Stormbringer, Stormbringer")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Elric"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elric"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* You sought to imitate the Emperors of Melnibone... You mocked Elric of that line, you tortured him and you abducted his wife. You moulded her body into a hell-shape as you moulded the rest of the world... know how the folk of Melnibone toyed with such upstarts... Jagreen Lern took an hour to die and only because Moonglum begged Elric to finish him swiftly. - Elric, Stormbringer")
                              )
                            ),
                            Core.vx_new_string(":Moonglum"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Moonglum")
                              )
                            ),
                            Core.vx_new_string("Hunting Dogs of Dharzi"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hunting Dogs of Dharzi")
                              )
                            ),
                            Core.vx_new_string("Melnibonean Sorceror"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melnibonean Sorceror")
                              )
                            ),
                            Core.vx_new_string("Melnibonean Soldier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melnibonean Soldier")
                              )
                            ),
                            Core.vx_new_string(":Yykroon"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yykroon")
                              )
                            ),
                            Core.vx_new_string(":Arioch"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arioch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Arioch is one of the most powerful of the Dukes of Hell.\n* Arioch is the patron of Melniboné and has a personal relationship with Elric. He is sophisticated and highly intelligent, though possibly insane, and he usually (but certainly not always) appears as a beautiful youth, usually with blond hair.\n* He has also been known to take the form of a large black fly or a black alien shape, horrible to look upon."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Knight of the Swords, Lord of the Higher Hell, Lord of the Seven Darks")
                              )
                            ),
                            Core.vx_new_string(":Donblas"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Donblas"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* It was as if some enormous sun, thousands of times larger than earth's, had sent a ray of light pulsing through the cosmos, defying the flimsy barriers of Time and Space... the majestic Lords of Law, their earthly forms so beautiful that they challenged Elric's sanity... Leading them came Donblas, the Justic Maker, a smile upon his perfect lips. He carried a slender sword in his right hand, a sword that was straight and sharp and like a beam of light itself. - Stormbringer"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Justice Bringer")
                              )
                            ),
                            Core.vx_new_string(":Elenoin"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elenoin")
                              )
                            ),
                            Core.vx_new_string(":Kyrenee"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kyrenee")
                              )
                            ),
                            Core.vx_new_string(":Mabelrode"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mabelrode"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mabelrode is a Chaos Lord. He appears with his face perpetually in shadow, or simply with blank, featureless skin in place of a face."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Mabelode the Faceless, King of the Swords")
                              )
                            ),
                            Core.vx_new_string(":Xiombarg"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Xiombarg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Xiombarg is a Chaos Lord. She prefers to appear as a beautiful young woman but is sometimes referred to with the male pronoun. She is prone to shapeshifting and carries a giant sword. She sometimes rides a creature with the head of a lion and the body of a bull.\n* Though she prefers the form of a beautiful woman, it is possible her true form is more insect-like."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Queen of the Swords")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Sargasso Sea"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sargasso Sea"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Sargasso Sea is a section of calm water in the center of converging currents. The surrounding current draw seaweed and various debris to accumulate across a vast area. The still air and vast seaweed aspiration accumulates a cloying mist that limits visibility.\n* Many have found their ships stranded here by the calmed winds and cloying seaweed. Those who stay and survive have found that the Sargasso can support an unusual lifestyle floating in the ocean. Though survival can be a struggle, the Sargasso people have a strong sense of interdependence and enjoy their freedom from outside domination.\n* It is said that a giant squid calls the Sargasso home."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Sargassos Sea Nomad"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sargassos Sea Nomad"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Expert fisherman and salvagers. The sea nomads can be known to be ruthless, since life in the Sargasso can be difficult.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Y'ha-nthlei"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Y'ha-nthlei"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("We shall swim out to that brooding reef in the sea and dive down through black abysses to Cyclopean and many-columned Y'ha-nthlei, and in that lair of the Deep Ones we shall dwell amidst wonder and glory forever. - The Shadow Over Innsmouth"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Deep Ones, Human Hybrids, Human Slaves"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("City of the Deep Ones")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Asiana"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Asiana"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Jade Empire"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jade Empire"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Quan Dynasty, Jade Kingdom"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Tian"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tian"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The capital of the Jade Empire is situated on an island within a man-made lake. The metropolis can only be reached by boat. The city was constructed for the Emperor who demanded that the new capital surpass in beauty all of the cities of the world. Gilded towers and domes and the Palace of a thousand fountains are especially noteworthy."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Golden City")
                              )
                            ),
                            Core.vx_new_string("Emperor's Canal"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Emperor's Canal"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A man-made waterway connects the River Shan with the lake that surrounds Tian. A system of locks allows traffic on the canal to be strictly monitored, and the canal is not large enough for warships.")
                              )
                            ),
                            Core.vx_new_string("Emperor's Forest"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Emperor's Forest"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* East of the capital is an artificial forest created for the pleasure of the Emperor and the aristocracy, so they might hunt 'wild' game. The forest is continually restocked with dangerous creatures that have been rendered harmless by declawing and with sedatives.")
                              )
                            ),
                            Core.vx_new_string("Emperor's Road"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Emperor's Road"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* This highway spans the length and breadth of the Jade Empire. It is extremely well maintained funded by tolls.")
                              )
                            ),
                            Core.vx_new_string("Shoalin Monastery"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shoalin Monastery"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Are you worthy? It is a simple question.\n* You are a foreigner. Here you will be treated with hatred and disrespect because you are different. We provide aid to no one. If you find this unfair, you are always free to go. Few are strong enough to walk this path. It is up to you whether you are one of them.")
                              )
                            ),
                            Core.vx_new_string("Wudang Monastery"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wudang Monastery")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Jade Militia"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jade Militia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The vast number of people in the Jade Empire are kept in check by a massive regional militia. Most militia are little more than thugs with cheap equipment and a badge.")
                              )
                            ),
                            Core.vx_new_string("Jade Guard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Jade Guard"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The professional military that oversees the militia.")
                              )
                            ),
                            Core.vx_new_string("Quan Noble"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Quan Noble"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Once a barbarian people, the Quan people have grown rich at the expense of the people subjected long ago by their ancestors. They wield supreme power and are attended by hosts of fawning servitors and slaves. Among these perverse and degenerate folk, obesity is considered a sign of success and ostentatious displays of wealth are in vogue.\n* The nobles have highly refined tastes and lofty airs. They wave themselves with scented fans when in the presence of outsiders who they consider offensive in apperance and odor.")
                              )
                            ),
                            Core.vx_new_string("Shaolin Monk"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Shaolin Monk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Buddhist Monk")
                              )
                            ),
                            Core.vx_new_string("Wudang Monk"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wudang Monk"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A Taoist Monk")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Nepal"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nepal"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Himalaya Mountains"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Himalaya Mountains")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Nepal Sherpa"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nepal Sherpa")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Nippon"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nippon"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Land of the Rising Sun"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Valley of the Mists"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Valley of the Mists")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Nippon Budoka"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nippon Budoka"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Warrior Monk")
                              )
                            ),
                            Core.vx_new_string("Nippon Gakusho"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nippon Gakusho"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Priest")
                              )
                            ),
                            Core.vx_new_string("Nippon Ninja"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nippon Ninja")
                              )
                            ),
                            Core.vx_new_string("Nippon Samurai"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nippon Samurai")
                              )
                            ),
                            Core.vx_new_string("Nippon Sohei"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nippon Sohei")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Tibet"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tibet"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Tibetan Monk"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tibetan Monk")
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
            Core.vx_new_string(":Caucasia"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Caucasia"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Anatolia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anatolia"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The Romani were erroneously believed to originate in Egypt (therefore Gypsy)."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Horseclans - Anatolian horsemen are widely believed to be the greatest light horsemen in the world.  The Horseclans live on the plains where their horsemen have maximum effect.  They live a semi-nomadic existance moving on when resources become scarce.\n* Romani - The Romani are a gregarious, nomadic people often travelling in wagons carrying all that they own. They are reknowned as artists, acrobats, fortune tellers, thieves, tricksters, or swindlers depending on your point of view. The Romani religion revolves around two demigods: Fortuna, the lovely but fickle goddess of luck, and the grim entity known as Death. They revere Fortuna but mock Death, whom they strive to cheat at every opportunity.\n* Carnevale of True Wonders - A large group of Romani and other assorted wanderer/adventurers have banded together to form a semi-organized travelling circus. They show up near a town and rent some unused plaza or farmland and set up their tents and stalls. Their shows are constantly varying including: acrobats, strong men, duelists, wrestlers, theater troupes, musicians, magicians, story tellers, fortune tellers, wonderous creatures, items, foods and drinks. Anyone can join the welcoming troupe. There are a few rules, however: all wonders must be real (per the name) and no theft, fraud, or swindles are allowed on Carnevale grounds."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Ephesus"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ephesus"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Temple of Artemis - One of the Seven Wonders of the World.\n* The sacred site at Ephesus was far older than the Temple.  An archaic, pre-Hellenic fertility goddess was\nalready passionately venerated, and the Greeks associated her with Artemis.")
                              )
                            ),
                            Core.vx_new_string(":Galatia"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Galatia")
                              )
                            ),
                            Core.vx_new_string(":Halicarnassus"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Halicarnassus"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Mausolus built the Mausoleum, and the term mausoleum has come to be used generically for any grand tomb."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Mausoleum of Halicarnassus - One of the Seven Wonders of the World.")
                              )
                            ),
                            Core.vx_new_string(":Phrygia"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phrygia")
                              )
                            ),
                            Core.vx_new_string(":Witchwood"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Witchwood"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The forest home of the Dhuna.\n* Dhuana - The Dhuana are a primitive, reclusive people highly skilled at witchcraft. They live in huts deep in the forest and perform hedonistic rituals in the numerous ruins, groves, and standing stones in the area. They are mysterious but not unfriendly, and they reputed to have numerous extraordinary attributes including the ability capture a man's heart with a single kiss.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Anatolian Light Cavalry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anatolian Light Cavalry")
                              )
                            ),
                            Core.vx_new_string("Anatolian Mounted Archer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Anatolian Mounted Archer")
                              )
                            ),
                            Core.vx_new_string("Romani Acrobat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romani Acrobat"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Juggler")
                              )
                            ),
                            Core.vx_new_string("Romani Animal Trainer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romani Animal Trainer")
                              )
                            ),
                            Core.vx_new_string("Romani Charlatan"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romani Charlatan"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Magician, Mountebank, Swindler, Trickster")
                              )
                            ),
                            Core.vx_new_string("Romani Dancer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romani Dancer")
                              )
                            ),
                            Core.vx_new_string("Romani Fortuneteller"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romani Fortuneteller")
                              )
                            ),
                            Core.vx_new_string("Romani Rogue"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romani Rogue"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Thief")
                              )
                            ),
                            Core.vx_new_string("Romani Thespian"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Romani Thespian"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Puppeteer")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Balkan"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Balkan"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dragon's Eye"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dragon's Eye"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A small sea surrounded by mountainous, inhospitable terrain. There are many small islands in the Dragon's Eye, and it is rumored that the great dragon Tiamat lives on one of them."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Black Sea, Transylvania")
                              )
                            ),
                            Core.vx_new_string(":Carpathia"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carpathia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The region suffered under a widespread magical disaster of unknown origin. Suddenly the dead began to rise in great numbers and overran the land. Small communities are allowed to live and are 'protected' by the Vampires that feed upon them.\n* Since the disaster, an unnatural fog surrounds the area. The fog seems to spawn undead and other monstrosities."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Deadlands")
                              )
                            ),
                            Core.vx_new_string("Carpathian Mountains"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carpathian Mountains")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Carpathian Witchhunter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Carpathian Witchhunter"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Some of the survivors of the Carpathian disaster formed a group to discover the cause of the disaster and to repair it. They seek magical knowledge of all sorts and fund themselves by using their talents as bounty hunters for the more dangerous bounties."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Witcher")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Byzantium"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Byzantium"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Byzantine Empire"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Byzantium represents a sizable empire. They are an advanced people with an extensive legal system and extremely complex rules, religion, and politics."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Eastern Empire"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Constantinople"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Constantinople")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Byzantine Assassin"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Assassin")
                              )
                            ),
                            Core.vx_new_string("Byzantine Emperor"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Emperor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The emperor rules with divine right and is considered a god on earth.")
                              )
                            ),
                            Core.vx_new_string("Byzantine Guard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Guard")
                              )
                            ),
                            Core.vx_new_string("Byzantine Monk"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Monk")
                              )
                            ),
                            Core.vx_new_string("Byzantine Noble"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Noble")
                              )
                            ),
                            Core.vx_new_string("Byzantine Official"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Official")
                              )
                            ),
                            Core.vx_new_string("Byzantine Priest"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Priest")
                              )
                            ),
                            Core.vx_new_string("Byzantine Spy"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Byzantine Spy")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Caspian Sea"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Caspian Sea"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Caspian Corsair"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Caspian Corsair"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* These corsairs are viscious cutthroats prone to violence and murder. There are a number of different pirate bands, all rivals to one another. In lean times they prey on one another and compete over plunder. When relaxing, they favor Ska-wae, a dangerous game played with curved knives and dice.")
                              )
                            ),
                            Core.vx_new_string("Caspian Mercenary"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Caspian Mercenary"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Caspians are notable for their lack of discretion concerning the type of work they will take on. Unfortunately, they are also notable for disappearing when they see the risks getting too high.")
                              )
                            ),
                            Core.vx_new_string("Caspian Rogue"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Caspian Rogue")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Hesperia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hesperia"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Turkey"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hippolyta - Queen of the Amazons. She was abducted and forced to wed the king of Athens. She was later cast off and returned to the Amazons\n* Warfare - Amazon combat philosophy takes a very long term view of victory. They do not put much value in military victories. Instead they believe in subverting, frustrating, and outlasting their opponents. They will avoid head-on battles, preferring flanking and strike and fade attacks. For this reason, they do not have maintain heavy units, but instead maintain superior skirmishers, spies, and assassins.\n* Religion - Amazons revere the image of Gaia, the All-Mother, but they do not worship her as as deity. Instead, the Amazons believe that the female is the natural mother of all things, and that each woman may find all the strength that she needs within herself. The Amazons further believe that with patience and proper nuturing, women will naturally assert their leadership across the world.\n* Politics - Amazons engage with other nations for trade, but their real power lies in their message of female power which they quietly spread around the world. This has created a vast spy network that spreads vital information as gossip."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Home of the Amazons, Sarmatia"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Amazon Archer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amazon Archer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Amazon dedication to archery is legendary. Some have one breast removed to prevent interference with the draw of their bow.")
                              )
                            ),
                            Core.vx_new_string("Amazon Assassin"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amazon Assassin")
                              )
                            ),
                            Core.vx_new_string("Amazon Infiltrator"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amazon Infiltrator")
                              )
                            ),
                            Core.vx_new_string("Amazon Peltast"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amazon Peltast")
                              )
                            ),
                            Core.vx_new_string("Amazon Scout"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amazon Scout")
                              )
                            ),
                            Core.vx_new_string("Amazon Trapper"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amazon Trapper")
                              )
                            ),
                            Core.vx_new_string("Amazon Warrior"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Amazon Warrior")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Scythia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Scythia"),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Arim"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arim"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Arim is a land of rough and irregular hills. The weather is usually overcast and windy. It has substantial mineral wealth, especially iron.\n* People - The people of Arim are a dour and moody lot with swarthy complexions, and long black hair. The men tend to be gaunt and wiry with hatchet-life features. The women tend to be heavy-set and lacking in charm. They are generally a humorless people who have lived hard lives as miners.\n* Reputation - The Arimites have a not unwarranted reputation of being cutthroats and assassins.\n* Revenants - Revenant is the name of anyone who exacts revenge for money. If anyone feels they need redress for any offense, they can post a notice in a public place along with a reward, and if the reward is high enough they can expect it to be carried out. Almost any kind of vengence can be commissioned including arson, theft, mugging, extortion, murder, or even slander. Murder for hire is probably the most lucrative. Government officials, laborers, merchants, jealous lovers, and irrate housewifes have all been known to use the Revenants. It is so common, that the mere shaking of a change purse has become a threat of revenge."),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Arimite Knife Fighter"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Arimite Knife Fighter")
                                      )
                                    ),
                                    Core.vx_new_string("Arimite Revenant"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Arimite Revenant")
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
                    Core.vx_new_string("Shattered Lands"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shattered Lands"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Shattered Lands is bleak and desolate. The landscape is nightmarish: jagged spikes of rock jut upward from the cracked and barren earth. The violent upheavals have exposed many mineral deposits. Unfortunately, the residents of this land have used strip mining techniques which have badly polluted the air and rivers. The air is tinged with a fine ash, the waters are foul tasting, and there are many dangerous chemical waste products including bubbling pools of lye. Creatures living in the rivers and lakes are often deformed or mutated.\n* The Shattered Lands are home to many small, violent clans that violently compete with each other for the scarce resources in this bleak area."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Harak"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Urag"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Urag"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* A group of scholars entered Urag with the contention that the Ur were not evil but were a product of their harsh environment. They encountered a small band of Ur and offered them gold, fragrant oils and gems. These the savages examined and discarded. Without apparent enmity, they slew the scholars, took their cloths and fed the remains to their hunting dogs. They then killed the scholars' mounts, butchered them for meat, and continued on their way."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The nation of the barbarous Ur.\n* Ur - The Ur are a hard-hearted people utterly devoid of mercy or compassion. Ultimate survivalists, they view all other living creatures as prey. Forced by the circumstances of their existence, they are by nature fatalistic and grim. They take what they want, raiding both rival clans and neighboring lands. The Ur are nomadic, traveling from place to place in search of food and water - both precious commodities in this region. All Ur consider themselves to be warriors and trades not related to survival and warfare are considered useless.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Darkling Cutthroat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Darkling Cutthroat"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Ur have subjegated the Darkling race and use them as cannon fodder in battle. The Darklings are vile creatures and are extremely difficult to manage, so the Ur are ruthless when administering discipline.")
                              )
                            ),
                            Core.vx_new_string("Stryx Spearman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stryx Spearman"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The vile Stryx have allied themselves with the Ur and nominally serve them. The Stryx, however, are loyal to no one and cannot be relied on in battle. The Ur find them frustrating but useful allies.")
                              )
                            ),
                            Core.vx_new_string("Ur Horseman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ur Horseman"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Horses are rare in the Shattered Lands, so only the most decorated warriors receive them. However, with nearly no tradition of horsemanship, the Ur usually dismount before combat.")
                              )
                            ),
                            Core.vx_new_string("Ur Shaman"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ur Shaman"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Ur have little education and are inept spell casters. They claim they are great seers though their predictions are always open to interpretation. The Ur military leaders use their 'prophesies' to support their own agendas.")
                              )
                            ),
                            Core.vx_new_string("Ur Warlord"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ur Warlord"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Ur clans are rules by a series of viscious warlords each trying to increase their own power and influence at the expense of others. The ceaseless infighting amond the Ur clans prevents them from being more than a regional threat.")
                              )
                            ),
                            Core.vx_new_string("Ur Warrior"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ur Warrior"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Ur Warrior is the typical shocktrooper of the Ur clans. Most adult Ur, male or female are considered warriors.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Volcanic Hills"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Volcanic Hills"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dragon Rock Mountain"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dragon Rock Mountain"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Dragon Rock is an active volcano that has blighted the Volcanic Hills with its many eruptions over the centuries. It has not erupted in recent memory and seems to be content pouring out smoke and lava creating the River of Fire. Dragon Rock is also so named because a number of Fire Dragons live in the area, apparently drawing strength from the volcano.")
                              )
                            ),
                            Core.vx_new_string(":Firefalls"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Firefalls"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The River of Fire ends at an enormous, seemingly bottomless chasm, The lava pours off the edge in a spectacular display before dropping into untold depths. The view is particularly impressive at night. Some believe the chasm is actually a portal to the underworld and the large number of fire demons in the area supports that claim.")
                              )
                            ),
                            Core.vx_new_string("River of Fire"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("River of Fire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The River of Fire is actually an everflowing torrent of molten lava pouring from Dragon Rock Mountain and finally dropping over Firefalls. Fire Demons and Elementals are said to swim in the river and Fire Dragons have been seen consuming the lava.")
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
            Core.vx_new_string(":Northlands"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Northlands"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Frozen North"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Plateau of Leng"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Plateau of Leng")
                      )
                    ),
                    Core.vx_new_string("Unknown Kadath"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Unknown Kadath")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Aurorea"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aurorea"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Greenland, Iceland\n* In Greek mythology the Hyperboreans were mythical people who lived 'beyond the North Wind'. The Greeks thought that Boreas, the god of the North Wind lived in Thrace, and therefore Hyperborea indicates a region that lay far to the north of Thrace.\n* This land was supposed to be perfect, with the sun shining twenty-four hours a day, which suggests a possible location within the Arctic Circle."),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Auroea is a land of vast snow fields, glittering ice peaks, and frozen lakes.\n* People - The Auroran people are tall and statuesque and live in crystalline, ice castles. Their artificers work with the unique material Adamant, the fabled permanent ice of lengend. The Aurorans have an amazing resistence to the cold but conversely they are only confortable in freezing temperatures.\n* Religion - The Aurorans revere Boreas the god of the North Wind. They do not create temples but instead build altars in the open wilderness where one can truly feel his presense."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Hyperborea"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Sea of Ice"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sea of Ice"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An expanse of shimmering, perpertually frozen water, the Sea of Ice is traversed by the Aurorans on Ice Schooners and personal Ice Skimmers.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Auroran Alchemist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auroran Alchemist"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Auroran Alchemists work with the Auroran Ice Witches to create permanent magical ice with similar properties to steel.")
                              )
                            ),
                            Core.vx_new_string("Auroran Banker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auroran Banker"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* People say the Northland Bank's true currencies are blood and tears, but mayor, even speaking as a banker, that seems a little unconscionable. - Pantalone, Genshin Impact")
                              )
                            ),
                            Core.vx_new_string("Auroran Ice Queen"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auroran Ice Queen"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Elsa - Frozen")
                              )
                            ),
                            Core.vx_new_string("Auroran Ice Witch"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auroran Ice Witch"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Auroran Ice Witches serve as seers and priests of Boreas the god of winter and the North Wind. 	They are masters of cold magic."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Ice Warlock")
                              )
                            ),
                            Core.vx_new_string("Auroran Tundra Scout"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auroran Tundra Scout"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The army and hunters of the Auroran people. They are typical skirmishers with	phenomenal survival skills.")
                              )
                            ),
                            Core.vx_new_string("Auroran Ice Skimmer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auroran Ice Skimmer")
                              )
                            ),
                            Core.vx_new_string("Auroran Ice Schooner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Auroran Ice Schooner"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Ice Outrigger")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Jotunheim"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jotunheim"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Frost Giants - The Frost Giants wage perpetual war on all creatures especially the Aurorans and Nords.\nTheir lack of tactical ability is made up for by their phenomenal strength, endurance, and determination. Their bodies emminate extreme cold, so as they expand their territory the temperatures drop. Their goal actually seems to be to freeze the world."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Ymir's Teeth"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ymir's Teeth"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A massive ridge of jagged moutains that the Frost Giants believe are the teeth of an inconceivably large god and that the world lies in its open maw awaiting the day when the being awakes.\n* Home of the Frost Giants, this is also the main location where blue diamonds can be found. Mining of blue diamonds began the war between the Aurorans and Ice Giants.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Khazad"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Khazad"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A strange and unknown realm, Khazad is located in the furthest reaches of the world. It is practically inaccessible. A line of precipitous 200 foot cliffs runs the length of its eastern coast and a ridge of mountains extends along its eastern borders. To the north lie fields of ice and snow. As a result of these impediments to travel, much of what is known is based on a very few hardy adventurers who have survived journeys to this isolated area. According to accounts, the interior is also less than inviting. Patches of bleached and barren gall oak stand like skeletons silhouetted against a dreary purple-grey sky. Broken and irregular lines of hills are interspersed with moors, quagmires, and stagnant ponds. The air is heavy with the stench of moldering vegetation and exudes an unsettling, ancient quality.\n* Lost Kingdom - Scattered throughout the region are the ruins of a long forgotten civilization.\n* The eastern cliffs are sheer, 200 foot cliffs that ring the coastline. Giant diabolical visages have been carved into the cliff-sides along portions of the coast. A clan of flying devils makes its home in the mouths and eye-sockets of the immense stone effigies and fly out to attack those who draw too close.\n* Seas - The seas around Khazad are said to be home to many sea monsters including sea demons. The black ships of the Nefaratus are known to frequent these waters as well."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Khazad Burial Grounds"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Khazad Burial Grounds"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Far to the north are vast burial grounds, denoted by row upon row of age-worn stone markers. The remains of a man-like race have been found in massive sarcophagi of strange design. Some of the more important bodies were buried with gold funerary masks of frightening aspect. These masks are believed to be intended to ward demons or evil spirits from the deceased. Rarely these tombs contain brass urns sealed with paraffin. These artifacts were sometimes used to imprison Bottle Imps or safekeep the corpse-dust of departed wizards. Prized by curio collectors and necromancers, these relics bring high prices. Unfortunately, necrophages haunt the region, craving fresh corpses over the dry bones of the long dead.")
                              )
                            ),
                            Core.vx_new_string(":Necron"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Necron"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* There are stories of an entire city and its inhabitants buried beneath the earth. All of its inhabitants supposedly mummified and interred in stone sarcophagi. Very little reliable information is available about this supposed necropolis.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Nefaratus"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nefaratus"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A bleak island nation, home to the Black Savants. Little is known of their isolated homeland culture or motives. What is known is that they seldom leave their obsidian towers and that they wield powerful magic. Here they stare into their obsidian mirrors and converse with unseen beings. Many believe that the Black Savants are diabolists and receive advice and consel from the giant devils known as Shaitan,"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Maledictus"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Maledictus"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The capital city of Nefaratus")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Black Savant"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Black Savant"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Black Savants are tall and gaunt with deathly pale white skin under their full black robes. They remain fully covered at all times, and it is said that they molder away to nothing after death. There are those who say that the Black Savants are not actually living creatures.\n* The Black Savants are greatly feared by other folk. They avoid contact with others and mainly communicate by means of arcane signs and gestures.")
                              )
                            ),
                            Core.vx_new_string("Black Ship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Black Ship"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Savant's midnight black vessels are said to sail the cursed waters at the edge of the world. It is claimed that they are propelled by demons chained to the oars with silver shackles and driven by giant copper skinned devils. These ships have been known to pull into port cities on moonless nights only to leave again before dawn.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Nordland"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nordland"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Finland, Norse, Sweden"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Nords are a large race of humans. Nords have relatively short lifespans, but they do not physically weaken with age until they are near death.\n* Personality - Nords are deeply emotional and prone to raucous laughter, deep brooding, and intense rage. They generally believe in living in the moment and do not typically hold regrets or grudges.\n* The Nord Way - The Nords have a tradition of stark minimalism reflecting there severe environment. They tend to discard any activity or tradition not directly related to survival. This simplicity sometimes surprises others to which the Nords steadily reply that it is the 'Nord Way'.\n* Marriage - The Nords do not formally marry. Instead they prefer to simply live together (The Nord Way) trusting that if they keep their love strong, they will naturally stay together.\n* Ma and Fa - Endearing terms for Mother and Father"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Aesir, Aesyr, Frostland"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Skyrim"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Skyrim")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Nord Axemen"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nord Axemen")
                              )
                            ),
                            Core.vx_new_string("Nord Berserkers"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nord Berserkers")
                              )
                            ),
                            Core.vx_new_string("Nord Light Archers"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nord Light Archers")
                              )
                            ),
                            Core.vx_new_string("Nord Skirmishers"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nord Skirmishers"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Scouts")
                              )
                            ),
                            Core.vx_new_string("Nord Spearmen"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nord Spearmen")
                              )
                            ),
                            Core.vx_new_string("Nord Valkyrie"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nord Valkyrie")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Worlds Edge"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Worlds Edge"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("*")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Mediterranea"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Mediterranea"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Aegea"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aegea"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Aegean Islands, Greece"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Scholar\n* Senator\n* Spartan\n* Gorgons\n* Harpies\n* Status - The Aegean navy dominates the Aegean island chain and enables a thriving merchant trade across Mediterranea.\n* History - The Aegean city states used to be individual monarchies until the Imperium swept in and conquered Hellas, the capital. During the invasion, the Hellenic leadership fled with its navy and united the other city states under the name Aegea. Since then, the Imperium sent it navy to conquer Crete and 	was disasterously routed by the Aegean navy. The Aegeans subsequently attempted to retake Hellas and was easily repelled. Now an uneasy truce exists with the Imperials unable to create the navy it needs for conquest and the Aegeans unable to create the army it needs to drive out the Imperials."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Crete"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Crete")
                              )
                            ),
                            Core.vx_new_string(":Hellas"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hellas"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Description - Currently a territory of the Imperium, Hellas is an orderly and socially advanced nation. They have a partial democracy (answerable to the Imperium) and a complex legal system that is surprisingly fair.\n* Universities - Hellan Universities are famous for acedemia, sciences, and philosophy. They do, however, share their Imperial neighbor's prejudices against Naturalism and the Arcane (except for Alchemy and Artifice which are considered sciences).")
                              )
                            ),
                            Core.vx_new_string(":Knossus"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Knossus")
                              )
                            ),
                            Core.vx_new_string(":Labyrinth"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Labyrinth"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("A natural maze of cracked basalt")
                              )
                            ),
                            Core.vx_new_string("Mount Parnassus"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mount Parnassus"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Oracle of Delphi is on the slopes of Parnassus.")
                              )
                            ),
                            Core.vx_new_string(":Minoa"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Minoa")
                              )
                            ),
                            Core.vx_new_string(":Olympia"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Olympia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Statue of Zeus - One of the Seven Wonders of the World.\n* Olympiad - The Olympic games.")
                              )
                            ),
                            Core.vx_new_string(":Rhodes"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rhodes"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Famous for the Colossus of Rhodes, a 30m tall statue of Helios and one of the Seven Wonders of the World.\n* It is said that the Colossus can move, though there is no evidence to support this.\n* The Colossus was constructed to celebrate the failure of an invasion force of 40,000 to take the city. Massive siege towers were necessary to take the walls. The first was mounted on six ships, but these capsized in a storm before they could be used. A larger, land-based tower was defeated when the defenders flooded the land in front of the walls so that the rolling tower could not move. The next year, a relief force arrived and the siege was abandoned. Much of the iron and bronze was reforged from the various weapons left behind, and the abandoned second siege tower was used for scaffolding.")
                              )
                            ),
                            Core.vx_new_string(":Sparta"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sparta")
                              )
                            ),
                            Core.vx_new_string("Swamp of Despair"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Swamp of Despair")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Hellenic Scholar"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Hellenic Scholar")
                              )
                            ),
                            Core.vx_new_string("Seer of Delphi"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Seer of Delphi"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The seers are recluses who live on Mount Parnassus with the Oracle. Here they tirelessly record their visions in massive leather bound tomes. Those who manage the perilous climb visit the temple seeking knowledge are treated with hospitality and an endless series of questions about the outside world to compare with their visions. Those who seek personal gain may find the Seers to well prepared and to be less than personable hosts.\n* According to legend, the first great Oracle had a vision that after his death, he would travel in the afterlife for a long time, but that one day he would return to share his experience. It is said, the Seers gather knowledge to share the experiences of the living world with the Oracle when he returns. Though it may seem farfetched, many traditions reflect the expectation of the Oracle's return: lights in the windows at night, an extra place set at meals, an unoccupied bedroom spotlessly maintained, etc.")
                              )
                            ),
                            Core.vx_new_string("Spartan Warrior"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Spartan Warrior")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Arden"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arden"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Alfar, Ljossalfar, Elder, Elf, Sidhe, Sidheni, Sylvan, Sylvus"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Alfheim"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Alfheim")
                              )
                            ),
                            Core.vx_new_string(":Ardenwood"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ardenwood"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* We had entered the Ardenwoods on a scouting mission to probe the Sidhe defenses. We had only been in the woods for half an hour before arrows started raining from the trees. Forms flitted among the leaves and brush all around, but we never saw our attackers. We were forced to flee, and they allowed us to leave. The exact nature and numbers of their defenders remains unknown, but their 	effectiveness was clear. - Imperial Expeditionary Log")
                              )
                            ),
                            Core.vx_new_string(":Ashwood"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ashwood")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Arden Archer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Archer")
                              )
                            ),
                            Core.vx_new_string("Arden Bard"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Bard")
                              )
                            ),
                            Core.vx_new_string("Arden Defender"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Defender"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Arden Warrior")
                              )
                            ),
                            Core.vx_new_string("Arden Druid"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Druid")
                              )
                            ),
                            Core.vx_new_string("Arden Healer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Healer")
                              )
                            ),
                            Core.vx_new_string("Arden Hunter"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Hunter")
                              )
                            ),
                            Core.vx_new_string("Arden Lyrist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Lyrist")
                              )
                            ),
                            Core.vx_new_string("Arden Ranger"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Ranger")
                              )
                            ),
                            Core.vx_new_string("Arden Scout"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Scout")
                              )
                            ),
                            Core.vx_new_string("Arden Unicorn Cavalry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arden Unicorn Cavalry")
                              )
                            ),
                            Core.vx_new_string("Cu Sith Hunting Dog"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Cu Sith Hunting Dog"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An enormous fairy hound roughly the size of a cow.\n* Dark green in color with shaggy fur and a long braided or curled tail.\n* Capable of hunting silently\n* Will occasionally let out three terrifying barks that can be heard for long distances, including by ships at sea. This was said to be a warning to farmers to lock up their women, lest the beast abduct them and take them to a fairy mound to supply milk for fairy children."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Fairy Dog (pronounced coo shee), Cu Sidhe")
                              )
                            ),
                            Core.vx_new_string("Goddess Selene"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Goddess Selene"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The Moon is our Goddess, the night her kingdom! - Diana, Legends of Runeterra"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Most Alfar revere the Moon Goddess Selene.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Gaul"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Gaul"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("France, Gallia"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Syndicate - The Gaul Syndicate is a sophisticed crime cartel."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Catacombs"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Catacombs")
                              )
                            ),
                            Core.vx_new_string(":Mistridge"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mistridge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A walled town housing the main lodge of the Order of Hermes magical society. Mistridge is loosely affiliated with the Arcanum to the East, but the members of the Mistridge lodge keep a low profile as opposed to the grandiose towers of the Arcanum.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Elysia"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elysia"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Southern France"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Elysia is a land of gentle hills and sparse woodlands shifting to deep woods along its northern border. It is named after Elysium, the legendary land of the Fae. Elysia was annexed by the Imperium 50 years ago, and no one seems to particularly mind the new owners.\n* People - The people of Elysia are fond of music, dance and all manner of stimulating pastimes. They enhance their features with makeup and dress in flamboyant apparel including velvet blouses and trousers, capes of silken brocade, soft slippers and so forth. The women hide their faces behind decorative fans to give the impression that they are shy and demure. This is hardly the case. The men are even less subtle and are widely regarded as lechers and philanderers in other lands. The Elysians consider romance to be a wonderful game to be played constantly.\n* Beliefs - The people believe that the world is filled with mysteries and that these mysteries are ultimately unsolvable. The point of life is not to pursue the answers but to marvel at the mysteries themselves. In these beliefs, there is no right or wrong, only perspective and sublty.\n* Law - The unusual way they see right and wrong, leads to a fairly\narbitrary justice system. Small crimes are basically ignored, so petty theft especially pickpocketing is rampant. Major crimes, on the other hand, are dealt with quickly and severely. Trials are held in public with justice determined by popular vote by those attending. Punishment is arbitrarily and creatively disposed by the Mayor of each city.\n* The Night of Fools - Once each year, the infamous festival known as the night of fools takes place. During this night almost no crimes are prosecuted. People dress in ludicrous costumes and take to the streets in an evening of revelry, debauchery, and mayhem. On the following day, order is restored.\n* Beggars - Begging is considered an honest, if unenviable, profession in Elysia. Though many are frauds and thieves, the Elysians are fond of their beggars and expect others to be equally open-minded. It is traditional to scatter coppers when beggars appear or suffer public scorn and ridicule.\n* Bath - Public and private bath houses (with or without masseuse) are a popular pasttime and meeting place similar to a tavern elsewhere complete with snacks and drinks."),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Elyisan Artisan"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Elyisan Artisan")
                                      )
                                    ),
                                    Core.vx_new_string("Elyisan Chevalier"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Elyisan Chevalier")
                                      )
                                    ),
                                    Core.vx_new_string("Elyisan Duelist"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Elyisan Duelist")
                                      )
                                    ),
                                    Core.vx_new_string("Elyisan Rogue"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Elyisan Rogue")
                                      )
                                    ),
                                    Core.vx_new_string("Proprietress Mazilda"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Proprietress Mazilda"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Mazilda was a passable sorcerous until she lost an arcane duel and was cursed with an obsession with cleanliness. She opened a bathhouse where she can make a living while she can clean herself as often as necessary. She is functionally a shut-in now, and longs for tales of the outside world to which she can no longer travel.")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Gallic Acrobat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gallic Acrobat")
                              )
                            ),
                            Core.vx_new_string("Gallic Charlatan"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gallic Charlatan")
                              )
                            ),
                            Core.vx_new_string("Gallic Duelist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gallic Duelist")
                              )
                            ),
                            Core.vx_new_string("Gallic Militia"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gallic Militia")
                              )
                            ),
                            Core.vx_new_string("Gallic Warrior"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Gallic Warrior")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Bavaria"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Bavaria"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Blackmarsh"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Blackmarsh")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Iberia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Iberia"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Portugal, Spain"),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Order, The"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Order, The"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Order is a large, theocratic nation which lies to the west of Elysia. Life in the Order is dominated by religion, the Hierophant, and the Theocracy.\n* Geography - The Order covers a large mountainous pennisula, separated from Elysia, and the Imperium by the Pyrenees mountains.\n* Daily Life - The influence of the religion is evident everywhere. Individualism has been throughly suppressed. All citizen dress alike, speak in tired cliches, and effect identical mannerisms.\n* Laws - Laws of the Order are extremely strict and narrowly interpreted. Those who commit even the slightest transgression are dragged to the Halls of Penance. At the discretion of the Inquisitors, non-believers may be forcibly converted or may simply 'disapper'.\n* Visitors - Travellers from other lands are rare and stand out like beacons. They are generally treated as inferiors and are only tolerated if their presense is of some advantage to the state.\n* Alms - A person's spiritual enlightenment is measured by the Theocrats in a spiritual value called Alms. Alms are awarded for specific contributions to the church including tithes, military service, good deeds, church titles, pilgrimages, etc. Each rank provides specific perks within society but is also intened to be a direct measure of the quality of the person's afterlife.\n* Clash of Champions - The Imperium has tried to invade the Order twice to no avail. The geography and religious zealots of the Order have proven too difficult to overcome. Since the last battle, the Order and Elysia (backed by the Imperium) have waged a propaganda war culminating in the annual event known as the Clash of Champions. Each year both nations scout for worthy (and expendible) warriors to represent their interests in a duel atop the main gates of the Order capital. The winner receives great rewards from their sponsor. Though not technically, a duel to the death, it is expected that the loser will be thrown or forced  off the gates to fall 20 feet below to the roar of the crowds. It is considered a particular coup to cause a vanquished foe to fall amongst his or her own supporters. Since the Order and Elysia could scarsely be more different in their outlooks on life, the winners consider their victory to be a referendum on the virtues of their philosophies. The Order takes the competition very seriously and, of course, gambling and drinking are not allowed within the city walls. Elyisians consider the Clash to be one of the social events of the season. Though they must travel through the mountain pass and they are not permitted entrance to the city, they still come in large numbers with their wagons, children, merchants, wenches, gamblers, acrobats, and performers. For the Elysians, the party is equally large whether they win or not."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Chantry, The Order, Papal States, Theocracy"),
                                Core.vx_new_string(":locationmap"),
                                Core.f_new(
                                  Base.t_locationmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Halls of Penance"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Halls of Penance")
                                      )
                                    ),
                                    Core.vx_new_string("Order Catherdral"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Catherdral")
                                      )
                                    ),
                                    Core.vx_new_string("Order Monastery"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Monastery")
                                      )
                                    ),
                                    Core.vx_new_string("Order Nunnery"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Nunnery")
                                      )
                                    ),
                                    Core.vx_new_string("Order Reliquary"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Reliquary")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Order Apostate"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Apostate"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* An outcast who has lost his Alms and effectively forsaken the religion. Apostates are pariahs within the Order.")
                                      )
                                    ),
                                    Core.vx_new_string("Order Brother"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Brother"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Monks of the Order swear numerous oaths of purity including oaths of poverty and celebacy. Most Brothers live in a Monestary, while others travel the world doing good works and spreading the word of their God.")
                                      )
                                    ),
                                    Core.vx_new_string("Order Crusader"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Crusader"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The armored knights of the Order. They serve as the officers of the army and navy.")
                                      )
                                    ),
                                    Core.vx_new_string("Order Evangelist"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Evangelist")
                                      )
                                    ),
                                    Core.vx_new_string("Order Father"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Father")
                                      )
                                    ),
                                    Core.vx_new_string("Order Hierophant"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Hierophant"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Hierophant is the undisputed religious ruler of the nation. Though he theoretically holds no military power, he is considered to be infallible and a direct emissary of God, so he practically wields absolute power. His power is maintained by the Theocracy, so he must maintain their trust at all times.")
                                      )
                                    ),
                                    Core.vx_new_string("Order Inquisitor"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Inquisitor"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Inquisitors have a single task: to root out and elminate heretics. To this end they act as judges, secret police, and interrogators. Inquisitors preside over rituals desgined to purge unacceptable desires from penitent hearts using methods that some might call torture.")
                                      )
                                    ),
                                    Core.vx_new_string("Order Mother Superior"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Mother Superior")
                                      )
                                    ),
                                    Core.vx_new_string("Order Priest"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Priest")
                                      )
                                    ),
                                    Core.vx_new_string("Order Sister"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Sister"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Nuns of the Order swear numerous oaths of purity including oaths of poverty and celebacy. Sisters live in a Nunery and seldom leave except to perform tasks in nearby towns.")
                                      )
                                    ),
                                    Core.vx_new_string("Order Templar"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Templar"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* An official Mage Hunter/Witch Hunter of the Order.\n* Since magic that is not sanctioned by the church is heresy, the Templars are commissioned to contain or eliminate enemies of the Order that are beyond the capabilities of the Inquisitors. They are given great authority to complete their missions and can rely on the Inquistors and Crusaders for aid.")
                                      )
                                    ),
                                    Core.vx_new_string("Order Theocrat"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Order Theocrat"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Theocracy serves as both a religious and government center. The Theocrats maintains the Library of Revelations which are the great books of religious canon that supposedly answer any question worth knowing. Interpreting these books allow the Theocrats to rule on all matters of daily life: clothing, trade, law enforcement, etc. These interpretations have led to a very rigid, conservative society where many acts are considered heretical.")
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
                    Core.vx_new_string(":Imperium"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imperium"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Rome, United States"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Description - The Imperium is the most stable and advanced nation in history. It is known as a conquering nation that has taken over much of the modern world. Its reputation is somewhat exaggerated. The Imperial Legionnaires are the most devastating standing army on the planet, but the Imperium has had its share of defeats and finds it hard to hold territory that it 'conquers'. Fortunately, the Imperium is mostly concerned with trade and is very willing to negotiate with its neighbors and allow autonomy in its territories in order to concentrate on its borders to the east where it faces constant incursions from the Shattered Lands and from the Dragon's Eye.\n* Currency - Imperial Sovereigns (Imperials or Crowns) are made from gold, have eight sides, and have the image of the current emperor on the front and the imperial seal on the back. They are made of solid gold and are accepted almost everywhere.\n* Architecture - Imperia has a love of monolithic buildings with towering columns that reflect the Imperial ego.\n* Roads - The Imperium maintains excellent cobblestone roads throughout its own and its allies territories. All roads lead to Imperia and have armed forts at regular intervals with Centurions, an inn, and a trading post. The forts charge a toll to pass, prices at these forts are high, and any trade done is taxed, but forts are always professionally defended and are generally worth the price.  The roads benefit trade, but are also a reminder of the influence of the Imperium."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Italia, Sovereign"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Imperia"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imperia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The capital city of the Imperium."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Empire"),
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_location,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("place")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Mount Vesuvius"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mount Vesuvius")
                              )
                            ),
                            Core.vx_new_string(":Pompeii"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pompeii"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The story of the destruction of Pompeii when Mt. Versuvius erupted is widely known. The story is often used as a cautionary tale to obey the will of the gods.\n* Pompeii is now an empty ruin that functions as an enormous graveyard for the approximately 20,000 victims of the disaster. The dead remain at rest as long as the the area is undisturbed, and careful travellers may investigate the area at their peril. If there is any disturbance the bodies begin\nawakening as Burning Dead and are hysterically drawn to the living who will not long survive their embrace.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Imperial Centurion"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imperial Centurion")
                              )
                            ),
                            Core.vx_new_string("Imperial Gladiator"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imperial Gladiator")
                              )
                            ),
                            Core.vx_new_string("Imperial Legionnaire"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imperial Legionnaire")
                              )
                            ),
                            Core.vx_new_string("Imperial Senator"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imperial Senator")
                              )
                            ),
                            Core.vx_new_string("Imperial Slaver"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Imperial Slaver")
                              )
                            ),
                            Core.vx_new_string("Borderland Legionnaire"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Borderland Legionnaire"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The far eastern outposts of the empire are manned by the Legion of the Borderlands. This is body of hard-bitten mercenaries, outcasts, and criminals from many lands. Being assigned to the Legion of the Borderlands one way that the Imperium makes use of troublemakers.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Teuton"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Teuton"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Germany"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Description - Currently claimed as a territory of the Imperium.\n* Dwarves"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Dark Forge"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dark Forge"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A legendary forge where a man may be forged into the body of an Iron Golem, at the cost of his humanity.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Iron Mountains"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iron Mountains"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The home of a stout race of men who live their lives on the cliffs and in tunnels of the Iron Mountains.")
                              )
                            ),
                            Core.vx_new_string("Iron Citadel"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Iron Citadel"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The capital of the Iron Kingdom. It is an enormous castle built into a cliff-face. Though it is huge outside, the citadel is mostly within the mountain. The mountain face makes the citadel basically impregnible from the outside. The true danger, however, lies undergound...")
                              )
                            ),
                            Core.vx_new_string("Deep Roads"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Deep Roads"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A fantastic labyrinth of inter-connected, underground tunnels deep within the earth. The tunnels were mostly created by volcanic activity and underground rivers ages ago. They are so extensive that many civilizations live within the Deep Roads."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Dark Roads, Underdark, Underlands")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Zura"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Zura"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Switzerland"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Zurans are small in stature but very well educated people. They are are highly materialistic and suspiscious of others. They prefer windowless towers to minimize the chance of theft. They typically hide and trap their valuables and carry hidden weapons all the time."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gnomes of Zurich"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Zuran Academy"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zuran Academy"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Zuran Academy is large complex of buildings that house schools, libraries, laboratories, and forges. Here can be found worlds most advanced scientific pursuits including: Alchemy, Thaumaturgy, Artifce, Gold/Silversmithing, Timekeeping, Glassblowing, and Tinkering.\n* Masters take on students as apprentices to dedicate their lives to a craft.")
                              )
                            ),
                            Core.vx_new_string(":Zurich"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zurich")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Zuran Inventor"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zuran Inventor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Zuran Inventors are masters at fine mechanics including clockworks, locks, and traps.")
                              )
                            ),
                            Core.vx_new_string("Zuran Moneylender"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zuran Moneylender"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* These moneylenders are shrewd negotiators and are always looking for a way to make a profit and manage their risk. They hire enforcers to make sure payment is made in full.")
                              )
                            ),
                            Core.vx_new_string("Zuran Procurer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zuran Procurer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Zuran merchants are unusual in that they tend to not maintain any particular product. Instead, they use their connections to locate and procure whatever is required. They are expensive, but they take great pride in their work and ensure that their customers are always satisfied.")
                              )
                            ),
                            Core.vx_new_string("Zuran Sage"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zuran Sage"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Zuran Sages are librarians, reasearchers and advisers.")
                              )
                            ),
                            Core.vx_new_string("Zuran Thief"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zuran Thief"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Zuran thieves materialism of course leads many to steal what they want. The skilled thieves in Zuraare precisely why the Zurans are so paranoid of theft. The skilled locksmiths are met with equally skilled lockpickers in a security arms race.")
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
            Core.vx_new_string("Middle East"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Middle East"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Arabia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arabia"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Saudi Arabia")
                      )
                    ),
                    Core.vx_new_string(":Assyria"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Assyria"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Babylon, Mesopotamia, Sumeria"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Twin Rivers - Assyria is a verdent valley nestled between the Tigris and Euphrates Rivers."),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Magisterium"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Magisterium"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Magister\n* Maleficar - A practitioner of Black Magic\n* Librarian\n* Certamen - Arcane Duel\n* Templar"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Magocracy"),
                                Core.vx_new_string(":locationmap"),
                                Core.f_new(
                                  Base.t_locationmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Arcanum"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Arcanum"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("Chantry, Ivory Tower, Tower of Babylon"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Arcanum is a colossal, tiered, white tower that houses the wizards of the Magisterium and their servants.\n* Construction - The tower is continually being built wider and higher using a combination of wizardry and labor. Its towering height represents the wizards power and dominion over the area. There are those who argue that the height of the tower has become a liability, but building the tower holds great symbolic and traditional importance, so those voices carry little weight. Inside, the tower has concentric walls that were built outward over time like tree rings. The complex construction has left much room for hidden passages and chambers throughout.\n* The home of the Arcanum Society, a fraterity of wizards, sages, alchemists, and artificers. Though their only stated goal is the pursuit of arcane knowledge, they are widely known as power brokers across the known world (and perhaps some unknown ones).\n* Arcanum Awards - The Arcanum Society holds an annual dinner to recognize the greatest magical discoveries of the year.")
                                      )
                                    ),
                                    Core.vx_new_string("Great Ziggurat"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Great Ziggurat")
                                      )
                                    ),
                                    Core.vx_new_string("Hanging Gardens"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanging Gardens"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("Hanging Gardens of Babylon"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* One of the Seven Wonders of the World")
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
                    Core.vx_new_string(":Canaan"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Canaan"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Israel"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Mount Zion"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mount Zion")
                              )
                            ),
                            Core.vx_new_string("Solomon's Temple"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Solomon's Temple")
                              )
                            ),
                            Core.vx_new_string(":Zion"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Zion")
                              )
                            ),
                            Core.vx_new_string("Dead Sea"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Dead Sea")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Pars"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pars"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Persia"),
                        Core.vx_new_string(":sectionmap"),
                        Core.f_new(
                          Base.t_sectionmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Farad"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Farad"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Farad is an ancient land.\n* People - The country is largely poor and overpopulated.\n* Politics - Farad is ruled by a figurehead Kaliph, but each city state is actually run by individual Sultans who answer to no one. Assassination is an artform. Their assassins are known for their cunning and ruthlessness.\n* Justice - Justice is harsh and arbitrary. The militia is highly corrupt, and anything can be gotten for a price.\n* Economics - Trade caravans and shipping are huge sources of wealth. Spices and exotic dyes and weaves are particularly large industries."),
                                Core.vx_new_string(":locationmap"),
                                Core.f_new(
                                  Base.t_locationmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Faradin"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Faradin")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Faradun Mercenary"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Faradun Mercenary"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Since almost all actual Faradun are merchants, the army and navy are all highly paid mercenaries from other lands.")
                                      )
                                    ),
                                    Core.vx_new_string("Faradun Merchant"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Faradun Merchant"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Few actual Faraduns are not merchants. Other tasks are done by slaves, indentured servants, convicted felons, and hired laborers.")
                                      )
                                    ),
                                    Core.vx_new_string("Faradun Procurer"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Faradun Procurer"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* A specialized merchant skilled at obtaining any entertainment or diversion imaginable regardless of its legal status ... for the right price. Procurers are famous for their discretion in this 'no questions asked' business. The Farad legal system does not hold Procurers liable for the actions of their customers, so they act with impunity.")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":Phatas"),
                            Core.f_new(
                              Base.t_section,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Phatas"),
                                Core.vx_new_string(":locationmap"),
                                Core.f_new(
                                  Base.t_locationmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Phatasia"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Phatasia"),
                                        Core.vx_new_string(":reference"),
                                        Core.vx_new_string("* Joseph Jacobs, Jack and the Beanstalk\n* Stratos - Star Trek, The Cloud Minders"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Phantasia is a unique city. Half of the city is quite normal, the other half is literally floating on a cloud. Long ago when a local hero slew a Cloud Giant, and the giant's floating keep remained hovering over the town where he lived. After the creation of windships, the townsfolk began converting the giant's keep into a human city. The city has towering walls, but has limited floorspace, so only the wealthiest live in the clouds.\n* Windships - Over time, the town grew and eventually a brilliant wizard discovered a way to construct windships based on his studies of the floating city. He made a fortune by keeping the technique a closely guarded secret. Unfortunately, the secret seems to have died with its creator, and no one has been able create new windships since.\n* Weather - Phantasia can get chilly and severe weather can be very harrowing.")
                                      )
                                    ),
                                    Core.vx_new_string("Bazaar of the Bizarre"),
                                    Core.f_new(
                                      Base.t_location,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Bazaar of the Bizarre"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Each year for one week, the Phantasias hold an exhibition of oddities and diversions. To gain entrance, you must be attired in costume. Wearers of the most outlandish garb are awarded a silver goblet which allows them to drink for free during the festival.\n* Multi-colored tents and pavilions litter the festival grounds, each housing some sort of attraction: a duel of spell casters for wagers, abominations from the Aberrant Forest, Illusionary panoramas, romances, sensations, or improbabilities and other things which defy description. Visitors are invited to observer, partake of, or otherwise experience all he or she desires. Rare delicacies from around the world are available.\n* The climax is the award ceremonies when prizes are given in various categories including: 'Most Unique', 'Most Provacative', 'Most Absurd'. The final award is the most coveted: 'Most Bizarre'. A committee of 12 enchanters judge the competition, registering various degrees of approval or disapproval by means of magically enhanced facial expressions and gestures.")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitmap"),
                                Core.f_new(
                                  Base.t_unitmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Phantasian Dreamer"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Phantasian Dreamer"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The Dreamers use their [Dreaming] skill to capture and sell the exotic\n[Dream Essence] to those wealthy enough to afford such luxury.")
                                      )
                                    ),
                                    Core.vx_new_string("Phantasian Windship"),
                                    Core.f_new(
                                      Base.t_unit,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Phantasian Windship"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* The windships are wonderous craft which sail upon the winds as sea vessels ply the waters. They are constructed of the lightest possible materials and are therefore somewhat fragile and require constant repair. Extreme weather conditions are a particular concern especially high winds and freezing rain, and lightning.\n* The sails and rigging are made of gossamer. Flight is maintained by magical devices called levitationals below decks. These levitationals only provide elevational control. Directional control and speed are all subject to the wind.")
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
                    Core.vx_new_string(":Raja"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Raja"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Red Gold - The mines of Raja are rich with very impure gold deposits. Large slave colonies work the mines day and night. Rajans leave the red impurities in the smelting process leaving their gold with a swirled bloody look to it.\n* Rajan Glory - The only allowed currency of Raja are the blood red gold coins called Glories. They are simple and fearsome with a burning fire on one side and a cackling skull on the other. Like Rajan gold in general, the coins have a swirled bloody look to them and are only about 75% pure. Since Raja is 	considered a rogue state by other nations, possession of Rajan Glories is sufficient evidence to be imprisoned as a spy. On the black market the coins can get about 25% of their face value, especially in distant lands where the penalies for possession are lower."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Rajan Desert Warrior"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rajan Desert Warrior"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* An army of religious fanatics who believe that their service in life will be rewarded in the after life, so they obey without question.")
                              )
                            ),
                            Core.vx_new_string("Rajan Agent"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rajan Agent"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The loyal servants the Black Mystics. They act as spies, assassins, terrorists, and secret police thoughout the country and beyond.")
                              )
                            ),
                            Core.vx_new_string("Rajan Inquisitor"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rajan Inquisitor"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The elite religious agents of the Black Mystics. They are priest, healers, torturers, and personal bodyguards of the Black Mystics."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Torquar")
                              )
                            ),
                            Core.vx_new_string("Rajan Black Mystic"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Rajan Black Mystic"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Black Mystics are necromancer/priest who lead the Rajan cult. They are religious fanatics and believe that they channel the will of their dread gods.\n* Black Mystic religious ceremonies typically feature ritual executions symbolizing conversion of non-believers to the cult. Demons perform the executions which draw great crowds of worshippers to the temples.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Desert Wastes"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Desert Wastes"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("City of Brass"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("City of Brass"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The City of Brass is a major city of the [Ifrit]. It is a beautiful place with palaces, libraries, and cathedrals all built to giant scale and all built of brass to withstand the withering desert heat.")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Juzam Djinn"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Juzam Djinn"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Juzam Djinn are 14 foot tall, brass skinned devils with curved horns and tusk-like fangs. They wield huge stone clubs carbed with the visages of leering devils. They wear only necklaces of skulls collected as mementos of their grisly conquests.\n* They are fond of men whom they regard as fine eating.\n* They entertain themselves by various games including hurling large rocks long distances to crush various animals. They are also extremely fond of games of chance and wagers, though they are not above using their magical powers to tilt games in their favor.")
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
            Core.vx_new_string(":Oceania"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Oceania"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Pacific Ocean"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Cresent Isles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Cresent Isles"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Nauticus Reef"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Nauticus Reef"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* A great mass of coral filled with beautiful and dangerous sea life. The reef has been the cause of many shipwrecks over the years and is the subject of many perilous salvage operations over the years.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Lemuria"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lemuria")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Underground, The"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Underground, The"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Underdark, Underdeep"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Underground Highway"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Underground Highway"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An extensive tunnel system that covers hundreds of miles and travels deep under many countries.\n* Ages ago an underground river flowed through this region carving out the massive tunnels and tributaries. The receding waters developed a vast underground ecosystem. Phosphorescent fungi even allowed sighted beings to thrive in this spectacular and bizarre underground world.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string(":Wilderlands"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Wilderlands"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("* Americas"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Aberrant Rainforest"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aberrant Rainforest"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Aberrant Rainforest is a weird and grotesque jungle the freakish origins of which are attributed to a magical mishap of unparalleled proportions.\n* All manner of rare and exotic vegetation can be found here, though nothing that grows here is as nature intended. The plants and trees appear heedless of natural law, growing to immense proportions or becoming gnarled and twisted in form. From the underbrush, animate tentrils of tanglewood reach out to ensnare the incautious. Among the reports of talking Mang trees, giant species of slugs and scavenger slimes, and strange insect-reptile hybrids are tales of intelligent plant creatures.\n* Murky streams flow uphill, stagnant ponds move slowly across the land, and the ground itself seems to pulse as if it were alive.\n* Because many varieties of unique and valuable herbs grow throughout the forest, visitors are not unknown.")
                      )
                    ),
                    Core.vx_new_string("Lost Sea"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lost Sea"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("Salt Flats"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Deep within the Wilderlands is a flat wasteland known as the Lost Sea. This area appears to be a dry seabed littered with the ancient skeletons of giant aquatic monsters. The area gets little rain and is layered in salt from the former sea, so nothing lives here. It is said that the wrecks of ancient ships can be found in isolated places potentially carrying treasures from ancient civilizations.")
                      )
                    ),
                    Core.vx_new_string("Lost World"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Lost World"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("The Land that Time Forgot"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Deep within the Wilderland jungles is a towering ridge of a massive caldera formed\nby an ancient volcano. Within the caldera is a large expanse of jungle cut off from\nthe outside world for millions of years. Numerous creatures though to be extinct still\nsurvive in this safe haven."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Pangaea")
                      )
                    ),
                    Core.vx_new_string("Salt Flats"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Salt Flats")
                      )
                    ),
                    Core.vx_new_string("Sea of Glass"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sea of Glass"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The sea of glass is a vast expanse of mostly flat glass. The sea was presumably\nformed by a massive firestorm detonating over a sandy desert, but no cause had been\ndiscovered. Travelling over the glass is similar to travelling over ice though the\nglass is much harder and the weather is very hot. The glass creates a blinding glare\nwhen the Sun is at the right angle, and the surface can seem like a giant frying pan\nunder the noonday Sun.")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Azteka"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Azteka")
                      )
                    ),
                    Core.vx_new_string(":Maya"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Maya")
                      )
                    ),
                    Core.vx_new_string(":Mandragora"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mandragora"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Mandragora is named for the unusual sentient plant-life, the Mandragore, who live here.\n* Mandragores - About three feet high and vaguely man-like, they are roughly humanoid in form with gnarled root-like limbs and leafy 'hair'. Their eyes are like dark knots and their mouths are like the twisted hollow of a tree. The Mandragore usually stand rooted and immobile during the day as they soak in sunlight. During this time, they are well camoflaged among the other plant-life. At night, they move about tending their chores and looking for trespassers who they attempt to capture with nets of vines and grasses. Their unfortunate victims are bound and buried alive as fertilizer.\n* Abilities - The Mandragore are weak fighters who rely on surprise and numbers to battle large foes."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Mandragore Herbalist"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mandragore Herbalist"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Naturalism"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Naturalism"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Warp Wood"),
                                            Core.f_new(
                                              Base.t_unitability,
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
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Physical Weakness"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Physical Weakness"),
                                        Core.vx_new_string(":unitabilitymap"),
                                        Core.f_new(
                                          Base.t_unitabilitymap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Vulnerable to Fire"),
                                            Core.f_new(
                                              Base.t_unitability,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Vulnerable to Fire")
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
   * @function chapter_nexus_fantasy_characters
   * @return {chapter}
   * (func chapter_nexus_fantasy_characters)
   */
  public static interface Func_chapter_nexus_fantasy_characters extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_nexus_fantasy_characters();
  }

  public static class Class_chapter_nexus_fantasy_characters extends Core.Class_base implements Func_chapter_nexus_fantasy_characters {

    @Override
    public Func_chapter_nexus_fantasy_characters vx_new(Object... vals) {
      Class_chapter_nexus_fantasy_characters output = new Class_chapter_nexus_fantasy_characters();
      return output;
    }

    @Override
    public Func_chapter_nexus_fantasy_characters vx_copy(Object... vals) {
      Class_chapter_nexus_fantasy_characters output = new Class_chapter_nexus_fantasy_characters();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_nexus_fantasy_characters", // name
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
    public Func_chapter_nexus_fantasy_characters vx_empty() {return e_chapter_nexus_fantasy_characters;}
    @Override
    public Func_chapter_nexus_fantasy_characters vx_type() {return t_chapter_nexus_fantasy_characters;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_nexus_fantasy_characters();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_nexus_fantasy_characters() {
      return Fantasy.f_chapter_nexus_fantasy_characters();
    }

  }

  public static final Func_chapter_nexus_fantasy_characters e_chapter_nexus_fantasy_characters = new Fantasy.Class_chapter_nexus_fantasy_characters();
  public static final Func_chapter_nexus_fantasy_characters t_chapter_nexus_fantasy_characters = new Fantasy.Class_chapter_nexus_fantasy_characters();

  public static Base.Type_chapter f_chapter_nexus_fantasy_characters() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Nexus Fantasy Characters"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Nexus Fantasy Characters"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Nexus Fantasy Characters"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Arinni Taybor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Arinni Taybor"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Human Priest/Monk"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Taybor the Red"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Melee"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Quarterstaff"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Quarterstaff")
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
                    Core.vx_new_string("Eldruf Grundel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Eldruf Grundel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Gnome Thief Magician")
                      )
                    ),
                    Core.vx_new_string(":Flint"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Flint"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Flint.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Half-Elven Thief"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Stealth"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("9"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Backstab"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Backstab")
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
                    Core.vx_new_string("Galamir Mirlesem"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Galamir Mirlesem"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/GalamirMirlesem.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Human Mage\n* Personality - Galamir is a brilliant Wizard and strategist, but he is impatient with others and has no respect for politics or idle chit-chat.\n* History - Galamir was born to Chantry trainers, and as a child he was allowed special access to the arcane academy. As a teen, he became obsessed with magic and its effect on the world. His brilliance and magical aptitude were soon recognized and he was accepted into the academy. For the next 25 years he completed his full wizardry and elemental training and received top honors. He was a logical 	candidate to become a trainer himself, but he was bored of the cloistered life, so he began visiting other Chantries across the world. Along the way he encountered a naive, young half-elf rogue named Phirax living on a simple farm. Galamir recruited Phirax to join him to perform the more dangerous and mundane tasks while Galamir provided the leadership and strategy. Later, he recruited the Warrior Stam and the Cleric Sarak into their party to rounded out their abilities."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Wizardry"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Wizardry"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("11")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Physical Powers"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physical Powers"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("10")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Hetman Undrig"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hetman Undrig"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Orc Assassin\n* A pragmatic, hardened survivalist who began his career as a lowly militia man in the Orc Army who would later form the infamous mercenary guild, the Blackguard.\n* Personality - Hetman is noteworthy for his lack of personal pride or conscience. He dislikes authority.  He strongly believes the ends justify the means and has no compunction about using any means available.\n* The Blackguard - When establishing the Blackguard, he insisted that it should never have a central authority and that all decisions were made by popular vote."),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Melee"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Melee"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Longsword"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Longsword")
                                      )
                                    ),
                                    Core.vx_new_string(":Dagger"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Dagger")
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
                    Core.vx_new_string("Jaris Ransun"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Jaris Ransun"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Ransun.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Human Hunter"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Valen the Hunter"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Defense"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Defense"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Chain Mail Armor"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Chain Mail Armor")
                                      )
                                    ),
                                    Core.vx_new_string(":Shield"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Shield")
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
                    Core.vx_new_string("Phirax Alganon"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phirax Alganon"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/PhiraxAlganon.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Half-Elven Bard\n* Personality - Phirax is an entertaining, friendly, perceptive person who is very focused on 'the now'. He applies all his attention to the current situation and the people around him which gives him a keen eye for detail, deception, and subtle clues of human behavior. He strongly believes he is on the right path in life and has developed very strong emotional confidence which lets him roll with the whatever comes his way. He appreciates plans and planners, but he feels that plans must always be flexible because they rarely predict a situation accurately.\n* Beliefs - Phirax believes that improving the lives of those around him will also improves his own life. He sees this as selfishness through selflessness, therefore it is always in his own interest to help others. He could easily manipulate those around him, but he abhors the idea of exploiting others and is quick to judge abusers of any kind. He follows the lesser god Seker on his mission to destroy undead, specifically those who feed on or otherwise exploit the living (which is pretty much all of them).\n* History - Phirax was born into a large family on a farm bordering the Arden Forest. During the day, he learned diverse combat and survival skills with the Elves of the forest. At night he practiced various social skills at the human tavern. He was planning to set out on his own soon when he encountered a rather awkward and self-important Wizard named Galamir. After he confirmed the Wizard's abilities, he agreed to join him as a pair of traveling adventurers. Soon after, the pair teamed up with a Warrior and a Cleric. With the party complete, they set out for danger and treasure."),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Empathy"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Empathy"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("12"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Demoralize"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Demoralize")
                                      )
                                    ),
                                    Core.vx_new_string(":Inspiration"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Inspiration")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Stealth"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Stealth"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("9"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Backstab"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Backstab")
                                      )
                                    ),
                                    Core.vx_new_string("Hide in Shadows"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hide in Shadows")
                                      )
                                    ),
                                    Core.vx_new_string("Move Silently"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Move Silently")
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
                    Core.vx_new_string("Sarak Ishimar"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sarak Ishimar"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/SarakIshimar.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Human Cleric"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Faith"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Faith"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("8")
                              )
                            ),
                            Core.vx_new_string(":Invocation"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Invocation"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("10")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Physical Powers"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Physical Powers"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("8")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Stam Domindor"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Stam Domindor"),
                        Core.vx_new_string(":image"),
                        Core.vx_new_string("Fantasy/Stam.png"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Dwarven Warrior"),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Ranged"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Ranged"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("7"),
                                Core.vx_new_string(":unititemmap"),
                                Core.f_new(
                                  Base.t_unititemmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string("Short Bow"),
                                    Core.f_new(
                                      Base.t_unititem,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Short Bow")
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
            ),
            Core.vx_new_string("Nexus Fantasy Actors"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Nexus Fantasy Actors"),
                Core.vx_new_string(":unitmap"),
                Core.f_new(
                  Base.t_unitmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Antios Teron"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Antios Teron"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Human Spy\n* Antios is a spy for Lord Aramel.\n* He is currently disguised as a mercenary for hire while travelling through the Imperium to assess their defenses. He has been authorized to assassinate any high ranking politician he should encounter to disrupt\nlocal politics. His mission has no time limit, and he is periodically scried by Lord Aramel's wizards.\n* He is a convincing actor who can play most parts well. He is particularly ruthless about his identity and will silence any who might compromise him or his mission."),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Espionage"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Espionage"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("5")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Blackguard"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Blackguard"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* An elite mercenary cadre organized by Hetman Undrig.\n* Their base is a small, walled town dedicated to their needs.\n* The Dragoons are a loose group. Decisions and leaders are chosen by majority vote. Power can change at anytime (including during combat).\n* Dragoons pay no dues nor is there direct pay. The Dragoons make money by hiring out as mercenaries.  They charge double normal rates, but are reknowned for their excellent training and equipment. Dragoons take great pride in their high status and react poorly to those who do not recognize their talent.\n* Dragoons are trained professionals in their jobs and recognize the need for discretion. They care little for whether a job is legal or not, and the Dragoons are known for possessing certain 'subtle' skills that make covert missions possible. They do not, however, enjoy excessive risk and are not above abandoning very dangerous missions."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Black Dragoon")
                      )
                    ),
                    Core.vx_new_string("Charn Aramel"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Charn Aramel"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Human Dread Knight"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Nighthook, Lord Aramel"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Conviction"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conviction"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("10")
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Psychic Powers"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Psychic Powers"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("10")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Sarani Kalea"),
                    Core.f_new(
                      Base.t_unit,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Sarani Kalea"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("Human Priestess"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Princess Kalea, High Priestess of Kali"),
                        Core.vx_new_string(":unitpowermap"),
                        Core.f_new(
                          Base.t_unitpowermap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Conviction"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Conviction"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("12")
                              )
                            ),
                            Core.vx_new_string(":Invocation"),
                            Core.f_new(
                              Base.t_unitpower,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Invocation"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("16"),
                                Core.vx_new_string(":unitabilitymap"),
                                Core.f_new(
                                  Base.t_unitabilitymap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Aspecting"),
                                    Core.f_new(
                                      Base.t_unitability,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Aspecting")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        ),
                        Core.vx_new_string(":unitskillmap"),
                        Core.f_new(
                          Base.t_unitskillmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Psychic Powers"),
                            Core.f_new(
                              Base.t_unitskill,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Psychic Powers"),
                                Core.vx_new_string(":level"),
                                Core.vx_new_string("12")
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
   * @function chapter_realms_beyond
   * @return {chapter}
   * (func chapter_realms_beyond)
   */
  public static interface Func_chapter_realms_beyond extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_realms_beyond();
  }

  public static class Class_chapter_realms_beyond extends Core.Class_base implements Func_chapter_realms_beyond {

    @Override
    public Func_chapter_realms_beyond vx_new(Object... vals) {
      Class_chapter_realms_beyond output = new Class_chapter_realms_beyond();
      return output;
    }

    @Override
    public Func_chapter_realms_beyond vx_copy(Object... vals) {
      Class_chapter_realms_beyond output = new Class_chapter_realms_beyond();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_realms_beyond", // name
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
    public Func_chapter_realms_beyond vx_empty() {return e_chapter_realms_beyond;}
    @Override
    public Func_chapter_realms_beyond vx_type() {return t_chapter_realms_beyond;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_realms_beyond();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_realms_beyond() {
      return Fantasy.f_chapter_realms_beyond();
    }

  }

  public static final Func_chapter_realms_beyond e_chapter_realms_beyond = new Fantasy.Class_chapter_realms_beyond();
  public static final Func_chapter_realms_beyond t_chapter_realms_beyond = new Fantasy.Class_chapter_realms_beyond();

  public static Base.Type_chapter f_chapter_realms_beyond() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Realms Beyond"),
        Core.vx_new_string(":reference"),
        Core.vx_new_string("* Reality is just your mind collapsing under what it doesn't understand, silly. - Zoe, Runeterra"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* The realms beyond our mortal existence.\n* It is the origin of our souls, dreams, and imagination. It is also the home of spirits and demons.\n* All of the different realms are like closely packed soap bubbles. Where the bubbles touch, realms touch, and the presense of those realms can be felt.\n* The Realms Beyond are described by coordinates for +/-x, +/-y, +/-z, +/-t, +/-i (length, height, width, time, imaginary)\n* Realm Types:\n** Universe: +x, +y, +z, +t, 0i\n** Positive Planes: +x, +y, +z, +t, +i\n*** Hyperspace is when you travel through the Positive Planes: +i\n** Void -x, +y, -z, -t, +i\n** Antiverse: -x, -y, -z, +t, 0i\n** Limbo +x, -y, -z, +t, -i\n** Negative Planes +x, +y, +z, +t, -i\n*** Umbra/Subspace connects the Negative Planes -i\n** Temporal Realms +/-x, +/-y, +/-z, +/-t, 0i"),
        Core.vx_new_string(":titles"),
        Core.vx_new_string("Multiverse, Realties, Realms"),
        Core.vx_new_string(":sectionmap"),
        Core.f_new(
          Base.t_sectionmap,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":Universe"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Universe"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Location: +x, +y, +z, +t, 0i"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Material Realm, Material Universe, Real World, Space")
              )
            ),
            Core.vx_new_string(":Antiverse"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Antiverse"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Antispace was created with the Big Bang. In this multiverse a larger amount of anti-matter than matter was created. They are very similar to the Material Realms, but their particles are deadly to beings from the Physical Realms and vis-versa."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Antispace, Anti Realm, Negative Zone")
              )
            ),
            Core.vx_new_string(":Void"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Void"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Void was created with the Big Bang. In this multiverse a roughly equal amount of matter and anti-matter were created. Almost nothing remains in this desolate lightless physical multiverse.")
              )
            ),
            Core.vx_new_string(":Limbo"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Limbo"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Limbo was created with the Big Bang. In this multiverse a roughly equal amount of matter and anti-matter were created. Almost nothing remains in this desolate lightless spirit multiverse.")
              )
            ),
            Core.vx_new_string("Positive Planes"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Positive Planes"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Higher Realms, Order Realms, Positive Realms, Positive Space"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Celestia"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Celestia")
                      )
                    ),
                    Core.vx_new_string(":Hyperspace"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hyperspace"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hyperspace is not an actual place, it is what one observes while travelling between Positive Planes.")
                      )
                    ),
                    Core.vx_new_string(":Source"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Source"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* I am kindness. I am unity. I am bigotry. I am expansion. I am the end! The DEATH that comes for expansion! For existence! The NULL that comes unto us all. Because I AM the PHOENIX! Life and death INCARNATE! The resurrection and renewal that will never end. Memories reawakened. A life lived and ended, again and again. A perpetual cycle of joy and sorrow. Anger and gratitude. Bliss and grief. All of them, just small parts of what relentlessly perseveres. Infinite, Absolute, Unconditional. - Madelyn Prior, X-men"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Location: 0x, 0y, 0z, t, +infinity-i\n* The White Hot Room is a single point at the infinite edge of [Positive Space]. As such, it holds infinite energy.\n* It is the home of the [Phoenix Force].\n* It is speculated that beyond the Source, lies [Oblivion] in an endless cycle.\n* Some say all of reality is just shadows cast between the Source and Oblivion."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Absolute Order, Positive Infinity, The Beginning, The Fountain, The Source, The White Hole, True Order, White Hot Room")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Negative Space"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Negative Space"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Lower Realms, Negative Realms, Negative Space, Negative Universe, Negaverse"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Abyss"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Abyss"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Pandemonium, The Well")
                      )
                    ),
                    Core.vx_new_string(":Oblivion"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oblivion"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* It is speculated that beyond Oblivion, lies the [Source] in an endless cycle."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Absolute Chaos, The End, True Chaos")
                      )
                    ),
                    Core.vx_new_string(":Umbra"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Umbra"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hyperspace is not an actual place, it is what one observes while travelling between Positive Planes."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Subspace")
                      )
                    ),
                    Core.vx_new_string(":Wyld"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wyld"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Wildspace, Wylderlands, Wyldspace")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Temporal Realms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Temporal Realms"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Temporal Realms are described by coordinates for +/-x, +/-y, +/-z +/-t (length, height, width, time)"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Vortex"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Vortex"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The Christmas tree, which can be traced in its origins back to pre-Christian European beliefs, represents an axis mundi.\n* The axis mundi (also cosmic axis, world axis, world pillar and center of the world) is a symbol representing the point of connection between sky and earth. It offers means of travel and correspondence between the two realms. It is also the place where the four compass directions unite.\n* It was an All-in-One and One-in-All of limitless being and self - not merely a thing of one Space-Time continuum, but allied to the ultimate animating essence of existence's whole unbounded sweep - the last, utter sweep which has no confines and which outreaches fancy and mathematics alike. It was perhaps that which certain secret cults of earth have whispered of as YOG-SOTHOTH, and which has been a deity under other names; that which the crustaceans of Yuggoth worship as the Beyond-One, and which the vaporous brains of the spiral nebulae know by an untranslatable Sign... - Through the Gates of the Silver Key"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The spiraling tunnel to infinity down all black holes, a corridor where the rules of time and space cease to have meaning. Some theorize that the Vortex is the eye of the storm within [Oblivion] and is the ultimate connection between [Oblivilion] and the [Source].\n* It is said that the World Tree's roots are the [Ley Line]s and its fruit are the stars. It grows up through the [Underworld] and soars into the heavens where it suspends the sky. The World Tree is eternal and is connected through both time and space.\n* The Norns are found here."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Axis Mundi, Chronos, Eye of Harmony, Irminsul, Temporal Zero Point, Tree of Life, Tree of Knowledge of Good and Evil, World Pillar, World Tree, Yggdrasil, Yog-Sothoth")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Inner Realms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Inner Realms"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Periphery consists of a number of Realms that touch the Material Realm.\n* These Realms are forever separated from the mortal world by thin but strong membrane called the Veil.\n* Peripheral Vision - Sometimes a glimse of the Outer Realms may be seen at the edge of normal vision.\n* Gates - Gates are more easily created when both realms resemble each other at both ends of the Gate.\n* Realm Overlay - Sometimes when an area of both realms closely resembles one another, the areas overlap creating a natural Gate of sorts where one may accidentally wander from one Realm to the other without noticing."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Periphery"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Ley Line"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Ley Line"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Ley Lines are invisible, spiritual energy lines that pass through the universe and serve as the branches and roots of the World Tree. The Ley Lines influence the areas they pass through. Their existence transcends time. Contacting the Lines boosts spiritual powers and connects the past and future. They can be tapped to raise magical effects and they can spread the effect of tragic or corrupted areas, creating haunted or cursed areas.\n* Dragons are said to choose exposed Ley Lines as lairs and nests. It is possible that Ley Lines are the secret to their power.\n* Fault Lines and Volcanic activity are side effects of Ley Line power.\n* Ley Line Memories - Ley Lines exist through history, so it is sometimes possible to witness events from the past or future near the lines.\n* Ley Line Filth - When negative energy builds up over time near a Ley Line, so a Ley Line can sometimes leak solid dark energy that is called Filth or Corruption. This Filth corrupts the area, withering plants and contaminating animals and water. Since it is a spiritual corruption, it can only be repaired with purification magic or by somehow confronting and addressing the cause of the corruption."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dragon Lines, Fate Lines, Lines of Power, Threads of Fate, Time Lines")
                      )
                    ),
                    Core.vx_new_string("Digital Realm"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Digital Realm"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Cyberspace, Cyberrealm")
                      )
                    ),
                    Core.vx_new_string("Dreaming, The"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Dreaming, The"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Dreamlands, Dreamworld, Fade, Imaginary World, Nod")
                      )
                    ),
                    Core.vx_new_string("Fade, The"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Fade, The"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Fade is a Mirror Realm that is a sort of Dream Realm but is driven by strong emotions.\n* Fade Curse - A Curse is a spirit that has manifested from strong emotions over a long period of time.")
                      )
                    ),
                    Core.vx_new_string(":Luna"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Luna"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Spirit Realm of the Moon"),
                        Core.f_new(
                          Core.t_msgblock,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":msgs"),
                            Core.f_new(
                              Core.t_msglist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Core.t_msg,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":code"),
                                    Core.vx_new_string(":invalidtagfound"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_location,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("unit")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Hollow World"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hollow World")
                      )
                    ),
                    Core.vx_new_string("Memory Realm"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Memory Realm"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Land of Lost Things, Memory Lane")
                      )
                    ),
                    Core.vx_new_string("Micro Realm"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Micro Realm"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Microverse, Quantum Realm")
                      )
                    ),
                    Core.vx_new_string("Mirrors Realms"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Mirrors Realms"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Alice in Wonderland\n* Kamen Rider Dragon Knight\n* Werewolf the Apocalypse\n* Star Trek - Mirror, Mirror\n* Stranger Things"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Beyond all mirrors lie worlds almost identical to our own but more a reflection of mind than of substance. There are an infinite number of these mirror universes, though each is accessible in a slightly different way."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Alternate Dimensions, Mirrorlands, Mirror Universe, Mirror World, Mirrorverse, Mirrors, The Upsidedown, Twilight Zone")
                      )
                    ),
                    Core.vx_new_string("Negative Realms"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Negative Realms"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Negative Realms are described by coordinates for -x, -y, -z, t (length, height, width, time)\n* The Negative Realms are particular mirrors of the Material Realms. They were created at the same moment that the Material Realms were, but while the Material Realms were mostly filled with normal matter, the Negative Realms were mostly filled with anti-matter."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Anti-matter Universes")
                      )
                    ),
                    Core.vx_new_string("Nexus of Realities"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Nexus of Realities"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Nexus of Realities is a place that touches the [Vortex] and through it all other realities. So near the [Vortex], Time is meaningless here, so anyone entering will feel as if they have been in the Nexus for a very long time and may stay here as long as they want with no wants. When they leave, however, no time will have past and their time spent will be remembered like a dream.\n* Tanelorn - The city Tanelorn has been built at the Nexus and is a sort of waystation for those travelling to other worlds. Tanelorn exists in all inner realms and appears as a simple town native to each reality. One cannot look for Tanelorn for it does not appear on any map, but it can occasionally be stumbled upon by frustrated travellers seeking new horizons. As the existence of Tanelorn can never be proven, it remains a myth throughout the universe."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Tanelorn, Waystation")
                      )
                    ),
                    Core.vx_new_string(":Pangea"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pangea"),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Prehistoric Realm")
                      )
                    ),
                    Core.vx_new_string(":Yuggoth"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Yuggoth"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Spirit Realm of Pluto")
                      )
                    ),
                    Core.vx_new_string(":Shadowland"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Shadowland"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Realm of the recently dead.\n* The Shadowland is a dark [Mirrorland] superimposed on the regular living world. Here, the recently dead (Wraiths) can remain among the living, but they (mostly) cannot interact with the living world. Wraiths are invisible and intangible. They can even walk through solid objects but doing this disrupts the Wraith's energy, damaging it slightly.\n* Noncorporeal Undead - The Shadowlands is the native realm of non-corporeal undead and is where they are strongest.\n* Corporeal Undead - The remnants of the spirits of corporeal undead can be easily seen in the Shadowlands. Corporeal Undead are particularly vulnerable to exorcism or control from Shadowland attackers.\n* The [Veil] separating the Shadowland from the living world is called the Shroud.\n* Many portals lead from here to the [Underworld], but if a [Wraith] loses his connection to the living world, he may not return to the [Shadowlands].")
                      )
                    ),
                    Core.vx_new_string(":Veil"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Veil"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Veil is a barrier between the natural world and the supernatural worlds.\n* The Veil is not only a physical barrier but also has an effect on perception and memory. Those without supernatural abilities who encounter supernatural beings will tend to rationalize the supernatural aspects of the encounter, instead interpretting them as natural phenomenon. They will irrationally deny that any supernatural aspect was involved regardless of the evidence. This quality of the Veil applies to recordings and any other evidence and has kept the mythical status of supernatural beings for millenia."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Gauntlet, Mists, Shroud")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Elemental Air Realm"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elemental Air Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The realm of elemental air is a vast, empty space above the clouds of the world. Here there are no solids or liquids only gases without impurities (e.g. smoke).\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":h'Haarshann"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("h'Haarshann"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Elric of Melnibone"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Wind Elemental Lord")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Elemental Cold Realm"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elemental Cold Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The realm of elemental cold is a vast, barren, snowscape under a sunless sky. Harsh blizzards sweep across the snow that covers the glaciers and frozen seas. There is no heat in this realm.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family.")
                      )
                    ),
                    Core.vx_new_string("Elemental Earth Realm"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elemental Earth Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The realm of elemental earth is a vast, solid space below the surface of the world. It is mostly solid rock, but cave systems, roots, and underground waterways exist as well.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Grome"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Grome"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Elric of Melnibone"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Earth Elemental Lord")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string("Elemental Fire Realm"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elemental Fire Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The realm of elemental fire is a vast volcanic space seemingly from the dawn of the world. It is all lava, and scorching heat. Here, fire is pure without oxygen or smoke or fuel to burn.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family.")
                      )
                    ),
                    Core.vx_new_string("Elemental Lightning Realm"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elemental Lightning Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The realm of elemental lightning is a vast lightning storm lighting up the sky, pounding the ground, and electrifying the seas.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family.")
                      )
                    ),
                    Core.vx_new_string("Elemental Water Realm"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elemental Water Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The realm of elemental water is a vast space deep within the ocean depths of the world.\n* Elementals are generally highly emotional and of low intelligence. This is natural given that they have no need for intelligence in their harsh realm. They do not have cities or wars but are more divided into pods of friends and family."),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Straasha"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Straasha"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Elric of Melnibone"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Water Elemental Lord")
                              )
                            ),
                            Core.vx_new_string(":Pyaray"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Pyaray"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("Elric of Melnibone"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Pyaray is a Chaos Lord who rules the deepest parts of the ocean. He appears as a giant red octopus-like creature, and his soul is kept in a blue crystal on his head. Sailors who drown at sea are taken into his Chaos Fleet. One portent of the end of the world is the ascent of the Chaos Fleet to the surface. Pyaray and Straasha are bitter enemies."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Tentacled Whisperer of Impossible Secrets")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Elysium"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Elysium"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The legendary homeland of the Fae. It is a wonderous place of myth and legend deep in the dream world.\n* Seasons - The Fae realm is driven by the seasons in an eternal cycle of death and rebirth.\n** Spring - \n*** Spring Bloom\n** Summer - \n** Autumn - \n*** Autumnal Harvest\n** Winter - \n* Courts - \n** Seelie Court - \n** Unseelie Court - \n* Archfae - \n* Fae Magic - Though the Fae trade in physical objects like gold or food, these things are actually made of imagination and Fae Magic. For the Fae, magic is the one true currency. Having it and using it is the sign of royalty. Those with no magic have no status and no value."),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Arcadia"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Arcadia"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The capital city of the Fae. It is a land partially of Dream and is not normally accessible to mortals.")
                              )
                            ),
                            Core.vx_new_string("Elysian Forest"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elysian Forest"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The forests of Elysium are filled with living creatures including wild animals, large insects, Sprites, and Pixies.")
                              )
                            ),
                            Core.vx_new_string("Elysian Fields"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elysian Fields")
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
            Core.vx_new_string("Higher Realms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Higher Realms"),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Over Realms"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Celestial Realm"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Celestial Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Powerful beings of order inhabit this Realm. They are not overtly hostile, but they unyielding and have a severe approach to justice that makes one wonder if anyone can survive their scrutiny."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Afterworld, Angelic Realm, Celestine Realm")
                      )
                    ),
                    Core.vx_new_string("Imaginary Space"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Imaginary Space"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Though the story is fictional, as far as the characters are concerned, their fate is real. Therein lies the rub, are you and I the audience or characters on the stage? Nobody can know for sure. Afterall, nothing is easier to fool than the senses. - Furina, Genshin Impact"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Imaginary Realm is the realm of the Mind and of possibilities. It connects all other realms, and some believe all realms are birthed from the infinite potential of the Imaginary Realm.\n* Description - The realm is filled with a glowing mist and motes of crackly energy called Astral Luminaries (Tachyons). Touching a luminary fills one with energy and inspiration, but contacting too many too quickly will overload the body in a violent explosion.\n* Transition - When entering the Imaginary Realm, there is a sudden, frightening sensation of fliping forward and sideways at once and then it is over.\n* Speed - In the Imaginary Realm, the speed of light is the lowest speed that an object can move though due to relativity, the speed of light is effectively zero speed. Here physical objects move at wildly accelerated speeds and can easily become lost or destroyed in the insane speeds and energies of this Realm.\n* Mind and Will - Everyone seems to experience the Imaginary Realm differently with many experiencing wild and terrible hallicinations. Those entering this Realm with just their minds find that their abilities are vastly increased. They appear as an idealized version of themselves with Body equal to Mind and all abilities may use Mind instead.\n* Body - Physical rules barely apply. All resistences use Will instead of Body."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Astral Plane, Astral Realm, Complex Space, Ether, Etheral Plane, Etheral Realm, Hyperspace, I-Space, Imaginary Realm, Subjective Reality, Subspace, Superspace, The Pale, Ultraspace")
                      )
                    ),
                    Core.vx_new_string("Realm of Light"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Realm of Light"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This is an area of space near the center of the Universe. It is said to be based upon lines and angles instead of surfaces and curves, and it is known to be a region of intense and deadly energies. The realm appears much like a negative image of the known Universe with dark stars on a backdrop of intense light. Few organic creatures can survive in this region regardless of defenses, but this is the home of such creatures as the [Radiance] and the [Hounds of Tindalos]."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Tindalos")
                      )
                    ),
                    Core.vx_new_string(":Wyver"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wyver"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wyver is the Creator Being that manifests as a mirror dimension reflecting the world of order.\n* Travel - Creatures of order can enter Wyvr through any reflective surface."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Weaver")
                      )
                    ),
                    Core.vx_new_string(":Wyld"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wyld"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wyld is the Life Bringer Being that manifests as a mirror dimension reflecting the natural world. It is thought that Wyld is the source of all life.\n* The Wild has stunning natural beauty, but is also a merciless place dominated by natural selection.\n* Travel - Natural creatures can enter Wyld through any reflective surface."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Manitou, Wellspring")
                      )
                    ),
                    Core.vx_new_string(":Wyrm"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Wyrm"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Sitting in a bunker, here behind my wall. Waiting for the worms to come. In perfect isolation, , here behind my wall. Waiting for the worms to come. Waiting, to cut out the dead wood. Waiting, to clean up the city. Waiting, to follow the worms. Waiting, to put on a black shirt. Waiting, to weed out the weaklings. Waiting, to smash in their windows and kick in their doors. Waiting, for the final solution to strengthen the strain. Waiting, to follow the worms. - Waiting for the Worms, Pink Floyd"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wyrm is the Time/Destructor Being that manifests as mirror dimension reflecting the world of entropy and  and corruption. Corrupted creatures can enter Wyrm through any reflective surface.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("Lower Realms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Lower Realms"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Those places closest to the very beginning and the final end of the universe."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Under Realms"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Oblivion"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Oblivion"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Leviathan - Hellraiser II\n* The Great Evil - The Fifth Element"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* At the end of the Universe, lies a metaphysical Black Hole, the Anti-Sun: Oblivion.\n* It is null, ultimate order, ultimate death, the beginning and the end of the Universe.\n* Few living beings have managed to survive being close enough to see Oblivion.\n* As the [Underworld] is in many ways the reverse of the living world, Oblivion hangs above the [Underworld] like a massive Sun. Unlike a sun, however, Oblivion devours light and steals warmth. What little light and warmth that exists in the [Underworld] seeps instead from the land of the living.\n* Some believe that through Oblivion lies rebirth, but few are willing to personally put that theory to the test, and none who enter has ever returned."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Abyss, End of All Things, Heat Death of the Universe, Lakhesis, Order, Pattern, Primal Destroyer, Primal Void, The End")
                      )
                    ),
                    Core.vx_new_string("Source, The"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Source, The"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("...I started with loathing when told of the monstrous nuclear chaos beyond angled space which the Necronomicon had mercifully cloaked under the name of Azathoth. - The Whisperer in Darkness"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Source is the bubbling font at the beginning of existence. It lies at the opposite end of all existence from [Oblivion]. The Source is bursting with the densely packed proto matter/energy of all creation in the septillionth of a second before exploding into all realities. It is also, necessarily, the most destructive place in all existence.\n* Sublime - Those who somehow survive entering the Sublime find a very different existence. Where our multiverse is a vast empty space containing trace motes of dust, the Sublime is an endless fountain of possiblities. Everywhere you gaze, the Sublime offers a kaleidescope of intriguing details. Even infinity is meaningless where time, distance, and reality cease to matter.\n* Sublimating - Nothing physical can survive exposure to the Source, but it is possible to transcend the physical and enter Source. This is called Sublimating. There are many magical, spiritual and technological ways to enter the Sublime and entire civilizations have done so. Any who enter the Sublime begin to expand themselves. Absorbing and evolving with each eternal instant. Almost none who enter ever returns regardless of promises or bonds. The few that have returned are very different and almost always quickly return to the Sublime. After being exposed to the endless possiblities of existence, perhaps they no longer see the our existence or our way of understanding our existence as real or important anymore."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Ascension, Azathoth, Atropos, Apep, Apophis, Jormungand (Midgard Serpent), Primal Chaos, The Beginning, The Big Bang, The First Thing, Truth, Sublime")
                      )
                    ),
                    Core.vx_new_string("Tempest, The"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Tempest, The"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* The Galactic Barrier - Star Trek"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The final line before ultimate chaos. A swirling mass of chaos and fear on the border of annihilation.\n* Like a Black Hole, [Oblivion] has a swirling event horizon at its surface. It is the interface between substance and nothingness.\n* The [Tempest] is a sea of souls and madness. The dreams and memories of those lost within sometimes drift like flotsam in the Tempest.\n* The Tempest usually manifests as an roiling ocean, sometimes of water, sometimes of blood or souls.\n* It is rare to see the Tempest calm except in the presence of a [Ferryman].\n* Often it is a storm-tossed sea of towering waves and shrieking winds. Fog, foam, and spray obscures vision and rips the words from ones mouth.\n* Harrowing - [Wraiths] that are destroyed, fall into the sky toward [Oblivion]. Before entering [Oblivion] they pass through the Tempest and find themselves tested. The test is called a [Harrowing] and is always a spiritual confrontation with the [Wraith]'s own weakness. If the [Wraith] passes the test, it will find it has regained the strength to return to the [Underworld]. If it fails, it falls finally and eternally into the cold embrace of [Oblivion]. The appearance of the Tempest during a Harrowing is ever-changing: a drafty dripping dungeon with flagstones and chains, a subway tunnel with flickering buzzing fluorescent lights, a rough-hewn tunnel of sickly pink marble shot through with black veins.\n* Regardless of where one enters, all its twisting maze-like tunnels lead in the same direction: toward the dark heart of [Oblivion]."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Event Horizon, The Great Barrier, The Edge of the World")
                      )
                    ),
                    Core.vx_new_string(":Underworld"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Underworld"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Underworld is a psychic realm of the dead. Similar to the [Dreaming], the Underworld is a Spiritual not a physical place.\n* Appearance - The Underworld seems like an inverted version of the living world. Initially, it appears as a dark, barren landscape with a large, black sun hanging in a cloudy, night sky. On further inspection, however, the dark sun is a black hole, the clouds are floating landscapes, and the night sky is the distant opposite side of what appears to be a hollow world with the black hole in the center.\n* Oblivion - The black hole at the center of the Underworld is [Oblivion], slowly drawing in everything to a final destruction.\n* Terraces - The floating landscapes are formed of spiritual flotsom from ages of dissolved dead. They slowly spiral upward eventually becoming the accretion disk of [Oblivion]. The higher one travels upward the more chaotic and intense the environment becomes until it becomes the [Tempest].\n* Falling - Spirits may travel freely on any surface in any orientation, but 'gravity' is always toward [Oblivion], so things not touching the 'ground' slowly fall upward with increasing speed.\n* Shadowland - Holes in the ground lead through long tunnels to the [Shadowland] above. Those who have lost their connections to their old lives (their fetters) will find that all the tunnels lead back to the Underworld.\n* Time - Time in the Underworld is distinctly different from the living world. Long periods can pass for some while little time has passed for others. Either way, little time passes in the living world compared to the ages that can seem to pass in the Underworld."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Netherworld, Netherrealm, Netherverse, Underrealm, Underverse")
                      )
                    ),
                    Core.vx_new_string("Void, The"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Void, The"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Void is an empty Realm between Realms. It is the Spiritual equivalent to outer space.\n* The Void is a realm of nothingness and contains no matter, energy, atmosphere, magnetism, inertia, gravity, or any other force.\n* Light, sound, and heat do not exist in the Void, but those with Spirits can see and hear normally. They also experience no discomfort despite the harsh conditions. Those without Spirits are blind, deaf, and lost in the endless void.\n* Attributes - Those with Spirits appear as idealistic versions of themselves in the Void. Body, Mind, Spirit, and Speed are increased to the higher of their Mind or Spirit.\n* Speed - As light and inertia do not exist in the Void, vessels may move much faster than light. Those with Spirits may move at astronomical speeds and can move at the equivalent of [Mind] or [Spirit] x 1 Light Day per second.\n* Void Ships - Ships created to travel between the realms. Note: physical travel into the Astral Realm by magical means may only be performed without observers."),
                        Core.f_new(
                          Core.t_msgblock,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":msgs"),
                            Core.f_new(
                              Core.t_msglist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Core.t_msg,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":code"),
                                    Core.vx_new_string(":invalidtagfound"),
                                    Core.vx_new_string(":detail"),
                                    Core.f_new(
                                      Core.t_anymap,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":type"),
                                        Base.t_location,
                                        Core.vx_new_string(":tag"),
                                        Core.vx_new_string("unit")
                                      )
                                    ),
                                    Core.vx_new_string(":severity"),
                                    Core.vx_new_int(2)
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string(":msgblocks"),
                            Core.f_new(
                              Core.t_msgblocklist,
                              Core.t_anylist.vx_new(
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_location,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("unit")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
                                      )
                                    )
                                  )
                                ),
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_location,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("unit")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
                                      )
                                    )
                                  )
                                ),
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_location,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("unit")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
                                      )
                                    )
                                  )
                                ),
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_location,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("unit")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
                                          )
                                        )
                                      )
                                    )
                                  )
                                ),
                                Core.f_new(
                                  Core.t_msgblock,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":msgs"),
                                    Core.f_new(
                                      Core.t_msglist,
                                      Core.t_anylist.vx_new(
                                        Core.f_new(
                                          Core.t_msg,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(":code"),
                                            Core.vx_new_string(":invalidtagfound"),
                                            Core.vx_new_string(":detail"),
                                            Core.f_new(
                                              Core.t_anymap,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":type"),
                                                Base.t_location,
                                                Core.vx_new_string(":tag"),
                                                Core.vx_new_string("unit")
                                              )
                                            ),
                                            Core.vx_new_string(":severity"),
                                            Core.vx_new_int(2)
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
                )
              )
            ),
            Core.vx_new_string("Outer Realms"),
            Core.f_new(
              Base.t_section,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Outer Realms"),
                Core.vx_new_string(":reference"),
                Core.vx_new_string("Event Horizon"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* These are the various part of the Spirit Realm where demons live. It is unclear whether these worlds are in distant parts of our dimension or in other dimensions entirely. They are certainly so distant that only dimensional travel can reach them.\n* Physics are often radically different from our own which often is sanity threatening."),
                Core.vx_new_string(":titles"),
                Core.vx_new_string("Abyssal Realms, Chaos Realms, Demon Realms, Hells"),
                Core.vx_new_string(":locationmap"),
                Core.f_new(
                  Base.t_locationmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Hell of Being Cut to Pieces"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell of Being Cut to Pieces"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Souls who arrive here fall into a sea of razor-sharp blades that spin and cut sinners to shreds.\n* Souls - The domain is a place for those who make a living by violence.")
                      )
                    ),
                    Core.vx_new_string("Hell of Being Skinned Alive"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell of Being Skinned Alive"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* If there is a worse place, no one has yet found it. At a glance it appear as a desert world, but it is infinitely worse. The winds have sculpted the rocks and mesas into horrifying shapes. Those who can see through the sandstorms can see demonic forms torturing souls, but their screams are covered by the winds.\n* The howling winds that forever whip across the red sands are enough to strip flesh from bone. Shards of glass and metal blown on these sonic-velocity winds can penetrate tank armor.\n* The winds frequently become funnel clouds sucking sand and souls miles up before letting them plummet onto the jagged rocks below.\n* The constant motion of wind and sand builds up electric charge, and victims are regularly subjected to bolts of lightning.\n* At first, the winds only flay only the body, but the worst is yet to come. Once flesh and muscle fall from the bones, the very essence of his being begins peeling off, layer by layer to be carried off in the winds. The only peace is when the winds subside, and the flayed bodies regenerate in these precious seconds. But once the pain begins to subside, the winds start howling again...\n* Souls trapped here are often those who hoarded and abused power. Such individuals are tormented after death by having everything ripped from them.\n* Tou Mu - The Yama King, Tou Mu, watches from her enormous upside-down palace high in orbit. Those that the Iron Empress takes note of are drawn up by the winds to the cold silent vacuum above. There she expresses her dissatisfaction personally.\n* Silent Stronghold - Her orbiting palace is where her allies stay, but as Tou Mu is paranoid, the crystal of this place renders unguarded thought into sound which echoes throughout the palace.\n* Sinister Fortress - One of the few structures on the surface of this hell, this iron fortress courses with the lightning that constantly strikes it. On the outer walls are lashed the bodies of those that Tou Mu has taken a special interst. Here they are constantly torn by winds and struck by lightning. The Iron Empress has never removed a victim from the wall since the first traitor was lashed there.")
                      )
                    ),
                    Core.vx_new_string("Hell of Boiling Oil"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell of Boiling Oil"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The name of this hell is a misnomer. The hell is not filled with boiling oil, but rather with rendered human fat. Gobbets of charred and burning fat float atop the ocean of thick, bubbling grease. A dark gray froth of overcooked scum floats to the surface in places.\n* The atmosphere is hazy with brown smoke and a fine mist of grease. The stench is intolerable. Individuals who manage to survive vomit uncontrollably. Those few who manage to leave this realm never entirely rid themselves of the smell.\n* This hell is the place of torment for the gluttonous. Corpulent executives and rotund bureaucrats are haunted by the excesses of their lives.\n* Ruler - This realm is ruled by Hluh, an island-sized, gelatinous, bright red jellyfish with sharp-toothed sucker mouths on each tentacle.\n* Devils - The devils of this have no names, no faces, and no sense of self. They realm resemble chitinous tapeworms or gigantic water striders that skim acoss the surface of the boiling sea.")
                      )
                    ),
                    Core.vx_new_string("Hell of Burrowing Maggots"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell of Burrowing Maggots"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* A quick glance reveals this place to be a vast plain of white sand. There is no sun, but the overcast sky is not dark. The sand, however, is crawling. The stench of decay staggers any so unfortunate as to need to breathe.\n* Souls - This is a place of torment for sinners who have met their end by disease including radiation poisoning, cancer, and biological warfare. Boils and tumors grow enormous here and hang from the body and attract the maggots. Within days a soul can feel her skin crawl. Everywhere the worm-ridden souls cry out, tearing at their skin, and vainly trying to escape the worms that are eating them alive.\n* Ruler - Rangda, the Mistress of Pestilence rules here.\n* Demons - Maggots grow larger as they age. The largest of them are the size of a whale.\n* The Great Beast - What appears to be a large white mountain is actually an enormous carcass of an unknown beast. The maggots have been devouring it since the hell was created, and it appears it will take an eternity to complete the job. What the beast is is unknown. Some believe it is tied to creation and the the universe will cease when it is comsumed. A foolish mage once studied it from a distance, but days later he returned screaming gibberish and only said two coherent words before he took his own life: 'It moved.'")
                      )
                    ),
                    Core.vx_new_string("Hell of Seven Burning Seas"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell of Seven Burning Seas"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* If would be hard to chose a worse fate, burning or drowning. Those souls doomed to this hell do both. They may stay above water and have their garments burst into flame or submerge and boil themselves.\n* Souls - This hell houses sinners whose crimes involve the water. Pirates, polluters, mutineers, and murderers who drowned their victims are drawn here.\n* Ruler - No one has seen the Empress of Pearls who is rumored to live at the greatest depths of the Great Trench where no other creature can survive. Some believe she is a great 'devil-fish' that can cause tsunamis.\n* Devils - Devil crabs, devil sharks, and devil squid are some of the horrors that populate the depths.")
                      )
                    ),
                    Core.vx_new_string("Hell of Upside-Down Sinners"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell of Upside-Down Sinners"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* This domain defies description. This is either the cleverest of the Yomi realms or the maddest hell devised by the sickest of minds. Time and space are inverted. Sensation and thought are twisted. Minutes pass like an eternity and millenia rush by in a blink of an eye. In this hell, the strong perish and the weak survive. That which is dull cuts while sharp objects bring comfort.\n* Souls - Recent arrivals are often driven mad as they begin to see odors, smell sounds, and hear sights. Emotions too become jumbled. Souls begin to hate those who helped them and love those who have done them wrong. They fear the helpless and refuse to flee certain destruction. Skills and powers do not work correctly here. The stronger the ability the more ineffectual it is.\n* Ruler - No one knows what inconceivable creature would create such a realm.")
                      )
                    ),
                    Core.vx_new_string("Hell: Kakuri, The Night Realm"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell: Kakuri, The Night Realm"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* There is no end to the darkness in the Night Realm. There is no sun, no stars. The winds are bitterly cold, bearing dagger-sharp ice crystals. Facing into the wind is blinding. Fires flicker and die in the winds, but any light attracts the tormented and Shikome alike. The terrain is rocky and frozen black crystal that leech the energy of those who rest on them. Meadows and tree exist, but they are covered with dark crytal blades that tear at passersby.\n* Kakuri is the hell of those who have lost their honor. The land is therefore the anti-thesis of honor. There are no great battles, no great challenges, no bragging enemies. There is no duty, no honor, and no way to escape. There are no flesh eating devils, no pits of burning oil, no grand ministries of torment. In a land without hope, there don't need to be.\n* Ruler: Emma-o, perhaps the greatest of the Yama-kings.\n* Shikome: Beautiful, cold, female devils that delight in speeding their victims to despair. They are subtle and can appear as tormented souls or as friends or lovers. Whatever their form, they will drain the [Spirit] from their victims leaving them to wander in hopelessness and despair.\n* Kyuden No Kakuri - The Castle of Kakuri is the stronghold of Emma-o.  It is situated at the top of an unassailable peak. The castle has elaborate obsidian walls and are a testament to his vanity and conceit.\n* Cave of Maidens - One of Emma-o's favored traps, the caves appear an oasis from the icy torment and occasionally a way out of Yomi. Edible fungi, shelter, and pretty prisoners can be found in the caves. The prisoners will dote on the visitors, but they will suddenly accuse them of theft, rape, murder, or worse. The visitors are beaten and driven from the caves. The power of the Shikome lets them trick their victims again and again with the lure of false hope. Amazingly, there is actually a chance that a cave is actually an exit from the Hell, the ultimate lure for lost souls.")
                      )
                    ),
                    Core.vx_new_string("Hell: Pit of Iron and Salt"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell: Pit of Iron and Salt"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Pit is a vast salt mine with seemingly no bottom. Iron citadels dot the inside of the pit, so the pit resembles a great gaping maw with the citadels resembling teeth. The landscape is unchanging and sterile. It is not a place of shock or disgust, but a hell of quiet oppression.\n* Souls - Those who labor here do so in the false hope that through hard work they will eventually be relieved of their suffering. They search for treasure they will never find beneath the lashes of cruel overseers.  Cuts and lashes are inflamed by the salt everywhere.\n* Ruler - Yama-king Wu Hua lives at the the bottom of the pit in a great iron city surrounded by six enormous barbed spires on which hundreds of bodies are impaled. Sputtering greenish fires can be seen from a distance that hint at grotesque rituals and obscene torments, but what exactly goes on inside is unknown.\n* Iron Citadels - The citadels are places of decadence and depravity. The souls are intermittently rotated from the mines to the citadel to act as slaves. Most mine workers view the change as desirable, but every soul chosen learns that this is not the case. In reality, the souls are treated worse here than anywhere else in the domain. Their suffering is more valuable to Wu Hua because it is so much more 'personal'.")
                      )
                    ),
                    Core.vx_new_string("Hell: Wicked City"),
                    Core.f_new(
                      Base.t_location,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Hell: Wicked City"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Wicked City is a place of endless urban blight stretching to the horizon in all directions. The perpetually overcast air is dark and thick with acrid vapors and burning smog. The stench of urine, vomit, blood, and excrement blows out of every alley. The streets and buildings are packed with the souls who mindlessly slave away in inescapable agonies and the power-mad demons who torment them.\n* Souls - This hell is the destination of those who have fallen into the corruption, isolation, and anoymity of urban life. Politicians, artists, criminals, wage slaves, executive, and police are pulled into the sweat shops and dark streets of this doomed megalopolis. The souls are worked beyond their limits, and when they falter or fail the foremen arrive instantly to punish them for their incompetence. Their routine jobs continue day after day with no hope of improving their lot, and their pitiful wages allow them to almost support themselves. Those that fail to keep up are laughed out of their offices and become the homeless of Wicked City, available for demons and embittered salary drones to beat, torture, or set ablaze. There are no safe places in Wicked City. Every coworker could be a demon. Even the doomed may betray each other for advancement. It is a place where the worst elements of greed and capitalism meet.\n* Ruler - The Yama-king Mikaboshi rules this realm from the Mikaboshi Tower. The tower is a hideous tower of blackened steel and glass whose peak disappears into the clouds. Mikaboshi's executives administer Wicked City from this lofty tower, and Mikaboshi himself is often linked directly into the tower's strange devices allowing him to see, hear, and feel any part of Wicked City.\n* Undercity - The twisted spires are built atop the crumbling temples and castles of eras past. The cities are built upon cities upon cities, and the farther down one goes, the more monstrous the demonic inhabitants. Some creatures have not seen the sky in centuries. What these monsters have become is unknown, but no one who has entered the abandoned tunnels and subways has returned sane (if they return at all).\n* Feng Shui - The Yama-king Mikaboshi wants all those who see his city to understand his grand vision of a hellish metropolis. He undermines the known and comfortable trapping of the daily world to increase his subjects' feelings of dread and suffering, and his power over them. The feng shui of the Wicked city is beyond negative, bordering on the impossible. The entire landscape assaults the Chi of the city's victims. 'Poison Arrows' point everywhere, spiraling in directions that cause veritgo from the merest glance. Disharmony saps the will and impedes rational thought.\n* Gates - It is possible to travel to Wicked City from many of the worst urban hellholes in the mortal world. In these places of corruption and anguish, the [Veil] is weak. The door also swings both ways and denizens of this hell sometimes travel to the mortal realm in search of new souls.")
                      )
                    )
                  )
                ),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string(":Pandemonium"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Pandemonium"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* Dante's Inferno"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Pandemonium (literally the Place of All Demons), the capital of Hell, the High Capital, of Satan and his Peers, built by the fallen angels at the suggestion of Mammon. The demons built it in about an hour, but it far surpassed all human palaces or dwellings. It was also reputed to be made of solid gold."),
                        Core.vx_new_string(":titles"),
                        Core.vx_new_string("Pandaemonium, Place of All Demons"),
                        Core.vx_new_string(":locationmap"),
                        Core.f_new(
                          Base.t_locationmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Council-Chamber of Pandæmonium"),
                            Core.f_new(
                              Base.t_location,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Council-Chamber of Pandæmonium"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Stygian Council debates here.")
                              )
                            )
                          )
                        )
                      )
                    ),
                    Core.vx_new_string(":Phyrexia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Phyrexia"),
                        Core.vx_new_string(":reference"),
                        Core.vx_new_string("* We must improve! We must evolve! - Victor, Runeterra\n* Metal is perfection. - Victor, Runeterra"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Yawgmoth"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yawgmoth"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Father of Machines, Ineffable")
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
   * @function chapter_story_ideas
   * @return {chapter}
   * (func chapter_story_ideas)
   */
  public static interface Func_chapter_story_ideas extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_story_ideas();
  }

  public static class Class_chapter_story_ideas extends Core.Class_base implements Func_chapter_story_ideas {

    @Override
    public Func_chapter_story_ideas vx_new(Object... vals) {
      Class_chapter_story_ideas output = new Class_chapter_story_ideas();
      return output;
    }

    @Override
    public Func_chapter_story_ideas vx_copy(Object... vals) {
      Class_chapter_story_ideas output = new Class_chapter_story_ideas();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/fantasy", // pkgname
        "chapter_story_ideas", // name
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
    public Func_chapter_story_ideas vx_empty() {return e_chapter_story_ideas;}
    @Override
    public Func_chapter_story_ideas vx_type() {return t_chapter_story_ideas;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Fantasy.f_chapter_story_ideas();
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_story_ideas() {
      return Fantasy.f_chapter_story_ideas();
    }

  }

  public static final Func_chapter_story_ideas e_chapter_story_ideas = new Fantasy.Class_chapter_story_ideas();
  public static final Func_chapter_story_ideas t_chapter_story_ideas = new Fantasy.Class_chapter_story_ideas();

  public static Base.Type_chapter f_chapter_story_ideas() {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_new(
      Base.t_chapter,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Story Ideas"),
        Core.vx_new_string(":summary"),
        Core.vx_new_string("* Accompany zealots on a pilgrimage to holy places.\n* Participate in a Witch Hunt in the forests.\n* Protect an individual of status from the assassin's guild.\n* Go on patrol with Knife Fighters\n* Sail to obtain concubines, either legally or illicitly. Be wary of the creatures and brutish males, to say nothing of the subtle charms of the concubines themselves.\n* Join the desert scouts in raids against the Black Mystics.\n* Commission tomb raiders to unearth ancient sarcophagi.\n* Sail the far seas in search of adventure, braving corsairs, cannibals, sea serpents, and the black hulled vessels of the Necromancers.\n* Mine green crystal from the Sea of Glass.\n* Visit Sactuary the safe haven of thieves and scoundels.\n* Prowl the jungles looking for rare herbs and black diamonds.\n* Rescue a captive of the Witchmen who keep shrunken heads as grisly trophies.\n* Visit the Ice Castles of the north and fight side by side against the Ice Giants.\n* Trade with the Sea Nomads of Oceanus, a city that floats freely on the water.\n* Take a windship to the isle of Phantas and visit the Cabal Magicus, home of the Phantasian Dream Merchants.\n* Travel to the Jade Empire and visit the capital Tian called the Golden City for good reason.\n* Hire a guide and search for the buried city of Necron where legend has it an entire city and its populace were once interred.\n* Visit the magical fair, a gala festival attended by magicians, wizards, and charaltans from across the continent. Engage in a duel for wagers with a reknowned spell caster or haggle for potions, powders, and other rare items.\n* Negotiate a deal with a Zuran moneylender to finance an expedition in return for a cut of the profits.\n* Attend the Festival of the Bizarre where individuals display oddities and compete in the contest for the title of 'Most Bizarre'.\n* Accompany a Wizard Hunter on a quest of revenge.\n* Partake in the 'Night of Fools' when all laws are suspended for a single evening.\n* Help locate a suitable applicant for the Battle of Champions or enter the competition yourself.")
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
        "nx/tactics/books/fantasy", // pkgname
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
      output = Fantasy.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return Fantasy.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new Fantasy.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new Fantasy.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("Fantasy"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("DaveDormanEasternTerritories.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("Fantasy Overview"),
            Fantasy.f_chapter_fantasy_overview(),
            Core.vx_new_string("Genshin Impact"),
            Fantasy.f_chapter_genshin_impact(),
            Core.vx_new_string("God of War"),
            Fantasy.f_chapter_god_of_war(),
            Core.vx_new_string("Lord of the Rings"),
            Fantasy.f_chapter_lord_of_the_rings(),
            Core.vx_new_string("Nexus Fantasy Characters"),
            Fantasy.f_chapter_nexus_fantasy_characters(),
            Core.vx_new_string("Material Realm"),
            Fantasy.f_chapter_material_realm(),
            Core.vx_new_string("Realms Beyond"),
            Fantasy.f_chapter_realms_beyond(),
            Core.vx_new_string("Story Ideas"),
            Fantasy.f_chapter_story_ideas()
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
    mapfunc.put("chapter_fantasy_overview", Fantasy.t_chapter_fantasy_overview);
    mapfunc.put("chapter_genshin_impact", Fantasy.t_chapter_genshin_impact);
    mapfunc.put("chapter_god_of_war", Fantasy.t_chapter_god_of_war);
    mapfunc.put("chapter_lord_of_the_rings", Fantasy.t_chapter_lord_of_the_rings);
    mapfunc.put("chapter_material_realm", Fantasy.t_chapter_material_realm);
    mapfunc.put("chapter_nexus_fantasy_characters", Fantasy.t_chapter_nexus_fantasy_characters);
    mapfunc.put("chapter_realms_beyond", Fantasy.t_chapter_realms_beyond);
    mapfunc.put("chapter_story_ideas", Fantasy.t_chapter_story_ideas);
    mapfunc.put("tacticsbook", Fantasy.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/fantasy", maptype, mapconst, mapfunc);
  }

}
