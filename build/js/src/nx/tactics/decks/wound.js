'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_wound {

  /**
   * Constant: fatigue
   * {cardback}
   */
  static c_fatigue = {vx_type: nx_tactics_base.t_cardback, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'fatigue', type: nx_tactics_base.t_cardback}}

  /**
   * Constant: wound-2c
   * {damage}
   */
  static c_wound_2c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-2c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-2d
   * {damage}
   */
  static c_wound_2d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-2d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-2h
   * {damage}
   */
  static c_wound_2h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-2h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-2s
   * {damage}
   */
  static c_wound_2s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-2s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-3c
   * {damage}
   */
  static c_wound_3c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-3c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-3d
   * {damage}
   */
  static c_wound_3d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-3d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-3h
   * {damage}
   */
  static c_wound_3h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-3h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-3s
   * {damage}
   */
  static c_wound_3s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-3s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-4c
   * {damage}
   */
  static c_wound_4c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-4c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-4d
   * {damage}
   */
  static c_wound_4d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-4d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-4h
   * {damage}
   */
  static c_wound_4h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-4h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-4s
   * {damage}
   */
  static c_wound_4s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-4s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-5c
   * {damage}
   */
  static c_wound_5c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-5c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-5d
   * {damage}
   */
  static c_wound_5d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-5d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-5h
   * {damage}
   */
  static c_wound_5h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-5h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-5s
   * {damage}
   */
  static c_wound_5s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-5s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-6c
   * {damage}
   */
  static c_wound_6c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-6c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-6d
   * {damage}
   */
  static c_wound_6d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-6d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-6h
   * {damage}
   */
  static c_wound_6h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-6h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-6s
   * {damage}
   */
  static c_wound_6s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-6s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-7c
   * {damage}
   */
  static c_wound_7c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-7c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-7d
   * {damage}
   */
  static c_wound_7d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-7d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-7h
   * {damage}
   */
  static c_wound_7h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-7h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-7s
   * {damage}
   */
  static c_wound_7s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-7s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-8c
   * {damage}
   */
  static c_wound_8c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-8c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-8d
   * {damage}
   */
  static c_wound_8d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-8d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-8h
   * {damage}
   */
  static c_wound_8h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-8h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-8s
   * {damage}
   */
  static c_wound_8s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-8s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-9c
   * {damage}
   */
  static c_wound_9c = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-9c', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-9d
   * {damage}
   */
  static c_wound_9d = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-9d', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-9h
   * {damage}
   */
  static c_wound_9h = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-9h', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-9s
   * {damage}
   */
  static c_wound_9s = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-9s', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-ac
   * {damage}
   */
  static c_wound_ac = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-ac', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-ad
   * {damage}
   */
  static c_wound_ad = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-ad', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-ah
   * {damage}
   */
  static c_wound_ah = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-ah', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-as
   * {damage}
   */
  static c_wound_as = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-as', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-jc
   * {damage}
   */
  static c_wound_jc = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-jc', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-jd
   * {damage}
   */
  static c_wound_jd = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-jd', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-jh
   * {damage}
   */
  static c_wound_jh = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-jh', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-js
   * {damage}
   */
  static c_wound_js = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-js', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-kc
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_kc = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-kc', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-kd
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_kd = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-kd', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-kh
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_kh = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-kh', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-ks
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_ks = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-ks', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-qc
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_qc = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-qc', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-qd
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_qd = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-qd', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-qh
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_qh = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-qh', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-qs
   * Hack: Upper Chest/Back/Shoulders/Ribs
   * {damage}
   */
  static c_wound_qs = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-qs', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-tc
   * {damage}
   */
  static c_wound_tc = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-tc', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-td
   * {damage}
   */
  static c_wound_td = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-td', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-th
   * {damage}
   */
  static c_wound_th = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-th', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-ts
   * {damage}
   */
  static c_wound_ts = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-ts', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-wild-black
   * {damage}
   */
  static c_wound_wild_black = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-wild-black', type: nx_tactics_base.t_damage}}

  /**
   * Constant: wound-wild-red
   * {damage}
   */
  static c_wound_wild_red = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/decks/wound', name: 'wound-wild-red', type: nx_tactics_base.t_damage}}

  /**
   * @function deck_wound
   * Wound Deck
   * @return {deck}
   */
  static t_deck_wound = {
    vx_type: vx_core.t_type
  }
  static e_deck_wound = {
    vx_type: nx_tactics_decks_wound.t_deck_wound
  }

  // (func deck-wound)
  static f_deck_wound() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Wounds",
      ":image",
      "images/card-wound-deck.svg",
      ":layout",
      nx_tactics_base.c_cardlayout_imageonly,
      ":cardmap",
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_cardmap},
        nx_tactics_base.f_cardmap_from_cardlist(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_cardlist},
            nx_tactics_decks_wound.c_wound_wild_black,
            nx_tactics_decks_wound.c_wound_wild_red,
            nx_tactics_decks_wound.c_wound_ac,
            nx_tactics_decks_wound.c_wound_ad,
            nx_tactics_decks_wound.c_wound_ah,
            nx_tactics_decks_wound.c_wound_as,
            nx_tactics_decks_wound.c_wound_kc,
            nx_tactics_decks_wound.c_wound_kd,
            nx_tactics_decks_wound.c_wound_kh,
            nx_tactics_decks_wound.c_wound_ks,
            nx_tactics_decks_wound.c_wound_qc,
            nx_tactics_decks_wound.c_wound_qd,
            nx_tactics_decks_wound.c_wound_qh,
            nx_tactics_decks_wound.c_wound_qs,
            nx_tactics_decks_wound.c_wound_jc,
            nx_tactics_decks_wound.c_wound_jd,
            nx_tactics_decks_wound.c_wound_jh,
            nx_tactics_decks_wound.c_wound_js,
            nx_tactics_decks_wound.c_wound_tc,
            nx_tactics_decks_wound.c_wound_td,
            nx_tactics_decks_wound.c_wound_th,
            nx_tactics_decks_wound.c_wound_ts,
            nx_tactics_decks_wound.c_wound_9c,
            nx_tactics_decks_wound.c_wound_9d,
            nx_tactics_decks_wound.c_wound_9h,
            nx_tactics_decks_wound.c_wound_9s,
            nx_tactics_decks_wound.c_wound_8c,
            nx_tactics_decks_wound.c_wound_8d,
            nx_tactics_decks_wound.c_wound_8h,
            nx_tactics_decks_wound.c_wound_8s,
            nx_tactics_decks_wound.c_wound_7c,
            nx_tactics_decks_wound.c_wound_7d,
            nx_tactics_decks_wound.c_wound_7h,
            nx_tactics_decks_wound.c_wound_7s,
            nx_tactics_decks_wound.c_wound_6c,
            nx_tactics_decks_wound.c_wound_6d,
            nx_tactics_decks_wound.c_wound_6h,
            nx_tactics_decks_wound.c_wound_6s,
            nx_tactics_decks_wound.c_wound_5c,
            nx_tactics_decks_wound.c_wound_5d,
            nx_tactics_decks_wound.c_wound_5h,
            nx_tactics_decks_wound.c_wound_5s,
            nx_tactics_decks_wound.c_wound_4c,
            nx_tactics_decks_wound.c_wound_4d,
            nx_tactics_decks_wound.c_wound_4h,
            nx_tactics_decks_wound.c_wound_4s,
            nx_tactics_decks_wound.c_wound_3c,
            nx_tactics_decks_wound.c_wound_3d,
            nx_tactics_decks_wound.c_wound_3h,
            nx_tactics_decks_wound.c_wound_3s,
            nx_tactics_decks_wound.c_wound_2c,
            nx_tactics_decks_wound.c_wound_2d,
            nx_tactics_decks_wound.c_wound_2h,
            nx_tactics_decks_wound.c_wound_2s
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          nx_tactics_decks_wound.c_fatigue,
          54,
          false
        )
      )
    )
    return output
  }

  /**
   * @function deck_woundback
   * Wound Back Deck
   * @return {deck}
   */
  static t_deck_woundback = {
    vx_type: vx_core.t_type
  }
  static e_deck_woundback = {
    vx_type: nx_tactics_decks_wound.t_deck_woundback
  }

  // (func deck-woundback)
  static f_deck_woundback() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Wound Back",
      ":image",
      "images/card-wound-fatigue.svg",
      ":layout",
      nx_tactics_base.c_cardlayout_imageonly,
      ":cardmap",
      nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
        nx_tactics_decks_wound.c_fatigue,
        54,
        false
      )
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "fatigue": nx_tactics_decks_wound.c_fatigue,
      "wound-2c": nx_tactics_decks_wound.c_wound_2c,
      "wound-2d": nx_tactics_decks_wound.c_wound_2d,
      "wound-2h": nx_tactics_decks_wound.c_wound_2h,
      "wound-2s": nx_tactics_decks_wound.c_wound_2s,
      "wound-3c": nx_tactics_decks_wound.c_wound_3c,
      "wound-3d": nx_tactics_decks_wound.c_wound_3d,
      "wound-3h": nx_tactics_decks_wound.c_wound_3h,
      "wound-3s": nx_tactics_decks_wound.c_wound_3s,
      "wound-4c": nx_tactics_decks_wound.c_wound_4c,
      "wound-4d": nx_tactics_decks_wound.c_wound_4d,
      "wound-4h": nx_tactics_decks_wound.c_wound_4h,
      "wound-4s": nx_tactics_decks_wound.c_wound_4s,
      "wound-5c": nx_tactics_decks_wound.c_wound_5c,
      "wound-5d": nx_tactics_decks_wound.c_wound_5d,
      "wound-5h": nx_tactics_decks_wound.c_wound_5h,
      "wound-5s": nx_tactics_decks_wound.c_wound_5s,
      "wound-6c": nx_tactics_decks_wound.c_wound_6c,
      "wound-6d": nx_tactics_decks_wound.c_wound_6d,
      "wound-6h": nx_tactics_decks_wound.c_wound_6h,
      "wound-6s": nx_tactics_decks_wound.c_wound_6s,
      "wound-7c": nx_tactics_decks_wound.c_wound_7c,
      "wound-7d": nx_tactics_decks_wound.c_wound_7d,
      "wound-7h": nx_tactics_decks_wound.c_wound_7h,
      "wound-7s": nx_tactics_decks_wound.c_wound_7s,
      "wound-8c": nx_tactics_decks_wound.c_wound_8c,
      "wound-8d": nx_tactics_decks_wound.c_wound_8d,
      "wound-8h": nx_tactics_decks_wound.c_wound_8h,
      "wound-8s": nx_tactics_decks_wound.c_wound_8s,
      "wound-9c": nx_tactics_decks_wound.c_wound_9c,
      "wound-9d": nx_tactics_decks_wound.c_wound_9d,
      "wound-9h": nx_tactics_decks_wound.c_wound_9h,
      "wound-9s": nx_tactics_decks_wound.c_wound_9s,
      "wound-ac": nx_tactics_decks_wound.c_wound_ac,
      "wound-ad": nx_tactics_decks_wound.c_wound_ad,
      "wound-ah": nx_tactics_decks_wound.c_wound_ah,
      "wound-as": nx_tactics_decks_wound.c_wound_as,
      "wound-jc": nx_tactics_decks_wound.c_wound_jc,
      "wound-jd": nx_tactics_decks_wound.c_wound_jd,
      "wound-jh": nx_tactics_decks_wound.c_wound_jh,
      "wound-js": nx_tactics_decks_wound.c_wound_js,
      "wound-kc": nx_tactics_decks_wound.c_wound_kc,
      "wound-kd": nx_tactics_decks_wound.c_wound_kd,
      "wound-kh": nx_tactics_decks_wound.c_wound_kh,
      "wound-ks": nx_tactics_decks_wound.c_wound_ks,
      "wound-qc": nx_tactics_decks_wound.c_wound_qc,
      "wound-qd": nx_tactics_decks_wound.c_wound_qd,
      "wound-qh": nx_tactics_decks_wound.c_wound_qh,
      "wound-qs": nx_tactics_decks_wound.c_wound_qs,
      "wound-tc": nx_tactics_decks_wound.c_wound_tc,
      "wound-td": nx_tactics_decks_wound.c_wound_td,
      "wound-th": nx_tactics_decks_wound.c_wound_th,
      "wound-ts": nx_tactics_decks_wound.c_wound_ts,
      "wound-wild-black": nx_tactics_decks_wound.c_wound_wild_black,
      "wound-wild-red": nx_tactics_decks_wound.c_wound_wild_red
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "deck-wound": nx_tactics_decks_wound.e_deck_wound,
      "deck-woundback": nx_tactics_decks_wound.e_deck_woundback
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-wound": nx_tactics_decks_wound.t_deck_wound,
      "deck-woundback": nx_tactics_decks_wound.t_deck_woundback
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/wound",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-wound)
    nx_tactics_decks_wound.t_deck_wound['vx_value'] = {
      name          : "deck-wound",
      pkgname       : "nx/tactics/decks/wound",
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
      fn            : nx_tactics_decks_wound.f_deck_wound
    }

    // (func deck-woundback)
    nx_tactics_decks_wound.t_deck_woundback['vx_value'] = {
      name          : "deck-woundback",
      pkgname       : "nx/tactics/decks/wound",
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
      fn            : nx_tactics_decks_wound.f_deck_woundback
    }

    // (const fatigue)
    Object.assign(nx_tactics_decks_wound.c_fatigue, vx_core.f_new({"any-1": nx_tactics_base.t_cardback}, ":id", "fatigue", ":name", "Wound: Fatigue", ":titles", "Physical Damage/Fatigue/Weaken/Exertion", ":image", "images/card-wound-fatigue.svg", ":summary", "Temporary weaknesss or exertion\n* IF [Body]:0 THEN [Exhausted]\n* [Exhausted]: [Disadvantage]. Extra [Fatigue] is flipped to Wound"))

    // (const wound-2c)
    Object.assign(nx_tactics_decks_wound.c_wound_2c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Right Foot",
      ":titles",
      "Bash: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2c,
      ":image",
      "images/card-wound-foot-right.svg",
      ":summary",
      "Minor: Shin Bruised. Slow:1\nMajor: Foot Smash. Slow:1 Stress:1\nCritical: Ankle Fracture. Hobbled. Slow:2\nExtreme: Foot Shattered. Hobbled. Fatigue:2 Slow:2"
    ))

    // (const wound-2d)
    Object.assign(nx_tactics_decks_wound.c_wound_2d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Right Foot",
      ":titles",
      "Pierce: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2d,
      ":image",
      "images/card-wound-foot-right.svg",
      ":summary",
      "Minor: Ankle Graze. Slow:1\nMajor: Foot Slash. Slow:1 Bleeding:1\nCritical: Foot Pierced. Slow:3 Bleeding:1\nExtreme: Ankle Useless. Hobbled. Bleeding:1"
    ))

    // (const wound-2h)
    Object.assign(nx_tactics_decks_wound.c_wound_2h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Right Foot",
      ":titles",
      "Hack: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2h,
      ":image",
      "images/card-wound-foot-right.svg",
      ":summary",
      "Minor: Ankle Grazed. Withdraw:1\nMajor: Ankle Gash. Withdraw:1 Bleeding:1\nCritical: 2 Toes Lost. Stress:2 Bleeding:1\nExtreme: Foot Mangled. Hobbled. Stress:2 Bleeding:2"
    ))

    // (const wound-2s)
    Object.assign(nx_tactics_decks_wound.c_wound_2s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Right Foot",
      ":titles",
      "Slash: Right Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_2s,
      ":image",
      "images/card-wound-foot-right.svg",
      ":summary",
      "Minor: Foot Cut. Bleeding:1\nMajor: Ankle Slash. Slow:1 Bleeding:1\nCritical: Cut Achilles Tendon. Hobbled. Slow:3 Bleeding:1\nExtreme: Foot Severed. Hobbled. Bleeding:2"
    ))

    // (const wound-3c)
    Object.assign(nx_tactics_decks_wound.c_wound_3c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Left Foot",
      ":titles",
      "Bash: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3c,
      ":image",
      "images/card-wound-foot-left.svg",
      ":summary",
      "Minor: Shin Bruised. Slow:1\nMajor: Foot Smash. Slow:1 Stress:1\nCritical: Ankle Fracture. Hobbled. Slow:2\nExtreme: Foot Shattered. Hobbled. Fatigue:2 Slow:2"
    ))

    // (const wound-3d)
    Object.assign(nx_tactics_decks_wound.c_wound_3d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Left Foot",
      ":titles",
      "Pierce: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3d,
      ":image",
      "images/card-wound-foot-left.svg",
      ":summary",
      "Minor: Ankle Graze. Slow:1\nMajor: Foot Slash. Slow:1 Bleeding:1\nCritical: Foot Pierced. Slow:3 Bleeding:1\nExtreme: Ankle Useless. Hobbled. Bleeding:1"
    ))

    // (const wound-3h)
    Object.assign(nx_tactics_decks_wound.c_wound_3h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Left Foot",
      ":titles",
      "Hack: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3h,
      ":image",
      "images/card-wound-foot-left.svg",
      ":summary",
      "Minor: Ankle Grazed. Withdraw:1\nMajor: Ankle Gash. Withdraw:1 Bleeding:1\nCritical: 2 Toes Lost. Stress:2 Bleeding:1\nExtreme: Foot Mangled. Hobbled. Stress:2 Bleeding:2"
    ))

    // (const wound-3s)
    Object.assign(nx_tactics_decks_wound.c_wound_3s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Left Foot",
      ":titles",
      "Slash: Left Lower Leg/Shin/Ankle/Foot",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_3s,
      ":image",
      "images/card-wound-foot-left.svg",
      ":summary",
      "Minor: Foot Cut. Bleeding:1\nMajor: Ankle Slash. Slow:1 Bleeding:1\nCritical: Cut Achilles Tendon. Hobbled. Slow:3 Bleeding:1\nExtreme: Foot Severed. Hobbled. Bleeding:2"
    ))

    // (const wound-4c)
    Object.assign(nx_tactics_decks_wound.c_wound_4c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Right Leg",
      ":titles",
      "Bash: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4c,
      ":image",
      "images/card-wound-leg-right.svg",
      ":summary",
      "Minor: Thigh Bruise. Fatigue:1\nMajor: Knee Damage. Slow:1 Fatigue:1\nCritical: Knee Fracture. Hobbled. Slow:2 Fatigue: 1\nExtreme: Thigh Fracture. Hobbled. Slow:3 Fatigue:1"
    ))

    // (const wound-4d)
    Object.assign(nx_tactics_decks_wound.c_wound_4d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Right Leg",
      ":titles",
      "Pierce: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4d,
      ":image",
      "images/card-wound-leg-right.svg",
      ":summary",
      "Minor: Thigh Graze. Slow:1\nMajor: Thigh Pierced. Stress:1 Bleeding:1\nCritical: Knee Pierced. Hobbled. Slow:3 Bleeding:1\nExtreme: Knee Disabled. Hobbled. Bleeding:2 Stress:2"
    ))

    // (const wound-4h)
    Object.assign(nx_tactics_decks_wound.c_wound_4h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Right Leg",
      ":titles",
      "Hack: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4h,
      ":image",
      "images/card-wound-leg-right.svg",
      ":summary",
      "Minor: Thigh Graze. Withdraw:1\nMajor: Thigh Cut. Withdraw:1 Bleeding:1\nCritical: Wide Thigh Gash. Slow:2 Bleeding:2\nExtreme: Severed at Knee. Hobbled. Bleeding:2 Stress:2"
    ))

    // (const wound-4s)
    Object.assign(nx_tactics_decks_wound.c_wound_4s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Right Leg",
      ":titles",
      "Slash: Right Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_4s,
      ":image",
      "images/card-wound-leg-right.svg",
      ":summary",
      "Minor: Thigh Cut. Bleeding:1\nMajor: Thigh Slash. Scarred. Slow:1 Bleeding:1\nCritical: Hamstring Cut. Hobbled. Slow:2 Bleeding:2\nExtreme: Artery Severed. Bleeding:4 Stress:2"
    ))

    // (const wound-5c)
    Object.assign(nx_tactics_decks_wound.c_wound_5c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Left Leg",
      ":titles",
      "Bash: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5c,
      ":image",
      "images/card-wound-leg-left.svg",
      ":summary",
      "Minor: Thigh Bruise. Fatigue:1\nMajor: Knee Damage. Slow:1 Fatigue:1\nCritical: Knee Fracture. Hobbled. Slow:2 Fatigue: 1\nExtreme: Thigh Fracture. Hobbled. Slow:3 Fatigue:1"
    ))

    // (const wound-5d)
    Object.assign(nx_tactics_decks_wound.c_wound_5d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Left Leg",
      ":titles",
      "Pierce: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5d,
      ":image",
      "images/card-wound-leg-left.svg",
      ":summary",
      "Minor: Thigh Graze. Slow:1\nMajor: Thigh Pierced. Stress:1 Bleeding:1\nCritical: Knee Pierced. Hobbled. Slow:3 Bleeding:1\nExtreme: Knee Disabled. Hobbled. Bleeding:2 Stress:2"
    ))

    // (const wound-5h)
    Object.assign(nx_tactics_decks_wound.c_wound_5h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Left Leg",
      ":titles",
      "Hack: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5h,
      ":image",
      "images/card-wound-leg-left.svg",
      ":summary",
      "Minor: Thigh Graze. Withdraw:1\nMajor: Thigh Slash. Withdraw:1 Bleeding:1\nCritical: Wide Thigh Gash. Slow:2 Bleeding:2\nExtreme: Severed at Knee. Hobbled. Bleeding:2 Stress:2"
    ))

    // (const wound-5s)
    Object.assign(nx_tactics_decks_wound.c_wound_5s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Left Leg",
      ":titles",
      "Slash: Left Upper Leg/Thigh/Knee",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_5s,
      ":image",
      "images/card-wound-leg-left.svg",
      ":summary",
      "Minor: Thigh Cut. Bleeding:1\nMajor: Thigh Slash. Scarred. Slow:1 Bleeding:1\nCritical: Hamstring Cut. Hobbled. Slow:2 Bleeding:2\nExtreme: Artery Severed. Bleeding:4 Stress:2"
    ))

    // (const wound-6c)
    Object.assign(nx_tactics_decks_wound.c_wound_6c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Right Hand",
      ":titles",
      "Bash: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6c,
      ":image",
      "images/card-wound-hand-right.svg",
      ":summary",
      "Minor: Forearm Bruise. Fatigue:1\nMajor: Hand Numb. Drop:1 Stress:1 Stun:1\nCritical: Hand Fracture. Impaired. Stun:2 Fatigue:1\nExtreme: Hand Shattered. Impaired. Stun:2 Stress:2"
    ))

    // (const wound-6d)
    Object.assign(nx_tactics_decks_wound.c_wound_6d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Right Hand",
      ":titles",
      "Pierce: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6d,
      ":image",
      "images/card-wound-hand-right.svg",
      ":summary",
      "Minor: Forearm Graze. Stun:1\nMajor: Forearm Pierced. Stun:1 Bleeding:1\nCritical: Wrist Pierced. Impaired. Stun:1 Bleeding:2\nExtreme: Artery Cut. Impaired. Stun:2 Bleeding:2"
    ))

    // (const wound-6h)
    Object.assign(nx_tactics_decks_wound.c_wound_6h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Right Hand",
      ":titles",
      "Hack: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6h,
      ":image",
      "images/card-wound-hand-right.svg",
      ":summary",
      "Minor: Forearm Graze. Withdraw:1\nMajor: Forearm Gash. Drop:1 Stress:1 Bleeding:1\nCritical: Hand Slash. Impaired. Stress:2 Bleeding:2\nExtreme: Hand Mangled. Impaired. Bleeding:2 Stress:2"
    ))

    // (const wound-6s)
    Object.assign(nx_tactics_decks_wound.c_wound_6s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Right Hand",
      ":titles",
      "Slash: Right Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_6s,
      ":image",
      "images/card-wound-hand-right.svg",
      ":summary",
      "Minor: Forearm Cut. Bleeding:1\nMajor: Forearm Slash. Drop:1 Slow:1 Bleeding:1\nExtreme: Artery Severed. Impaired. Bleeding:3 Stress:1\nExtreme: Hand Severed. Impaired. Bleeding:2 Stress:2"
    ))

    // (const wound-7c)
    Object.assign(nx_tactics_decks_wound.c_wound_7c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Left Hand",
      ":titles",
      "Bash: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7c,
      ":image",
      "images/card-wound-hand-left.svg",
      ":summary",
      "Minor: Forearm Bruise. Fatigue:1\nMajor: Hand Numb. Drop:1 Stress:1 Stun:1\nCritical: Hand Fracture. Impaired. Stun:2 Fatigue:1\nExtreme: Hand Shattered. Impaired. Stun:2 Stress:2"
    ))

    // (const wound-7d)
    Object.assign(nx_tactics_decks_wound.c_wound_7d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Left Hand",
      ":titles",
      "Pierce: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7d,
      ":image",
      "images/card-wound-hand-left.svg",
      ":summary",
      "Minor: Forearm Graze. Stun:1\nMajor: Forearm Pierced. Stun:1 Bleeding:1\nCritical: Wrist Pierced. Impaired. Stun:1 Bleeding:2\nExtreme: Artery Cut. Impaired. Stun:2 Bleeding:2"
    ))

    // (const wound-7h)
    Object.assign(nx_tactics_decks_wound.c_wound_7h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Left Hand",
      ":titles",
      "Hack: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7h,
      ":image",
      "images/card-wound-hand-left.svg",
      ":summary",
      "Minor: Forearm Graze. Withdraw:1\nMajor: Forearm Gash. Drop:1 Stress:1 Bleeding:1\nCritical: Hand Slash. Impaired. Stress:2 Bleeding:2\nExtreme: Hand Mangled. Impaired. Bleeding:2 Stress:2"
    ))

    // (const wound-7s)
    Object.assign(nx_tactics_decks_wound.c_wound_7s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Left Hand",
      ":titles",
      "Slash: Left Lower Arm/Wrist/Hand",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_7s,
      ":image",
      "images/card-wound-hand-left.svg",
      ":summary",
      "Minor: Forearm Cut. Bleeding:1\nMajor: Forearm Slash. Drop:1 Slow:1 Bleeding:1\nExtreme: Artery Severed. Impaired. Bleeding:3 Stress:1\nExtreme: Hand Severed. Impaired. Bleeding:2 Stress:2"
    ))

    // (const wound-8c)
    Object.assign(nx_tactics_decks_wound.c_wound_8c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Right Arm",
      ":titles",
      "Bash: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8c,
      ":image",
      "images/card-wound-arm-right.svg",
      ":summary",
      "Minor: Arm Bruise. Push:1\nMajor: Arm Battered. Fatigue:1 Push:1\nCritical: Arm Fracture. Impaired. Stress:2 Fatigue:2\nExtreme: Elbow Shattered. Impaired. Stress:3 Fatigue:2"
    ))

    // (const wound-8d)
    Object.assign(nx_tactics_decks_wound.c_wound_8d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Right Arm",
      ":titles",
      "Pierce: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8d,
      ":image",
      "images/card-wound-arm-right.svg",
      ":summary",
      "Minor: Arm Graze. Stun:1\nMajor: Arm Pierced. Stun:1 Bleeding:1\nCritical: Elbow Pierced. Impaired. Stun:3 Bleeding:1\nExtreme: Artery Severed. Bleeding: 4 Stun:2"
    ))

    // (const wound-8h)
    Object.assign(nx_tactics_decks_wound.c_wound_8h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Right Arm",
      ":titles",
      "Hack: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8h,
      ":image",
      "images/card-wound-arm-right.svg",
      ":summary",
      "Minor: Arm Graze. Withdraw:1\nMajor: Arm Gash. Withdraw:1 Bleeding:1\nCritical: Deep Arm Gash. Impaired. Stress:2 Bleeding:2\nExtreme: Elbow Severed. Impaired. Stun:2 Stress:2"
    ))

    // (const wound-8s)
    Object.assign(nx_tactics_decks_wound.c_wound_8s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Right Arm",
      ":titles",
      "Slash: Right Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_8s,
      ":image",
      "images/card-wound-arm-right.svg",
      ":summary",
      "Minor: Arm Cut. Bleeding:1\nMajor: Arm Slash. Slow:1 Bleeding:1\nCritical: Elbow Slash. Impaired. Slow:2 Bleeding:2\nExtreme: Artery Severed. Bleeding: 4 Stress:2"
    ))

    // (const wound-9c)
    Object.assign(nx_tactics_decks_wound.c_wound_9c, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Left Arm",
      ":titles",
      "Bash: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9c,
      ":image",
      "images/card-wound-arm-left.svg",
      ":summary",
      "Minor: Arm Bruise. Push:1\nMajor: Arm Battered. Fatigue:1 Push:1\nCritical: Arm Fracture. Impaired. Stress:2 Fatigue:2\nExtreme: Elbow Shattered. Impaired. Stress:3 Fatigue:2"
    ))

    // (const wound-9d)
    Object.assign(nx_tactics_decks_wound.c_wound_9d, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Left Arm",
      ":titles",
      "Pierce: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9d,
      ":image",
      "images/card-wound-arm-left.svg",
      ":summary",
      "Minor: Arm Graze. Stun:1\nMajor: Arm Numb. Stun:1 Bleeding:1\nCritical: Elbow Pierced. Impaired. Stun:3 Bleeding:1\nExtreme: Artery Severed. Bleeding: 4 Stun:2"
    ))

    // (const wound-9h)
    Object.assign(nx_tactics_decks_wound.c_wound_9h, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Left Arm",
      ":titles",
      "Hack: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9h,
      ":image",
      "images/card-wound-arm-left.svg",
      ":summary",
      "Minor: Arm Graze. Withdraw:1\nMajor: Arm Gash. Withdraw:1 Bleeding:1\nCritical: Deep Arm Gash. Impaired. Stress:2 Bleeding:2\nExtreme: Elbow Severed. Impaired. Stun:2 Stress:2"
    ))

    // (const wound-9s)
    Object.assign(nx_tactics_decks_wound.c_wound_9s, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Left Arm",
      ":titles",
      "Slash: Left Upper Arm/Elbow",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_9s,
      ":image",
      "images/card-wound-arm-left.svg",
      ":summary",
      "Minor: Arm Cut. Bleeding:1\nMajor: Arm Slash. Slow:1 Bleeding:1\nCritical: Elbow Slash. Impaired. Slow:2 Bleeding:2\nExtreme: Artery Severed. Bleeding: 4 Stress:2"
    ))

    // (const wound-ac)
    Object.assign(nx_tactics_decks_wound.c_wound_ac, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ac,
      ":image",
      "images/card-wound-head.svg",
      ":summary",
      "Minor: Head Ringing. Stun:1\nMajor: Concussion. Stun:1 Push:1\nCritical: Skull Fracture. Unconscious. Stun:1 Fatigue:1 Push:1 Knockdown:1\nExtreme: Skull Crushed. Dead."
    ))

    // (const wound-ad)
    Object.assign(nx_tactics_decks_wound.c_wound_ad, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ad,
      ":image",
      "images/card-wound-head.svg",
      ":summary",
      "Minor: Head Grazed. Stun:1\nMajor: Pierced Throat. Can't speak. Stun: 1, Stress:1\nCritical: Blinded in one Eye. Partly Blind. Stun:2 Stress:1\nExtreme: Brain Pierced. Dying. Disorder:2"
    ))

    // (const wound-ah)
    Object.assign(nx_tactics_decks_wound.c_wound_ah, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ah,
      ":image",
      "images/card-wound-head.svg",
      ":reference",
      "* Not the face!",
      ":summary",
      "Minor: Head Graze. Stress:1\nMajor: Head Slash. Slow:1 Bleeding:1\nCritical: Neck Fracture. Immobilized. Slow:3 Bleeding:1\nExtreme: Spine Severed. Paralyzed. Stress:3 Bleeding:2"
    ))

    // (const wound-as)
    Object.assign(nx_tactics_decks_wound.c_wound_as, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Head",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_as,
      ":image",
      "images/damage-wound-as.svg",
      ":layout",
      nx_tactics_base.c_cardlayout_imageonly
    ))

    // (const wound-jc)
    Object.assign(nx_tactics_decks_wound.c_wound_jc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Abdomen",
      ":titles",
      "Bash: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jc,
      ":image",
      "images/card-wound-abdomen.svg",
      ":summary",
      "Minor: Stomach Bruise. Push:1\nMajor: Solar Plexus Bruise. Slow:1 Fatigue:1\nCritical: Hip Fracture. Hobbled. Slow:3 Bleeding:1\nExtreme: Crushed Hip. Immobilized. Bleeding:3 Stress:2"
    ))

    // (const wound-jd)
    Object.assign(nx_tactics_decks_wound.c_wound_jd, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Abdomen",
      ":titles",
      "Pierce: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jd,
      ":image",
      "images/card-wound-abdomen.svg",
      ":summary",
      "Minor: Side Puncture. Bleeding:1\nMajor: Belly Puncture. Slow:1 Bleeding:1\nCritical: Liver Pierced. Bleeding:2 Slow:2\nExtreme: Stomach Pierced. Hobbled. Bleeding:3 [Acid]:2"
    ))

    // (const wound-jh)
    Object.assign(nx_tactics_decks_wound.c_wound_jh, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Abdomen",
      ":titles",
      "Hack: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jh,
      ":image",
      "images/card-wound-abdomen.svg",
      ":summary",
      "Minor: Glance off Hip. Bleeding:1\nMajor: Stomach Cut. Bleeding:1 Stress:1\nCritical: Kidney Damage. Slow:1 Bleeding:1 Fatigue:2\nExtreme: Renal Failure: Dying. Fatigue:3 Stress:2"
    ))

    // (const wound-js)
    Object.assign(nx_tactics_decks_wound.c_wound_js, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Abdomen",
      ":titles",
      "Slash: Abdomen/Lower Back",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_js,
      ":image",
      "images/card-wound-abdomen.svg",
      ":summary",
      "Minor: Stomach Cut. Bleeding:1\nMajor: Stomach Slash. Slow:1 Bleeding:1\nCritical: Stomach Gash. Slow:1 Bleeding:3\nExtreme: Disemboweled. Bleeding:4 Stress:2"
    ))

    // (const wound-kc)
    Object.assign(nx_tactics_decks_wound.c_wound_kc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_kc,
      ":image",
      "images/card-wound-shoulders.svg",
      ":summary",
      "Minor: Shoulder Bruise. Fatigue:1\nMajor: Bruised Ribs. Slow:1 Fatigue:1 Push:1\nCritical: Broken Ribs. Hobbled. Slow:2 Push:1\nExtreme: Rib Cage Collapse. Dead. Push:1"
    ))

    // (const wound-kd)
    Object.assign(nx_tactics_decks_wound.c_wound_kd, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_kd,
      ":image",
      "images/card-wound-shoulders.svg",
      ":summary",
      "Minor: Glance off Shoulder. Stun:1\nMajor: Pierced Shoulder. Stun:1 Bleeding:1\nCritical: Pierced Chest. Stun:2 Bleeding:2\nExtreme: Pierced Throat. Bleeding:2 Stun:2"
    ))

    // (const wound-kh)
    Object.assign(nx_tactics_decks_wound.c_wound_kh, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_kh,
      ":image",
      "images/card-wound-shoulders.svg",
      ":summary",
      "Minor: Chest Graze. Stress:1\nMajor: Chest Slash. Stress:1 Bleeding:1\nCritical: Bleeding in Chest Cavity. Stress:2 Bleeding:2\nExtreme: Shoulder Cleaved. Dying. Bleeding:3 Stun:2"
    ))

    // (const wound-ks)
    Object.assign(nx_tactics_decks_wound.c_wound_ks, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Shoulders",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ks,
      ":image",
      "images/card-wound-shoulders.svg",
      ":summary",
      "Minor: Shoulder Cut. Bleeding:1\nMajor: Shoulder Slash. Slow:1 Bleeding:1\nCritical: Throat Cut. Bleeding:2 Stress:2\nExtreme: Throat Slashed. Bleeding:4 Stun:2"
    ))

    // (const wound-qc)
    Object.assign(nx_tactics_decks_wound.c_wound_qc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Chest",
      ":titles",
      "Bash: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qc,
      ":image",
      "images/card-wound-chest.svg",
      ":summary",
      "Minor: Chest Bruise. Fatigue:1\nMajor: Wind Knocked Out. Slow:1 Fatigue:1 Push:1\nCritical: Heart Trauma. Slow:2 Stress:2 Push:1\nExtreme: Heart Stopped. Dying. Push:1"
    ))

    // (const wound-qd)
    Object.assign(nx_tactics_decks_wound.c_wound_qd, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Chest",
      ":titles",
      "Pierce: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qd,
      ":image",
      "images/card-wound-chest.svg",
      ":summary",
      "Minor: Chest Graze. Bleeding:1\nMajor: Chest Pierced. Stun:1 Bleeding:1\nCritical: Lung Punctured. Hobbled. Bleeding:2 Stun:2\nExtreme: Heart Pierced. Dying. Bleeding:4 Stun:2"
    ))

    // (const wound-qh)
    Object.assign(nx_tactics_decks_wound.c_wound_qh, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Chest",
      ":titles",
      "Hack: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qh,
      ":image",
      "images/card-wound-chest.svg",
      ":summary",
      "Minor: Chest Cut. Bleeding:1\nMajor: Chest Slash. Bleeding:1 Push:1\nCritical: Collapsed Lung. Hobbled. Slow:2 Push:1\nExtreme: Lungs Collapsed. Dying. Hobbled. Stress:4"
    ))

    // (const wound-qs)
    Object.assign(nx_tactics_decks_wound.c_wound_qs, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Chest",
      ":titles",
      "Slash: Middle Chest/Back/Lungs/Heart",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_qs,
      ":image",
      "images/card-wound-chest.svg",
      ":summary",
      "Minor: Chest Cut. Bleeding:1\nMajor: Chest Slash. Slow:1 Bleeding:1\nCritical: Long Chest Slash. Slow:2 Bleeding:2\nExtreme: Spine Severed. [Paralyzed]. Stress:4"
    ))

    // (const wound-tc)
    Object.assign(nx_tactics_decks_wound.c_wound_tc, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Bash: Vitals",
      ":titles",
      "Bash: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_tc,
      ":image",
      "images/card-wound-vitals.svg",
      ":summary",
      "Minor: Hip Bruise. Stun:1\nMajor: Genital Slam. Slow:1 Stun:1 Stress:1\nCritical: Kidney Rupture. Slow:2 Bleeding:1 Fatigue:1\nExtreme: Hip Fracture: Hobbled. Slow:2 Fatigue:2"
    ))

    // (const wound-td)
    Object.assign(nx_tactics_decks_wound.c_wound_td, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Pierce: Vitals",
      ":titles",
      "Pierce: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_td,
      ":image",
      "images/card-wound-vitals.svg",
      ":summary",
      "Minor: Buttock Pierced. Bleeding:1\nMajor: Gut Pierced. Stun:1 Bleeding:1\nCritical: Partially Sterilized. Stress:2 Bleeding:2\nExtreme: Intestines Pierced. Diseased:2 Slow:1 Bleeding:1"
    ))

    // (const wound-th)
    Object.assign(nx_tactics_decks_wound.c_wound_th, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Hack: Vitals",
      ":titles",
      "Hack: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_th,
      ":image",
      "images/card-wound-vitals.svg",
      ":summary",
      "Minor: Hip Graze. Bleeding:1\nMajor: Hip Gash. Stress:1 Bleeding:1\nCritical: Sterilized. Immobilized. Slow:3 Bleeding:1 Stress:2\nExtreme: Wide Groin Gash. Bleeding:4 Stress:2"
    ))

    // (const wound-ts)
    Object.assign(nx_tactics_decks_wound.c_wound_ts, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Slash: Vitals",
      ":titles",
      "Slash: Hips/Groin",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_ts,
      ":image",
      "images/card-wound-vitals.svg",
      ":summary",
      "Minor: Hip Graze. Bleeding:1\nMajor: Groin Slash. Slow:1 Bleeding:1\nCritical: Sterilized. Immobilized. Slow:3 Bleeding:1 Stress:2\nExtreme: Groin opened up. Bleeding:4 Stress:2"
    ))

    // (const wound-wild-black)
    Object.assign(nx_tactics_decks_wound.c_wound_wild_black, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Wound: Deck",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jokerblack,
      ":image",
      "images/card-hitlocation-jester-black.svg",
      ":summary",
      "Search the Deck for any card and play it. Then Shuffle Discards into Deck."
    ))

    // (const wound-wild-red)
    Object.assign(nx_tactics_decks_wound.c_wound_wild_red, vx_core.f_new(
      {"any-1": nx_tactics_base.t_damage},
      ":name",
      "Wound: Discard",
      ":ranksuit",
      nx_tactics_base.c_ranksuit_jokerred,
      ":image",
      "images/card-hitlocation-jester-red.svg",
      ":summary",
      "Reclaim a card and play it OR play the next card. Then Shuffle Discards into Deck."
    ))

  }
}
