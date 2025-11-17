'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import nx_tactics_decks_scene_murintrail from "../../../nx/tactics/decks/scene-murintrail.js"
import nx_tactics_decks_scene_nightonthetown from "../../../nx/tactics/decks/scene-nightonthetown.js"
import nx_tactics_decks_scene_ontherun from "../../../nx/tactics/decks/scene-ontherun.js"
import nx_tactics_decks_scene_starter from "../../../nx/tactics/decks/scene-starter.js"
import nx_tactics_ui_stylesheet from "../../../nx/tactics/ui/stylesheet.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class nx_tactics_decks_scene {

  /**
   * @function cardlayout_connector_from_pos_color
   * @param  {int} pos
   * @param  {string} color
   * @return {cardlayout}
   */
  static t_cardlayout_connector_from_pos_color = {
    vx_type: vx_core.t_type
  }
  static e_cardlayout_connector_from_pos_color = {
    vx_type: nx_tactics_decks_scene.t_cardlayout_connector_from_pos_color
  }

  // (func cardlayout-connector<-pos-color)
  static f_cardlayout_connector_from_pos_color(pos, color) {
    let output = nx_tactics_base.e_cardlayout
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_cardlayout},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const scolor = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": vx_core.t_string},
          color,
          vx_core.f_case_1("black", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "000000"})),
          vx_core.f_case_1("blue", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "0000FF"})),
          vx_core.f_case_1("brown", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "A52A2A"})),
          vx_core.f_case_1("cyan", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "00FFFF"})),
          vx_core.f_case_1("gold", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "FFD700"})),
          vx_core.f_case_1("green", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "00FF00"})),
          vx_core.f_case_1("orange", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "FFA500"})),
          vx_core.f_case_1("purple", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "800080"})),
          vx_core.f_case_1("red", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "FF0000"})),
          vx_core.f_case_1("yellow", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "FFFF00"})),
          vx_core.f_case_1("white", vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return "FFFFFF"})),
          vx_core.f_else(vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return color}))
        )
        const x = vx_core.f_switch(
          {"any-1": vx_core.t_int, "any-2": vx_core.t_int},
          pos,
          vx_core.f_case_1(1, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 32})),
          vx_core.f_case_1(2, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 61})),
          vx_core.f_case_1(3, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 32})),
          vx_core.f_case_1(4, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 0}))
        )
        const y = vx_core.f_switch(
          {"any-1": vx_core.t_int, "any-2": vx_core.t_int},
          pos,
          vx_core.f_case_1(1, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 3})),
          vx_core.f_case_1(2, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 47})),
          vx_core.f_case_1(3, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 83})),
          vx_core.f_case_1(4, vx_core.f_new_from_type(vx_core.t_any_from_func, () => {return 47}))
        )
        const pointpos = vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":x", x, ":y", y)
        const pointsize = vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":x", 2, ":y", 2)
        const style = vx_core.f_new({"any-1": vx_ui_ui.t_style}, ":color-bkg", scolor, ":pointpos", pointpos, ":pointsize", pointsize)
        return vx_core.f_new(
          {"any-1": nx_tactics_base.t_cardlayout},
          ":card",
          vx_core.f_new(
            {"any-1": nx_tactics_base.t_card},
            ":name",
            vx_core.f_new({"any-1": vx_core.t_string}, "cardlayout-connector-", pos)
          ),
          ":style",
          style
        )
      })
    )
    return output
  }

  /**
   * @function scenemap_tactics
   * Returns the base scenemap
   * @param  {tactics} tactics
   * @return {scenemap}
   */
  static t_scenemap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_scenemap_tactics = {
    vx_type: nx_tactics_decks_scene.t_scenemap_tactics
  }

  // (func scenemap-tactics)
  static f_scenemap_tactics(tactics) {
    let output = nx_tactics_base.e_scenemap
    output = nx_tactics_base.f_scenemap_from_scenelist(
      vx_core.f_new(
        {"any-1": nx_tactics_base.t_scenelist},
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_scene},
          ":name",
          "Quick and the Dead",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_cardlist},
              vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":id", "Quick/Dead:Setup", ":name", "Setup", ":deck", "Quick and the Dead", ":summary", "A young outlaw seeking glory challenges a seasoned gunslinger to a duel. It's almost noon and the town is watching with morbid curiosity. On the first chime of the clock, they'll both open fire. Last one standing on the field wins.\n* Start the Clock at 10. When it strikes 12 you may open fire\n* Place maps connected by blue dots\n* [Map:Personal]"),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Dirt",
                1,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(2, "blue"),
                    vx_core.f_new(
                      {"any-1": nx_tactics_base.t_cardlayout},
                      ":card",
                      nx_tactics_base.f_unit_from_tactics_key(tactics, "Gunslinger"),
                      ":style",
                      vx_core.f_copy(
                        nx_tactics_ui_stylesheet.c_style_image_terraincard,
                        ":pointpos",
                        vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":y", 40),
                        ":pointrotate",
                        vx_ui_ui.c_point_rotate_270
                      )
                    )
                  )
                )
              ),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Dirt",
                2,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(4, "blue"),
                    vx_core.f_new(
                      {"any-1": nx_tactics_base.t_cardlayout},
                      ":card",
                      nx_tactics_base.f_unit_from_tactics_key(tactics, "Outlaw"),
                      ":style",
                      vx_core.f_copy(
                        nx_tactics_ui_stylesheet.c_style_image_terraincard,
                        ":pointpos",
                        vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":x", 40, ":y", 40),
                        ":pointrotate",
                        vx_ui_ui.c_point_rotate_90
                      )
                    )
                  )
                )
              ),
              nx_tactics_base.f_cardlist_images_from_tactics_units(tactics, "Gunslinger", "Outlaw"),
              vx_core.f_list_from_list(
                {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_item, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_itemlist},
                nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Pistol:.45 Colt 1873", "Pistol:.45 S&W 1869")
              ),
              vx_core.f_list_from_list(
                {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_skill, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_skilllist},
                nx_tactics_base.f_skilllist_from_tactics_keys(tactics, "Crime", "Evasion", "Firearm", "Intimidation")
              ),
              vx_core.f_list_from_list(
                {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_ability, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_abilitylist},
                nx_tactics_base.f_abilitylist_from_tactics_keys(tactics, "Guns Blazing", "Quick Draw", "Rustling", "Unnerve", "Unsettling Presence")
              )
            )
          )
        ),
        vx_core.f_new(
          {"any-1": nx_tactics_base.t_scene},
          ":name",
          "Panzer Blitz",
          ":cardmap",
          nx_tactics_base.f_cardmap_from_cardlist(
            vx_core.f_new(
              {"any-1": nx_tactics_base.t_cardlist},
              vx_core.f_new({"any-1": nx_tactics_base.t_rule}, ":id", "Panzer Blitz:Setup", ":name", "Panzer Blitz:Setup", ":deck", "Panzer Blitz", ":summary", "World War II Panzers vs Shermans on the field of battle. The victor is the last one on the field. Partial victory to the loser any unit escapes\n* Place maps so colored squares connect\n* [Map:Vehicle]"),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Dirt",
                1,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(2, "blue"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(3, "yellow"),
                    vx_core.f_new(
                      {"any-1": nx_tactics_base.t_cardlayout},
                      ":card",
                      nx_tactics_base.f_unit_from_tactics_key(tactics, "Panzer IV Ausf H"),
                      ":style",
                      vx_core.f_copy(
                        nx_tactics_ui_stylesheet.c_style_image_terraincard,
                        ":pointpos",
                        vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":y", 40),
                        ":pointrotate",
                        vx_ui_ui.c_point_rotate_90
                      )
                    )
                  )
                )
              ),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Forest",
                2,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(2, "green"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(3, "cyan"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(4, "blue")
                  )
                )
              ),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Dirt",
                3,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(3, "orange"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(4, "green"),
                    vx_core.f_new(
                      {"any-1": nx_tactics_base.t_cardlayout},
                      ":card",
                      nx_tactics_base.f_unit_from_tactics_key(tactics, "Sherman M4A1"),
                      ":style",
                      vx_core.f_copy(
                        nx_tactics_ui_stylesheet.c_style_image_terraincard,
                        ":pointpos",
                        vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":x", 40, ":y", 40),
                        ":pointrotate",
                        vx_ui_ui.c_point_rotate_270
                      )
                    )
                  )
                )
              ),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Dirt",
                4,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(1, "yellow"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(2, "black"),
                    vx_core.f_new(
                      {"any-1": nx_tactics_base.t_cardlayout},
                      ":card",
                      nx_tactics_base.f_unit_from_tactics_key(tactics, "Panzer IV Ausf H"),
                      ":style",
                      vx_core.f_copy(
                        nx_tactics_ui_stylesheet.c_style_image_terraincard,
                        ":pointpos",
                        vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":y", 40),
                        ":pointrotate",
                        vx_ui_ui.c_point_rotate_90
                      )
                    )
                  )
                )
              ),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Dirt",
                5,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(1, "cyan"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(2, "green"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(4, "black")
                  )
                )
              ),
              nx_tactics_base.f_cardimage_from_tactics_placekey_num_cardlayout(
                tactics,
                "Terrain:Dirt",
                6,
                vx_core.f_new(
                  {"any-1": nx_tactics_base.t_cardlayout},
                  ":cardlayoutlist",
                  vx_core.f_new(
                    {"any-1": nx_tactics_base.t_cardlayoutlist},
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(1, "orange"),
                    nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color(4, "green"),
                    vx_core.f_new(
                      {"any-1": nx_tactics_base.t_cardlayout},
                      ":card",
                      nx_tactics_base.f_unit_from_tactics_key(tactics, "Sherman M4A1"),
                      ":style",
                      vx_core.f_copy(
                        nx_tactics_ui_stylesheet.c_style_image_terraincard,
                        ":pointpos",
                        vx_core.f_new({"any-1": vx_ui_ui.t_point}, ":x", 40, ":y", 40),
                        ":pointrotate",
                        vx_ui_ui.c_point_rotate_270
                      )
                    )
                  )
                )
              ),
              nx_tactics_base.f_cardlist_images_from_tactics_units(tactics, "Panzer IV Ausf H", "Sherman M4A1"),
              vx_core.f_list_from_list(
                {"any-1": nx_tactics_base.t_card, "any-2": nx_tactics_base.t_item, "list-1": nx_tactics_base.t_cardlist, "list-2": nx_tactics_base.t_itemlist},
                nx_tactics_base.f_itemlist_from_tactics_keys(tactics, "Cannon:75mm KwK40", "Cannon:76mm M1", "MG:.30-06 M1919", "MG:.50 M2HB", "MG:7.92mm MG34")
              )
            )
          )
        )
      )
    )
    return output
  }

  /**
   * @function tactics_scenemap_from_tactics
   * Returns a tactics updated with scenemap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_scenemap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_scenemap_from_tactics = {
    vx_type: nx_tactics_decks_scene.t_tactics_scenemap_from_tactics
  }

  // (func tactics-scenemap<-tactics)
  static f_tactics_scenemap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const scenemap = nx_tactics_decks_scene.f_scenemap_tactics(tactics)
        return vx_core.f_copy(tactics, ":scenemap", scenemap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "cardlayout-connector<-pos-color": nx_tactics_decks_scene.e_cardlayout_connector_from_pos_color,
      "scenemap-tactics": nx_tactics_decks_scene.e_scenemap_tactics,
      "tactics-scenemap<-tactics": nx_tactics_decks_scene.e_tactics_scenemap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "cardlayout-connector<-pos-color": nx_tactics_decks_scene.t_cardlayout_connector_from_pos_color,
      "scenemap-tactics": nx_tactics_decks_scene.t_scenemap_tactics,
      "tactics-scenemap<-tactics": nx_tactics_decks_scene.t_tactics_scenemap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/scene",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func cardlayout-connector<-pos-color)
    nx_tactics_decks_scene.t_cardlayout_connector_from_pos_color['vx_value'] = {
      name          : "cardlayout-connector<-pos-color",
      pkgname       : "nx/tactics/decks/scene",
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
      fn            : nx_tactics_decks_scene.f_cardlayout_connector_from_pos_color
    }

    // (func scenemap-tactics)
    nx_tactics_decks_scene.t_scenemap_tactics['vx_value'] = {
      name          : "scenemap-tactics",
      pkgname       : "nx/tactics/decks/scene",
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
      fn            : nx_tactics_decks_scene.f_scenemap_tactics
    }

    // (func tactics-scenemap<-tactics)
    nx_tactics_decks_scene.t_tactics_scenemap_from_tactics['vx_value'] = {
      name          : "tactics-scenemap<-tactics",
      pkgname       : "nx/tactics/decks/scene",
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
      fn            : nx_tactics_decks_scene.f_tactics_scenemap_from_tactics
    }

  }
}
