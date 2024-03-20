'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_damage {

  /**
   * Constant: fatigue
   * * Temporary Body Damage. Hard work and strikes in combat cause Fatigue.
   * * While you have more Fatigue than [Body], you are [Exhausted].
   * * [Exhausted]: Cannot play odd [Attack] cards and your second action may only be [Recover].
   * {card}
   */
  static c_fatigue = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'fatigue'}}

  /**
   * Constant: slow
   * * Temporary Movement Damage. Carrying loads, burden, entanglement, or tissue damage cause Burden.
   * * While you have more [Slow] than [Move], you are [Encumbered].
   * * [Encumbered]: Cannot play [Counters] and [Move] actions are halved (rounded up).
   * {card}
   */
  static c_slow = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'slow'}}

  /**
   * Constant: stress
   * {card}
   */
  static c_stress = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'stress'}}

  /**
   * Constant: stun
   * {card}
   */
  static c_stun = {vx_type: nx_tactics_base.t_card, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'stun'}}

  /**
   * Constant: wound-2c
   * {wound}
   */
  static c_wound_2c = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-2c'}}

  /**
   * Constant: wound-2d
   * {wound}
   */
  static c_wound_2d = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-2d'}}

  /**
   * Constant: wound-2h
   * {wound}
   */
  static c_wound_2h = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-2h'}}

  /**
   * Constant: wound-2s
   * {wound}
   */
  static c_wound_2s = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-2s'}}

  /**
   * Constant: wound-3c
   * {damage}
   */
  static c_wound_3c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-3c'}}

  /**
   * Constant: wound-3d
   * {damage}
   */
  static c_wound_3d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-3d'}}

  /**
   * Constant: wound-3h
   * {damage}
   */
  static c_wound_3h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-3h'}}

  /**
   * Constant: wound-3s
   * {damage}
   */
  static c_wound_3s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-3s'}}

  /**
   * Constant: wound-4c
   * {wound}
   */
  static c_wound_4c = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-4c'}}

  /**
   * Constant: wound-4d
   * {wound}
   */
  static c_wound_4d = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-4d'}}

  /**
   * Constant: wound-4h
   * {wound}
   */
  static c_wound_4h = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-4h'}}

  /**
   * Constant: wound-4s
   * {wound}
   */
  static c_wound_4s = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-4s'}}

  /**
   * Constant: wound-5c
   * {wound}
   */
  static c_wound_5c = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-5c'}}

  /**
   * Constant: wound-5d
   * {wound}
   */
  static c_wound_5d = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-5d'}}

  /**
   * Constant: wound-5h
   * {wound}
   */
  static c_wound_5h = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-5h'}}

  /**
   * Constant: wound-5s
   * {wound}
   */
  static c_wound_5s = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-5s'}}

  /**
   * Constant: wound-6c
   * {wound}
   */
  static c_wound_6c = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-6c'}}

  /**
   * Constant: wound-6d
   * {wound}
   */
  static c_wound_6d = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-6d'}}

  /**
   * Constant: wound-6h
   * {wound}
   */
  static c_wound_6h = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-6h'}}

  /**
   * Constant: wound-6s
   * {wound}
   */
  static c_wound_6s = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-6s'}}

  /**
   * Constant: wound-7c
   * {wound}
   */
  static c_wound_7c = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-7c'}}

  /**
   * Constant: wound-7d
   * {wound}
   */
  static c_wound_7d = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-7d'}}

  /**
   * Constant: wound-7h
   * {wound}
   */
  static c_wound_7h = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-7h'}}

  /**
   * Constant: wound-7s
   * {wound}
   */
  static c_wound_7s = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-7s'}}

  /**
   * Constant: wound-8c
   * {wound}
   */
  static c_wound_8c = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-8c'}}

  /**
   * Constant: wound-8d
   * {wound}
   */
  static c_wound_8d = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-8d'}}

  /**
   * Constant: wound-8h
   * {wound}
   */
  static c_wound_8h = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-8h'}}

  /**
   * Constant: wound-8s
   * {wound}
   */
  static c_wound_8s = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-8s'}}

  /**
   * Constant: wound-9c
   * {wound}
   */
  static c_wound_9c = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-9c'}}

  /**
   * Constant: wound-9d
   * {wound}
   */
  static c_wound_9d = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-9d'}}

  /**
   * Constant: wound-9h
   * {wound}
   */
  static c_wound_9h = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-9h'}}

  /**
   * Constant: wound-9s
   * {wound}
   */
  static c_wound_9s = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-9s'}}

  /**
   * Constant: wound-ac
   * {wound}
   */
  static c_wound_ac = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-ac'}}

  /**
   * Constant: wound-ad
   * {wound}
   */
  static c_wound_ad = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-ad'}}

  /**
   * Constant: wound-ah
   * {wound}
   */
  static c_wound_ah = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-ah'}}

  /**
   * Constant: wound-as
   * {wound}
   */
  static c_wound_as = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-as'}}

  /**
   * Constant: wound-jc
   * {wound}
   */
  static c_wound_jc = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-jc'}}

  /**
   * Constant: wound-jd
   * {wound}
   */
  static c_wound_jd = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-jd'}}

  /**
   * Constant: wound-jh
   * {wound}
   */
  static c_wound_jh = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-jh'}}

  /**
   * Constant: wound-js
   * {wound}
   */
  static c_wound_js = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-js'}}

  /**
   * Constant: wound-kc
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_kc = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-kc'}}

  /**
   * Constant: wound-kd
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_kd = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-kd'}}

  /**
   * Constant: wound-kh
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_kh = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-kh'}}

  /**
   * Constant: wound-ks
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_ks = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-ks'}}

  /**
   * Constant: wound-qc
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_qc = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-qc'}}

  /**
   * Constant: wound-qd
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_qd = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-qd'}}

  /**
   * Constant: wound-qh
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_qh = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-qh'}}

  /**
   * Constant: wound-qs
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {wound}
   */
  static c_wound_qs = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-qs'}}

  /**
   * Constant: wound-tc
   * {wound}
   */
  static c_wound_tc = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-tc'}}

  /**
   * Constant: wound-td
   * {wound}
   */
  static c_wound_td = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-td'}}

  /**
   * Constant: wound-th
   * {wound}
   */
  static c_wound_th = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-th'}}

  /**
   * Constant: wound-ts
   * {wound}
   */
  static c_wound_ts = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-ts'}}

  /**
   * Constant: wound-wild-black
   * {wound}
   */
  static c_wound_wild_black = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-wild-black'}}

  /**
   * Constant: wound-wild-red
   * {wound}
   */
  static c_wound_wild_red = {vx_type: nx_tactics_base.t_wound, vx_constdef: {pkgname: 'nx/tactics/decks/damage', name: 'wound-wild-red'}}

  /**
   * @function deck_disorder
   * Damage to the Mind
   * @return {deck}
   */
  static t_deck_disorder = {
    vx_type: vx_core.t_type
  }
  static e_deck_disorder = {
    vx_type: nx_tactics_decks_damage.t_deck_disorder
  }

  // (func deck-disorder)
  static f_deck_disorder() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Mental Disorder",
      ":titles",
      "Crazed, Insane, Nonsensical, Obsessed, Unhinged",
      ":summary",
      "* S-Hack Blood/Gore/Dismember/Stress\n* H-Slash Blood/Burden\n* C-Bash/Fatigue/Push/Fatigue\n* D-Pierce/Shock/Stun/Pin/Disable/Strain"
    )
    return output
  }

  /**
   * @function deck_trauma
   * Damage to the Will
   * @return {deck}
   */
  static t_deck_trauma = {
    vx_type: vx_core.t_type
  }
  static e_deck_trauma = {
    vx_type: nx_tactics_decks_damage.t_deck_trauma
  }

  // (func deck-trauma)
  static f_deck_trauma() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Emotional Trauma",
      ":titles",
      "Apathy, Cowed, Crisis, Berserk, Broken, Depression, Servitude, Surly",
      ":summary",
      "* S-Hack Blood/Gore/Dismember\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Pierce/Stun/Pin/Disable"
    )
    return output
  }

  /**
   * @function deck_wound
   * Physical Damage Deck
   * @return {deck}
   */
  static t_deck_wound = {
    vx_type: vx_core.t_type
  }
  static e_deck_wound = {
    vx_type: nx_tactics_decks_damage.t_deck_wound
  }

  // (func deck-wound)
  static f_deck_wound() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "Physical Damage",
      ":summary",
      "* S-Hack Blood/Gore/Dismember\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Pierce/Stab/Stun/Pin/Disable",
      ":cardmap",
      nx_tactics_base.f_cardmap_from_cardlist(
        vx_core.f_new(
          nx_tactics_base.t_cardlist,
          nx_tactics_decks_damage.c_wound_wild_black,
          nx_tactics_decks_damage.c_wound_wild_red,
          nx_tactics_decks_damage.c_wound_ac,
          nx_tactics_decks_damage.c_wound_ad,
          nx_tactics_decks_damage.c_wound_ah,
          nx_tactics_decks_damage.c_wound_as,
          nx_tactics_decks_damage.c_wound_kc,
          nx_tactics_decks_damage.c_wound_kd,
          nx_tactics_decks_damage.c_wound_kh,
          nx_tactics_decks_damage.c_wound_ks,
          nx_tactics_decks_damage.c_wound_qc,
          nx_tactics_decks_damage.c_wound_qd,
          nx_tactics_decks_damage.c_wound_qh,
          nx_tactics_decks_damage.c_wound_qs,
          nx_tactics_decks_damage.c_wound_jc,
          nx_tactics_decks_damage.c_wound_jd,
          nx_tactics_decks_damage.c_wound_jh,
          nx_tactics_decks_damage.c_wound_js,
          nx_tactics_decks_damage.c_wound_tc,
          nx_tactics_decks_damage.c_wound_td,
          nx_tactics_decks_damage.c_wound_th,
          nx_tactics_decks_damage.c_wound_ts,
          nx_tactics_decks_damage.c_wound_9c,
          nx_tactics_decks_damage.c_wound_9d,
          nx_tactics_decks_damage.c_wound_9h,
          nx_tactics_decks_damage.c_wound_9s,
          nx_tactics_decks_damage.c_wound_8c,
          nx_tactics_decks_damage.c_wound_8d,
          nx_tactics_decks_damage.c_wound_8h,
          nx_tactics_decks_damage.c_wound_8s,
          nx_tactics_decks_damage.c_wound_7c,
          nx_tactics_decks_damage.c_wound_7d,
          nx_tactics_decks_damage.c_wound_7h,
          nx_tactics_decks_damage.c_wound_7s,
          nx_tactics_decks_damage.c_wound_6c,
          nx_tactics_decks_damage.c_wound_6d,
          nx_tactics_decks_damage.c_wound_6h,
          nx_tactics_decks_damage.c_wound_6s,
          nx_tactics_decks_damage.c_wound_5c,
          nx_tactics_decks_damage.c_wound_5d,
          nx_tactics_decks_damage.c_wound_5h,
          nx_tactics_decks_damage.c_wound_5s,
          nx_tactics_decks_damage.c_wound_4c,
          nx_tactics_decks_damage.c_wound_4d,
          nx_tactics_decks_damage.c_wound_4h,
          nx_tactics_decks_damage.c_wound_4s,
          nx_tactics_decks_damage.c_wound_3c,
          nx_tactics_decks_damage.c_wound_3d,
          nx_tactics_decks_damage.c_wound_3h,
          nx_tactics_decks_damage.c_wound_3s,
          nx_tactics_decks_damage.c_wound_2c,
          nx_tactics_decks_damage.c_wound_2d,
          nx_tactics_decks_damage.c_wound_2h,
          nx_tactics_decks_damage.c_wound_2s
        )
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "fatigue": nx_tactics_decks_damage.c_fatigue,
      "slow": nx_tactics_decks_damage.c_slow,
      "stress": nx_tactics_decks_damage.c_stress,
      "stun": nx_tactics_decks_damage.c_stun,
      "wound-2c": nx_tactics_decks_damage.c_wound_2c,
      "wound-2d": nx_tactics_decks_damage.c_wound_2d,
      "wound-2h": nx_tactics_decks_damage.c_wound_2h,
      "wound-2s": nx_tactics_decks_damage.c_wound_2s,
      "wound-3c": nx_tactics_decks_damage.c_wound_3c,
      "wound-3d": nx_tactics_decks_damage.c_wound_3d,
      "wound-3h": nx_tactics_decks_damage.c_wound_3h,
      "wound-3s": nx_tactics_decks_damage.c_wound_3s,
      "wound-4c": nx_tactics_decks_damage.c_wound_4c,
      "wound-4d": nx_tactics_decks_damage.c_wound_4d,
      "wound-4h": nx_tactics_decks_damage.c_wound_4h,
      "wound-4s": nx_tactics_decks_damage.c_wound_4s,
      "wound-5c": nx_tactics_decks_damage.c_wound_5c,
      "wound-5d": nx_tactics_decks_damage.c_wound_5d,
      "wound-5h": nx_tactics_decks_damage.c_wound_5h,
      "wound-5s": nx_tactics_decks_damage.c_wound_5s,
      "wound-6c": nx_tactics_decks_damage.c_wound_6c,
      "wound-6d": nx_tactics_decks_damage.c_wound_6d,
      "wound-6h": nx_tactics_decks_damage.c_wound_6h,
      "wound-6s": nx_tactics_decks_damage.c_wound_6s,
      "wound-7c": nx_tactics_decks_damage.c_wound_7c,
      "wound-7d": nx_tactics_decks_damage.c_wound_7d,
      "wound-7h": nx_tactics_decks_damage.c_wound_7h,
      "wound-7s": nx_tactics_decks_damage.c_wound_7s,
      "wound-8c": nx_tactics_decks_damage.c_wound_8c,
      "wound-8d": nx_tactics_decks_damage.c_wound_8d,
      "wound-8h": nx_tactics_decks_damage.c_wound_8h,
      "wound-8s": nx_tactics_decks_damage.c_wound_8s,
      "wound-9c": nx_tactics_decks_damage.c_wound_9c,
      "wound-9d": nx_tactics_decks_damage.c_wound_9d,
      "wound-9h": nx_tactics_decks_damage.c_wound_9h,
      "wound-9s": nx_tactics_decks_damage.c_wound_9s,
      "wound-ac": nx_tactics_decks_damage.c_wound_ac,
      "wound-ad": nx_tactics_decks_damage.c_wound_ad,
      "wound-ah": nx_tactics_decks_damage.c_wound_ah,
      "wound-as": nx_tactics_decks_damage.c_wound_as,
      "wound-jc": nx_tactics_decks_damage.c_wound_jc,
      "wound-jd": nx_tactics_decks_damage.c_wound_jd,
      "wound-jh": nx_tactics_decks_damage.c_wound_jh,
      "wound-js": nx_tactics_decks_damage.c_wound_js,
      "wound-kc": nx_tactics_decks_damage.c_wound_kc,
      "wound-kd": nx_tactics_decks_damage.c_wound_kd,
      "wound-kh": nx_tactics_decks_damage.c_wound_kh,
      "wound-ks": nx_tactics_decks_damage.c_wound_ks,
      "wound-qc": nx_tactics_decks_damage.c_wound_qc,
      "wound-qd": nx_tactics_decks_damage.c_wound_qd,
      "wound-qh": nx_tactics_decks_damage.c_wound_qh,
      "wound-qs": nx_tactics_decks_damage.c_wound_qs,
      "wound-tc": nx_tactics_decks_damage.c_wound_tc,
      "wound-td": nx_tactics_decks_damage.c_wound_td,
      "wound-th": nx_tactics_decks_damage.c_wound_th,
      "wound-ts": nx_tactics_decks_damage.c_wound_ts,
      "wound-wild-black": nx_tactics_decks_damage.c_wound_wild_black,
      "wound-wild-red": nx_tactics_decks_damage.c_wound_wild_red
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-disorder": nx_tactics_decks_damage.e_deck_disorder,
      "deck-trauma": nx_tactics_decks_damage.e_deck_trauma,
      "deck-wound": nx_tactics_decks_damage.e_deck_wound
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-disorder": nx_tactics_decks_damage.t_deck_disorder,
      "deck-trauma": nx_tactics_decks_damage.t_deck_trauma,
      "deck-wound": nx_tactics_decks_damage.t_deck_wound
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/damage",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-disorder)
    nx_tactics_decks_damage.t_deck_disorder['vx_value'] = {
      name          : "deck-disorder",
      pkgname       : "nx/tactics/decks/damage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_damage.f_deck_disorder
    }

    // (func deck-trauma)
    nx_tactics_decks_damage.t_deck_trauma['vx_value'] = {
      name          : "deck-trauma",
      pkgname       : "nx/tactics/decks/damage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_damage.f_deck_trauma
    }

    // (func deck-wound)
    nx_tactics_decks_damage.t_deck_wound['vx_value'] = {
      name          : "deck-wound",
      pkgname       : "nx/tactics/decks/damage",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_decks_damage.f_deck_wound
    }

    // (const fatigue)
    Object.assign(nx_tactics_decks_damage.c_fatigue, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Fatigue/Weaken/Exertion/Strain"
    ))

    // (const slow)
    Object.assign(nx_tactics_decks_damage.c_slow, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Slow"
    ))

    // (const stress)
    Object.assign(nx_tactics_decks_damage.c_stress, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Stress",
      ":titles",
      "Stress/Duress/Horror",
      ":reference",
      "Because love's such an old-fashioned word\nAnd love dares you to care for\nThe people on the edge of the night\nAnd love dares you to change our way of\nCaring about ourselves\nThis is our last dance\nThis is ourselves under pressure - Queen and David Bowie, Under Pressure",
      ":summary",
      "* Temporary Will Damage. Doing or facing things against your beliefs causes Stress.\n* While you have more Stress than [Will], you are [Shaken].\n* [Shaken]: Cannot play odd [Defend] cards and your second action may only be [Recover]"
    ))

    // (const stun)
    Object.assign(nx_tactics_decks_damage.c_stun, vx_core.f_new(
      nx_tactics_base.t_card,
      ":name",
      "Stun",
      ":summary",
      "* Temporary Mind Damage/Strain/Distraction/Surprise/Shock. Intense concentration, pressure, and multitasking causes Strain.\n* While you have more Stun than [Mind], you are [Confused].\n* [Confused]: Cannot play odd [Focus] cards and your second action may only be [Recover]."
    ))

    // (const wound-2c)
    Object.assign(nx_tactics_decks_damage.c_wound_2c, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Right Foot",
      ":titles",
      "Bash: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Foot Crushed. [Stress]: 2. [Lame]."
    ))

    // (const wound-2d)
    Object.assign(nx_tactics_decks_damage.c_wound_2d, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Right Foot",
      ":titles",
      "Pierce: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Ankle Useless. [Bleeding] 1. [Lame]."
    ))

    // (const wound-2h)
    Object.assign(nx_tactics_decks_damage.c_wound_2h, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Right Foot",
      ":titles",
      "Hack: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Foot Mangled. [Bleeding]: 2. [Lame]."
    ))

    // (const wound-2s)
    Object.assign(nx_tactics_decks_damage.c_wound_2s, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Right Foot",
      ":titles",
      "Slash: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Foot Severed. [Bleeding]: 2. [Lame]."
    ))

    // (const wound-3c)
    Object.assign(nx_tactics_decks_damage.c_wound_3c, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Bash: Left Foot",
      ":titles",
      "Bash: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-3d)
    Object.assign(nx_tactics_decks_damage.c_wound_3d, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Pierce: Left Foot",
      ":titles",
      "Pierce: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-3h)
    Object.assign(nx_tactics_decks_damage.c_wound_3h, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Hack: Left Foot",
      ":titles",
      "Hack: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-3s)
    Object.assign(nx_tactics_decks_damage.c_wound_3s, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Slash: Left Foot",
      ":titles",
      "Slash: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-4c)
    Object.assign(nx_tactics_decks_damage.c_wound_4c, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Right Leg",
      ":titles",
      "Bash: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-4d)
    Object.assign(nx_tactics_decks_damage.c_wound_4d, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Right Leg",
      ":titles",
      "Pierce: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-4h)
    Object.assign(nx_tactics_decks_damage.c_wound_4h, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Right Leg",
      ":titles",
      "Hack: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-4s)
    Object.assign(nx_tactics_decks_damage.c_wound_4s, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Right Leg",
      ":titles",
      "Slash: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-5c)
    Object.assign(nx_tactics_decks_damage.c_wound_5c, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Left Leg",
      ":titles",
      "Bash: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-5d)
    Object.assign(nx_tactics_decks_damage.c_wound_5d, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Left Leg",
      ":titles",
      "Pierce: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-5h)
    Object.assign(nx_tactics_decks_damage.c_wound_5h, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Left Leg",
      ":titles",
      "Hack: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-5s)
    Object.assign(nx_tactics_decks_damage.c_wound_5s, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Left Leg",
      ":titles",
      "Slash: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-6c)
    Object.assign(nx_tactics_decks_damage.c_wound_6c, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Right Hand",
      ":titles",
      "Bash: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-6d)
    Object.assign(nx_tactics_decks_damage.c_wound_6d, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Right Hand",
      ":titles",
      "Pierce: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-6h)
    Object.assign(nx_tactics_decks_damage.c_wound_6h, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Right Hand",
      ":titles",
      "Hack: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-6s)
    Object.assign(nx_tactics_decks_damage.c_wound_6s, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Right Hand",
      ":titles",
      "Slash: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-7c)
    Object.assign(nx_tactics_decks_damage.c_wound_7c, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Left Hand",
      ":titles",
      "Bash: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-7d)
    Object.assign(nx_tactics_decks_damage.c_wound_7d, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Left Hand",
      ":titles",
      "Pierce: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-7h)
    Object.assign(nx_tactics_decks_damage.c_wound_7h, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Left Hand",
      ":titles",
      "Hack: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-7s)
    Object.assign(nx_tactics_decks_damage.c_wound_7s, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Left Hand",
      ":titles",
      "Slash: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-8c)
    Object.assign(nx_tactics_decks_damage.c_wound_8c, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Right Arm",
      ":titles",
      "Bash: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-8d)
    Object.assign(nx_tactics_decks_damage.c_wound_8d, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Right Arm",
      ":titles",
      "Pierce: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-8h)
    Object.assign(nx_tactics_decks_damage.c_wound_8h, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Right Arm",
      ":titles",
      "Hack: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-8s)
    Object.assign(nx_tactics_decks_damage.c_wound_8s, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Right Arm",
      ":titles",
      "Slash: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-9c)
    Object.assign(nx_tactics_decks_damage.c_wound_9c, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Left Arm",
      ":titles",
      "Bash: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9c,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-9d)
    Object.assign(nx_tactics_decks_damage.c_wound_9d, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Left Arm",
      ":titles",
      "Pierce: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9d,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-9h)
    Object.assign(nx_tactics_decks_damage.c_wound_9h, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Left Arm",
      ":titles",
      "Hack: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9h,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-9s)
    Object.assign(nx_tactics_decks_damage.c_wound_9s, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Left Arm",
      ":titles",
      "Slash: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9s,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-ac)
    Object.assign(nx_tactics_decks_damage.c_wound_ac, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ac,
      ":summary",
      "* 1 Damage: Head Ringing. [Stun]: 1.\n* 2 Damage: Concussion. [Stun]: 1. [Push]: 1.\n* 3 Damage: Skull Fracture. [Unconscious]. [Stun]: 1, [Fatigue]: 1. [Push]: 1. [Knockdown]: 1.\n* 4 Damage: Skull Crushed. [Dead]."
    ))

    // (const wound-ad)
    Object.assign(nx_tactics_decks_damage.c_wound_ad, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ad,
      ":summary",
      "* 1 Damage: Head Grazed. [Stun]: 1.\n* 2 Damage: Pierced Throat. [Can't speak]. [Stun]: 1, [Stress]: 1.\n* 3 Damage: Blinded in one Eye. [Partly Blind]. [Stun]: 2. [Stress]: 1.\n* 4 Damage: Skull Pierced. Dying."
    ))

    // (const wound-ah)
    Object.assign(nx_tactics_decks_damage.c_wound_ah, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ah,
      ":summary",
      "* 1 Damage: Head Cut. [Bleeding]: 1.\n* 2 Damage: Face Gash. [Stress]: 1. [Bleeding]: 1.\n* 3 Damage: Throat Slashed. [Bleeding]: 2, [Stress]: 2.\n* 4 Damage: Spine Severed. [Paralyzed]. [Stress]: 3. [Bleeding]: 2."
    ))

    // (const wound-as)
    Object.assign(nx_tactics_decks_damage.c_wound_as, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_as,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Beheaded. [Dead]."
    ))

    // (const wound-jc)
    Object.assign(nx_tactics_decks_damage.c_wound_jc, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Abdomen",
      ":titles",
      "Bash: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jc,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-jd)
    Object.assign(nx_tactics_decks_damage.c_wound_jd, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Abdomen",
      ":titles",
      "Pierce: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jd,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-jh)
    Object.assign(nx_tactics_decks_damage.c_wound_jh, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Abdomen",
      ":titles",
      "Hack: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jh,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-js)
    Object.assign(nx_tactics_decks_damage.c_wound_js, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Abdomen",
      ":titles",
      "Slash: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_js,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-kc)
    Object.assign(nx_tactics_decks_damage.c_wound_kc, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_kc,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-kd)
    Object.assign(nx_tactics_decks_damage.c_wound_kd, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_kd,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-kh)
    Object.assign(nx_tactics_decks_damage.c_wound_kh, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_kh,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-ks)
    Object.assign(nx_tactics_decks_damage.c_wound_ks, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ks,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-qc)
    Object.assign(nx_tactics_decks_damage.c_wound_qc, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Chest",
      ":titles",
      "Bash: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qc,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-qd)
    Object.assign(nx_tactics_decks_damage.c_wound_qd, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Chest",
      ":titles",
      "Pierce: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qd,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-qh)
    Object.assign(nx_tactics_decks_damage.c_wound_qh, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Chest",
      ":titles",
      "Hack: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qh,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-qs)
    Object.assign(nx_tactics_decks_damage.c_wound_qs, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Chest",
      ":titles",
      "Slash: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qs,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-tc)
    Object.assign(nx_tactics_decks_damage.c_wound_tc, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Bash: Vitals",
      ":titles",
      "Bash: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_tc,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-td)
    Object.assign(nx_tactics_decks_damage.c_wound_td, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Pierce: Vitals",
      ":titles",
      "Pierce: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_td,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-th)
    Object.assign(nx_tactics_decks_damage.c_wound_th, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Hack: Vitals",
      ":titles",
      "Hack: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_th,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-ts)
    Object.assign(nx_tactics_decks_damage.c_wound_ts, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Slash: Vitals",
      ":titles",
      "Slash: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ts,
      ":summary",
      "* 1 Damage: Deflected off Skull. [Slow]: 1.\n* 2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n* 3 Damage: Neck Fracture. [Immobilized]. [Slow]: 3. [Bleeding]: 1.\n* 4 Damage: Head Severed. [Dead]."
    ))

    // (const wound-wild-black)
    Object.assign(nx_tactics_decks_damage.c_wound_wild_black, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Black Wild Wound",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jokerblack,
      ":summary",
      "* Search the Deck for any card and play that instead.\n* Shuffle Discards into Deck."
    ))

    // (const wound-wild-red)
    Object.assign(nx_tactics_decks_damage.c_wound_wild_red, vx_core.f_new(
      nx_tactics_base.t_wound,
      ":name",
      "Red Wild Wound",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jokerred,
      ":summary",
      "* Search the Discards for any card and play that instead or play the next card instead.\n* Shuffle Discards into Deck."
    ))

  }
}
