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
              "1) Choose a random Plot card\n2) Read the description 'You' section\n3) If you dislike it, choose again\n4) If you like it, the GM may read the rest\n5) If coop, reveal the rest only as needed\n\n* Rank: A=Drive, K=Authority, Q=Revelation, J=Agency, 8-10=Escalation, 5-7=Commitment, 2-4=Instability\n* Suit: C=Social / Institutional, D=Material / Survival, H=Emotional / Relational, S=Existential / Internal"
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
              "1: You - Character in status quo\n2: Need - Desire that motivates action\n3: Go - Crosses into the unknown\n4: Search - Faces trials, new rules, and rising conflict\n5: Find - Achieves goal, but with consequences\n6: Take - Pays the price for success that marks a turning point\n7: Return - Returns to familiar bringing back what was gained or learned\n8: Change - Returns to the beginning but transformed with growth or change"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Domination",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "icons/card-ranksuit-ac.svg",
              ":summary",
              "Power through force and fear\nA. Absolute obedience enforced\nK. Detention imposed without appeal\nQ. Forced removal begins\nJ. Personal freedoms stripped\nT. Constant surveillance imposed\n9. Movement tightly controlled\n8. Isolation from allies enforced\n7. Forced service begins\n6. Identity or role erased\n5. Loved ones seized as leverage\n4. Violence used to compel\n3. Coercive ultimatum delivered\n2. Intimidation displayed"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Material Want",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "icons/card-ranksuit-ad.svg",
              ":summary",
              "You want something concrete\n* You: Defined by lack (Check your balance again)\n* Need: Desire sharpens (Price goes up)\n* Go: Chase opportunity (Submit application)\n* Search: Optimize path (Compare options)\n* Find: Commit resources (Pay the deposit)\n* Take: Stakes attach (Save the receipt)\n* Return: Life reorganizes (Your calendar fills)\n* Change: Goal locked (Stop browsing alternatives)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Hunger",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "icons/card-ranksuit-ah.svg",
              ":summary",
              "You long for connection\n* You: Emotionally guarded (You keep conversations short)\n* Need: Loneliness grows (Evenings stretch quietly)\n* Go: Reach out (Send the message)\n* Search: Test safety (Add a joke)\n* Find: Risk attachment (Wait for the reply)\n* Take: Vulnerability exposed (Your phone stays in your hand)\n* Return: Bonds matter now (Check for responses)\n* Change: Heart engaged (You care if they answer)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Moral Fault Line",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":summary",
              "You fear becoming something worse\n* You: Defined by restraint (Refuse an easy bribe)\n* Need: Pressure tests your code (Rent is overdue)\n* Go: Enter temptation (Return the call)\n* Search: Seek clean options (Ask for legal alternatives)\n* Find: No clean path exists (They shake their head)\n* Take: Tension builds (Don't answer yet)\n* Return: Life narrows (Bills stack on the table)\n* Change: Core conflict set (You stop saying 'never')"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Authority & Law",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "icons/card-ranksuit-kc.svg",
              ":summary",
              "Legitimized power through rule\nA. Extraordinary authority invoked\nK. Law twisted to target you\nQ. Council orders coordinated action\nJ. Formal charges brought\nT. Arrest order issued\n9. Property seizure ordered\n8. Rights or status revoked\n7. Binding judgment delivered\n6. Obedience formally demanded\n5. Inspection demanded\n4. Inquiry opened\n3. Summons delivered\n2. Formal warning issued"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Material Authority",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "icons/card-ranksuit-kd.svg",
              ":summary",
              "You control resources\n* You: Hardened by loss (Experience shows)\n* Need: System requires leadership (Decisions pile up)\n* Go: Allocate decisively (Approve budgets)\n* Search: Perfect outcomes (Stop chasing them)\n* Find: Functional stability (Cash flow steadies)\n* Take: Burden of control (Sign daily)\n* Return: Order restored (Processes resume)\n* Change: You are the gatekeeper (Final approval rests with you)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Steward",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "icons/card-ranksuit-kh.svg",
              ":summary",
              "You carry others' hearts\n* You: Emotionally mature (You stay calm)\n* Need: Stability needed (They look to you)\n* Go: Offer consistent care (You show up daily)\n* Search: Personal gratification (You set it aside)\n* Find: Trust deepens (They confide freely)\n* Take: Emotional labor accepted (You listen again)\n* Return: Relationships stabilize (Conflict softens)\n* Change: You become an anchor (They rely on you)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Moral Authority",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "icons/card-ranksuit-ks.svg",
              ":summary",
              "You embody the consequence\n* You: Fully formed (You no longer flinch)\n* Need: Final stance required (They ask what to do)\n* Go: Act consistently with self (Answer immediately)\n* Search: External validation (Ignore the room)\n* Find: Inner alignment achieved (The answer fits)\n* Take: Responsibility accepted (Sign your name)\n* Return: Others respond accordingly (They obey or leave)\n* Change: You are what you chose (Nothing left to hide)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Conspiracy",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "icons/card-ranksuit-qc.svg",
              ":summary",
              "Hidden coordination and deceit\nA. Reality-scale deception begins\nK. Deep conspiracy exposed\nQ. Institutional cover-up begins\nJ. Trusted betrayal revealed\nT. Coordinated deception launched\n9. False narrative spreads\n8. Evidence planted\n7. Frame job initiated\n6. Misinformation campaign\n5. Secret meetings held\n4. Hidden agendas surface\n3. Quiet lies spread\n2. Suspicious coincidence"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Material Truth",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "icons/card-ranksuit-qd.svg",
              ":summary",
              "You see the real cost\n* You: Numbers-focused (You avoid emotion)\n* Need: Full accounting appears (Audit completes)\n* Go: Review outcomes honestly (Read line by line)\n* Search: Minimize damage (Highlight excuses)\n* Find: Trade-offs exposed (Patterns emerge)\n* Take: Regret or pride (Lean back)\n* Return: Goals reassessed (Plans rewritten)\n* Change: Values recalibrated (Different priorities chosen)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Truth",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "icons/card-ranksuit-qh.svg",
              ":summary",
              "You understand the real bond\n* You: Confused (Mixed signals linger)\n* Need: Clarity arrives (Overhear the truth)\n* Go: Reinterpret past moments (Memories reframe)\n* Search: Excuses dissolve (Details align)\n* Find: Love or illusion revealed (It's obvious now)\n* Take: Acceptance settles in (Exhale)\n* Return: Relationship redefined (Act accordingly)\n* Change: Emotional honesty achieved (No more pretending)"
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
              "You see what you've become\n* You: Defensive (Justify past choices)\n* Need: Reflection forced (Evidence lands on your desk)\n* Go: Face consequences honestly (Read it all)\n* Search: Deny responsibility (Try to argue)\n* Find: Self-awareness hits (Your signature repeats)\n* Take: Shame or resolve (Close your eyes)\n* Return: Past reframed (See the pattern)\n* Change: Moral reckoning complete (Stop pretending)"
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
              "Strategic Control",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "icons/card-ranksuit-jd.svg",
              ":summary",
              "You seize financial initiative\n* You: Cornered but clever (You prepare quietly)\n* Need: Survival requires bold move (Time nearly out)\n* Go: Execute risky plan (You trigger the transfer)\n* Search: Maximize leverage (You time the release)\n* Find: Control shifts (Numbers jump)\n* Take: Pressure peaks (Calls flood in)\n* Return: Opponents respond (Meetings scheduled fast)\n* Change: You drive the game (For now)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Declaration",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "icons/card-ranksuit-jh.svg",
              ":summary",
              "You assert your feelings\n* You: Tired of hiding (You stop deflecting)\n* Need: Ambiguity hurts too much (They press you)\n* Go: Speak plainly (You state what you want)\n* Search: Avoid manipulation (You don't soften it)\n* Find: Emotional truth lands (They go quiet)\n* Take: Consequences accepted (You don't backtrack)\n* Return: Relationship clarified (Yes or no)\n* Change: Emotional agency claimed (You chose honesty)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Ruthless Choice",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "icons/card-ranksuit-js.svg",
              ":summary",
              "You act without hesitation\n* You: Hardened (You don't ask permission)\n* Need: Crisis demands action (Clock is ticking)\n* Go: Take command (Interrupt the meeting)\n* Search: Ignore doubt (Cut objections off)\n* Find: Decisive strike (Shut it down)\n* Take: Moral cost accepted (Don't apologize)\n* Return: Order imposed (People follow silently)\n* Change: You become the blade (They fear you)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Collapse",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "icons/card-ranksuit-tc.svg",
              ":summary",
              "Failure and breakdown\nA. Total systemic collapse\nK. Ruling structure fails\nQ. Institutional breakdown\nJ. Organization collapses\nT. Infrastructure fails\n9. Supply systems break\n8. Financial structure collapses\n7. Mass panic erupts\n6. Widespread disorder\n5. Rioting begins\n4. Local breakdown\n3. Operational failure\n2. Minor disruption"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Total Loss",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "icons/card-ranksuit-td.svg",
              ":summary",
              "You lose what you built\n* You: Overleveraged (Nothing left untouched)\n* Need: Failure finalizes (Notice arrives)\n* Go: Face consequences (Attend the hearing)\n* Search: Hidden escape (Call favors)\n* Find: Assets seized (Boxes are labeled)\n* Take: Shock lands (Sit silently)\n* Return: Life stripped down (Rooms feel empty)\n* Change: Survival mode engaged (You plan tomorrow only)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Ruin",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "icons/card-ranksuit-th.svg",
              ":summary",
              "Everything spills at once\n* You: Emotionally exposed (You stop filtering)\n* Need: Truth erupts (Old wounds surface)\n* Go: Endure confrontation (Don't interrupt)\n* Search: Hold anything intact (Reach out)\n* Find: Bonds shatter (Multiple people walk away)\n* Take: Grief floods in (Sit alone crying)\n* Return: Silence follows (Phone stays dark)\n* Change: Emotional landscape reset (Nothing familiar remains)"
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
              "The damage spreads beyond control\n* You: Past restraint (No one expects mercy)\n* Need: Fallout accelerates (Reports stack hourly)\n* Go: Make brutal choices (Triage who matters)\n* Search: Prevent worst outcome (Cancel evacuations)\n* Find: Multiple losses occur (Names cross your desk)\n* Take: Weight overwhelms (Sit in silence)\n* Return: World altered (Neighborhoods are empty)\n* Change: Endgame triggered (There's no fixing this)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Containment",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "icons/card-ranksuit-9c.svg",
              ":summary",
              "Restriction and enclosure\nA. Total lockdown imposed\nK. Martial control declared\nQ. Forced relocation begins\nJ. Targeted isolation imposed\nT. Quarantine enforced\n9. Borders sealed\n8. Communication cut\n7. Checkpoints established\n6. Curfew imposed\n5. Movement restricted\n4. Area confined\n3. Limited access imposed\n2. Temporary isolation"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Financial Freefall",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "icons/card-ranksuit-9d.svg",
              ":summary",
              "Losses outrun recovery\n* You: Desperate (You stop eating out)\n* Need: Final chance appears (One risky option remains)\n* Go: Gamble everything (You move all funds)\n* Search: Miracle angle (You watch the market)\n* Find: Odds against you (Numbers slide)\n* Take: Panic spikes (You hit refresh repeatedly)\n* Return: Systems close in (Accounts lock temporarily)\n* Change: Collapse or reversal imminent (Hours matter)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Crisis",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "icons/card-ranksuit-9h.svg",
              ":summary",
              "You can't sustain the bond\n* You: Overextended (You look exhausted)\n* Need: Emotional reckoning (They demand honesty)\n* Go: Confront the truth (Sit down)\n* Search: Salvage connection (Bargain)\n* Find: Limits exposed (You can't promise)\n* Take: Heartbreak hits (They stand to leave)\n* Return: Emotional vacuum (Door closes)\n* Change: Attachment broken or remade (Nothing in between)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Moral Collapse",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "icons/card-ranksuit-9s.svg",
              ":summary",
              "Your code barely exists\n* You: Exhausted (You stop arguing)\n* Need: One more decision (They push paperwork at you)\n* Go: Act automatically (You sign without reading)\n* Search: Justify nothing (You don't explain)\n* Find: You don't hesitate (That scares you)\n* Take: Self-disgust peaks (You scrub your hands raw)\n* Return: Identity frays (Old photos feel unfamiliar)\n* Change: Collapse imminent (Something will break)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Organized Opposition",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "icons/card-ranksuit-8c.svg",
              ":summary",
              "Collective hostile forces\nA. System-wide opposition mobilized\nK. Powerful institution intervenes\nQ. Coordinated factions align\nJ. Criminal syndicate acts\nT. Paramilitary group mobilizes\n9. Cartel or network intervenes\n8. Militant cell activates\n7. Organized gang acts\n6. Rival organization opposes\n5. Political faction resists\n4. Trade group pressures\n3. Local clique mobilizes\n2. Hostile group forms"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Spiraling Costs",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "icons/card-ranksuit-8d.svg",
              ":summary",
              "Expenses exceed plans\n* You: Stretched thin (You juggle accounts)\n* Need: New losses emerge (Equipment fails)\n* Go: Secure more resources (Request a loan)\n* Search: Short-term fixes (Delay payments)\n* Find: Long-term damage (Penalties accrue)\n* Take: Stability erodes (Miss a deadline)\n* Return: Life reorganizes (Bills dominate conversations)\n* Change: Risk dominates decisions (Survival thinking)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Overload",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "icons/card-ranksuit-8h.svg",
              ":summary",
              "You're pulled too many ways\n* You: Emotionally invested (Everyone needs you)\n* Need: Competing needs clash (Two calls come at once)\n* Go: Try to satisfy all (Say yes twice)\n* Search: Balance feelings (Rush between them)\n* Find: Someone neglected (They wait alone)\n* Take: Guilt intensifies (See the missed call)\n* Return: Relationships strain (Voices harden)\n* Change: Emotional limits reached (Something must drop)"
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
              "You can't contain the damage\n* You: Already compromised (You're known for it now)\n* Need: Fallout spreads (2nd incident occurs)\n* Go: Intervene again (step in personally)\n* Search: Limit exposure (Silence a witness)\n* Find: New harm caused (Another innocent suffers)\n* Take: Moral weight spikes (Nausea afterward)\n* Return: Normal collapses (Routines break down)\n* Change: Crisis mode engaged (You stop sleeping)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Enforcers",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "icons/card-ranksuit-7c.svg",
              ":summary",
              "Agents of violence or control\nA. Execution squad deployed\nK. State enforcers dispatched\nQ. Elite task force\nJ. Personal enforcer confronts you\nT. Special operatives engage\n9. Mercenary unit intervenes\n8. Hit team deployed\n7. Armed guards confront you\n6. Trained fighters engage\n5. Security detail blocks you\n4. Thugs intimidate\n3. Strong-arm agents threaten\n2. Threatening messengers"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Irreversible Deal",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "icons/card-ranksuit-7d.svg",
              ":summary",
              "You sign away options\n* You: Calculating (Last chance)\n* Need: Deadline hits (Contract expires today)\n* Go: Finalize agreement (You sign digitally)\n* Search: Escape clauses (You scroll fast)\n* Find: Terms bind (Signature locks in)\n* Take: Relief and fear (Your hands shake)\n* Return: Freedom reduced (Obligations populate your inbox)\n* Change: Future constrained (Your path narrows)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Betrayal",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "icons/card-ranksuit-7h.svg",
              ":summary",
              "You hurt someone you love\n* You: Caring (You promised otherwise)\n* Need: Conflict forces choice (Both can't be spared)\n* Go: Act anyway (Choose one)\n* Search: Soften blow (Explain yourself)\n* Find: Trust breaks (They stop listening)\n* Take: Pain immediate (Tears fall)\n* Return: Bond damaged (Messages go unanswered)\n* Change: Relationship transformed (Never the same)"
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
              "You cross a line you cannot uncross\n* You: Defined by a personal rule (Swore you wouldn't do this)\n* Need: Obedience now costs too much (Refusal ends everything)\n* Go: Enter the moral gray (Show up anyway)\n* Search: Rationalize exceptions (Just this once)\n* Find: Break the rule (Pull the trigger)\n* Take: Immediate price paid (Someone screams)\n* Return: Old life feels wrong (home feels awry)\n* Change: New self locked in (Don't look away next time)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Pursuit",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "icons/card-ranksuit-6c.svg",
              ":summary",
              "Hunting and capture\nA. No-escape manhunt\nK. Authority-led pursuit\nQ. Coordinated tracking effort\nJ. Professional hunter deployed\nT. Bounty hunt begins\n9. Regional search launched\n8. Coordinated chase\n7. Surveillance operation\n6. Persistent tail\n5. Locals questioned\n4. Identity challenged\n3. Brief pursuit\n2. Casual observation"
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
              "One bet forces another\n* You: Committed (Too much invested)\n* Need: Loss threatens (Numbers turn red)\n* Go: Double down (Inject more funds)\n* Search: Smarter angle (Change strategy)\n* Find: Exposure grows (Safety net shrinks)\n* Take: Volatility spikes (Check prices hourly)\n* Return: Sleep suffers (Wake at night)\n* Change: Exit difficult (Walking away feels worse)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Deep Bond",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "icons/card-ranksuit-6h.svg",
              ":summary",
              "You rely on someone\n* You: Attached (You text without thinking)\n* Need: Support required (A problem overwhelms you)\n* Go: Ask for help (You call late)\n* Search: Avoid burdening (You apologize)\n* Find: Dependence forms (They stay on the line)\n* Take: Stakes double (They know too much now)\n* Return: Separation costly (You dread silence)\n* Change: Intertwined fates (Choices affect both)"
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
              "You repeat the wrong choice\n* You: Uneasy (You avoid eye contact)\n* Need: Situation worsens (Another problem surfaces)\n* Go: Act similarly (Issue the same command)\n* Search: Limit damage (Add conditions)\n* Find: Harm increases (More people affected)\n* Take: Guilt accumulates (Drink alone)\n* Return: Life constricts (Fewer calls returned)\n* Change: Descent underway (Stopping feels impossible)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Violence",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "icons/card-ranksuit-5c.svg",
              ":summary",
              "Direct physical harm\nA. Mass killing attempt\nK. Authorized lethal force\nQ. Coordinated assault\nJ. Assassination attempt\nT. Armed attack\n9. Group beating\n8. Attempted murder\n7. Severe assault\n6. Armed confrontation\n5. Street fight\n4. Physical attack\n3. Threatened violence\n2. Rough handling"
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
              "You commit resources heavily\n* You: Conservative (You triple-check)\n* Need: Opportunity peaks (Clock ticking)\n* Go: Invest fully (Authorize payment)\n* Search: Final checks (Skim the contract)\n* Find: Funds transferred (Confirmation appears)\n* Take: Exposure locked (Account dips sharply)\n* Return: Waiting begins (Nothing to do now)\n* Change: Outcome matters deeply (This must work)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Confession",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "icons/card-ranksuit-5h.svg",
              ":summary",
              "You reveal true feeling\n* You: Reserved (You rehearse silently)\n* Need: Silence hurts more (Can't sleep)\n* Go: Open up (Ask to talk)\n* Search: Gentle phrasing (Hedge your words)\n* Find: Truth lands (Say it plainly)\n* Take: Emotional impact (They stare at you)\n* Return: Relationship redefined (Nothing is casual now)\n* Change: Vulnerability real (You've said it)"
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
              "You do something irreversible\n* You: Rule-bound (You hesitate)\n* Need: Cost too high (They start counting down)\n* Go: Act decisively (Nod once)\n* Search: None left (Moment passes)\n* Find: Boundary broken (Give the order)\n* Take: Immediate fallout (Someone protests)\n* Return: Reality altered (People look at you differently)\n* Change: Path narrowed (There's no undo)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Theft",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "icons/card-ranksuit-4c.svg",
              ":summary",
              "A. Human trafficking operation\nK. Kidnapping for ransom\nQ. Organized armed robbery\nJ. Bandit ambush\nT. Home invasion robbery\n9. Carjacking\n8. Mugging\n7. Embezzlement\n6. Burglary\n5. Extortion\n4. Blackmail attempt\n3. Pickpocketing\n2. Shoplifting"
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
              "You reach tolerance limit\n* You: Risk-aware (You hesitate)\n* Need: Pay more or quit (They ask directly)\n* Go: Reassess position (Open spreadsheets)\n* Search: Last-minute savings (Cut corners)\n* Find: All-in required (They won't budge)\n* Take: Stress peaks (Rub your temples)\n* Return: Moment stretches (Call goes quiet)\n* Change: Commitment unavoidable (You must choose)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Choice",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "icons/card-ranksuit-4h.svg",
              ":summary",
              "You must decide how much to care\n* You: Hesitant (You don't label it)\n* Need: Relationship deepens (They ask what this is)\n* Go: Stay close (Don't pull away)\n* Search: Emotional boundaries (Set rules)\n* Find: Boundaries fail (Break them first)\n* Take: Exposure increases (Share a secret)\n* Return: Normal shifts (Closeness is assumed)\n* Change: Heart engaged (Neutrality gone)"
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
              "A. Crushing Walls\nK. Descending Spikes\nQ. Flooding Room\nJ. Poison Gas\nT. Slicing Pendulums\n9. Collapsing Ceiling\n8. Spiked Pitfall\n7. Poison Darts\n6. Flame Jets\n5. Swinging Log\n4. Arrow Trap\n3. Pit Trap\n2. Tripwire Alarm"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intimidation",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "icons/card-ranksuit-3c.svg",
              ":summary",
              "Threats meant to coerce\nA. Terror campaign initiated\nK. Authority-backed intimidation begins\nQ. Organized intimidation effort\nJ. Personal intimidation attempt\nT. Credible death threat issued\n9. Stalking campaign begins\n8. Threats against loved ones\n7. Public threats delivered\n6. Repeated warnings issued\n5. Coercive messages sent\n4. Menacing presence displayed\n3. Verbal threats made\n2. Hostile remarks"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Investment Made",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "icons/card-ranksuit-3d.svg",
              ":summary",
              "You put something in\n* You: Calculating (You run the numbers)\n* Need: Opportunity demands buy-in (Deadline looms)\n* Go: Commit partially (You transfer funds)\n* Search: Hedge risk (You keep some back)\n* Find: No refunds (The terms update)\n* Take: Anxiety rises (You refresh the page)\n* Return: Waiting period (Days drag)\n* Change: Skin in game (Loss would hurt)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Attachment Forms",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "icons/card-ranksuit-3h.svg",
              ":summary",
              "You start to care\n* You: Guarded (You limit contact)\n* Need: Presence feels good (Stay longer)\n* Go: Spend time (Accept another invitation)\n* Search: Control exposure (Avoid deeper topics)\n* Find: Bond deepens (Laugh easily)\n* Take: Dependence begins (Miss them afterward)\n* Return: Absence hurts (Notice the quiet)\n* Change: Emotional stake set (Distance now matters)"
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
              "You sense future cost\n* You: Still resisting (You insist it's fine)\n* Need: Pressure repeats (Request comes again)\n* Go: Face it directly (Attend the meeting)\n* Search: Delay decision (Ask for more time)\n* Find: Delay fails (They want an answer now)\n* Take: Stress accumulates (Hands shake)\n* Return: Life tightens (Sleep gets shorter)\n* Change: Conflict active (Avoidance stops working)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Obstruction",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "icons/card-ranksuit-2c.svg",
              ":summary",
              "Non-violent interference\nA. Systemic shutdown imposed\nK. Ruler blocks all access\nQ. Coordinated obstruction begins\nJ. Legal restraint imposed\nT. Infrastructure sabotaged\n9. Supplies deliberately denied\n8. Permit or passage revoked\n7. Access forcibly restricted\n6. Equipment tampered with\n5. Route deliberately blocked\n4. Critical resource withheld\n3. Deliberate delay imposed\n2. Minor interference"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Resource Strain",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "icons/card-ranksuit-2d.svg",
              ":summary",
              "You lose something small\n* You: Stable enough (You shrug it off)\n* Need: Loss pinches (A fee posts overnight)\n* Go: Cover the gap (You move money around)\n* Search: Cheap fix (You cancel a subscription)\n* Find: Hidden cost (Another bill arrives)\n* Take: Pressure rises (You tighten spending)\n* Return: Routine stressed (Small luxuries vanish)\n* Change: Security weakened (You start tracking closely)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Friction",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "icons/card-ranksuit-2h.svg",
              ":summary",
              "You feel unexpectedly affected\n* You: Detached (You keep it professional)\n* Need: Feelings intrude (Their comment lingers)\n* Go: Stay present (You don't end the conversation)\n* Search: Suppress emotion (You change the subject)\n* Find: Reaction slips (Your tone sharpens)\n* Take: Awkwardness grows (They pause)\n* Return: Relationship altered (Future talks feel cautious)\n* Change: Detachment cracked (You replay the moment)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Small Compromise",
              ":deck",
              "Story Event",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "icons/card-ranksuit-2s.svg",
              ":summary",
              "You bend a rule slightly\n* You: Principled but flexible (You skip one safety check)\n* Need: Convenience tempts (Everyone's watching the clock)\n* Go: Allow exception (You wave it through)\n* Search: Minimize harm (You double-check later)\n* Find: Rule weakens (Others notice)\n* Take: Unease lingers (You replay it that night)\n* Return: Normal resumes (Work continues)\n* Change: Line thinned (Next time feels easier)"
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
