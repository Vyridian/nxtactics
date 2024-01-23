/**
 * App
 */
import com.vxlisp.vx.Core;
import com.vxlisp.nx.tactics.Apptactics;

public final class App {

  public static void main(String[] args) {
    try {
      String output = "";
      Core.Type_anylist arglist = Core.vx_anylist_from_arraystring(args);
      Core.Type_context context = Apptactics.f_context_nx(arglist);
      Core.Type_string mainstring = Apptactics.f_main_nx(context, arglist);
      output = mainstring.vx_string();
      System.out.println(output);
    } catch (Exception e) {
      System.out.println("Untrapped Error!" + e.toString());
    }
  }

}
