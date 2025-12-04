'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_wilderness {

  /**
   * @function deck_wilderness
   * Wilderness Deck
   * @return {deck}
   */
  static t_deck_wilderness = {
    vx_type: vx_core.t_type
  }
  static e_deck_wilderness = {
    vx_type: nx_tactics_decks_wilderness.t_deck_wilderness
  }

  // (func deck-wilderness)
  static f_deck_wilderness() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Wilderness",
      ":image",
      "images/wilderness/wilderness-back.svg",
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
              "Wilderness:wb",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":image",
              "images/wilderness/wilderness-wb.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:wr",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":image",
              "images/wilderness/wilderness-wr.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:ac",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "images/wilderness/wilderness-ac.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:ad",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "images/wilderness/wilderness-ad.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:ah",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "images/wilderness/wilderness-ah.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:as",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":image",
              "images/wilderness/wilderness-as.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:kc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "images/wilderness/wilderness-kc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:kd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "images/wilderness/wilderness-kd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:kh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "images/wilderness/wilderness-kh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:ks",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "images/wilderness/wilderness-ks.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:qc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "images/wilderness/wilderness-qc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:qd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "images/wilderness/wilderness-qd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:qh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "images/wilderness/wilderness-qh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:qs",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":image",
              "images/wilderness/wilderness-qs.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:jc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":image",
              "images/wilderness/wilderness-jc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:jd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "images/wilderness/wilderness-jd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:jh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "images/wilderness/wilderness-jh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:js",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "images/wilderness/wilderness-js.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:tc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "images/wilderness/wilderness-tc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:td",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "images/wilderness/wilderness-td.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:th",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "images/wilderness/wilderness-th.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:ts",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":image",
              "images/wilderness/wilderness-ts.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:9c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "images/wilderness/wilderness-9c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:9d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "images/wilderness/wilderness-9d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:9h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "images/wilderness/wilderness-9h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:9s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "images/wilderness/wilderness-9s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:8c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "images/wilderness/wilderness-8c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:8d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "images/wilderness/wilderness-8d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:8h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "images/wilderness/wilderness-8h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:8s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":image",
              "images/wilderness/wilderness-8s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:7c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "images/wilderness/wilderness-7c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:7d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "images/wilderness/wilderness-7d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:7h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "images/wilderness/wilderness-7h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:7s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":image",
              "images/wilderness/wilderness-7s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:6c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "images/wilderness/wilderness-6c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:6d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":image",
              "images/wilderness/wilderness-6d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:6h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "images/wilderness/wilderness-6h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:6s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":image",
              "images/wilderness/wilderness-6s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:5c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "images/wilderness/wilderness-5c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:5d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":image",
              "images/wilderness/wilderness-5d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:5h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "images/wilderness/wilderness-5h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:5s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":image",
              "images/wilderness/wilderness-5s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:4c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "images/wilderness/wilderness-4c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:4d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":image",
              "images/wilderness/wilderness-4d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:4h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "images/wilderness/wilderness-4h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:4s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":image",
              "images/wilderness/wilderness-4s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:3c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "images/wilderness/wilderness-3c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:3d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "images/wilderness/wilderness-3d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:3h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "images/wilderness/wilderness-3h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:3s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":image",
              "images/wilderness/wilderness-3s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:2c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "images/wilderness/wilderness-2c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:2d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "images/wilderness/wilderness-2d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:2h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "images/wilderness/wilderness-2h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Wilderness:2s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "images/wilderness/wilderness-2s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            )
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            "Wilderness:Back",
            ":image",
            "images/wilderness/wilderness-back.svg",
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
      "deck-wilderness": nx_tactics_decks_wilderness.e_deck_wilderness
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-wilderness": nx_tactics_decks_wilderness.t_deck_wilderness
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/wilderness",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-wilderness)
    nx_tactics_decks_wilderness.t_deck_wilderness['vx_value'] = {
      name          : "deck-wilderness",
      pkgname       : "nx/tactics/decks/wilderness",
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
      fn            : nx_tactics_decks_wilderness.f_deck_wilderness
    }

  }
}
