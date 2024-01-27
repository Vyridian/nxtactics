package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class Magic {

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
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Magic Overview"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The Art\n\nClassifications\n* Abjuration - Protective Magic.  They create barriers, negate abilities, harm\ntrespassers, or banish those who do not\nbelong.  It includes Barriers and Wards.")
              )
            ),
            Core.vx_new_string("Magical Skills"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Magical Skills"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            ),
            Core.vx_new_string("Magic Items"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("Magic Items"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
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
            )
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
    mapfunc.put("tacticsbook", Magic.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/magic", maptype, mapconst, mapfunc);
  }

}
