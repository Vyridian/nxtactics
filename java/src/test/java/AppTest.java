
import com.vxlisp.vx.Core;
import com.vxlisp.vx.translation.En;
import com.vxlisp.vx.CollectionTest;
import com.vxlisp.vx.CoreTest;
import com.vxlisp.vx.data.CsvTest;
import com.vxlisp.vx.data.DbTest;
import com.vxlisp.vx.data.FileTest;
import com.vxlisp.vx.data.TableTest;
import com.vxlisp.vx.data.TextblockTest;
import com.vxlisp.vx.data.TreeTest;
import com.vxlisp.vx.data.XmlTest;
import com.vxlisp.vx.EventTest;
import com.vxlisp.vx.ReplTest;
import com.vxlisp.vx.SampleTest;
import com.vxlisp.vx.StateTest;
import com.vxlisp.vx.TestTest;
import com.vxlisp.vx.TranslateTest;
import com.vxlisp.vx.translation.AllTest;
import com.vxlisp.vx.translation.EnTest;
import com.vxlisp.vx.translation.EsTest;
import com.vxlisp.vx.TypeTest;
import com.vxlisp.vx.web.HtmlTest;
import com.vxlisp.vx.web.HtmldocTest;
import com.vxlisp.vx.web.HttpTest;
import com.vxlisp.nx.crypto.CryptosheetTest;
import com.vxlisp.nx.tactics.ApptacticsTest;
import com.vxlisp.nx.tactics.BaseTest;
import com.vxlisp.nx.tactics.books.Age_of_steamTest;
import com.vxlisp.nx.tactics.books.BookloaderTest;
import com.vxlisp.nx.tactics.books.CharactersTest;
import com.vxlisp.nx.tactics.books.GearTest;
import com.vxlisp.nx.tactics.books.GettingstartedTest;
import com.vxlisp.nx.tactics.books.HorrorTest;
import com.vxlisp.nx.tactics.books.MedievalTest;
import com.vxlisp.nx.tactics.books.Modern_fantasyTest;
import com.vxlisp.nx.tactics.books.PrehistoryTest;
import com.vxlisp.nx.tactics.books.Pulp_fictionTest;
import com.vxlisp.nx.tactics.books.Space_and_timeTest;
import com.vxlisp.nx.tactics.books.SuperheroesTest;
import com.vxlisp.nx.tactics.DamageTest;
import com.vxlisp.vx.ui.AppuiTest;
import com.vxlisp.vx.ui.BackgroundTest;
import com.vxlisp.vx.ui.ElementTest;
import com.vxlisp.vx.ui.FlowTest;
import com.vxlisp.vx.ui.ImageTest;
import com.vxlisp.vx.ui.NavigationTest;
import com.vxlisp.vx.ui.ScrollbarTest;
import com.vxlisp.vx.ui.TextTest;
import com.vxlisp.vx.ui.TextentryTest;
import com.vxlisp.vx.ui.UiTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for whole App.
 */
public final class AppTest {


  Core.Type_anylist arglist = Core.e_anylist;
  Core.Type_context context = com.vxlisp.vx.translation.En.f_context_test(arglist);

