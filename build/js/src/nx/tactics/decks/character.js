'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_character {

  /**
   * @function deck_character
   * Character Deck
   * @return {deck}
   */
  static t_deck_character = {
    vx_type: vx_core.t_type
  }
  static e_deck_character = {
    vx_type: nx_tactics_decks_character.t_deck_character
  }

  // (func deck-character)
  static f_deck_character() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Character",
      ":image",
      "images/character/character-back.svg",
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
              "Character:How-To",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":image",
              "icons/card-ranksuit-wb.svg",
              ":summary",
              "Steps for Character Inspiration:\n* Separate Character deck by Rank\n* Starting with Rank 2, for each Rank choose or randomize result\n\nRandomize:\n* For each Rank (eg Rank=2)\n* Reveal Fate (eg K of Swords)\n* Match Suit of Character and Fate (eg 2 of Swords)\n* Match Rank of Character and Fate (eg K on the 2 of Swords)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Character:Key",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":image",
              "icons/card-ranksuit-wr.svg",
              ":summary",
              "A. Occupation: Job/Role\nK. Reputation: Public Image\nQ. Appearance: Visual Trait\nJ. Quirks: Physical Habits\nT. Speech: Verbal Style\n9. Demeanor: Outward Attitude\n8. Nature: True Personality\n7. Motivation: Deep Drive\n6. Goal: Current Priority\n5. Bias: Prejudice/Blind Spot\n4. Strength: Special Virtue\n3. Flaw: Core Weakness\n2. Secret: Hidden Truth"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Occupation:Labor",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "icons/card-ranksuit-ac.svg",
              ":summary",
              "A. Leader\nK. Guard\nQ. Farmer\nJ. Builder\nT. Soldier\n9. Laborer\n8. Artisan\n7. Driver\n6. Miner\n5. Fisher\n4. Courier\n3. Performer\n2. Bartender"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Occupation:Professional",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "icons/card-ranksuit-ad.svg",
              ":summary",
              "A. Scientist/Wizard\nK. Inventor/Artificer\nQ. Chemist/Alchemist\nJ. Researcher/Sage\nT. Executive\n9. Merchant\n8. Banker\n7. Engineer\n6. Lawyer\n5. Broker\n4. Jeweller\n3. Manager\n2. Salesperson"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Occupation:Personal",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "icons/card-ranksuit-ah.svg",
              ":summary",
              "A. Caregiver\nK. Teacher\nQ. Healer/Cleric\nJ. Host/Barkeep/Innkeeper\nT. Counselor\n9. Artist\n8. Musician\n7. Cook\n6. Gardener\n5. Storyteller\n4. Librarian\n3. Nanny\n2. Companion"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Occupation:Dark",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":image",
              "icons/card-ranksuit-as.svg",
              ":summary",
              "A. Enforcer\nK. Spy\nQ. Smuggler\nJ. Thief\nT. Assassin\n9. Informant\n8. Gambler\n7. Fence\n6. Tracker\n5. Bounty Hunter\n4. Jailor\n3. Gravedigger\n2. Beggar"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Reputation:Everyday",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "icons/card-ranksuit-kc.svg",
              ":summary",
              "A. Respected community leader\nK. Strict but fair authority\nQ. Hardworking role model\nJ. Loyal neighborhood protector\nT. Dependable worker\n9. Average, unremarkable citizen\n8. Stubborn traditionalist\n7. Nosy rule-enforcer\n6. Rough, crude type\n5. Hot-tempered brawler\n4. Lazy slacker\n3. Gossiping troublemaker\n2. Known petty criminal"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Reputation:Ambition",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "icons/card-ranksuit-kd.svg",
              ":summary",
              "A. Powerful industry titan\nK. Respected elite heir\nQ. Polished social star\nJ. Ambitious rising talent\nT. Successful professional\n9. Competent but boring\n8. Work-obsessed machine\n7. Ruthless opportunist\n6. Cold social climber\n5. Arrogant show-off\n4. Shallow status-seeker\n3. Greedy money-grubber\n2. Failed wannabe"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Reputation:Personal",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "icons/card-ranksuit-kh.svg",
              ":summary",
              "A. Beloved family head\nK. Warm neighborhood fixture\nQ. Gentle, well-liked soul\nJ. Cheerful local favorite\nT. Reliable friend to all\n9. Quiet, harmless type\n8. Meddlesome but kind\n7. Overly emotional pushover\n6. Naive and gullible\n5. Clingy and needy\n4. Fragile and helpless\n3. Nosy busybody\n2. Pitied lonely figure"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Reputation:Dark",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "icons/card-ranksuit-ks.svg",
              ":summary",
              "A. Feared hidden power\nK. Dangerous lone wolf\nQ. Mysterious enigma\nJ. Brooding dark horse\nT. Intense, capable survivor\n9. Suspicious recluse\n8. Bitter failed dreamer\n7. Ruthless manipulator\n6. Cold-hearted schemer\n5. Volatile loose cannon\n4. Haunted tragic figure\n3. Notorious outcast\n2. Despised traitor"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Appearance:Everyday",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "icons/card-ranksuit-qc.svg",
              ":summary",
              "A. Strong, muscular build\nK. Thick, brown braid\nQ. Large, capable hands\nJ. Rugged, tanned face\nT. Thick, powerful arms\n9. Warm amber eyes\n8. Short, dark haircut\n7. Sturdy, curvy frame\n6. Prominent muscle definition\n5. Visible old scars\n4. Thick, strong neck\n3. Long, black tied-back hair\n2. Storm-gray eyes"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Appearance:Striking",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "icons/card-ranksuit-qd.svg",
              ":summary",
              "A. Tall, commanding stature\nK. Sleek, jet-black long hair\nQ. Prominent full bust\nJ. Strong, defined jaw\nT. Elegant, long fingers\n9. Striking blue eyes\n8. Athletic, toned build\n7. Pronounced curvy hips\n6. Neat, platinum blonde\n5. Sharp green eyes\n4. Straight, confident posture\n3. High cheekbones\n2. Dark, piercing eyes"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Appearance:Warm",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "icons/card-ranksuit-qh.svg",
              ":summary",
              "A. Tall, protective stature\nK. Long, flowing auburn hair\nQ. Soft, motherly frame\nJ. Broad, strong shoulders\nT. Large, expressive hands\n9. Warm, hazel eyes\n8. Tall, comforting height\n7. Curvy hips and waist\n6. Thick, blonde wavy hair\n5. Big, capable hands\n4. Wide, open posture\n3. Deep brown eyes\n2. Soft, red curly locks"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Appearance:Dark",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":image",
              "icons/card-ranksuit-qs.svg",
              ":summary",
              "A. Tall, gaunt frame\nK. Long, raven-black hair\nQ. Sharp, defined torso\nJ. Pale, drawn complexion\nT. Deep-set violet eyes\n9. Visible faded tattoo\n8. Tense, rigid posture\n7. Large old wound scar\n6. Long, silver-streaked hair\n5. Sharp hip bones\n4. Thin, angular build\n3. Wild, crimson spiked hair\n2. Icy pale blue eyes"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Quirk:Energetic",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":image",
              "icons/card-ranksuit-jc.svg",
              ":summary",
              "A. Forceful fist pump\nK. Slap table when emphasizing\nQ. Exaggerated arm stretches\nJ. Head scratch when confused\nT. Rolled-up sleeves flex\n9. Big, circular arm waves\n8. Pointing at self proudly\n7. Energetic finger snaps\n6. Rough neck crack\n5. Dramatic face palm\n4. Chest thump salute\n3. Victory V-sign\n2. Exaggerated shrug"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Quirk:Dramatic",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "icons/card-ranksuit-jd.svg",
              ":summary",
              "A. Hair sweep with one hand\nK. Smug chin lift\nQ. Dramatic wrist flick\nJ. Slow, deliberate glasses push\nT. Elegant finger steeple\n9. Dramatic coat flip\n8. Sharp eyebrow arch\n7. Hand-through-hair confidently\n6. Precise necktie adjustment\n5. Slow, knowing head tilt\n4. Quick, dismissive hand wave\n3. Proud crossed-arms stance\n2. Slow, elegant hand fan"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Quirk:Endearing",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "icons/card-ranksuit-jh.svg",
              ":summary",
              "A. Dramatic hand-to-heart clutch\nK. Exaggerated grateful bowing\nQ. Big, sparkling eye widenings\nJ. Playful hair flip\nT. Enthusiastic double thumbs-up\n9. Frequent cheek-puffing pout\n8. Shoulder bounces when excited\n7. Covering mouth when laughing\n6. Twirling a lock of hair\n5. Claps hands in delight\n4. Exaggerated hand wringing\n3. Finger-to-lips 'shh' gesture\n2. Big, sweeping hugs"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Quirk:Intense",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "icons/card-ranksuit-js.svg",
              ":summary",
              "A. Slow, menacing finger crack\nK. Hood pull-over\nQ. Sharp tongue click\nJ. Dramatic hair ruffle\nT. Slow, anxious pacing\n9. Slow head turn stare\n8. Arms crossed, finger tap\n7. Slow, mocking head shake\n6. Slow, fist clenching\n5. Sudden intense lean forward\n4. Sharp collar pop\n3. Slow, threatening neck roll\n2. Exaggerated eye roll"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Speech:Direct",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "icons/card-ranksuit-tc.svg",
              ":summary",
              "A. Blunt - Cut to it\nK. Commanding - Do it now\nQ. Loud - Listen up!\nJ. Challenging - You sure?\nT. Practical - Fix it\n9. Casual - Whatever\n8. Traditional - Back in my day\n7. Inclusive - We're in this\n6. Stingy - That costs extra\n5. Suspicious - What's the catch?\n4. Motivational - Get moving\n3. Passionate - No way!\n2. Clipped - Yes / No"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Speech:Confident",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "icons/card-ranksuit-td.svg",
              ":summary",
              "A. Authoritative - That is final\nK. Sophisticated - Quite so\nQ. Elegant - How delightful\nJ. Persuasive - Trust me on this\nT. Precise - To be exact\n9. Visionary - Picture this\n8. Assertive - Make it happen\n7. Pompous - One does not simply\n6. Professional - As agreed\n5. Competitive - I expected better\n4. Charming - Allow me\n3. Proud - Naturally\n2. Efficient - Proceed"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Ruin",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "icons/card-ranksuit-th.svg",
              ":summary",
              "Speech:Warm\nA. Caring - It'll be alright\nK. Gentle - Take your time\nQ. Reassuring - You're not alone\nJ. Playful - Oh, come on!\nT. Optimistic - Things will improve\n9. Affectionate - My dear\n8. Comforting - I've got you\n7. Encouraging - You can do this\n6. Casual - No worries\n5. Empathetic - I understand\n4. Hesitant - Well, maybe\n3. Cheerful - That's great!\n2. Sincere - I mean it"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Speech:Guarded",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":image",
              "icons/card-ranksuit-ts.svg",
              ":summary",
              "A. Detached - Irrelevant\nK. Menacing - Choose carefully\nQ. Mysterious - You don't know\nJ. Sarcastic - How original\nT. Brooding - It doesn't matter\n9. Skeptical - Prove it\n8. Disdain - How quaint\n7. Cruel - Pathetic\n6. Guarded - Not your business\n5. Volatile - Watch yourself\n4. Restrained - Enough\n3. Cutting - Spare me\n2. Secretive - You don't need to know"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Demeanor:Direct",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "icons/card-ranksuit-9c.svg",
              ":summary",
              "A. Blunt and straightforward\nK. Commanding and decisive\nQ. Loud and outgoing\nJ. Challenging and competitive\nT. Practical and no-nonsense\n9. Gossip-prone and chatty\n8. Traditional and respectful\n7. Group-oriented and inclusive\n6. Rough and unpolished\n5. Accusatory and suspicious\n4. Loyal and protective\n3. Passionate and fiery\n2. Quiet and observant"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Demeanor:Professional",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "icons/card-ranksuit-9d.svg",
              ":summary",
              "A. Confident and authoritative\nK. Polished and sophisticated\nQ. Composed and elegant\nJ. Ambitious and driven\nT. Formal and reserved\n9. Calculating and strategic\n8. Energetic and assertive\n7. Visionary and inspiring\n6. Precise and organized\n5. Competitive and sharp\n4. Witty and charming\n3. Proud and self-assured\n2. Direct and efficient"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Demeanor:Warm",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "icons/card-ranksuit-9h.svg",
              ":summary",
              "A. Open and welcoming\nK. Affectionate and touchy\nQ. Gentle and nurturing\nJ. Playful and teasing\nT. Calm and reassuring\n9. Cheerful and optimistic\n8. Relaxed and easygoing\n7. Kind and attentive\n6. Casual and friendly\n5. Emotional and expressive\n4. Hesitant but warm\n3. Bubbly and enthusiastic\n2. Sincere and earnest"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Demeanor:Guarded",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "icons/card-ranksuit-9s.svg",
              ":summary",
              "A. Cold and distant\nK. Threatening and intimidating\nQ. Mysterious and evasive\nJ. Sarcastic and mocking\nT. Brooding and intense\n9. Suspicious and paranoid\n8. Condescending and superior\n7. Bitter and resentful\n6. Deceptive and manipulative\n5. Angry and volatile\n4. Withdrawn and silent\n3. Cutting and cruel\n2. Secretive and guarded"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Nature:Direct",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "icons/card-ranksuit-8c.svg",
              ":summary",
              "A. Honorable\nK. Dutiful\nQ. Blunt\nJ. Protective\nT. Hardworking\n9. Traditional\n8. Reliable\n7. Community-minded\n6. Stubborn\n5. Suspicious\n4. Courageous\n3. Passionate\n2. Straightforward"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Nature:Driven",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "icons/card-ranksuit-8d.svg",
              ":summary",
              "A. Ruthlessly ambitious\nK. Proud\nQ. Perfectionist\nJ. Competitive\nT. Strategic\n9. Disciplined\n8. Visionary\n7. Calculating\n8. Resourceful\n5. Independent\n4. Charismatic\n3. Arrogant\n2. Pragmatic"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Nature:Warm",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "icons/card-ranksuit-8h.svg",
              ":summary",
              "A. Deeply loyal\nK. Self-sacrificing\nQ. Empathetic\nJ. Optimistic\nT. Forgiving\n9. Romantic\n8. Generous\n7. Nurturing\n6. Trusting\n5. Sentimental\n4. Vulnerable\n3. Cheerful\n2. Innocent"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Nature:Wounded",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":image",
              "icons/card-ranksuit-8s.svg",
              ":summary",
              "A. Brooding\nK. Vengeful\nQ. Secretive\nJ. Cynical\nT. Tormented\n9. Resentful\n8. Manipulative\n7. Bitter\n6. Guarded\n5. Volatile\n4. Lonely\n3. Ruthless\n2. Haunted"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Motivation:Duty",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "icons/card-ranksuit-7c.svg",
              ":summary",
              "A. Uphold family honor\nK. Fulfill sworn duty\nQ. Serve the community\nJ. Protect the weak\nT. Live by personal code\n9. Maintain traditions\n8. Earn respect through work\n7. Repay debt of gratitude\n6. Defend what's right\n5. Achieve justice\n4. Lead others well\n3. Sacrifice for greater good\n2. Follow the rules always"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Motivation:Status",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "icons/card-ranksuit-7d.svg",
              ":summary",
              "A. Rise to the very top\nK. Secure family legacy\nQ. Overcome humble origins\nJ. Gain respect of peers\nT. Build an empire\n9. Prove personal worth\n8. Achieve financial independence\n7. Surpass rivals\n6. Attain perfect success\n5. Redeem family name\n4. Control own destiny\n3. Amass power and influence\n2. Escape poverty forever"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Motivation:Bond",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "icons/card-ranksuit-7h.svg",
              ":summary",
              "A. Protect loved ones at all costs\nK. Restore broken family ties\nQ. Find or reunite with lost love\nJ. Earn forgiveness from family\nT. Honor parent's memory\n9. Build a warm home\n8. Repay old kindness\n7. Keep childhood promise\n6. Shield others from pain\n5. Prove unwavering loyalty\n4. Heal emotional wounds\n3. Live for close relationships\n2. Seek true emotional connection"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Motivation:Redemption",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":image",
              "icons/card-ranksuit-7s.svg",
              ":summary",
              "A. Avenge past wrong\nK. Uncover hidden truth\nQ. Redeem past mistake\nJ. Break cycle of suffering\nT. Confront old betrayer\n9. Atone for guilt\n8. Survive despite odds\n7. Expose corruption\n6. Reclaim lost dignity\n5. Endure to prove strength\n4. Hide from past\n3. Seek final closure\n2. Carry burden alone"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Goal:Duty",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "icons/card-ranksuit-6c.svg",
              ":summary",
              "A. Defend family name publicly\nK. Complete assigned task\nQ. Organize community event\nJ. Rescue someone in danger\nT. Uphold honor in duel\n9. Preserve dying tradition\n8. Gain elder's blessing\n7. Return borrowed item\n6. Stop local injustice\n5. Mediate current dispute\n4. Train successor\n3. Perform required sacrifice\n2. Obey latest order"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Goal:Status",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":image",
              "icons/card-ranksuit-6d.svg",
              ":summary",
              "A. Win promotion\nK. Close inheritance deal\nQ. Secure marriage proposal\nJ. Sabotage rival's project\nT. Sign major contract\n9. Pass crucial exam\n8. Buy key property\n7. Launch product\n6. Expand business branch\n5. Recover lost investment\n4. Attend elite event\n3. Eliminate direct competitor\n2. Pay off urgent debt"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Goal:Relationship",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "icons/card-ranksuit-6h.svg",
              ":summary",
              "A. Reunite with estranged family\nK. Confess hidden feelings\nQ. Secretly help loved one\nJ. Apologize to old friend\nT. Locate missing person\n9. Deliver final message\n8. Repay favor\n7. Keep promise\n6. Save failing marriage\n5. Prove loyalty in crisis\n4. Share hidden truth\n3. Arrange family reunion\n2. Make someone smile"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Goal:Redemption",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":image",
              "icons/card-ranksuit-6s.svg",
              ":summary",
              "A. Confront betrayer face-to-face\nK. Steal back evidence\nQ. Confess past sin\nJ. Break harmful pattern\nT. Track down enemy\n9. Execute revenge plan\n8. Survive current threat\n7. Clear name in hearing\n6. Retrieve stolen item\n5. Face personal fear\n4. Destroy old reminder\n3. Force final confrontation\n2. Bury the secret deeper"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Bias:Social",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "icons/card-ranksuit-5c.svg",
              ":summary",
              "A. Honors tradition\nK. Respects authority\nQ. Values hard work\nJ. Distrusts outsiders\nT. Favors the practical\n9. Judges by reputation\n8. Believes in community rules\n7. Prioritizes duty\n6. Suspicious of change\n5. Dislikes rule-breakers\n4. Favors the loyal\n3. Passionate about fairness\n2. Believes actions speak louder"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Bias:Status",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":image",
              "icons/card-ranksuit-5d.svg",
              ":summary",
              "A. Respects wealth and power\nK. Looks down on the poor\nQ. Values education highly\nJ. Judges by appearance\nT. Favors winners\n9. Distrusts the uneducated\n8. Believes in meritocracy\n7. Prioritizes ambition\n6. Suspicious of laziness\n5. Dislikes failure\n4. Favors the well-connected\n3. Proud of own achievements\n2. Believes money solves problems"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Bias:Emotional",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "icons/card-ranksuit-5h.svg",
              ":summary",
              "A. Trusts family above all\nK. Believes in true love\nQ. Sees good in everyone\nJ. Favors the underdog\nT. Judges by kindness shown\n9. Romanticizes the past\n8. Dislikes emotional coldness\n7. Prioritizes close relationships\n6. Suspicious of loners\n5. Forgives too easily\n4. Distrusts those who hide feelings\n3. Favors cheerful people\n2. Believes everyone deserves second chances"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Bias:Wounded",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":image",
              "icons/card-ranksuit-5s.svg",
              ":summary",
              "A. Trusts no one\nK. Sees threats everywhere\nQ. Believes people are selfish\nJ. Distrusts kindness\nT. Judges harshly\n9. Resents the privileged\n8. Believes in survival of fittest\n7. Prioritizes self-preservation\n6. Suspicious of motives\n5. Dislikes weakness\n4. Favors the cunning\n3. Bitter toward the fortunate\n2. Believes betrayal is inevitable"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Strength:Direct",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "icons/card-ranksuit-4c.svg",
              ":summary",
              "A. Steadfast honor\nK. Unwavering duty\nQ. Blunt honesty\nJ. Fierce protectiveness\nT. Tireless work ethic\n9. Deep respect for tradition\n8. Reliable stability\n7. Strong community spirit\n6. Stubborn endurance\n5. Keen suspicion\n4. Raw courage\n3. Passionate conviction\n2. Clear directness"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Strength:Drive",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":image",
              "icons/card-ranksuit-4d.svg",
              ":summary",
              "A. Ruthless determination\nK. Unyielding pride\nQ. Flawless discipline\nJ. Sharp competitiveness\nT. Brilliant strategy\n9. Iron self-control\n8. Clear vision\n7. Resourceful cunning\n6. Perfect organization\n5. Relentless drive\n4. Magnetic charisma\n3. Confident arrogance\n2. Practical efficiency"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Strength:Warm",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "icons/card-ranksuit-4h.svg",
              ":summary",
              "A. Unbreakable loyalty\nK. Selfless sacrifice\nQ. Deep empathy\nJ. Endless optimism\nT. Infinite forgiveness\n9. Gentle wisdom\n8. Quiet generosity\n7. Nurturing care\n6. Steadfast trust\n5. Emotional resilience\n4. Pure vulnerability\n3. Infectious cheer\n2. Innocent heart"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Strength:Dark",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":image",
              "icons/card-ranksuit-4s.svg",
              ":summary",
              "A. Cold resilience\nK. Ruthless cunning\nQ. Hidden depth\nJ. Sharp cynicism\nT. Intense focus\n9. Quiet endurance\n8. Masterful manipulation\n7. Bitter wisdom\n6. Iron guardedness\n5. Volatile energy\n4. Profound solitude\n3. Merciless efficiency\n2. Haunted insight"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Flaw:Direct",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "icons/card-ranksuit-3c.svg",
              ":summary",
              "A. Rigid honor\nK. Blind duty\nQ. Brutal bluntness\nJ. Overprotective\nT. Exhausting workaholic\n9. Stifling tradition\n8. Stubborn reliability\n7. Narrow community focus\n6. Immovable stubbornness\n5. Paralyzing suspicion\n4. Reckless courage\n3. Fiery temper\n2. Harsh directness"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Flaw:Drive",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "icons/card-ranksuit-3d.svg",
              ":summary",
              "A. Ruthless ambition\nK. Crushing pride\nQ. Cold perfectionism\nJ. Cutthroat rivalry\nT. Manipulative strategy\n9. Obsessive control\n8. Blind vision\n7. Arrogant cunning\n6. Rigid organization\n5. Relentless greed\n4. Shallow charisma\n3. Insufferable arrogance\n2. Soulless efficiency"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Flaw:Emotional",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "icons/card-ranksuit-3h.svg",
              ":summary",
              "A. Blind loyalty\nK. Excessive sacrifice\nQ. Overwhelming empathy\nJ. Naïve optimism\nT. Too forgiving\n9. Clinging sentimentality\n8. Hidden insecurity\n7. Smothering care\n6. Gullible trust\n5. Emotional fragility\n4. Painful vulnerability\n3. Forced cheer\n2. Childlike innocence"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Flaw:Wounded",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":image",
              "icons/card-ranksuit-3s.svg",
              ":summary",
              "A. Emotional detachment\nK. Consuming vengeance\nQ. Dangerous secrecy\nJ. Corrosive cynicism\nT. Self-destructive intensity\n9. Deep resentment\n8. Ruthless manipulation\n7. Bitter isolation\n6. Impenetrable guardedness\n5. Explosive volatility\n4. Crippling loneliness\n3. Merciless cruelty\n2. Haunting guilt"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Secret:Duty",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "icons/card-ranksuit-2c.svg",
              ":summary",
              "A. Betrayed old comrade\nK. Deserted duty\nQ. Covered up community crime\nJ. Lost family honor\nT. Took blame for another\n9. Broke sacred promise\n8. Hid shameful failure\n7. Protected criminal relative\n6. Falsified war record\n5. Caused workplace tragedy\n4. Abandoned post in crisis\n3. Stole from community\n2. Framed innocent person"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Secret:Status",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "icons/card-ranksuit-2d.svg",
              ":summary",
              "A. Born illegitimate heir\nK. Faked entire background\nQ. Stole family fortune\nJ. Married for money\nT. Bankrupted own company\n9. Blackmailed way to top\n8. Hidden poverty origins\n7. Paid for false credentials\n6. Abandoned poor family\n5. Secret gambling debt\n4. Bribed for position\n3. Real name erased\n2. Impersonating successor"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Secret:Family",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "icons/card-ranksuit-2h.svg",
              ":summary",
              "A. Caused family separation\nK. Hidden sibling exists\nQ. Gave up child long ago\nJ. First love never ended\nT. Sacrificed dream for family\n9. Carries parent's dying wish\n8. Protected someone at great cost\n7. Never told true feelings\n6. Faked own death\n5. Bears unshared grief\n4. Changed name to escape past\n3. Keeps forbidden love letter\n2. Raised wrong child as own"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Secret:Dark",
              ":deck",
              "Character",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "icons/card-ranksuit-2s.svg",
              ":summary",
              "A. Responsible for parent's death\nK. Seeks revenge quietly\nQ. Witnessed unforgivable act\nJ. Survived supposed death\nT. Committed past crime\n9. Knows killer's identity\n8. Betrayed first love\n7. Caused sibling's ruin\n6. Escaped prison\n5. Lives under false identity\n4. Destroyed evidence\n3. Abandoned dying friend\n2. Hides fatal knowledge"
            )
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            "StoryArc:Back",
            ":image",
            "images/character/character-back.svg",
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
      "deck-character": nx_tactics_decks_character.e_deck_character
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-character": nx_tactics_decks_character.t_deck_character
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/character",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-character)
    nx_tactics_decks_character.t_deck_character['vx_value'] = {
      name          : "deck-character",
      pkgname       : "nx/tactics/decks/character",
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
      fn            : nx_tactics_decks_character.f_deck_character
    }

  }
}
