'strict mode'

import vx_core from "../../vx/core.js"
import nx_tactics_base from "../../nx/tactics/base.js"


export default class nx_tactics_damage {

  /**
   * Constant: physical-ca
   * {damage}
   */
  static c_physical_ca = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-ca'}}

  /**
   * Constant: physical-da
   * {damage}
   */
  static c_physical_da = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-da'}}

  /**
   * Constant: physical-ha
   * {damage}
   */
  static c_physical_ha = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-ha'}}

  /**
   * Constant: physical-j1
   * {damage}
   */
  static c_physical_j1 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-j1'}}

  /**
   * Constant: physical-j2
   * {damage}
   */
  static c_physical_j2 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-j2'}}

  /**
   * Constant: physical-s10
   * {damage}
   */
  static c_physical_s10 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s10'}}

  /**
   * Constant: physical-s2
   * {damage}
   */
  static c_physical_s2 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s2'}}

  /**
   * Constant: physical-s3
   * {damage}
   */
  static c_physical_s3 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s3'}}

  /**
   * Constant: physical-s4
   * {damage}
   */
  static c_physical_s4 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s4'}}

  /**
   * Constant: physical-s5
   * {damage}
   */
  static c_physical_s5 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s5'}}

  /**
   * Constant: physical-s6
   * {damage}
   */
  static c_physical_s6 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s6'}}

  /**
   * Constant: physical-s7
   * {damage}
   */
  static c_physical_s7 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s7'}}

  /**
   * Constant: physical-s8
   * {damage}
   */
  static c_physical_s8 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s8'}}

  /**
   * Constant: physical-s9
   * {damage}
   */
  static c_physical_s9 = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-s9'}}

  /**
   * Constant: physical-sa
   * {damage}
   */
  static c_physical_sa = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-sa'}}

  /**
   * Constant: physical-sj
   * {damage}
   */
  static c_physical_sj = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-sj'}}

  /**
   * Constant: physical-sk
   * {damage}
   */
  static c_physical_sk = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-sk'}}

  /**
   * Constant: physical-sq
   * {damage}
   */
  static c_physical_sq = {vx_type: nx_tactics_base.t_damage, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physical-sq'}}

  /**
   * Constant: physicaldamagedeck
   * Physical Damage Deck
   * {deck}
   */
  static c_physicaldamagedeck = {vx_type: nx_tactics_base.t_deck, vx_constdef: {pkgname: 'nx/tactics/damage', name: 'physicaldamagedeck'}}

  // empty types


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "physical-ca": nx_tactics_damage.c_physical_ca,
      "physical-da": nx_tactics_damage.c_physical_da,
      "physical-ha": nx_tactics_damage.c_physical_ha,
      "physical-j1": nx_tactics_damage.c_physical_j1,
      "physical-j2": nx_tactics_damage.c_physical_j2,
      "physical-s10": nx_tactics_damage.c_physical_s10,
      "physical-s2": nx_tactics_damage.c_physical_s2,
      "physical-s3": nx_tactics_damage.c_physical_s3,
      "physical-s4": nx_tactics_damage.c_physical_s4,
      "physical-s5": nx_tactics_damage.c_physical_s5,
      "physical-s6": nx_tactics_damage.c_physical_s6,
      "physical-s7": nx_tactics_damage.c_physical_s7,
      "physical-s8": nx_tactics_damage.c_physical_s8,
      "physical-s9": nx_tactics_damage.c_physical_s9,
      "physical-sa": nx_tactics_damage.c_physical_sa,
      "physical-sj": nx_tactics_damage.c_physical_sj,
      "physical-sk": nx_tactics_damage.c_physical_sk,
      "physical-sq": nx_tactics_damage.c_physical_sq,
      "physicaldamagedeck": nx_tactics_damage.c_physicaldamagedeck
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/damage",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (const physical-ca)
    Object.assign(nx_tactics_damage.c_physical_ca, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Bash: Head",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_club,
      ":doc",
      "* 1 Damage: Head Ringing. [Stun]: 1.\n* 2 Damage: Concussion. [Fatigue]: 1. [Push]: 1.\n* 3 Damage: Skull Fracture. [Unconscious]. [Fatigue]: 2. [Push]: 1. [Knockdown]: 1.\n* 4 Damage: Skull Crushed. [Dead]."
    ))

