'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_intent {

  /**
   * @function deck_intent
   * Intent Deck
   * @return {deck}
   */
  static t_deck_intent = {
    vx_type: vx_core.t_type
  }
  static e_deck_intent = {
    vx_type: nx_tactics_decks_intent.t_deck_intent
  }

  // (func deck-intent)
  static f_deck_intent() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Intent",
      ":image",
      "images/intent/intent-back.svg",
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
              "Intent:wb",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":summary",
              "Wild - Use the next Intent regardless of Role. Shuffle"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:wr",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":summary",
              "Wild - Use the next Intent regardless of Role. Shuffle"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:ac",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "images/intent/intent-ac.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:ad",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "images/intent/intent-ad.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:ah",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "images/intent/intent-ah.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:as",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":image",
              "images/intent/intent-as.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:kc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "images/intent/intent-kc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:kd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "images/intent/intent-kd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:kh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "images/intent/intent-kh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:ks",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "images/intent/intent-ks.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "images/intent/intent-qc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "images/intent/intent-qd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "images/intent/intent-qh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qs",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":image",
              "images/intent/intent-qs.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:jc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":image",
              "images/intent/intent-jc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:jd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "images/intent/intent-jd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:jh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "images/intent/intent-jh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:js",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "images/intent/intent-js.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:tc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "images/intent/intent-tc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:td",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "images/intent/intent-td.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:th",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "images/intent/intent-th.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:ts",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":image",
              "images/intent/intent-ts.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "images/intent/intent-9c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "images/intent/intent-9d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "images/intent/intent-9h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "images/intent/intent-9s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "images/intent/intent-8c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "images/intent/intent-8d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "images/intent/intent-8h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":image",
              "images/intent/intent-8s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "images/intent/intent-7c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "images/intent/intent-7d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "images/intent/intent-7h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":image",
              "images/intent/intent-7s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "images/intent/intent-6c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":image",
              "images/intent/intent-6d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "images/intent/intent-6h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":image",
              "images/intent/intent-6s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "images/intent/intent-5c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":image",
              "images/intent/intent-5d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "images/intent/intent-5h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":image",
              "images/intent/intent-5s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "images/intent/intent-4c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":image",
              "images/intent/intent-4d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "images/intent/intent-4h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":image",
              "images/intent/intent-4s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "images/intent/intent-3c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "images/intent/intent-3d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "images/intent/intent-3h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":image",
              "images/intent/intent-3s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "images/intent/intent-2c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "images/intent/intent-2d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "images/intent/intent-2h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "images/intent/intent-2s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            )
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            "Intent:Back",
            ":image",
            "images/intent/intent-back.svg",
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
      "deck-intent": nx_tactics_decks_intent.e_deck_intent
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-intent": nx_tactics_decks_intent.t_deck_intent
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/intent",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-intent)
    nx_tactics_decks_intent.t_deck_intent['vx_value'] = {
      name          : "deck-intent",
      pkgname       : "nx/tactics/decks/intent",
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
      fn            : nx_tactics_decks_intent.f_deck_intent
    }

  }
}
