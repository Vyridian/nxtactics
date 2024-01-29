package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;

public final class World_wars {

  /**
   * @function tacticsbook
   * @return {book}
   * (func tacticsbook)
   */
  public static interface Func_tacticsbook extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_tacticsbook();
  }

  public static class Class_tacticsbook extends Core.Class_base implements Func_tacticsbook {

    @Override
    public Func_tacticsbook vx_new(Object... vals) {
      Class_tacticsbook output = new Class_tacticsbook();
      return output;
    }

    @Override
    public Func_tacticsbook vx_copy(Object... vals) {
      Class_tacticsbook output = new Class_tacticsbook();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/world_wars", // pkgname
        "tacticsbook", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "book", // name
          ":struct", // extends
          Core.t_typelist.vx_new(Base.t_card), // traits
          Core.e_typelist, // allowtypes
          Core.e_typelist, // disallowtypes
          Core.e_funclist, // allowfuncs
          Core.e_funclist, // disallowfuncs
          Core.e_anylist, // allowvalues
          Core.e_anylist, // disallowvalues
          Core.e_argmap // properties
        ) // typedef
      );
    }

    @Override
    public Func_tacticsbook vx_empty() {return e_tacticsbook;}
    @Override
    public Func_tacticsbook vx_type() {return t_tacticsbook;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = World_wars.f_tacticsbook();
      return output;
    }

    @Override
    public Base.Type_book vx_tacticsbook() {
      return World_wars.f_tacticsbook();
    }

  }

  public static final Func_tacticsbook e_tacticsbook = new World_wars.Class_tacticsbook();
  public static final Func_tacticsbook t_tacticsbook = new World_wars.Class_tacticsbook();

  public static Base.Type_book f_tacticsbook() {
    Base.Type_book output = Base.e_book;
    output = Core.f_new(
      Base.t_book,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":name"),
        Core.vx_new_string("World Wars"),
        Core.vx_new_string(":image"),
        Core.vx_new_string("WorldWars.jpg"),
        Core.vx_new_string(":chaptermap"),
        Core.f_new(
          Base.t_chaptermap,
          Core.t_anylist.vx_new(
            Core.vx_new_string("World Wars Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("World Wars Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII Aerial Warfare"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII Aerial Warfare"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Prop Planes\n* Jet Planes\n* Landing Strips\n* Aircraft Carriers\n* Machine Guns\n* Strafing\n* Tank Killing\n* Dive Bombing\n* Flying Fortress\n* Torpedo Bombing\n* Carpet Bombing\n* Strategic Bombing")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWI Campaign"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWI Campaign"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWI Scenarios"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWI Scenarios"),
                        Core.vx_new_string(":scenariomap"),
                        Core.f_new(
                          Base.t_scenariomap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Battle of Verdun, 1916"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Battle of Verdun, 1916"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The battlefield with the highest density of dead per square yard."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Battle of Verdun was a ten month long ordeal between the French and German armies and is considered one of the most brutal events of WWI. Both the French and German armies suffered incredibly with an estimated 540,000 French and 430,000 German casualties and no strategic advantages were gained for either side.\n* In the years preceding World War I, Germany became Europe's leading industrial power. France felt increasingly threatened by German industrialization. As a response to the German threat of invasion, France built a continuous line of sunken forts from the Swiss frontier to the French city of Verdun making Verdun a vital strong point.\n* The German attack began on February 21, 1916 with an intense artillery bombardment of the forts surrounding Verdun. The French army retreated to predetermined positions while the German army pounded through the French lines.\n* Although three French forts near Verdun had capitulated to German forces, Verdun itself remained undefeated.\n* By April 1916, the French Air Force had secured the sky over Verdun, which would help the French to successfully defend the area. The British attack and a Russian offensive in the east forced the German army to transfer troops away from Verdun.\n* By December 1916, the French had advanced to their February 1916 lines, their original position. No new advantage had been gained for either side.")
                              )
                            ),
                            Core.vx_new_string("Battles of the Marne, 1914, 1918"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Battles of the Marne, 1914, 1918"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* On September 4, 1914, the rapid advances of the German army through Belgium and northern France caused panic in the French army and troops were rushed from Paris in taxis to halt the advance. Combined with the BEF (British Expeditionary Force) the Germans were eventually halted and the War settled into the familiar defensive series of entrenchment's.\n* Ironically, by the end of May, 1918, the Germans had again reached the Marne after the enormous successes of Ludendorff's offensives of that year. The intervening four years had cost hundreds of thousands of lives and the armies were still, literally, exactly where they had started.")
                              )
                            ),
                            Core.vx_new_string("Battles of Ypres, 1914, 1915, 1917"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Battles of Ypres, 1914, 1915, 1917"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* There were in fact three battles fought around the Ypres salient during the War.\n* The first, in 1914 was an attempt by the BEF to halt the rapid advances made by the Germans.\n* The second, in 1915, was notable for the first use of poison gas by the Germans.\n* However, it is the long-planned offensive of July 31, 1917, that holds the most significance. Here, a combination of over-ambitious aims, appalling weather conditions, and misguided persistence by Haig led to horrific losses. By the time the offensive was called off total casualties for both sides had been approximately 250,000. The horrors of the battle, in which men drowned in liquid mud has become synonymous with the images of the War.")
                              )
                            ),
                            Core.vx_new_string("Battle of the Somme, 1916"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Battle of the Somme, 1916"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* At 0730 hours on the 1st July, 1916, after a week long artillery bombardment launched the now infamous 'Big Push' attack across the river Somme. The British intended to breakthrough the German defenses in a matter of hours.\n* The mistrust that High Command had of the so-called 'New Armies' manifested itself in the orders to the troops to keep uniformed lines and to march towards the enemy across no-man's land. This, coupled with the failure of the artillery bombardment to dislodge much of the German wire, or to destroy their machine-gun posts, led to one of the biggest slaughters in military history.\n* After the first day, with a gain of only 1.5km, the British had suffered 57,470 casualties. Despite this, Haig pressed on with the attack until November 19th of the same year. For the meager achievements, total losses on the British and Imperial side numbered 419,654 with German casualties between 450,000 and 680,000. When the offensive was eventually called off the British were still 3 miles short of Bapaume and Serre, part of their first-day objectives.")
                              )
                            ),
                            Core.vx_new_string("Battle of Cambrai, 1917"),
                            Core.f_new(
                              Base.t_scenario,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Battle of Cambrai, 1917"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("On November 20, 1917, the British launched the first full-scale offensive that was designed exclusively to accommodate the British secret weapon, the tank (so-called because when the first shipment came from England they were described as water tanks to maintain secrecy). A surprise artillery barrage started the offensive and 476 tanks, packed tightly for a mass attack moved against the German lines. Supported by infantry the gains were dramatic, breaching the almost impregnable Hindenberg line to depths of 4-5 miles in some places. However, these gains seemed to surprise British High Command equally as much as the Germans, and the following cavalry failed to take advantage. Nevertheless, Cambrai demonstrated how a well-thought out attack, combining tanks en masse with surprise, could be used to break the trench deadlock.")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Overview"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Overview"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Turning Points of the War"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Turning Points of the War"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* While the unconditional surrender of German armed forces represented a resounding Allied success, in retrospect, it is clear that particular factors and choices strongly affected the pace and course of the campaign.\n* D-Day - The Allied deception as to where the D-Day landings would take place was very successful, with the majority of the German command convinced the landings would take place at Calais. The Germans underestimated Allied willingness to risk an amphibious assault over a route longer than the shortest path across the English Channel.\n* Hedgerows - While the Allies meticulously planned the D-Day landings, they failed to assess the countryside immediately beyond the beaches, which resulted in the Germans very successfully using the hedgerow country as a system of natural defensive works that took the Allies two months to clear at a staggering cost in infantry casualties. Historians have also asserted the U.S. Army should have landed on the eastern end of the Normandy beaches and formed the northern wing of Allied forces in Northwest Europe because the mobility of American forces could have been better used in the more open terrain and most direct route to Berlin that the northern approach offered. As it was, the pre-invasion basing of troops in England determined the arrangement of the landing forces.\n* Underestimation - While the Germans had reason to occasionally doubt Allied military proficiency, it is clear the Germans too often underestimated Allied competency. This habit of underestimation led to the rejection of any notion that the Allies might have broken German military ciphers, most famously the Enigma code. The ability to monitor German military communications was an Allied strategic asset of the highest order. Less dramatically, the Germans often underestimated Allied troop proficiency, a habit that resulted in occasional sharp defeats for overconfident German units.\n* Manpower - The German ability to form a cohesive defensive line after the disaster their forces endured in Normandy was due almost entirely to the ability of the German Ersatzheer (Replacement Army) to quickly deploy large numbers of new troops. These inexperienced troops were paired with seasoned cadres who swiftly transformed the replacements into combat units. Thus, while the Allies took large numbers of German prisoners during their advance from Normandy to the German border, they  underestimated the ability of the Germans to reconstitute their forces under very disadvantageous circumstances. The Allies also seriously underestimated the infantry casualties their forces would suffer in Northwestern Europe. Shortages of American manpower were strongly aggravated by a tendency to attack head-on regardless of circumstances, a habit that was particularly in evidence during the months of fighting in the Huertgen Forest. The Allied logistical crisis that dominated their operations from September through December had the further pernicious effect of limiting the number of divisions in England that could be moved onto the continent to reinforce the front, since the Allies were only able to supply a limited number of divisions east of the Seine River. After the Allies mastered the logistical crisis, the Americans diverted divisions bound for the Pacific Theater to Europe in a belated realization that more divisions were needed for operations in Europe.\n* German Strategic Errors - While the Germans achieved strategic surprise with their offensive in the Ardennes, the Panzer divisions that had been so painstakingly rebuilt could have been more profitably used to defend the Siegfried Line and the Rhineland, or perhaps, in the defense of Berlin against the Red Army. The German thrust failed to shatter their enemies' alliance and cost Germany high casualties and equipment losses it could ill-afford. This folly was repeated in Alsace in January, but with the added disadvantage this time that the Allies were expecting the attack.\n* American Strategic Errors - Upon breaking out of Normandy in August, the Americans committed two armored divisions to operations in Brittany when armored units were direly needed for the pursuit of the German army across France. While the port of Brest, France was ultimately captured by the Americans, it consumed operations for an entire month and ultimately did little for the Allied effort because the Germans so thoroughly destroyed the port before it was captured. Out of fear that two wings of their forces might collide, the Allies failed to definitively close the Falaise Gap in August, allowing trapped German forces an escape route to the east. Experienced German leadership cadres evaded Allied forces and were available to reconstitute a cohesive front line along the Siegfried Line.\n* Antwerp - Although British forces conducted a brilliant pursuit across northern France that resulted in the liberation of the critically important port of Antwerp in early September, they failed to promptly clear the Scheldt Estuary of Germans. The Germans immediately grasped the significance of the Scheldt Estuary and moved in troops to conduct a lengthy defense. The port of Antwerp could not be used until November 28, and strongly contributed to the lengthy logistical crisis that hamstrung Allied operations for four months.\n* Operation Market-Garden was a double failure in the sense that the resources used for it would have been more profitably committed to clearing the Scheldt Estuary instead of carving out an extended salient that did nothing but extend an already over-extended Allied front line.\n* Siegfreid Line - Despite grave shortages of riflemen, American operations in front of the Siegfried Line, particularly in U.S. First Army's area, were characterized by bloody frontal assaults. Stubbornness and misplaced notions that the U.S. Army could not allow itself to abandon unprofitable operations saw five infantry divisions shredded in the Huertgen Forest fighting, with the attack being abandoned only in December after the Germans attacked into the Ardennes. The concentration of divisions in the Huertgen Forest also forced a corresponding lack of concentration along the Ardennes front, with the result that only four U.S. divisions were initially available to parry a 26 division German offensive.\n* Eisenhower - When, in November, the Allies enjoyed significant success in 6th Army Group's area, General Eisenhower refused to reinforce the success and even forbade his commanders in the south to attempt to assault across the Rhine in the area of Strasbourg while the German defenses were in shambles. This lack of bold enterprise was a by-product of General Eisenhower's decision to conduct limited-objective attacks on a broad front even though the Allies lacked a sufficient number of divisions to both man a broad front and concentrate enough combat power in chosen areas to achieve breakthroughs. When American troops reached the Elbe River in mid-April, General Eisenhower unilaterally decided that Berlin was no longer a significant military objective. He knew that Berlin would be deep within the Soviet zone of post-war Germany and saw no reason to fight for land that would have to be given to the Soviets after the war. Eisenhower pointed out to Patton that it was of no military strategic value and would take up a lot of resources to occupy and asked Patton 'Who would want it?' Patton replied 'I think history will answer that question for you.' Unswayed by Patton, Simpson or even Churchill, Eisenhower ordered U.S. forces to halt along the Elbe and Mulde rivers. Thus, these spearheads were practically immobilized while the war raged on for three more weeks.\n* Bradley - Simultaneously, General Bradley considered the Germans trapped in the Ruhr Pocket to be the most significant threat and committed surprisingly large numbers of U.S. troops to collapse (as opposed to containing) the pocket instead of reinforcing his troops at the Elbe River. As a consequence of Eisenhower's decision, the British 21st Army Group was ordered to drive northeast in the direction of Hamburg instead of proceeding due east in the direction of Berlin.\n* Propaganda - The Allies proved curiously gullible about German propaganda claiming the existence of a 'National Redoubt' in the Alpine hinterlands of Bavaria and Austria. Fearing a large-scale last stand by the Nazis in this so-called redoubt, General Eisenhower directed no less than three field armies to clear southern Germany at a time when the largest groups of German forces stood to the east, not the south, of General Eisenhower's troops. Fortunately for the Allies, the German Army of April 1945 was in no position to exploit troop concentrations and movements of questionable merit.\n* Thus, while the Allies enjoyed a great victory, on occasion their prosecution of the campaign afforded their German adversaries opportunities that prolonged the fighting unnecessarily.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Western Front"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Western Front"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Invasion of Germany"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Invasion of Germany"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Hitler would not allow Field Marshal Gerd von Rundstedt to withdraw East behind the Rhine arguing that it would only delay the inevitable fight. Hitler ordered him to fight where his forces stood. By the time the water had subsided and the U.S. Army was able to cross the Roer on February 23, other Allied forces were also close to the Rhine's west bank. Rundstedt's divisions which had remained on the west bank of the Rhine were cut to pieces in the battle of the Rhineland and 290,000 men were taken prisoner.\n* On May 7 1944, Eisenhower took the unconditional surrender of all German forces to the western Allies and the Soviet Union.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Eastern Front"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Eastern Front"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Battle of Berlin"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Battle of Berlin"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* Two Soviet Fronts attacked Berlin from the east and south, while a third overran German forces positioned north of Berlin.\n* The battle of Berlin lasted from late April 1945 until early May and was one of the bloodiest battles in history. Before the battle was over, German dictator Adolf Hitler and many of his followers committed suicide.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII North African Theatre"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII North African Theatre"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* On August 8, 1940, Benito Mussolini, anxious to link Libya with Italian East Africa and to capture the Suez Canal and the Arabian oilfields, ordered the invasion of Egypt. Italian forces invaded Egypt from their base in Cyrenaica, Libya. This invasion was repulsed later in the year during Operation Compass.\n* Initially the Commonwealth forces, under General Archibald Wavell, fought a successful campaign in the desert west of Egypt. While the fighting was taking place in Libya, Axis forces attacked Greece. General Wavell was ordered to halt his advance against the Italian Army in Libya and send troops to Greece. He disagreed with this decision but followed his orders.\n* The Allies were unable to stop Greece falling to the Axis forces and before they could retake the initiative in the western desert the German Afrika Korps led by Erwin Rommel had entered the theatre.\n  * It would not be until early in 1943, after another year and a half of hard fighting and mixed fortunes, that the Axis forces would be finally driven out of Libya.\n* On November 8, 1942, the U.S. had entered the war beginning with amphibious landing in northwest Africa, codenamed Operation Torch, under the Supreme Allied Commander General Dwight D. Eisenhower."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Aftermath of Tunisia"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Aftermath of Tunisia"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* According to historian Williamson A. Murray 'The decision to reinforce North Africa was one of the worst of Hitler's blunder: admittedly, it kept the Mediterranean closed for six more months, with a negative impact on the Allied shipping situation, but it placed some of Germany's best troops in an indefensible position from which, like Stalingrad, there would be no escape. Moreover Hitler committed the Luftwaffe to fight a battle of attrition under unfavorable conditions, and it suffered losses that it could not afford.'\n* The Axis's desperate gamble had only slowed the inevitable, and the US loss at Kasserine may, paradoxically, have been the best thing that could have happened to them.\n   * With North Africa now in Allied hands, plans quickly turned to the invasion of Sicily, and Italy after it.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII East African Theatre"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII East African Theatre"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* The battles of this campaign were fought between the forces of the British Empire, the British Commonwealth of Nations, and the forces of the Italian Empire.\n* The Commonwealth forces included troops from the Sudan, British Somaliland, British East Africa, the Indian Empire, South Africa, Northern Rhodesia, Southern Rhodesia, Nyasaland, and British West Africa (Nigeria, Gold Coast, Sierra Leone, and the Gambia). There was even a small commando unit from the British Mandate of Palestine. In addition to the British and Commonwealth forces, there were Ethiopian irregular forces, Free French forces, and Free Belgian forces.\n* In November 1940, the British and Commonwealth forces received an incredible intelligence advantage. The government code and cypher school broke the high grade cypher of the Italian Royal Army in East Africa. Later, during the same month, the replacement cypher for the Italian Royal Air Force was broken.\n  * From this point on, the commanders knew Italian plans as soon as they were issued."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Amba Alagi"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Amba Alagi"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* The Italians decided to make their final defense area around the 12,000 foot high mountain, Amba Alagi. They drove galleries into the solid rock to protect their troops and to hold ample ammunition and stores. In this mountain fortress, the defenders, under command of Amedeo, Duke of Aosta, thought themselves to be impregnable.\n* The 7000 Italian troops were faced by 9000 British troops and 20000 Ethiopian irregulars. A final assault was planned for 15 May, but a fortuitous artillery shell hit an Italian fuel dump and ruptured a vessel containing oil which flowed into the remaining drinking water of the Italian defenders. The lack of drinkable water then forced the Italians to surrender.\n* On 18 May, Amedeo, Duke of Aosta surrendered his embattled forces at Amba Alagi and received full military honors. While the Duke of Aosta faced defeat in East Africa, his brother, the Duke of Spoleto was being made the King of Croatia after the successful invasion of Yugoslavia. The Duke of Aosta had endured the last months of fighting while suffering a severe attack of malaria (and died of TBC and malaria a few months later).")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Middle East Theatre"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Middle East Theatre"),
                Core.vx_new_string(":summary"),
                Core.vx_new_string("* Although Southwest Asia was destined to remain a strategic backwater for the duration of World War II, in late 1941 and early 1942 the Allies were not certain that it would remain so. Before the turning points of the Battle of Stalingrad (June 1942 to February, 1943) and the Second Battle of El Alamein (October to November 1942), the fear was that the Germans might attack the area either through Turkey, or via Cyprus into Lebanon; or through defeating of the British in Egypt. If the anticipated attack came through Turkey or Lebanon, then not only could the Axis Powers threaten British controlled Egypt and the strategically important Suez Canal, it would also allow the Germans an alternative route to attack the Soviet Union from Southwest Asia north through the USSR's southern frontiers. In the slightly longer term the British feared independent regimes in the region as well as the possibility that the German might follow in Alexander the Great's footsteps and attack British controlled India from Persia in the west as Japan simultaneously attacked India from the east through Burma."),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Anglo-Soviet Invasion of Iran"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Anglo-Soviet Invasion of Iran"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* On August 25, 1941, Britain and Russia launched an invasion of the neutral nation of Iran. The British feared that the Anglo-Iranian Oil Company might fall into German hands. The refinery produced 8 million tons of oil and was a crucial part of the Allied war effort. For the Russians, Iran was a country of extreme strategic importance. The Germans were steadily advancing through the Soviet Union and there were few ways for the Allies to get desperately needed American Lend-Lease supplies to the Soviets. With increasing German submarine attacks, as well as heavy ice floes and the coastal ice cap fast rendering convoys to Arkhangelsk impossible, the Trans-Iranian Railway seemed a very attractive route to transport supplies up from the Persian Gulf. The two Allied nations applied pressure on\nIran and the Shah but this led only to increased tensions and pro-German rallies in Tehran. The Shah refused to expel the many German nationals residing in Iran, and denied the use of the railway to the Allies. These conditions prompted Britain and Russia to invade.\n* Franklin Roosevelt reassured the Shah by claiming that the British and Soviets had no designs on the itegrity of Iran. However, the Soviets would later back separatist states in the north, while the U.S. and UK would later support the overthrow of the popular and democratically elected Iranian Prime Minister in 1953.\n* With this crucial supply route now open to the Soviet Union the Persian Corridor was opened and would provide a massive flow of supplies (over 5 million tons of war materiel) to the Soviets primarily, but also the British in the Middle East.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Mediterranean Theatre"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Mediterranean Theatre"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Advance to Northern Italy"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Advance to Northern Italy"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* After the capture of Rome and the Normandy Invasion in June many experienced American and French units, the equivalent of a total of 7 divisions, were pulled out of Italy during the summer of 1944 to participate in Operation Dragoon, the Allied invasion in the south of France.\n* Churchill had hoped that a breakthrough in the autumn of 1944 would open the way for the Allied armies to advance to Vienna and Hungary to forestall the Russians advancing into Eastern Europe. Churchill's proposal had been strongly opposed by the US Chiefs of Staff who understood its importance to British post-war interests in the region but did not feel it aligned with prevailing overall Allied war priorities.\n* Continuation of the Allied offensive in early 1945 was made impractical by the poor winter weather (making armoured manoeuver and exploitation of overwhelming air superiority impossible).\n* On April 9, 1945, the Allies' final offensive commenced with massive aerial and artillery bombardments.\n* As April came to an end, the Axis forces in Italy, retreating on all fronts and having lost most of its fighting powers, was left with little option but surrender.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Pacific Theatre"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Pacific Theatre"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("Atomic bombings of Hiroshima and Nagasaki"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("Atomic bombings of Hiroshima and Nagasaki"),
                        Core.vx_new_string(":summary"),
                        Core.vx_new_string("* On August 6, 1945, after six months of intense firebombing of 67 other Japanese cities, the nuclear weapon 'Little Boy' was dropped on the city of Hiroshima.\n* On August 9, 1945, the nuclear bomb 'Fat Man' was dropped over Nagasaki.\n* These are to date the only attacks with nuclear weapons in the history of warfare. The bombs killed as many as 140,000 people in Hiroshima and 80,000 in Nagasaki by the end of 1945, roughly half on the days of the bombings.\n* Since then, thousands more have died from injuries or illness attributed to exposure to radiation. In both cities, the overwhelming majority of the dead were civilians.\n* Six days after the detonation over Nagasaki, on August 15, Japan announced its surrender to the Allied Powers, ending the Pacific War and therefore World War II. Germany had surrendered on May 7.\n* The bombings led, in part, to post-war Japan forbidding itself from nuclear armament.")
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWI British Forces"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWI British Forces"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWI British Infantry"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWI British Infantry"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Doughboy"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Doughboy")
                              )
                            ),
                            Core.vx_new_string("Vickers Machine Gunner"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Vickers Machine Gunner")
                              )
                            ),
                            Core.vx_new_string("Sopwith Camel"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Sopwith Camel")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWI French Forces"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWI French Forces"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWI French Vehicles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWI French Vehicles"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Renault FT 17"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Renault FT 17"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Among the most revolutionary and influential tank designs in history. The FT 17 was the first tank with an armament in a fully rotating turret, and its configuration with the turret on top, engine in the back and the driver in front became the conventional one, repeated in most tanks until today; at the time it was a revolutionary innovation, causing armour historian Steven Zaloga to describe the type as 'the world's first modern tank.' The tank was widely used by the French and the Americans (who, as mentioned, were lent 514) in the latter stages of World War I, after 31 May 1918. The tank was cheap and well-suited for mass production. Indeed, the very production was made a weapon in itself: a goal was set of 12,260 to be produced (4,440 of which in the USA) before the end of 1919.This prospect was one of several factors which drove the German High Command to its decision to launch the massive all-or-nothing offensives in the spring of 1918, which in turn weakened their army so that it collapsed in the summer. FT 17 tanks were also used in the Second World War, among others in Poland, Finland, France and Kingdom of Yugoslavia, although they were completely obsolete by then.")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWI German Forces"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWI German Forces"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWI French German Vehicles"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWI French German Vehicles"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":Folker"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Folker"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Of all the aces the war produced none compared to the greatest flyer of all, Manfred Richtofen 'The Red Baron'. To this day his name remains a legend that is better known to most than even the war that created him.")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII Explosives"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII Explosives"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("30kg Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("30kg Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("30kg")
                              )
                            ),
                            Core.vx_new_string("60kg Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("60kg Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("60kg")
                              )
                            ),
                            Core.vx_new_string("100kg Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("100kg Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("100kg")
                              )
                            ),
                            Core.vx_new_string("250lb Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("250lb Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("110kg")
                              )
                            ),
                            Core.vx_new_string("350lb Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("350lb Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("159kg")
                              )
                            ),
                            Core.vx_new_string("500lb Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("500lb Bomb"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* P-47 pilots frequently carried two 500-pound (227 kg) bombs, using skip bombing techniques for difficult targets (skipping bombs into railroad tunnels to destroy hidden enemy locomotives or tanks was a favorite tactic); a near miss was sufficient to knock a tank on its side, blow off a track or turret, or cause serious damage to tracks, suspension, and turret mechanisms, frequently causing the vehicle to be abandoned by its crew."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("225kg")
                              )
                            ),
                            Core.vx_new_string("250kg Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("250kg Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("250kg")
                              )
                            ),
                            Core.vx_new_string("600lb Depth Charge"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("600lb Depth Charge"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Although the explosions of the standard United States 600-pound (270 kg) Mark 4 or Mark 7 depth charge used in World War II were nerve-wracking to the target, an undamaged U-boat's pressure hull would not rupture unless the charge detonated closer than about five meters. Placing the weapon within this range was entirely a matter of chance and quite unlikely as the target maneuvered evasively during the attack. Most U-boats sunk by depth charges were destroyed by damage accumulated from a long barrage rather than by a single carefully-aimed attack. Many survived hundreds of depth charge detonations over a period of many hours.\n* The depth charge causes damage by both the initial shock wave and by the subsequent reverberating shock waves that have a tendency to bend a submarine back and forth cause a hull breach.\n* A 100kg of TNT depth charge would have a kill radius of 3-4m. Higher payloads only increase this by a few meters because the effect decreases with the distance cubed. The killing range is also greater with larger submarines. It is doubtful a midget submarine with a titanium hull could be destroyed by anything less than a direct hit."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("270kg")
                              )
                            ),
                            Core.vx_new_string("1000lb Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("1000lb Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("454kg")
                              )
                            ),
                            Core.vx_new_string("1200kg Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("1200kg Bomb"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("1200kg")
                              )
                            ),
                            Core.vx_new_string(":Mine"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mine"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb")
                              )
                            ),
                            Core.vx_new_string(":Torpedo"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torpedo"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWII/Torpedo.png"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Torpedo")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII American Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII American Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII American Explosives"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII American Explosives"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Mk 2 Grenade"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mk 2 Grenade"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIAmerican/Grenade_MK2.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* At least 5 people have thrown themselves on hand grenades and lived."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* It had a fatality radius of 5m, a blast radius of 13.7m, and fragments can disperse to 213m."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string(".057kg"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string(".6kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Anti-Personnel, Area"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("30m")
                              )
                            ),
                            Core.vx_new_string("Demolition Pack"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Demolition Pack"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("+1 Prepare")
                              )
                            ),
                            Core.vx_new_string("4.6in Rockets"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("4.6in Rockets"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile")
                              )
                            ),
                            Core.vx_new_string("5in HVAR Rocket"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("5in HVAR Rocket"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIAmerican/Rocket_HVAR.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* High-Velocity Aircraft Rocket, aka Holy Moses. About 1 million HVAR rockets were produced before the end of the war. It had a steel-cased warhead and could penetrate 38mm of armor and 1.2m of reinforced concrete.\n* Trials against Panthers showed that they could penetrate all but front armor, but even in clusters of 8 could only hit a stationary tank 4% of the time.\n* Tank casualties to rockets were very low."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("21kg"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("40kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("4.5km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("1530kph")
                              )
                            ),
                            Core.vx_new_string("Mark 14 Torpedo"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mark 14 Torpedo"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("The Mark 14 had four major flaws.\n* It tended to run about 10 feet deeper than set.\n* The magnetic exploder often caused premature firing.\n* The contact exploder often failed to fire the warhead.\n* It tended to run 'circular', failing to straighten, thus returning back to strike the firing ship."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Torpedo"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("292kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("6.25m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1490kg"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("8km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("85kph")
                              )
                            ),
                            Core.vx_new_string("Atomic Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Atomic Bomb"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Little Boy - Hiroshima 13kton/63TJ\n* Fat Man - Nagasaki 20kton/84TJ"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII American Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII American Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII American Strategic Forces"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII American Strategic Forces"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("WWII American Light Infantry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("WWII American Light Infantry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 50% SMG (-1), 25% M1 (-2), 25% Bazooka (-2)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Infantry")
                              )
                            ),
                            Core.vx_new_string("WWII American Med. Infantry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("WWII American Med. Infantry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 50% M1 (-1), 25% Bazooka (-2), 25% MG (-2)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. Infantry")
                              )
                            ),
                            Core.vx_new_string("WWII American Heavy Infantry"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("WWII American Heavy Infantry"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* 50% MG (-1), 50% Bazooka (-1)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Infantry")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII British Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII British Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII British Weapons"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII British Weapons"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(".38 Enfield MkII Revolver"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".38 Enfield MkII Revolver"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Pistol")
                              )
                            ),
                            Core.vx_new_string("9mm Sten SMG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("9mm Sten SMG"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIBritish/SMG_Sten.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto")
                              )
                            ),
                            Core.vx_new_string(".303 Lee-Enfield SMLE Rifle"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".303 Lee-Enfield SMLE Rifle"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIBritish/SMLE_Mk_III.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The current world record for aimed bolt-action fire was set in 1914 placing 38 rounds into a 12 inch wide target at 300 yards in one minute."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Short Magazine Lee Enfield (SMLE)"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle")
                              )
                            ),
                            Core.vx_new_string(".303 Lee-Enfield No 4 Rifle"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".303 Lee-Enfield No 4 Rifle"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Mass production version of earlier .303 Lee-Enfield rifles."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle")
                              )
                            ),
                            Core.vx_new_string("Flamethrower Portable No2"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flamethrower Portable No2"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Flamethrower"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("29kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Fire, Auto"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("25m")
                              )
                            ),
                            Core.vx_new_string(".303 Bren Light MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".303 Bren Light MG"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Clip-fed, air-cooled .303 cal (7.7mm) machine gun"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("500/min"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("30")
                              )
                            ),
                            Core.vx_new_string(".303 Vickers MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".303 Vickers MG"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* In one action, ten Vickers guns fired continuously for twelve hours. They fired a million rounds between them, using 100 new barrels, without a single breakdown. It was this absolute foolproof reliability which endeared the Vickers to every British soldier who ever fired one."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Belt-fed, water-cooled .303 cal (7.7mm) machine gun. Required 6-8 men to operate."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. MG"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto")
                              )
                            ),
                            Core.vx_new_string("7.92mm Besa MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.92mm Besa MG"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Belt-fed, air-cooled 7.92mm machine gun"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("500/min")
                              )
                            ),
                            Core.vx_new_string(":PIAT"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("PIAT"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIBritish/Rocket_PIAT.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* HEAT Rocket\n* Penetrate 75mm at 30 degrees or 102mm at 90 degrees.\n* The PIAT was an unusual infantry anti-tank weapon. It was comparatively quiet and smokeless, with no backblast.\n* Unlike the American bazooka or German Panzerfaust and Panzerschreck, it could be fired from an enclosed space, and would not give away its position as soon as the weapon was fired. However, it was more cumbersome than its counterparts, violent to fire, and in many circumstances it could be difficult to reload.\n* An attachment that allowed the PIAT to fire 2 inch mortar shells was produced in limited numbers."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string(".99m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("15kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HEAT"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("100m")
                              )
                            ),
                            Core.vx_new_string("40mm QF 2 Pounder Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("40mm QF 2 Pounder Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP")
                              )
                            ),
                            Core.vx_new_string("57mm QF 6 Pounder Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("57mm QF 6 Pounder Cannon"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Although 17 Pounder guns were rushed to North Africa to combat the Tiger tank, it was in fact a 6-pdr, which claimed the first Tiger 'kill'"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("4600m")
                              )
                            ),
                            Core.vx_new_string("75mm QF Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("75mm QF Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP")
                              )
                            ),
                            Core.vx_new_string("76mm QF 17 Pounder Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("76mm QF 17 Pounder Cannon"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIBritish/Artillery_17pdr.gif"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("76.2mm Cannon penetrates 115mm at 1000m"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("883m/s")
                              )
                            ),
                            Core.vx_new_string("77mm HV Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("77mm HV Cannon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The 77mm HV was based on the 17-pounder. It had a lower muzzle velocity than the 17-pounder, but the\nammunition was much more compact and more easily stored and handled within the confines of a tank."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP")
                              )
                            ),
                            Core.vx_new_string("Mills Bomb Grenade"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Mills Bomb Grenade"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The Mills was a defensive grenade: after throwing the user had to take cover immediately. A competent thrower could manage 30m with reasonable accuracy, but the grenade could throw lethal fragments further than this.\n* The 36M remained in service in some parts of the world such as India and Pakistan where it was manufactured until the early 1980s. That the Mills bomb remained in use for so many years says much about its effectiveness."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string(".09m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string(".76kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Anti-Personnel"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("30m")
                              )
                            ),
                            Core.vx_new_string("No 74 Sticky Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("No 74 Sticky Bomb"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIBritish/Grenade_StickyBomb.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* While practicing a bomber got his bomb stuck to his trouser leg. A quick thinking mate whipped the trousers off and got rid of them and the bomb. The trousers were in a bit of a mess after though I think they were a bit of a mess prior to the explosion.\n* Even when not used, the glass was easily cracked in transit. The filling, nitroglycerin, was sensitive to shock too. Consequently, although possibly effective, the sticky bomb was never popular.\n* In the movie Saving Private Ryan, Tom Hanks' character uses improvised sticky bombs against Tiger I heavy tanks,"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string(".6"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string(".24m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("20m")
                              )
                            ),
                            Core.vx_new_string("No 82 Gammon Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("No 82 Gammon Bomb"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Developed as a replacement for the temperamental and highly dangerous sticky bomb grenade.\n* Unlike conventional grenades, it was flexible in the amount and type of munition. For anti-personnel use, a small amount of plastic explosive, along with shrapnel-like projectiles if available, would be placed in the bag. Against armored targets, the bag could be filled completely with explosive.\n* The bag would be flung and the detonator would fire on impact.\n* Gammon bombs were primarily issued to special forces such as paratroopers who were issued plastic explosive routinely. These units found the Gammon bomb to be particularly useful due to its small size and weight when unfilled, as well as its adaptability."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string(".9"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1.2kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("20m")
                              )
                            ),
                            Core.vx_new_string("60lb RP-3 Rockets"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("60lb RP-3 Rockets"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("28kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1.4m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("21kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("1.6km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("1900kph")
                              )
                            ),
                            Core.vx_new_string("4000lb Blockbuster Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("4000lb Blockbuster Bomb"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The term Blockbuster (aka Cookie) was originally a name coined by the press and referred to a bomb which had enough explosive power to destroy an entire city block. The High Capacity design was a cylinder full of explosives, unaerodynamic, and without find. Accuracy was not important, however, as these bombs were designed for blowing the tiles off the roofs of buildings so that the smaller 4 lb incendiary bombs could reach the building interiors. These bombs were only used by the RAF, being too big to fit in the bomb bays of other countries aircraft. In addition to the 4000lb version there were also 8000lb and 12000lb versions constructed from multiple 4000lb sections."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("1360kg"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1800kg")
                              )
                            ),
                            Core.vx_new_string("Earthquake Bomb"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Earthquake Bomb"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* In an attack on the U-boat pens at Farge two Grand Slams went through the 15 ft (4.5 m) reinforced concrete hardening - equalling or exceeding the best current penetration specifications."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The Earthquake bombs were designed not to strike a target directly, but to impact beside it, penetrate under it, and create a 'camouflet' or large buried cavern at the same time as delivering a shock wave through the target's foundations. The target then collapses into the hole, no matter how hardened it may be. The bombs had strong casings because they needed to travel through rock rather than reinforced concrete, though they could perform equally well against hardened surfaces."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Grand Slam"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("10tons")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII British Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII British Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII British Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII British Naval Vessels"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("British Destroyer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("British Destroyer"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. Naval Vessel")
                              )
                            ),
                            Core.vx_new_string("HMS Hood Battlecruiser"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("HMS Hood Battlecruiser"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Armament: 8 x 15in (381mm) (4x2),\n14 x 4in (102mm) (7x2)\n24 x 2-pdr pom pom (40mm) (3x8)\n20 x 0.5in (12.7mm) (5x4) guns\n5 x 20 barrel Unrotated Projectile mounts\n4 x 21in (533mm) torpedo tubes, above water"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1418"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("10000km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("54kph")
                              )
                            ),
                            Core.vx_new_string("King George V Class Battleship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("King George V Class Battleship"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Speed: 28.0 knots (1941 trials) Range: 5400+nm at 18knots (11.9 tons/hour fuel burn)\nArmament: 10 x 14inch (356mm) mk VII guns\n16 x 5.25inch (133mm) guns\n64 x 2pounder pom-pom (40mm) Armour: Main belt: 14.7in (374mm)\nlower belt: 5.4in (137mm)\nAircraft carried: 4 Supermarine Walrus seaplanes, 1 double-ended catapult"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1500")
                              )
                            ),
                            Core.vx_new_string("HMS Ark Royal Carrier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("HMS Ark Royal Carrier"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Armament: 16 x 4.5 inch (114 mm) guns (8 x 2)\n48 x 2 pounder (1.5 in) Pom-poms (6 x 8)\n32 x .50 calibre (12.7 mm) machine guns (8 x 4) Armour: 4.5 inches (110 mm) belt\n3.5 in (89mm) deck over boiler rooms and magazines\nAircraft carried: 36 Fairey Swordfish, 18 Fairey Fulmars"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1600"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("14100km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("57kph")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII French Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII French Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII French Weapons"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII French Weapons"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("7.5mm MAS-36"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.5mm MAS-36"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIFrench/Rifle_MAS36.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7.5mm Bolt-action Rifle"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle")
                              )
                            ),
                            Core.vx_new_string("7.65mm MAS-38"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.65mm MAS-38"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIFrench/SMG_MAS_38.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* On April 28, 1945, was used by Italian partisans to shoot the former dictator Benito Mussolini."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7.65mm SMG"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII French Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII French Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII French Aircraft"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII French Aircraft"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Free French Spitfire"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Free French Spitfire"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIFrench/SupermarineSpitfire_Mk_IXToken.png"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3tons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("9m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("760km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("605kph"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("8mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string(".303 Vickers MG"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string(".303 Vickers MG"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx8")
                                              )
                                            ),
                                            Core.vx_new_string("250lb Bomb"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("250lb Bomb"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("Ux2")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Piloting"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piloting"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII German Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII German Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII German Weapons"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII German Weapons"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(".32 Mauser Hsc"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string(".32 Mauser Hsc"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Pistol_Mauser_HSc.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Military personnel of all ranks not issued sidearms often purchased HSc pistols in the commercial\nmarketplace and carried them into the field."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string(".32 cal Pistol"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Pistol"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string(".15m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string(".7kg"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("282m/s")
                              )
                            ),
                            Core.vx_new_string("9mm Luger P08"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("9mm Luger P08"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/DWM_4_inch_Navy_Luger_859.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The usual German sidearm in both world wars."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("9mm Pistol"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Pistol"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("390m/s")
                              )
                            ),
                            Core.vx_new_string("9mm MP40 SMG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("9mm MP40 SMG"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/SMG_MP40.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("380m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("100m"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("500/min")
                              )
                            ),
                            Core.vx_new_string("7.92mm Karabiner 98k"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.92mm Karabiner 98k"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Standard German infantry rifle"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7.92mm Bolt-action Rifle"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("500m")
                              )
                            ),
                            Core.vx_new_string("Flammenwerfer 35 Flamethrower"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Flammenwerfer 35 Flamethrower"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Flamethrower"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("35kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Fire, Auto"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("25m")
                              )
                            ),
                            Core.vx_new_string("7.92mm FG42 Light MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.92mm FG42 Light MG"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The FG42 was developed specifically for the use by paratroopers, who wanted a suitable gun after their experiences in the invasion of Crete."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto, +1 Prepare")
                              )
                            ),
                            Core.vx_new_string("7.92mm MG17 MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.92mm MG17 MG"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/MG_MG17.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* A mainstay fixed machine gun in German built aircraft."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. MG"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1175mm"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("10.2kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("855m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("1200/min")
                              )
                            ),
                            Core.vx_new_string("7.92mm MG34 MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.92mm MG34 MG"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/MG_MG34.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. MG"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1219mm"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("12.1kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("765m/s")
                              )
                            ),
                            Core.vx_new_string("7.92mm MG81Z MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.92mm MG81Z MG"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/MG_MG81.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* An aircraft mounted derivative of the successful MG34 infantry machine gun."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. MG"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("915mm"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("12.9kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("705m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("1500/min")
                              )
                            ),
                            Core.vx_new_string("13mm MG131 MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("13mm MG131 MG"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/MG_13mm_MG131.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Under the doctrine of WWII German infantry tactics, the squad machine gun is the center of operation and the rest of the squad will maneuver and try to achieve its objective under the cover of the squad machine gun fire."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. MG"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1140m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("16.6kg"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("750m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("1800m"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("900/min")
                              )
                            ),
                            Core.vx_new_string("20mm MG151/20 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("20mm MG151/20 Cannon"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* On the Fw190, it was found that it took an average of twenty 20 mm hits to shoot down a typical four engined bomber."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("800m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("750/min")
                              )
                            ),
                            Core.vx_new_string("30mm MK 108 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("30mm MK 108 Cannon"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Cannon_MK108.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The 30 mm MK 108 cannon could bring down a bomber with an average of one to three hits, but the ammunition was heavy (limiting the amount of ammo carried) and its low muzzle velocity meant it became inaccurate at 1000m."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("58kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("540m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("1000m"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("650/min")
                              )
                            ),
                            Core.vx_new_string("R4M Hurricane Rocket"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("R4M Hurricane Rocket"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The first practical anti-aircraft rocket. After the war the R4M served as the pattern for a number of similar systems, used by almost all interceptor aircraft during the 1940s and '50s. The R4M used a large warhead of 55mm with 520g explosive charge, nearly guaranteeing a kill with one hit. A battery typically consisted of two groups of 12 rockets and when all 24 were fired at once they would fill an area about 15 by 30 m at 1000 m, dense enough that one was almost certain to hit its target. Two warheads were available for the R4M, the common PB-3 with a 0.4 kg charge for anti-aircraft use and the larger shaped charge, similar in construction to the Panzerschreck, the Panzerblitz II (PB-2), for anti-tank use."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Orkan"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("812mm"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3.2kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("525m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("1000m"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("1")
                              )
                            ),
                            Core.vx_new_string("40mm Bofors L/60 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("40mm Bofors L/60 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto, HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("881m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("120/min")
                              )
                            ),
                            Core.vx_new_string("50mm PaK 38 L/60 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("50mm PaK 38 L/60 Cannon"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The PaK 38 was one of the few early guns capable of effectively penetrating the 45 mm armor of the formidable T-34."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP")
                              )
                            ),
                            Core.vx_new_string("50mm KwK 39 L/60 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("50mm KwK 39 L/60 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("800m/s")
                              )
                            ),
                            Core.vx_new_string("75mm KwK 39 L/48 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("75mm KwK 39 L/48 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("750m/s")
                              )
                            ),
                            Core.vx_new_string("75mm KwK 40 L/48 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("75mm KwK 40 L/48 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("792m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("1.8km")
                              )
                            ),
                            Core.vx_new_string("75mm KwK 42 L/70 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("75mm KwK 42 L/70 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("5.2m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1ton"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("925m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("2km direct, 10km indirect")
                              )
                            ),
                            Core.vx_new_string("88mm KwK 36 L/56 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("88mm KwK 36 L/56 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("773m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("2km")
                              )
                            ),
                            Core.vx_new_string("88mm KwK 43 L/71 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("88mm KwK 43 L/71 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("1000m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("4km")
                              )
                            ),
                            Core.vx_new_string("105mm leFH 18 Howitzer"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("105mm leFH 18 Howitzer"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Artillery"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("1.38kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("470m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("10.6km"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("5/min")
                              )
                            ),
                            Core.vx_new_string("150mm StuH 43 L/12 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("150mm StuH 43 L/12 Cannon"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Penetrates 160mm at any range"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("240m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("4.3km"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("1.5/min")
                              )
                            ),
                            Core.vx_new_string("Model 24 Grenade"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Model 24 Grenade"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Grenade_Model24.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* It featured an explosive charge encased in a metal can and mounted on a wooden shaft for throwing. It became one of the most easily recognized of all small arms, and synonymous with the German soldier."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Potato Masher"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Bomb"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string(".17kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string(".35m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string(".6kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Anti-Personnel"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("40m")
                              )
                            ),
                            Core.vx_new_string(":Panzerfaust"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Panzerfaust"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Rocket_Panzerfaust.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The weapon proved to be particularly deadly to Allied armored vehicles, especially in urban combat where the short lines of sight allowed the weapon to be used at close range."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Disposable HEAT Rocket penetrates 200mm at 60m"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Tank Fist"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string(".8kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("6.25kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HEAT"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("60m"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("1")
                              )
                            ),
                            Core.vx_new_string(":Panzerschreck"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Panzerschreck"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* When handled by well-trained crews, this weapon became the bane of Allied armored units, who frequently attempted to add improvised protection to their tanks, e.g. sandbags, spare track units, logs and so on. Most of this make-shift protection had little actual effect."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Disposable HEAT Rocket penetrates 200mm at 60m"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Tank Terror, Stove Pipe"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string(".66kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string(".16m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("11kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HEAT"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("150m")
                              )
                            ),
                            Core.vx_new_string("120mm GrW 42 Mortar"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("120mm GrW 42 Mortar"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Artillery"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("15.6 kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Indirect, HE")
                              )
                            ),
                            Core.vx_new_string("150mm Rocket Launcher"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("150mm Rocket Launcher"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* These offered the opportunity to deliver large quantities of poison gas or smoke simultaneously.\n* Almost five and a half million 15 cm rockets and six thousand launchers were manufactured over the course of the war."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("50kg"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1.1tons"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("145m/s"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("6")
                              )
                            ),
                            Core.vx_new_string("V2 Rocket"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("V2 Rocket"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Rocket_V2.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The rocket was the world's first long-range missile and first human artifact to achieve sub-orbital spaceflight. It was the progenitor of all modern rockets, including those used by the United States and Soviet Union space programs, who gained access to the scientists and designs.\n* They not only took a toll of 9 thousand casualties. They also had a devastating psychological effect for unlike the buzzbomb it would attack without warning, and it could not be intercepted by fighter aircraft or anti-aircraft artillery.\n* Hitler was probably not impressed with the weapon but was impressed by the enthusiasm of its developers and needed a 'wonder weapon' to maintain German morale."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Vengence 2"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("980kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("14m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("6.5tons"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("320km"),
                                Core.vx_new_string(":rounds"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("5760kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("1.65m")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII German Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII German Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII German Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII German Naval Vessels"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Bismarck Class Battleship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Bismarck Class Battleship"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Battleship_Bismarck.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* 40% by weight dedicated to armor. More than the Yamato's 33%\n* May 1941, sank the HMS Hood, flagship and pride of the Royal Navy in 11 minutes. In response, Winston Churchill issued the order to 'Sink the Bismarck', spurring a relentless pursuit by the Royal Navy."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Bismarck, Tirpitz"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("2092"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("50ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("251m"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("56kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("36m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("320mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("320mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("120mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("320mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("8 x 380 mm/L52 SK C/34 (15 in)(4x2)\n12 x 150 mm/L55 SK-C/28 (5.9 in)(6x2)\n16 x 105 mm/L65 SK-C/37 / SK-C/33 (4.1 in)(8x2)\n16 x 37 mm/L83 SK-C/30 (1.5 in)\n12 x 20 mm/L65 MG C/30 (0.79 in)\n8 x 20 mm/L65 MG C/32 (8x4) (0.79 in)")
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* 4xArado Ar 196 A-3, with 1 double-ended catapult")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("U-Boot Type VII"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("U-Boot Type VII"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Submarine_VIIC_UboatToken.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* By the end of the war, almost 3,000 Allied ships (175 warships; the rest were merchant ships) were sunk by U-boat torpedoes."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Submarine")
                              )
                            ),
                            Core.vx_new_string("Elektroboot XXI"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Elektroboot XXI"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIGerman/Submarine_XXIIIToken.png"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Submarine")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Italian Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Italian Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII Italian Aircraft"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII Italian Aircraft"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Fiat G50"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fiat G50"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIItalian/Fighter_Fiat_G50Token.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* In Africa, Italian pilots flying the G.50 managed to shoot down the faster and better armed Hurricane fighter.\n* In the hands of expert pilots, the Fiat G.50 could score multiple kills in a single action"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("2.7tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("3m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("7.8m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("670km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("484kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("11m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("8mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("12.7mm Breda-SAFAT MG"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("12.7mm Breda-SAFAT MG"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FF"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("2")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Piloting"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piloting"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Fiat CR.42 Falco"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fiat CR.42 Falco"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* The primary fighter of the Italian Air Force at the outbreak of the war. Although outdated by monoplane fighters, it still acquitted itself well in North Africa until the advent of more advanced Allied fighters. The Fiat CR.42 was the last of the Fiat biplane fighters to enter frontline service as a fighter, and represented the epitome of the type."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Falcon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("2.3tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("3.6m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("8.25m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("780km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("441kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("9.7m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("8mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("8mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("12.7mm Breda-SAFAT MG"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("12.7mm Breda-SAFAT MG"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FF"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("2"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("400")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Piloting"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piloting"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Savoia-Marchetti SM.81"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Savoia-Marchetti SM.81"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Bomber\n* Despite being too slow to remain competitive as a bomber, it was one of the most flexible, reliable and important aircraft of the Regia Aeronautica from 1935 to 1944, and adapted to second line duties in performing a wide range of tasks."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Aircraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("6"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("10.5tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("4.3m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("18.3m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("1500km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("347kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("24m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("3mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("7.7mm Breda-SAFAT MG"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("7.7mm Breda-SAFAT MG"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("6")
                                              )
                                            ),
                                            Core.vx_new_string("250kg Bomb"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("250kg Bomb"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("8")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Piloting"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piloting"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Japanese Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Japanese Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII Japanese Weapons"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII Japanese Weapons"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("8mm Type 94"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("8mm Type 94"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The gun became notorious for a design flaw that allowed it to be fired with a round in the chamber by pressing a projecting sear on the side of the receiver. The gun was a commercial failure, and is frequently described as the 'worst service pistol ever issued'"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("8mm Semiautomatic Pistol"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Pistol")
                              )
                            ),
                            Core.vx_new_string("6.5mm Type 97"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("6.5mm Type 97"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Bolt Action Sniper Rifle"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle")
                              )
                            ),
                            Core.vx_new_string("7.7mm Type 99"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.7mm Type 99"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Rifle_ArisakaType99.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* As a bolt action rifle, the Type 99 was a very solid weapon, but was completely outclassed by the semi-automatic rifles deployed by the Allies."),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Bolt Action Rifle"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle")
                              )
                            ),
                            Core.vx_new_string("6.5mm Type 96 LMG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("6.5mm Type 96 LMG"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto, +1 Prepare")
                              )
                            ),
                            Core.vx_new_string("7.7mm Type 97 MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.7mm Type 97 MG"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto, +1 Prepare")
                              )
                            ),
                            Core.vx_new_string("Type 93 Flamethrower"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Type 93 Flamethrower"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Flamethrower"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("2"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("26kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Fire, Auto"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("20m")
                              )
                            ),
                            Core.vx_new_string("13mm Type 93 AA"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("13mm Type 93 AA"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. MG"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1.4m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("42kg"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("805m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("250/min")
                              )
                            ),
                            Core.vx_new_string("20mm Type 99 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("20mm Type 99 Cannon"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Cannon_20mmType99.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1.3m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("23kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("600m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("520/min")
                              )
                            ),
                            Core.vx_new_string("25mm Type 96 Autocannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Autocannon_25mmType96.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The Type 96 was the standard medium antiaircraft weapon of the Imperial Japanese Navy, and was used on virtually every warship in combat in World War II. It was also used in land bases in the Japanese Empire and in the Japanese overseas combat fronts."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("3"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1.5m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("785kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("900m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("6.8km"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("110/min")
                              )
                            ),
                            Core.vx_new_string("37mm Type 94 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("37mm Type 94 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE")
                              )
                            ),
                            Core.vx_new_string("57mm Type 97 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("57mm Type 97 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE")
                              )
                            ),
                            Core.vx_new_string("76mm/60 Type 98 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("76mm/60 Type 98 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("4.7m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("1.3tons"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("910m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("25")
                              )
                            ),
                            Core.vx_new_string("127mm/45 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("127mm/45 Cannon"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Cannon_127mm45.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("5.5m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3.1tons"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("825m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("5/min")
                              )
                            ),
                            Core.vx_new_string("155mm/60 Naval Artillery"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("155mm/60 Naval Artillery"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("9.6m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("12.5tons"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("920m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("5/min")
                              )
                            ),
                            Core.vx_new_string("200mm/50 Naval Artillery"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("200mm/50 Naval Artillery"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("10m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("18tons"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("835m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("29km"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("4/min")
                              )
                            ),
                            Core.vx_new_string("460mm/45 Naval Artillery"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("460mm/45 Naval Artillery"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The 460mm / 18.1 in gun fired 1.36 ton shells."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("21m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("164tons"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("780m/s"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("42km"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("2/min")
                              )
                            ),
                            Core.vx_new_string("Torpedo Type 91"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torpedo Type 91"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Torpedo_Type91.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Aerial Torpedo"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Torpedo"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("235kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("5.2m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string(".85tons"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("2km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("78kph")
                              )
                            ),
                            Core.vx_new_string("Torpedo Type 93 Long Lance"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Torpedo_Type93LongLance.jpg"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Japanese destroyers and cruisers were able to launch their torpedoes from about 20 km at the unsuspecting Allied warships. The Allied warships were expecting enemy torpedoes to be fired at less than 10 km, their own torpedo range. The Allies believed these torpedoes had been fired from Japanese submarines. The capabilities of the Type 93 went mostly unrecognized by the Allies until one was captured intact in 1943."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Torpedo"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("490kg"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("9m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("2.8tons"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("22km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("90kph")
                              )
                            ),
                            Core.vx_new_string("Torpedo Type 95"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Torpedo Type 95"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Based on the formidable Type 93 Long Lance, the Type 95 was the fasted torpedo in use by any navy at the time.\n* It is 3x the range of the American Mark 14 with the same speed.\n* Its warhead was the largest of any submarine torpedo and second only to the Type 93 surface torpedo.\n* Some have claimed this to be the best torpedo of WWII."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Torpedo"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("405kg"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("9km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("92kph")
                              )
                            ),
                            Core.vx_new_string("Kaiten Kamikaze Torpedo"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kaiten Kamikaze Torpedo"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Early designs allowed the pilot to escape after the final acceleration toward the target, although whether this could have been done successfully is doubtful. There is no record of any pilot attempting to escape or intending to do so, and this provision was dropped from later production.\n* Kaiten attacks resulted in sinking only two American vessels with the loss of 162 American lives, in comparison to 106 kaiten pilots who lost their lives."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Torpedo"),
                                Core.vx_new_string(":explosive"),
                                Core.vx_new_string("1.4tons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("15m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("8.3tons"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("78km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("56kph")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Japanese Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Japanese Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII Japanese Naval Vessels"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII Japanese Naval Vessels"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("Kaga Class Converted Carrier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kaga Class Converted Carrier"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Carrier_KagaToken.png"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("Akagi carried - 21 Zeros, 21 Vals, and 21 Kates"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Kaga, Akagi"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("2016"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("38.8ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("247m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("18520km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("52kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("32m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("152mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("152mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("152mm"),
                                        Core.vx_new_string(":under"),
                                        Core.vx_new_string("152mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("152mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("200mm/50 Naval Artillery"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("200mm/50 Naval Artillery"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("1")
                                              )
                                            ),
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("16")
                                              )
                                            ),
                                            Core.vx_new_string("25mm Type 96 Autocannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("22")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* 18 A6M Zero Naval Fighter\n* 37 D3A Val Dive Bomber\n* 37 B5N Kate Torpedo Bomber")
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Soryu Class Fast Carrier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Soryu Class Fast Carrier"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Carrier_Hiryu.png"),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("Hiryu, Soryu"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1103"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("19.5ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("222m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("14000km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("64kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("21m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("45mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("45mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("25mm"),
                                        Core.vx_new_string(":under"),
                                        Core.vx_new_string("45mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("45mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("12")
                                              )
                                            ),
                                            Core.vx_new_string("25mm Type 96 Autocannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("26")
                                              )
                                            ),
                                            Core.vx_new_string("13mm Type 93 AA"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("13mm Type 93 AA"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("15")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* 18 A6M Zero Naval Fighter\n* 18 D3A Val Dive Bomber\n* 18 B5N Kate Torpedo Bomber")
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Fubuki Class Destroyer"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Fubuki Class Destroyer"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Destroyer_Akatsuki_Token.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Has been called 'the world's first modern destroyer.' It set a new standard for destroyers around the world. The Japanese destroyers were bigger, more powerfully armed, and faster than anything that any other fleet possessed."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("219"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("2ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("118m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("9200km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("70kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("10m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":under"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("10mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("6")
                                              )
                                            ),
                                            Core.vx_new_string("13mm Type 93 AA"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("13mm Type 93 AA"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("2")
                                              )
                                            ),
                                            Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FTurretx3, Tx3, BTurretx3"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("18")
                                              )
                                            ),
                                            Core.vx_new_string("600lb Depth Charge"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("600lb Depth Charge"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("18")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Agano Class Light Cruiser"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Agano Class Light Cruiser"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/CruiserLt_Noshiro_Token.png"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("726"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("7.6ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("162m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("11000km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("67kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("15.2m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("60mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("20mm"),
                                        Core.vx_new_string(":under"),
                                        Core.vx_new_string("60mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("60mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("155mm/60 Naval Artillery"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("155mm/60 Naval Artillery"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("6")
                                              )
                                            ),
                                            Core.vx_new_string("76mm/60 Type 98 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("76mm/60 Type 98 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("4")
                                              )
                                            ),
                                            Core.vx_new_string("25mm Type 96 Autocannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("32")
                                              )
                                            ),
                                            Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx8"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("8")
                                              )
                                            ),
                                            Core.vx_new_string("600lb Depth Charge"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("600lb Depth Charge"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("16")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* 2 A6M2 Rufe Seaplane")
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Tone Class Hvy. Cruiser"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Tone Class Hvy. Cruiser"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/CruiserHvy_Furutaka_Token.png"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("874"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("11ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("189m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("1852km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("67kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("19m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("100mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("35mm"),
                                        Core.vx_new_string(":under"),
                                        Core.vx_new_string("100mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("100mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("200mm/50 Naval Artillery"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("200mm/50 Naval Artillery"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("8")
                                              )
                                            ),
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("8")
                                              )
                                            ),
                                            Core.vx_new_string("25mm Type 96 Autocannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("12")
                                              )
                                            ),
                                            Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx12"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("12")
                                              )
                                            ),
                                            Core.vx_new_string("600lb Depth Charge"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("600lb Depth Charge"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("16")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* 6 A6M2 Rufe Seaplane")
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Yamato Class Battleship"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yamato Class Battleship"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Battleship_YamatoToken.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Largest battleships ever built with largest naval guns ever. Yamato sank after 8 bombs and 13 torpedos caused her magazine to explode."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("2767"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("72ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("263m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("13000km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("50kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("39m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("650mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("200mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("410mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("460mm/45 Naval Artillery"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("460mm/45 Naval Artillery"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("9")
                                              )
                                            ),
                                            Core.vx_new_string("155mm/60 Naval Artillery"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("155mm/60 Naval Artillery"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("6")
                                              )
                                            ),
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("12")
                                              )
                                            ),
                                            Core.vx_new_string("25mm Type 96 Autocannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("24")
                                              )
                                            ),
                                            Core.vx_new_string("13mm Type 93 AA"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("13mm Type 93 AA"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("13")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* 7 A6M2 Rufe Seaplane")
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Otori Class Torpedo Boat"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Otori Class Torpedo Boat"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/TorpedoBoat_MitsubishiT14_Token.png"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Naval Vessel"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("129"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("960tons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("88.5m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("7400km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("56kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("8.2m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("2")
                                              )
                                            ),
                                            Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Torpedo Type 93 Long Lance"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx3"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("3")
                                              )
                                            ),
                                            Core.vx_new_string("25mm Type 96 Autocannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("11")
                                              )
                                            ),
                                            Core.vx_new_string("600lb Depth Charge"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("600lb Depth Charge"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("48")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* 7 A6M2 Rufe Seaplane")
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("B1 Type Submarine Carrier"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("B1 Type Submarine Carrier"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIJapanese/Submarine_I29Token.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* 15kph Submerged\n* 100m Test Depth\n* Fast, very long ranged, and carried a single Yokosuka E14Y seaplane, located in a hangar in front of the conning tower, launched by a catapult.\n* A submarine could be equipped with 3-6 Kaiten torpedoes on the deck, but this limited dive depth."),
                                Core.vx_new_string(":titles"),
                                Core.vx_new_string("I-15 Series"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Submarine"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("94"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3654tons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("108m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("26000km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("44kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("9.3m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Torpedo Type 95"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Torpedo Type 95"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx6"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("6"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("17")
                                              )
                                            ),
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("1")
                                              )
                                            ),
                                            Core.vx_new_string("Kaiten Kamikaze Torpedo"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Kaiten Kamikaze Torpedo"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("4")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Hanger"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Hanger"),
                                        Core.vx_new_string(":summary"),
                                        Core.vx_new_string("* Yokosuka E14Y seaplane")
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Kaidai VII Submarine"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Kaidai VII Submarine"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* 15kph Submerged\n* 80m Test Depth"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Submarine"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("86"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("2.6ktons"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("105m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("15000km"),
                                Core.vx_new_string(":speedwater"),
                                Core.vx_new_string("43kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("8.25m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("Torpedo Type 95"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("Torpedo Type 95"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx6"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("6"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("12")
                                              )
                                            ),
                                            Core.vx_new_string("127mm/45 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("127mm/45 Cannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("1")
                                              )
                                            ),
                                            Core.vx_new_string("25mm Type 96 Autocannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("25mm Type 96 Autocannon"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("2")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Seamanship"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Seamanship"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Soviet Equipment"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Soviet Equipment"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII Soviet Weapons"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII Soviet Weapons"),
                        Core.vx_new_string(":itemmap"),
                        Core.f_new(
                          Base.t_itemmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("7.62mm Tokarev"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.62mm Tokarev"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIRussian/Pistol_Tokarev.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Pistol")
                              )
                            ),
                            Core.vx_new_string("7.62mm SVT-40"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.62mm SVT-40"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIRussian/Rifle_SVT40.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7.62mm Semiautomatic Rifle"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle")
                              )
                            ),
                            Core.vx_new_string("7.62mm Mosin-Nagant"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.62mm Mosin-Nagant"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIRussian/Rifle_MosinNagantM1891.jpg"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("7.62mm Bolt-action Rifle"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Rifle")
                              )
                            ),
                            Core.vx_new_string("7.62mm PPSh-41 SMG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.62mm PPSh-41 SMG"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIRussian/SMG_PPSh41.jpg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("200m")
                              )
                            ),
                            Core.vx_new_string("ROKS Flamethrower"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("ROKS Flamethrower"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Flamethrower"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("22kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Fire, Auto"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("25m")
                              )
                            ),
                            Core.vx_new_string("7.62mm Degtyaryov LMG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("7.62mm Degtyaryov LMG"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Med. MG"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto, +1 Prepare")
                              )
                            ),
                            Core.vx_new_string("12.7mm DShK MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("12.7mm DShK MG"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. MG"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1.6m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("34kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("600/min")
                              )
                            ),
                            Core.vx_new_string("12.7mm UBS MG"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("12.7mm UBS MG"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Used by the vast majority of Soviet military aircraft\n* It's rate of fire was nearly twice that of the comparable M2 Browning machine gun."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Hvy. MG"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("21.5kg"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("825m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("1000/min")
                              )
                            ),
                            Core.vx_new_string("20mm ShVAK Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("20mm ShVAK Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1679mm"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("40kg"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Auto, HE, AP"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("775m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("750/min")
                              )
                            ),
                            Core.vx_new_string("76.2mm F-34 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("76.2mm F-34 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE")
                              )
                            ),
                            Core.vx_new_string("76.2mm ZiS-3Sh Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("76.2mm ZiS-3Sh Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE")
                              )
                            ),
                            Core.vx_new_string("85mm D-5T Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("85mm D-5T Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE")
                              )
                            ),
                            Core.vx_new_string("85mm ZiS-S-53 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("85mm ZiS-S-53 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE")
                              )
                            ),
                            Core.vx_new_string("100mm D-10S Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("100mm D-10S Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("AP, HE")
                              )
                            ),
                            Core.vx_new_string("122mm A-19 Cannon"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("122mm A-19 Cannon"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":muzzlevelocity"),
                                Core.vx_new_string("806m/s"),
                                Core.vx_new_string(":rof"),
                                Core.vx_new_string("2/min")
                              )
                            ),
                            Core.vx_new_string("122mm M-30 Howitzer"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("122mm M-30 Howitzer"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* M-30 howitzers were primarily employed for indirect fire against enemy personnel. It was also used against field fortifications, clearing minefields and breaching barbed wire. Fragments created by the explosion could penetrate up to 20 mm of armour."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("Indirect, HE")
                              )
                            ),
                            Core.vx_new_string("152mm M-10 Howitzer"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("152mm M-10 Howitzer"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Cannon"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE")
                              )
                            ),
                            Core.vx_new_string("120mm M1938 Mortar"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("120mm M1938 Mortar"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Artillery"),
                                Core.vx_new_string(":modifiers"),
                                Core.vx_new_string("HE")
                              )
                            ),
                            Core.vx_new_string("133mm M-13 Rocket"),
                            Core.f_new(
                              Base.t_item,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("133mm M-13 Rocket"),
                                Core.vx_new_string(":summary"),
                                Core.vx_new_string("* Warhead is 22kg"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Missile"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("1.8m"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("42kg"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("5.4km")
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            ),
            Core.vx_new_string("WWII Soviet Units"),
            Core.f_new(
              Base.t_chapter,
              Core.t_anylist.vx_new(
                Core.vx_new_string(":name"),
                Core.vx_new_string("WWII Soviet Units"),
                Core.vx_new_string(":sectionmap"),
                Core.f_new(
                  Base.t_sectionmap,
                  Core.t_anylist.vx_new(
                    Core.vx_new_string("WWII Soviet Aircraft"),
                    Core.f_new(
                      Base.t_section,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":name"),
                        Core.vx_new_string("WWII Soviet Aircraft"),
                        Core.vx_new_string(":unitmap"),
                        Core.f_new(
                          Base.t_unitmap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string("P-39 Airacobra"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("P-39 Airacobra"),
                                Core.vx_new_string(":image"),
                                Core.vx_new_string("WWIIRussian/Fighter_P39Airacobra.png"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Lend Lease from US\n				* The low-speed, low-altitude turning nature of most air combat on the Russian Front suited the P-39's strengths: sturdy construction, reliable radio gear, and adequate firepower. The second-highest 				scoring Allied ace, Aleksandr Pokryshkin, flew the P-39. His unofficial score stands at nearly 60 Luftwaffe aircraft. His wingman, Grigori Rechkalov, scored 57 victories with the P-39. This is the highest score ever gained by any pilot with any U.S.-made aircraft."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3.8tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("3.8m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("9.2m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("840km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("605kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("10.4m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("13mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("13mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("13mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("13mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("37mm M4 Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("37mm M4 Cannon"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FF"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("30")
                                              )
                                            ),
                                            Core.vx_new_string(".50 cal M2HB MG"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string(".50 cal M2HB MG"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx2"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("2"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("400")
                                              )
                                            ),
                                            Core.vx_new_string(".30-06 M1919A4 MG"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string(".30-06 M1919A4 MG"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx4"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("4"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("600")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Piloting"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piloting"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Lavochkin La-5"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Lavochkin La-5"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* Exhaust gas often entered in the cockpit due to poor insulation of the engine compartment. Consequently, pilots ignored orders and frequently flew with their canopies open."),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3.3tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("2.5m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("8.7m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("765km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("648kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("9.8m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("10mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("20mm ShVAK Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("20mm ShVAK Cannon"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FFx2"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("120")
                                              )
                                            ),
                                            Core.vx_new_string("100kg Bomb"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("100kg Bomb"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("Ux2")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Piloting"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piloting"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3")
                                      )
                                    )
                                  )
                                )
                              )
                            ),
                            Core.vx_new_string("Yakovlev Yak-9"),
                            Core.f_new(
                              Base.t_unit,
                              Core.t_anylist.vx_new(
                                Core.vx_new_string(":name"),
                                Core.vx_new_string("Yakovlev Yak-9"),
                                Core.vx_new_string(":reference"),
                                Core.vx_new_string("* The most numerous Soviet fighter of the war"),
                                Core.vx_new_string(":classification"),
                                Core.vx_new_string("Lt. Aircraft"),
                                Core.vx_new_string(":crew"),
                                Core.vx_new_string("1"),
                                Core.vx_new_string(":mass"),
                                Core.vx_new_string("3.2tons"),
                                Core.vx_new_string(":height"),
                                Core.vx_new_string("3m"),
                                Core.vx_new_string(":length"),
                                Core.vx_new_string("8.6m"),
                                Core.vx_new_string(":range"),
                                Core.vx_new_string("675km"),
                                Core.vx_new_string(":speedair"),
                                Core.vx_new_string("672kph"),
                                Core.vx_new_string(":width"),
                                Core.vx_new_string("9.7m"),
                                Core.vx_new_string(":unitpowermap"),
                                Core.f_new(
                                  Base.t_unitpowermap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Armor"),
                                    Core.f_new(
                                      Base.t_unitpower,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Armor"),
                                        Core.vx_new_string(":front"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":back"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":over"),
                                        Core.vx_new_string("10mm"),
                                        Core.vx_new_string(":side"),
                                        Core.vx_new_string("10mm")
                                      )
                                    )
                                  )
                                ),
                                Core.vx_new_string(":unitskillmap"),
                                Core.f_new(
                                  Base.t_unitskillmap,
                                  Core.t_anylist.vx_new(
                                    Core.vx_new_string(":Gunnery"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Gunnery"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4"),
                                        Core.vx_new_string(":unititemmap"),
                                        Core.f_new(
                                          Base.t_unititemmap,
                                          Core.t_anylist.vx_new(
                                            Core.vx_new_string("20mm ShVAK Cannon"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("20mm ShVAK Cannon"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FF"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("120")
                                              )
                                            ),
                                            Core.vx_new_string("12.7mm UBS MG"),
                                            Core.f_new(
                                              Base.t_unititem,
                                              Core.t_anylist.vx_new(
                                                Core.vx_new_string(":name"),
                                                Core.vx_new_string("12.7mm UBS MG"),
                                                Core.vx_new_string(":facing"),
                                                Core.vx_new_string("FF"),
                                                Core.vx_new_string(":number"),
                                                Core.vx_new_string("1"),
                                                Core.vx_new_string(":rounds"),
                                                Core.vx_new_string("200")
                                              )
                                            )
                                          )
                                        )
                                      )
                                    ),
                                    Core.vx_new_string(":Piloting"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Piloting"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("4")
                                      )
                                    ),
                                    Core.vx_new_string(":Military"),
                                    Core.f_new(
                                      Base.t_unitskill,
                                      Core.t_anylist.vx_new(
                                        Core.vx_new_string(":name"),
                                        Core.vx_new_string("Military"),
                                        Core.vx_new_string(":level"),
                                        Core.vx_new_string("3")
                                      )
                                    )
                                  )
                                )
                              )
                            )
                          )
                        )
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
    );
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("tacticsbook", World_wars.t_tacticsbook);
    Core.vx_global_package_set("nx/tactics/books/world_wars", maptype, mapconst, mapfunc);
  }

}
