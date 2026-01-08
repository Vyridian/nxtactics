'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_storyarc {

  /**
   * @function deck_storyarc
   * Story Arc Deck
   * @return {deck}
   */
  static t_deck_storyarc = {
    vx_type: vx_core.t_type
  }
  static e_deck_storyarc = {
    vx_type: nx_tactics_decks_storyarc.t_deck_storyarc
  }

  // (func deck-storyarc)
  static f_deck_storyarc() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Story Arc",
      ":image",
      "images/storyarc/storyarc-back.svg",
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
              "Story Arc:How-To",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":image",
              "icons/card-ranksuit-wb.svg",
              ":summary",
              "1) Choose a random Plot card\n2) Read the 'You' section\n3) If you dislike it, choose again\n4) If you like it, GM reads the rest\n5) If coop, reveal the rest only as needed\n\n* Rank: A=Drive, K=Authority, Q=Revelation, J=Agency, 8-10=Escalation, 5-7=Commitment, 2-4=Instability\n* Suit: C=Social / Institutional, D=Material / Survival, H=Emotional / Relational, S=Existential / Internal"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Story Circle",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":image",
              "icons/card-ranksuit-wr.svg",
              ":reference",
              "* Dan Harmon's Story Circle",
              ":summary",
              "1: You - Character in status quo\n2: Need - Desire motivates action\n3: Go - Cross into the unknown\n4: Search - Face trials, new rules, and rising conflict\n5: Find - Achieve goal but with consequences\n6: Take - Pay the price that marks a turning point\n7: Return - Return to familiar bringing what was learned\n8: Change - Return to the beginning but transformed with growth or change"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Social Presence",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "icons/card-ranksuit-ac.svg",
              ":summary",
              "You join a group\n* You: An outsider (You stand near the door)\n* Need: Belonging (Scan faces)\n* Go: Introduce yourself (Step forward)\n* Search: Read norms (Watch reactions)\n* Find: Reception (A few nods)\n* Take: Social position assigned (Offered a seat)\n* Return: Group acknowledged (People include you)\n* Change: You exist socially (Not invisible anymore)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Material Want",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":summary",
              "You want something concrete\n* You: Defined by lack (Check your balance again)\n* Need: Desire sharpens (Price goes up)\n* Go: Chase opportunity (Submit application)\n* Search: Optimize path (Compare options)\n* Find: Commit resources (Pay the deposit)\n* Take: Stakes attach (Save the receipt)\n* Return: Life reorganizes (Your calendar fills)\n* Change: Goal locked (Stop browsing alternatives)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Hunger",
              ":deck",
              "Story Arc",
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
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":image",
              "icons/card-ranksuit-as.svg",
              ":summary",
              "You fear becoming something worse\n* You: Defined by restraint (Refuse an easy bribe)\n* Need: Pressure tests your code (Rent is overdue)\n* Go: Enter temptation (Return the call)\n* Search: Seek clean options (Ask for legal alternatives)\n* Find: No clean path exists (They shake their head)\n* Take: Tension builds (Don't answer yet)\n* Return: Life narrows (Bills stack on the table)\n* Change: Core conflict set (You stop saying 'never')"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Institutional Authority",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "icons/card-ranksuit-kc.svg",
              ":summary",
              "You embody the system\n* You: Central figure (Others wait for cues)\n* Need: Stability depends on you (Conflicts escalate upward)\n* Go: Enforce structure (Make the call)\n* Search: Balance fairness and order (Weigh impact)\n* Find: Compliance achieved (Resistance fades)\n* Take: Responsibility absorbed (Blame flows to you)\n* Return: System steadies (Operations resume)\n* Change: You are the institution (Power and burden unite)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Material Authority",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":summary",
              "You control resources\n* You: Hardened by loss (Experience shows)\n* Need: System requires leadership (Decisions pile up)\n* Go: Allocate decisively (Approve budgets)\n* Search: Perfect outcomes (Stop chasing them)\n* Find: Functional stability (Cash flow steadies)\n* Take: Burden of control (Sign daily)\n* Return: Order restored (Processes resume)\n* Change: You are the gatekeeper (Final approval rests with you)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Steward",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":summary",
              "You carry others' hearts\n* You: Emotionally mature (You stay calm)\n* Need: Stability needed (They look to you)\n* Go: Offer consistent care (You show up daily)\n* Search: Personal gratification (You set it aside)\n* Find: Trust deepens (They confide freely)\n* Take: Emotional labor accepted (You listen again)\n* Return: Relationships stabilize (Conflict softens)\n* Change: You become an anchor (They rely on you)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Moral Authority",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":summary",
              "You embody the consequence\n* You: Fully formed (You no longer flinch)\n* Need: Final stance required (They ask what to do)\n* Go: Act consistently with self (Answer immediately)\n* Search: External validation (Ignore the room)\n* Find: Inner alignment achieved (The answer fits)\n* Take: Responsibility accepted (Sign your name)\n* Return: Others respond accordingly (They obey or leave)\n* Change: You are what you chose (Nothing left to hide)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Social Insight",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":summary",
              "You see how power actually works\n* You: Observant (You stop reacting emotionally)\n* Need: Pattern clarity (Repeated outcomes align)\n* Go: Reinterpret past events (Motives become obvious)\n* Search: Ignore rhetoric (Track actions)\n* Find: Real authority located (Not titles)\n* Take: Calm acceptance (Stop chasing approval)\n* Return: Strategic posture (Act deliberately)\n* Change: Social wisdom gained (You understand the game)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Material Truth",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":summary",
              "You see the real cost\n* You: Numbers-focused (You avoid emotion)\n* Need: Full accounting appears (Audit completes)\n* Go: Review outcomes honestly (Read line by line)\n* Search: Minimize damage (Highlight excuses)\n* Find: Trade-offs exposed (Patterns emerge)\n* Take: Regret or pride (Lean back)\n* Return: Goals reassessed (Plans rewritten)\n* Change: Values recalibrated (Different priorities chosen)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Truth",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":summary",
              "You understand the real bond\n* You: Confused (Mixed signals linger)\n* Need: Clarity arrives (Overhear the truth)\n* Go: Reinterpret past moments (Memories reframe)\n* Search: Excuses dissolve (Details align)\n* Find: Love or illusion revealed (It's obvious now)\n* Take: Acceptance settles in (Exhale)\n* Return: Relationship redefined (Act accordingly)\n* Change: Emotional honesty achieved (No more pretending)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Moral Truth",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":summary",
              "You see what you've become\n* You: Defensive (Justify past choices)\n* Need: Reflection forced (Evidence lands on your desk)\n* Go: Face consequences honestly (Read it all)\n* Search: Deny responsibility (Try to argue)\n* Find: Self-awareness hits (Your signature repeats)\n* Take: Shame or resolve (Close your eyes)\n* Return: Past reframed (See the pattern)\n* Change: Moral reckoning complete (Stop pretending)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Tactical Influence",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":summary",
              "You work the system\n* You: Repositioning (You've learned the rules)\n* Need: Change requires leverage (Support is split)\n* Go: Act strategically (File at the right moment)\n* Search: Exploit process (Quote policy)\n* Find: Advantage gained (They hesitate)\n* Take: Risk embraced (Push harder)\n* Return: Momentum shifts (Meetings reschedule)\n* Change: You wield structure (Not just subject to it)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Strategic Control",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":summary",
              "You seize financial initiative\n* You: Cornered but clever (You prepare quietly)\n* Need: Survival requires bold move (Time nearly out)\n* Go: Execute risky plan (You trigger the transfer)\n* Search: Maximize leverage (You time the release)\n* Find: Control shifts (Numbers jump)\n* Take: Pressure peaks (Calls flood in)\n* Return: Opponents respond (Meetings scheduled fast)\n* Change: You drive the game (For now)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Declaration",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":summary",
              "You assert your feelings\n* You: Tired of hiding (You stop deflecting)\n* Need: Ambiguity hurts too much (They press you)\n* Go: Speak plainly (You state what you want)\n* Search: Avoid manipulation (You don't soften it)\n* Find: Emotional truth lands (They go quiet)\n* Take: Consequences accepted (You don't backtrack)\n* Return: Relationship clarified (Yes or no)\n* Change: Emotional agency claimed (You chose honesty)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Ruthless Choice",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":summary",
              "You act without hesitation\n* You: Hardened (You don't ask permission)\n* Need: Crisis demands action (Clock is ticking)\n* Go: Take command (Interrupt the meeting)\n* Search: Ignore doubt (Cut objections off)\n* Find: Decisive strike (Shut it down)\n* Take: Moral cost accepted (Don't apologize)\n* Return: Order imposed (People follow silently)\n* Change: You become the blade (They fear you)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Total Marginalization",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":summary",
              "You are crushed by the system\n* You: Isolated (No one meets your eyes)\n* Need: Final decision issued (Notice published)\n* Go: Absorb consequences (Pack your desk)\n* Search: Appeal paths (Skim the handbook)\n* Find: None viable (Deadlines passed)\n* Take: Identity loss (Badge deactivates)\n* Return: Social void (Former peers avoid you)\n* Change: Institutional erasure (You no longer belong)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Total Loss",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":summary",
              "You lose what you built\n* You: Overleveraged (Nothing left untouched)\n* Need: Failure finalizes (Notice arrives)\n* Go: Face consequences (Attend the hearing)\n* Search: Hidden escape (Call favors)\n* Find: Assets seized (Boxes are labeled)\n* Take: Shock lands (Sit silently)\n* Return: Life stripped down (Rooms feel empty)\n* Change: Survival mode engaged (You plan tomorrow only)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Ruin",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":summary",
              "Everything spills at once\n* You: Emotionally exposed (You stop filtering)\n* Need: Truth erupts (Old wounds surface)\n* Go: Endure confrontation (Don't interrupt)\n* Search: Hold anything intact (Reach out)\n* Find: Bonds shatter (Multiple people walk away)\n* Take: Grief floods in (Sit alone crying)\n* Return: Silence follows (Phone stays dark)\n* Change: Emotional landscape reset (Nothing familiar remains)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Irreversible Harm",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":summary",
              "The damage spreads beyond control\n* You: Past restraint (No one expects mercy)\n* Need: Fallout accelerates (Reports stack hourly)\n* Go: Make brutal choices (Triage who matters)\n* Search: Prevent worst outcome (Cancel evacuations)\n* Find: Multiple losses occur (Names cross your desk)\n* Take: Weight overwhelms (Sit in silence)\n* Return: World altered (Neighborhoods are empty)\n* Change: Endgame triggered (There's no fixing this)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Institutional Crisis",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":summary",
              "The system threatens you\n* You: Exposed (Your record is reviewed)\n* Need: Formal judgment imminent (Panel convenes)\n* Go: Prepare defense (Organize evidence)\n* Search: Procedural fairness (Cite policy)\n* Find: Outcome uncertain (Questions turn sharp)\n* Take: Authority asserts itself (Deliberation begins)\n* Return: Suspension or warning (You're escorted out)\n* Change: Status hangs by thread (Everything paused)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Financial Freefall",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":summary",
              "Losses outrun recovery\n* You: Desperate (You stop eating out)\n* Need: Final chance appears (One risky option remains)\n* Go: Gamble everything (You move all funds)\n* Search: Miracle angle (You watch the market)\n* Find: Odds against you (Numbers slide)\n* Take: Panic spikes (You hit refresh repeatedly)\n* Return: Systems close in (Accounts lock temporarily)\n* Change: Collapse or reversal imminent (Hours matter)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Crisis",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":summary",
              "You can't sustain the bond\n* You: Overextended (You look exhausted)\n* Need: Emotional reckoning (They demand honesty)\n* Go: Confront the truth (Sit down)\n* Search: Salvage connection (Bargain)\n* Find: Limits exposed (You can't promise)\n* Take: Heartbreak hits (They stand to leave)\n* Return: Emotional vacuum (Door closes)\n* Change: Attachment broken or remade (Nothing in between)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Moral Collapse",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":summary",
              "Your code barely exists\n* You: Exhausted (You stop arguing)\n* Need: One more decision (They push paperwork at you)\n* Go: Act automatically (You sign without reading)\n* Search: Justify nothing (You don't explain)\n* Find: You don't hesitate (That scares you)\n* Take: Self-disgust peaks (You scrub your hands raw)\n* Return: Identity frays (Old photos feel unfamiliar)\n* Change: Collapse imminent (Something will break)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Political Entanglement",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":summary",
              "Everything is factional\n* You: Marginalized or powerful (Either way watched)\n* Need: Competing agendas collide (Rumors spread)\n* Go: Navigate alliances (Meet privately)\n* Search: Strategic neutrality (Hedge statements)\n* Find: No safe position (Each side notes silence)\n* Take: Pressure mounts (Deadlines weaponized)\n* Return: Tension saturates space (Meetings feel hostile)\n* Change: Politics unavoidable (Every action signals)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Spiraling Costs",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":summary",
              "Expenses exceed plans\n* You: Stretched thin (You juggle accounts)\n* Need: New losses emerge (Equipment fails)\n* Go: Secure more resources (Request a loan)\n* Search: Short-term fixes (Delay payments)\n* Find: Long-term damage (Penalties accrue)\n* Take: Stability erodes (Miss a deadline)\n* Return: Life reorganizes (Bills dominate conversations)\n* Change: Risk dominates decisions (Survival thinking)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Overload",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":summary",
              "You're pulled too many ways\n* You: Emotionally invested (Everyone needs you)\n* Need: Competing needs clash (Two calls come at once)\n* Go: Try to satisfy all (Say yes twice)\n* Search: Balance feelings (Rush between them)\n* Find: Someone neglected (They wait alone)\n* Take: Guilt intensifies (See the missed call)\n* Return: Relationships strain (Voices harden)\n* Change: Emotional limits reached (Something must drop)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Consequences Multiply",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":summary",
              "You can't contain the damage\n* You: Already compromised (You're known for it now)\n* Need: Fallout spreads (2nd incident occurs)\n* Go: Intervene again (step in personally)\n* Search: Limit exposure (Silence a witness)\n* Find: New harm caused (Another innocent suffers)\n* Take: Moral weight spikes (Nausea afterward)\n* Return: Normal collapses (Routines break down)\n* Change: Crisis mode engaged (You stop sleeping)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Social Exile",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":summary",
              "You're pushed out\n* You: Vulnerable (Support already thin)\n* Need: Group chooses sides (Vote is called)\n* Go: Argue your case (Speak last)\n* Search: Salvage standing (Appeal to fairness)\n* Find: Decision made (Hands raise)\n* Take: Exclusion hits (You're removed from the channel)\n* Return: Access revoked (Invites stop coming)\n* Change: Social removal complete (You're out)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Irreversible Deal",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":summary",
              "You sign away options\n* You: Calculating (Last chance)\n* Need: Deadline hits (Contract expires today)\n* Go: Finalize agreement (You sign digitally)\n* Search: Escape clauses (You scroll fast)\n* Find: Terms bind (Signature locks in)\n* Take: Relief and fear (Your hands shake)\n* Return: Freedom reduced (Obligations populate your inbox)\n* Change: Future constrained (Your path narrows)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Betrayal",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":summary",
              "You hurt someone you love\n* You: Caring (You promised otherwise)\n* Need: Conflict forces choice (Both can't be spared)\n* Go: Act anyway (Choose one)\n* Search: Soften blow (Explain yourself)\n* Find: Trust breaks (They stop listening)\n* Take: Pain immediate (Tears fall)\n* Return: Bond damaged (Messages go unanswered)\n* Change: Relationship transformed (Never the same)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Point of No Return",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":summary",
              "You cross a line you cannot uncross\n* You: Defined by a personal rule (Swore you wouldn't do this)\n* Need: Obedience now costs too much (Refusal ends everything)\n* Go: Enter the moral gray (Show up anyway)\n* Search: Rationalize exceptions (Just this once)\n* Find: Break the rule (Pull the trigger)\n* Take: Immediate price paid (Someone screams)\n* Return: Old life feels wrong (home feels awry)\n* Change: New self locked in (Don't look away next time)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Institutional Weight",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":summary",
              "The system leans in\n* You: Known quantity (Your name circulates)\n* Need: Accountability demanded (An email arrives)\n* Go: Respond formally (You draft carefully)\n* Search: Follow procedure (You attach documentation)\n* Find: Process slow (No immediate reply)\n* Take: Anxiety grows (Weeks pass)\n* Return: Oversight normalizes (Check-ins scheduled)\n* Change: You're monitored now (Freedom narrows)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Compounding Risk",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":summary",
              "One bet forces another\n* You: Committed (Too much invested)\n* Need: Loss threatens (Numbers turn red)\n* Go: Double down (Inject more funds)\n* Search: Smarter angle (Change strategy)\n* Find: Exposure grows (Safety net shrinks)\n* Take: Volatility spikes (Check prices hourly)\n* Return: Sleep suffers (Wake at night)\n* Change: Exit difficult (Walking away feels worse)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Deep Bond",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":summary",
              "You rely on someone\n* You: Attached (You text without thinking)\n* Need: Support required (A problem overwhelms you)\n* Go: Ask for help (You call late)\n* Search: Avoid burdening (You apologize)\n* Find: Dependence forms (They stay on the line)\n* Take: Stakes double (They know too much now)\n* Return: Separation costly (You dread silence)\n* Change: Intertwined fates (Choices affect both)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Escalating Acts",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":summary",
              "You repeat the wrong choice\n* You: Uneasy (You avoid eye contact)\n* Need: Situation worsens (Another problem surfaces)\n* Go: Act similarly (Issue the same command)\n* Search: Limit damage (Add conditions)\n* Find: Harm increases (More people affected)\n* Take: Guilt accumulates (Drink alone)\n* Return: Life constricts (Fewer calls returned)\n* Change: Descent underway (Stopping feels impossible)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Public Challenge",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":summary",
              "You are confronted\n* You: Established member (You speak freely)\n* Need: Authority questioned (Someone objects)\n* Go: Defend position (Explain yourself)\n* Search: Allies in room (Make eye contact)\n* Find: Division exposed (Whispers spread)\n* Take: Social risk spikes (Silence follows)\n* Return: Status uncertain (Meeting adjourns abruptly)\n* Change: Power contested (You're no longer secure)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Major Spend",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":summary",
              "You commit resources heavily\n* You: Conservative (You triple-check)\n* Need: Opportunity peaks (Clock ticking)\n* Go: Invest fully (Authorize payment)\n* Search: Final checks (Skim the contract)\n* Find: Funds transferred (Confirmation appears)\n* Take: Exposure locked (Account dips sharply)\n* Return: Waiting begins (Nothing to do now)\n* Change: Outcome matters deeply (This must work)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Confession",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":summary",
              "You reveal true feeling\n* You: Reserved (You rehearse silently)\n* Need: Silence hurts more (Can't sleep)\n* Go: Open up (Ask to talk)\n* Search: Gentle phrasing (Hedge your words)\n* Find: Truth lands (Say it plainly)\n* Take: Emotional impact (They stare at you)\n* Return: Relationship redefined (Nothing is casual now)\n* Change: Vulnerability real (You've said it)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Line Crossed",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":summary",
              "You do something irreversible\n* You: Rule-bound (You hesitate)\n* Need: Cost too high (They start counting down)\n* Go: Act decisively (Nod once)\n* Search: None left (Moment passes)\n* Find: Boundary broken (Give the order)\n* Take: Immediate fallout (Someone protests)\n* Return: Reality altered (People look at you differently)\n* Change: Path narrowed (There's no undo)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Rule Pressure",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":summary",
              "Expectation tightens\n* You: Comfortable (You know the routine)\n* Need: Standards enforced (Policy is cited)\n* Go: Comply publicly (You nod)\n* Search: Work within limits (Adjust your approach)\n* Find: Little flexibility (Exceptions denied)\n* Take: Constraint felt (Redo work)\n* Return: System dominates (Process matters more than people)\n* Change: Autonomy reduced (You follow rules now)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Risk Threshold",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":summary",
              "You reach tolerance limit\n* You: Risk-aware (You hesitate)\n* Need: Pay more or quit (They ask directly)\n* Go: Reassess position (Open spreadsheets)\n* Search: Last-minute savings (Cut corners)\n* Find: All-in required (They won't budge)\n* Take: Stress peaks (Rub your temples)\n* Return: Moment stretches (Call goes quiet)\n* Change: Commitment unavoidable (You must choose)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Choice",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":summary",
              "You must decide how much to care\n* You: Hesitant (You don't label it)\n* Need: Relationship deepens (They ask what this is)\n* Go: Stay close (Don't pull away)\n* Search: Emotional boundaries (Set rules)\n* Find: Boundaries fail (Break them first)\n* Take: Exposure increases (Share a secret)\n* Return: Normal shifts (Closeness is assumed)\n* Change: Heart engaged (Neutrality gone)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Line Approached",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":summary",
              "You near a boundary\n* You: Aware of limits (You say I won't)\n* Need: Stakes sharpen (They name the consequences)\n* Go: Stay in situation (Don't leave)\n* Search: Final alternatives (Call a contact)\n* Find: Choice looming (No help comes)\n* Take: Anxiety spikes (Pace the room)\n* Return: Calm before decision (Silence hangs)\n* Change: Commitment imminent (Take a breath)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Role Formation",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":summary",
              "You find a place\n* You: Regular presence (People expect you)\n* Need: Structure emerges (Tasks divide naturally)\n* Go: Accept responsibility (Take notes)\n* Search: Perform well (Arrive early)\n* Find: Role solidifies (They defer to you)\n* Take: Obligation grows (You're relied upon)\n* Return: Identity shifts (You're the organizer)\n* Change: Social utility defined (You're known for this)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Investment Made",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":summary",
              "You put something in\n* You: Calculating (You run the numbers)\n* Need: Opportunity demands buy-in (Deadline looms)\n* Go: Commit partially (You transfer funds)\n* Search: Hedge risk (You keep some back)\n* Find: No refunds (The terms update)\n* Take: Anxiety rises (You refresh the page)\n* Return: Waiting period (Days drag)\n* Change: Skin in game (Loss would hurt)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Attachment Forms",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":summary",
              "You start to care\n* You: Guarded (You limit contact)\n* Need: Presence feels good (Stay longer)\n* Go: Spend time (Accept another invitation)\n* Search: Control exposure (Avoid deeper topics)\n* Find: Bond deepens (Laugh easily)\n* Take: Dependence begins (Miss them afterward)\n* Return: Absence hurts (Notice the quiet)\n* Change: Emotional stake set (Distance now matters)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Growing Discomfort",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":summary",
              "You sense future cost\n* You: Still resisting (You insist it's fine)\n* Need: Pressure repeats (Request comes again)\n* Go: Face it directly (Attend the meeting)\n* Search: Delay decision (Ask for more time)\n* Find: Delay fails (They want an answer now)\n* Take: Stress accumulates (Hands shake)\n* Return: Life tightens (Sleep gets shorter)\n* Change: Conflict active (Avoidance stops working)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Social Friction",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":summary",
              "You have a misstep\n* You: Accepted enough (You relax)\n* Need: Norm violation noticed (Joke falls flat)\n* Go: Recover standing (Laugh it off)\n* Search: Adjust behavior (Mirror others)\n* Find: Unease lingers (Side glances persist)\n* Take: Reputation dented (Someone corrects you)\n* Return: Caution increases (Speak less)\n* Change: Awareness sharpened (You're more careful)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Resource Strain",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":summary",
              "You lose something small\n* You: Stable enough (You shrug it off)\n* Need: Loss pinches (A fee posts overnight)\n* Go: Cover the gap (You move money around)\n* Search: Cheap fix (You cancel a subscription)\n* Find: Hidden cost (Another bill arrives)\n* Take: Pressure rises (You tighten spending)\n* Return: Routine stressed (Small luxuries vanish)\n* Change: Security weakened (You start tracking closely)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Emotional Friction",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":summary",
              "You feel unexpectedly affected\n* You: Detached (You keep it professional)\n* Need: Feelings intrude (Their comment lingers)\n* Go: Stay present (You don't end the conversation)\n* Search: Suppress emotion (You change the subject)\n* Find: Reaction slips (Your tone sharpens)\n* Take: Awkwardness grows (They pause)\n* Return: Relationship altered (Future talks feel cautious)\n* Change: Detachment cracked (You replay the moment)"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Small Compromise",
              ":deck",
              "Story Arc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
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
            "images/storyarc/storyarc-back.svg",
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
      "deck-storyarc": nx_tactics_decks_storyarc.e_deck_storyarc
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-storyarc": nx_tactics_decks_storyarc.t_deck_storyarc
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/storyarc",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-storyarc)
    nx_tactics_decks_storyarc.t_deck_storyarc['vx_value'] = {
      name          : "deck-storyarc",
      pkgname       : "nx/tactics/decks/storyarc",
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
      fn            : nx_tactics_decks_storyarc.f_deck_storyarc
    }

  }
}
