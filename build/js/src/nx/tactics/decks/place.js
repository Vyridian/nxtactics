'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_place {

  /**
   * @function placemap_tactics
   * Returns the base placemap
   * @param  {tactics} tactics
   * @return {placemap}
   */
  static t_placemap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_placemap_tactics = {
    vx_type: nx_tactics_decks_place.t_placemap_tactics
  }

  // (func placemap-tactics)
  static f_placemap_tactics(tactics) {
    let output = nx_tactics_base.e_placemap
    output = nx_tactics_base.f_placemap_from_placelist(
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Blacksmith", ":image", "images/cards/place-blacksmith.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Brambles", ":image", "images/cards/place-brambles.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Campsite", ":image", "images/cards/place-campsite.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Cave", ":image", "images/cards/place-cave.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Chasm", ":image", "images/cards/place-chasm.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Cliff", ":image", "images/cards/place-cliff.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Field", ":image", "images/cards/place-field.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Flames", ":image", "images/cards/place-flames.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Forest", ":image", "images/cards/place-forest.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Guardpost", ":image", "images/cards/place-guardpost.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Hall: Wooden", ":image", "images/cards/place-hall-wooden.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "House: Farm", ":image", "images/cards/place-house-farm.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Lake", ":image", "images/cards/place-lake.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Lava", ":image", "images/cards/place-lava.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Marsh", ":image", "images/cards/place-marsh.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mill", ":image", "images/cards/place-mill.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mountain", ":image", "images/cards/place-mountain.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mudslide", ":image", "images/cards/place-mudslide.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Path: Dirt", ":image", "images/cards/place-path-dirt.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Pit", ":image", "images/cards/place-pit.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Pond", ":image", "images/cards/place-pond.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "River", ":image", "images/cards/place-river.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Road: Gravel", ":image", "images/cards/place-road-gravel.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Road: Stone", ":image", "images/cards/place-road-stone.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Rock", ":image", "images/cards/place-rock.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Rockslide", ":image", "images/cards/place-rockslide.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Smoke", ":image", "images/cards/place-smoke.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Snow", ":image", "images/cards/place-snow.svg", ":summary", "* Depth: Each token on Snow is 5cm/2in of snow. Move:-1/depth"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Stables", ":image", "images/cards/place-stables.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Stairs", ":image", "images/cards/place-stairs.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Stream", ":image", "images/cards/place-stream.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Swamp", ":image", "images/cards/place-swamp.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern", ":image", "images/cards/place-tavern.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Bar", ":image", "images/cards/place-tavern-bar.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Bedroom", ":image", "images/cards/place-tavern-bedroom.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Common", ":image", "images/cards/place-tavern-common.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Dining", ":image", "images/cards/place-tavern-dining.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Temple", ":image", "images/cards/place-temple.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Trading Post", ":image", "images/cards/place-tradingpost.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Wall: Rock", ":image", "images/cards/place-wall-rock.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Sandalstadt", ":summary", "* A small settlement nestled near the Sandal Forest and Mt. Murin.\n* It was established to harvest Sandalwood trees and the oils they produces. Transporting the wood is difficult, so the settlement is more focused on trading oils, creams, and perfumes. Local wheat farming, breads, and goat and sheep herding make up the main diet.")
    )
    return output
  }

  /**
   * @function tactics_placemap_from_tactics
   * Returns a tactics updated with placemap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_placemap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_placemap_from_tactics = {
    vx_type: nx_tactics_decks_place.t_tactics_placemap_from_tactics
  }

  // (func tactics-placemap<-tactics)
  static f_tactics_placemap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const placemap = nx_tactics_decks_place.f_placemap_tactics(tactics)
        return vx_core.f_copy(tactics, ":placemap", placemap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "placemap-tactics": nx_tactics_decks_place.e_placemap_tactics,
      "tactics-placemap<-tactics": nx_tactics_decks_place.e_tactics_placemap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "placemap-tactics": nx_tactics_decks_place.t_placemap_tactics,
      "tactics-placemap<-tactics": nx_tactics_decks_place.t_tactics_placemap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/place",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func placemap-tactics)
    nx_tactics_decks_place.t_placemap_tactics['vx_value'] = {
      name          : "placemap-tactics",
      pkgname       : "nx/tactics/decks/place",
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
      fn            : nx_tactics_decks_place.f_placemap_tactics
    }

    // (func tactics-placemap<-tactics)
    nx_tactics_decks_place.t_tactics_placemap_from_tactics['vx_value'] = {
      name          : "tactics-placemap<-tactics",
      pkgname       : "nx/tactics/decks/place",
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
      fn            : nx_tactics_decks_place.f_tactics_placemap_from_tactics
    }

  }
}
