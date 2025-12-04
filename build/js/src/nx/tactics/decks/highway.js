'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_highway {

  /**
   * @function deck_highway
   * Highway Deck
   * @return {deck}
   */
  static t_deck_highway = {
    vx_type: vx_core.t_type
  }
  static e_deck_highway = {
    vx_type: nx_tactics_decks_highway.t_deck_highway
  }

  // (func deck-highway)
  static f_deck_highway() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Highway",
      ":image",
      "images/highway/highway-back.svg",
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
              "Highway:wb",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":image",
              "images/highway/highway-wb.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:wr",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":image",
              "images/highway/highway-wr.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:ac",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "images/highway/highway-ac.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:ad",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "images/highway/highway-ad.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:ah",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "images/highway/highway-ah.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:as",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":image",
              "images/highway/highway-as.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:kc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "images/highway/highway-kc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:kd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "images/highway/highway-kd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:kh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "images/highway/highway-kh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:ks",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "images/highway/highway-ks.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:qc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "images/highway/highway-qc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:qd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "images/highway/highway-qd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:qh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "images/highway/highway-qh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:qs",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":image",
              "images/highway/highway-qs.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:jc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":image",
              "images/highway/highway-jc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:jd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "images/highway/highway-jd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:jh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "images/highway/highway-jh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:js",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "images/highway/highway-js.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:tc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "images/highway/highway-tc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:td",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "images/highway/highway-td.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:th",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "images/highway/highway-th.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:ts",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":image",
              "images/highway/highway-ts.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:9c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "images/highway/highway-9c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:9d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "images/highway/highway-9d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:9h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "images/highway/highway-9h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:9s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "images/highway/highway-9s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:8c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "images/highway/highway-8c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:8d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "images/highway/highway-8d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:8h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "images/highway/highway-8h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:8s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":image",
              "images/highway/highway-8s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:7c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "images/highway/highway-7c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:7d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "images/highway/highway-7d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:7h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "images/highway/highway-7h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:7s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":image",
              "images/highway/highway-7s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:6c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "images/highway/highway-6c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:6d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":image",
              "images/highway/highway-6d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:6h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "images/highway/highway-6h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:6s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":image",
              "images/highway/highway-6s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:5c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "images/highway/highway-5c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:5d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":image",
              "images/highway/highway-5d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:5h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "images/highway/highway-5h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:5s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":image",
              "images/highway/highway-5s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:4c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "images/highway/highway-4c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:4d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":image",
              "images/highway/highway-4d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:4h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "images/highway/highway-4h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:4s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":image",
              "images/highway/highway-4s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:3c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "images/highway/highway-3c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:3d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "images/highway/highway-3d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:3h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "images/highway/highway-3h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:3s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":image",
              "images/highway/highway-3s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:2c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "images/highway/highway-2c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:2d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "images/highway/highway-2d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:2h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "images/highway/highway-2h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Highway:2s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "images/highway/highway-2s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            )
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            "Highway:Back",
            ":image",
            "images/highway/highway-back.svg",
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
      "deck-highway": nx_tactics_decks_highway.e_deck_highway
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-highway": nx_tactics_decks_highway.t_deck_highway
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/highway",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-highway)
    nx_tactics_decks_highway.t_deck_highway['vx_value'] = {
      name          : "deck-highway",
      pkgname       : "nx/tactics/decks/highway",
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
      fn            : nx_tactics_decks_highway.f_deck_highway
    }

  }
}
