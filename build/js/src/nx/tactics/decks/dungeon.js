'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_dungeon {

  /**
   * @function deck_dungeon
   * Dungeon Deck
   * @return {deck}
   */
  static t_deck_dungeon = {
    vx_type: vx_core.t_type
  }
  static e_deck_dungeon = {
    vx_type: nx_tactics_decks_dungeon.t_deck_dungeon
  }

  // (func deck-dungeon)
  static f_deck_dungeon() {
    let output = nx_tactics_base.e_deck
    output = vx_core.f_new(
      {"any-1": nx_tactics_base.t_deck},
      ":name",
      "Dungeon",
      ":image",
      "images/dungeon/dungeon-back.svg",
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
              "Dungeon:wb",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerblack,
              ":image",
              "images/dungeon/dungeon-wb.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:wr",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jokerred,
              ":image",
              "images/dungeon/dungeon-wr.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:ac",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ac,
              ":image",
              "images/dungeon/dungeon-ac.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:ad",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ad,
              ":image",
              "images/dungeon/dungeon-ad.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:ah",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ah,
              ":image",
              "images/dungeon/dungeon-ah.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:as",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_as,
              ":image",
              "images/dungeon/dungeon-as.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:kc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kc,
              ":image",
              "images/dungeon/dungeon-kc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:kd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kd,
              ":image",
              "images/dungeon/dungeon-kd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:kh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_kh,
              ":image",
              "images/dungeon/dungeon-kh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:ks",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ks,
              ":image",
              "images/dungeon/dungeon-ks.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:qc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qc,
              ":image",
              "images/dungeon/dungeon-qc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:qd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qd,
              ":image",
              "images/dungeon/dungeon-qd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:qh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qh,
              ":image",
              "images/dungeon/dungeon-qh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:qs",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_qs,
              ":image",
              "images/dungeon/dungeon-qs.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:jc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jc,
              ":image",
              "images/dungeon/dungeon-jc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:jd",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jd,
              ":image",
              "images/dungeon/dungeon-jd.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:jh",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_jh,
              ":image",
              "images/dungeon/dungeon-jh.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:js",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_js,
              ":image",
              "images/dungeon/dungeon-js.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:tc",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_tc,
              ":image",
              "images/dungeon/dungeon-tc.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:td",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_td,
              ":image",
              "images/dungeon/dungeon-td.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:th",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_th,
              ":image",
              "images/dungeon/dungeon-th.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:ts",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_ts,
              ":image",
              "images/dungeon/dungeon-ts.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:9c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9c,
              ":image",
              "images/dungeon/dungeon-9c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:9d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9d,
              ":image",
              "images/dungeon/dungeon-9d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:9h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9h,
              ":image",
              "images/dungeon/dungeon-9h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:9s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_9s,
              ":image",
              "images/dungeon/dungeon-9s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:8c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8c,
              ":image",
              "images/dungeon/dungeon-8c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:8d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8d,
              ":image",
              "images/dungeon/dungeon-8d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:8h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8h,
              ":image",
              "images/dungeon/dungeon-8h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:8s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_8s,
              ":image",
              "images/dungeon/dungeon-8s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:7c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7c,
              ":image",
              "images/dungeon/dungeon-7c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:7d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7d,
              ":image",
              "images/dungeon/dungeon-7d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:7h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7h,
              ":image",
              "images/dungeon/dungeon-7h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:7s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_7s,
              ":image",
              "images/dungeon/dungeon-7s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:6c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6c,
              ":image",
              "images/dungeon/dungeon-6c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:6d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6d,
              ":image",
              "images/dungeon/dungeon-6d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:6h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6h,
              ":image",
              "images/dungeon/dungeon-6h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:6s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_6s,
              ":image",
              "images/dungeon/dungeon-6s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:5c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5c,
              ":image",
              "images/dungeon/dungeon-5c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:5d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5d,
              ":image",
              "images/dungeon/dungeon-5d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:5h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5h,
              ":image",
              "images/dungeon/dungeon-5h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:5s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_5s,
              ":image",
              "images/dungeon/dungeon-5s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:4c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4c,
              ":image",
              "images/dungeon/dungeon-4c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:4d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4d,
              ":image",
              "images/dungeon/dungeon-4d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:4h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4h,
              ":image",
              "images/dungeon/dungeon-4h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:4s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_4s,
              ":image",
              "images/dungeon/dungeon-4s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:3c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3c,
              ":image",
              "images/dungeon/dungeon-3c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:3d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3d,
              ":image",
              "images/dungeon/dungeon-3d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:3h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3h,
              ":image",
              "images/dungeon/dungeon-3h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:3s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_3s,
              ":image",
              "images/dungeon/dungeon-3s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:2c",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2c,
              ":image",
              "images/dungeon/dungeon-2c.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:2d",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2d,
              ":image",
              "images/dungeon/dungeon-2d.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:2h",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2h,
              ":image",
              "images/dungeon/dungeon-2h.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            ),
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_card},
              ":name",
              "Dungeon:2s",
              ":ranksuit",
              nx_tactics_base.c_ranksuit_2s,
              ":image",
              "images/dungeon/dungeon-2s.svg",
              ":layout",
              nx_tactics_base.c_cardlayout_imageonly
            )
          )
        ),
        nx_tactics_base.f_cardmap_copy_from_card_count_isnum(
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            "Dungeon:Back",
            ":image",
            "images/dungeon/dungeon-back.svg",
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
      "deck-dungeon": nx_tactics_decks_dungeon.e_deck_dungeon
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "deck-dungeon": nx_tactics_decks_dungeon.t_deck_dungeon
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/dungeon",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func deck-dungeon)
    nx_tactics_decks_dungeon.t_deck_dungeon['vx_value'] = {
      name          : "deck-dungeon",
      pkgname       : "nx/tactics/decks/dungeon",
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
      fn            : nx_tactics_decks_dungeon.f_deck_dungeon
    }

  }
}
