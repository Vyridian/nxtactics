'strict mode'

import vx_core from "../../vx/core.js"
import nx_tactics_base from "../../nx/tactics/base.js"


export default class nx_tactics_damage {


  /**
   * type: wound
   * Lasting Body Damage
   */
  static t_wound = {}
  static e_wound = {vx_type: nx_tactics_damage.t_wound}
  /**
   * Constant: breakdown
   * Lasting Mind Damage
   * {card}
   */
  static c_breakdown = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'breakdown'}}

  /**
   * Constant: burden
   * * Temporary Movement Damage. Carrying loads, entanglement, or tissue damage cause Burden.
   * * While you have more [Burden] than [Move], you are [Encumbered].
   * * [Encumbered]: Cannot play [Counters] and [Move] actions are halved (rounded up).
   * {card}
   */
  static c_burden = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'burden'}}

  /**
   * Constant: deck-disorder
   * Damage to the Mind
   * {deck}
   */
  static c_deck_disorder = {vx_type: nx_tactics_base.t_deck, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'deck-disorder'}}

  /**
   * Constant: deck-trauma
   * Damage to the Will
   * {deck}
   */
  static c_deck_trauma = {vx_type: nx_tactics_base.t_deck, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'deck-trauma'}}

  /**
   * Constant: deck-wound
   * Physical Damage Deck
   * {deck}
   */
  static c_deck_wound = {vx_type: nx_tactics_base.t_deck, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'deck-wound'}}

  /**
   * Constant: fatigue
   * * Temporary Body Damage. Hard work and strikes in combat cause Fatigue.
   * * While you have more Fatigue than [Body], you are [Exhausted].
   * * [Exhausted]: Cannot play odd [Attack] cards and your second action may only be [Recover].
   * {card}
   */
  static c_fatigue = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'fatigue'}}

  /**
   * Constant: strain
   * * Temporary Mind Damage/Distraction/Surprise/Shock. Intense concentration, pressure, and multitasking causes Strain.
   * * While you have more Strain than [Mind], you are [Confused].
   * * [Confused]: Cannot play odd [Focus] cards and your second action may only be [Recover].
   * {card}
   */
  static c_strain = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'strain'}}

  /**
   * Constant: stress
   * * Temporary Will Damage. Doing or facing things against your beliefs causes Stress.
   * * While you have more Stress than [Will], you are [Shaken].
   * * [Shaken]: Cannot play odd [Defend] cards and your second action may only be [Recover]
   * {card}
   */
  static c_stress = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'stress'}}

  /**
   * Constant: trauma
   * Lasting Will Damage
   * {card}
   */
  static c_trauma = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'trauma'}}

  /**
   * Constant: wound-ca
   * {wound}
   */
  static c_wound_ca = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-ca'}}

  /**
   * Constant: wound-da
   * {wound}
   */
  static c_wound_da = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-da'}}

  /**
   * Constant: wound-ha
   * {wound}
   */
  static c_wound_ha = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-ha'}}

  /**
   * Constant: wound-j1
   * {wound}
   */
  static c_wound_j1 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-j1'}}

  /**
   * Constant: wound-j2
   * {wound}
   */
  static c_wound_j2 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-j2'}}

  /**
   * Constant: wound-s10
   * {wound}
   */
  static c_wound_s10 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s10'}}

  /**
   * Constant: wound-s2
   * {wound}
   */
  static c_wound_s2 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s2'}}

  /**
   * Constant: wound-s3
   * {damage}
   */
  static c_wound_s3 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s3'}}

  /**
   * Constant: wound-s4
   * {wound}
   */
  static c_wound_s4 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s4'}}

  /**
   * Constant: wound-s5
   * {wound}
   */
  static c_wound_s5 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s5'}}

  /**
   * Constant: wound-s6
   * {wound}
   */
  static c_wound_s6 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s6'}}

  /**
   * Constant: wound-s7
   * {wound}
   */
  static c_wound_s7 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s7'}}

  /**
   * Constant: wound-s8
   * {wound}
   */
  static c_wound_s8 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s8'}}

  /**
   * Constant: wound-s9
   * {wound}
   */
  static c_wound_s9 = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-s9'}}

  /**
   * Constant: wound-sa
   * {wound}
   */
  static c_wound_sa = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-sa'}}

  /**
   * Constant: wound-sj
   * {wound}
   */
  static c_wound_sj = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-sj'}}

  /**
   * Constant: wound-sk
   * {wound}
   */
  static c_wound_sk = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-sk'}}

  /**
   * Constant: wound-sq
   * {wound}
   */
  static c_wound_sq = {vx_type: nx_tactics_damage.t_wound, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'wound-sq'}}



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "breakdown": nx_tactics_damage.c_breakdown,
      "burden": nx_tactics_damage.c_burden,
      "deck-disorder": nx_tactics_damage.c_deck_disorder,
      "deck-trauma": nx_tactics_damage.c_deck_trauma,
      "deck-wound": nx_tactics_damage.c_deck_wound,
      "fatigue": nx_tactics_damage.c_fatigue,
      "strain": nx_tactics_damage.c_strain,
      "stress": nx_tactics_damage.c_stress,
      "trauma": nx_tactics_damage.c_trauma,
      "wound-ca": nx_tactics_damage.c_wound_ca,
      "wound-da": nx_tactics_damage.c_wound_da,
      "wound-ha": nx_tactics_damage.c_wound_ha,
      "wound-j1": nx_tactics_damage.c_wound_j1,
      "wound-j2": nx_tactics_damage.c_wound_j2,
      "wound-s10": nx_tactics_damage.c_wound_s10,
      "wound-s2": nx_tactics_damage.c_wound_s2,
      "wound-s3": nx_tactics_damage.c_wound_s3,
      "wound-s4": nx_tactics_damage.c_wound_s4,
      "wound-s5": nx_tactics_damage.c_wound_s5,
      "wound-s6": nx_tactics_damage.c_wound_s6,
      "wound-s7": nx_tactics_damage.c_wound_s7,
      "wound-s8": nx_tactics_damage.c_wound_s8,
      "wound-s9": nx_tactics_damage.c_wound_s9,
      "wound-sa": nx_tactics_damage.c_wound_sa,
      "wound-sj": nx_tactics_damage.c_wound_sj,
      "wound-sk": nx_tactics_damage.c_wound_sk,
      "wound-sq": nx_tactics_damage.c_wound_sq
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "wound": nx_tactics_damage.e_wound
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "wound": nx_tactics_damage.t_wound
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/damage",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (type wound)
    nx_tactics_damage.t_wound['vx_type'] = vx_core.t_type
    nx_tactics_damage.t_wound['vx_value'] = {
      name          : "wound",
      pkgname       : "nx/tactics/damage",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [nx_tactics_base.t_card],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "icon": {
          "name" : "icon",
          "type" : vx_core.t_string,
          "multi": false
        },
        "image": {
          "name" : "image",
          "type" : vx_core.t_string,
          "multi": false
        },
        "reference": {
          "name" : "reference",
          "type" : vx_core.t_string,
          "multi": false
        },
        "summary": {
          "name" : "summary",
          "type" : vx_core.t_string,
          "multi": false
        },
        "titles": {
          "name" : "titles",
          "type" : vx_core.t_string,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_core.t_string,
          "multi": false
        },
        "rank": {
          "name" : "rank",
          "type" : nx_tactics_base.t_rank,
          "multi": false
        },
        "suit": {
          "name" : "suit",
          "type" : nx_tactics_base.t_suit,
          "multi": false
        }
      },
      proplast      : {
        "name" : "suit",
        "type" : nx_tactics_base.t_suit,
        "multi": false
      }
    }
    nx_tactics_damage.e_wound['vx_type'] = nx_tactics_damage.t_wound
    nx_tactics_damage.e_wound['vx_value'] = {}

    // (const breakdown)
    Object.assign(nx_tactics_damage.c_breakdown, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Breakdown"
    ))

    // (const burden)
    Object.assign(nx_tactics_damage.c_burden, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Burden"
    ))

    // (const deck-disorder)
    Object.assign(nx_tactics_damage.c_deck_disorder, vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Disorder",
      ":titles",
      "Crazed, Insane, Nonsensical, Obsessed, Unhinged",
      ":summary",
      "* S-Hack Blood/Gore/Dismember/Stress\n* H-Slash Blood/Burden\n* C-Bash/Fatigue/Push/Fatigue\n* D-Pierce/Shock/Stun/Pin/Disable/Strain"
    ))

    // (const deck-trauma)
    Object.assign(nx_tactics_damage.c_deck_trauma, vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Trauma/Crisis",
      ":titles",
      "Apathy, Cowed, Berserk, Broken, Depression, Servitude, Surly",
      ":summary",
      "* S-Hack Blood/Gore/Dismember\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Pierce/Stun/Pin/Disable"
    ))

    // (const deck-wound)
    Object.assign(nx_tactics_damage.c_deck_wound, vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Wound",
      ":summary",
      "* S-Hack Blood/Gore/Dismember\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Pierce/Stab/Stun/Pin/Disable",
      ":cardlist",
      vx_core.f_new(
        nx_tactics_base.t_cardlist,
        nx_tactics_damage.c_wound_j1,
        nx_tactics_damage.c_wound_j2,
        nx_tactics_damage.c_wound_ca,
        nx_tactics_damage.c_wound_da,
        nx_tactics_damage.c_wound_ha,
        nx_tactics_damage.c_wound_sa,
        nx_tactics_damage.c_wound_sk,
        nx_tactics_damage.c_wound_sq,
        nx_tactics_damage.c_wound_sj,
        nx_tactics_damage.c_wound_s5,
        nx_tactics_damage.c_wound_s4,
        nx_tactics_damage.c_wound_s3,
        nx_tactics_damage.c_wound_s2
      )
    ))

    // (const fatigue)
    Object.assign(nx_tactics_damage.c_fatigue, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Fatigue/Weaken/Exertion/Strain"
    ))

    // (const strain)
    Object.assign(nx_tactics_damage.c_strain, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Strain/Distraction"
    ))

    // (const stress)
    Object.assign(nx_tactics_damage.c_stress, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Stress/Duress/Horror",
      ":titles",
      "Stress"
    ))

    // (const trauma)
    Object.assign(nx_tactics_damage.c_trauma, {
      "rank": {
        "rank": {
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "rank": {
            
          },
          "suit": {
            
          }
        }
      },
      "suit": {
        "rank": {
          "rank": {
            
          },
          "suit": {
            
          }
        },
        "suit": {
          "rank": {
            
          },
          "suit": {
            
          }
        }
      }
    })

    // (const wound-ca)
    Object.assign(nx_tactics_damage.c_wound_ca, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":name",
      "Bash: Head",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_club,
      ":doc",
      "* 1 Damage: Head Ringing. [Stun]: 1.\n* 2 Damage: Concussion. [Fatigue]: 1. [Push]: 1.\n* 3 Damage: Skull Fracture. [Unconscious]. [Fatigue]: 2. [Push]: 1. [Knockdown]: 1.\n* 4 Damage: Skull Crushed. [Dead]."
    ))

    // (const wound-da)
    Object.assign(nx_tactics_damage.c_wound_da, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":name",
      "Pierce: Head",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_diamond,
      ":doc",
      "* 1 Damage: Head Grazed. [Stun]: 1.\n* 2 Damage: Pierced Throat. [Can't speak]. [Stun]: 1.\n* 3 Damage: Blinded in one Eye. [Partly Blind]. [Stun]: 2. [Horror]: 1.\n* 4 Damage: Skull Pierced. Dying."
    ))

    // (const wound-ha)
    Object.assign(nx_tactics_damage.c_wound_ha, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":name",
      "Slash: Head",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_heart,
      ":doc",
      "* 1 Damage: Head Cut. [Bleeding]: 1.\n* 2 Damage: Face Gash. [Horror]: 1. [Bleeding]: 1.\n* 3 Damage: Throat Sliced Open. [Bleeding]: 3, [Horror]: 2.\n* 4 Damage: Spine Severed. [Paralyzed]. [Horror]: 3. [Bleeding]: 2."
    ))

    // (const wound-j1)
    Object.assign(nx_tactics_damage.c_wound_j1, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":name",
      "Wild",
      ":doc",
      "* Search the Deck for any card and play that instead.\n* Shuffle Discards into Deck."
    ))

    // (const wound-j2)
    Object.assign(nx_tactics_damage.c_wound_j2, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":name",
      "Wild",
      ":doc",
      "* Search the Discards for any card and play that instead or play the next card instead.\n* Shuffle Discards into Deck."
    ))

    // (const wound-s10)
    Object.assign(nx_tactics_damage.c_wound_s10, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Hips/Groin"
    ))

    // (const wound-s2)
    Object.assign(nx_tactics_damage.c_wound_s2, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Left Lower Leg/Shin/Ankle/Foot"
    ))

    // (const wound-s3)
    Object.assign(nx_tactics_damage.c_wound_s3, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Right Lower Leg/Shin/Ankle/Foot"
    ))

    // (const wound-s4)
    Object.assign(nx_tactics_damage.c_wound_s4, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Left Upper Leg/Thigh/Knee"
    ))

    // (const wound-s5)
    Object.assign(nx_tactics_damage.c_wound_s5, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Right Upper Leg/Thigh/Knee"
    ))

    // (const wound-s6)
    Object.assign(nx_tactics_damage.c_wound_s6, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Left Lower Arm/Wrist/Hand"
    ))

    // (const wound-s7)
    Object.assign(nx_tactics_damage.c_wound_s7, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Right Lower Arm/Wrist/Hand"
    ))

    // (const wound-s8)
    Object.assign(nx_tactics_damage.c_wound_s8, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Left Upper Arm/Elbow"
    ))

    // (const wound-s9)
    Object.assign(nx_tactics_damage.c_wound_s9, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Right Upper Arm/Elbow"
    ))

    // (const wound-sa)
    Object.assign(nx_tactics_damage.c_wound_sa, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":name",
      "Hack: Head/Neck/Face/Skull",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_spade,
      ":doc",
      "1 Damage: Deflected off Skull. [Slow]: 1.\n2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n3 Damage: Neck Fracture. [Immobilized]. [Slow]: 2. [Bleeding]: 1.\n4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-sj)
    Object.assign(nx_tactics_damage.c_wound_sj, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Abdomen/Lower Back"
    ))

    // (const wound-sk)
    Object.assign(nx_tactics_damage.c_wound_sk, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Upper Chest/Upper Back/Shoulders/Ribs"
    ))

    // (const wound-sq)
    Object.assign(nx_tactics_damage.c_wound_sq, vx_core.f_new(
      nx_tactics_damage.t_wound,
      ":doc",
      "Hack: Lower Chest/Middle Back/Lungs/Heart"
    ))

  }
}
