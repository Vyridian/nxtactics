'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_story {

  /**
   * @function deck_story
   * Story Deck
   * @return {deck}
   */
  static t_deck_story = {
    vx_type: vx_core.t_type
  }
  static e_deck_story = {
    vx_type: nx_tactics_decks_story.t_deck_story
  }

  // (func deck-story)
  static f_deck_story() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Story",
      ":image",
      "images/story/story-back.svg",
      ":layout",
      nx_tactics_base.c_cardlayout_imageonly,
      ":cardmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_cardmap},
        nx_tactics_base.f_cardmap_from_cardlist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_cardlist},
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Story:How To",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":image",
              "icons/card-ranksuit-wb.svg",
              ":summary",
              "Steps for Story Inspiration:\n* Separate Story deck by Rank\n* Starting with Rank 2, for each Rank choose or randomize result\n\nRandomize:\n* For each Rank (eg Rank=2)\n* Reveal Fate (eg K of Swords)\n* Match Suit of Story and Fate (eg 2 of Swords)\n* Match Rank of Story and Fate (eg K on the 2 of Swords)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Story:Key",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":image",
              "icons/card-ranksuit-wr.svg",
              ":summary",
              "2. Opening - What's happening\n3. Setting - Where it happens\n4. Theme - What really happens\n5. Mood - How the world feels\n6. Tone - How the story should feel\n7. Conflict - What's in the way\n8. Key - What we want\n9. Stakes - Why it matters\nT. Complication - But it's harder\nJ. Antagonist - What opposes us\nQ. Ally - Who can help\nK. Twist - This changes everything\nA. Payoff - Success finally"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Opening:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "icons/card-ranksuit-2c.svg",
              ":summary",
              "A. Plea for protection\nK. Authority summons group\nQ. Public disturbance erupts\nJ. Competition announced\nT. Leader returns dramatically\n9. Agreement violated\n8. Conflict declared\n7. Recruitment drive starts\n6. Environment turns dangerous\n5. Incident blamed on group\n4. Honor challenged publicly\n3. Fight breaks out\n2. Claim disputed"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Opening:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "icons/card-ranksuit-2d.svg",
              ":summary",
              "A. Inheritance contested\nK. Secret partnership offered\nQ. Valuable item stolen\nJ. Rivalry declared\nT. Investment fails suddenly\n9. Job opportunity\n8. Intelligence tip received\n7. Opportunity deadline looms\n6. Business raided\n5. Competitor challenges directly\n4. Mentor leaves warning\n3. Market shift noticed\n2. System flaw revealed"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Opening:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "icons/card-ranksuit-2h.svg",
              ":summary",
              "A. Close friend disappears\nK. Family heirloom missing\nQ. Anonymous message\nJ. Old favor called in\nT. Reputation threatened\n9. Past mistake exposed\n8. Romantic advance rejected\n7. Sudden personal crisis\n6. Secret discovered accidentally\n5. Personal loss announced\n4. Confrontation with past\n3. Unexpected homecoming\n2. Life change forced"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Opening:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "icons/card-ranksuit-2s.svg",
              ":summary",
              "A. Crisis vision or warning\nK. Secret meeting interrupted\nQ. Mass betrayal revealed\nJ. Uprising begins\nT. Difficult choice forced\n9. Deadline suddenly imposed\n8. Critical information leaked\n7. Resistance exposed\n6. Objective changes\n5. Revenge target appears\n4. Identity questioned\n3. Opportunity vanishes\n2. Threat emerges suddenly"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Setting:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "icons/card-ranksuit-3c.svg",
              ":summary",
              "A. Resistance headquarters\nK. Sports stadium\nQ. Fortified port city\nJ. Nomadic caravan camp\nT. Criminal headquarters\n9. Legislative assembly hall\n8. War memorial\n7. Overcrowded refugee camp\n6. Festival grounds\n5. Walled military base\n4. Bar or Tavern\n3. Border checkpoint\n2. Dark Alley"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Setting:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "icons/card-ranksuit-3d.svg",
              ":summary",
              "A. Corporate headquarters\nK. Remote mining site\nQ. Grand banking vault\nJ. Hidden smuggling harbor\nT. Busy trade hub marketplace\n9. Industrial production zone\n8. Gambling establishment\n7. Farming estate\n6. Luxury residence\n5. Secure storage facility\n4. Long-distance trade route\n3. Modest home\n2. Crowded shopping district"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Setting:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "icons/card-ranksuit-3h.svg",
              ":summary",
              "A. Sacred ancestral burial ground\nK. Starlit rooftop observatory\nQ. Riverside hut\nJ. Tranquil meadow sanctuary\nT. Woodland shrine\n9. Cliffside perch\n8. Herbalist's garden\n7. Serene lakeside cabin\n6. Abandoned childhood home\n5. Enchanting forest glade\n4. Cozy village tavern\n3. Hidden mountain retreat\n2. Secluded family homestead"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Setting:Dark",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":image",
              "icons/card-ranksuit-3s.svg",
              ":summary",
              "A. Vast empty wasteland\nK. Restricted zone\nQ. Devastated urban ruins\nJ. Twisted maze of passages\nT. Abandoned facility\n9. Deep underground tunnels\n8. Derelict ghost town\n7. Harsh volcanic badlands\n6. Hostile wilderness\n5. Prison facilities\n4. Frozen barren landscape\n3. Storm-battered coastline\n2. Overgrown ancient structures"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Theme:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "icons/card-ranksuit-4c.svg",
              ":summary",
              "A. Protect the vulnerable\nK. Navigate intrigue\nQ. Survive a disaster\nJ. Compete in a tournament\nT. Exile's triumphant return\n9. Make a risky pact\n8. Build a new domain\n7. Quest for enlightenment\n6. Survive hostile environment\n5. Plot assassination\n4. Reclaim lost honor\n3. Defend personal honor\n2. Claim disputed inheritance"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Theme:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":image",
              "icons/card-ranksuit-4d.svg",
              ":summary",
              "A. Haunted by dark past\nK. Form unlikely alliance\nQ. Escape captivity or pursuit\nJ. Escalate family feud\nT. Fallen grace reclaimed\n9. Seek immortality\n8. Covert espionage\n7. Heroism\n6. Infiltrate an organization\n5. Rivalry with a peer\n4. Betrayal\n3. Fulfill/defying destiny\n2. Trigger paradigm shift"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Theme:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "icons/card-ranksuit-4h.svg",
              ":summary",
              "A. Betrayal by a trusted ally\nK. Hunt for lost treasure\nQ. Confront prophecy\nJ. Break generational curse\nT. Rise from obscurity\n9. Lead popular revolution\n8. Forbidden or star-crossed love\n7. Quest for power\n6. Uncover a dangerous secret\n5. Overcome famine\n4. Rise of dark antagonist\n3. Return from exile\n2. Personal transformation"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Theme:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":image",
              "icons/card-ranksuit-4s.svg",
              ":summary",
              "A. Quest for enlightenment\nK. Staging coup d'état\nQ. Tournament of champions\nJ. Overthrow ruling power\nT. Moral dilemma\n9. Race against time\n8. Moral choice\n7. Rising against oppression\n6. Daring heist\n5. Revenge for injustice\n4. Crisis of identity\n3. Personal redemption\n2. Preventing catastrophe"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Mood:Tense",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "icons/card-ranksuit-5c.svg",
              ":summary",
              "A. Grim unrelenting hardship\nK. Political maneuvering\nQ. Heavy tragic inevitability\nJ. Gritty everyday struggle\nT. Charged and confrontational\n9. Bleak cold indifference\n8. Urgent mounting pressure\n7. Somber with serious gravity\n6. Raw with visceral intensity\n5. Strained simmering conflict\n4. Harsh unyielding reality\n3. Suspicious creeping paranoia\n2. Stark unflinching pragmatism"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Mood:Stylish",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":image",
              "icons/card-ranksuit-5d.svg",
              ":summary",
              "A. Opulent and lavish\nK. Thrumming with excitement\nQ. Polished with sophisticated\nJ. Crackling with sharp wit\nT. Flashy with ostentatious display\n9. Electric with cinematic grandeur\n8. Smoky with shadowy intrigue\n7. Buzzing with triumphant energy\n6. Crisp with inventive ingenuity\n5. Rich with decadent indulgence\n4. Sleek with confident style\n3. Vibrant with charismatic bustle\n2. Bold with unbridled ambition"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Mood:Intimate",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "icons/card-ranksuit-5h.svg",
              ":summary",
              "A. Heavy unspoken grief\nK. Warm quiet affection\nQ. Thick unresolved longing\nJ. Soft nostalgic reminiscence\nT. Bright tentative hope\n9. Tender heartfelt closeness\n8. Charged romantic tension\n7. Calm gentle forgiveness\n6. Hushed intimate secrets\n5. Bittersweet fading memories\n4. Raw vulnerable openness\n3. Comforting familiar warmth\n2. Gentle empathetic sorrow"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Mood:Dark",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":image",
              "icons/card-ranksuit-5s.svg",
              ":summary",
              "A. Overwhelming, existential dread\nK. Oppressive, suffocating fear\nQ. Surreal, distortion\nJ. Chaotic, anarchic frenzy\nT. Desperate, apocalyptic panic\n9. Eerie, unnatural stillness\n8. Macabre, grotesque unease\n7. Foreboding, looming threat\n6. Mysterious, enigmatic shadows\n5. Haunting, lingering ghosts\n4. Bleak, crushing nihilism\n3. Frenzied, nightmarish terror\n2. Cold, detached emptiness"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Tone:Grounded",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "icons/card-ranksuit-6c.svg",
              ":summary",
              "A. Grim and unflinching\nK. Politically charged\nQ. Tragic and inevitable\nJ. Gritty and realistic\nT. Tense and confrontational\n9. Bleak and unforgiving\n8. Urgent and high-pressure\n7. Serious and weighty\n6. Raw and visceral\n5. Strained and conflicted\n4. Harsh and uncompromising\n3. Suspenseful and paranoid\n2. Stark and matter-of-fact"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Tone:Stylish",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":image",
              "icons/card-ranksuit-6d.svg",
              ":summary",
              "A. Grandiose and operatic\nK. Swashbuckling and daring\nQ. Sleek and sophisticated\nJ. Witty and satirical\nT. Flashy and extravagant\n9. Cinematic and larger-than-life\n8. Noir and shadowy\n7. Ambitious and triumphant\n6. Clever and inventive\n5. Opulent and decadent\n4. Sharp and stylish\n3. Confident and charismatic\n2. Bold and unapologetic"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Tone:Intimate",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "icons/card-ranksuit-6h.svg",
              ":summary",
              "A. Profoundly melancholic\nK. Bittersweet and tender\nQ. Deeply introspective\nJ. Warm and nostalgic\nT. Quietly hopeful\n9. Poignant and heartfelt\n8. Passionate and romantic\n7. Gentle and forgiving\n6. Reflective and serene\n5. Wistful and longing\n4. Vulnerable and raw\n3. Comforting and familiar\n2. Soft and empathetic"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Tone:Dark",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":image",
              "icons/card-ranksuit-6s.svg",
              ":summary",
              "A. Cosmic and existential\nK. Dreadful and oppressive\nQ. Surreal and dreamlike\nJ. Chaotic and anarchic\nT. Apocalyptic and desperate\n9. Eerie and unsettling\n8. Macabre and twisted\n7. Foreboding and ominous\n6. Mysterious and enigmatic\n5. Haunting and spectral\n4. Bleak and nihilistic\n3. Frenzied and nightmarish\n2. Cold and detached"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Conflict:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "icons/card-ranksuit-7c.svg",
              ":summary",
              "A. Political power struggles\nK. Ideological clashes\nQ. Social injustice protests\nJ. Factional or gang warfare\nT. Legal system navigation\n9. Propaganda and misinformation\n8. Tradition vs. progress\n7. Community division\n6. Organized crime\n5. Bureaucratic obstruction\n4. Class or cultural conflict\n3. Public opinion sway\n2. Mob justice vs. law"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Conflict:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "icons/card-ranksuit-7d.svg",
              ":summary",
              "A. Financial risk\nK. Corporate rivalry\nQ. Legal dispute\nJ. Resource competition\nT. Intellectual property theft\n9. Market manipulation\n8. Professional sabotage\n7. Ambition vs. ethics\n6. Investment fraud\n5. Status and reputation battles\n4. Inheritance or ownership fights\n3. Economic survival pressure\n2. Opportunity cost dilemmas"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Conflict:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "icons/card-ranksuit-7h.svg",
              ":summary",
              "A. Emotional turmoil\nK. Family obligations\nQ. Romantic entanglement\nJ. Loyalty tested\nT. Identity crisis\n9. Past trauma\n8. Conflicting desires\n7. Emotional manipulation\n6. Secrets relationships\n5. Fear of vulnerability\n4. Trust issues\n3. Conflicting values\n2. Self-acceptance struggle"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Conflict:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":image",
              "icons/card-ranksuit-7s.svg",
              ":summary",
              "A. Overwhelming odds\nK. Conspiracy unraveling\nQ. Moral corruption spread\nJ. Ideological extremism\nT. Betrayal and paranoia\n9. Relentless pursuit/hunt\n8. Psychological breakdown\n7. Cycle of vengeance\n6. Manipulation of truth\n5. Desperation-driven choices\n4. Inevitable tragic flaws\n3. Existential crisis\n2. Race against collapse"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Key:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "icons/card-ranksuit-8c.svg",
              ":summary",
              "A. Official alliance document\nK. Authority insignia\nQ. Signed peace treaty\nJ. Rallying signal device\nT. Voting record or ballot\n9. Printed propaganda material\n8. Prisoner transfer list\n7. Supply distribution log\n6. Written oath of loyalty\n5. Inciting public notice\n4. Legal judgment document\n3. Group leadership emblem\n2. Organization charter"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Key:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "icons/card-ranksuit-8d.svg",
              ":summary",
              "A. Gem/jewelry\nK. Forged deed\nQ. Sealed vault manifest\nJ. Counterfeit currency cache\nT. Rare artifact\n9. Investment ledger\n8. Stolen prototype\n7. Auctioned masterpiece\n6. Treasure map\n5. Valuable Contract\n4. Status insignia\n3. Resource crate\n2. Collectible item"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Key:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "icons/card-ranksuit-8h.svg",
              ":summary",
              "A. Family heirloom\nK. Handwritten private letter\nQ. Hidden personal confession\nJ. Childhood memento\nT. Old family picture\n9. Broken promise reminder\n8. Shared symbolic keepsake\n7. Wedding or commitment ring\n6. Confidential journal\n5. Emotional farewell message\n4. Blood-stained reminder\n3. Identity document or badge\n2. Recorded private conversation"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Key:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":image",
              "icons/card-ranksuit-8s.svg",
              ":summary",
              "A. Cursed foreboding idol\nK. Doomed prophecy tablet\nQ. Tainted ritual dagger\nJ. Shadow-bound soul vessel\nT. Fractured fate mirror\n9. Whispering death mask\n8. Entombed plague vial\n7. Ominous eclipse amulet\n6. Haunting echo horn\n5. Bleak void key\n4. Nihilistic ruin stone\n3. Spectral chain link\n2. Forbidden apocalypse seal"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Stakes:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "icons/card-ranksuit-9c.svg",
              ":summary",
              "A. Complete societal chaos\nK. Betrayal by leadership\nQ. Escalation to open conflict\nJ. Oppression of the powerless\nT. Sacred agreements broken\n9. Seizure of all power\n8. Total breakdown of order\n7. Loss of community safety\n6. Rebellion violently crushed\n5. Justice system corrupted\n4. War becomes unavoidable\n3. Key alliances shattered\n2. Local community destroyed"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Stakes:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "icons/card-ranksuit-9d.svg",
              ":summary",
              "A. Total financial ruin\nK. Loss of all holdings\nQ. Generational wealth lost\nJ. Irreplaceable asset lost\nT. Collapse of influence network\n9. Business empire dismantled\n8. Priceless treasure stolen\n7. Critical opportunity lost\n6. Success foundation crumbling\n5. Hard-earned legacy erased\n4. Permanent drop in status\n3. Valuable possession lost\n2. Severe resource depletion"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Stakes:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "icons/card-ranksuit-9h.svg",
              ":summary",
              "A. Descent into madness\nK. Closest ties severed\nQ. Torment of unresolved guilt\nJ. Sacrifice of innocence\nT. Personal identity crisis\n9. Isolation from friends\n8. Heartbreak from lost romance\n7. Loss of cherished memories\n6. Exile from beloved home\n5. Erosion of personal sanity\n4. Betrayal of deepest trust\n3. Shattered family bonds\n2. Loss of a close loved one"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Stakes:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "icons/card-ranksuit-9s.svg",
              ":summary",
              "A. Fracture of inner circle\nK. Takeover of personal domain\nQ. Loss of group cohesion\nJ. Erosion of shared values\nT. Imminent personal catastrophe\n9. Deep-rooted corruption\n8. Rise of internal rival\n7. Forced submission of allies\n6. Perpetual infighting cycle\n5. Devastating loss among peers\n4. Trust irreparably broken\n3. Inevitable personal downfall\n2. Sudden betrayal from within"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Complication:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "icons/card-ranksuit-tc.svg",
              ":summary",
              "A. Public scandal erupts\nK. Divided loyalties fracture group\nQ. Crippling resource shortage\nJ. Internal betrayal poisons ranks\nT. Legal injunction blocks action\n9. Propaganda sows doubt\n8. Mob violence derails plans\n7. Authority crackdown intensifies\n6. Communication blackout\n5. Key defector switches sides\n4. Rival mounts counterattack\n3. Morale plummets critically\n2. Logistical nightmare unfolds"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Complication:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "icons/card-ranksuit-td.svg",
              ":summary",
              "A. Rival claims prize\nK. Financial setback\nQ. Bureaucratic red tape\nJ. Forged documents\nT. Market crash devalues goal\n9. Insider sabotage\n8. Theft preempts acquisition\n7. Legal dispute halts progress\n6. Supply chain disruption delays\n5. Counteroffer tempts defection\n4. Appraisal reveals hidden flaw\n3. Negotiation stalls indefinitely\n2. Opportunity window slams shut"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Complication:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "icons/card-ranksuit-th.svg",
              ":summary",
              "A. Overwhelming paralyzing doubt\nK. Lingering emotional baggage\nQ. Unspoken misunderstanding\nJ. Family disapproval looms large\nT. Sudden crisis of confidence\n9. Past heartbreak resurfaces\n8. Awkward timing\n7. Inner conflict tears apart\n6. Secret vulnerability exposed\n5. Fear of rejection intensifies\n4. Emotional walls unyielding\n3. Hesitation breeds regret\n2. Personal flaw undermines effort"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Complication:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":summary",
              "A. No escape from consequences\nK. Warning signs ignored\nQ. Trap already sprung\nJ. Outcome worse than expected\nT. Situation deteriorates rapidly\n9. Persistent bad timing\n8. External force intervenes\n7. Misleading evidence appears\n6. Action has backlash\n5. Wrong target identified\n4. Despair clouds judgment\n3. Collapse accelerates\n2. Random event disrupts"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Antagonist:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":image",
              "icons/card-ranksuit-jc.svg",
              ":summary",
              "A. Tyrannical local ruler\nK. Corrupt council leader\nQ. Warmongering general\nJ. Fanatical revolutionary\nT. Brutal law enforcer\n9. Demagogue agitator\n8. Rigid traditionalist\n7. Oppressive elder\n6. Violent gang boss\n5. Biased judge\n4. Aggressive faction leader\n3. Zealous inquisitor\n2. Mob-inciting agitator"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Antagonist:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "icons/card-ranksuit-jd.svg",
              ":summary",
              "A. Ruthless corporate magnate\nK. Ambitious heir rival\nQ. Greedy treasure guardian\nJ. Scheming business rival\nT. Corrupt official\n9. Opportunistic profiteer\n8. Hired professional saboteur\n7. Wealth-hoarding collector\n6. Insider trading manipulator\n5. Cutthroat competitor\n4. Status-obsessed climber\n3. Monopolizing merchant\n2. Crippling debt pressure"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Antagonist:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "icons/card-ranksuit-jh.svg",
              ":summary",
              "A. Obsessive former lover\nK. Overbearing family head\nQ. Manipulative confidant\nJ. Jealous childhood friend\nT. Bitter ex-partner\n9. Guilt-tripped former ally\n8. Clingy romantic rival\n7. Controlling mentor\n6. Secretive betrayer\n5. Emotionally abusive figure\n4. Grudge-holding acquaintance\n3. Envious close peer\n2. Crushing self-doubt"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Antagonist:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "icons/card-ranksuit-js.svg",
              ":summary",
              "A. Relentless personal nemesis\nK. Mastermind puppet-master\nQ. Cold-blooded betrayer\nJ. Extremist ideologue\nT. Traitor in the group\n9. Vengeful outcast\n8. Ruthless predator\n7. Twisted fanatic\n6. Calculating power broker\n5. Sadistic tormentor\n4. Unrepentant destroyer\n3. Harbinger of ruin\n2. Downward spiral"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Ally:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "icons/card-ranksuit-qc.svg",
              ":summary",
              "A. Expert fighter\nK. Tactical commander\nQ. Field medic\nJ. Agile skirmisher\nT. Veteran warrior\n9. Diplomatic mediator\n8. Organized planner\n7. Community leader\n6. Survival expert\n5. Investigative specialist\n4. Honor-bound defender\n3. Rallying motivator\n2. Disciplined trainee"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Ally:Ambition",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "icons/card-ranksuit-qd.svg",
              ":summary",
              "A. Resourceful scout/explorer\nK. Skilled negotiator\nQ. Expert artisan/crafter\nJ. Stealthy infiltrator\nT. Influential patron/contact\n9. Profitable business partner\n8. Reliable information broker\n7. Ambitious project supporter\n6. Knowledgeable researcher\n5. Resource provider\n4. Reputation defender\n3. Strategic planner\n2. Innovative problem-solver"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Ally:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "icons/card-ranksuit-qh.svg",
              ":summary",
              "A. Loyal lifelong companion\nK. Protective guardian figure\nQ. Empathetic healer/caregiver\nJ. Trusted childhood friend\nT. Devoted romantic partner\n9. Reconciling family member\n8. Passionate moral supporter\n7. Wise personal counselor\n6. Discreet confidant\n5. Resilient emotional anchor\n4. Steadying old acquaintance\n3. Returning close contact\n2. Reflective listener"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Ally:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":image",
              "icons/card-ranksuit-qs.svg",
              ":summary",
              "A. Seasoned survivor\nK. Shadowy insider\nQ. Steady guide\nJ. Cunning trickster\nT. Hardened veteran\n9. Insightful observer\n8. Critical information source\n7. Resistance operative\n6. Precise specialist\n5. Calculated risk-taker\n4. Stalwart guardian\n3. Skilled healer\n2. Keen-eyed scout"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Twist:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "icons/card-ranksuit-kc.svg",
              ":summary",
              "A. Protected group starts conflict\nK. Intrigue originates internally\nQ. Crisis deliberately created\nJ. Competition fixed\nT. Imposter revealed\n9. Agreement traps signers\n8. Structure fails from within\n7. Knowledge misleads\n6. Situation hides ambush\n5. Action framed on group\n4. Honor falsely claimed\n3. Challenge is an illusion\n2. Gain divides group"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Twist:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "icons/card-ranksuit-kd.svg",
              ":summary",
              "A. Wealth is fake\nK. Alliance seeks control\nQ. Goal proves worthless\nJ. Claim is disputed\nT. Success destroys something\n9. Reward demands payment\n8. Intelligence was planted\n7. Backed the wrong side\n6. Infiltration exposes group\n5. Rivalry is family\n4. Mentor staged events\n3. Plan was anticipated\n2. Change favors opponent"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Twist:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "icons/card-ranksuit-kh.svg",
              ":summary",
              "A. Ally is hidden relative\nK. Partner conceals major secret\nQ. Victim actually the instigator\nJ. Mistaken identity\nT. Own actions caused guilt\n9. Bond hides ulterior motive\n8. Promise was never sincere\n7. Past event misinterpreted\n6. Revelation changes relationship\n5. Loyalty has hidden cost\n4. Emotion clouds judgment\n3. Rival is former close friend\n2. Change brings loss"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Twist:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "icons/card-ranksuit-ks.svg",
              ":summary",
              "A. Victory creates bigger problem\nK. Action aids real enemy\nQ. Allies serve hidden agenda\nJ. Success installs worse leader\nT. Choice offers no good outcome\n9. Time pressure is artificial\n8. Decision triggers backlash\n7. Action strengthens opposition\n6. Goal activates trap\n5. Revenge targets wrong person\n4. Identity fabricated\n3. Help comes too late\n2. Prevention causes event"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Payoff:Society",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "icons/card-ranksuit-ac.svg",
              ":summary",
              "A. Hard-won peace\nK. Political compromise reached\nQ. Open conflict de-escalated\nJ. Vulnerable group protected\nT. Broken promises mended\n9. Power balance shifted\n8. Order restored\n7. Hope restored\n6. Rebellion gains ground\n5. Justice served\n4. War averted\n3. Alliances formed\n2. Community rebuilt"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Payoff:Material",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "icons/card-ranksuit-ad.svg",
              ":summary",
              "A. Heritage preserved\nK. Holdings noticeably expanded\nQ. Wealth increased substantially\nJ. Artifact secured\nT. Network influence grown\n9. Enterprise turned profitable\n8. Treasure claimed\n7. Key opportunity seized\n6. Empire foundations laid\n5. Legacy advanced\n4. Status raised\n3. Valuable possession kept\n2. Fortune modestly increased"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Payoff:Personal",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "icons/card-ranksuit-ah.svg",
              ":summary",
              "A. Quiet acceptance of self\nK. Deeper bond formed\nQ. Guilt eased\nJ. Innocence reclaimed\nT. Identity better understood\n9. Old friendships renewed\n8. Romance advances\n7. Cherished memory recovered\n6. A warm homecoming\n5. Sanity steadied\n4. Trust rebuilt\n3. Family ties mended\n2. Loved one returned safely"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Payoff:Fateful",
              ":deck",
              "Story",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":image",
              "icons/card-ranksuit-as.svg",
              ":summary",
              "A. Crisis resolved\nK. Dangerous force contained\nQ. Crisis under control\nJ. Corrupt system overturned\nT. Disaster prevented\n9. Corruption exposed\n8. Immediate threat neutralized\n7. Trapped individuals freed\n6. Painful cycle broken\n5. Severe threat reduced\n4. Fragile stability restored\n3. Imminent collapse averted\n2. Powerful enemy defeated"
            )
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            "Story:Back",
            ":image",
            "images/story/story-back.svg",
            ":layout",
            nx_tactics_base.c_cardlayout_imageonly
          ),
          54,
          false
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-story": nx_tactics_decks_story.e_deck_story
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-story": nx_tactics_decks_story.t_deck_story
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/story",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-story)
    nx_tactics_decks_story.t_deck_story['vx_value'] = {
      name          : "deck-story",
      pkgname       : "nx/tactics/decks/story",
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
      fn            : nx_tactics_decks_story.f_deck_story
    }

  }
}