  @Test
  @DisplayName("vx/collection")
  void test_vx_collection() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = CollectionTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/core")
  void test_vx_core() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = CoreTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/data/csv")
  void test_vx_data_csv() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = CsvTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/data/db")
  void test_vx_data_db() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = DbTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/data/file")
  void test_vx_data_file() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = FileTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/data/table")
  void test_vx_data_table() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TableTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/data/textblock")
  void test_vx_data_textblock() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TextblockTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/data/tree")
  void test_vx_data_tree() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TreeTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/data/xml")
  void test_vx_data_xml() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = XmlTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/event")
  void test_vx_event() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = EventTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/repl")
  void test_vx_repl() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = ReplTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/sample")
  void test_vx_sample() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = SampleTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/state")
  void test_vx_state() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = StateTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/test")
  void test_vx_test() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TestTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/translate")
  void test_vx_translate() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TranslateTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/translation/all")
  void test_vx_translation_all() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = AllTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/translation/en")
  void test_vx_translation_en() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = EnTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/translation/es")
  void test_vx_translation_es() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = EsTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/type")
  void test_vx_type() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TypeTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/web/html")
  void test_vx_web_html() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = HtmlTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/web/htmldoc")
  void test_vx_web_htmldoc() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = HtmldocTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/web/http")
  void test_vx_web_http() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = HttpTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/crypto/cryptosheet")
  void test_nx_crypto_cryptosheet() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = CryptosheetTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/apptactics")
  void test_nx_tactics_apptactics() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = ApptacticsTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/base")
  void test_nx_tactics_base() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = BaseTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/age_of_steam")
  void test_nx_tactics_books_age_of_steam() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = Age_of_steamTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/bookloader")
  void test_nx_tactics_books_bookloader() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = BookloaderTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/characters")
  void test_nx_tactics_books_characters() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = CharactersTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/gear")
  void test_nx_tactics_books_gear() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = GearTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/gettingstarted")
  void test_nx_tactics_books_gettingstarted() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = GettingstartedTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/horror")
  void test_nx_tactics_books_horror() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = HorrorTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/medieval")
  void test_nx_tactics_books_medieval() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = MedievalTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/modern_fantasy")
  void test_nx_tactics_books_modern_fantasy() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = Modern_fantasyTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/prehistory")
  void test_nx_tactics_books_prehistory() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = PrehistoryTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/pulp_fiction")
  void test_nx_tactics_books_pulp_fiction() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = Pulp_fictionTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/space_and_time")
  void test_nx_tactics_books_space_and_time() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = Space_and_timeTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/books/superheroes")
  void test_nx_tactics_books_superheroes() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = SuperheroesTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("nx/tactics/damage")
  void test_nx_tactics_damage() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = DamageTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/appui")
  void test_vx_ui_appui() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = AppuiTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/background")
  void test_vx_ui_background() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = BackgroundTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/element")
  void test_vx_ui_element() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = ElementTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/flow")
  void test_vx_ui_flow() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = FlowTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/image")
  void test_vx_ui_image() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = ImageTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/navigation")
  void test_vx_ui_navigation() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = NavigationTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/scrollbar")
  void test_vx_ui_scrollbar() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = ScrollbarTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/text")
  void test_vx_ui_text() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TextTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/textentry")
  void test_vx_ui_textentry() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = TextentryTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("vx/ui/ui")
  void test_vx_ui_ui() {
	  com.vxlisp.vx.Test.Type_testpackage testpackage = UiTest.test_package(context);
	  TestLib.run_testpackage_async(testpackage);
  }


  @Test
  @DisplayName("writetestsuite")
  void test_writetestsuite() {
    com.vxlisp.vx.Test.Type_testpackagelist testpackagelist = com.vxlisp.vx.Test.t_testpackagelist.vx_new(
    CollectionTest.test_package(context),
    CoreTest.test_package(context),
    CsvTest.test_package(context),
    DbTest.test_package(context),
    FileTest.test_package(context),
    TableTest.test_package(context),
    TextblockTest.test_package(context),
    TreeTest.test_package(context),
    XmlTest.test_package(context),
    EventTest.test_package(context),
    ReplTest.test_package(context),
    SampleTest.test_package(context),
    StateTest.test_package(context),
    TestTest.test_package(context),
    TranslateTest.test_package(context),
    AllTest.test_package(context),
    EnTest.test_package(context),
    EsTest.test_package(context),
    TypeTest.test_package(context),
    HtmlTest.test_package(context),
    HtmldocTest.test_package(context),
    HttpTest.test_package(context),
    CryptosheetTest.test_package(context),
    ApptacticsTest.test_package(context),
    BaseTest.test_package(context),
    Age_of_steamTest.test_package(context),
    BookloaderTest.test_package(context),
    CharactersTest.test_package(context),
    GearTest.test_package(context),
    GettingstartedTest.test_package(context),
    HorrorTest.test_package(context),
    MedievalTest.test_package(context),
    Modern_fantasyTest.test_package(context),
    PrehistoryTest.test_package(context),
    Pulp_fictionTest.test_package(context),
    Space_and_timeTest.test_package(context),
    SuperheroesTest.test_package(context),
    DamageTest.test_package(context),
    AppuiTest.test_package(context),
    BackgroundTest.test_package(context),
    ElementTest.test_package(context),
    FlowTest.test_package(context),
    ImageTest.test_package(context),
    NavigationTest.test_package(context),
    ScrollbarTest.test_package(context),
    TextTest.test_package(context),
    TextentryTest.test_package(context),
    UiTest.test_package(context)
    );
    TestLib.write_testpackagelist_async(context, testpackagelist);
  }
}
