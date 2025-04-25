'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"


export default class nx_tactics_decks_item {

  /**
   * @function itemmap_tactics
   * Returns the base itemmap
   * @param  {tactics} tactics
   * @return {itemmap}
   */
  static t_itemmap_tactics = {
    vx_type: vx_core.t_type
  }
  static e_itemmap_tactics = {
    vx_type: nx_tactics_decks_item.t_itemmap_tactics
  }

  // (func itemmap-tactics)
  static f_itemmap_tactics(tactics) {
    let output = nx_tactics_base.e_itemmap
    output = nx_tactics_base.f_itemmap_from_itemlist(
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Accessory: Monocle", ":image", "images/cards/item-accessory-monocle.svg", ":summary", "* [Passive]: IF examining small objects THEN [Investigation]:+1", ":body", "2x-2", ":mass", "20g/.05lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ammo: Revolver", ":image", "images/cards/item-ammo-revolver.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ammo: Rifle", ":image", "images/cards/item-ammo-rifle.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Ammo: Shotgun", ":image", "images/cards/item-ammo-shotgun.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Chain Mail", ":reference", "* Shark expert and underwater filmmaker Valerie Taylor was among the first to develop and test shark suits in 1979 while diving with sharks.\n* Mail is widely used in industrial settings as shrapnel guards and splash guards in metal working operations.\n* Electrical applications for mail include RF leakage testing and being worn as a Faraday cage suit by tesla coil enthusiasts and high voltage electrical workers.", ":summary", "* Chain mail is a type of armor consisting of small metal rings linked together in a pattern to form a mesh. It was generally in common military use between the 3rd century BC and the 16th century AD in Europe, and longer in Asia and North Africa.", ":titles", "Chainmail, Mail, Byrnie, Hauberk", ":armor", "1mm"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Chain Shirt", ":summary", "* [Hit Location]: Shoulders Chest Abdomen Vitals", ":titles", "Chainmail, Mail", ":armor", "1mm"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Armor: Leather Cuirass", ":titles", "Leather Body Armor", ":image", "images/cards/item-armor-leathercuirass.svg", ":summary", "* [Armor]: 1x1 [Hardened vs Slash]\n* [Location]: [Shoulders] [Chest] [Abdomen] [Vitals]", ":body", "7x0", ":mass", "7kg/15lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Axe: Fire", ":image", "images/cards/item-axe-fire.svg", ":summary", "* [Combat]: [Melee]\n* [Initiative]:-1\n* [Damage]: [Body]:+3 [Hack] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1", ":body", "3x0", ":mass", "3.1kg/7lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Axe: Hand", ":image", "images/cards/item-axe-hand.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]:+1 [Hack] [Slash]\n* [Location]: [1-hand]", ":body", "9x-1", ":mass", "900g/2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Axe: Wood", ":titles", "Splitting Maul", ":image", "images/cards/item-axe-wood.svg", ":summary", "* [Skill]: [Melee]:-1\n* [Damage]: [Body]:+3 [Hack] [Slash]\n* [Location]: [2-hand]\n* [Armor]: 1x1", ":body", "3x0", ":mass", "3.1kg/7lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bare Handed", ":image", "images/cards/item-barehanded.svg", ":summary", "* [Skill]: [Close Combat] or [Melee]\n* [Arc]: [Arc:Front]\n* [Damage]: [Body] [Bash]"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Beast Claw"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bedroll", ":summary", ""),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bedroll: Restful Sleep", ":summary", "Providest the [Restful Sleep] ability."),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bomb: C4"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bomb: IED", ":titles", "Improvised Explosive Device"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bottle: Liquor", ":image", "images/cards/item-bottle-liquor.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bottle: Molotov Cocktail", ":image", "images/cards/item-bottle-molotovcocktail.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bow: Composite", ":summary", "* [Skill]: [Ranged]\n* [Damage]: 10x1 [Pierce] [Slash]\n* [Range]: 10x1 100m/300ft\n* [Location]: [2-hand]\n* The main advantage of composite bows over self bows (made from a single piece of wood) is their combination of smaller size with high power. They are more suitable for use from horseback or chariot.\n* Constructing composite bows requires much more time and materials than self bows, and the animal glue traditionally used can lose strength in humid conditions and be quickly ruined by submersion. For most practical non-mounted archery purposes, composite construction offers no advantage; 'the initial velocity is about the same for all types of bow, the design parameters appear to be less important than is often claimed.' However, their compact size make them superior for horsemen.", ":energy", "170J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bow: Compound"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bow: Long", ":titles", "Daikyu", ":summary", "* [Skill]: [Ranged]\n* [Damage]: 10x1 [Pierce] [Slash]\n* [Range]: 10x1 100m/300ft\n* [Location]: [2-hand]", ":energy", "156J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Bow: Short", ":image", "images/cards/item-bow-short.svg", ":titles", "Hankyu, Recurve Bow", ":reference", "Can fire about 6 aimed shots or 12 unaimed shots per minute.", ":summary", "* [Skill]: [Ranged]\n* [Damage]: 8x1 [Pierce] [Slash]\n* [Range]: 2x1 20m/60ft\n* [Location]: [2-hand]\n* [Shots]: 0 Max:1\n* [Reload]: [Action]", ":energy", "80J", ":body", "10x-1", ":mass", "1kg/2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Candle"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cloak"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Cloak: Fine Woodland", ":image", "images/cards/item-cloak-finewoodland.svg", ":summary", "* [Passive]: [Stealth]:+1 in [Forest]\n* [Passive]: Discard the first [Fatigue] you receive from [Weather] each [Turn].", ":body", "2x0", ":mass", "2kg/4.4lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Coins: Copper", ":image", "images/cards/item-coins-copper.svg", ":summary", "* A few (~5=$5) coins.\n* A pauper's wealth.\n* 10 Copper = 1 Silver\n* Cheap meal, 2 cheap drinks, night in a common room, a nice tip.", ":body", "5x-2", ":mass", "50g/.1lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Coins: Gold", ":image", "images/cards/item-coins-gold.svg", ":summary", "* A few (~5=$500) coins.\n* A tidy sum.\n* 10 Silver = 1 Gold\n* 10 Gold = 1 Platinum\n* A piece of quality gear.", ":body", "10x-2", ":mass", "150g/.3lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Coins: Platinum", ":image", "images/cards/item-coins-platinum.svg", ":summary", "* A few (~5=$5000) coins.\n* A small fortune.\n* 10 Gold = 1 Platinum\n* A piece of extremely high quality or magical gear.", ":body", "10x-2", ":mass", "150g/.3lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Coins: Silver", ":image", "images/cards/item-coins-silver.svg", ":summary", "* A few (~5=$50) coins.\n* Spending money.\n* 10 Copper = 1 Silver\n* 10 Silver = 1 Gold\n* 2 nice meals, 3 bottles wine, round of drinks, a private room, week supplies, cheap gear.", ":body", "10x-2", ":mass", "100g/.2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Grenade: White Phosphorous"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Hammer", ":image", "images/cards/item-hammer.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]:+3 [Bash]\n* [Location]: [1-hand]", ":body", "2x0", ":mass", "2kg/4.4lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Improvised Weapon", ":summary", "* Any item can be a weapon.\n* [Melee] or [Close Combat]: vs [Body]\n* [Damage]: [Body] Damage Types based on item."),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Jerry Can", ":image", "images/cards/item-jerrycan.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Keys", ":image", "images/cards/item-keys.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Knife", ":image", "images/cards/item-knife.svg", ":summary", "* [Combat]: [Close Combat]\n* [Damage]: [Body] [Pierce] [Slash]\n* [Location]: [1-hand]", ":body", "5x-1", ":mass", "500g/1lb", ":length", "25cm/10in"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Knife: Dagger", ":image", "images/cards/item-knife-dagger.svg", ":summary", "* [Combat]: [Close Combat] or [Melee]\n* [Damage]: [Body] [Pierce] [Slash]\n* [Location]: [1-hand]", ":body", "5x-1", ":mass", "500g/1lb", ":energy", "50J", ":length", "25cm/10in"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lattice"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lockpicks", ":image", "images/cards/item-lockpicks.svg", ":summary", "* [Success]: IF picking a lock and Succeed with Evade THEN Success:+1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Lute"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Matrix"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mirror"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Mushrooms", ":classification", "Plant", ":image", "images/cards/item-mushrooms.svg", ":summary", "* Nutrition for a day. After eating [Reveal Fate]. IF [Coins] THEN you spend 6 hours tripping or sleeping. IF [Cups] THEN Poison:+1"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Onions: Wild", ":classification", "Plant", ":image", "images/cards/item-onions-wild.svg", ":summary", "* Nutrition for a day."),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Paper: Lock Combination", ":image", "images/cards/item-paper-lockcombination.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Pistol: Revolver", ":image", "images/cards/item-pistol-revolver.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Quiver: Arrows", ":image", "images/cards/item-quiver-arrows.svg", ":summary", "* Holds up to 20 arrows\n* [Location]: [Shoulders] Back", ":body", "10x-1", ":mass", "1kg/2.2lb", ":length", "6cm/2ft"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Raspberries", ":classification", "Plant", ":image", "images/cards/item-raspberries.svg", ":summary", "* Nutrition for a day. [Reveal Fate]. IF [Coins] THEN they are sour. IF [Cups] THEN they are sweet.", ":body", "10x-1", ":mass", "1kg/2lbs"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rations", ":image", "images/cards/item-rations.svg", ":summary", "* Enough Food for 7-10 days.\n* Cost: [Coins: Silver]\n* An assortment of jerky, dried fruits, hardtack, hardrolls, dried cheese, potatoes, turnips and nuts.\n* Water is heavy, so these are mostly dry. If consumed without water, the unit will be [Dehydrated] after 7 days.", ":body", "4x0", ":mass", "4kg/9lbs"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Rifle", ":image", "images/cards/item-rifle.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Safe", ":image", "images/cards/item-safe.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Salve: Healing", ":image", "images/cards/item-salve-healing.svg", ":summary", "* [Uses]: 3\n* [Double Action] Use:1: Reduce a Major Wound to a Minor Wound.", ":body", "5x-1", ":mass", "500g/1.1lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Screen"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield", ":image", "images/cards/item-shield-round.svg", ":titles", "Hoplon Round Shield, Round Shield, Target Shield", ":classification", "Shield", ":summary", "* [Armor]: 2x1 [Hardened vs Pierce]\n* [Arc]: [Arc:Front], [Arc:Left] OR [Arc:Right]\n* [Location]: [1-hand]", ":armor", "2", ":body", "5x0", ":mass", "5kg/11lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield: Buckler", ":classification", "Shield", ":image", "images/cards/item-shield-buckler.svg", ":summary", "* [Armor]: 1x1\n* [Arc]: [Arc:Front]\n* [Location]: [1-hand]", ":armor", "1", ":body", "10x-1", ":mass", "1kg/2lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield: Heater", ":image", "images/cards/item-shield-heater.svg", ":titles", "Aegis", ":classification", "Shield", ":summary", "* [Armor]: 2x1 [Hardened vs Hack]\n* [Arc]: [Arc:Front], [Arc:Left] OR [Arc:Right]\n* [Location]: [1-hand]", ":armor", "2", ":body", "3x0", ":mass", "3.2kg/7lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield: Kite", ":classification", "Shield", ":armor", "2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield: Legionary", ":classification", "Shield", ":armor", "2"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield: Tower", ":titles", "Hoplite Shield", ":classification", "Shield", ":armor", "3"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shield: Wicker", ":classification", "Shield"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Shotgun", ":image", "images/cards/item-shotgun.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spear", ":image", "images/cards/item-spear.svg", ":summary", "* [Combat]: [Melee] [Reach]\n* [Damage]: [Body]:+3 [Pierce] [Slash]\n* [Location]: [2-hand]\n* [Armor]:1x1", ":body", "3x0", ":mass", "3kg/6lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Spear: Short", ":image", "images/cards/item-spear-short.svg", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]:+1 [Pierce] [Slash]\n* [Location]: [1-hand]\n* [Armor]: 1x1", ":body", "10x-1", ":mass", "1.5kg/4lb"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Stone: Flint", ":image", "images/cards/item-stone-flint.svg"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Back", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Bastard", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Bokken", ":classification", "Sword"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Broad", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Butterfly", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Cavalry", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Cutlass", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Epee", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Falchion", ":summary", "* A short, cleaving sword for close-in combat used by many troops including archers.", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Foil", ":classification", "Sword", ":energy", "50J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Great", ":titles", "Two-handed Sword", ":classification", "Sword", ":energy", "200J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Hook", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Katana", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Katar", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Long", ":image", "images/cards/item-sword-long.svg", ":classification", "Sword", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]:+2 [Pierce] [Slash]\n* [Arc]: [Arc:Front] and [Arc:Left] OR [Arc:Right]\n* [Initiative]: +1\n* [Location]: [1-hand]\n* [Armor]: 1x1", ":body", "10x-1", ":mass", "1.25kg/3lb", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Ninjato", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: No-Dachi", ":classification", "Sword", ":energy", "200J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Rapier", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Saber", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Scimitar", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Short", ":image", "images/cards/item-sword-short.svg", ":classification", "Sword", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]:+2 [Pierce] [Slash]\n* [Arc]: [Arc:Front]\n* [Location]: [1-hand]\n* [Armor]: 1x1", ":body", "10x-1", ":mass", "1kg/2.2lb", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Tanto", ":classification", "Sword", ":summary", "* [Combat]: [Melee]\n* [Damage]: [Body]:+2 [Pierce] [Slash]\n* [Arc]: [Arc:Front]\n* [Location]: [1-hand]\n* [Armor]: 1x1", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Sword: Wakizashi", ":classification", "Sword", ":energy", "100J"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Tooth"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Torch", ":image", "images/cards/item-torch.svg", ":summary", "* Provides poor light for 30 minutes.", ":body", "10x-1", ":mass", "1kg/2lbs"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Vampire Blood", ":summary", "* Black Token\n* Drinking Vampire Blood is addictive and creates a psychological dependency on the original Vampire called the [[Blood Bond]].\n* [Move] - Vampiric Healing - Remove a Vampire Blood Token and remove another Token of your choice.\n* [Move] - Vampiric Strength - Remove a Vampire Blood Token and gain +1 Melee for 3 turns.\n* [Move] - Vampiric Speed - Remove a Vampire Blood Token and gain +1 Initiative and +1 Move for 3 turns.\n* [Move] - Vampiric Fortitude - Remove a Vampire Blood Token and gain +1 Physical Armor for 3 turns."),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Water: Pond", ":image", "images/cards/item-water-pond.svg", ":summary", "* IF drank [Reveal Fate] THEN IF [Cups] THEN [Diseased]:+1", ":body", "2x0", ":mass", "2kg/4.4lbs"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Waterskin", ":image", "images/cards/item-waterskin.svg", ":summary", "* 2 liters/.5 gallon. Enough Water for 2 days.\n* Cost: [Copper Coins]. Can be refilled from any clean water source.", ":body", "2x0", ":mass", "2kg/4.4lbs"),
      vx_core.f_new({"any-1": nx_tactics_base.t_item}, ":name", "Yams: Wild", ":classification", "Plant", ":image", "images/cards/item-yams-wild.svg", ":summary", "* Nutrition for a day.", ":body", "10x-1", ":mass", "1kg/2lbs")
    )
    return output
  }

  /**
   * @function tactics_itemmap_from_tactics
   * Returns a tactics updated with itemmap
   * @param  {tactics} tactics
   * @return {tactics}
   */
  static t_tactics_itemmap_from_tactics = {
    vx_type: vx_core.t_type
  }
  static e_tactics_itemmap_from_tactics = {
    vx_type: nx_tactics_decks_item.t_tactics_itemmap_from_tactics
  }

  // (func tactics-itemmap<-tactics)
  static f_tactics_itemmap_from_tactics(tactics) {
    let output = nx_tactics_base.e_tactics
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_tactics},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, () => {
        const itemmap = nx_tactics_decks_item.f_itemmap_tactics(tactics)
        return vx_core.f_copy(tactics, ":itemmap", itemmap)
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "itemmap-tactics": nx_tactics_decks_item.e_itemmap_tactics,
      "tactics-itemmap<-tactics": nx_tactics_decks_item.e_tactics_itemmap_from_tactics
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "itemmap-tactics": nx_tactics_decks_item.t_itemmap_tactics,
      "tactics-itemmap<-tactics": nx_tactics_decks_item.t_tactics_itemmap_from_tactics
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/decks/item",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func itemmap-tactics)
    nx_tactics_decks_item.t_itemmap_tactics['vx_value'] = {
      name          : "itemmap-tactics",
      pkgname       : "nx/tactics/decks/item",
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
      fn            : nx_tactics_decks_item.f_itemmap_tactics
    }

    // (func tactics-itemmap<-tactics)
    nx_tactics_decks_item.t_tactics_itemmap_from_tactics['vx_value'] = {
      name          : "tactics-itemmap<-tactics",
      pkgname       : "nx/tactics/decks/item",
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
      fn            : nx_tactics_decks_item.f_tactics_itemmap_from_tactics
    }

  }
}
