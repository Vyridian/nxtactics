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
              "Intent:Wildeyed",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":summary",
              "Wildeyed\n* Use the next Intent regardless of Role. Shuffle"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:Inspired",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":summary",
              "Inspired\n* Use the next Intent regardless of Role. Shuffle"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Assault:All Out",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":summary",
              "All Out Attack\n* Use most damaging attack"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Disrupt:All Out",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":summary",
              "Shock and Awe\n* Use most disruptive ability"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Defend:All Out",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":summary",
              "Last Stand\n* Use most supporting or defensive ability"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Manuever:All Out",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":summary",
              "Out of Nowhere\n* Use best movement/attack ability"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Assault:Leader",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":summary",
              "Blitz\n* Attack a leader/objective"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Disrupt:Leader",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":summary",
              "Decapitate\n* Disrupt/control a Leader/objective"
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:kh",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:ks",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qc",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qd",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qh",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:qs",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:jc",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:jd",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:jh",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:js",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:tc",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:td",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:th",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:ts",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:9s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:8s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:7s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:6s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:5s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:4s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:3s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2c",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2d",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2h",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":summary",
              ""
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Intent:2s",
              ":deck",
              "Intent",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":summary",
              ""
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
