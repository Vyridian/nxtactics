'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_books_characters {

  /**
   * @function chapter_cast
   * @return {chapter}
   */
  static t_chapter_cast = {
    vx_type: vx_core.t_type
  }
  static e_chapter_cast = {
    vx_type: nx_tactics_books_characters.t_chapter_cast
  }

  // (func chapter_cast)
  static f_chapter_cast() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Cast",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Memorable Characters",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Memorable Characters", ":summary", "* When creating characters, it is helpful to have at least one unique detail that makes that character\nsingulary memorable. In the future, this may be the one thing that players remember about the character\nand can bring back memories by itself. Be careful to avoid sterotyping, because that will defeat the\nuniqueness you need and risks making the character cartoonish (unless that is what you are going for)."),
        "Stock Characters",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Stock Characters", ":summary", "* Boy Scout - How can a corrupt police force uphold justice?\n* Devoted Sidekick - You're going to need help, and I'm coming with you.\n* Elitist - We're the ones who matter and everyone else can go to hell!\n* Femme Fatale - I'm not very good at flirting.  I don't usually talk to men unless I'm really interested.\n** All curves inside and out, there's nothing simple about the Femme Fatale.  At times bold and brassy, other times\nvulnerable and frightened, she's always in control and always utterly deadly, but most victims don't realize until it\nis too late.\n* Hard Nosed Cop - I don't care if the cuffs are too tight.  They're supposed to be.\n* Has-Been - I used to be able to do that, but I haven't tried in years.\n* Manipulator\n* Innocent Victim - My shop...my house!  How am I going to live?  That thing took everything I had.\n* Inscrutable Stranger\n* Not-So-Innocent Victim - I didn't mean I would ACTUALLY kill him.  It was a figure of speech!  And now look what he\ndid!  Who is going to pay for this?\n* Lover - Come home in one piece, ok?  I love you.\n* Plucky Bystander - What the hell was that?  Nevermind.  Hey, you're bleeding.  Wrap this around your arm and keep\npressure on it.  I'll watch the door, ok?\n* Rival\n* Seducer - Come on, you can get away for one night.  You have to see this place.  It's stunning, and the people!  So\nfriendly.  It's just something you have to see.\n* Smooth Talker - I could call the super for the key.  I'm sure he won't mind coming in at this hour.  He is a kind old\nman even if the stroke did change him.\n* Sullen Detective - Leave him here.  A loser like him'll get picked up for something eventually.\n* Thrill-Seeker - Here, try this: First throw the parachute out, count to five, then jump out after it, without a\njumpsuit!\n* Turncoat - I informed the Supervisor that progress is virtually nonexistant.  He was very impressed with my proposal\nto get things back on schedule.  He should be here momentarily to discuss it.")
      )
    )
    return output
  }

  /**
   * @function chapter_character_archetypes
   * @return {chapter}
   */
  static t_chapter_character_archetypes = {
    vx_type: vx_core.t_type
  }
  static e_chapter_character_archetypes = {
    vx_type: nx_tactics_books_characters.t_chapter_character_archetypes
  }

  // (func chapter_character_archetypes)
  static f_chapter_character_archetypes() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Character Archetypes",
      ":summary",
      "* Antihero\n* Bad Boy\n* Bumpkin\n* Coutier - Politics, Etiquette, Psychology, Fashion\n* Crafter\n* Damsel\n* Fatalist - Nihilist\n* Fool\n* Grotesque\n* Hermit\n* Knight in Shining Armor\n* Mysterious\n* Orchid - Pampered Life\n* Outlaw\n* Peacock - Showoff\n* Rake - Pleasure seeker\n* Regent - Leader\n* Rogue\n* Sage\n* Saint\n* Savage\n* Trickster - Riddler\n* Troubadour\n* Wayfarer - Wanderer\n* Wretch",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Warrior Classes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Warrior Classes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Gladiator",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Gladiator", ":summary", "* Preferred Skills: [Melee Combat]:Spears, Flexible Weaponry, [Close Combat]:Grappling, [Athletics],\n[Evasion]"),
            ":Knight",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Knight"),
            "Martial Artist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Martial Artist", ":summary", "* Preferred Skills: [Close Combat]:Martial Arts, [Evasion], [Acrobatics]"),
            ":Paladin",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Paladin"),
            ":Ranger",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Ranger", ":summary", "* Preferred Skills: [Ranged Combat]:Archery, [Hunting], [Forestry], [Riding]"),
            ":Samurai",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Samurai", ":summary", "* Preferred Skills: [Melee Combat]:Swords, [Ranged Combat]:Archery, [Riding], [Evasion]"),
            ":Soldier",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Soldier", ":summary", "* Preferred Skills: [Melee Combat], [Military], [Armor]"),
            ":Warrior",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Warrior", ":summary", "* Preferred Skills: [Melee Combat], [Armor], [Riding]")
          )
        ),
        "Rogue Classes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Rogue Classes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Assassin",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Assassin", ":summary", "* Preferred Skills: [Assassination], [Ranged Combat]:Thrown Weapons"),
            ":Bard",
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_unit},
              ":name",
              "Bard",
              ":summary",
              "* There is magic in music, song, and story.  The Bard has learned that a story properly told can make a frightened\nman brave or a starving man strong.  The rhythm of his speech, the cadence of his tone, and the lilt of the melody\nall weave a pattern of the skilled Bard's choosing.\n* Bardic training allows a Bard to remember and recite almost every story or song they have heard.  For this\nreason, Bards are vast storehouses of knowledge, but their information often blurs reality and fiction.\n* Bards are generally wanderers, traveling from town to town spreading ideas (creating dissent or harmony)\nwherever they go.\n* Preferred Skills: [Performance]:Music, [Deception], [Persuasion], [Knowledge], [Stealth]",
              ":unitskillmap",
              vx_core.f_new(
                {"any-1": nx_tactics_base.t_unitskillmap},
                ":Stealth",
                vx_core.f_new({"any-1": nx_tactics_base.t_unitskill}, ":name", "Stealth")
              )
            ),
            ":Charlatan",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Charlatan", ":summary", "* Preferred Skills: [Performance], [Deception]"),
            ":Ninja",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Ninja", ":summary", "* Preferred Skills: [Assassination], [Melee Combat], [Deception], [Stealth]"),
            ":Rogue",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Rogue", ":summary", "* Preferred Skills: [Crime], [Close Combat]:Knives, [Deception], [Stealth]"),
            ":Scout",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Scout", ":summary", "* Preferred Skills: [Scouting]"),
            ":Spy",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Spy", ":summary", "* Preferred Skills: [Espionage], [Scouting], [Stealth]"),
            ":Thief",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Thief", ":summary", "* Preferred Skills: [Thrown Weapons], [Deception]:Thievery, [Mechanics], [Climbing], [Acrobatics], [Scouting], [Stealth]")
          )
        ),
        "Mentalist Classes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Mentalist Classes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Illusionist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Illusionist"),
            ":Mentalist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Mentalist")
          )
        ),
        "Spiritualist Classes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Spiritualist Classes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Druid",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Druid", ":summary", "* Preferred Skills: [Nature Magic], [Herbalism], [Aeromancy]"),
            ":Monk",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Monk", ":summary", "* Preferred Skills: [Martial Arts]:Striking, [Mind Over Body]"),
            ":Priest",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Priest"),
            ":Shaman",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Shaman"),
            ":Witch/Warlock",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Witch/Warlock"),
            "Witch Doctor",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Witch Doctor")
          )
        ),
        "Wizard Classes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Wizard Classes",
          ":unitmap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_unitmap},
            ":Alchemist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Alchemist"),
            ":Artificer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Artificer"),
            ":Elementalist",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Elementalist", ":summary", "* Preferred Skills: Elemental Magic"),
            ":Necromancer",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Necromancer"),
            ":Sorceror",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Sorceror"),
            ":Wizard",
            vx_core.f_new({"any-1": nx_tactics_base.t_unit}, ":name", "Wizard")
          )
        )
      )
    )
    return output
  }

  /**
   * @function chapter_characters_overview
   * @return {chapter}
   */
  static t_chapter_characters_overview = {
    vx_type: vx_core.t_type
  }
  static e_chapter_characters_overview = {
    vx_type: nx_tactics_books_characters.t_chapter_characters_overview
  }

  // (func chapter_characters_overview)
  static f_chapter_characters_overview() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Characters Overview",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Why Tactics: Characters and Stories?",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Why Tactics: Characters and Stories?")
      )
    )
    return output
  }

  /**
   * @function chapter_creating_characters
   * @return {chapter}
   */
  static t_chapter_creating_characters = {
    vx_type: vx_core.t_type
  }
  static e_chapter_creating_characters = {
    vx_type: nx_tactics_books_characters.t_chapter_creating_characters
  }

  // (func chapter_creating_characters)
  static f_chapter_creating_characters() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Creating Characters",
      ":summary",
      "* Attributes\n* Skills\n* Equipment\n* Personality\n* History\n* Friends and Family\n** Dependents\n* Enemies\n** Hunted",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Friends and Family",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Friends and Family",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Adult",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Adult"),
            ":Animal",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Animal"),
            ":Child",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Child"),
            ":Couple",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Couple"),
            ":Co-worker",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Co-worker"),
            "Emergency Worker",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Emergency Worker"),
            ":Family",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Family"),
            ":Friend",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Friend"),
            ":Kid",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Kid"),
            "Love Interest",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Love Interest"),
            ":Pet",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Pet"),
            ":Relative",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Relative"),
            "Senior Citizen",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Senior Citizen"),
            "Store Employee",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Store Employee"),
            ":Teenager",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Teenager")
          )
        ),
        "Character Rules",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Character Rules",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Beast",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Beast", ":reference", "* The Krell forgot one deadly danger - their own subconscious hate and lust for destruction. The beast. The\nmindless primitive! - Morbius, Forbidden Planet\n* Guilty! Guilty! My evil self is at that door, and I have no power to stop it! - Morbius, Forbidden Planet", ":summary", "* Caged Beast - The Beast is a savage, nearly mindless, latent personality. It is normally powerless, contained by the [Mind] in civilized men. It can, however, gain power and even dominance in those with weak minds or those who cultivate it such as from [Berserker], [Lycanthropy], or [Vampirism].\n* Succumb to the Beast - Whenever a unit's [Mind] is reduced to 0 or is lowered below its Beast rating, roll Beast vs. [Mind]. If the Beast wins, it gains control of the unit until [Mind] exceeds Beast again (if ever).\n* Fight or Flight - While the Beast is dominant, the unit gains +1 to all Melee or Close Combat attack rolls. It also always uses its Beast rating instead of [Mind]. Unfortunately, it may only use [Physical Skills]. When in combat, it will always attack the closest target (friend or foe) with Melee or Close Combat. Because the Beast is easily surprised, all [Retreat]s against it are doubled.", ":titles", "Id, Reptile Brain, Yang"),
            ":Shadow",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Shadow", ":reference", "* Hello darkness, my old friend. I've come to talk to you again. - Simon and Garfunkle, Sound of Silence\n* Anyone who fights with monsters should take care that he does not in the process become a monster. And if you gaze for long into an abyss, the abyss gazes also into you. - Friedrich Nietzsche, Beyond Good and Evil\n* Hannibal Lecter\n* Even if I wanted to go, my schedule wouldn't allow it. 4:00, wallow in self pity; 4:30, stare into the abyss; 5:00, solve world hunger, tell no one; 5:30, jazzercize; 6:30, dinner with me - I can't cancel that again; 7:00, wrestle with my self-loathing... I'm booked. Of course, if I bump the loathing to 9, I could still be done in time to lay in bed, stare at the ceiling and slip slowly into madness. But what would I wear? - Grinch, The Gringe Who Stole Christmas\n* If once you start down the dark path, forever will it dominate your destiny - Yoda, Star Wars: The Empire Strikes Back\n* A farmer comes home one day to find ... everything that he loved, taken from him. His children. One can only 	imagine the pit of despair, the hours of Job-like lamentations, the burden of existence. He makes a promise to 	himself in those dark hours. A life's work erupts from his knotted mind... Years go by... The farmer, who is no longer a farmer, sees the wreckage that he has left in his wake. It is now he who burns. It is he who slaughters, ... and he knows in his heart, he must pay. - Red Reddington, The Blacklist\n* No one escapes their shadow. - Zed, Runeterra\n* When I find out someone murdered an innocent person, or sold somebody heroin, or did some graffiti, and I kill that person with my bare hands, their eyeballs popping out of their skulls... You think THAT gives ME pleasure?... Well, it does!... What separates us from the other killers, is we only kill bad people. Usually... Unless there's a mistake. Now, do I sound like a fucking maniac? - Vigilante, Peacemaker", ":summary", "* Lurking Shadow - The Shadow is a devious, sociopathic, latent personality. It is normally powerless, surpressed by the [Spirit] in civilized men. It can, however, gain power and even dominance in those with weak wills or those who cultivate it such as from [Corruption], [Darkness], [Fleshcraft], [Intimidation], or [Necromancy].\n* Cruel and Unusual - The Shadow silently observes all that the person experiences. It has nothing but contempt for others as well as the [Spirit] that keeps it contained. As the manifestation of the unit's dark dreams, twisted desires, and bizarre megalomania, the Shadow reinforces its own superiority by exerting power over others. Manipulating, dominating, and causing physical or emotional pain is a siren's call that the Shadow cannot\nrefuse.\n* Consumed by Shadow - Whenever a unit's [Spirit] is lowered to 0 or below its Shadow rating, roll Shadow vs. [Spirit]. If the Shadow wins, it gains control of the unit until [Spirit] exceeds Shadow again (if ever).\n* Rising Shadow - While the Shadow is dominant, the person always uses its Shadow rating instead of [Spirit]. The Shadow will always act toward its, usually immediate, self interest. It will usually not aid its allies in any way. Because the Shadow is self absorbed, all [Retreats] against it are doubled, but failure feeds its insecurities, so retreat is emotionally devastating and can lead to the [Spirit] taking charge again.", ":titles", "Darkness, Darkside, Pedophile, Sadist, Serial Killer, Sociopath, Yin"),
            ":Banality",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Banality", ":summary", "* Banality is the grip of the mundane, day-to-day world. It is the opposite of Art and creativity. Banality\nencourages us to perform mindless, repetitive tasks without creativity or expression. Watching television is\nthe ultimate expression of Banality.\n* If Banality exceeds [Spirit], all Artistic or Magical skills are reduced by the difference between Banality and [Spirit].")
          )
        ),
        ":Personalities",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Personalities", ":summary", "Positive\n* Adventurous - Someone who is adventurous enjoys adventure and takes risks.\n* Affectionate - Someone who is affectionate shows their love for other people.\n* Ambitious - A person who is ambitious wants to be successful in their career, studies, sport.\n* Brave - A brave person wants to do difficult or challenging things and is not afraid.\n* Chatty - Someone who is chatty enjoys talking to other people a lot.\n* Cheerful - A cheerful person smiles a lot and is happy.\n* Confident - Confident people feel sure about their own ability and present themselves well to other people.\n* Creative - Someone who is creative is very good at designing or making things.\n* Determined - A determined person makes a definite decision and does not give up.\n* Easy-going - Someone who is easy-going is quite relaxed and accepts things as they are.\n* Enthusiastic - Someone who is enthusiastic shows lots of interest in something and is very positive about it.\n* Frank - Someone who is frank is honest and direct in what they say.\n* Friendly - A friendly person always talks to other people and perhaps helps them too.\n* Funny - Someone who is funny makes people laugh.\n* Generous - A generous person is kind to other people, may give presents or lend money.\n* Hard-working - Someone who is hard working always puts a lot of effort into their work.\n* Helpful - A helpful person is always happy to help other people.\n* Honest - An honest person tells the truth and never steals or cheats.\n* Imaginative - An imaginative person has good ideas or is good at creating stories or artwork.\n* Intelligent - Someone who is intelligent is good at learning. This person may think about things in a logical way.\n* Kind - A kind person cares about other people and behaves positively towards them.\n* Loyal - Someone who is loyal will always support his or her friends.\n* Meticulous - A meticulous person pays careful attention to detail, probably has a tidy house and neat handwriting!\n* Modest - Someone who is modest does not show off about his or her abilities or possessions.\n* Optimistic - An optimistic person has a positive view of life and expects good things to happen.\n* Outgoing - An outgoing person is very sociable.\n* Patient - Someone who is patient does not get annoyed or frustrated easily and has time for other people.\n* Reliable - A person who is reliable can always be trusted to do what is required.\n* Sensible - A person who is sensible makes decisions based on reason/logic, does not take risks.\n* Sensitive - A sensitive person is very aware of other people’s feelings, can be easily hurt emotionally\n* Sincere - A sincere person is honest in their relationships with others and says what they think or feel.\n* Sociable - Someone who is sociable loves chatting with other people.\n* Sympathetic - Someone who is sympathetic understands other people’s problems very well.\n* Thoughtful - Someone who is thoughtful always thinks of other people, remembers birthdays and sends a card!\n* Trustworthy - A trustworthy person is someone you can rely on to be honest.\n\nNegative\n* Arrogant - An arrogant person thinks they are very important and behaves in a overly proud way.\n* Big-headed - Someone who is big-headed talks a lot about how good they are, this person is too proud.\n* Bossy - A bossy person is always telling other people what to do.\n* Childish - Someone who is childish is silly or behaves like a child when they should behave like an adult.\n* Clumsy - A clumsy person knocks things over a lot and is not careful.\n* Cruel - Someone who is cruel is extremely unkind to other people or animals.\n* Defensive - Someone who is defensive behaves in a way that suggests they believe other people are criticising them.\n* Dishonest - A dishonest person tells lies or tricks other people.\n* Fussy - A fussy person wants everything to be done in a particular way, they are picky/choosy.\n* Grumpy - Someone who is grumpy is easily annoyed, in a bad mood.\n* Gullible - It is easy to trick someone who is gullible. This person believes something that most people would not believe, being naive\n* Impolite - An impolite person is rude.\n* Inconsiderate - Someone who is inconsiderate does not think about other people, quite selfish.\n* Indecisive - An indecisive person finds it difficult to make decisions.\n* Inflexible - Someone who is inflexible is unwilling to change their opinion or the way they do things.\n* Insecure - An insecure person does not have confidence in themselves or their relationship with other people.\n* Jealous - A jealous person feels angry or unhappy because they wish they had something that somebody else has.\n* Lazy - A lazy person does not work hard.\n* Mean - Someone who is mean is unkind.\n* Moody - A moody person is bad-tempered or has frequent mood changes.\n* Narrow-minded - A narrow-minded person is not willing to listen to the ideas or opinions of others.\n* Nasty - A nasty person is very unkind.\n* Pessimistic - Someone who is pessimistic has a negative view of the future and expects bad things to happen.\n* Pretentious - Someone who tries to look or sound more important or clever than they are.\n* Rebellious - Someone who is rebellious does not follow the rules.\n* Rude - A rude person is not polite or does not respect other people.\n* Quick-tempered - Someone who is quick-tempered becomes angry very easily.\n* Self-centered - A person who is self-centred only thinks about himself or herself.\n* Selfish - Selfish people think only about themselves and not about other people.\n* Stubborn - Someone who is stubborn does not easily change their mind.\n* Sulky - If someone is sulky they show their bad mood by not speaking.\n* Tactless - A tactless person does not show sensitivity to others in what they say, not diplomatic.\n* Unpleasant - An unpleasant person is not nice.\n* Unreliable - An unreliable person cannot be trusted or relied upon.\n* Vain - Someone who is vain is too concerned about their appearance or abilities.")
      )
    )
    return output
  }

  /**
   * @function chapter_props
   * @return {chapter}
   */
  static t_chapter_props = {
    vx_type: vx_core.t_type
  }
  static e_chapter_props = {
    vx_type: nx_tactics_books_characters.t_chapter_props
  }

  // (func chapter_props)
  static f_chapter_props() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new({"any-1": nx_tactics_base.t_chapter}, ":name", "Props")
    return output
  }

  /**
   * @function chapter_sets
   * @return {chapter}
   */
  static t_chapter_sets = {
    vx_type: vx_core.t_type
  }
  static e_chapter_sets = {
    vx_type: nx_tactics_books_characters.t_chapter_sets
  }

  // (func chapter_sets)
  static f_chapter_sets() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Sets",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        "Foreign Lands",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Foreign Lands", ":summary", "* Exotic locales can help support a sense of adventure.  Familiar landmarks can form an interesting backdrop to the\naction.\n* Different locations separate the characters from their normal resources and patterns.  The area they are in may also\nbe particularly hostile to them as well.\n* Examples: Egypt, Mexico, Siberia, Niagara Falls, Baghdad, the White House, Tibet, Peru, the London Underground, Hong\nKong markets, the Great Barrier Reef, Aztec ruins.\n* Remember getting there is half the fun, and getting out is twice as hard."),
        "Alien Environments",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Alien Environments", ":summary", "* Beyond traditional locations are the truly bizarre locations.\n* Examples: Underwater, polar ice caps, deserts, volcanos, lightless caverns, sunken ships, outer space, other times,\nthe [Void], the [Underworld], Hell."),
        ":Buildings",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Buildings", ":summary", "* Abbey\n* Academy\n* Aqueduct\n* Archaeological Dig\n* Archive\n* Arena (of the Ancients)\n* Asylum\n* Aviary\n* Bar\n* Basilica\n* Bazaar\n* Beastiary\n* Belfry\n* Bridge\n* Campsite\n* Cantina\n* Castle\n* Cathedral\n* Cemetery\n* Citadel\n* City (of Brass, Forbidden, Forsaken, Sunken)\n* Cloister\n* Coliseum\n* Crematorium\n* Crypt\n* Encampment\n* Estate\n* Fort\n* Fortress (Dwarven, Elven, Ice)\n* Foundry\n* Fountain\n* Furnace\n* Garrison\n* Graveyard\n* Guildhouse\n* Haven\n* Hold (Dwarven)\n* Home\n* House\n* Keep\n* Laboratory\n* Library (of Alexandria)\n* Lighthouse\n* Lodge\n* Market (Black)\n* Marketplace\n* Mausoleum\n* Mine (Copper, Diamond, Gold, Silver)\n* Outpost\n* Palace\n* Palisade\n* Parapet\n* Parthenon\n* Port\n* Prison\n* Pyramid\n* Quarry\n* Rampart\n* Rectory\n* Reliquary\n* Ruins (Dwarven, Elven)\n* Sacred Ground\n* Sanctum\n* School\n* Shrine\n* Stadium\n* Standing Stones\n* Storehouse\n* Stronghold (Mountain)\n* Tavern\n* Temple\n* Tomb\n* Tower (Costal, Ivory)\n* Town (Square)\n* Township\n* Trade Route\n* Trading Post\n* Vault\n* Villiage\n* Wall (Great)\n* Watchtower\n* Well\n* Woodlot"),
        "Character Places",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Character Places", ":summary", "* Archipelago\n* Atoll (Coral)\n* Basin (Jungle)\n* Bay\n* Bog (Peat)\n* Boneyard\n* Burrow\n* Chasm (Glacial)\n* Cave\n* Cavern\n* Canyon (Box, Winding)\n* Cliffs\n* Cove\n* Crater (Meteor, Smouldering)\n* Crevice\n* Delta (River)\n* Den\n* Desert\n* Dust Bowl\n* Everglades\n* Fissure\n* Flats (Salt)\n* Foothills\n* Forest (Petrified)\n* Garden\n* Glacier\n* Gorge\n* Graveyard (Elephant)\n* Grotto\n* Grove\n* Heath\n* Hellhole\n* Highlands\n* Hive\n* Irrigation Ditch\n* Island\n* Isle\n* Marsh (Salt)\n* Mesa\n* Mire\n* Oasis\n* Orchard\n* Peninsula\n* Pit (Bottomless, Breeding, Tar)\n* Plateau (Leng)\n* Pool (Reflecting, Spawning)\n* Prairie\n* Ridge\n* River (Underground)\n* Scrubland\n* Steppe\n* Thicket\n* Trench\n* Vale\n* Valley\n* Vein (Crystal)\n* Vineyard\n* Void\n* Volcanic Vent\n* Volcano (Dormant)\n* Vortex\n* Warren\n* Wasteland\n* Wastes (Forgotten, Forsaken)"),
        ":Settlement",
        vx_core.f_new({"any-1": nx_tactics_base.t_section}, ":name", "Settlement", ":summary", "* Settlement Level describes the general size of a settlement.  It determines the level of resources that can be\nbought and sold and the availability of exotic resources.\n\nTitles\n* Nomadic Tribe - Level 1\n* Town - Level 4\n* Large Town - Level 6\n* Small City - Level 8\n* City - Level 10\n* Metropolis - Level 12\n* Urban Sprawl - Level 14\n* Planetary Sprawl - Level 16\n* Galactic Empire - Level 20")
      )
    )
    return output
  }

  /**
   * @function chapter_storytelling
   * @return {chapter}
   */
  static t_chapter_storytelling = {
    vx_type: vx_core.t_type
  }
  static e_chapter_storytelling = {
    vx_type: nx_tactics_books_characters.t_chapter_storytelling
  }

  // (func chapter_storytelling)
  static f_chapter_storytelling() {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_chapter},
      ":name",
      "Storytelling",
      ":summary",
      "* As Storyteller you're part artist, part writer, and mostly editor. You design\nthe overall plots and subplots, draw out the backgrounds, design the greater part\nof the cast and improvise dialog as the story goes. By describing the world\naround them, you help to define the characters. Daunting? Sure. But it's not as\nimpossible as it sounds.\n* Don't try to win. Tell a story - Storytelling isn't about winning and losing.\nIt is about drama and interaction. Trying to meet objectives is just a device to\nachieve drama. A story may be more interesting if the objective is failed.\n* Players are not your opponents - It is important to remember that the players\nand storyteller are both responsible for creating an interesting story.\n* Don't try to maintain control - Instead of a detailed plot, try to create\ndetailed situations that will play out without the characters' involvement. Then\nlet the players make their own decisions. The storyteller sets up the situation\nand the sets and props. The players do the acting. Test yourself by not talking\nevery once in a while and listen to the players. If they go silent waiting for\nyou, then something is wrong. If they are deeply interacting with one another\nand haven't noticed your silence, you are doing it right.\n* Understand the Players - Some play to gain a sense of power, others for the\nsocial aspects of being with friends, and others as a means of wish fulfillment.\nSome prefer fighting deadly foes, others prefer puzzles and riddles, others\nsimply enjoy talking in character and engaging in political infighting or witty\nrepartee. All of these desires must be juggled and given some space in the game.\nSome players are vocal and aggressive while others are shy or have trouble\nputting their ideas into words.\n* Offer Variety - Luckily juggling different player needs provides variety and\na change of pace. Switching from action to drama to tragedy to comedy provides\ndepth and realism to the story. Life never stays the same after all. Be sure\nto vary the focus of the game onto each player. Some players will regularly take\nthe focus themselves while you must steer the story toward other players by\nallowing them to notice things the busier players miss or by revolving plot\npoints around skills or special knowledge that only some players possess. If\nplayers become bored, the story will die.",
      ":sectionmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_sectionmap},
        ":Roleplaying",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Roleplaying",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Troupes",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Troupes", ":summary", "* Optional Rule\n* Instead of playing a single character, each player controls several\ncharacters of different types, selecting the most appropriate for the given\nsituation. This can free the Storyteller from roleplaying theses characters\nwhile giving the player more opportunity to vary their playsstyle.\n* This rule can be particularly appropriate when there are few players or a\nnumber of lesser follower characters.")
          )
        ),
        "Story Elements",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Story Elements",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Theme",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Theme", ":summary", "* This is a short phrase that encompasses the core idea behind the Story. If all elements of the Story\nsupport the Theme, then the Story can maintain meaning and depth. There may be more than one theme in\na Story which can bring each into sharper focus and provide greater resonance. Even themes working at\ncross-purposes can strengthen each other through their juxtaposition.\n* Good execution of a Theme should be fairly subtle, so the players don't see a grand plan until they\nlook back.\n* Examples:\n** Isolation/Alienation\n** Fall and Redemption\n** Hero's Journey\n** Love Conquers All\n** Power Corrupts\n** Science Dehumanizes\n** We must all work together to survive\n** Family Ties\n** Romance - Arthur, Lancelot, and Guinevere, Tristan and Isolde\n** Wonder - Children share a hope and belief that they are immortal and that wishing on a star can\nmake anything happen. Recreate that wonder.\n** Nightmares - Identical and opposite to Wonder, Nightmares hold fears darker than reality. Recapturing\nthe magic of Nightmares is just as powerful as Wonder.\n** Tragedy\n** Freedom/Wildness - A sense of freedom can be exhilarating, but some beings cannot tell the difference\nbetween creative and destructive behavior.\n** Madness - What happens when a character's differences are not understood by those they trust? Lack of\nacknowledgement from others leads to self-doubt and internalization. This can lead to isolation or\nirrational behavior which can potentially lead to madness. Madness can take many forms and can result in\nbeing manipulated, villainy, destruction, institutionalization, homicide, or suicide. The challenge to\nmadness is can the downward spiral be interrupted before it is too late. Many of the greatest villains\nwere potentially good people but for their madness.\n** Humor - Humor can be light or dark and is always a useful way to relieve the tension and avoid a\nstory becoming overly serious while creating a new opportunity for tension to build."),
            ":Mood",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mood", ":summary", "* Mood represents the emotional tone of the Story.  If the players can relate to their characters\nemotionally, the world will become much more vivid. Ideally never mention the intended mood but instead\ntake every opportunity to subtly reinforce it again and again.\n* First impressions are important, so try to establish mood early using music, lighting, sound effects,\nor tone of voice. Maintaining mood can be more difficult than establishing it. Players will often\nbreak tension or speak out of character. They may intend to break the mood, so just try to ignore these\nand carry on.\n* Examples include Awe-inspiring, Bawdy, Brooding, Carefree, Comical, Dark, Dreadful, Fearful, Hopeful,\nHorrific, Merry, Ominous, Paranoid, Tragic"),
            ":Sound",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Sound", ":summary", "* Music is an almost mandatory part of roleplaying. It adds extra flavor to the game\nand needs only minimal preparation. The choice of music is up to the group but it\nshould be fast paced and stimulating unless more specific mood music would be in\norder.\n* Other sound effects can have an amazing effect when properly timed. A simple\nsound effects machine can be very useful."),
            ":Setting",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Setting", ":summary", "* Setting encompasses the backdrops and environments where the Story takes\nplace.\n* Some extra thought should be paid when choosing locations and detailing\nthem to be rich unique atmospheres.\n* Avoid overly sterotypical locations and try to lavish them with subtle\ndetails including light, color, open space, background noise, music, smell,\ntemperature, touch, taste. Each location should also have one particularly\nmemorable feature that is subtly reinforced.\n* Metaphors and similes are good ways to express details and tone.\n* Setting Ideas: Penthouse, Mansion, Yacht, Cruise Ship, Social Club, Restaurant,\nBar, Theater, Sporting Event, Shopping Center, Amusement Park, Carnival, Circus,\nMovie Set, TV Studio, Park, Zoo, Brothel, Casino, Gambling Club, Slaughterhouse,\nGraveyard"),
            ":Conflict",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conflict", ":summary", "* Every Story involves some sort of conflict. Something opposes the characters goals or there is no point to\nthe Story. No one cares about a girl who walks to the store and buys a loaf of bread, but if the girl is\na starving orphan trying to feed her younger siblings and she makes her way through a snowstorm despite\na broken leg, we are more likely to pay attention.\n* Conflict may involve enemies, the environment, other players, themselves."),
            ":Intrigue",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Intrigue", ":reference", "* The greatest trick the devil ever pulled was convincing the world he didn't exist - Verbal Kint, The Usual Suspects", ":summary", "* Everyone has an agenda. Sometimes that agenda is obvious. Sometimes a person is unaware of what drives him/her. Even without secret agendas, the interaction between peoples goals are complex and subtle.\n* Some ambitious people will use secret agendas and plots to further their goals. When others run afoul of these plots, they may find unexpected conflict or unwittingly become a pawn in someone else's game.\n* The most successful plots are never detected. They are shielded by false goals and red herrings."),
            ":Suspense",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Suspense", ":summary", "* What is Suspense?\n				** The feeling of uncertainty, anxiety, and anticipation felt while waiting for a specific outcome.\n				** Creates a sense of mystery and urgency\n				** Makes the audience wonder and worry about the characters' futures\n				* How to create Suspense?\n				** Promise disaster. Send a signal that something bad can or will happen.\n				** Make the audience wait for resolution. But don't have them sitting around. Have them actively doing something while disaster approaches. This can be directly toward the disaster or a frustrating tangent.\n				** Deliver the outcome. Good or bad whatever happens, disaster may strike, the characters may get to safety. Either way, make sure there is a clear payoff."),
            ":Prologue",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Prologue", ":summary", "* Some Stories may benefit from a brief side Story that sets the tone, describes history, brings the players together.\n* Prologues can take place long before the events of the main story."),
            ":Plot",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Plot", ":summary", "* The Beginning - The Story introduces the [Setting] and the [Conflict].\n* The Middle - The true nature of the [Conflict] is expanded and developed.\n* The End - The Story reaches its climax and possibly resolution.  The drama of the Story is about how things\nwill resolve.  Here is where the players must decide their own fate.  They have had their opportunities to\nshape their destinies.  Now they must pass their final test.  Do or Die, Succeed or Fail, Fight or Compromise."),
            ":Scenes",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Scenes", ":summary", "* The story will move from scene to scene.\n\nEach scene includes:\n* Sets\n* Props\n* Cast\n\nAfter the scene has completed its purpose, we move to the next scene:\n* Scene Goals"),
            "Story Ending",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Story Ending", ":summary", "* Climax\n* Anti-Climax\n* Surprise Ending"),
            ":Epilogue",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Epilogue", ":summary", "* Are there any loose ends that hint at the next story.", ":titles", "Aftermath")
          )
        ),
        "Plot Archetypes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Plot Archetypes",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            "Armed Robbery",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Armed Robbery"),
            ":Assault",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Assault", ":summary", "* An all out attack on an enemy stronghold."),
            "Assault Defense",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Assault Defense", ":summary", "* Defend your stronghold against an enemy assault."),
            "Bank Robbery",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Bank Robbery"),
            ":Betrayal",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Betrayal", ":summary", "* The plot appears to be another kind, but the characters realize they\nhave been betrayed. They must now escape or gain revenge."),
            ":Blackmail",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Blackmail"),
            "Bug Hunt",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Bug Hunt", ":summary", "* A killer is on the loose and must be tracked down."),
            ":Bullying",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Bullying"),
            "Car Theft",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Car Theft"),
            ":Conspiracy",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Conspiracy", ":summary", "* A group plans a course of action which the characters directly or\nindirectly."),
            ":Crash",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Crash"),
            "Cyber Crime",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Cyber Crime"),
            "Dangerous Animal",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Dangerous Animal"),
            "Disease Outbreak",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Disease Outbreak"),
            "Drug Trafficking",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Drug Trafficking"),
            ":Extortion",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Extortion"),
            ":Escape",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Escape", ":summary", "* The characters are threatened with overwhelming danger and must find a\nsafe place and travel there while dodging aggressors."),
            ":Falling",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Falling"),
            ":Framing",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Framing", ":summary", "* Characters are maneuvered into a situation where it appears they have\ncommitted an offense. This may lead to an escape and a mystery."),
            ":Gambling",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Gambling"),
            "Gang Activty",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Gang Activty"),
            ":Guard",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Guard", ":summary", "* Guard a person or item from theft."),
            ":Hacking",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hacking"),
            ":Hostages",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hostages"),
            ":Injustice",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Injustice", ":summary", "* A wrong has been perpetrated and the characters feel obliged to right it."),
            ":Intimidation",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Intimidation"),
            ":Jealosy",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Jealosy", ":summary", "* The characters have inspired envy or jealousy in another and steps are\nbeing taken against them. Their enemy may be someone they recently\ncrossed."),
            ":Kidnapping",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Kidnapping"),
            ":Lost",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Lost"),
            "Love Affair",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Love Affair", ":summary", "* The characters become involved in the love or lust of another. The\nother person could be another character. The attention could be mutual\nor one-sided. It may lead to courtship, uncomfortable situations, anger,\nviolence or any other outcome. Such are the ways of love."),
            "Missing Person",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Missing Person"),
            ":Mystery",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Mystery", ":summary", "* Events have taken place and the characters must find out what it all\nmeans, who is behind it, and what actions to take."),
            "Organized Crime",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Organized Crime"),
            ":Panic",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Panic"),
            "Petty Theft",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Petty Theft"),
            ":Poisoning",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Poisoning"),
            "Police Activity",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Police Activity"),
            "Political Situation",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Political Situation"),
            ":Prostitution",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Prostitution"),
            ":Protest",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Protest"),
            ":Pursued",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Pursued"),
            ":Rescue",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Rescue", ":summary", "* The characters must penetrate and enemy stronghold and find an ally, and\nescape."),
            ":Revenge",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Revenge"),
            ":Siege",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Siege"),
            "Siege Defense",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Siege Defense", ":summary", "* Your stronghold is surrounded. You must escape or break the siege."),
            ":Trapped",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Trapped"),
            "Treasure Hunt",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Treasure Hunt", ":summary", "* Something of value is discovered and the characters must find it before\nanyone else does."),
            "White Collar Crime",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "White Collar Crime")
          )
        ),
        ":Subtleties",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Subtleties",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Antagonist",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Antagonist", ":summary", "* A compelling antagonist can be as important as the main characters.\nDefeating the antagonist personifies the characters' goals. Protagonists\ncan only rise as high as the antagonist sinks low. Antagonists need not\nbe villainous. They just create obstacles for characters for their own\nends. Many simply have different beliefs or goals or can be misled.\nReal villains should be few and far between.\n* Personality - Evil, Moral, Noble, Corrupt, Misguided, Horrible\n* Motivation - Power, Money, Influence, Love, Friendship, Revenge,\nProtection\n* Type - Warrior, Manipulator, Leader\n* Influence - Elder, Commanding, Empathetic, Intellectual\n* Tools - Weapons, Minions, Contacts, Equipment, Skills, Powers\n* Obstacles - Own Enemies, Dark Past, Morality, Code of Honor\n* Development - Interactions with the Antagonist should change the\nantagonist as the relationship between the characters becomes personal.\nThis can become hatred, rivalry, friendship, or even love."),
            ":Villains",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Villains", ":reference", "* You're quasi-evil. You're semi-evil. You're the margarine of evil. You're the Diet Coke of evil. Just\none calorie, not evil enough. - Austin Powers, Austin Powers: The Spy Who Shagged Me.", ":summary", "* Remember that villians rarely see themselves as such. They are so\nwrapped up in their own motivations that they believe their actions\nare justified.\n* Evil - Movie villians often show their evil by killing the hero's girlfriend, best friend, or dog.\nThese kinds of acts are suitable to minions and unimaginative villains.\n* Great Evil - Look around at the real world for examples. Adolf Hitler,\nOsama Bin Laden. They are impressive but can also seem like caricatures:\nblack hats, almost clowns.\n* True Evil - True evil is not to be found in petty tyrants with guns and\nfumble-fingered power plays. The real horrors are those who hide behind\nnoble purpose as they betray our trust. The greater our trust in them\nthe greater the possibility of rank betrayal, the true horror. Starvation,\nwar, genocide, and corruption blight our world of abundance and plenty.\nSelf-serving leaders exploit public trust on a regular basis. Hidden\npowers lurk in the background, uninvited, unelected, and unwanted.\nBureaucrats steal consitutional power from well-intentioned, cowardly,\ngullible, forgetful or senile leaders. Hidden forces wage covert wars,\nsmuggling drugs, corrupting elections, assassinating leaders, and\nsuppressing democratic dissent witho our money but without our consent.\nThe reports we receive of their conduct are fragmented, incomplete,\ncensored, and denied. In these covert wars, we citizens are arrayed\nagainst forces we cannot name or locate let alone effectively stand\nagainst. From Watergate to Iran-Contra to stolen Presidential elections\nand Presidential assassinations it is clear that it can and does happen\nhere. The thought of an American coup d'etat is more frightening than\nany tales we can construct."),
            "Dream Sequences",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Dream Sequences", ":summary", "* Dreams and Dream-like situations can be an interesting plot device and can also allow the character to\nrediscover their nature when put into unusual circumstances."),
            "Hero's Journey",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Hero's Journey", ":summary", "* The Hero's Journey is the long and difficult process of making the hero a better person and worth of\nbeing a hero.\n* The Ordinary World - The hero lives a normal life but is usually incomplete in some way set apart from\nhis peers.\n* The Call to Adventure - Suddenly something happens that warns that the hero's life will never be the\nsame again. Often the hero rejects their destiny but eventually comes around. The hero leaves home,\nvoluntarily or is cast out.\n* Meeting with the Mentor - The hero acquires a mentor who is the ideal for the hero. Eventually the hero\nmust see through the ideal and accept the person behind the ideal.\n* The hero must confront the enemy and there will be defeats. Often the hero will be captured.\n* The hero must enter the Underworld. This may be a hellish place or the actual Underworld.  Very often\nthis is the heart of the enemy's domain. The hero must confront the pain and sorrow of existence and his\nown existence in particular. The hero's toughest battles will be those where he is confronting something\nwithin himself.\n* Crossing the First Threshold - The hero can no longer return to normal life. He must face a guardian\nthat represents the danger that is coming. The threat is overwhelming and cannot be defeated alone.\n* Tests, Allies, and Enemies - Various trials and tribulations must be faced. Who may help or harm must\nbe discovered. Aligning different character goals toward a common enemy allows the hero to gain a troupe\nof supporters.\n* Enter the Underworld - After discovering the nature of the true threat, the here must enter the\nbelly of the beast where his/her very soul will be tested.\n* The Supreme Ordeal - This is downbeat and the heroes have seemingly lost all. The heroes face their\ngreatest enemy, their worst failing, and do not succeed. They are struck down, cut off, lost. The heroes\nsuffer symbolic death, 'bottom out', and face the ultimate darkness.\n* The Reward - The heroes have hunted the enemy to its lair, faced death, and lived to tell about it.\nThough all seems lost, they actually gain valuable information or treasures that make victory possible.\n* The Road Back - With rewards in hand, the heroes must escape the Underworld and race to the final\nconfrontation. This scene is typically a chase with lots of movement and little combat, saving the fight\nfor the final battle.\n* The Final Threshold - Here they must once again come face-to-face with death. They must be threatened\nand purified by the final danger. After this they are resurrected with the changes that the story has\nwrought upon them becoming clear.\n* The Return - After his journey is finished, the hero returns home. Rewards and recognition must be\ngiven, but more importantly the hero must realize how he has changed and what he has accomplished.\nEventually he may become the mentor for another hero. As the story ends, all the remaining plotlines must\nbe wrapped up, and the groundwork for a future story must be laid."),
            ":Flashbacks",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Flashbacks", ":summary", "* Flashbacks are a staple of storytelling.  Something triggers a memory, and the scene shifts to past\nevents relevant to the current situation.\n* You may just narrate what happens or the players can act out the scene.\n* Flashbacks may be from the characters past or just related stories. However, be careful not to\naccidentally give away information in the flashback that the players could not already have.\n* Flashbacks can be particularly interesting for characters with past lives."),
            ":Foreshadowing",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Foreshadowing", ":reference", "Communism was just a red herring - Wadsworth, Clue", ":summary", "* Foreshadowing is the art of carefully placing certain elements into a story early on to allude to events to\ncome.  This can help build suspense, since the characters may expect something to happen, but they won't know\nhow, when, or to whom.\n* A Red Herring is the opposite of Foreshadowing.  It introduces a seemingly important element early, but it\nturns out to be unimportant to the main story.  Be careful not to abuse red herrings as they can become\nannoying."),
            ":Meanwhile...",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Meanwhile...", ":summary", "* Take an opportunity every once in a while to take the players out of their characters and into a\ndifferent set of characters in the same Theme. This may be a different part of the main Story or a\nparallel Story in another place or time.\n* This can also be a chance to focus on a single player while allowing the others to learn information\nthat they will learn anyway.", ":titles", "Crosscutting, Parallel Stories"),
            ":Motivation",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Motivation", ":summary", "* Motivating the characters is key. Never force them along the plotline. Lead them with tempting story\nhooks and strange riddles. If they take off in another direction, just follow along and either find\nanother moment to reinject the next plot element or let the players drive the direction.\n* Don't forget to provide motivation for the antagonists as well. If your antagonists don't have\nbelievable goals, hopes, and dreams, they are not going to be very effective. Many of the best antagonists\nare not evil, but just have goals at odds to the characters. Nothing is more satisfying to layers than\ngoing after an opponent that they love to hate.\n\nStock motivators:\n* Contacts - Contacts are a regular way to get information.  They also often require help themselves in\nexchange for information.\n* Anoymous Tips - While providing information, tips complicate the matter greatly. Who sent it? How do\nthey know where I am? Is this a trap?\n* Threats - If someone threatens you, you must be on the right track.  Threats are meant to scare people of, but\nthey tend to motivate characters instead.\n* Lulls - Nothing is more unsettling than a break in the action.  If the opposition suddenly inexplicably withdraws,\nthe tension is increased not decreased.  What just happened?  Has a major player entered or left the scene?\nWhatever awaits is probably worse than before.\n* Out of the Frying Pan - Simple operations can get complicated.  The character was already involved, so there is\noften no turning back.\n* Smoking Gun - Catching people in the act will usually get people interest even if it is just for curiosity.  Noisy\ninvestigators also run the risk of being mistaken for the culprit or framed.\n* Sudden Aid - Help out of the blue can feel like an immediate boon, but what is the motivation?  Who benefits\nbesides the character?  What kind of payment will this entail?\n* Friend in Need - Friends, mentors, relatives, contacts seem to always be getting into trouble.  This plot point\ncan feel like the player is being manipulated unless they are currently involved with this friend, so it is best to\nbe subtle.\n* Romantic Interest - This motivator can take many forms.  The player or the romantic figure may not have the same\nfeelings.  Either could be trying to impress the other, get to know the other, or help the other.  People do the\nsilliest things for love, so foolish or dangerous activity is easily explained.\n* Personal Honor - Every character worth his salt will have a personal code of honor (even if they don't realize\nit).  Challenging that code is a great way to motivate or to at least learn more about the character.\n* Loss - Losing something you were counting on is sure to make a bad situation worse.  Loss of a possession, a\nguide, a mentor, a kidnapping, a motivation.  Whatever it is, it will require a change of plans.\n* Profit - Money, prestige, power, and objects are always enticing.  They, of course, also come with complications.\n* Group Affiliation - Teams, organizations, religious groups, cultural groups are all possible motivators.\n* Rivals - The involvement of rival organizations and individuals can be instant motivators to characters\nwith a personal grudge."),
            ":Coincidence",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Coincidence", ":summary", "* By repeating the appearance of certain props, characters, or plot elements, the players will begin to suspect\nthat there is more to the Story than they understand.  They may suspect conspiracies or higher powers, but will\nbe unable to prove anything.  Maybe there is something to all this or maybe not.  Either way it can keep the\nplayers on their toes."),
            "Real Time Action",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Real Time Action", ":summary", "* An extreme way to make the story gripping is to move the game into real time.  Players only have as much time as\ntheir characters do to make decisions."),
            ":Subplots",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Subplots"),
            ":Symbolism",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Symbolism", ":reference", "Sometimes a cigar isn't just a cigar... - Aberrant, RPG", ":summary", "* Symbolism can be littered through a story and can sometimes be detected subconsciously even when they are too subtle for the conscious mind.\n* Subtly is important, and it may be better if the player does not consciously realize the connections being made. If nothing else it is satisfying to the Storyteller and provides a source of additional detail.\n* One way to use symbolism is to subtly change the description of then environment to match the personality of the main character in a scene.\n* Examples: Tattered newspaper, broken glass, driving rain."),
            "Unlikely Allies",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Unlikely Allies", ":summary", "* Characters who hate each other but are forced to work together is a plot twist that can be applied to any scene. Success requires their cooperation, but they don't have to like it.\n* High drama and comedy can come from such pairings.\n* Crisis can breed intense personal bonds including close friendships and romantic attraction. And, of course, such relationships have a tendency to turn tragic."),
            "Plot Twist",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Plot Twist", ":reference", "Sixth Sense, Usual Suspects", ":summary", "* Allies can become enemies.\n* Enemies may become sympathetic.\n* Characters and situations can have hidden dimensions that can change the meaning and purpose of the characters.\n* Note that the best plot twists are subtle.")
          )
        ),
        ":Encounters",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Encounters",
          ":summary",
          "* When characters travel, they may encounter others seemingly randomly.  These encounters keep players on their toes as\nthey are often vulnerable while travelling.",
          ":rulemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_rulemap},
            ":Traces",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Traces", ":summary", "* This type of encounter includes tracks, camp sites, lairs, skeletal remains,\nclaw marks, spoor, or signs of a struggle. Such evidence indicates that\nsomething has passed through the area. Tracking skills increases the\ninformation derived from the site. This encounter can provide information,\nmislead, create suspense by foreshadowing, or simply to provide flavor."),
            ":Sightings",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Sightings", ":summary", "* This encounter indicates a being or beings sighted at a distance. Typically\nthis provides the opportunity to avoid a close encounter or to gain a tactical\nadvantage. The observed being(s) mayh be foraging, scavenging, hunting,\ntravelling, camping, sleeping, scavenging, hovering overhead, fighting, etc.\nUnusual events include: clan rivalry, courtship rituals, injury, illness,\nentrapment, crimes."),
            "Close Encounters",
            vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":name", "Close Encounters", ":summary", "* Close encounters require immediate action. All close encounters need not\nresult in combat. Most creatures will not fight to the death and will abandon\na fight that is not going well.\n* Encounters with others may be good, bad, or neutral. The reaction to one\nanother is partly random, but mostly based on mutual history, race, attitude,\ncaste, and courtesy. Characters who are good communicators will do better than\nothers in these circumstances. Such encounters can introduce side characters\nand move the plot forward.\n* Sample travellers: Messengers, Traders, Refugees, Criminals, Victims, Armies,\nPriests, Monsters, Entertainers, Nobles, Craftsmen, Spies, Pilgrims, Patrols,\nLocals, Scholars, Charlatans, Thieves, Bandits.")
          )
        ),
        "Character Scenes",
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_section},
          ":name",
          "Character Scenes",
          ":scenemap",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_scenemap},
            "Personal Quest",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Personal Quest", ":summary", "* These are usually intense stories deeply rooted in the desires and emotions of the characters.\n* Revenge, atonement, love, family obligations.\n* Quests drive characters beyond the bounds of propriety and moderation.  Failed questors create some of the most\nclassic villains (e.g. Darth Vader)."),
            ":Missions",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Missions", ":summary", "* Missions usually begin as impersonal tasks assigned by someone else, probably to fulfill an agenda other than the\ncharacter's own.  Missions are rarely what they seem at the beginning and have a tendency to evolve into something more\npersonal.\n* Often a character's agenda becomes at odds with the mission, and he/she must make some decisions about where they\nstand.\n* Some Missions require a certain amount of detective work before or during the Mission to discover the true goals and\nmotivations behind the Mission."),
            "Damage Control Mission",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Damage Control Mission", ":summary", "* A specific form of Mission where a situation has already spun out of control and the characters are dispatched to\n'fix' the situation.\n* Damage Control missions tend to be fast-paced with a rapidly deteriorating situation."),
            "Training Mission",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Training Mission", ":summary", "* Training scenes can take many forms.  They can put the characters in the position of student, teacher, or both.\n* Training can appear as another sort of scene but has been carefully staged by the teacher.  Or Training can\nspiral out of control and become a life or death struggle.\n* Training is also a convenient plot device to gather unrelated characters together."),
            "Disaster Mission",
            vx_core.f_new({"any-1": nx_tactics_base.t_scene}, ":name", "Disaster Mission", ":summary", "* Sometimes bad things just happen.  Suddenly, the characters are torn from their comfort zone and thrust into a new\nperspective.  Disasters can be sever enough to create temporary alliances among enemies.")
          )
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
    vx_type: nx_tactics_books_characters.t_tacticsbook
  }

  // (func tacticsbook)
  static f_tacticsbook(tactics) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_book},
      ":name",
      "Characters",
      ":image",
      "Characters.jpg",
      ":chaptermap",
      nx_tactics_base.f_chaptermap_from_chapterlist(
        nx_tactics_books_characters.f_chapter_characters_overview(),
        nx_tactics_books_characters.f_chapter_creating_characters(),
        nx_tactics_books_characters.f_chapter_character_archetypes(),
        nx_tactics_books_characters.f_chapter_storytelling(),
        nx_tactics_books_characters.f_chapter_sets(),
        nx_tactics_books_characters.f_chapter_props(),
        nx_tactics_books_characters.f_chapter_cast()
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "chapter_cast": nx_tactics_books_characters.e_chapter_cast,
      "chapter_character_archetypes": nx_tactics_books_characters.e_chapter_character_archetypes,
      "chapter_characters_overview": nx_tactics_books_characters.e_chapter_characters_overview,
      "chapter_creating_characters": nx_tactics_books_characters.e_chapter_creating_characters,
      "chapter_props": nx_tactics_books_characters.e_chapter_props,
      "chapter_sets": nx_tactics_books_characters.e_chapter_sets,
      "chapter_storytelling": nx_tactics_books_characters.e_chapter_storytelling,
      "tacticsbook": nx_tactics_books_characters.e_tacticsbook
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "chapter_cast": nx_tactics_books_characters.t_chapter_cast,
      "chapter_character_archetypes": nx_tactics_books_characters.t_chapter_character_archetypes,
      "chapter_characters_overview": nx_tactics_books_characters.t_chapter_characters_overview,
      "chapter_creating_characters": nx_tactics_books_characters.t_chapter_creating_characters,
      "chapter_props": nx_tactics_books_characters.t_chapter_props,
      "chapter_sets": nx_tactics_books_characters.t_chapter_sets,
      "chapter_storytelling": nx_tactics_books_characters.t_chapter_storytelling,
      "tacticsbook": nx_tactics_books_characters.t_tacticsbook
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/characters",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func chapter_cast)
    nx_tactics_books_characters.t_chapter_cast['vx_value'] = {
      name          : "chapter_cast",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_chapter_cast
    }

    // (func chapter_character_archetypes)
    nx_tactics_books_characters.t_chapter_character_archetypes['vx_value'] = {
      name          : "chapter_character_archetypes",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_chapter_character_archetypes
    }

    // (func chapter_characters_overview)
    nx_tactics_books_characters.t_chapter_characters_overview['vx_value'] = {
      name          : "chapter_characters_overview",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_chapter_characters_overview
    }

    // (func chapter_creating_characters)
    nx_tactics_books_characters.t_chapter_creating_characters['vx_value'] = {
      name          : "chapter_creating_characters",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_chapter_creating_characters
    }

    // (func chapter_props)
    nx_tactics_books_characters.t_chapter_props['vx_value'] = {
      name          : "chapter_props",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_chapter_props
    }

    // (func chapter_sets)
    nx_tactics_books_characters.t_chapter_sets['vx_value'] = {
      name          : "chapter_sets",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_chapter_sets
    }

    // (func chapter_storytelling)
    nx_tactics_books_characters.t_chapter_storytelling['vx_value'] = {
      name          : "chapter_storytelling",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_chapter_storytelling
    }

    // (func tacticsbook)
    nx_tactics_books_characters.t_tacticsbook['vx_value'] = {
      name          : "tacticsbook",
      pkgname       : "nx/tactics/books/characters",
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
      fn            : nx_tactics_books_characters.f_tacticsbook
    }

  }
}