    // (const physical-da)
    Object.assign(nx_tactics_damage.c_physical_da, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Pierce: Head",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_diamond,
      ":doc",
      "* 1 Damage: Head Grazed. [Stun]: 1.\n* 2 Damage: Pierced Throat. [Can't speak]. [Stun]: 1.\n* 3 Damage: Blinded in one Eye. [Partly Blind]. [Stun]: 2. [Horror]: 1.\n* 4 Damage: Skull Pierced. Dying."
    ))

    // (const physical-ha)
    Object.assign(nx_tactics_damage.c_physical_ha, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Slash: Head",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_heart,
      ":doc",
      "* 1 Damage: Head Cut. [Bleeding]: 1.\n* 2 Damage: Face Gash. [Horror]: 1. [Bleeding]: 1.\n* 3 Damage: Throat Sliced Open. [Bleeding]: 3, [Horror]: 2.\n* 4 Damage: Spine Severed. [Paralyzed]. [Horror]: 3. [Bleeding]: 2."
    ))

    // (const physical-j1)
    Object.assign(nx_tactics_damage.c_physical_j1, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Wild",
      ":doc",
      "* Search the Deck for any card and play that instead.\n* Shuffle Discards into Deck."
    ))

    // (const physical-j2)
    Object.assign(nx_tactics_damage.c_physical_j2, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Wild",
      ":doc",
      "* Search the Discards for any card and play that instead or play the next card instead.\n* Shuffle Discards into Deck."
    ))

    // (const physical-s10)
    Object.assign(nx_tactics_damage.c_physical_s10, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Hips/Groin"
    ))

    // (const physical-s2)
    Object.assign(nx_tactics_damage.c_physical_s2, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Left Lower Leg/Shin/Ankle/Foot"
    ))

    // (const physical-s3)
    Object.assign(nx_tactics_damage.c_physical_s3, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Right Lower Leg/Shin/Ankle/Foot"
    ))

    // (const physical-s4)
    Object.assign(nx_tactics_damage.c_physical_s4, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Left Upper Leg/Thigh/Knee"
    ))

    // (const physical-s5)
    Object.assign(nx_tactics_damage.c_physical_s5, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Right Upper Leg/Thigh/Knee"
    ))

    // (const physical-s6)
    Object.assign(nx_tactics_damage.c_physical_s6, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Left Lower Arm/Wrist/Hand"
    ))

    // (const physical-s7)
    Object.assign(nx_tactics_damage.c_physical_s7, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Right Lower Arm/Wrist/Hand"
    ))

    // (const physical-s8)
    Object.assign(nx_tactics_damage.c_physical_s8, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Left Upper Arm/Elbow"
    ))

    // (const physical-s9)
    Object.assign(nx_tactics_damage.c_physical_s9, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Right Upper Arm/Elbow"
    ))

    // (const physical-sa)
    Object.assign(nx_tactics_damage.c_physical_sa, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":name",
      "Hack: Head/Neck/Face/Skull",
      ":rank",
      nx_tactics_base.c_rank_ace,
      ":suit",
      nx_tactics_base.c_suit_spade,
      ":doc",
      "1 Damage: Deflected off Skull. [Slow]: 1.\n2 Damage: Head Slash. [Slow]: 1. [Bleeding]: 1.\n3 Damage: Neck Fracture. [Immobilized]. [Slow]: 2. [Bleeding]: 1.\n4 Damage: Head Severed. [Dead]."
    ))

    // (const physical-sj)
    Object.assign(nx_tactics_damage.c_physical_sj, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Abdomen/Lower Back"
    ))

    // (const physical-sk)
    Object.assign(nx_tactics_damage.c_physical_sk, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Right Chest/Upper Back/Ribs/Lungs"
    ))

    // (const physical-sq)
    Object.assign(nx_tactics_damage.c_physical_sq, vx_core.f_new(
      nx_tactics_base.t_damage,
      ":doc",
      "Hack: Left Chest/Upper Back/Ribs/Lungs/Heart"
    ))

    // (const physicaldamagedeck)
    Object.assign(nx_tactics_damage.c_physicaldamagedeck, vx_core.f_new(
      nx_tactics_base.t_deck,
      ":name",
      "* S-Hack Blood/Gore/Dismember\n* H-Slash Blood/Slow\n* C-Bash/Fatigue/Push\n* D-Pierce/Stun/Pin/Disable",
      ":cardlist",
      vx_core.f_new(
        nx_tactics_base.t_cardlist,
        nx_tactics_damage.c_physical_j1,
        nx_tactics_damage.c_physical_j2,
        nx_tactics_damage.c_physical_ca,
        nx_tactics_damage.c_physical_da,
        nx_tactics_damage.c_physical_ha,
        nx_tactics_damage.c_physical_sa,
        nx_tactics_damage.c_physical_sk,
        nx_tactics_damage.c_physical_sq,
        nx_tactics_damage.c_physical_sj,
        nx_tactics_damage.c_physical_s5,
        nx_tactics_damage.c_physical_s4,
        nx_tactics_damage.c_physical_s3,
        nx_tactics_damage.c_physical_s2
      )
    ))

  }
}
