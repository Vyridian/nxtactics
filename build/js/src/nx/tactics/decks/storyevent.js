'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_storyevent {

  /**
   * @function deck_storyevent
   * Story Event Deck
   * @return {deck}
   */
  static t_deck_storyevent = {
    vx_type: vx_core.t_type
  }
  static e_deck_storyevent = {
    vx_type: nx_tactics_decks_storyevent.t_deck_storyevent
  }

  // (func deck-storyevent)
  static f_deck_storyevent() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Story Event",
      ":image",
      "images/storyevent/storyevent-back.svg",
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
              "Story Event:How-To",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":image",
              "icons/card-ranksuit-wb.svg",
              ":summary",
              "1) Choose a random Plot card\n2) Read the description 'You' section\n3) If you dislike it, choose again\n4) If you like it, the GM may read the rest\n5) If coop, reveal the rest only as needed\n\n* Rank. A=Drive, K=Authority, Q=Revelation, J=Agency, 8-10=Escalation, 5-7=Commitment, 2-4=Instability\n* Suit. C=Social / Institutional, D=Material / Survival, H=Emotional / Relational, S=Existential / Internal"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Story Circle",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":image",
              "icons/card-ranksuit-wr.svg",
              ":reference",
              "* Dan Harmon's Story Circle",
              ":summary",
              "1. You - Character in status quo\n2. Need - Desire that motivates action\n3. Go - Crosses into the unknown\n4. Search - Faces trials, new rules, and rising conflict\n5. Find - Achieves goal, but with consequences\n6. Take - Pays the price for success that marks a turning point\n7. Return - Returns to familiar bringing back what was gained or learned\n8. Change - Returns to the beginning but transformed with growth or change"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Disaster",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "icons/card-ranksuit-ac.svg",
              ":summary",
              "A. Building collapses suddenly\nK. Flood waters rise fast\nQ. Fire spreads uncontrollably\nJ. Earthquake shakes ground\nT. Storm destroys everything\n9. Explosion rocks area\n8. Landslide blocks path\n7. Power failure in crisis\n6. Gas leak ignites\n5. Bridge fails under weight\n4. Vehicle crash chaos\n3. Crowd panic stampede\n2. Structural failure imminent"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Mystery",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "icons/card-ranksuit-ad.svg",
              ":summary",
              "A. Clues in locked diary\nK. Witness with partial memory\nQ. Disappearing evidence trail\nJ. Forged letter surfaces\nT. Anonymous tip leads astray\n9. Timeline doesn't match\n8. Hidden compartment discovered\n7. Suspect's alibi crumbles\n6. Coded message deciphered\n5. Family portrait hides clue\n4. Forgotten phone call recalled\n3. Shadowy figure in photo\n2. Truth buried below"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Character",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "icons/card-ranksuit-ah.svg",
              ":summary",
              "A. Flawed hero's quiet self-reflection\nK. Side character's hidden vulnerability exposed\nQ. Protagonist's internal contradiction surfaces\nJ. Supporting role's unspoken pain revealed\nT. Antagonist's private moment of doubt\n9. Mentor's past failure confessed\n8. Love interest's inner struggle shown\n6. Friend's long-carried burden shared\n5. Family member's secret fear admitted\n4. Rival's unexpected humanity glimpsed\n3. Child character's growing self-awareness\n2. Comic relief's serious hidden depth"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Adventure:Quest",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":summary",
              "A. Retrieve legendary artifact\nK. Fulfill ancient prophecy\nQ. Recover lost family heirloom\nJ. Seek ultimate knowledge\nT. Deliver critical message\n9. Find cure for plague\n8. Claim throne rightfully\n7. Break ancient curse\n6. Unite scattered allies\n5. Recover stolen crown\n4. Map to hidden realm\n3. Prove worthiness\n2. Final piece of puzzle"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:War",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "icons/card-ranksuit-kc.svg",
              ":summary",
              "A. Invasion force arrives\nK. Border conflict erupts\nQ. Civil war breaks out\nJ. Guerrilla ambush strikes\nT. Aerial bombardment begins\n9. Siege weapons deployed\n8. Troop movement detected\n7. Spy network compromised\n6. Supply lines cut\n5. Defenses breached\n4. Retreat ordered under fire\n3. Counterattack launched\n2. Truce breaks dramatically"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Fear",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "icons/card-ranksuit-kd.svg",
              ":summary",
              "A. Surprise attack in safe place\nK. Hidden predator strikes\nQ. Sudden body change\nJ. Impossible phenomenon\nT. Silence violently broken\n9. Creepy figure appears\n8. Grotesque body transformation\n7. Monster appears from nowhere\n6. Sudden apparition\n5. Mechanical disaster strikes\n4. Object becomes threatening\n3. Trapped in confined space\n2. Shear drop appears"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Relationship",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "icons/card-ranksuit-kh.svg",
              ":summary",
              "A. Tense lovers' confrontation\nK. Old friends drifting apart\nQ. Siblings arguing over duty\nJ. Mentor-protégé bond tested\nT. Forbidden attraction acknowledged\n9. Ex-partners forced together\n8. Parent-child misunderstanding deepens\n7. Best friends hiding feelings\n6. Rivals developing respect\n5. Marriage hitting emotional crisis\n4. Teacher-student connection grows\n3. Neighbors becoming allies\n2. Strangers sharing quiet moment"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Adventure:Expedition",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "icons/card-ranksuit-ks.svg",
              ":summary",
              "A. Cross vast desert\nK. Scale impossible mountain\nQ. Navigate dangerous seas\nJ. Trek through jungle\nT. Arctic ice crossing\n9. Underground cavern descent\n8. Long march home\n7. Escort VIP through peril\n6. Migration to new land\n5. Pilgrimage to sacred site\n4. Explore uncharted territory\n3. Forced exile march\n2. Odyssey of return"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Monsters",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "icons/card-ranksuit-qc.svg",
              ":summary",
              "A. Creature emerges from shadows\nK. Pack surrounds group\nQ. Giant beast attacks town\nJ. Swarm overwhelms defenses\nT. Shapeshifter revealed\n9. Unnatural horde rises\n8. Flying horror swoops down\n7. Burrowing monster surfaces\n6. Parasite infects host\n5. Angry guardian awakens\n4. Mutated animal charges\n3. Demonic entity manifests\n2. Legendary beast sighted"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Cat-and-Mouse",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "icons/card-ranksuit-qd.svg",
              ":summary",
              "A. Hunter becomes the prey\nK. Bait and switch\nQ. Hunter toys with prey\nJ. Hunter one step ahead\nT. Prey exploits oversight\n9. Prey lures in hunter\n8. Prey anticipates a trap\n7. Prey bluffs\n6. Hunter tightens the noose\n5. Opportunity appears\n4. Forced decision\n3. A mask revealed\n2. Trail ends"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Family",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "icons/card-ranksuit-qh.svg",
              ":summary",
              "A. Family reunion turns emotional\nK. Parent's sacrifice for child\nQ. Sibling rivalry intensifies\nJ. Child discovers hidden relative\nT. Grandparent's final wish\n9. In-law conflict erupts\n8. Family business succession fight\n7. Adopted child seeks origins\n6. Holiday gathering disaster\n5. Parent hides serious illness\n4. Child leaves home dramatically\n3. Family covers scandal\n2. Long-lost relative returns"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Moral Truth",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":image",
              "icons/card-ranksuit-qs.svg",
              ":summary",
              "You see what you've become\n* You. Defensive (Justify past choices)\n* Need. Reflection forced (Evidence lands on your desk)\n* Go. Face consequences honestly (Read it all)\n* Search. Deny responsibility (Try to argue)\n* Find. Self-awareness hits (Your signature repeats)\n* Take. Shame or resolve (Close your eyes)\n* Return. Past reframed (See the pattern)\n* Change. Moral reckoning complete (Stop pretending)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Nemesis",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":image",
              "icons/card-ranksuit-jc.svg",
              ":summary",
              "Personal recurring enemy\nA. Final confrontation sought\nK. State-backed rival emerges\nQ. Long-term manipulator revealed\nJ. Personal nemesis confronts you\nT. Arch-rival escalates\n9. Vendetta intensifies\n8. Obsessive pursuit begins\n7. Rival leader challenges you\n6. Recurring foe returns\n5. Dangerous rival acts\n4. Personal enemy strikes\n3. Hostile competitor appears\n2. Irritating antagonist"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Conspiracy",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "icons/card-ranksuit-jd.svg",
              ":summary",
              "A. Everyone seems connected\nK. Official story contradicted\nQ. Evidence systematically destroyed\nJ. Witnesses disappear quietly\nT. Pattern too perfect\n9. Puppet masters hinted\n8. Web of lies exposed\n7. Trusted institution involved\n6. Connections run deep\n5. Cover-up reaches high\n4. Truth suppressed violently\n3. Group silences leaker\n2. Expose wider conspiracy"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Come-of-Age",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "icons/card-ranksuit-jh.svg",
              ":summary",
              "A. First heartbreak changes outlook\nK. Teen defies family expectations\nQ. Young adult leaves home\nJ. Student faces first moral choice\nT. Graduation revelation moment\n9. First job teaches harsh truth\n8. Friendship group fractures\n7. Discovering personal truth\n6. Taking real responsibility\n5. Losing childhood illusions\n4. Standing up to authority\n3. Making irreversible choice\n2. First taste of freedom"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Adventure:Exploration",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "icons/card-ranksuit-js.svg",
              ":summary",
              "A. Enter ancient ruins\nK. Discover lost civilization\nQ. Map unknown island\nJ. Delve forbidden temple\nT. Search hidden cave system\n9. Investigate strange phenomenon\n8. Survey new territory\n7. Find hidden oasis\n6. Explore abandoned city\n5. Uncover buried secrets\n4. Venture into fog forest\n3. Locate hidden valley\n2. First contact with unknown"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Tournament",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "icons/card-ranksuit-tc.svg",
              ":summary",
              "A. Championship match starts\nK. Arena crowd roars\nQ. Gladiator combat announced\nJ. Martial arts bracket revealed\nT. Prize fight betting heavy\n9. Elimination round begins\n8. Team competition heats up\n7. Skill contest judged\n6. Underground fight club\n5. Sports championship final\n4. Duel of champions\n3. Winner-take-all bout\n2. Exhibition match turns serious"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Crime",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "icons/card-ranksuit-td.svg",
              ":summary",
              "A. Bank vault breached\nK. Kidnapping for ransom\nQ. Drug deal ambush\nJ. Corporate espionage theft\nT. Black market transaction\n9. Identity theft scheme\n8. Arson to cover tracks\n7. Smuggling ring bust\n6. Forgery of documents\n5. Home invasion robbery\n4. Bribery attempt fails\n3. Money laundering operation\n2. Petty theft escalates"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Social",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "icons/card-ranksuit-th.svg",
              ":summary",
              "A. Class divide causes pain\nK. Workplace prejudice exposed\nQ. Social media rumor spreads\nJ. Neighborhood judgment surfaces\nT. Cultural clash in group\n9. Gender expectation challenged\n8. Age gap causes misunderstanding\n7. Accommodation denied quietly\n6. Immigrant family struggles\n5. Acceptance tested privately\n4. Religious difference strains bond\n3. Poverty vs wealth tension\n2. Rural vs urban conflict"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Irreversible Harm",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":image",
              "icons/card-ranksuit-ts.svg",
              ":summary",
              "The damage spreads beyond control\n* You. Past restraint (No one expects mercy)\n* Need. Fallout accelerates (Reports stack hourly)\n* Go. Make brutal choices (Triage who matters)\n* Search. Prevent worst outcome (Cancel evacuations)\n* Find. Multiple losses occur (Names cross your desk)\n* Take. Weight overwhelms (Sit in silence)\n* Return. World altered (Neighborhoods are empty)\n* Change. Endgame triggered (There's no fixing this)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Chase",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "icons/card-ranksuit-9c.svg",
              ":summary",
              "A. Street pursuit\nK. High-speed chase\nQ. Rooftop parkour\nJ. Horseback pursuit\nT. Boat chase\n9. Chase between vehicles\n8. Cliffside chase\n7. Woodland chase\n6. Crowd-weaving getaway\n5. Market scramble\n4. Stairwell sprint\n3. Shortcut gamble\n2. Sewer dash"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Heist",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "icons/card-ranksuit-9d.svg",
              ":summary",
              "A. Vault blueprint studied\nK. Team roles assigned\nQ. Security mapped out\nJ. Inside man recruited\nT. Timing rehearsal critical\n9. Disguise prepared meticulously\n8. Getaway route planned\n7. Alarm bypass tested\n6. Safe cracking practiced\n5. Distraction team ready\n4. Double-cross suspected\n3. Final countdown begins\n2. Complication arises"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Class-Power",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "icons/card-ranksuit-9h.svg",
              ":summary",
              "A. Poor meets wealthy dramatically\nK. Humble background hidden\nQ. Servant overhears secrets\nJ. Self-made threatens old elite\nT. Corporate takeover affects lives\n9. Arranged partnership for status\n8. Social climbing through connection\n7. Inherited burden weighs heavy\n6. Class revenge begins quietly\n5. Power imbalance in bond\n4. Status symbol causes envy\n3. Elite excludes newcomer\n2. Rags-to-riches backlash"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Adventure:Survival",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "icons/card-ranksuit-9s.svg",
              ":summary",
              "A. Stranded in wilderness\nK. Food and water scarce\nQ. Harsh weather hits\nJ. Injured and alone\nT. Build shelter from nothing\n9. Hunt for food\n8. Signal for rescue\n7. Avoid predators\n6. Navigate without map\n5. Conserve dwindling supplies\n4. Treat own wounds\n3. Endure extreme cold/heat\n2. Wait out the storm"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Criminal",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "icons/card-ranksuit-8c.svg",
              ":summary",
              "A. Bank robbery in progress\nK. Gang territory war\nQ. Mob meeting interrupted\nJ. Drug deal gone bad\nT. Armed home invasion\n9. Vehicle theft ring exposed\n8. Protection racket collection\n7. Smuggling operation busted\n6. Counterfeit money scheme\n5. Kidnapping ransom demand\n4. Arson for insurance\n3. Street mugging turns violent\n2. Pickpocket team"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Deception",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "icons/card-ranksuit-8d.svg",
              ":summary",
              "A. False identity assumed\nK. Double agent infiltrates\nQ. Forged documents used\nJ. Alibi carefully constructed\nT. Impersonation discovered\n9. Lie unravels slowly\n8. Hidden camera catches truth\n7. Betrayer confesses under pressure\n6. Pattern of deception emerges\n5. Slip in cover story\n4. Disguise fails at worst moment\n3. Truth too obvious\n2. Deception costs everything"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Morality",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "icons/card-ranksuit-8h.svg",
              ":summary",
              "A. No clean choice available\nK. Lesser evil haunts character\nQ. Whistleblower faces fallout\nJ. Lie to protect loved one\nT. Ends justify means question\n9. Moral compromise for good\n8. Gray area decision\n7. Values vs norms conflict\n6. Forgiveness vs justice debate\n5. Truth vs kindness struggle\n4. Loyalty vs honesty test\n3. Self-interest vs altruism\n2. Right choice costs everything"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Consequences Multiply",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":image",
              "icons/card-ranksuit-8s.svg",
              ":summary",
              "You can't contain the damage\n* You. Already compromised (You're known for it now)\n* Need. Fallout spreads (2nd incident occurs)\n* Go. Intervene again (step in personally)\n* Search. Limit exposure (Silence a witness)\n* Find. New harm caused (Another innocent suffers)\n* Take. Moral weight spikes (Nausea afterward)\n* Return. Normal collapses (Routines break down)\n* Change. Crisis mode engaged (You stop sleeping)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Revenge",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "icons/card-ranksuit-7c.svg",
              ":summary",
              "A. Vengeance oath sworn\nK. Target finally located\nQ. Revenge plan executed\nJ. Old enemy confronted\nT. Family honor avenged\n9. Past wrong repaid\n8. Cold dish served\n7. Betrayer hunted down\n6. Score settled violently\n5. Justice outside law\n4. Cycle of vengeance continues\n3. Final payback delivered\n2. Revenge consumes character"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Thriller",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "icons/card-ranksuit-7d.svg",
              ":summary",
              "A. \nK. Burning building\nQ. Trapped underground\nJ. Cornered in dead end\nT. Communications cut\n9. Hostage endangered\n8. Runaway vehicle\n7. Poison progressing\n6. Collapsing path\n5. Rising water\n4. Lights go out\n3. Fragile floor\n2. Running out of air"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Redemption",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "icons/card-ranksuit-7h.svg",
              ":summary",
              "A. Seeking forgiveness from past\nK. Atoning for old wrong\nQ. Former wrongdoer helps others\nJ. Reforming through connection\nT. Making amends with family\n9. Public apology for mistake\n8. Mentor redeems past failure\n7. Finding purpose after fall\n6. Overcoming personal shame\n5. Returning what was taken\n4. Protecting once harmed\n3. Proving changed self\n2. Final good act"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Point of No Return",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":image",
              "icons/card-ranksuit-7s.svg",
              ":summary",
              "You cross a line you cannot uncross\n* You. Defined by a personal rule (Swore you wouldn't do this)\n* Need. Obedience now costs too much (Refusal ends everything)\n* Go. Enter the moral gray (Show up anyway)\n* Search. Rationalize exceptions (Just this once)\n* Find. Break the rule (Pull the trigger)\n* Take. Immediate price paid (Someone screams)\n* Return. Old life feels wrong (home feels awry)\n* Change. New self locked in (Don't look away next time)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Ambush",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "icons/card-ranksuit-6c.svg",
              ":summary",
              "A. Surprise attack from shadows\nK. Roadside trap sprung\nQ. Building entrance blocked\nJ. Sniper fire opens\nT. Alley surround complete\n9. Vehicle ram attack\n8. Poisoned food/drink\n7. Fake surrender trap\n6. Hidden attackers emerge\n5. Bridge ambush point\n4. Sleep attack on camp\n3. Meeting turns deadly\n2. Betrayal leads to trap"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Compounding Risk",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":image",
              "icons/card-ranksuit-6d.svg",
              ":summary",
              "One bet forces another\n* You. Committed (Too much invested)\n* Need. Loss threatens (Numbers turn red)\n* Go. Double down (Inject more funds)\n* Search. Smarter angle (Change strategy)\n* Find. Exposure grows (Safety net shrinks)\n* Take. Volatility spikes (Check prices hourly)\n* Return. Sleep suffers (Wake at night)\n* Change. Exit difficult (Walking away feels worse)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Tragedy",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "icons/card-ranksuit-6h.svg",
              ":summary",
              "A. Inevitable downfall starts\nK. Fatal flaw exposed\nQ. Loved one lost unnecessarily\nJ. Good intentions cause harm\nT. Misunderstanding leads to loss\n9. Sacrifice fails to save\n8. Betrayal destroys bond\n7. Victory feels empty\n6. Family torn apart\n5. Love never reconciled\n4. Child suffers parent's choice\n3. Cycle of pain continues\n2. Everything falls apart"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Escalating Acts",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":image",
              "icons/card-ranksuit-6s.svg",
              ":summary",
              "You repeat the wrong choice\n* You. Uneasy (You avoid eye contact)\n* Need. Situation worsens (Another problem surfaces)\n* Go. Act similarly (Issue the same command)\n* Search. Limit damage (Add conditions)\n* Find. Harm increases (More people affected)\n* Take. Guilt accumulates (Drink alone)\n* Return. Life constricts (Fewer calls returned)\n* Change. Descent underway (Stopping feels impossible)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Assault",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "icons/card-ranksuit-5c.svg",
              ":summary",
              "A. Full building invasion\nK. Siege engines fire\nQ. Breach and clear operation\nJ. Storm the gates\nT. Room-by-room sweep\n9. Overwhelm defenses\n8. Coordinated multi-front attack\n7. Night raid begins\n6. Wall scaling assault\n5. Tunnel infiltration\n4. Air drop insertion\n3. Vehicle assault ram\n2. Direct charge forward"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Major Spend",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":image",
              "icons/card-ranksuit-5d.svg",
              ":summary",
              "5D Suspense:Legal\nA. Court case opens\nK. Evidence submitted\nQ. Witness testimony challenged\nJ. Legal loophole exploited\nT. Appeal filed urgently\n9. Lawyer conflict of interest\n8. Jury selection drama\n7. Procedural delay requested\n6. Confession admissibility debated\n5. Statute limitation argued\n4. Technicality raised\n3. Judge bias questioned\n2. Verdict deliberation begins"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Psychological",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "icons/card-ranksuit-5h.svg",
              ":summary",
              "A. Obsessive thoughts dominate\nK. Denial of obvious truth\nQ. Trauma flashback triggers\nJ. Distorted reality perception\nT. Guilt manifests strongly\n9. Paranoia about others\n8. Repressed memory returns\n7. Self-destructive pattern\n6. Identity crisis deepens\n5. Manipulation erodes trust\n4. Addiction controls choices\n3. Delusion grows\n2. Inner doubt overwhelms"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Line Crossed",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":image",
              "icons/card-ranksuit-5s.svg",
              ":summary",
              "You do something irreversible\n* You. Rule-bound (You hesitate)\n* Need. Cost too high (They start counting down)\n* Go. Act decisively (Nod once)\n* Search. None left (Moment passes)\n* Find. Boundary broken (Give the order)\n* Take. Immediate fallout (Someone protests)\n* Return. Reality altered (People look at you differently)\n* Change. Path narrowed (There's no undo)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Last-Stand",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "icons/card-ranksuit-4c.svg",
              ":summary",
              "A. Final defense position\nK. Back to wall fight\nQ. Outnumbered hold line\nJ. No retreat possible\nT. Ammo running low\n9. Wounded but fighting\n8. Surrounded completely\n7. Sacrifice to buy time\n6. Heroic final charge\n5. Defend the vulnerable\n4. Bridge hold against horde\n3. Rooftop last defense\n2. One against many"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Risk Threshold",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":image",
              "icons/card-ranksuit-4d.svg",
              ":summary",
              "You reach tolerance limit\n* You. Risk-aware (You hesitate)\n* Need. Pay more or quit (They ask directly)\n* Go. Reassess position (Open spreadsheets)\n* Search. Last-minute savings (Cut corners)\n* Find. All-in required (They won't budge)\n* Take. Stress peaks (Rub your temples)\n* Return. Moment stretches (Call goes quiet)\n* Change. Commitment unavoidable (You must choose)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Identity",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "icons/card-ranksuit-4h.svg",
              ":summary",
              "A. Discovering hidden background\nK. Fake self exposed\nQ. Personal truth journey\nJ. Impersonating another\nT. Cultural conflict internal\n9. Name change to escape\n8. Mistaken for someone else\n7. Finding authentic self\n6. Alienation from roots\n5. Reinventing completely\n4. Questioning life path\n3. Mask vs truth struggle\n2. Authenticity vs expectation"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Trap",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":image",
              "icons/card-ranksuit-4s.svg",
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Escape",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "icons/card-ranksuit-3c.svg",
              ":summary",
              "A. Escape captivity\nK. Flee burning building\nQ. Evade capture in city\nJ. Tunnel escape route\nT. Jump from moving vehicle\n9. Disguise and slip away\n8. Hostage escape attempt\n7. Race through crowds\n6. Swim to freedom\n5. Climb down wall\n4. Hide in plain sight\n3. Fake death escape\n2. Dash to safety"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Intrigue",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "icons/card-ranksuit-3d.svg",
              ":summary",
              "A. Secret deal bypasses authority\nK. Allies quietly align interests\nQ. Project progress stalled\nJ. Engineered crisis\nT. Favors shift opinions\n9. Rivals position for succession\n8. Policy details leak\n7. Data passed via dead drop\n6. Misleading action staged\n5. Agent exposed or turned\n4. Search for infiltrator\n3. Evidence covertly altered\n2. Operative disavowed/targeted"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Grief",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "icons/card-ranksuit-3h.svg",
              ":summary",
              "A. Fresh loss overwhelms\nK. Anniversary triggers memories\nQ. Unable to move on\nJ. Grief turns to anger\nT. Empty space felt deeply\n9. Mourning lost time\n8. Illness acceptance struggle\n7. Sudden death shock\n6. Loss of future dreams\n5. Pet death devastates\n4. Aging parent decline\n3. Regret over past\n2. Fear of own end"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Growing Discomfort",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":image",
              "icons/card-ranksuit-3s.svg",
              ":summary",
              "You sense future cost\n* You. Still resisting (You insist it's fine)\n* Need. Pressure repeats (Request comes again)\n* Go. Face it directly (Attend the meeting)\n* Search. Delay decision (Ask for more time)\n* Find. Delay fails (They want an answer now)\n* Take. Stress accumulates (Hands shake)\n* Return. Life tightens (Sleep gets shorter)\n* Change. Conflict active (Avoidance stops working)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Action:Rescue",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "icons/card-ranksuit-2c.svg",
              ":summary",
              "A. Save captive from danger\nK. Extract wounded comrade\nQ. Child in peril\nJ. Hostage negotiation fails\nT. Infiltrate to extract\n9. Carry injured to safety\n8. Dive into water rescue\n7. Pull from burning structure\n6. Fight through to target\n5. Medical emergency extraction\n4. Kidnapped loved one\n3. Trapped in collapse\n2. Last-minute save"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Suspense:Exposure",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "icons/card-ranksuit-2d.svg",
              ":summary",
              "A. Secret picture leaked\nK. Anonymous tip sent\nQ. Recording surfaces\nJ. Witness comes forward\nT. Past mistake publicized\n9. Cover-up unravels\n8. Recording leaked as warning\n7. Reputation on line\n6. Truth about to break\n5. Scandal headline ready\n4. Mourning lost time\n3. Mourning lost time\n2. Secret no longer safe"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Drama:Comedy",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "icons/card-ranksuit-2h.svg",
              ":summary",
              "A. Hilarious misunderstanding chain\nK. Fake relationship pretense\nQ. Embarrassing public blunder\nJ. Clumsy romantic attempt\nT. Family gathering chaos\n9. Workplace mistake cascade\n8. Mistaken identity comedy\n7. Exaggerated jealousy scene\n6. Drunken honest confession\n5. Food-related mishap\n4. Timing-perfect wardrobe fail\n3. Slapstick physical humor\n2. Pun-filled awkward talk"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Adventure:Traps",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "icons/card-ranksuit-2s.svg",
              ":summary",
              "A. Crushing walls\nK. Descending spikes\nQ. Flooding room\nJ. Poison gas\nT. Slicing blades\n9. Collapsing ceiling\n8. Pitfall\n7. Poison darts\n6. Flame jets\n5. Swinging log\n4. Arrow trap\n3. Net trap\n2. Tripwire alarm"
            )
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            "StoryArc:Back",
            ":image",
            "images/storyevent/storyevent-back.svg",
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
      "deck-storyevent": nx_tactics_decks_storyevent.e_deck_storyevent
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-storyevent": nx_tactics_decks_storyevent.t_deck_storyevent
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/storyevent",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-storyevent)
    nx_tactics_decks_storyevent.t_deck_storyevent['vx_value'] = {
      name          : "deck-storyevent",
      pkgname       : "nx/tactics/decks/storyevent",
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
      fn            : nx_tactics_decks_storyevent.f_deck_storyevent
    }

  }
}
