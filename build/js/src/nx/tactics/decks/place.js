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
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Air Field", ":image", "images/cards/place-airfield.svg", ":summary", "* May [Deploy] Aircraft\n* Repairs Aircraft\n* Required to extend Aircraft Range"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Barracks", ":image", "images/cards/place-barracks.svg", ":summary", "* May [Deploy] Soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Blacksmith", ":image", "images/cards/place-blacksmith.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Brambles", ":image", "images/cards/place-brambles.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Broken Ground"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Bunker", ":image", "images/cards/place-bunker.svg", ":summary", "* A small stone or concrete building.\n* Gains [Armor] of stone/concrete except at [Point Blank Range].\n+1 [Defense]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Campsite", ":image", "images/cards/place-campsite.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Carpet", ":image", "images/cards/place-carpet.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Cave", ":image", "images/cards/place-cave.svg", ":titles", "Cavern"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Chasm", ":image", "images/cards/place-chasm.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Cliff", ":image", "images/cards/place-cliff.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Clinic", ":image", "images/cards/place-clinic.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Command Post", ":image", "images/cards/place-commandpost.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Control Tower", ":image", "images/cards/place-controltower.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Corridor", ":titles", "Passageway"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Desert", ":image", "images/cards/place-desert.svg", ":summary", "* +2 [Terrain Penalty]\n* +1 [Fatigue]/Turn\n* +1 [Thirst]/Hour\n* [Heat Wave]\n* [Mirage]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Dock", ":summary", "* Required to extend Naval Supply Lines"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Field", ":image", "images/cards/place-field.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Field Headquarters"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Field Hospital", ":summary", "* May [Deploy] Infantry with [Medicine] Skill\n* Heals Soldiers"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Flames", ":image", "images/cards/place-flames.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Forest", ":image", "images/cards/place-forest.svg", ":summary", "* [Move]:-1\n* [Line of Sight]: Blocked\n* [Block]: [Skill]:+2, [Armor]:+2\n* [Evade]: [Skill]:+2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Fuel Depot", ":summary", "* Required to extend Vehicle Supply Lines"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Gas Station", ":image", "images/cards/place-gasstation.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Guardpost", ":image", "images/cards/place-guardpost.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Hall: Wooden", ":image", "images/cards/place-hall-wooden.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "House: Farm", ":image", "images/cards/place-house-farm.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Ice", ":image", "images/cards/place-ice.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Jungle", ":image", "images/cards/place-jungle.svg", ":summary", "* Flora - Native peoples are well versed in finding food from their jungle environment but for the inexperienced there are many poisonous or harmful plants. Vines and creepers should never be grasped and pulled by the naked hand as many have sharp thorns, or can spilt into extremely sharp fibres, which can cause deep lacerations. Bamboo can split to form sharp stakes when mature and any minor cut can be very serious due to the high risk of infection. Many people will have seen the classic film or TV scene where the hero cuts a vine and then drinks from it, despite this being common scene it is not a good source of drinking water, if such water is red, yellow or milky in colour it is not safe to drink. Large sections of bamboo can also contain safe drinking water, to test for it tap the section of stem with blade or hard object and listen for a change in tone or sloshing sound, such water is safe to drink. On the other hand many jungle plants are very well adapted to such a damp environment and finding suitable leaves to make a waterproof shelter is often an easy task. Many plant saps contain irritants or toxins, which can be absorbed through the skin, so skin contact with plant sap should be avoided.  Fungus is a major source of infections as in the high humidity the human body can become the perfect growing environment for a variety of unpleasant fungal parasites. Care to keep the feet dry using the correct powder is very important if at all possible as fungal foot infections in the jungle can quickly slow a person and turn a healthy one into a casualty.\n* Fauna - Jungles team with life but the greatest threat comes not from large animals but from invertebrates and smaller poisonous reptiles. Large predators such as Jaguar, Anaconda, and crocodiles will rarely attack adult humans. Much more dangerous are the vast array of stinging and biting insects which can cause sickness or be carriers for disease such as malaria and yellow fever. If scratched mosquito bites can quickly become infected in such conditions draining morale and strength. Scorpions, poisonous spiders and even poisonous frogs inhabit some jungles so checking your foot ware for visitors before putting your feet into them in the morning is vital. In some areas soldier ants can be a problems so sleeping should be done in hammocks above the ground, this also offers some protection against snakes and other nocturnal visitors. Larger predators and scavengers can be attracted by waste food and bodily waste so camp hygiene is important. If your party is strong and well armed certain large jungle animals can provide large amounts of fresh meat but such creatures are not easy to hunt and kill, wild boar and pigs are powerful animals. Most snakes are edible, an Anaconda can feed a small village but the capture and killing of one is not an easy task. Due to the variety of parasites and climate conditions the consumption of animals that you may find already dead is to be strongly avoided.\n* Environmental Hazards - Jungles are extremely hot and humid places and such conditions can place an enormous strain on the body. Despite the humidity dehydration can be a real problem and although water can be plentiful, clean water may not be. The jungle has a reputation for quickly destroying the fitness levels of the inexperienced, through dehydration, malnutrition, disease and fatigue. River crossings can be extremely hazardous and the simple precaution of wearing a condom (for the male members of the party) can prevent some very nasty parasites entering the body. Psychologically the jungles constant wall of green and low light levels beneath the canopy can seriously affect motivation and the sounds of the nocturnal animals can also be disturbing for those unused to them. All this said many native peoples around the world have learned to adapt and even thrive in such conditions."),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Lake", ":image", "images/cards/place-lake.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Lava", ":image", "images/cards/place-lava.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Marsh", ":image", "images/cards/place-marsh.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mill", ":image", "images/cards/place-mill.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Motor Pool", ":summary", "* May [Deploy] land Vehicles\n* Repairs land Vehicles"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mountain", ":image", "images/cards/place-mountain.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Mudslide", ":image", "images/cards/place-mudslide.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Open Water"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Path: Dirt", ":image", "images/cards/place-path-dirt.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Pit", ":image", "images/cards/place-pit.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Plains"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Police Station", ":image", "images/cards/place-policestation.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Pool: Acid", ":image", "images/cards/place-pool-acid.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Pond", ":image", "images/cards/place-pond.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Quicksand"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "River", ":image", "images/cards/place-river.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Road: Asphalt", ":image", "images/cards/place-road-asphalt.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Road: Gravel", ":image", "images/cards/place-road-gravel.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Road: Intersection", ":image", "images/cards/place-road-intersection.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Road: Stone", ":image", "images/cards/place-road-stone.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Rock", ":image", "images/cards/place-rock.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Rockslide", ":image", "images/cards/place-rockslide.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Sand"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Sandalstad", ":summary", "* A small settlement nestled near the Sandal Forest and Mt. Murin.\n* It was established to harvest Sandalwood trees and the oils they produces. Transporting the wood is difficult, so the settlement is more focused on trading oils, creams, and perfumes. Local wheat farming, breads, and goat and sheep herding make up the main diet."),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Scrubland"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Shipyard", ":summary", "* May [Deploy] Ships\n* Repairs Ships"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Shop: General", ":image", "images/cards/place-shop-general.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Shop: Herbalist", ":image", "images/cards/place-shop-herbalist.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Shrine", ":image", "images/cards/place-shrine.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Smoke", ":image", "images/cards/place-smoke.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Snow", ":image", "images/cards/place-snow.svg", ":summary", "* Accumulation: Each token on Snow is 10cm/4in of snow. Move:-1/Accumulation"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Stables", ":image", "images/cards/place-stables.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Stairs", ":image", "images/cards/place-stairs.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Steppeland"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Store: Convenience", ":image", "images/cards/place-store-convenience.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Store: Gun", ":image", "images/cards/place-store-gun.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Stream", ":image", "images/cards/place-stream.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Supply Depot", ":summary", "* Required to extend Soldier Supply Lines"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Swamp", ":titles", "Bog, Fen, Murk", ":image", "images/cards/place-swamp.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern", ":image", "images/cards/place-tavern.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Bar", ":image", "images/cards/place-tavern-bar.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Bedroom", ":image", "images/cards/place-tavern-bedroom.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Common", ":image", "images/cards/place-tavern-common.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tavern Dining", ":image", "images/cards/place-tavern-dining.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Temple", ":image", "images/cards/place-temple.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Thera", ":image", "images/cards/place-thera.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Tile", ":image", "images/cards/place-tile.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Trading Post", ":image", "images/cards/place-tradingpost.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Wall: Stone", ":image", "images/cards/place-wall-stone.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_place}, ":name", "Whitewater")
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
