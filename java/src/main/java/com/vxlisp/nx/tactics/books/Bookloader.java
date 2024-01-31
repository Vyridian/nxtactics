package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;
import com.vxlisp.vx.data.*;

public final class Bookloader {

  /**
   * @function ability_from_ability_key_value
   * Returns a modified ability from a key value.
   * @param  {ability} current
   * @param  {string} key
   * @param  {string} value
   * @return {ability}
   * (func ability<-ability-key-value)
   */
  public static interface Func_ability_from_ability_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_ability vx_ability_from_ability_key_value(final Base.Type_ability current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_ability_from_ability_key_value extends Core.Class_base implements Func_ability_from_ability_key_value {

    @Override
    public Func_ability_from_ability_key_value vx_new(Object... vals) {
      Class_ability_from_ability_key_value output = new Class_ability_from_ability_key_value();
      return output;
    }

    @Override
    public Func_ability_from_ability_key_value vx_copy(Object... vals) {
      Class_ability_from_ability_key_value output = new Class_ability_from_ability_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "ability<-ability-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "ability", // name
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
    public Func_ability_from_ability_key_value vx_empty() {return e_ability_from_ability_key_value;}
    @Override
    public Func_ability_from_ability_key_value vx_type() {return t_ability_from_ability_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_ability current = Core.f_any_from_any(Base.t_ability, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_ability_from_ability_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_ability vx_ability_from_ability_key_value(final Base.Type_ability current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_ability_from_ability_key_value(current, key, value);
    }

  }

  public static final Func_ability_from_ability_key_value e_ability_from_ability_key_value = new Bookloader.Class_ability_from_ability_key_value();
  public static final Func_ability_from_ability_key_value t_ability_from_ability_key_value = new Bookloader.Class_ability_from_ability_key_value();

  public static Base.Type_ability f_ability_from_ability_key_value(final Base.Type_ability current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_ability output = Base.e_ability;
    output = Core.f_switch(
      Base.t_ability,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_ability,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function ability_from_ability_stringmap
   * Returns a new ability from a propmap.
   * @param  {ability} ability
   * @param  {stringmap} propmap
   * @return {ability}
   * (func ability<-ability-stringmap)
   */
  public static interface Func_ability_from_ability_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_ability vx_ability_from_ability_stringmap(final Base.Type_ability ability, final Core.Type_stringmap propmap);
  }

  public static class Class_ability_from_ability_stringmap extends Core.Class_base implements Func_ability_from_ability_stringmap {

    @Override
    public Func_ability_from_ability_stringmap vx_new(Object... vals) {
      Class_ability_from_ability_stringmap output = new Class_ability_from_ability_stringmap();
      return output;
    }

    @Override
    public Func_ability_from_ability_stringmap vx_copy(Object... vals) {
      Class_ability_from_ability_stringmap output = new Class_ability_from_ability_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "ability<-ability-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "ability", // name
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
    public Func_ability_from_ability_stringmap vx_empty() {return e_ability_from_ability_stringmap;}
    @Override
    public Func_ability_from_ability_stringmap vx_type() {return t_ability_from_ability_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_ability ability = Core.f_any_from_any(Base.t_ability, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_ability_from_ability_stringmap(ability, propmap);
      return output;
    }

    @Override
    public Base.Type_ability vx_ability_from_ability_stringmap(final Base.Type_ability ability, final Core.Type_stringmap propmap) {
      return Bookloader.f_ability_from_ability_stringmap(ability, propmap);
    }

  }

  public static final Func_ability_from_ability_stringmap e_ability_from_ability_stringmap = new Bookloader.Class_ability_from_ability_stringmap();
  public static final Func_ability_from_ability_stringmap t_ability_from_ability_stringmap = new Bookloader.Class_ability_from_ability_stringmap();

  public static Base.Type_ability f_ability_from_ability_stringmap(final Base.Type_ability ability, final Core.Type_stringmap propmap) {
    Base.Type_ability output = Base.e_ability;
    output = Core.f_any_from_map_start_reduce(
      Base.t_ability,
      propmap,
      ability,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_ability current_lmb = Core.f_any_from_any(Base.t_ability, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_ability_from_ability_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function ability_from_ability_xmlchild
   * Returns a modified ability based on a given child xml.
   * @param  {ability} ability
   * @param  {xml} child
   * @return {ability}
   * (func ability<-ability-xmlchild)
   */
  public static interface Func_ability_from_ability_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_ability vx_ability_from_ability_xmlchild(final Base.Type_ability ability, final Xml.Type_xml child);
  }

  public static class Class_ability_from_ability_xmlchild extends Core.Class_base implements Func_ability_from_ability_xmlchild {

    @Override
    public Func_ability_from_ability_xmlchild vx_new(Object... vals) {
      Class_ability_from_ability_xmlchild output = new Class_ability_from_ability_xmlchild();
      return output;
    }

    @Override
    public Func_ability_from_ability_xmlchild vx_copy(Object... vals) {
      Class_ability_from_ability_xmlchild output = new Class_ability_from_ability_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "ability<-ability-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "ability", // name
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
    public Func_ability_from_ability_xmlchild vx_empty() {return e_ability_from_ability_xmlchild;}
    @Override
    public Func_ability_from_ability_xmlchild vx_type() {return t_ability_from_ability_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_ability ability = Core.f_any_from_any(Base.t_ability, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_ability_from_ability_xmlchild(ability, child);
      return output;
    }

    @Override
    public Base.Type_ability vx_ability_from_ability_xmlchild(final Base.Type_ability ability, final Xml.Type_xml child) {
      return Bookloader.f_ability_from_ability_xmlchild(ability, child);
    }

  }

  public static final Func_ability_from_ability_xmlchild e_ability_from_ability_xmlchild = new Bookloader.Class_ability_from_ability_xmlchild();
  public static final Func_ability_from_ability_xmlchild t_ability_from_ability_xmlchild = new Bookloader.Class_ability_from_ability_xmlchild();

  public static Base.Type_ability f_ability_from_ability_xmlchild(final Base.Type_ability ability, final Xml.Type_xml child) {
    Base.Type_ability output = Base.e_ability;
    output = Core.f_let(
      Base.t_ability,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_ability,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return ability;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  ability,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  ability,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_ability,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function ability_from_xml
   * Returns a ability from a given xml.
   * @param  {xml} xml
   * @return {ability}
   * (func ability<-xml)
   */
  public static interface Func_ability_from_xml extends Core.Func_any_from_any {
    public Base.Type_ability vx_ability_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_ability_from_xml extends Core.Class_base implements Func_ability_from_xml {

    @Override
    public Func_ability_from_xml vx_new(Object... vals) {
      Class_ability_from_xml output = new Class_ability_from_xml();
      return output;
    }

    @Override
    public Func_ability_from_xml vx_copy(Object... vals) {
      Class_ability_from_xml output = new Class_ability_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "ability<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "ability", // name
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
    public Func_ability_from_xml vx_empty() {return e_ability_from_xml;}
    @Override
    public Func_ability_from_xml vx_type() {return t_ability_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_ability_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_ability_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_ability vx_ability_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_ability_from_xml(xml);
    }

  }

  public static final Func_ability_from_xml e_ability_from_xml = new Bookloader.Class_ability_from_xml();
  public static final Func_ability_from_xml t_ability_from_xml = new Bookloader.Class_ability_from_xml();

  public static Base.Type_ability f_ability_from_xml(final Xml.Type_xml xml) {
    Base.Type_ability output = Base.e_ability;
    output = Core.f_let(
      Base.t_ability,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_ability ability = Bookloader.f_ability_from_ability_stringmap(
          Core.f_empty(
            Base.t_ability
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_ability,
          xml.children(),
          ability,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any ability_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_ability ability_lmb = Core.f_any_from_any(Base.t_ability, ability_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_ability_from_ability_xmlchild(ability_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function book_read_from_bookname
   * Returns a book by loading the given Xml filename.
   * @param  {string} bookname
   * @return {book}
   * (func book-read<-bookname)
   */
  public static interface Func_book_read_from_bookname extends Core.Func_any_from_any_context {
    public Base.Type_book vx_book_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname);
  }

  public static class Class_book_read_from_bookname extends Core.Class_base implements Func_book_read_from_bookname {

    @Override
    public Func_book_read_from_bookname vx_new(Object... vals) {
      Class_book_read_from_bookname output = new Class_book_read_from_bookname();
      return output;
    }

    @Override
    public Func_book_read_from_bookname vx_copy(Object... vals) {
      Class_book_read_from_bookname output = new Class_book_read_from_bookname();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book-read<-bookname", // name
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
    public Func_book_read_from_bookname vx_empty() {return e_book_read_from_bookname;}
    @Override
    public Func_book_read_from_bookname vx_type() {return t_book_read_from_bookname;}

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {return Core.e_any_from_any_context;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Bookloader.f_book_read_from_bookname(context, inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string bookname = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_book_read_from_bookname(context, bookname);
      return output;
    }

    @Override
    public Base.Type_book vx_book_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname) {
      return Bookloader.f_book_read_from_bookname(context, bookname);
    }

  }

  public static final Func_book_read_from_bookname e_book_read_from_bookname = new Bookloader.Class_book_read_from_bookname();
  public static final Func_book_read_from_bookname t_book_read_from_bookname = new Bookloader.Class_book_read_from_bookname();

  public static Base.Type_book f_book_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname) {
    Base.Type_book output = Base.e_book;
    output = Core.f_let(
      Base.t_book,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Xml.Type_xml xml = Bookloader.f_xml_read_from_bookname(context, bookname);
        return Bookloader.f_book_from_xml(xml);
      })
    );
    return output;
  }

  /**
   * @function book_from_book_key_value
   * Returns a modified book from a key value.
   * @param  {book} current
   * @param  {string} key
   * @param  {string} value
   * @return {book}
   * (func book<-book-key-value)
   */
  public static interface Func_book_from_book_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_book_from_book_key_value(final Base.Type_book current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_book_from_book_key_value extends Core.Class_base implements Func_book_from_book_key_value {

    @Override
    public Func_book_from_book_key_value vx_new(Object... vals) {
      Class_book_from_book_key_value output = new Class_book_from_book_key_value();
      return output;
    }

    @Override
    public Func_book_from_book_key_value vx_copy(Object... vals) {
      Class_book_from_book_key_value output = new Class_book_from_book_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-book-key-value", // name
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
    public Func_book_from_book_key_value vx_empty() {return e_book_from_book_key_value;}
    @Override
    public Func_book_from_book_key_value vx_type() {return t_book_from_book_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book current = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_book_from_book_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_book_key_value(final Base.Type_book current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_book_from_book_key_value(current, key, value);
    }

  }

  public static final Func_book_from_book_key_value e_book_from_book_key_value = new Bookloader.Class_book_from_book_key_value();
  public static final Func_book_from_book_key_value t_book_from_book_key_value = new Bookloader.Class_book_from_book_key_value();

  public static Base.Type_book f_book_from_book_key_value(final Base.Type_book current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_book output = Base.e_book;
    output = Core.f_switch(
      Base.t_book,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_book,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function book_from_book_stringmap
   * Returns a new book from a propmap.
   * @param  {book} book
   * @param  {stringmap} propmap
   * @return {book}
   * (func book<-book-stringmap)
   */
  public static interface Func_book_from_book_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_book_from_book_stringmap(final Base.Type_book book, final Core.Type_stringmap propmap);
  }

  public static class Class_book_from_book_stringmap extends Core.Class_base implements Func_book_from_book_stringmap {

    @Override
    public Func_book_from_book_stringmap vx_new(Object... vals) {
      Class_book_from_book_stringmap output = new Class_book_from_book_stringmap();
      return output;
    }

    @Override
    public Func_book_from_book_stringmap vx_copy(Object... vals) {
      Class_book_from_book_stringmap output = new Class_book_from_book_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-book-stringmap", // name
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
    public Func_book_from_book_stringmap vx_empty() {return e_book_from_book_stringmap;}
    @Override
    public Func_book_from_book_stringmap vx_type() {return t_book_from_book_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book book = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_book_from_book_stringmap(book, propmap);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_book_stringmap(final Base.Type_book book, final Core.Type_stringmap propmap) {
      return Bookloader.f_book_from_book_stringmap(book, propmap);
    }

  }

  public static final Func_book_from_book_stringmap e_book_from_book_stringmap = new Bookloader.Class_book_from_book_stringmap();
  public static final Func_book_from_book_stringmap t_book_from_book_stringmap = new Bookloader.Class_book_from_book_stringmap();

  public static Base.Type_book f_book_from_book_stringmap(final Base.Type_book book, final Core.Type_stringmap propmap) {
    Base.Type_book output = Base.e_book;
    output = Core.f_any_from_map_start_reduce(
      Base.t_book,
      propmap,
      book,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_book current_lmb = Core.f_any_from_any(Base.t_book, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_book_from_book_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function book_from_book_xml
   * Returns an altered book based on xml child.
   * @param  {book} current
   * @param  {xml} child
   * @return {book}
   * (func book<-book-xml)
   */
  public static interface Func_book_from_book_xml extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_book_from_book_xml(final Base.Type_book current, final Xml.Type_xml child);
  }

  public static class Class_book_from_book_xml extends Core.Class_base implements Func_book_from_book_xml {

    @Override
    public Func_book_from_book_xml vx_new(Object... vals) {
      Class_book_from_book_xml output = new Class_book_from_book_xml();
      return output;
    }

    @Override
    public Func_book_from_book_xml vx_copy(Object... vals) {
      Class_book_from_book_xml output = new Class_book_from_book_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-book-xml", // name
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
    public Func_book_from_book_xml vx_empty() {return e_book_from_book_xml;}
    @Override
    public Func_book_from_book_xml vx_type() {return t_book_from_book_xml;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book current = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_book_from_book_xml(current, child);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_book_xml(final Base.Type_book current, final Xml.Type_xml child) {
      return Bookloader.f_book_from_book_xml(current, child);
    }

  }

  public static final Func_book_from_book_xml e_book_from_book_xml = new Bookloader.Class_book_from_book_xml();
  public static final Func_book_from_book_xml t_book_from_book_xml = new Bookloader.Class_book_from_book_xml();

  public static Base.Type_book f_book_from_book_xml(final Base.Type_book current, final Xml.Type_xml child) {
    Base.Type_book output = Base.e_book;
    output = Core.f_let(
      Base.t_book,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_book,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return current;
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("!--"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return current;
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("?xml"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return current;
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("doc"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_if_2(
                  Base.t_book,
                  Core.t_thenelselist.vx_new(
                      Core.f_then(
                        Core.t_boolean_from_func.vx_fn_new(() -> {
                          return Core.f_is_empty_1(current);
                        }),
                        Core.t_any_from_func.vx_fn_new(() -> {
                          return Bookloader.f_book_from_xmldoc(child);
                        })
                      ),
                      Core.f_else(
                        Core.t_any_from_func.vx_fn_new(() -> {
                          return Core.f_copy(
                            current,
                            Core.t_anylist.vx_new(
                                Core.f_msg_from_error_1(
                                  Core.vx_new_string(":duplicatetagfound"),
                                  Core.f_new(
                                    Core.t_anymap,
                                    Core.t_anylist.vx_new(
                                      Core.vx_new_string(":type"),
                                      Base.t_book,
                                      Core.vx_new_string(":tag"),
                                      tag
                                    )
                                  )
                                )
                            )
                          );
                        })
                      )
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  current,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_book,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function book_from_book_xmlchapter
   * Returns an altered book based on xmlchapter.
   * @param  {book} book
   * @param  {xml} xml
   * @return {book}
   * (func book<-book-xmlchapter)
   */
  public static interface Func_book_from_book_xmlchapter extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_book_from_book_xmlchapter(final Base.Type_book book, final Xml.Type_xml xml);
  }

  public static class Class_book_from_book_xmlchapter extends Core.Class_base implements Func_book_from_book_xmlchapter {

    @Override
    public Func_book_from_book_xmlchapter vx_new(Object... vals) {
      Class_book_from_book_xmlchapter output = new Class_book_from_book_xmlchapter();
      return output;
    }

    @Override
    public Func_book_from_book_xmlchapter vx_copy(Object... vals) {
      Class_book_from_book_xmlchapter output = new Class_book_from_book_xmlchapter();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-book-xmlchapter", // name
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
    public Func_book_from_book_xmlchapter vx_empty() {return e_book_from_book_xmlchapter;}
    @Override
    public Func_book_from_book_xmlchapter vx_type() {return t_book_from_book_xmlchapter;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book book = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_book_from_book_xmlchapter(book, xml);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_book_xmlchapter(final Base.Type_book book, final Xml.Type_xml xml) {
      return Bookloader.f_book_from_book_xmlchapter(book, xml);
    }

  }

  public static final Func_book_from_book_xmlchapter e_book_from_book_xmlchapter = new Bookloader.Class_book_from_book_xmlchapter();
  public static final Func_book_from_book_xmlchapter t_book_from_book_xmlchapter = new Bookloader.Class_book_from_book_xmlchapter();

  public static Base.Type_book f_book_from_book_xmlchapter(final Base.Type_book book, final Xml.Type_xml xml) {
    Base.Type_book output = Base.e_book;
    output = Core.f_let(
      Base.t_book,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_chapter chapter = Bookloader.f_chapter_from_xml(xml);
        final Core.Type_string name = chapter.name();
        final Base.Type_chaptermap origmap = book.chaptermap();
        final Base.Type_chaptermap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              chapter
          )
        );
        return Core.f_copy(
          book,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":chaptermap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function book_from_book_xmlchild
   * Returns a modified book based on a given child xml.
   * @param  {book} book
   * @param  {xml} child
   * @return {book}
   * (func book<-book-xmlchild)
   */
  public static interface Func_book_from_book_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_book_from_book_xmlchild(final Base.Type_book book, final Xml.Type_xml child);
  }

  public static class Class_book_from_book_xmlchild extends Core.Class_base implements Func_book_from_book_xmlchild {

    @Override
    public Func_book_from_book_xmlchild vx_new(Object... vals) {
      Class_book_from_book_xmlchild output = new Class_book_from_book_xmlchild();
      return output;
    }

    @Override
    public Func_book_from_book_xmlchild vx_copy(Object... vals) {
      Class_book_from_book_xmlchild output = new Class_book_from_book_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-book-xmlchild", // name
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
    public Func_book_from_book_xmlchild vx_empty() {return e_book_from_book_xmlchild;}
    @Override
    public Func_book_from_book_xmlchild vx_type() {return t_book_from_book_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book book = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_book_from_book_xmlchild(book, child);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_book_xmlchild(final Base.Type_book book, final Xml.Type_xml child) {
      return Bookloader.f_book_from_book_xmlchild(book, child);
    }

  }

  public static final Func_book_from_book_xmlchild e_book_from_book_xmlchild = new Bookloader.Class_book_from_book_xmlchild();
  public static final Func_book_from_book_xmlchild t_book_from_book_xmlchild = new Bookloader.Class_book_from_book_xmlchild();

  public static Base.Type_book f_book_from_book_xmlchild(final Base.Type_book book, final Xml.Type_xml child) {
    Base.Type_book output = Base.e_book;
    output = Core.f_let(
      Base.t_book,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_book,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return book;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  book,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("chapter"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_book_from_book_xmlchapter(book, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  book,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_book,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function book_from_xml
   * Returns a book from a given top level xml.
   * @param  {xml} xml
   * @return {book}
   * (func book<-xml)
   */
  public static interface Func_book_from_xml extends Core.Func_any_from_any {
    public Base.Type_book vx_book_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_book_from_xml extends Core.Class_base implements Func_book_from_xml {

    @Override
    public Func_book_from_xml vx_new(Object... vals) {
      Class_book_from_xml output = new Class_book_from_xml();
      return output;
    }

    @Override
    public Func_book_from_xml vx_copy(Object... vals) {
      Class_book_from_xml output = new Class_book_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-xml", // name
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
    public Func_book_from_xml vx_empty() {return e_book_from_xml;}
    @Override
    public Func_book_from_xml vx_type() {return t_book_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_book_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_book_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_book_from_xml(xml);
    }

  }

  public static final Func_book_from_xml e_book_from_xml = new Bookloader.Class_book_from_xml();
  public static final Func_book_from_xml t_book_from_xml = new Bookloader.Class_book_from_xml();

  public static Base.Type_book f_book_from_xml(final Xml.Type_xml xml) {
    Base.Type_book output = Base.e_book;
    output = Bookloader.f_book_from_xmllist(
      xml.children()
    );
    return output;
  }

  /**
   * @function book_from_xmldoc
   * Returns a book from a given xml.
   * @param  {xml} xml
   * @return {book}
   * (func book<-xmldoc)
   */
  public static interface Func_book_from_xmldoc extends Core.Func_any_from_any {
    public Base.Type_book vx_book_from_xmldoc(final Xml.Type_xml xml);
  }

  public static class Class_book_from_xmldoc extends Core.Class_base implements Func_book_from_xmldoc {

    @Override
    public Func_book_from_xmldoc vx_new(Object... vals) {
      Class_book_from_xmldoc output = new Class_book_from_xmldoc();
      return output;
    }

    @Override
    public Func_book_from_xmldoc vx_copy(Object... vals) {
      Class_book_from_xmldoc output = new Class_book_from_xmldoc();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-xmldoc", // name
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
    public Func_book_from_xmldoc vx_empty() {return e_book_from_xmldoc;}
    @Override
    public Func_book_from_xmldoc vx_type() {return t_book_from_xmldoc;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_book_from_xmldoc(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_book_from_xmldoc(xml);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_xmldoc(final Xml.Type_xml xml) {
      return Bookloader.f_book_from_xmldoc(xml);
    }

  }

  public static final Func_book_from_xmldoc e_book_from_xmldoc = new Bookloader.Class_book_from_xmldoc();
  public static final Func_book_from_xmldoc t_book_from_xmldoc = new Bookloader.Class_book_from_xmldoc();

  public static Base.Type_book f_book_from_xmldoc(final Xml.Type_xml xml) {
    Base.Type_book output = Base.e_book;
    output = Core.f_let(
      Base.t_book,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Xml.Type_xmllist children = xml.children();
        final Base.Type_book book = Bookloader.f_book_from_book_stringmap(
          Core.f_empty(
            Base.t_book
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_book,
          children,
          book,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any book_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_book book_lmb = Core.f_any_from_any(Base.t_book, book_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_book_from_book_xmlchild(book_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function book_from_xmllist
   * Returns a book from a given xml.
   * @param  {xmllist} xmllist
   * @return {book}
   * (func book<-xmllist)
   */
  public static interface Func_book_from_xmllist extends Core.Func_any_from_any {
    public Base.Type_book vx_book_from_xmllist(final Xml.Type_xmllist xmllist);
  }

  public static class Class_book_from_xmllist extends Core.Class_base implements Func_book_from_xmllist {

    @Override
    public Func_book_from_xmllist vx_new(Object... vals) {
      Class_book_from_xmllist output = new Class_book_from_xmllist();
      return output;
    }

    @Override
    public Func_book_from_xmllist vx_copy(Object... vals) {
      Class_book_from_xmllist output = new Class_book_from_xmllist();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-xmllist", // name
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
    public Func_book_from_xmllist vx_empty() {return e_book_from_xmllist;}
    @Override
    public Func_book_from_xmllist vx_type() {return t_book_from_xmllist;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xmllist inputval = (Xml.Type_xmllist)value;
      Core.Type_any outputval = Bookloader.f_book_from_xmllist(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xmllist xmllist = Core.f_any_from_any(Xml.t_xmllist, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_book_from_xmllist(xmllist);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_xmllist(final Xml.Type_xmllist xmllist) {
      return Bookloader.f_book_from_xmllist(xmllist);
    }

  }

  public static final Func_book_from_xmllist e_book_from_xmllist = new Bookloader.Class_book_from_xmllist();
  public static final Func_book_from_xmllist t_book_from_xmllist = new Bookloader.Class_book_from_xmllist();

  public static Base.Type_book f_book_from_xmllist(final Xml.Type_xmllist xmllist) {
    Base.Type_book output = Base.e_book;
    output = Core.f_any_from_list_start_reduce(
      Base.t_book,
      xmllist,
      Core.f_empty(
        Base.t_book
      ),
      Core.t_any_from_reduce.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_any child_lmb_any) -> {
        Base.Type_book current_lmb = Core.f_any_from_any(Base.t_book, current_lmb_any);
        Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
        Core.Type_any output_1 = Bookloader.f_book_from_book_xml(current_lmb, child_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function boolean_write_from_book
   * Returns boolean after writing book as a file.
   * @param  {book} book
   * @return {boolean}
   * (func boolean-write<-book)
   */
  public static interface Func_boolean_write_from_book extends Core.Func_any_from_any_context {
    public Core.Type_boolean vx_boolean_write_from_book(final Core.Type_context context, final Base.Type_book book);
  }

  public static class Class_boolean_write_from_book extends Core.Class_base implements Func_boolean_write_from_book {

    @Override
    public Func_boolean_write_from_book vx_new(Object... vals) {
      Class_boolean_write_from_book output = new Class_boolean_write_from_book();
      return output;
    }

    @Override
    public Func_boolean_write_from_book vx_copy(Object... vals) {
      Class_boolean_write_from_book output = new Class_boolean_write_from_book();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "boolean-write<-book", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "boolean", // name
          "", // extends
          Core.e_typelist, // traits
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
    public Func_boolean_write_from_book vx_empty() {return e_boolean_write_from_book;}
    @Override
    public Func_boolean_write_from_book vx_type() {return t_boolean_write_from_book;}

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {return Core.e_any_from_any_context;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_book inputval = (Base.Type_book)value;
      Core.Type_any outputval = Bookloader.f_boolean_write_from_book(context, inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Base.Type_book book = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_boolean_write_from_book(context, book);
      return output;
    }

    @Override
    public Core.Type_boolean vx_boolean_write_from_book(final Core.Type_context context, final Base.Type_book book) {
      return Bookloader.f_boolean_write_from_book(context, book);
    }

  }

  public static final Func_boolean_write_from_book e_boolean_write_from_book = new Bookloader.Class_boolean_write_from_book();
  public static final Func_boolean_write_from_book t_boolean_write_from_book = new Bookloader.Class_boolean_write_from_book();

  public static Core.Type_boolean f_boolean_write_from_book(final Core.Type_context context, final Base.Type_book book) {
    Core.Type_boolean output = Core.e_boolean;
    output = Core.f_let(
      Core.t_boolean,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string text = Bookloader.f_string_vxlisp_from_book(book);
        final File.Type_file file = Bookloader.f_file_write_from_book(book);
        return File.f_boolean_write_from_file_string(context, file, text);
      })
    );
    return output;
  }

  /**
   * @function boolean_write_from_booknames
   * Returns boolean after writing book as a file.
   * @param  {stringlist} booknames
   * @return {boolean}
   * (func boolean-write<-booknames)
   */
  public static interface Func_boolean_write_from_booknames extends Core.Func_any_from_any_context {
    public Core.Type_boolean vx_boolean_write_from_booknames(final Core.Type_context context, final Core.Type_stringlist booknames);
  }

  public static class Class_boolean_write_from_booknames extends Core.Class_base implements Func_boolean_write_from_booknames {

    @Override
    public Func_boolean_write_from_booknames vx_new(Object... vals) {
      Class_boolean_write_from_booknames output = new Class_boolean_write_from_booknames();
      return output;
    }

    @Override
    public Func_boolean_write_from_booknames vx_copy(Object... vals) {
      Class_boolean_write_from_booknames output = new Class_boolean_write_from_booknames();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "boolean-write<-booknames", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "boolean", // name
          "", // extends
          Core.e_typelist, // traits
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
    public Func_boolean_write_from_booknames vx_empty() {return e_boolean_write_from_booknames;}
    @Override
    public Func_boolean_write_from_booknames vx_type() {return t_boolean_write_from_booknames;}

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {return Core.e_any_from_any_context;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_stringlist inputval = (Core.Type_stringlist)value;
      Core.Type_any outputval = Bookloader.f_boolean_write_from_booknames(context, inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringlist booknames = Core.f_any_from_any(Core.t_stringlist, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_boolean_write_from_booknames(context, booknames);
      return output;
    }

    @Override
    public Core.Type_boolean vx_boolean_write_from_booknames(final Core.Type_context context, final Core.Type_stringlist booknames) {
      return Bookloader.f_boolean_write_from_booknames(context, booknames);
    }

  }

  public static final Func_boolean_write_from_booknames e_boolean_write_from_booknames = new Bookloader.Class_boolean_write_from_booknames();
  public static final Func_boolean_write_from_booknames t_boolean_write_from_booknames = new Bookloader.Class_boolean_write_from_booknames();

  public static Core.Type_boolean f_boolean_write_from_booknames(final Core.Type_context context, final Core.Type_stringlist booknames) {
    Core.Type_boolean output = Core.e_boolean;
    output = Core.f_let(
      Core.t_boolean,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_booleanlist bools = Core.f_list_from_list(
          Core.t_booleanlist,
          booknames,
          Core.t_any_from_any.vx_fn_new((bookname_any) -> {
            Core.Type_string bookname = Core.f_any_from_any(Core.t_string, bookname_any);
            return 
                Core.f_let(
                  Core.t_boolean,
                  Core.t_any_from_func.vx_fn_new(() -> {
                    final Base.Type_book book = Bookloader.f_book_read_from_bookname(context, bookname);
                    return Bookloader.f_boolean_write_from_book(context, book);
                  })
                );
          })
        );
        return Core.f_and_1(bools);
      })
    );
    return output;
  }

  /**
   * @function chapter_from_chapter_key_value
   * Returns a modified chapter from a key value.
   * @param  {chapter} current
   * @param  {string} key
   * @param  {string} value
   * @return {chapter}
   * (func chapter<-chapter-key-value)
   */
  public static interface Func_chapter_from_chapter_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_from_chapter_key_value(final Base.Type_chapter current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_chapter_from_chapter_key_value extends Core.Class_base implements Func_chapter_from_chapter_key_value {

    @Override
    public Func_chapter_from_chapter_key_value vx_new(Object... vals) {
      Class_chapter_from_chapter_key_value output = new Class_chapter_from_chapter_key_value();
      return output;
    }

    @Override
    public Func_chapter_from_chapter_key_value vx_copy(Object... vals) {
      Class_chapter_from_chapter_key_value output = new Class_chapter_from_chapter_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "chapter<-chapter-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
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
    public Func_chapter_from_chapter_key_value vx_empty() {return e_chapter_from_chapter_key_value;}
    @Override
    public Func_chapter_from_chapter_key_value vx_type() {return t_chapter_from_chapter_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_chapter current = Core.f_any_from_any(Base.t_chapter, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_chapter_from_chapter_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_from_chapter_key_value(final Base.Type_chapter current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_chapter_from_chapter_key_value(current, key, value);
    }

  }

  public static final Func_chapter_from_chapter_key_value e_chapter_from_chapter_key_value = new Bookloader.Class_chapter_from_chapter_key_value();
  public static final Func_chapter_from_chapter_key_value t_chapter_from_chapter_key_value = new Bookloader.Class_chapter_from_chapter_key_value();

  public static Base.Type_chapter f_chapter_from_chapter_key_value(final Base.Type_chapter current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_switch(
      Base.t_chapter,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_chapter,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function chapter_from_chapter_stringmap
   * Returns a new book from a propmap.
   * @param  {chapter} chapter
   * @param  {stringmap} propmap
   * @return {chapter}
   * (func chapter<-chapter-stringmap)
   */
  public static interface Func_chapter_from_chapter_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_from_chapter_stringmap(final Base.Type_chapter chapter, final Core.Type_stringmap propmap);
  }

  public static class Class_chapter_from_chapter_stringmap extends Core.Class_base implements Func_chapter_from_chapter_stringmap {

    @Override
    public Func_chapter_from_chapter_stringmap vx_new(Object... vals) {
      Class_chapter_from_chapter_stringmap output = new Class_chapter_from_chapter_stringmap();
      return output;
    }

    @Override
    public Func_chapter_from_chapter_stringmap vx_copy(Object... vals) {
      Class_chapter_from_chapter_stringmap output = new Class_chapter_from_chapter_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "chapter<-chapter-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
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
    public Func_chapter_from_chapter_stringmap vx_empty() {return e_chapter_from_chapter_stringmap;}
    @Override
    public Func_chapter_from_chapter_stringmap vx_type() {return t_chapter_from_chapter_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_chapter chapter = Core.f_any_from_any(Base.t_chapter, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_chapter_from_chapter_stringmap(chapter, propmap);
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_from_chapter_stringmap(final Base.Type_chapter chapter, final Core.Type_stringmap propmap) {
      return Bookloader.f_chapter_from_chapter_stringmap(chapter, propmap);
    }

  }

  public static final Func_chapter_from_chapter_stringmap e_chapter_from_chapter_stringmap = new Bookloader.Class_chapter_from_chapter_stringmap();
  public static final Func_chapter_from_chapter_stringmap t_chapter_from_chapter_stringmap = new Bookloader.Class_chapter_from_chapter_stringmap();

  public static Base.Type_chapter f_chapter_from_chapter_stringmap(final Base.Type_chapter chapter, final Core.Type_stringmap propmap) {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_any_from_map_start_reduce(
      Base.t_chapter,
      propmap,
      chapter,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_chapter current_lmb = Core.f_any_from_any(Base.t_chapter, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_chapter_from_chapter_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function chapter_from_chapter_xmlchild
   * Returns a modified chapter based on a given child Xml.
   * @param  {chapter} chapter
   * @param  {xml} child
   * @return {chapter}
   * (func chapter<-chapter-xmlchild)
   */
  public static interface Func_chapter_from_chapter_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_from_chapter_xmlchild(final Base.Type_chapter chapter, final Xml.Type_xml child);
  }

  public static class Class_chapter_from_chapter_xmlchild extends Core.Class_base implements Func_chapter_from_chapter_xmlchild {

    @Override
    public Func_chapter_from_chapter_xmlchild vx_new(Object... vals) {
      Class_chapter_from_chapter_xmlchild output = new Class_chapter_from_chapter_xmlchild();
      return output;
    }

    @Override
    public Func_chapter_from_chapter_xmlchild vx_copy(Object... vals) {
      Class_chapter_from_chapter_xmlchild output = new Class_chapter_from_chapter_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "chapter<-chapter-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
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
    public Func_chapter_from_chapter_xmlchild vx_empty() {return e_chapter_from_chapter_xmlchild;}
    @Override
    public Func_chapter_from_chapter_xmlchild vx_type() {return t_chapter_from_chapter_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_chapter chapter = Core.f_any_from_any(Base.t_chapter, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_chapter_from_chapter_xmlchild(chapter, child);
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_from_chapter_xmlchild(final Base.Type_chapter chapter, final Xml.Type_xml child) {
      return Bookloader.f_chapter_from_chapter_xmlchild(chapter, child);
    }

  }

  public static final Func_chapter_from_chapter_xmlchild e_chapter_from_chapter_xmlchild = new Bookloader.Class_chapter_from_chapter_xmlchild();
  public static final Func_chapter_from_chapter_xmlchild t_chapter_from_chapter_xmlchild = new Bookloader.Class_chapter_from_chapter_xmlchild();

  public static Base.Type_chapter f_chapter_from_chapter_xmlchild(final Base.Type_chapter chapter, final Xml.Type_xml child) {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_let(
      Base.t_chapter,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_chapter,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return chapter;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  chapter,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("section"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_chapter_from_chapter_xmlsection(chapter, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  chapter,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_chapter,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function chapter_from_chapter_xmlsection
   * Return a chapter with new section added to sectionmap
   * @param  {chapter} chapter
   * @param  {xml} xmlsection
   * @return {chapter}
   * (func chapter<-chapter-xmlsection)
   */
  public static interface Func_chapter_from_chapter_xmlsection extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_chapter vx_chapter_from_chapter_xmlsection(final Base.Type_chapter chapter, final Xml.Type_xml xmlsection);
  }

  public static class Class_chapter_from_chapter_xmlsection extends Core.Class_base implements Func_chapter_from_chapter_xmlsection {

    @Override
    public Func_chapter_from_chapter_xmlsection vx_new(Object... vals) {
      Class_chapter_from_chapter_xmlsection output = new Class_chapter_from_chapter_xmlsection();
      return output;
    }

    @Override
    public Func_chapter_from_chapter_xmlsection vx_copy(Object... vals) {
      Class_chapter_from_chapter_xmlsection output = new Class_chapter_from_chapter_xmlsection();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "chapter<-chapter-xmlsection", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
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
    public Func_chapter_from_chapter_xmlsection vx_empty() {return e_chapter_from_chapter_xmlsection;}
    @Override
    public Func_chapter_from_chapter_xmlsection vx_type() {return t_chapter_from_chapter_xmlsection;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_chapter chapter = Core.f_any_from_any(Base.t_chapter, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlsection = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_chapter_from_chapter_xmlsection(chapter, xmlsection);
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_from_chapter_xmlsection(final Base.Type_chapter chapter, final Xml.Type_xml xmlsection) {
      return Bookloader.f_chapter_from_chapter_xmlsection(chapter, xmlsection);
    }

  }

  public static final Func_chapter_from_chapter_xmlsection e_chapter_from_chapter_xmlsection = new Bookloader.Class_chapter_from_chapter_xmlsection();
  public static final Func_chapter_from_chapter_xmlsection t_chapter_from_chapter_xmlsection = new Bookloader.Class_chapter_from_chapter_xmlsection();

  public static Base.Type_chapter f_chapter_from_chapter_xmlsection(final Base.Type_chapter chapter, final Xml.Type_xml xmlsection) {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_let(
      Base.t_chapter,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_section section = Bookloader.f_section_from_xml(xmlsection);
        final Core.Type_string name = section.name();
        final Base.Type_sectionmap origmap = chapter.sectionmap();
        final Base.Type_sectionmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              section
          )
        );
        return Core.f_copy(
          chapter,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":sectionmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function chapter_from_xml
   * Returns a chapter from a given Xml.
   * @param  {xml} xml
   * @return {chapter}
   * (func chapter<-xml)
   */
  public static interface Func_chapter_from_xml extends Core.Func_any_from_any {
    public Base.Type_chapter vx_chapter_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_chapter_from_xml extends Core.Class_base implements Func_chapter_from_xml {

    @Override
    public Func_chapter_from_xml vx_new(Object... vals) {
      Class_chapter_from_xml output = new Class_chapter_from_xml();
      return output;
    }

    @Override
    public Func_chapter_from_xml vx_copy(Object... vals) {
      Class_chapter_from_xml output = new Class_chapter_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "chapter<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "chapter", // name
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
    public Func_chapter_from_xml vx_empty() {return e_chapter_from_xml;}
    @Override
    public Func_chapter_from_xml vx_type() {return t_chapter_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_chapter_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_chapter_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_chapter vx_chapter_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_chapter_from_xml(xml);
    }

  }

  public static final Func_chapter_from_xml e_chapter_from_xml = new Bookloader.Class_chapter_from_xml();
  public static final Func_chapter_from_xml t_chapter_from_xml = new Bookloader.Class_chapter_from_xml();

  public static Base.Type_chapter f_chapter_from_xml(final Xml.Type_xml xml) {
    Base.Type_chapter output = Base.e_chapter;
    output = Core.f_let(
      Base.t_chapter,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_chapter chap = Bookloader.f_chapter_from_chapter_stringmap(
          Core.f_empty(
            Base.t_chapter
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_chapter,
          xml.children(),
          chap,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any chapter_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_chapter chapter_lmb = Core.f_any_from_any(Base.t_chapter, chapter_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_chapter_from_chapter_xmlchild(chapter_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function damage_from_damage_key_value
   * Returns a modified damage from a key value.
   * @param  {damage} current
   * @param  {string} key
   * @param  {string} value
   * @return {damage}
   * (func damage<-damage-key-value)
   */
  public static interface Func_damage_from_damage_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_damage vx_damage_from_damage_key_value(final Base.Type_damage current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_damage_from_damage_key_value extends Core.Class_base implements Func_damage_from_damage_key_value {

    @Override
    public Func_damage_from_damage_key_value vx_new(Object... vals) {
      Class_damage_from_damage_key_value output = new Class_damage_from_damage_key_value();
      return output;
    }

    @Override
    public Func_damage_from_damage_key_value vx_copy(Object... vals) {
      Class_damage_from_damage_key_value output = new Class_damage_from_damage_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "damage<-damage-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "damage", // name
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
    public Func_damage_from_damage_key_value vx_empty() {return e_damage_from_damage_key_value;}
    @Override
    public Func_damage_from_damage_key_value vx_type() {return t_damage_from_damage_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_damage current = Core.f_any_from_any(Base.t_damage, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_damage_from_damage_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_damage vx_damage_from_damage_key_value(final Base.Type_damage current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_damage_from_damage_key_value(current, key, value);
    }

  }

  public static final Func_damage_from_damage_key_value e_damage_from_damage_key_value = new Bookloader.Class_damage_from_damage_key_value();
  public static final Func_damage_from_damage_key_value t_damage_from_damage_key_value = new Bookloader.Class_damage_from_damage_key_value();

  public static Base.Type_damage f_damage_from_damage_key_value(final Base.Type_damage current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_damage output = Base.e_damage;
    output = Core.f_switch(
      Base.t_damage,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("classification")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_damage,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function damage_from_damage_stringmap
   * Returns a damage from a propmap.
   * @param  {damage} damage
   * @param  {stringmap} propmap
   * @return {damage}
   * (func damage<-damage-stringmap)
   */
  public static interface Func_damage_from_damage_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_damage vx_damage_from_damage_stringmap(final Base.Type_damage damage, final Core.Type_stringmap propmap);
  }

  public static class Class_damage_from_damage_stringmap extends Core.Class_base implements Func_damage_from_damage_stringmap {

    @Override
    public Func_damage_from_damage_stringmap vx_new(Object... vals) {
      Class_damage_from_damage_stringmap output = new Class_damage_from_damage_stringmap();
      return output;
    }

    @Override
    public Func_damage_from_damage_stringmap vx_copy(Object... vals) {
      Class_damage_from_damage_stringmap output = new Class_damage_from_damage_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "damage<-damage-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "damage", // name
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
    public Func_damage_from_damage_stringmap vx_empty() {return e_damage_from_damage_stringmap;}
    @Override
    public Func_damage_from_damage_stringmap vx_type() {return t_damage_from_damage_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_damage damage = Core.f_any_from_any(Base.t_damage, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_damage_from_damage_stringmap(damage, propmap);
      return output;
    }

    @Override
    public Base.Type_damage vx_damage_from_damage_stringmap(final Base.Type_damage damage, final Core.Type_stringmap propmap) {
      return Bookloader.f_damage_from_damage_stringmap(damage, propmap);
    }

  }

  public static final Func_damage_from_damage_stringmap e_damage_from_damage_stringmap = new Bookloader.Class_damage_from_damage_stringmap();
  public static final Func_damage_from_damage_stringmap t_damage_from_damage_stringmap = new Bookloader.Class_damage_from_damage_stringmap();

  public static Base.Type_damage f_damage_from_damage_stringmap(final Base.Type_damage damage, final Core.Type_stringmap propmap) {
    Base.Type_damage output = Base.e_damage;
    output = Core.f_any_from_map_start_reduce(
      Base.t_damage,
      propmap,
      damage,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_damage current_lmb = Core.f_any_from_any(Base.t_damage, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_damage_from_damage_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function damage_from_damage_xmlchild
   * Returns a modified damage based on a given child Xml.
   * @param  {damage} damage
   * @param  {xml} child
   * @return {damage}
   * (func damage<-damage-xmlchild)
   */
  public static interface Func_damage_from_damage_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_damage vx_damage_from_damage_xmlchild(final Base.Type_damage damage, final Xml.Type_xml child);
  }

  public static class Class_damage_from_damage_xmlchild extends Core.Class_base implements Func_damage_from_damage_xmlchild {

    @Override
    public Func_damage_from_damage_xmlchild vx_new(Object... vals) {
      Class_damage_from_damage_xmlchild output = new Class_damage_from_damage_xmlchild();
      return output;
    }

    @Override
    public Func_damage_from_damage_xmlchild vx_copy(Object... vals) {
      Class_damage_from_damage_xmlchild output = new Class_damage_from_damage_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "damage<-damage-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "damage", // name
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
    public Func_damage_from_damage_xmlchild vx_empty() {return e_damage_from_damage_xmlchild;}
    @Override
    public Func_damage_from_damage_xmlchild vx_type() {return t_damage_from_damage_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_damage damage = Core.f_any_from_any(Base.t_damage, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_damage_from_damage_xmlchild(damage, child);
      return output;
    }

    @Override
    public Base.Type_damage vx_damage_from_damage_xmlchild(final Base.Type_damage damage, final Xml.Type_xml child) {
      return Bookloader.f_damage_from_damage_xmlchild(damage, child);
    }

  }

  public static final Func_damage_from_damage_xmlchild e_damage_from_damage_xmlchild = new Bookloader.Class_damage_from_damage_xmlchild();
  public static final Func_damage_from_damage_xmlchild t_damage_from_damage_xmlchild = new Bookloader.Class_damage_from_damage_xmlchild();

  public static Base.Type_damage f_damage_from_damage_xmlchild(final Base.Type_damage damage, final Xml.Type_xml child) {
    Base.Type_damage output = Base.e_damage;
    output = Core.f_let(
      Base.t_damage,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_damage,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return damage;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  damage,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  damage,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_damage,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function damage_from_xml
   * Returns a damage from a given xml.
   * @param  {xml} xml
   * @return {damage}
   * (func damage<-xml)
   */
  public static interface Func_damage_from_xml extends Core.Func_any_from_any {
    public Base.Type_damage vx_damage_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_damage_from_xml extends Core.Class_base implements Func_damage_from_xml {

    @Override
    public Func_damage_from_xml vx_new(Object... vals) {
      Class_damage_from_xml output = new Class_damage_from_xml();
      return output;
    }

    @Override
    public Func_damage_from_xml vx_copy(Object... vals) {
      Class_damage_from_xml output = new Class_damage_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "damage<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "damage", // name
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
    public Func_damage_from_xml vx_empty() {return e_damage_from_xml;}
    @Override
    public Func_damage_from_xml vx_type() {return t_damage_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_damage_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_damage_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_damage vx_damage_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_damage_from_xml(xml);
    }

  }

  public static final Func_damage_from_xml e_damage_from_xml = new Bookloader.Class_damage_from_xml();
  public static final Func_damage_from_xml t_damage_from_xml = new Bookloader.Class_damage_from_xml();

  public static Base.Type_damage f_damage_from_xml(final Xml.Type_xml xml) {
    Base.Type_damage output = Base.e_damage;
    output = Core.f_let(
      Base.t_damage,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_damage damage = Bookloader.f_damage_from_damage_stringmap(
          Core.f_empty(
            Base.t_damage
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_damage,
          xml.children(),
          damage,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any damage_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_damage damage_lmb = Core.f_any_from_any(Base.t_damage, damage_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_damage_from_damage_xmlchild(damage_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function file_read_from_bookname
   * Returns a file from a bookname.
   * @param  {string} bookname
   * @return {file}
   * (func file-read<-bookname)
   */
  public static interface Func_file_read_from_bookname extends Core.Func_any_from_any {
    public File.Type_file vx_file_read_from_bookname(final Core.Type_string bookname);
  }

  public static class Class_file_read_from_bookname extends Core.Class_base implements Func_file_read_from_bookname {

    @Override
    public Func_file_read_from_bookname vx_new(Object... vals) {
      Class_file_read_from_bookname output = new Class_file_read_from_bookname();
      return output;
    }

    @Override
    public Func_file_read_from_bookname vx_copy(Object... vals) {
      Class_file_read_from_bookname output = new Class_file_read_from_bookname();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "file-read<-bookname", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/data/file", // pkgname
          "file", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_file_read_from_bookname vx_empty() {return e_file_read_from_bookname;}
    @Override
    public Func_file_read_from_bookname vx_type() {return t_file_read_from_bookname;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Bookloader.f_file_read_from_bookname(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string bookname = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_file_read_from_bookname(bookname);
      return output;
    }

    @Override
    public File.Type_file vx_file_read_from_bookname(final Core.Type_string bookname) {
      return Bookloader.f_file_read_from_bookname(bookname);
    }

  }

  public static final Func_file_read_from_bookname e_file_read_from_bookname = new Bookloader.Class_file_read_from_bookname();
  public static final Func_file_read_from_bookname t_file_read_from_bookname = new Bookloader.Class_file_read_from_bookname();

  public static File.Type_file f_file_read_from_bookname(final Core.Type_string bookname) {
    File.Type_file output = File.e_file;
    output = Core.f_new(
      File.t_file,
      Core.t_anylist.vx_new(
        Core.vx_new_string(":path"),
        Core.vx_new_string("resources/books"),
        Core.vx_new_string(":name"),
        Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            bookname,
            Core.vx_new_string(".xml")
          )
        )
      )
    );
    return output;
  }

  /**
   * @function file_write_from_book
   * Returns a file with string from book
   * @param  {book} book
   * @return {file}
   * (func file-write<-book)
   */
  public static interface Func_file_write_from_book extends Core.Func_any_from_any {
    public File.Type_file vx_file_write_from_book(final Base.Type_book book);
  }

  public static class Class_file_write_from_book extends Core.Class_base implements Func_file_write_from_book {

    @Override
    public Func_file_write_from_book vx_new(Object... vals) {
      Class_file_write_from_book output = new Class_file_write_from_book();
      return output;
    }

    @Override
    public Func_file_write_from_book vx_copy(Object... vals) {
      Class_file_write_from_book output = new Class_file_write_from_book();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "file-write<-book", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/data/file", // pkgname
          "file", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_file_write_from_book vx_empty() {return e_file_write_from_book;}
    @Override
    public Func_file_write_from_book vx_type() {return t_file_write_from_book;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_book inputval = (Base.Type_book)value;
      Core.Type_any outputval = Bookloader.f_file_write_from_book(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book book = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_file_write_from_book(book);
      return output;
    }

    @Override
    public File.Type_file vx_file_write_from_book(final Base.Type_book book) {
      return Bookloader.f_file_write_from_book(book);
    }

  }

  public static final Func_file_write_from_book e_file_write_from_book = new Bookloader.Class_file_write_from_book();
  public static final Func_file_write_from_book t_file_write_from_book = new Bookloader.Class_file_write_from_book();

  public static File.Type_file f_file_write_from_book(final Base.Type_book book) {
    File.Type_file output = File.e_file;
    output = Core.f_let(
      File.t_file,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string name = book.name();
        final Core.Type_string bookname = Bookloader.f_string_writename_from_string(name);
        return Core.f_new(
          File.t_file,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":path"),
            Core.vx_new_string("resources/books"),
            Core.vx_new_string(":name"),
            Core.f_new(
              Core.t_string,
              Core.t_anylist.vx_new(
                bookname,
                Core.vx_new_string(".vxlisp")
              )
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function item_from_item_key_value
   * Returns a modified item from a key value.
   * @param  {item} current
   * @param  {string} key
   * @param  {string} value
   * @return {item}
   * (func item<-item-key-value)
   */
  public static interface Func_item_from_item_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_item vx_item_from_item_key_value(final Base.Type_item current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_item_from_item_key_value extends Core.Class_base implements Func_item_from_item_key_value {

    @Override
    public Func_item_from_item_key_value vx_new(Object... vals) {
      Class_item_from_item_key_value output = new Class_item_from_item_key_value();
      return output;
    }

    @Override
    public Func_item_from_item_key_value vx_copy(Object... vals) {
      Class_item_from_item_key_value output = new Class_item_from_item_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "item<-item-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "item", // name
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
    public Func_item_from_item_key_value vx_empty() {return e_item_from_item_key_value;}
    @Override
    public Func_item_from_item_key_value vx_type() {return t_item_from_item_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_item current = Core.f_any_from_any(Base.t_item, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_item_from_item_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_item vx_item_from_item_key_value(final Base.Type_item current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_item_from_item_key_value(current, key, value);
    }

  }

  public static final Func_item_from_item_key_value e_item_from_item_key_value = new Bookloader.Class_item_from_item_key_value();
  public static final Func_item_from_item_key_value t_item_from_item_key_value = new Bookloader.Class_item_from_item_key_value();

  public static Base.Type_item f_item_from_item_key_value(final Base.Type_item current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_item output = Base.e_item;
    output = Core.f_switch(
      Base.t_item,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("classification"),
              Core.vx_new_string("crew"),
              Core.vx_new_string("energy"),
              Core.vx_new_string("explosive"),
              Core.vx_new_string("height"),
              Core.vx_new_string("length"),
              Core.vx_new_string("mass"),
              Core.vx_new_string("modifiers"),
              Core.vx_new_string("muzzlevelocity"),
              Core.vx_new_string("range"),
              Core.vx_new_string("rof"),
              Core.vx_new_string("rounds"),
              Core.vx_new_string("speedair"),
              Core.vx_new_string("speedland"),
              Core.vx_new_string("speedspace"),
              Core.vx_new_string("speedwater"),
              Core.vx_new_string("width")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_item,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function item_from_item_stringmap
   * Returns a new item from a propmap.
   * @param  {item} item
   * @param  {stringmap} propmap
   * @return {item}
   * (func item<-item-stringmap)
   */
  public static interface Func_item_from_item_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_item vx_item_from_item_stringmap(final Base.Type_item item, final Core.Type_stringmap propmap);
  }

  public static class Class_item_from_item_stringmap extends Core.Class_base implements Func_item_from_item_stringmap {

    @Override
    public Func_item_from_item_stringmap vx_new(Object... vals) {
      Class_item_from_item_stringmap output = new Class_item_from_item_stringmap();
      return output;
    }

    @Override
    public Func_item_from_item_stringmap vx_copy(Object... vals) {
      Class_item_from_item_stringmap output = new Class_item_from_item_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "item<-item-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "item", // name
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
    public Func_item_from_item_stringmap vx_empty() {return e_item_from_item_stringmap;}
    @Override
    public Func_item_from_item_stringmap vx_type() {return t_item_from_item_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_item item = Core.f_any_from_any(Base.t_item, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_item_from_item_stringmap(item, propmap);
      return output;
    }

    @Override
    public Base.Type_item vx_item_from_item_stringmap(final Base.Type_item item, final Core.Type_stringmap propmap) {
      return Bookloader.f_item_from_item_stringmap(item, propmap);
    }

  }

  public static final Func_item_from_item_stringmap e_item_from_item_stringmap = new Bookloader.Class_item_from_item_stringmap();
  public static final Func_item_from_item_stringmap t_item_from_item_stringmap = new Bookloader.Class_item_from_item_stringmap();

  public static Base.Type_item f_item_from_item_stringmap(final Base.Type_item item, final Core.Type_stringmap propmap) {
    Base.Type_item output = Base.e_item;
    output = Core.f_any_from_map_start_reduce(
      Base.t_item,
      propmap,
      item,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_item current_lmb = Core.f_any_from_any(Base.t_item, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_item_from_item_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function item_from_item_xmlchild
   * Returns a modified item based on a given child xml.
   * @param  {item} item
   * @param  {xml} child
   * @return {item}
   * (func item<-item-xmlchild)
   */
  public static interface Func_item_from_item_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_item vx_item_from_item_xmlchild(final Base.Type_item item, final Xml.Type_xml child);
  }

  public static class Class_item_from_item_xmlchild extends Core.Class_base implements Func_item_from_item_xmlchild {

    @Override
    public Func_item_from_item_xmlchild vx_new(Object... vals) {
      Class_item_from_item_xmlchild output = new Class_item_from_item_xmlchild();
      return output;
    }

    @Override
    public Func_item_from_item_xmlchild vx_copy(Object... vals) {
      Class_item_from_item_xmlchild output = new Class_item_from_item_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "item<-item-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "item", // name
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
    public Func_item_from_item_xmlchild vx_empty() {return e_item_from_item_xmlchild;}
    @Override
    public Func_item_from_item_xmlchild vx_type() {return t_item_from_item_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_item item = Core.f_any_from_any(Base.t_item, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_item_from_item_xmlchild(item, child);
      return output;
    }

    @Override
    public Base.Type_item vx_item_from_item_xmlchild(final Base.Type_item item, final Xml.Type_xml child) {
      return Bookloader.f_item_from_item_xmlchild(item, child);
    }

  }

  public static final Func_item_from_item_xmlchild e_item_from_item_xmlchild = new Bookloader.Class_item_from_item_xmlchild();
  public static final Func_item_from_item_xmlchild t_item_from_item_xmlchild = new Bookloader.Class_item_from_item_xmlchild();

  public static Base.Type_item f_item_from_item_xmlchild(final Base.Type_item item, final Xml.Type_xml child) {
    Base.Type_item output = Base.e_item;
    output = Core.f_let(
      Base.t_item,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_item,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return item;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  item,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  item,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_item,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function item_from_xml
   * Returns a item from a given xml.
   * @param  {xml} xml
   * @return {item}
   * (func item<-xml)
   */
  public static interface Func_item_from_xml extends Core.Func_any_from_any {
    public Base.Type_item vx_item_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_item_from_xml extends Core.Class_base implements Func_item_from_xml {

    @Override
    public Func_item_from_xml vx_new(Object... vals) {
      Class_item_from_xml output = new Class_item_from_xml();
      return output;
    }

    @Override
    public Func_item_from_xml vx_copy(Object... vals) {
      Class_item_from_xml output = new Class_item_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "item<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "item", // name
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
    public Func_item_from_xml vx_empty() {return e_item_from_xml;}
    @Override
    public Func_item_from_xml vx_type() {return t_item_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_item_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_item_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_item vx_item_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_item_from_xml(xml);
    }

  }

  public static final Func_item_from_xml e_item_from_xml = new Bookloader.Class_item_from_xml();
  public static final Func_item_from_xml t_item_from_xml = new Bookloader.Class_item_from_xml();

  public static Base.Type_item f_item_from_xml(final Xml.Type_xml xml) {
    Base.Type_item output = Base.e_item;
    output = Core.f_let(
      Base.t_item,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_item item = Bookloader.f_item_from_item_stringmap(
          Core.f_empty(
            Base.t_item
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_item,
          xml.children(),
          item,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any item_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_item item_lmb = Core.f_any_from_any(Base.t_item, item_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_item_from_item_xmlchild(item_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function location_from_location_key_value
   * Returns a modified location from a key value.
   * @param  {location} current
   * @param  {string} key
   * @param  {string} value
   * @return {location}
   * (func location<-location-key-value)
   */
  public static interface Func_location_from_location_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_location vx_location_from_location_key_value(final Base.Type_location current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_location_from_location_key_value extends Core.Class_base implements Func_location_from_location_key_value {

    @Override
    public Func_location_from_location_key_value vx_new(Object... vals) {
      Class_location_from_location_key_value output = new Class_location_from_location_key_value();
      return output;
    }

    @Override
    public Func_location_from_location_key_value vx_copy(Object... vals) {
      Class_location_from_location_key_value output = new Class_location_from_location_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "location<-location-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "location", // name
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
    public Func_location_from_location_key_value vx_empty() {return e_location_from_location_key_value;}
    @Override
    public Func_location_from_location_key_value vx_type() {return t_location_from_location_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_location current = Core.f_any_from_any(Base.t_location, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_location_from_location_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_location vx_location_from_location_key_value(final Base.Type_location current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_location_from_location_key_value(current, key, value);
    }

  }

  public static final Func_location_from_location_key_value e_location_from_location_key_value = new Bookloader.Class_location_from_location_key_value();
  public static final Func_location_from_location_key_value t_location_from_location_key_value = new Bookloader.Class_location_from_location_key_value();

  public static Base.Type_location f_location_from_location_key_value(final Base.Type_location current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_location output = Base.e_location;
    output = Core.f_switch(
      Base.t_location,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_location,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function location_from_location_stringmap
   * Returns a location from a propmap.
   * @param  {location} location
   * @param  {stringmap} propmap
   * @return {location}
   * (func location<-location-stringmap)
   */
  public static interface Func_location_from_location_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_location vx_location_from_location_stringmap(final Base.Type_location location, final Core.Type_stringmap propmap);
  }

  public static class Class_location_from_location_stringmap extends Core.Class_base implements Func_location_from_location_stringmap {

    @Override
    public Func_location_from_location_stringmap vx_new(Object... vals) {
      Class_location_from_location_stringmap output = new Class_location_from_location_stringmap();
      return output;
    }

    @Override
    public Func_location_from_location_stringmap vx_copy(Object... vals) {
      Class_location_from_location_stringmap output = new Class_location_from_location_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "location<-location-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "location", // name
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
    public Func_location_from_location_stringmap vx_empty() {return e_location_from_location_stringmap;}
    @Override
    public Func_location_from_location_stringmap vx_type() {return t_location_from_location_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_location location = Core.f_any_from_any(Base.t_location, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_location_from_location_stringmap(location, propmap);
      return output;
    }

    @Override
    public Base.Type_location vx_location_from_location_stringmap(final Base.Type_location location, final Core.Type_stringmap propmap) {
      return Bookloader.f_location_from_location_stringmap(location, propmap);
    }

  }

  public static final Func_location_from_location_stringmap e_location_from_location_stringmap = new Bookloader.Class_location_from_location_stringmap();
  public static final Func_location_from_location_stringmap t_location_from_location_stringmap = new Bookloader.Class_location_from_location_stringmap();

  public static Base.Type_location f_location_from_location_stringmap(final Base.Type_location location, final Core.Type_stringmap propmap) {
    Base.Type_location output = Base.e_location;
    output = Core.f_any_from_map_start_reduce(
      Base.t_location,
      propmap,
      location,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_location current_lmb = Core.f_any_from_any(Base.t_location, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_location_from_location_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function location_from_location_xmlchild
   * Returns a modified location based on a given child Xml.
   * @param  {location} location
   * @param  {xml} child
   * @return {location}
   * (func location<-location-xmlchild)
   */
  public static interface Func_location_from_location_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_location vx_location_from_location_xmlchild(final Base.Type_location location, final Xml.Type_xml child);
  }

  public static class Class_location_from_location_xmlchild extends Core.Class_base implements Func_location_from_location_xmlchild {

    @Override
    public Func_location_from_location_xmlchild vx_new(Object... vals) {
      Class_location_from_location_xmlchild output = new Class_location_from_location_xmlchild();
      return output;
    }

    @Override
    public Func_location_from_location_xmlchild vx_copy(Object... vals) {
      Class_location_from_location_xmlchild output = new Class_location_from_location_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "location<-location-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "location", // name
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
    public Func_location_from_location_xmlchild vx_empty() {return e_location_from_location_xmlchild;}
    @Override
    public Func_location_from_location_xmlchild vx_type() {return t_location_from_location_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_location location = Core.f_any_from_any(Base.t_location, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_location_from_location_xmlchild(location, child);
      return output;
    }

    @Override
    public Base.Type_location vx_location_from_location_xmlchild(final Base.Type_location location, final Xml.Type_xml child) {
      return Bookloader.f_location_from_location_xmlchild(location, child);
    }

  }

  public static final Func_location_from_location_xmlchild e_location_from_location_xmlchild = new Bookloader.Class_location_from_location_xmlchild();
  public static final Func_location_from_location_xmlchild t_location_from_location_xmlchild = new Bookloader.Class_location_from_location_xmlchild();

  public static Base.Type_location f_location_from_location_xmlchild(final Base.Type_location location, final Xml.Type_xml child) {
    Base.Type_location output = Base.e_location;
    output = Core.f_let(
      Base.t_location,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_location,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return location;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  location,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  location,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_location,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function location_from_xml
   * Returns a location from a given xml.
   * @param  {xml} xml
   * @return {location}
   * (func location<-xml)
   */
  public static interface Func_location_from_xml extends Core.Func_any_from_any {
    public Base.Type_location vx_location_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_location_from_xml extends Core.Class_base implements Func_location_from_xml {

    @Override
    public Func_location_from_xml vx_new(Object... vals) {
      Class_location_from_xml output = new Class_location_from_xml();
      return output;
    }

    @Override
    public Func_location_from_xml vx_copy(Object... vals) {
      Class_location_from_xml output = new Class_location_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "location<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "location", // name
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
    public Func_location_from_xml vx_empty() {return e_location_from_xml;}
    @Override
    public Func_location_from_xml vx_type() {return t_location_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_location_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_location_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_location vx_location_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_location_from_xml(xml);
    }

  }

  public static final Func_location_from_xml e_location_from_xml = new Bookloader.Class_location_from_xml();
  public static final Func_location_from_xml t_location_from_xml = new Bookloader.Class_location_from_xml();

  public static Base.Type_location f_location_from_xml(final Xml.Type_xml xml) {
    Base.Type_location output = Base.e_location;
    output = Core.f_let(
      Base.t_location,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_location location = Bookloader.f_location_from_location_stringmap(
          Core.f_empty(
            Base.t_location
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_location,
          xml.children(),
          location,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any location_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_location location_lmb = Core.f_any_from_any(Base.t_location, location_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_location_from_location_xmlchild(location_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function modifier_from_modifier_key_value
   * Returns a modified modifier from a key value.
   * @param  {modifier} current
   * @param  {string} key
   * @param  {string} value
   * @return {modifier}
   * (func modifier<-modifier-key-value)
   */
  public static interface Func_modifier_from_modifier_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_modifier vx_modifier_from_modifier_key_value(final Base.Type_modifier current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_modifier_from_modifier_key_value extends Core.Class_base implements Func_modifier_from_modifier_key_value {

    @Override
    public Func_modifier_from_modifier_key_value vx_new(Object... vals) {
      Class_modifier_from_modifier_key_value output = new Class_modifier_from_modifier_key_value();
      return output;
    }

    @Override
    public Func_modifier_from_modifier_key_value vx_copy(Object... vals) {
      Class_modifier_from_modifier_key_value output = new Class_modifier_from_modifier_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "modifier<-modifier-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "modifier", // name
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
    public Func_modifier_from_modifier_key_value vx_empty() {return e_modifier_from_modifier_key_value;}
    @Override
    public Func_modifier_from_modifier_key_value vx_type() {return t_modifier_from_modifier_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_modifier current = Core.f_any_from_any(Base.t_modifier, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_modifier_from_modifier_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_modifier vx_modifier_from_modifier_key_value(final Base.Type_modifier current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_modifier_from_modifier_key_value(current, key, value);
    }

  }

  public static final Func_modifier_from_modifier_key_value e_modifier_from_modifier_key_value = new Bookloader.Class_modifier_from_modifier_key_value();
  public static final Func_modifier_from_modifier_key_value t_modifier_from_modifier_key_value = new Bookloader.Class_modifier_from_modifier_key_value();

  public static Base.Type_modifier f_modifier_from_modifier_key_value(final Base.Type_modifier current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_modifier output = Base.e_modifier;
    output = Core.f_switch(
      Base.t_modifier,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_modifier,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function modifier_from_modifier_stringmap
   * Returns a modifier from a propmap.
   * @param  {modifier} modifier
   * @param  {stringmap} propmap
   * @return {modifier}
   * (func modifier<-modifier-stringmap)
   */
  public static interface Func_modifier_from_modifier_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_modifier vx_modifier_from_modifier_stringmap(final Base.Type_modifier modifier, final Core.Type_stringmap propmap);
  }

  public static class Class_modifier_from_modifier_stringmap extends Core.Class_base implements Func_modifier_from_modifier_stringmap {

    @Override
    public Func_modifier_from_modifier_stringmap vx_new(Object... vals) {
      Class_modifier_from_modifier_stringmap output = new Class_modifier_from_modifier_stringmap();
      return output;
    }

    @Override
    public Func_modifier_from_modifier_stringmap vx_copy(Object... vals) {
      Class_modifier_from_modifier_stringmap output = new Class_modifier_from_modifier_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "modifier<-modifier-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "modifier", // name
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
    public Func_modifier_from_modifier_stringmap vx_empty() {return e_modifier_from_modifier_stringmap;}
    @Override
    public Func_modifier_from_modifier_stringmap vx_type() {return t_modifier_from_modifier_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_modifier modifier = Core.f_any_from_any(Base.t_modifier, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_modifier_from_modifier_stringmap(modifier, propmap);
      return output;
    }

    @Override
    public Base.Type_modifier vx_modifier_from_modifier_stringmap(final Base.Type_modifier modifier, final Core.Type_stringmap propmap) {
      return Bookloader.f_modifier_from_modifier_stringmap(modifier, propmap);
    }

  }

  public static final Func_modifier_from_modifier_stringmap e_modifier_from_modifier_stringmap = new Bookloader.Class_modifier_from_modifier_stringmap();
  public static final Func_modifier_from_modifier_stringmap t_modifier_from_modifier_stringmap = new Bookloader.Class_modifier_from_modifier_stringmap();

  public static Base.Type_modifier f_modifier_from_modifier_stringmap(final Base.Type_modifier modifier, final Core.Type_stringmap propmap) {
    Base.Type_modifier output = Base.e_modifier;
    output = Core.f_any_from_map_start_reduce(
      Base.t_modifier,
      propmap,
      modifier,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_modifier current_lmb = Core.f_any_from_any(Base.t_modifier, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_modifier_from_modifier_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function modifier_from_modifier_xmlchild
   * Returns a modified modifier based on a given child xml.
   * @param  {modifier} modifier
   * @param  {xml} child
   * @return {modifier}
   * (func modifier<-modifier-xmlchild)
   */
  public static interface Func_modifier_from_modifier_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_modifier vx_modifier_from_modifier_xmlchild(final Base.Type_modifier modifier, final Xml.Type_xml child);
  }

  public static class Class_modifier_from_modifier_xmlchild extends Core.Class_base implements Func_modifier_from_modifier_xmlchild {

    @Override
    public Func_modifier_from_modifier_xmlchild vx_new(Object... vals) {
      Class_modifier_from_modifier_xmlchild output = new Class_modifier_from_modifier_xmlchild();
      return output;
    }

    @Override
    public Func_modifier_from_modifier_xmlchild vx_copy(Object... vals) {
      Class_modifier_from_modifier_xmlchild output = new Class_modifier_from_modifier_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "modifier<-modifier-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "modifier", // name
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
    public Func_modifier_from_modifier_xmlchild vx_empty() {return e_modifier_from_modifier_xmlchild;}
    @Override
    public Func_modifier_from_modifier_xmlchild vx_type() {return t_modifier_from_modifier_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_modifier modifier = Core.f_any_from_any(Base.t_modifier, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_modifier_from_modifier_xmlchild(modifier, child);
      return output;
    }

    @Override
    public Base.Type_modifier vx_modifier_from_modifier_xmlchild(final Base.Type_modifier modifier, final Xml.Type_xml child) {
      return Bookloader.f_modifier_from_modifier_xmlchild(modifier, child);
    }

  }

  public static final Func_modifier_from_modifier_xmlchild e_modifier_from_modifier_xmlchild = new Bookloader.Class_modifier_from_modifier_xmlchild();
  public static final Func_modifier_from_modifier_xmlchild t_modifier_from_modifier_xmlchild = new Bookloader.Class_modifier_from_modifier_xmlchild();

  public static Base.Type_modifier f_modifier_from_modifier_xmlchild(final Base.Type_modifier modifier, final Xml.Type_xml child) {
    Base.Type_modifier output = Base.e_modifier;
    output = Core.f_let(
      Base.t_modifier,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_modifier,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return modifier;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  modifier,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  modifier,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_modifier,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function modifier_from_xml
   * Returns a modifier from a given xml.
   * @param  {xml} xml
   * @return {modifier}
   * (func modifier<-xml)
   */
  public static interface Func_modifier_from_xml extends Core.Func_any_from_any {
    public Base.Type_modifier vx_modifier_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_modifier_from_xml extends Core.Class_base implements Func_modifier_from_xml {

    @Override
    public Func_modifier_from_xml vx_new(Object... vals) {
      Class_modifier_from_xml output = new Class_modifier_from_xml();
      return output;
    }

    @Override
    public Func_modifier_from_xml vx_copy(Object... vals) {
      Class_modifier_from_xml output = new Class_modifier_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "modifier<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "modifier", // name
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
    public Func_modifier_from_xml vx_empty() {return e_modifier_from_xml;}
    @Override
    public Func_modifier_from_xml vx_type() {return t_modifier_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_modifier_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_modifier_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_modifier vx_modifier_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_modifier_from_xml(xml);
    }

  }

  public static final Func_modifier_from_xml e_modifier_from_xml = new Bookloader.Class_modifier_from_xml();
  public static final Func_modifier_from_xml t_modifier_from_xml = new Bookloader.Class_modifier_from_xml();

  public static Base.Type_modifier f_modifier_from_xml(final Xml.Type_xml xml) {
    Base.Type_modifier output = Base.e_modifier;
    output = Core.f_let(
      Base.t_modifier,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_modifier modifier = Bookloader.f_modifier_from_modifier_stringmap(
          Core.f_empty(
            Base.t_modifier
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_modifier,
          xml.children(),
          modifier,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any modifier_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_modifier modifier_lmb = Core.f_any_from_any(Base.t_modifier, modifier_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_modifier_from_modifier_xmlchild(modifier_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function power_from_power_key_value
   * Returns a modified power from a key value.
   * @param  {power} current
   * @param  {string} key
   * @param  {string} value
   * @return {power}
   * (func power<-power-key-value)
   */
  public static interface Func_power_from_power_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_power vx_power_from_power_key_value(final Base.Type_power current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_power_from_power_key_value extends Core.Class_base implements Func_power_from_power_key_value {

    @Override
    public Func_power_from_power_key_value vx_new(Object... vals) {
      Class_power_from_power_key_value output = new Class_power_from_power_key_value();
      return output;
    }

    @Override
    public Func_power_from_power_key_value vx_copy(Object... vals) {
      Class_power_from_power_key_value output = new Class_power_from_power_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "power<-power-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "power", // name
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
    public Func_power_from_power_key_value vx_empty() {return e_power_from_power_key_value;}
    @Override
    public Func_power_from_power_key_value vx_type() {return t_power_from_power_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_power current = Core.f_any_from_any(Base.t_power, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_power_from_power_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_power vx_power_from_power_key_value(final Base.Type_power current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_power_from_power_key_value(current, key, value);
    }

  }

  public static final Func_power_from_power_key_value e_power_from_power_key_value = new Bookloader.Class_power_from_power_key_value();
  public static final Func_power_from_power_key_value t_power_from_power_key_value = new Bookloader.Class_power_from_power_key_value();

  public static Base.Type_power f_power_from_power_key_value(final Base.Type_power current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_power output = Base.e_power;
    output = Core.f_switch(
      Base.t_power,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("stat")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_power,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function power_from_power_stringmap
   * Returns a new power from a propmap.
   * @param  {power} power
   * @param  {stringmap} propmap
   * @return {power}
   * (func power<-power-stringmap)
   */
  public static interface Func_power_from_power_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_power vx_power_from_power_stringmap(final Base.Type_power power, final Core.Type_stringmap propmap);
  }

  public static class Class_power_from_power_stringmap extends Core.Class_base implements Func_power_from_power_stringmap {

    @Override
    public Func_power_from_power_stringmap vx_new(Object... vals) {
      Class_power_from_power_stringmap output = new Class_power_from_power_stringmap();
      return output;
    }

    @Override
    public Func_power_from_power_stringmap vx_copy(Object... vals) {
      Class_power_from_power_stringmap output = new Class_power_from_power_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "power<-power-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "power", // name
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
    public Func_power_from_power_stringmap vx_empty() {return e_power_from_power_stringmap;}
    @Override
    public Func_power_from_power_stringmap vx_type() {return t_power_from_power_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_power power = Core.f_any_from_any(Base.t_power, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_power_from_power_stringmap(power, propmap);
      return output;
    }

    @Override
    public Base.Type_power vx_power_from_power_stringmap(final Base.Type_power power, final Core.Type_stringmap propmap) {
      return Bookloader.f_power_from_power_stringmap(power, propmap);
    }

  }

  public static final Func_power_from_power_stringmap e_power_from_power_stringmap = new Bookloader.Class_power_from_power_stringmap();
  public static final Func_power_from_power_stringmap t_power_from_power_stringmap = new Bookloader.Class_power_from_power_stringmap();

  public static Base.Type_power f_power_from_power_stringmap(final Base.Type_power power, final Core.Type_stringmap propmap) {
    Base.Type_power output = Base.e_power;
    output = Core.f_any_from_map_start_reduce(
      Base.t_power,
      propmap,
      power,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_power current_lmb = Core.f_any_from_any(Base.t_power, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_power_from_power_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function power_from_power_xmlability
   * Return a power with new ability added to abilitymap
   * @param  {power} power
   * @param  {xml} xmlability
   * @return {power}
   * (func power<-power-xmlability)
   */
  public static interface Func_power_from_power_xmlability extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_power vx_power_from_power_xmlability(final Base.Type_power power, final Xml.Type_xml xmlability);
  }

  public static class Class_power_from_power_xmlability extends Core.Class_base implements Func_power_from_power_xmlability {

    @Override
    public Func_power_from_power_xmlability vx_new(Object... vals) {
      Class_power_from_power_xmlability output = new Class_power_from_power_xmlability();
      return output;
    }

    @Override
    public Func_power_from_power_xmlability vx_copy(Object... vals) {
      Class_power_from_power_xmlability output = new Class_power_from_power_xmlability();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "power<-power-xmlability", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "power", // name
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
    public Func_power_from_power_xmlability vx_empty() {return e_power_from_power_xmlability;}
    @Override
    public Func_power_from_power_xmlability vx_type() {return t_power_from_power_xmlability;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_power power = Core.f_any_from_any(Base.t_power, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlability = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_power_from_power_xmlability(power, xmlability);
      return output;
    }

    @Override
    public Base.Type_power vx_power_from_power_xmlability(final Base.Type_power power, final Xml.Type_xml xmlability) {
      return Bookloader.f_power_from_power_xmlability(power, xmlability);
    }

  }

  public static final Func_power_from_power_xmlability e_power_from_power_xmlability = new Bookloader.Class_power_from_power_xmlability();
  public static final Func_power_from_power_xmlability t_power_from_power_xmlability = new Bookloader.Class_power_from_power_xmlability();

  public static Base.Type_power f_power_from_power_xmlability(final Base.Type_power power, final Xml.Type_xml xmlability) {
    Base.Type_power output = Base.e_power;
    output = Core.f_let(
      Base.t_power,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_ability ability = Bookloader.f_ability_from_xml(xmlability);
        final Core.Type_string name = ability.name();
        final Base.Type_abilitymap origmap = power.abilitymap();
        final Base.Type_abilitymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              ability
          )
        );
        return Core.f_copy(
          power,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":abilitymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function power_from_power_xmlchild
   * Returns a modified power based on a given child xml.
   * @param  {power} power
   * @param  {xml} child
   * @return {power}
   * (func power<-power-xmlchild)
   */
  public static interface Func_power_from_power_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_power vx_power_from_power_xmlchild(final Base.Type_power power, final Xml.Type_xml child);
  }

  public static class Class_power_from_power_xmlchild extends Core.Class_base implements Func_power_from_power_xmlchild {

    @Override
    public Func_power_from_power_xmlchild vx_new(Object... vals) {
      Class_power_from_power_xmlchild output = new Class_power_from_power_xmlchild();
      return output;
    }

    @Override
    public Func_power_from_power_xmlchild vx_copy(Object... vals) {
      Class_power_from_power_xmlchild output = new Class_power_from_power_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "power<-power-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "power", // name
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
    public Func_power_from_power_xmlchild vx_empty() {return e_power_from_power_xmlchild;}
    @Override
    public Func_power_from_power_xmlchild vx_type() {return t_power_from_power_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_power power = Core.f_any_from_any(Base.t_power, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_power_from_power_xmlchild(power, child);
      return output;
    }

    @Override
    public Base.Type_power vx_power_from_power_xmlchild(final Base.Type_power power, final Xml.Type_xml child) {
      return Bookloader.f_power_from_power_xmlchild(power, child);
    }

  }

  public static final Func_power_from_power_xmlchild e_power_from_power_xmlchild = new Bookloader.Class_power_from_power_xmlchild();
  public static final Func_power_from_power_xmlchild t_power_from_power_xmlchild = new Bookloader.Class_power_from_power_xmlchild();

  public static Base.Type_power f_power_from_power_xmlchild(final Base.Type_power power, final Xml.Type_xml child) {
    Base.Type_power output = Base.e_power;
    output = Core.f_let(
      Base.t_power,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_power,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return power;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  power,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("ability"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_power_from_power_xmlability(power, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("specialty"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_power_from_power_xmlspecialty(power, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  power,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_power,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function power_from_power_xmlspecialty
   * Return a power with new specialty added to specialtymap
   * @param  {power} power
   * @param  {xml} xmlspecialty
   * @return {power}
   * (func power<-power-xmlspecialty)
   */
  public static interface Func_power_from_power_xmlspecialty extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_power vx_power_from_power_xmlspecialty(final Base.Type_power power, final Xml.Type_xml xmlspecialty);
  }

  public static class Class_power_from_power_xmlspecialty extends Core.Class_base implements Func_power_from_power_xmlspecialty {

    @Override
    public Func_power_from_power_xmlspecialty vx_new(Object... vals) {
      Class_power_from_power_xmlspecialty output = new Class_power_from_power_xmlspecialty();
      return output;
    }

    @Override
    public Func_power_from_power_xmlspecialty vx_copy(Object... vals) {
      Class_power_from_power_xmlspecialty output = new Class_power_from_power_xmlspecialty();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "power<-power-xmlspecialty", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "power", // name
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
    public Func_power_from_power_xmlspecialty vx_empty() {return e_power_from_power_xmlspecialty;}
    @Override
    public Func_power_from_power_xmlspecialty vx_type() {return t_power_from_power_xmlspecialty;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_power power = Core.f_any_from_any(Base.t_power, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlspecialty = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_power_from_power_xmlspecialty(power, xmlspecialty);
      return output;
    }

    @Override
    public Base.Type_power vx_power_from_power_xmlspecialty(final Base.Type_power power, final Xml.Type_xml xmlspecialty) {
      return Bookloader.f_power_from_power_xmlspecialty(power, xmlspecialty);
    }

  }

  public static final Func_power_from_power_xmlspecialty e_power_from_power_xmlspecialty = new Bookloader.Class_power_from_power_xmlspecialty();
  public static final Func_power_from_power_xmlspecialty t_power_from_power_xmlspecialty = new Bookloader.Class_power_from_power_xmlspecialty();

  public static Base.Type_power f_power_from_power_xmlspecialty(final Base.Type_power power, final Xml.Type_xml xmlspecialty) {
    Base.Type_power output = Base.e_power;
    output = Core.f_let(
      Base.t_power,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_specialty specialty = Bookloader.f_specialty_from_xml(xmlspecialty);
        final Core.Type_string name = specialty.name();
        final Base.Type_specialtymap origmap = power.specialtymap();
        final Base.Type_specialtymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              specialty
          )
        );
        return Core.f_copy(
          power,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":specialtymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function power_from_xml
   * Returns a power from a given Xml.
   * @param  {xml} xml
   * @return {power}
   * (func power<-xml)
   */
  public static interface Func_power_from_xml extends Core.Func_any_from_any {
    public Base.Type_power vx_power_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_power_from_xml extends Core.Class_base implements Func_power_from_xml {

    @Override
    public Func_power_from_xml vx_new(Object... vals) {
      Class_power_from_xml output = new Class_power_from_xml();
      return output;
    }

    @Override
    public Func_power_from_xml vx_copy(Object... vals) {
      Class_power_from_xml output = new Class_power_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "power<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "power", // name
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
    public Func_power_from_xml vx_empty() {return e_power_from_xml;}
    @Override
    public Func_power_from_xml vx_type() {return t_power_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_power_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_power_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_power vx_power_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_power_from_xml(xml);
    }

  }

  public static final Func_power_from_xml e_power_from_xml = new Bookloader.Class_power_from_xml();
  public static final Func_power_from_xml t_power_from_xml = new Bookloader.Class_power_from_xml();

  public static Base.Type_power f_power_from_xml(final Xml.Type_xml xml) {
    Base.Type_power output = Base.e_power;
    output = Core.f_let(
      Base.t_power,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Xml.Type_xmllist children = xml.children();
        final Base.Type_power power = Bookloader.f_power_from_power_stringmap(
          Core.f_empty(
            Base.t_power
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_power,
          children,
          power,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any power_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_power power_lmb = Core.f_any_from_any(Base.t_power, power_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_power_from_power_xmlchild(power_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function rule_from_rule_key_value
   * Returns a modified rule from a key value.
   * @param  {rule} current
   * @param  {string} key
   * @param  {string} value
   * @return {rule}
   * (func rule<-rule-key-value)
   */
  public static interface Func_rule_from_rule_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_rule vx_rule_from_rule_key_value(final Base.Type_rule current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_rule_from_rule_key_value extends Core.Class_base implements Func_rule_from_rule_key_value {

    @Override
    public Func_rule_from_rule_key_value vx_new(Object... vals) {
      Class_rule_from_rule_key_value output = new Class_rule_from_rule_key_value();
      return output;
    }

    @Override
    public Func_rule_from_rule_key_value vx_copy(Object... vals) {
      Class_rule_from_rule_key_value output = new Class_rule_from_rule_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "rule<-rule-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rule", // name
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
    public Func_rule_from_rule_key_value vx_empty() {return e_rule_from_rule_key_value;}
    @Override
    public Func_rule_from_rule_key_value vx_type() {return t_rule_from_rule_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_rule current = Core.f_any_from_any(Base.t_rule, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_rule_from_rule_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_rule vx_rule_from_rule_key_value(final Base.Type_rule current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_rule_from_rule_key_value(current, key, value);
    }

  }

  public static final Func_rule_from_rule_key_value e_rule_from_rule_key_value = new Bookloader.Class_rule_from_rule_key_value();
  public static final Func_rule_from_rule_key_value t_rule_from_rule_key_value = new Bookloader.Class_rule_from_rule_key_value();

  public static Base.Type_rule f_rule_from_rule_key_value(final Base.Type_rule current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_rule output = Base.e_rule;
    output = Core.f_switch(
      Base.t_rule,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("classification")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_rule,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function rule_from_rule_stringmap
   * Returns a rule from a propmap.
   * @param  {rule} rule
   * @param  {stringmap} propmap
   * @return {rule}
   * (func rule<-rule-stringmap)
   */
  public static interface Func_rule_from_rule_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_rule vx_rule_from_rule_stringmap(final Base.Type_rule rule, final Core.Type_stringmap propmap);
  }

  public static class Class_rule_from_rule_stringmap extends Core.Class_base implements Func_rule_from_rule_stringmap {

    @Override
    public Func_rule_from_rule_stringmap vx_new(Object... vals) {
      Class_rule_from_rule_stringmap output = new Class_rule_from_rule_stringmap();
      return output;
    }

    @Override
    public Func_rule_from_rule_stringmap vx_copy(Object... vals) {
      Class_rule_from_rule_stringmap output = new Class_rule_from_rule_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "rule<-rule-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rule", // name
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
    public Func_rule_from_rule_stringmap vx_empty() {return e_rule_from_rule_stringmap;}
    @Override
    public Func_rule_from_rule_stringmap vx_type() {return t_rule_from_rule_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_rule rule = Core.f_any_from_any(Base.t_rule, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_rule_from_rule_stringmap(rule, propmap);
      return output;
    }

    @Override
    public Base.Type_rule vx_rule_from_rule_stringmap(final Base.Type_rule rule, final Core.Type_stringmap propmap) {
      return Bookloader.f_rule_from_rule_stringmap(rule, propmap);
    }

  }

  public static final Func_rule_from_rule_stringmap e_rule_from_rule_stringmap = new Bookloader.Class_rule_from_rule_stringmap();
  public static final Func_rule_from_rule_stringmap t_rule_from_rule_stringmap = new Bookloader.Class_rule_from_rule_stringmap();

  public static Base.Type_rule f_rule_from_rule_stringmap(final Base.Type_rule rule, final Core.Type_stringmap propmap) {
    Base.Type_rule output = Base.e_rule;
    output = Core.f_any_from_map_start_reduce(
      Base.t_rule,
      propmap,
      rule,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_rule current_lmb = Core.f_any_from_any(Base.t_rule, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_rule_from_rule_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function rule_from_rule_xmlchild
   * Returns a modified rule based on a given child Xml.
   * @param  {rule} rule
   * @param  {xml} child
   * @return {rule}
   * (func rule<-rule-xmlchild)
   */
  public static interface Func_rule_from_rule_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_rule vx_rule_from_rule_xmlchild(final Base.Type_rule rule, final Xml.Type_xml child);
  }

  public static class Class_rule_from_rule_xmlchild extends Core.Class_base implements Func_rule_from_rule_xmlchild {

    @Override
    public Func_rule_from_rule_xmlchild vx_new(Object... vals) {
      Class_rule_from_rule_xmlchild output = new Class_rule_from_rule_xmlchild();
      return output;
    }

    @Override
    public Func_rule_from_rule_xmlchild vx_copy(Object... vals) {
      Class_rule_from_rule_xmlchild output = new Class_rule_from_rule_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "rule<-rule-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rule", // name
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
    public Func_rule_from_rule_xmlchild vx_empty() {return e_rule_from_rule_xmlchild;}
    @Override
    public Func_rule_from_rule_xmlchild vx_type() {return t_rule_from_rule_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_rule rule = Core.f_any_from_any(Base.t_rule, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_rule_from_rule_xmlchild(rule, child);
      return output;
    }

    @Override
    public Base.Type_rule vx_rule_from_rule_xmlchild(final Base.Type_rule rule, final Xml.Type_xml child) {
      return Bookloader.f_rule_from_rule_xmlchild(rule, child);
    }

  }

  public static final Func_rule_from_rule_xmlchild e_rule_from_rule_xmlchild = new Bookloader.Class_rule_from_rule_xmlchild();
  public static final Func_rule_from_rule_xmlchild t_rule_from_rule_xmlchild = new Bookloader.Class_rule_from_rule_xmlchild();

  public static Base.Type_rule f_rule_from_rule_xmlchild(final Base.Type_rule rule, final Xml.Type_xml child) {
    Base.Type_rule output = Base.e_rule;
    output = Core.f_let(
      Base.t_rule,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_rule,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return rule;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string("classification")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  rule,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  rule,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_rule,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function rule_from_xml
   * Returns a rule from a given xml.
   * @param  {xml} xml
   * @return {rule}
   * (func rule<-xml)
   */
  public static interface Func_rule_from_xml extends Core.Func_any_from_any {
    public Base.Type_rule vx_rule_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_rule_from_xml extends Core.Class_base implements Func_rule_from_xml {

    @Override
    public Func_rule_from_xml vx_new(Object... vals) {
      Class_rule_from_xml output = new Class_rule_from_xml();
      return output;
    }

    @Override
    public Func_rule_from_xml vx_copy(Object... vals) {
      Class_rule_from_xml output = new Class_rule_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "rule<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "rule", // name
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
    public Func_rule_from_xml vx_empty() {return e_rule_from_xml;}
    @Override
    public Func_rule_from_xml vx_type() {return t_rule_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_rule_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_rule_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_rule vx_rule_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_rule_from_xml(xml);
    }

  }

  public static final Func_rule_from_xml e_rule_from_xml = new Bookloader.Class_rule_from_xml();
  public static final Func_rule_from_xml t_rule_from_xml = new Bookloader.Class_rule_from_xml();

  public static Base.Type_rule f_rule_from_xml(final Xml.Type_xml xml) {
    Base.Type_rule output = Base.e_rule;
    output = Core.f_let(
      Base.t_rule,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_rule rule = Bookloader.f_rule_from_rule_stringmap(
          Core.f_empty(
            Base.t_rule
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_rule,
          xml.children(),
          rule,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any rule_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_rule rule_lmb = Core.f_any_from_any(Base.t_rule, rule_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_rule_from_rule_xmlchild(rule_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function scenario_from_scenario_key_value
   * Returns a modified scenario from a key value.
   * @param  {scenario} current
   * @param  {string} key
   * @param  {string} value
   * @return {scenario}
   * (func scenario<-scenario-key-value)
   */
  public static interface Func_scenario_from_scenario_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_scenario vx_scenario_from_scenario_key_value(final Base.Type_scenario current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_scenario_from_scenario_key_value extends Core.Class_base implements Func_scenario_from_scenario_key_value {

    @Override
    public Func_scenario_from_scenario_key_value vx_new(Object... vals) {
      Class_scenario_from_scenario_key_value output = new Class_scenario_from_scenario_key_value();
      return output;
    }

    @Override
    public Func_scenario_from_scenario_key_value vx_copy(Object... vals) {
      Class_scenario_from_scenario_key_value output = new Class_scenario_from_scenario_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "scenario<-scenario-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "scenario", // name
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
    public Func_scenario_from_scenario_key_value vx_empty() {return e_scenario_from_scenario_key_value;}
    @Override
    public Func_scenario_from_scenario_key_value vx_type() {return t_scenario_from_scenario_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_scenario current = Core.f_any_from_any(Base.t_scenario, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_scenario_from_scenario_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_scenario vx_scenario_from_scenario_key_value(final Base.Type_scenario current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_scenario_from_scenario_key_value(current, key, value);
    }

  }

  public static final Func_scenario_from_scenario_key_value e_scenario_from_scenario_key_value = new Bookloader.Class_scenario_from_scenario_key_value();
  public static final Func_scenario_from_scenario_key_value t_scenario_from_scenario_key_value = new Bookloader.Class_scenario_from_scenario_key_value();

  public static Base.Type_scenario f_scenario_from_scenario_key_value(final Base.Type_scenario current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_scenario output = Base.e_scenario;
    output = Core.f_switch(
      Base.t_scenario,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_scenario,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function scenario_from_scenario_stringmap
   * Returns a scenario from a propmap.
   * @param  {scenario} scenario
   * @param  {stringmap} propmap
   * @return {scenario}
   * (func scenario<-scenario-stringmap)
   */
  public static interface Func_scenario_from_scenario_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_scenario vx_scenario_from_scenario_stringmap(final Base.Type_scenario scenario, final Core.Type_stringmap propmap);
  }

  public static class Class_scenario_from_scenario_stringmap extends Core.Class_base implements Func_scenario_from_scenario_stringmap {

    @Override
    public Func_scenario_from_scenario_stringmap vx_new(Object... vals) {
      Class_scenario_from_scenario_stringmap output = new Class_scenario_from_scenario_stringmap();
      return output;
    }

    @Override
    public Func_scenario_from_scenario_stringmap vx_copy(Object... vals) {
      Class_scenario_from_scenario_stringmap output = new Class_scenario_from_scenario_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "scenario<-scenario-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "scenario", // name
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
    public Func_scenario_from_scenario_stringmap vx_empty() {return e_scenario_from_scenario_stringmap;}
    @Override
    public Func_scenario_from_scenario_stringmap vx_type() {return t_scenario_from_scenario_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_scenario scenario = Core.f_any_from_any(Base.t_scenario, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_scenario_from_scenario_stringmap(scenario, propmap);
      return output;
    }

    @Override
    public Base.Type_scenario vx_scenario_from_scenario_stringmap(final Base.Type_scenario scenario, final Core.Type_stringmap propmap) {
      return Bookloader.f_scenario_from_scenario_stringmap(scenario, propmap);
    }

  }

  public static final Func_scenario_from_scenario_stringmap e_scenario_from_scenario_stringmap = new Bookloader.Class_scenario_from_scenario_stringmap();
  public static final Func_scenario_from_scenario_stringmap t_scenario_from_scenario_stringmap = new Bookloader.Class_scenario_from_scenario_stringmap();

  public static Base.Type_scenario f_scenario_from_scenario_stringmap(final Base.Type_scenario scenario, final Core.Type_stringmap propmap) {
    Base.Type_scenario output = Base.e_scenario;
    output = Core.f_any_from_map_start_reduce(
      Base.t_scenario,
      propmap,
      scenario,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_scenario current_lmb = Core.f_any_from_any(Base.t_scenario, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_scenario_from_scenario_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function scenario_from_scenario_xmlchild
   * Returns a modified scenario based on a given child Xml.
   * @param  {scenario} scenario
   * @param  {xml} child
   * @return {scenario}
   * (func scenario<-scenario-xmlchild)
   */
  public static interface Func_scenario_from_scenario_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_scenario vx_scenario_from_scenario_xmlchild(final Base.Type_scenario scenario, final Xml.Type_xml child);
  }

  public static class Class_scenario_from_scenario_xmlchild extends Core.Class_base implements Func_scenario_from_scenario_xmlchild {

    @Override
    public Func_scenario_from_scenario_xmlchild vx_new(Object... vals) {
      Class_scenario_from_scenario_xmlchild output = new Class_scenario_from_scenario_xmlchild();
      return output;
    }

    @Override
    public Func_scenario_from_scenario_xmlchild vx_copy(Object... vals) {
      Class_scenario_from_scenario_xmlchild output = new Class_scenario_from_scenario_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "scenario<-scenario-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "scenario", // name
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
    public Func_scenario_from_scenario_xmlchild vx_empty() {return e_scenario_from_scenario_xmlchild;}
    @Override
    public Func_scenario_from_scenario_xmlchild vx_type() {return t_scenario_from_scenario_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_scenario scenario = Core.f_any_from_any(Base.t_scenario, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_scenario_from_scenario_xmlchild(scenario, child);
      return output;
    }

    @Override
    public Base.Type_scenario vx_scenario_from_scenario_xmlchild(final Base.Type_scenario scenario, final Xml.Type_xml child) {
      return Bookloader.f_scenario_from_scenario_xmlchild(scenario, child);
    }

  }

  public static final Func_scenario_from_scenario_xmlchild e_scenario_from_scenario_xmlchild = new Bookloader.Class_scenario_from_scenario_xmlchild();
  public static final Func_scenario_from_scenario_xmlchild t_scenario_from_scenario_xmlchild = new Bookloader.Class_scenario_from_scenario_xmlchild();

  public static Base.Type_scenario f_scenario_from_scenario_xmlchild(final Base.Type_scenario scenario, final Xml.Type_xml child) {
    Base.Type_scenario output = Base.e_scenario;
    output = Core.f_let(
      Base.t_scenario,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_scenario,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return scenario;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  scenario,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("team"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_scenario_from_scenario_xmlteam(scenario, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  scenario,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_scenario,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function scenario_from_scenario_xmlteam
   * Return a scenario with new team added to teammap
   * @param  {scenario} scenario
   * @param  {xml} xmlteam
   * @return {scenario}
   * (func scenario<-scenario-xmlteam)
   */
  public static interface Func_scenario_from_scenario_xmlteam extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_scenario vx_scenario_from_scenario_xmlteam(final Base.Type_scenario scenario, final Xml.Type_xml xmlteam);
  }

  public static class Class_scenario_from_scenario_xmlteam extends Core.Class_base implements Func_scenario_from_scenario_xmlteam {

    @Override
    public Func_scenario_from_scenario_xmlteam vx_new(Object... vals) {
      Class_scenario_from_scenario_xmlteam output = new Class_scenario_from_scenario_xmlteam();
      return output;
    }

    @Override
    public Func_scenario_from_scenario_xmlteam vx_copy(Object... vals) {
      Class_scenario_from_scenario_xmlteam output = new Class_scenario_from_scenario_xmlteam();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "scenario<-scenario-xmlteam", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "scenario", // name
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
    public Func_scenario_from_scenario_xmlteam vx_empty() {return e_scenario_from_scenario_xmlteam;}
    @Override
    public Func_scenario_from_scenario_xmlteam vx_type() {return t_scenario_from_scenario_xmlteam;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_scenario scenario = Core.f_any_from_any(Base.t_scenario, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlteam = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_scenario_from_scenario_xmlteam(scenario, xmlteam);
      return output;
    }

    @Override
    public Base.Type_scenario vx_scenario_from_scenario_xmlteam(final Base.Type_scenario scenario, final Xml.Type_xml xmlteam) {
      return Bookloader.f_scenario_from_scenario_xmlteam(scenario, xmlteam);
    }

  }

  public static final Func_scenario_from_scenario_xmlteam e_scenario_from_scenario_xmlteam = new Bookloader.Class_scenario_from_scenario_xmlteam();
  public static final Func_scenario_from_scenario_xmlteam t_scenario_from_scenario_xmlteam = new Bookloader.Class_scenario_from_scenario_xmlteam();

  public static Base.Type_scenario f_scenario_from_scenario_xmlteam(final Base.Type_scenario scenario, final Xml.Type_xml xmlteam) {
    Base.Type_scenario output = Base.e_scenario;
    output = Core.f_let(
      Base.t_scenario,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_team current = Bookloader.f_team_from_xml(xmlteam);
        final Core.Type_string name = current.name();
        final Base.Type_teammap origmap = scenario.teammap();
        final Base.Type_teammap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              current
          )
        );
        return Core.f_copy(
          scenario,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":teammap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function scenario_from_xml
   * Returns a scenario from a given xml.
   * @param  {xml} xml
   * @return {scenario}
   * (func scenario<-xml)
   */
  public static interface Func_scenario_from_xml extends Core.Func_any_from_any {
    public Base.Type_scenario vx_scenario_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_scenario_from_xml extends Core.Class_base implements Func_scenario_from_xml {

    @Override
    public Func_scenario_from_xml vx_new(Object... vals) {
      Class_scenario_from_xml output = new Class_scenario_from_xml();
      return output;
    }

    @Override
    public Func_scenario_from_xml vx_copy(Object... vals) {
      Class_scenario_from_xml output = new Class_scenario_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "scenario<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "scenario", // name
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
    public Func_scenario_from_xml vx_empty() {return e_scenario_from_xml;}
    @Override
    public Func_scenario_from_xml vx_type() {return t_scenario_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_scenario_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_scenario_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_scenario vx_scenario_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_scenario_from_xml(xml);
    }

  }

  public static final Func_scenario_from_xml e_scenario_from_xml = new Bookloader.Class_scenario_from_xml();
  public static final Func_scenario_from_xml t_scenario_from_xml = new Bookloader.Class_scenario_from_xml();

  public static Base.Type_scenario f_scenario_from_xml(final Xml.Type_xml xml) {
    Base.Type_scenario output = Base.e_scenario;
    output = Core.f_let(
      Base.t_scenario,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_scenario scenario = Bookloader.f_scenario_from_scenario_stringmap(
          Core.f_empty(
            Base.t_scenario
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_scenario,
          xml.children(),
          scenario,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any scenario_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_scenario scenario_lmb = Core.f_any_from_any(Base.t_scenario, scenario_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_scenario_from_scenario_xmlchild(scenario_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_key_value
   * Returns a modified section from a key value.
   * @param  {section} current
   * @param  {string} key
   * @param  {string} value
   * @return {section}
   * (func section<-section-key-value)
   */
  public static interface Func_section_from_section_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_key_value(final Base.Type_section current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_section_from_section_key_value extends Core.Class_base implements Func_section_from_section_key_value {

    @Override
    public Func_section_from_section_key_value vx_new(Object... vals) {
      Class_section_from_section_key_value output = new Class_section_from_section_key_value();
      return output;
    }

    @Override
    public Func_section_from_section_key_value vx_copy(Object... vals) {
      Class_section_from_section_key_value output = new Class_section_from_section_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_key_value vx_empty() {return e_section_from_section_key_value;}
    @Override
    public Func_section_from_section_key_value vx_type() {return t_section_from_section_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section current = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_section_from_section_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_key_value(final Base.Type_section current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_section_from_section_key_value(current, key, value);
    }

  }

  public static final Func_section_from_section_key_value e_section_from_section_key_value = new Bookloader.Class_section_from_section_key_value();
  public static final Func_section_from_section_key_value t_section_from_section_key_value = new Bookloader.Class_section_from_section_key_value();

  public static Base.Type_section f_section_from_section_key_value(final Base.Type_section current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_section output = Base.e_section;
    output = Core.f_switch(
      Base.t_section,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_section,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function section_from_section_stringmap
   * Returns a new book from a propmap.
   * @param  {section} section
   * @param  {stringmap} propmap
   * @return {section}
   * (func section<-section-stringmap)
   */
  public static interface Func_section_from_section_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_stringmap(final Base.Type_section section, final Core.Type_stringmap propmap);
  }

  public static class Class_section_from_section_stringmap extends Core.Class_base implements Func_section_from_section_stringmap {

    @Override
    public Func_section_from_section_stringmap vx_new(Object... vals) {
      Class_section_from_section_stringmap output = new Class_section_from_section_stringmap();
      return output;
    }

    @Override
    public Func_section_from_section_stringmap vx_copy(Object... vals) {
      Class_section_from_section_stringmap output = new Class_section_from_section_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_stringmap vx_empty() {return e_section_from_section_stringmap;}
    @Override
    public Func_section_from_section_stringmap vx_type() {return t_section_from_section_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_stringmap(section, propmap);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_stringmap(final Base.Type_section section, final Core.Type_stringmap propmap) {
      return Bookloader.f_section_from_section_stringmap(section, propmap);
    }

  }

  public static final Func_section_from_section_stringmap e_section_from_section_stringmap = new Bookloader.Class_section_from_section_stringmap();
  public static final Func_section_from_section_stringmap t_section_from_section_stringmap = new Bookloader.Class_section_from_section_stringmap();

  public static Base.Type_section f_section_from_section_stringmap(final Base.Type_section section, final Core.Type_stringmap propmap) {
    Base.Type_section output = Base.e_section;
    output = Core.f_any_from_map_start_reduce(
      Base.t_section,
      propmap,
      section,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_section current_lmb = Core.f_any_from_any(Base.t_section, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_section_from_section_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlchild
   * Returns a modified section based on a given child Xml.
   * @param  {section} section
   * @param  {xml} child
   * @return {section}
   * (func section<-section-xmlchild)
   */
  public static interface Func_section_from_section_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlchild(final Base.Type_section section, final Xml.Type_xml child);
  }

  public static class Class_section_from_section_xmlchild extends Core.Class_base implements Func_section_from_section_xmlchild {

    @Override
    public Func_section_from_section_xmlchild vx_new(Object... vals) {
      Class_section_from_section_xmlchild output = new Class_section_from_section_xmlchild();
      return output;
    }

    @Override
    public Func_section_from_section_xmlchild vx_copy(Object... vals) {
      Class_section_from_section_xmlchild output = new Class_section_from_section_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlchild vx_empty() {return e_section_from_section_xmlchild;}
    @Override
    public Func_section_from_section_xmlchild vx_type() {return t_section_from_section_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlchild(section, child);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlchild(final Base.Type_section section, final Xml.Type_xml child) {
      return Bookloader.f_section_from_section_xmlchild(section, child);
    }

  }

  public static final Func_section_from_section_xmlchild e_section_from_section_xmlchild = new Bookloader.Class_section_from_section_xmlchild();
  public static final Func_section_from_section_xmlchild t_section_from_section_xmlchild = new Bookloader.Class_section_from_section_xmlchild();

  public static Base.Type_section f_section_from_section_xmlchild(final Base.Type_section section, final Xml.Type_xml child) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_section,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return section;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  section,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("damage"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmldamage(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("item"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlitem(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("modifier"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlmodifier(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("place"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmllocation(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("power"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlpower(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("rule"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlrule(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("scenario"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlscenario(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("section"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlsection(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("skill"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlskill(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("terrain"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlterrain(section, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("unit"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_section_from_section_xmlunit(section, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  section,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_section,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmldamage
   * Return a section with new damage added to damagemap
   * @param  {section} section
   * @param  {xml} xmldamage
   * @return {section}
   * (func section<-section-xmldamage)
   */
  public static interface Func_section_from_section_xmldamage extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmldamage(final Base.Type_section section, final Xml.Type_xml xmldamage);
  }

  public static class Class_section_from_section_xmldamage extends Core.Class_base implements Func_section_from_section_xmldamage {

    @Override
    public Func_section_from_section_xmldamage vx_new(Object... vals) {
      Class_section_from_section_xmldamage output = new Class_section_from_section_xmldamage();
      return output;
    }

    @Override
    public Func_section_from_section_xmldamage vx_copy(Object... vals) {
      Class_section_from_section_xmldamage output = new Class_section_from_section_xmldamage();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmldamage", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmldamage vx_empty() {return e_section_from_section_xmldamage;}
    @Override
    public Func_section_from_section_xmldamage vx_type() {return t_section_from_section_xmldamage;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmldamage = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmldamage(section, xmldamage);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmldamage(final Base.Type_section section, final Xml.Type_xml xmldamage) {
      return Bookloader.f_section_from_section_xmldamage(section, xmldamage);
    }

  }

  public static final Func_section_from_section_xmldamage e_section_from_section_xmldamage = new Bookloader.Class_section_from_section_xmldamage();
  public static final Func_section_from_section_xmldamage t_section_from_section_xmldamage = new Bookloader.Class_section_from_section_xmldamage();

  public static Base.Type_section f_section_from_section_xmldamage(final Base.Type_section section, final Xml.Type_xml xmldamage) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_damage current = Bookloader.f_damage_from_xml(xmldamage);
        final Core.Type_string name = current.name();
        final Base.Type_damagemap origmap = section.damagemap();
        final Base.Type_damagemap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              current
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":damagemap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlitem
   * Return a section with new item added to itemmap
   * @param  {section} section
   * @param  {xml} xmlitem
   * @return {section}
   * (func section<-section-xmlitem)
   */
  public static interface Func_section_from_section_xmlitem extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlitem(final Base.Type_section section, final Xml.Type_xml xmlitem);
  }

  public static class Class_section_from_section_xmlitem extends Core.Class_base implements Func_section_from_section_xmlitem {

    @Override
    public Func_section_from_section_xmlitem vx_new(Object... vals) {
      Class_section_from_section_xmlitem output = new Class_section_from_section_xmlitem();
      return output;
    }

    @Override
    public Func_section_from_section_xmlitem vx_copy(Object... vals) {
      Class_section_from_section_xmlitem output = new Class_section_from_section_xmlitem();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlitem", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlitem vx_empty() {return e_section_from_section_xmlitem;}
    @Override
    public Func_section_from_section_xmlitem vx_type() {return t_section_from_section_xmlitem;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlitem = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlitem(section, xmlitem);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlitem(final Base.Type_section section, final Xml.Type_xml xmlitem) {
      return Bookloader.f_section_from_section_xmlitem(section, xmlitem);
    }

  }

  public static final Func_section_from_section_xmlitem e_section_from_section_xmlitem = new Bookloader.Class_section_from_section_xmlitem();
  public static final Func_section_from_section_xmlitem t_section_from_section_xmlitem = new Bookloader.Class_section_from_section_xmlitem();

  public static Base.Type_section f_section_from_section_xmlitem(final Base.Type_section section, final Xml.Type_xml xmlitem) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_item item = Bookloader.f_item_from_xml(xmlitem);
        final Core.Type_string name = item.name();
        final Base.Type_itemmap origmap = section.itemmap();
        final Base.Type_itemmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              item
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":itemmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmllocation
   * Return a section with new location added to locationmap
   * @param  {section} section
   * @param  {xml} xmllocation
   * @return {section}
   * (func section<-section-xmllocation)
   */
  public static interface Func_section_from_section_xmllocation extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmllocation(final Base.Type_section section, final Xml.Type_xml xmllocation);
  }

  public static class Class_section_from_section_xmllocation extends Core.Class_base implements Func_section_from_section_xmllocation {

    @Override
    public Func_section_from_section_xmllocation vx_new(Object... vals) {
      Class_section_from_section_xmllocation output = new Class_section_from_section_xmllocation();
      return output;
    }

    @Override
    public Func_section_from_section_xmllocation vx_copy(Object... vals) {
      Class_section_from_section_xmllocation output = new Class_section_from_section_xmllocation();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmllocation", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmllocation vx_empty() {return e_section_from_section_xmllocation;}
    @Override
    public Func_section_from_section_xmllocation vx_type() {return t_section_from_section_xmllocation;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmllocation = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmllocation(section, xmllocation);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmllocation(final Base.Type_section section, final Xml.Type_xml xmllocation) {
      return Bookloader.f_section_from_section_xmllocation(section, xmllocation);
    }

  }

  public static final Func_section_from_section_xmllocation e_section_from_section_xmllocation = new Bookloader.Class_section_from_section_xmllocation();
  public static final Func_section_from_section_xmllocation t_section_from_section_xmllocation = new Bookloader.Class_section_from_section_xmllocation();

  public static Base.Type_section f_section_from_section_xmllocation(final Base.Type_section section, final Xml.Type_xml xmllocation) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_location location = Bookloader.f_location_from_xml(xmllocation);
        final Core.Type_string name = location.name();
        final Base.Type_locationmap origmap = section.locationmap();
        final Base.Type_locationmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              location
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":locationmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlmodifier
   * Return a section with new modifier added to modifiermap
   * @param  {section} section
   * @param  {xml} xmlmodifier
   * @return {section}
   * (func section<-section-xmlmodifier)
   */
  public static interface Func_section_from_section_xmlmodifier extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlmodifier(final Base.Type_section section, final Xml.Type_xml xmlmodifier);
  }

  public static class Class_section_from_section_xmlmodifier extends Core.Class_base implements Func_section_from_section_xmlmodifier {

    @Override
    public Func_section_from_section_xmlmodifier vx_new(Object... vals) {
      Class_section_from_section_xmlmodifier output = new Class_section_from_section_xmlmodifier();
      return output;
    }

    @Override
    public Func_section_from_section_xmlmodifier vx_copy(Object... vals) {
      Class_section_from_section_xmlmodifier output = new Class_section_from_section_xmlmodifier();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlmodifier", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlmodifier vx_empty() {return e_section_from_section_xmlmodifier;}
    @Override
    public Func_section_from_section_xmlmodifier vx_type() {return t_section_from_section_xmlmodifier;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlmodifier = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlmodifier(section, xmlmodifier);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlmodifier(final Base.Type_section section, final Xml.Type_xml xmlmodifier) {
      return Bookloader.f_section_from_section_xmlmodifier(section, xmlmodifier);
    }

  }

  public static final Func_section_from_section_xmlmodifier e_section_from_section_xmlmodifier = new Bookloader.Class_section_from_section_xmlmodifier();
  public static final Func_section_from_section_xmlmodifier t_section_from_section_xmlmodifier = new Bookloader.Class_section_from_section_xmlmodifier();

  public static Base.Type_section f_section_from_section_xmlmodifier(final Base.Type_section section, final Xml.Type_xml xmlmodifier) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_modifier modifier = Bookloader.f_modifier_from_xml(xmlmodifier);
        final Core.Type_string name = modifier.name();
        final Base.Type_modifiermap origmap = section.modifiermap();
        final Base.Type_modifiermap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              modifier
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":modifiermap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlpower
   * Return a section with new power added to powermap
   * @param  {section} section
   * @param  {xml} xmlpower
   * @return {section}
   * (func section<-section-xmlpower)
   */
  public static interface Func_section_from_section_xmlpower extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlpower(final Base.Type_section section, final Xml.Type_xml xmlpower);
  }

  public static class Class_section_from_section_xmlpower extends Core.Class_base implements Func_section_from_section_xmlpower {

    @Override
    public Func_section_from_section_xmlpower vx_new(Object... vals) {
      Class_section_from_section_xmlpower output = new Class_section_from_section_xmlpower();
      return output;
    }

    @Override
    public Func_section_from_section_xmlpower vx_copy(Object... vals) {
      Class_section_from_section_xmlpower output = new Class_section_from_section_xmlpower();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlpower", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlpower vx_empty() {return e_section_from_section_xmlpower;}
    @Override
    public Func_section_from_section_xmlpower vx_type() {return t_section_from_section_xmlpower;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlpower = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlpower(section, xmlpower);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlpower(final Base.Type_section section, final Xml.Type_xml xmlpower) {
      return Bookloader.f_section_from_section_xmlpower(section, xmlpower);
    }

  }

  public static final Func_section_from_section_xmlpower e_section_from_section_xmlpower = new Bookloader.Class_section_from_section_xmlpower();
  public static final Func_section_from_section_xmlpower t_section_from_section_xmlpower = new Bookloader.Class_section_from_section_xmlpower();

  public static Base.Type_section f_section_from_section_xmlpower(final Base.Type_section section, final Xml.Type_xml xmlpower) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_power power = Bookloader.f_power_from_xml(xmlpower);
        final Core.Type_string name = power.name();
        final Base.Type_powermap origmap = section.powermap();
        final Base.Type_powermap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              power
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":powermap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlrule
   * Return a section with new rule added to rulemap
   * @param  {section} section
   * @param  {xml} xmlrule
   * @return {section}
   * (func section<-section-xmlrule)
   */
  public static interface Func_section_from_section_xmlrule extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlrule(final Base.Type_section section, final Xml.Type_xml xmlrule);
  }

  public static class Class_section_from_section_xmlrule extends Core.Class_base implements Func_section_from_section_xmlrule {

    @Override
    public Func_section_from_section_xmlrule vx_new(Object... vals) {
      Class_section_from_section_xmlrule output = new Class_section_from_section_xmlrule();
      return output;
    }

    @Override
    public Func_section_from_section_xmlrule vx_copy(Object... vals) {
      Class_section_from_section_xmlrule output = new Class_section_from_section_xmlrule();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlrule", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlrule vx_empty() {return e_section_from_section_xmlrule;}
    @Override
    public Func_section_from_section_xmlrule vx_type() {return t_section_from_section_xmlrule;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlrule = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlrule(section, xmlrule);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlrule(final Base.Type_section section, final Xml.Type_xml xmlrule) {
      return Bookloader.f_section_from_section_xmlrule(section, xmlrule);
    }

  }

  public static final Func_section_from_section_xmlrule e_section_from_section_xmlrule = new Bookloader.Class_section_from_section_xmlrule();
  public static final Func_section_from_section_xmlrule t_section_from_section_xmlrule = new Bookloader.Class_section_from_section_xmlrule();

  public static Base.Type_section f_section_from_section_xmlrule(final Base.Type_section section, final Xml.Type_xml xmlrule) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_rule rule = Bookloader.f_rule_from_xml(xmlrule);
        final Core.Type_string name = rule.name();
        final Base.Type_rulemap origmap = section.rulemap();
        final Base.Type_rulemap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              rule
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":rulemap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlscenario
   * Return a section with new scenario added to scenariomap
   * @param  {section} section
   * @param  {xml} xmlscenario
   * @return {section}
   * (func section<-section-xmlscenario)
   */
  public static interface Func_section_from_section_xmlscenario extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlscenario(final Base.Type_section section, final Xml.Type_xml xmlscenario);
  }

  public static class Class_section_from_section_xmlscenario extends Core.Class_base implements Func_section_from_section_xmlscenario {

    @Override
    public Func_section_from_section_xmlscenario vx_new(Object... vals) {
      Class_section_from_section_xmlscenario output = new Class_section_from_section_xmlscenario();
      return output;
    }

    @Override
    public Func_section_from_section_xmlscenario vx_copy(Object... vals) {
      Class_section_from_section_xmlscenario output = new Class_section_from_section_xmlscenario();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlscenario", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlscenario vx_empty() {return e_section_from_section_xmlscenario;}
    @Override
    public Func_section_from_section_xmlscenario vx_type() {return t_section_from_section_xmlscenario;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlscenario = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlscenario(section, xmlscenario);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlscenario(final Base.Type_section section, final Xml.Type_xml xmlscenario) {
      return Bookloader.f_section_from_section_xmlscenario(section, xmlscenario);
    }

  }

  public static final Func_section_from_section_xmlscenario e_section_from_section_xmlscenario = new Bookloader.Class_section_from_section_xmlscenario();
  public static final Func_section_from_section_xmlscenario t_section_from_section_xmlscenario = new Bookloader.Class_section_from_section_xmlscenario();

  public static Base.Type_section f_section_from_section_xmlscenario(final Base.Type_section section, final Xml.Type_xml xmlscenario) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_scenario scenario = Bookloader.f_scenario_from_xml(xmlscenario);
        final Core.Type_string name = scenario.name();
        final Base.Type_scenariomap origmap = section.scenariomap();
        final Base.Type_scenariomap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              scenario
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":scenariomap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlsection
   * Return a section with new section added to sectionmap
   * @param  {section} section
   * @param  {xml} xmlsection
   * @return {section}
   * (func section<-section-xmlsection)
   */
  public static interface Func_section_from_section_xmlsection extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlsection(final Base.Type_section section, final Xml.Type_xml xmlsection);
  }

  public static class Class_section_from_section_xmlsection extends Core.Class_base implements Func_section_from_section_xmlsection {

    @Override
    public Func_section_from_section_xmlsection vx_new(Object... vals) {
      Class_section_from_section_xmlsection output = new Class_section_from_section_xmlsection();
      return output;
    }

    @Override
    public Func_section_from_section_xmlsection vx_copy(Object... vals) {
      Class_section_from_section_xmlsection output = new Class_section_from_section_xmlsection();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlsection", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlsection vx_empty() {return e_section_from_section_xmlsection;}
    @Override
    public Func_section_from_section_xmlsection vx_type() {return t_section_from_section_xmlsection;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlsection = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlsection(section, xmlsection);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlsection(final Base.Type_section section, final Xml.Type_xml xmlsection) {
      return Bookloader.f_section_from_section_xmlsection(section, xmlsection);
    }

  }

  public static final Func_section_from_section_xmlsection e_section_from_section_xmlsection = new Bookloader.Class_section_from_section_xmlsection();
  public static final Func_section_from_section_xmlsection t_section_from_section_xmlsection = new Bookloader.Class_section_from_section_xmlsection();

  public static Base.Type_section f_section_from_section_xmlsection(final Base.Type_section section, final Xml.Type_xml xmlsection) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_section subsect = Bookloader.f_section_from_xml(xmlsection);
        final Core.Type_string name = subsect.name();
        final Base.Type_sectionmap origmap = section.sectionmap();
        final Base.Type_sectionmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              subsect
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":sectionmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlskill
   * Return a section with new skill added to skillmap
   * @param  {section} section
   * @param  {xml} xmlskill
   * @return {section}
   * (func section<-section-xmlskill)
   */
  public static interface Func_section_from_section_xmlskill extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlskill(final Base.Type_section section, final Xml.Type_xml xmlskill);
  }

  public static class Class_section_from_section_xmlskill extends Core.Class_base implements Func_section_from_section_xmlskill {

    @Override
    public Func_section_from_section_xmlskill vx_new(Object... vals) {
      Class_section_from_section_xmlskill output = new Class_section_from_section_xmlskill();
      return output;
    }

    @Override
    public Func_section_from_section_xmlskill vx_copy(Object... vals) {
      Class_section_from_section_xmlskill output = new Class_section_from_section_xmlskill();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlskill", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlskill vx_empty() {return e_section_from_section_xmlskill;}
    @Override
    public Func_section_from_section_xmlskill vx_type() {return t_section_from_section_xmlskill;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlskill = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlskill(section, xmlskill);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlskill(final Base.Type_section section, final Xml.Type_xml xmlskill) {
      return Bookloader.f_section_from_section_xmlskill(section, xmlskill);
    }

  }

  public static final Func_section_from_section_xmlskill e_section_from_section_xmlskill = new Bookloader.Class_section_from_section_xmlskill();
  public static final Func_section_from_section_xmlskill t_section_from_section_xmlskill = new Bookloader.Class_section_from_section_xmlskill();

  public static Base.Type_section f_section_from_section_xmlskill(final Base.Type_section section, final Xml.Type_xml xmlskill) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_skill skill = Bookloader.f_skill_from_xml(xmlskill);
        final Core.Type_string name = skill.name();
        final Base.Type_skillmap origmap = section.skillmap();
        final Base.Type_skillmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              skill
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":skillmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlterrain
   * Return a section with new terrain added to terrainmap
   * @param  {section} section
   * @param  {xml} xmlterrain
   * @return {section}
   * (func section<-section-xmlterrain)
   */
  public static interface Func_section_from_section_xmlterrain extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlterrain(final Base.Type_section section, final Xml.Type_xml xmlterrain);
  }

  public static class Class_section_from_section_xmlterrain extends Core.Class_base implements Func_section_from_section_xmlterrain {

    @Override
    public Func_section_from_section_xmlterrain vx_new(Object... vals) {
      Class_section_from_section_xmlterrain output = new Class_section_from_section_xmlterrain();
      return output;
    }

    @Override
    public Func_section_from_section_xmlterrain vx_copy(Object... vals) {
      Class_section_from_section_xmlterrain output = new Class_section_from_section_xmlterrain();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlterrain", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlterrain vx_empty() {return e_section_from_section_xmlterrain;}
    @Override
    public Func_section_from_section_xmlterrain vx_type() {return t_section_from_section_xmlterrain;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlterrain = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlterrain(section, xmlterrain);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlterrain(final Base.Type_section section, final Xml.Type_xml xmlterrain) {
      return Bookloader.f_section_from_section_xmlterrain(section, xmlterrain);
    }

  }

  public static final Func_section_from_section_xmlterrain e_section_from_section_xmlterrain = new Bookloader.Class_section_from_section_xmlterrain();
  public static final Func_section_from_section_xmlterrain t_section_from_section_xmlterrain = new Bookloader.Class_section_from_section_xmlterrain();

  public static Base.Type_section f_section_from_section_xmlterrain(final Base.Type_section section, final Xml.Type_xml xmlterrain) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_terrain current = Bookloader.f_terrain_from_xml(xmlterrain);
        final Core.Type_string name = current.name();
        final Base.Type_terrainmap origmap = section.terrainmap();
        final Base.Type_terrainmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              current
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":terrainmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_section_xmlunit
   * Return a section with new unit added to unitmap
   * @param  {section} section
   * @param  {xml} xmlunit
   * @return {section}
   * (func section<-section-xmlunit)
   */
  public static interface Func_section_from_section_xmlunit extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_section vx_section_from_section_xmlunit(final Base.Type_section section, final Xml.Type_xml xmlunit);
  }

  public static class Class_section_from_section_xmlunit extends Core.Class_base implements Func_section_from_section_xmlunit {

    @Override
    public Func_section_from_section_xmlunit vx_new(Object... vals) {
      Class_section_from_section_xmlunit output = new Class_section_from_section_xmlunit();
      return output;
    }

    @Override
    public Func_section_from_section_xmlunit vx_copy(Object... vals) {
      Class_section_from_section_xmlunit output = new Class_section_from_section_xmlunit();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-section-xmlunit", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_section_xmlunit vx_empty() {return e_section_from_section_xmlunit;}
    @Override
    public Func_section_from_section_xmlunit vx_type() {return t_section_from_section_xmlunit;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_section section = Core.f_any_from_any(Base.t_section, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlunit = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_section_from_section_xmlunit(section, xmlunit);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_section_xmlunit(final Base.Type_section section, final Xml.Type_xml xmlunit) {
      return Bookloader.f_section_from_section_xmlunit(section, xmlunit);
    }

  }

  public static final Func_section_from_section_xmlunit e_section_from_section_xmlunit = new Bookloader.Class_section_from_section_xmlunit();
  public static final Func_section_from_section_xmlunit t_section_from_section_xmlunit = new Bookloader.Class_section_from_section_xmlunit();

  public static Base.Type_section f_section_from_section_xmlunit(final Base.Type_section section, final Xml.Type_xml xmlunit) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unit unit = Bookloader.f_unit_from_xml(xmlunit);
        final Core.Type_string name = unit.name();
        final Base.Type_unitmap origmap = section.unitmap();
        final Base.Type_unitmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              unit
          )
        );
        return Core.f_copy(
          section,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function section_from_xml
   * Returns a section from a given Xml.
   * @param  {xml} xml
   * @return {section}
   * (func section<-xml)
   */
  public static interface Func_section_from_xml extends Core.Func_any_from_any {
    public Base.Type_section vx_section_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_section_from_xml extends Core.Class_base implements Func_section_from_xml {

    @Override
    public Func_section_from_xml vx_new(Object... vals) {
      Class_section_from_xml output = new Class_section_from_xml();
      return output;
    }

    @Override
    public Func_section_from_xml vx_copy(Object... vals) {
      Class_section_from_xml output = new Class_section_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "section<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "section", // name
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
    public Func_section_from_xml vx_empty() {return e_section_from_xml;}
    @Override
    public Func_section_from_xml vx_type() {return t_section_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_section_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_section_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_section vx_section_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_section_from_xml(xml);
    }

  }

  public static final Func_section_from_xml e_section_from_xml = new Bookloader.Class_section_from_xml();
  public static final Func_section_from_xml t_section_from_xml = new Bookloader.Class_section_from_xml();

  public static Base.Type_section f_section_from_xml(final Xml.Type_xml xml) {
    Base.Type_section output = Base.e_section;
    output = Core.f_let(
      Base.t_section,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Xml.Type_xmllist children = xml.children();
        final Base.Type_section section = Bookloader.f_section_from_section_stringmap(
          Core.f_empty(
            Base.t_section
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_section,
          children,
          section,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any section_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_section section_lmb = Core.f_any_from_any(Base.t_section, section_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_section_from_section_xmlchild(section_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function skill_from_skill_key_value
   * Returns a modified skill from a key value.
   * @param  {skill} current
   * @param  {string} key
   * @param  {string} value
   * @return {skill}
   * (func skill<-skill-key-value)
   */
  public static interface Func_skill_from_skill_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_skill vx_skill_from_skill_key_value(final Base.Type_skill current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_skill_from_skill_key_value extends Core.Class_base implements Func_skill_from_skill_key_value {

    @Override
    public Func_skill_from_skill_key_value vx_new(Object... vals) {
      Class_skill_from_skill_key_value output = new Class_skill_from_skill_key_value();
      return output;
    }

    @Override
    public Func_skill_from_skill_key_value vx_copy(Object... vals) {
      Class_skill_from_skill_key_value output = new Class_skill_from_skill_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "skill<-skill-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "skill", // name
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
    public Func_skill_from_skill_key_value vx_empty() {return e_skill_from_skill_key_value;}
    @Override
    public Func_skill_from_skill_key_value vx_type() {return t_skill_from_skill_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_skill current = Core.f_any_from_any(Base.t_skill, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_skill_from_skill_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_skill vx_skill_from_skill_key_value(final Base.Type_skill current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_skill_from_skill_key_value(current, key, value);
    }

  }

  public static final Func_skill_from_skill_key_value e_skill_from_skill_key_value = new Bookloader.Class_skill_from_skill_key_value();
  public static final Func_skill_from_skill_key_value t_skill_from_skill_key_value = new Bookloader.Class_skill_from_skill_key_value();

  public static Base.Type_skill f_skill_from_skill_key_value(final Base.Type_skill current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_skill output = Base.e_skill;
    output = Core.f_switch(
      Base.t_skill,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("stat")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_skill,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function skill_from_skill_stringmap
   * Returns a new skill from a propmap.
   * @param  {skill} skill
   * @param  {stringmap} propmap
   * @return {skill}
   * (func skill<-skill-stringmap)
   */
  public static interface Func_skill_from_skill_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_skill vx_skill_from_skill_stringmap(final Base.Type_skill skill, final Core.Type_stringmap propmap);
  }

  public static class Class_skill_from_skill_stringmap extends Core.Class_base implements Func_skill_from_skill_stringmap {

    @Override
    public Func_skill_from_skill_stringmap vx_new(Object... vals) {
      Class_skill_from_skill_stringmap output = new Class_skill_from_skill_stringmap();
      return output;
    }

    @Override
    public Func_skill_from_skill_stringmap vx_copy(Object... vals) {
      Class_skill_from_skill_stringmap output = new Class_skill_from_skill_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "skill<-skill-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "skill", // name
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
    public Func_skill_from_skill_stringmap vx_empty() {return e_skill_from_skill_stringmap;}
    @Override
    public Func_skill_from_skill_stringmap vx_type() {return t_skill_from_skill_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_skill skill = Core.f_any_from_any(Base.t_skill, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_skill_from_skill_stringmap(skill, propmap);
      return output;
    }

    @Override
    public Base.Type_skill vx_skill_from_skill_stringmap(final Base.Type_skill skill, final Core.Type_stringmap propmap) {
      return Bookloader.f_skill_from_skill_stringmap(skill, propmap);
    }

  }

  public static final Func_skill_from_skill_stringmap e_skill_from_skill_stringmap = new Bookloader.Class_skill_from_skill_stringmap();
  public static final Func_skill_from_skill_stringmap t_skill_from_skill_stringmap = new Bookloader.Class_skill_from_skill_stringmap();

  public static Base.Type_skill f_skill_from_skill_stringmap(final Base.Type_skill skill, final Core.Type_stringmap propmap) {
    Base.Type_skill output = Base.e_skill;
    output = Core.f_any_from_map_start_reduce(
      Base.t_skill,
      propmap,
      skill,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_skill current_lmb = Core.f_any_from_any(Base.t_skill, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_skill_from_skill_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function skill_from_skill_xmlability
   * Return a skill with new ability added to abilitymap
   * @param  {skill} skill
   * @param  {xml} xmlability
   * @return {skill}
   * (func skill<-skill-xmlability)
   */
  public static interface Func_skill_from_skill_xmlability extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_skill vx_skill_from_skill_xmlability(final Base.Type_skill skill, final Xml.Type_xml xmlability);
  }

  public static class Class_skill_from_skill_xmlability extends Core.Class_base implements Func_skill_from_skill_xmlability {

    @Override
    public Func_skill_from_skill_xmlability vx_new(Object... vals) {
      Class_skill_from_skill_xmlability output = new Class_skill_from_skill_xmlability();
      return output;
    }

    @Override
    public Func_skill_from_skill_xmlability vx_copy(Object... vals) {
      Class_skill_from_skill_xmlability output = new Class_skill_from_skill_xmlability();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "skill<-skill-xmlability", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "skill", // name
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
    public Func_skill_from_skill_xmlability vx_empty() {return e_skill_from_skill_xmlability;}
    @Override
    public Func_skill_from_skill_xmlability vx_type() {return t_skill_from_skill_xmlability;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_skill skill = Core.f_any_from_any(Base.t_skill, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlability = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_skill_from_skill_xmlability(skill, xmlability);
      return output;
    }

    @Override
    public Base.Type_skill vx_skill_from_skill_xmlability(final Base.Type_skill skill, final Xml.Type_xml xmlability) {
      return Bookloader.f_skill_from_skill_xmlability(skill, xmlability);
    }

  }

  public static final Func_skill_from_skill_xmlability e_skill_from_skill_xmlability = new Bookloader.Class_skill_from_skill_xmlability();
  public static final Func_skill_from_skill_xmlability t_skill_from_skill_xmlability = new Bookloader.Class_skill_from_skill_xmlability();

  public static Base.Type_skill f_skill_from_skill_xmlability(final Base.Type_skill skill, final Xml.Type_xml xmlability) {
    Base.Type_skill output = Base.e_skill;
    output = Core.f_let(
      Base.t_skill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_ability ability = Bookloader.f_ability_from_xml(xmlability);
        final Core.Type_string name = ability.name();
        final Base.Type_abilitymap origmap = skill.abilitymap();
        final Base.Type_abilitymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              ability
          )
        );
        return Core.f_copy(
          skill,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":abilitymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function skill_from_skill_xmlchild
   * Returns a modified skill based on a given child Xml.
   * @param  {skill} skill
   * @param  {xml} child
   * @return {skill}
   * (func skill<-skill-xmlchild)
   */
  public static interface Func_skill_from_skill_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_skill vx_skill_from_skill_xmlchild(final Base.Type_skill skill, final Xml.Type_xml child);
  }

  public static class Class_skill_from_skill_xmlchild extends Core.Class_base implements Func_skill_from_skill_xmlchild {

    @Override
    public Func_skill_from_skill_xmlchild vx_new(Object... vals) {
      Class_skill_from_skill_xmlchild output = new Class_skill_from_skill_xmlchild();
      return output;
    }

    @Override
    public Func_skill_from_skill_xmlchild vx_copy(Object... vals) {
      Class_skill_from_skill_xmlchild output = new Class_skill_from_skill_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "skill<-skill-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "skill", // name
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
    public Func_skill_from_skill_xmlchild vx_empty() {return e_skill_from_skill_xmlchild;}
    @Override
    public Func_skill_from_skill_xmlchild vx_type() {return t_skill_from_skill_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_skill skill = Core.f_any_from_any(Base.t_skill, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_skill_from_skill_xmlchild(skill, child);
      return output;
    }

    @Override
    public Base.Type_skill vx_skill_from_skill_xmlchild(final Base.Type_skill skill, final Xml.Type_xml child) {
      return Bookloader.f_skill_from_skill_xmlchild(skill, child);
    }

  }

  public static final Func_skill_from_skill_xmlchild e_skill_from_skill_xmlchild = new Bookloader.Class_skill_from_skill_xmlchild();
  public static final Func_skill_from_skill_xmlchild t_skill_from_skill_xmlchild = new Bookloader.Class_skill_from_skill_xmlchild();

  public static Base.Type_skill f_skill_from_skill_xmlchild(final Base.Type_skill skill, final Xml.Type_xml child) {
    Base.Type_skill output = Base.e_skill;
    output = Core.f_let(
      Base.t_skill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_skill,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return skill;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  skill,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("ability"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_skill_from_skill_xmlability(skill, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("specialty"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_skill_from_skill_xmlspecialty(skill, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  skill,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_skill,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function skill_from_skill_xmlspecialty
   * Return a skill with new specialty added to specialtymap
   * @param  {skill} skill
   * @param  {xml} xmlspecialty
   * @return {skill}
   * (func skill<-skill-xmlspecialty)
   */
  public static interface Func_skill_from_skill_xmlspecialty extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_skill vx_skill_from_skill_xmlspecialty(final Base.Type_skill skill, final Xml.Type_xml xmlspecialty);
  }

  public static class Class_skill_from_skill_xmlspecialty extends Core.Class_base implements Func_skill_from_skill_xmlspecialty {

    @Override
    public Func_skill_from_skill_xmlspecialty vx_new(Object... vals) {
      Class_skill_from_skill_xmlspecialty output = new Class_skill_from_skill_xmlspecialty();
      return output;
    }

    @Override
    public Func_skill_from_skill_xmlspecialty vx_copy(Object... vals) {
      Class_skill_from_skill_xmlspecialty output = new Class_skill_from_skill_xmlspecialty();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "skill<-skill-xmlspecialty", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "skill", // name
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
    public Func_skill_from_skill_xmlspecialty vx_empty() {return e_skill_from_skill_xmlspecialty;}
    @Override
    public Func_skill_from_skill_xmlspecialty vx_type() {return t_skill_from_skill_xmlspecialty;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_skill skill = Core.f_any_from_any(Base.t_skill, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlspecialty = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_skill_from_skill_xmlspecialty(skill, xmlspecialty);
      return output;
    }

    @Override
    public Base.Type_skill vx_skill_from_skill_xmlspecialty(final Base.Type_skill skill, final Xml.Type_xml xmlspecialty) {
      return Bookloader.f_skill_from_skill_xmlspecialty(skill, xmlspecialty);
    }

  }

  public static final Func_skill_from_skill_xmlspecialty e_skill_from_skill_xmlspecialty = new Bookloader.Class_skill_from_skill_xmlspecialty();
  public static final Func_skill_from_skill_xmlspecialty t_skill_from_skill_xmlspecialty = new Bookloader.Class_skill_from_skill_xmlspecialty();

  public static Base.Type_skill f_skill_from_skill_xmlspecialty(final Base.Type_skill skill, final Xml.Type_xml xmlspecialty) {
    Base.Type_skill output = Base.e_skill;
    output = Core.f_let(
      Base.t_skill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_specialty specialty = Bookloader.f_specialty_from_xml(xmlspecialty);
        final Core.Type_string name = specialty.name();
        final Base.Type_specialtymap origmap = skill.specialtymap();
        final Base.Type_specialtymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              specialty
          )
        );
        return Core.f_copy(
          skill,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":specialtymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function skill_from_xml
   * Returns a skill from a given xml.
   * @param  {xml} xml
   * @return {skill}
   * (func skill<-xml)
   */
  public static interface Func_skill_from_xml extends Core.Func_any_from_any {
    public Base.Type_skill vx_skill_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_skill_from_xml extends Core.Class_base implements Func_skill_from_xml {

    @Override
    public Func_skill_from_xml vx_new(Object... vals) {
      Class_skill_from_xml output = new Class_skill_from_xml();
      return output;
    }

    @Override
    public Func_skill_from_xml vx_copy(Object... vals) {
      Class_skill_from_xml output = new Class_skill_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "skill<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "skill", // name
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
    public Func_skill_from_xml vx_empty() {return e_skill_from_xml;}
    @Override
    public Func_skill_from_xml vx_type() {return t_skill_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_skill_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_skill_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_skill vx_skill_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_skill_from_xml(xml);
    }

  }

  public static final Func_skill_from_xml e_skill_from_xml = new Bookloader.Class_skill_from_xml();
  public static final Func_skill_from_xml t_skill_from_xml = new Bookloader.Class_skill_from_xml();

  public static Base.Type_skill f_skill_from_xml(final Xml.Type_xml xml) {
    Base.Type_skill output = Base.e_skill;
    output = Core.f_let(
      Base.t_skill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_skill skill = Bookloader.f_skill_from_skill_stringmap(
          Core.f_empty(
            Base.t_skill
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_skill,
          xml.children(),
          skill,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any skill_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_skill skill_lmb = Core.f_any_from_any(Base.t_skill, skill_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_skill_from_skill_xmlchild(skill_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function specialty_from_specialty_key_value
   * Returns a modified specialty from a key value.
   * @param  {specialty} current
   * @param  {string} key
   * @param  {string} value
   * @return {specialty}
   * (func specialty<-specialty-key-value)
   */
  public static interface Func_specialty_from_specialty_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_specialty vx_specialty_from_specialty_key_value(final Base.Type_specialty current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_specialty_from_specialty_key_value extends Core.Class_base implements Func_specialty_from_specialty_key_value {

    @Override
    public Func_specialty_from_specialty_key_value vx_new(Object... vals) {
      Class_specialty_from_specialty_key_value output = new Class_specialty_from_specialty_key_value();
      return output;
    }

    @Override
    public Func_specialty_from_specialty_key_value vx_copy(Object... vals) {
      Class_specialty_from_specialty_key_value output = new Class_specialty_from_specialty_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "specialty<-specialty-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "specialty", // name
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
    public Func_specialty_from_specialty_key_value vx_empty() {return e_specialty_from_specialty_key_value;}
    @Override
    public Func_specialty_from_specialty_key_value vx_type() {return t_specialty_from_specialty_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_specialty current = Core.f_any_from_any(Base.t_specialty, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_specialty_from_specialty_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_specialty vx_specialty_from_specialty_key_value(final Base.Type_specialty current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_specialty_from_specialty_key_value(current, key, value);
    }

  }

  public static final Func_specialty_from_specialty_key_value e_specialty_from_specialty_key_value = new Bookloader.Class_specialty_from_specialty_key_value();
  public static final Func_specialty_from_specialty_key_value t_specialty_from_specialty_key_value = new Bookloader.Class_specialty_from_specialty_key_value();

  public static Base.Type_specialty f_specialty_from_specialty_key_value(final Base.Type_specialty current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_specialty output = Base.e_specialty;
    output = Core.f_switch(
      Base.t_specialty,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_specialty,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function specialty_from_specialty_stringmap
   * Returns a new specialty from a propmap.
   * @param  {specialty} specialty
   * @param  {stringmap} propmap
   * @return {specialty}
   * (func specialty<-specialty-stringmap)
   */
  public static interface Func_specialty_from_specialty_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_specialty vx_specialty_from_specialty_stringmap(final Base.Type_specialty specialty, final Core.Type_stringmap propmap);
  }

  public static class Class_specialty_from_specialty_stringmap extends Core.Class_base implements Func_specialty_from_specialty_stringmap {

    @Override
    public Func_specialty_from_specialty_stringmap vx_new(Object... vals) {
      Class_specialty_from_specialty_stringmap output = new Class_specialty_from_specialty_stringmap();
      return output;
    }

    @Override
    public Func_specialty_from_specialty_stringmap vx_copy(Object... vals) {
      Class_specialty_from_specialty_stringmap output = new Class_specialty_from_specialty_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "specialty<-specialty-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "specialty", // name
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
    public Func_specialty_from_specialty_stringmap vx_empty() {return e_specialty_from_specialty_stringmap;}
    @Override
    public Func_specialty_from_specialty_stringmap vx_type() {return t_specialty_from_specialty_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_specialty specialty = Core.f_any_from_any(Base.t_specialty, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_specialty_from_specialty_stringmap(specialty, propmap);
      return output;
    }

    @Override
    public Base.Type_specialty vx_specialty_from_specialty_stringmap(final Base.Type_specialty specialty, final Core.Type_stringmap propmap) {
      return Bookloader.f_specialty_from_specialty_stringmap(specialty, propmap);
    }

  }

  public static final Func_specialty_from_specialty_stringmap e_specialty_from_specialty_stringmap = new Bookloader.Class_specialty_from_specialty_stringmap();
  public static final Func_specialty_from_specialty_stringmap t_specialty_from_specialty_stringmap = new Bookloader.Class_specialty_from_specialty_stringmap();

  public static Base.Type_specialty f_specialty_from_specialty_stringmap(final Base.Type_specialty specialty, final Core.Type_stringmap propmap) {
    Base.Type_specialty output = Base.e_specialty;
    output = Core.f_any_from_map_start_reduce(
      Base.t_specialty,
      propmap,
      specialty,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_specialty current_lmb = Core.f_any_from_any(Base.t_specialty, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_specialty_from_specialty_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function specialty_from_specialty_xmlchild
   * Returns a modified specialty based on a given child xml.
   * @param  {specialty} specialty
   * @param  {xml} child
   * @return {specialty}
   * (func specialty<-specialty-xmlchild)
   */
  public static interface Func_specialty_from_specialty_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_specialty vx_specialty_from_specialty_xmlchild(final Base.Type_specialty specialty, final Xml.Type_xml child);
  }

  public static class Class_specialty_from_specialty_xmlchild extends Core.Class_base implements Func_specialty_from_specialty_xmlchild {

    @Override
    public Func_specialty_from_specialty_xmlchild vx_new(Object... vals) {
      Class_specialty_from_specialty_xmlchild output = new Class_specialty_from_specialty_xmlchild();
      return output;
    }

    @Override
    public Func_specialty_from_specialty_xmlchild vx_copy(Object... vals) {
      Class_specialty_from_specialty_xmlchild output = new Class_specialty_from_specialty_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "specialty<-specialty-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "specialty", // name
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
    public Func_specialty_from_specialty_xmlchild vx_empty() {return e_specialty_from_specialty_xmlchild;}
    @Override
    public Func_specialty_from_specialty_xmlchild vx_type() {return t_specialty_from_specialty_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_specialty specialty = Core.f_any_from_any(Base.t_specialty, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_specialty_from_specialty_xmlchild(specialty, child);
      return output;
    }

    @Override
    public Base.Type_specialty vx_specialty_from_specialty_xmlchild(final Base.Type_specialty specialty, final Xml.Type_xml child) {
      return Bookloader.f_specialty_from_specialty_xmlchild(specialty, child);
    }

  }

  public static final Func_specialty_from_specialty_xmlchild e_specialty_from_specialty_xmlchild = new Bookloader.Class_specialty_from_specialty_xmlchild();
  public static final Func_specialty_from_specialty_xmlchild t_specialty_from_specialty_xmlchild = new Bookloader.Class_specialty_from_specialty_xmlchild();

  public static Base.Type_specialty f_specialty_from_specialty_xmlchild(final Base.Type_specialty specialty, final Xml.Type_xml child) {
    Base.Type_specialty output = Base.e_specialty;
    output = Core.f_let(
      Base.t_specialty,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_specialty,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return specialty;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  specialty,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  specialty,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_specialty,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function specialty_from_xml
   * Returns a specialty from a given xml.
   * @param  {xml} xml
   * @return {specialty}
   * (func specialty<-xml)
   */
  public static interface Func_specialty_from_xml extends Core.Func_any_from_any {
    public Base.Type_specialty vx_specialty_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_specialty_from_xml extends Core.Class_base implements Func_specialty_from_xml {

    @Override
    public Func_specialty_from_xml vx_new(Object... vals) {
      Class_specialty_from_xml output = new Class_specialty_from_xml();
      return output;
    }

    @Override
    public Func_specialty_from_xml vx_copy(Object... vals) {
      Class_specialty_from_xml output = new Class_specialty_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "specialty<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "specialty", // name
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
    public Func_specialty_from_xml vx_empty() {return e_specialty_from_xml;}
    @Override
    public Func_specialty_from_xml vx_type() {return t_specialty_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_specialty_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_specialty_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_specialty vx_specialty_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_specialty_from_xml(xml);
    }

  }

  public static final Func_specialty_from_xml e_specialty_from_xml = new Bookloader.Class_specialty_from_xml();
  public static final Func_specialty_from_xml t_specialty_from_xml = new Bookloader.Class_specialty_from_xml();

  public static Base.Type_specialty f_specialty_from_xml(final Xml.Type_xml xml) {
    Base.Type_specialty output = Base.e_specialty;
    output = Core.f_let(
      Base.t_specialty,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_specialty spc = Bookloader.f_specialty_from_specialty_stringmap(
          Core.f_empty(
            Base.t_specialty
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_specialty,
          xml.children(),
          spc,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any specialty_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_specialty specialty_lmb = Core.f_any_from_any(Base.t_specialty, specialty_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_specialty_from_specialty_xmlchild(specialty_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function string_read_from_bookname
   * Returns text from a file with bookname.
   * @param  {string} bookname
   * @return {string}
   * (func string-read<-bookname)
   */
  public static interface Func_string_read_from_bookname extends Core.Func_any_from_any_context {
    public Core.Type_string vx_string_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname);
  }

  public static class Class_string_read_from_bookname extends Core.Class_base implements Func_string_read_from_bookname {

    @Override
    public Func_string_read_from_bookname vx_new(Object... vals) {
      Class_string_read_from_bookname output = new Class_string_read_from_bookname();
      return output;
    }

    @Override
    public Func_string_read_from_bookname vx_copy(Object... vals) {
      Class_string_read_from_bookname output = new Class_string_read_from_bookname();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "string-read<-bookname", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
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
    public Func_string_read_from_bookname vx_empty() {return e_string_read_from_bookname;}
    @Override
    public Func_string_read_from_bookname vx_type() {return t_string_read_from_bookname;}

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {return Core.e_any_from_any_context;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Bookloader.f_string_read_from_bookname(context, inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string bookname = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_string_read_from_bookname(context, bookname);
      return output;
    }

    @Override
    public Core.Type_string vx_string_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname) {
      return Bookloader.f_string_read_from_bookname(context, bookname);
    }

  }

  public static final Func_string_read_from_bookname e_string_read_from_bookname = new Bookloader.Class_string_read_from_bookname();
  public static final Func_string_read_from_bookname t_string_read_from_bookname = new Bookloader.Class_string_read_from_bookname();

  public static Core.Type_string f_string_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname) {
    Core.Type_string output = Core.e_string;
    output = File.f_string_read_from_file(
      context,
      Bookloader.f_file_read_from_bookname(bookname)
    );
    return output;
  }

  /**
   * @function string_vxlisp_header_from_chaptermap
   * Returns a vxlisp string from a chaptermap.
   * @param  {chaptermap} chaptermap
   * @return {string}
   * (func string-vxlisp-header<-chaptermap)
   */
  public static interface Func_string_vxlisp_header_from_chaptermap extends Core.Func_any_from_any {
    public Core.Type_string vx_string_vxlisp_header_from_chaptermap(final Base.Type_chaptermap chaptermap);
  }

  public static class Class_string_vxlisp_header_from_chaptermap extends Core.Class_base implements Func_string_vxlisp_header_from_chaptermap {

    @Override
    public Func_string_vxlisp_header_from_chaptermap vx_new(Object... vals) {
      Class_string_vxlisp_header_from_chaptermap output = new Class_string_vxlisp_header_from_chaptermap();
      return output;
    }

    @Override
    public Func_string_vxlisp_header_from_chaptermap vx_copy(Object... vals) {
      Class_string_vxlisp_header_from_chaptermap output = new Class_string_vxlisp_header_from_chaptermap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "string-vxlisp-header<-chaptermap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
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
    public Func_string_vxlisp_header_from_chaptermap vx_empty() {return e_string_vxlisp_header_from_chaptermap;}
    @Override
    public Func_string_vxlisp_header_from_chaptermap vx_type() {return t_string_vxlisp_header_from_chaptermap;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_chaptermap inputval = (Base.Type_chaptermap)value;
      Core.Type_any outputval = Bookloader.f_string_vxlisp_header_from_chaptermap(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_chaptermap chaptermap = Core.f_any_from_any(Base.t_chaptermap, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_string_vxlisp_header_from_chaptermap(chaptermap);
      return output;
    }

    @Override
    public Core.Type_string vx_string_vxlisp_header_from_chaptermap(final Base.Type_chaptermap chaptermap) {
      return Bookloader.f_string_vxlisp_header_from_chaptermap(chaptermap);
    }

  }

  public static final Func_string_vxlisp_header_from_chaptermap e_string_vxlisp_header_from_chaptermap = new Bookloader.Class_string_vxlisp_header_from_chaptermap();
  public static final Func_string_vxlisp_header_from_chaptermap t_string_vxlisp_header_from_chaptermap = new Bookloader.Class_string_vxlisp_header_from_chaptermap();

  public static Core.Type_string f_string_vxlisp_header_from_chaptermap(final Base.Type_chaptermap chaptermap) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringlist chapters = Core.f_list_from_map(
          Core.t_stringlist,
          chaptermap,
          Core.t_any_from_key_value.vx_fn_new((key_any, val_any) -> {
            Core.Type_string key = Core.f_any_from_any(Core.t_string, key_any);
            Base.Type_chapter val = Core.f_any_from_any(Base.t_chapter, val_any);
            return 
                Core.f_new(
                  Core.t_string,
                  Core.t_anylist.vx_new(
                    Core.c_newline,
                    Core.vx_new_string("    "),
                    Core.c_quote,
                    key,
                    Core.c_quote,
                    Core.vx_new_string(" (chapter_"),
                    Bookloader.f_string_writename_from_string(key),
                    Core.vx_new_string(")")
                  )
                );
          })
        );
        return Type.f_string_from_stringlist_join(chapters, Core.vx_new_string(""));
      })
    );
    return output;
  }

  /**
   * @function string_vxlisp_from_book
   * Returns a vxlisp string from a book.
   * @param  {book} book
   * @return {string}
   * (func string-vxlisp<-book)
   */
  public static interface Func_string_vxlisp_from_book extends Core.Func_any_from_any {
    public Core.Type_string vx_string_vxlisp_from_book(final Base.Type_book book);
  }

  public static class Class_string_vxlisp_from_book extends Core.Class_base implements Func_string_vxlisp_from_book {

    @Override
    public Func_string_vxlisp_from_book vx_new(Object... vals) {
      Class_string_vxlisp_from_book output = new Class_string_vxlisp_from_book();
      return output;
    }

    @Override
    public Func_string_vxlisp_from_book vx_copy(Object... vals) {
      Class_string_vxlisp_from_book output = new Class_string_vxlisp_from_book();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "string-vxlisp<-book", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
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
    public Func_string_vxlisp_from_book vx_empty() {return e_string_vxlisp_from_book;}
    @Override
    public Func_string_vxlisp_from_book vx_type() {return t_string_vxlisp_from_book;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_book inputval = (Base.Type_book)value;
      Core.Type_any outputval = Bookloader.f_string_vxlisp_from_book(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book book = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_string_vxlisp_from_book(book);
      return output;
    }

    @Override
    public Core.Type_string vx_string_vxlisp_from_book(final Base.Type_book book) {
      return Bookloader.f_string_vxlisp_from_book(book);
    }

  }

  public static final Func_string_vxlisp_from_book e_string_vxlisp_from_book = new Bookloader.Class_string_vxlisp_from_book();
  public static final Func_string_vxlisp_from_book t_string_vxlisp_from_book = new Bookloader.Class_string_vxlisp_from_book();

  public static Core.Type_string f_string_vxlisp_from_book(final Base.Type_book book) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string name = book.name();
        final Base.Type_chaptermap chaptermap = book.chaptermap();
        final Core.Type_string image = book.image();
        final Core.Type_string reference = book.reference();
        final Core.Type_string summary = book.summary();
        final Core.Type_string titles = book.titles();
        final Core.Type_string schaptermap = Bookloader.f_string_vxlisp_header_from_chaptermap(chaptermap);
        final Core.Type_string schapters = Bookloader.f_string_vxlisp_from_chaptermap(chaptermap);
        final Core.Type_string simage = Core.f_switch(
          Core.t_string,
          image,
          Core.t_thenelselist.vx_new(
              Core.f_case_1(
                Core.vx_new_string(""),
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.vx_new_string("");
                })
              ),
              Core.f_else(
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.f_new(
                    Core.t_string,
                    Core.t_anylist.vx_new(
                        Core.vx_new_string("\n  :image "),
                        Core.f_string_from_any(image)
                    )
                  );
                })
              )
          )
        );
        final Core.Type_string sreference = Core.f_switch(
          Core.t_string,
          reference,
          Core.t_thenelselist.vx_new(
              Core.f_case_1(
                Core.vx_new_string(""),
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.vx_new_string("");
                })
              ),
              Core.f_else(
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.f_new(
                    Core.t_string,
                    Core.t_anylist.vx_new(
                        Core.vx_new_string("\n  :reference "),
                        Core.f_string_from_any(reference)
                    )
                  );
                })
              )
          )
        );
        final Core.Type_string ssummary = Core.f_switch(
          Core.t_string,
          summary,
          Core.t_thenelselist.vx_new(
              Core.f_case_1(
                Core.vx_new_string(""),
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.vx_new_string("");
                })
              ),
              Core.f_else(
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.f_new(
                    Core.t_string,
                    Core.t_anylist.vx_new(
                        Core.vx_new_string("\n  :summary "),
                        Core.f_string_from_any(summary)
                    )
                  );
                })
              )
          )
        );
        final Core.Type_string stitles = Core.f_switch(
          Core.t_string,
          titles,
          Core.t_thenelselist.vx_new(
              Core.f_case_1(
                Core.vx_new_string(""),
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.vx_new_string("");
                })
              ),
              Core.f_else(
                Core.t_any_from_func.vx_fn_new(() -> {
                  return Core.f_new(
                    Core.t_string,
                    Core.t_anylist.vx_new(
                        Core.vx_new_string("\n  :titles "),
                        Core.f_string_from_any(titles)
                    )
                  );
                })
              )
          )
        );
        final Core.Type_string bookname = Bookloader.f_string_writename_from_string(name);
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            Core.vx_new_string("(package nx/tactics/books/"),
            bookname,
            Core.vx_new_string("\n :libs (lib base :path nx/tactics/base))"),
            Core.vx_new_string("\n"),
            Core.vx_new_string("\n(func tacticsbook : base/book"),
            Core.vx_new_string("\n (base/book"),
            Core.vx_new_string("\n  :name "),
            Core.f_string_from_any(name),
            simage,
            stitles,
            sreference,
            ssummary,
            Core.vx_new_string("\n  :chaptermap"),
            Core.vx_new_string("\n   (base/chaptermap"),
            schaptermap,
            Core.vx_new_string("\n   ))"),
            Core.vx_new_string(")\n"),
            schapters
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_vxlisp_from_chapter
   * Returns a vxlisp string from a chapter.
   * @param  {chapter} chapter
   * @return {string}
   * (func string-vxlisp<-chapter)
   */
  public static interface Func_string_vxlisp_from_chapter extends Core.Func_any_from_any {
    public Core.Type_string vx_string_vxlisp_from_chapter(final Base.Type_chapter chapter);
  }

  public static class Class_string_vxlisp_from_chapter extends Core.Class_base implements Func_string_vxlisp_from_chapter {

    @Override
    public Func_string_vxlisp_from_chapter vx_new(Object... vals) {
      Class_string_vxlisp_from_chapter output = new Class_string_vxlisp_from_chapter();
      return output;
    }

    @Override
    public Func_string_vxlisp_from_chapter vx_copy(Object... vals) {
      Class_string_vxlisp_from_chapter output = new Class_string_vxlisp_from_chapter();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "string-vxlisp<-chapter", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
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
    public Func_string_vxlisp_from_chapter vx_empty() {return e_string_vxlisp_from_chapter;}
    @Override
    public Func_string_vxlisp_from_chapter vx_type() {return t_string_vxlisp_from_chapter;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_chapter inputval = (Base.Type_chapter)value;
      Core.Type_any outputval = Bookloader.f_string_vxlisp_from_chapter(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_chapter chapter = Core.f_any_from_any(Base.t_chapter, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_string_vxlisp_from_chapter(chapter);
      return output;
    }

    @Override
    public Core.Type_string vx_string_vxlisp_from_chapter(final Base.Type_chapter chapter) {
      return Bookloader.f_string_vxlisp_from_chapter(chapter);
    }

  }

  public static final Func_string_vxlisp_from_chapter e_string_vxlisp_from_chapter = new Bookloader.Class_string_vxlisp_from_chapter();
  public static final Func_string_vxlisp_from_chapter t_string_vxlisp_from_chapter = new Bookloader.Class_string_vxlisp_from_chapter();

  public static Core.Type_string f_string_vxlisp_from_chapter(final Base.Type_chapter chapter) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string name = chapter.name();
        final Core.Type_string chnm = Bookloader.f_string_writename_from_string(name);
        final Core.Type_string text = Core.f_string_from_any_indent(
          chapter,
          Core.vx_new_int(1),
          Core.vx_new_boolean(false)
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            Core.vx_new_string("(func chapter_"),
            chnm,
            Core.vx_new_string(" : base/chapter\n"),
            text,
            Core.vx_new_string(")\n")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_vxlisp_from_chaptermap
   * Returns a vxlisp string from a chaptermap.
   * @param  {chaptermap} chaptermap
   * @return {string}
   * (func string-vxlisp<-chaptermap)
   */
  public static interface Func_string_vxlisp_from_chaptermap extends Core.Func_any_from_any {
    public Core.Type_string vx_string_vxlisp_from_chaptermap(final Base.Type_chaptermap chaptermap);
  }

  public static class Class_string_vxlisp_from_chaptermap extends Core.Class_base implements Func_string_vxlisp_from_chaptermap {

    @Override
    public Func_string_vxlisp_from_chaptermap vx_new(Object... vals) {
      Class_string_vxlisp_from_chaptermap output = new Class_string_vxlisp_from_chaptermap();
      return output;
    }

    @Override
    public Func_string_vxlisp_from_chaptermap vx_copy(Object... vals) {
      Class_string_vxlisp_from_chaptermap output = new Class_string_vxlisp_from_chaptermap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "string-vxlisp<-chaptermap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
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
    public Func_string_vxlisp_from_chaptermap vx_empty() {return e_string_vxlisp_from_chaptermap;}
    @Override
    public Func_string_vxlisp_from_chaptermap vx_type() {return t_string_vxlisp_from_chaptermap;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_chaptermap inputval = (Base.Type_chaptermap)value;
      Core.Type_any outputval = Bookloader.f_string_vxlisp_from_chaptermap(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_chaptermap chaptermap = Core.f_any_from_any(Base.t_chaptermap, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_string_vxlisp_from_chaptermap(chaptermap);
      return output;
    }

    @Override
    public Core.Type_string vx_string_vxlisp_from_chaptermap(final Base.Type_chaptermap chaptermap) {
      return Bookloader.f_string_vxlisp_from_chaptermap(chaptermap);
    }

  }

  public static final Func_string_vxlisp_from_chaptermap e_string_vxlisp_from_chaptermap = new Bookloader.Class_string_vxlisp_from_chaptermap();
  public static final Func_string_vxlisp_from_chaptermap t_string_vxlisp_from_chaptermap = new Bookloader.Class_string_vxlisp_from_chaptermap();

  public static Core.Type_string f_string_vxlisp_from_chaptermap(final Base.Type_chaptermap chaptermap) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_chapterlist chapters = Core.f_list_from_map(
          Base.t_chapterlist,
          chaptermap,
          Core.t_any_from_key_value.vx_fn_new((key_any, val_any) -> {
            Core.Type_string key = Core.f_any_from_any(Core.t_string, key_any);
            Base.Type_chapter val = Core.f_any_from_any(Base.t_chapter, val_any);
            return val;
          })
        );
        final Core.Type_stringlist schapters = Core.f_list_from_list(
          Core.t_stringlist,
          chapters,
          Core.t_any_from_any.vx_fn_new((chapt_any) -> {
            Base.Type_chapter chapt = Core.f_any_from_any(Base.t_chapter, chapt_any);
            return 
                Core.f_let(
                  Core.t_string,
                  Core.t_any_from_func.vx_fn_new(() -> {
                    final Core.Type_string name = Base.f_name_from_chapter(chapt);
                    final Core.Type_string schnm = Bookloader.f_string_writename_from_string(name);
                    final Core.Type_string text = Core.f_string_from_any_indent(
                      chapt,
                      Core.vx_new_int(1),
                      Core.vx_new_boolean(true)
                    );
                    return Core.f_new(
                      Core.t_string,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string("\n(func chapter_"),
                        schnm,
                        Core.vx_new_string(" : base/chapter\n "),
                        text,
                        Core.vx_new_string(")")
                      )
                    );
                  })
                );
          })
        );
        return Type.f_string_from_stringlist_join(
          schapters,
          Core.c_newline
        );
      })
    );
    return output;
  }

  /**
   * @function string_writename_from_string
   * Returns the write filename from a book
   * @param  {string} name
   * @return {string}
   * (func string-writename<-string)
   */
  public static interface Func_string_writename_from_string extends Core.Func_any_from_any {
    public Core.Type_string vx_string_writename_from_string(final Core.Type_string name);
  }

  public static class Class_string_writename_from_string extends Core.Class_base implements Func_string_writename_from_string {

    @Override
    public Func_string_writename_from_string vx_new(Object... vals) {
      Class_string_writename_from_string output = new Class_string_writename_from_string();
      return output;
    }

    @Override
    public Func_string_writename_from_string vx_copy(Object... vals) {
      Class_string_writename_from_string output = new Class_string_writename_from_string();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "string-writename<-string", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/core", // pkgname
          "string", // name
          ":string", // extends
          Core.e_typelist, // traits
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
    public Func_string_writename_from_string vx_empty() {return e_string_writename_from_string;}
    @Override
    public Func_string_writename_from_string vx_type() {return t_string_writename_from_string;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Bookloader.f_string_writename_from_string(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_string name = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_string_writename_from_string(name);
      return output;
    }

    @Override
    public Core.Type_string vx_string_writename_from_string(final Core.Type_string name) {
      return Bookloader.f_string_writename_from_string(name);
    }

  }

  public static final Func_string_writename_from_string e_string_writename_from_string = new Bookloader.Class_string_writename_from_string();
  public static final Func_string_writename_from_string t_string_writename_from_string = new Bookloader.Class_string_writename_from_string();

  public static Core.Type_string f_string_writename_from_string(final Core.Type_string name) {
    Core.Type_string output = Core.e_string;
    output = Core.f_let(
      Core.t_string,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string lower = Type.f_string_lowercase(name);
        final Core.Type_string space = Core.f_string_from_string_find_replace(lower, Core.vx_new_string(" "), Core.vx_new_string("_"));
        final Core.Type_string comma = Core.f_string_from_string_find_replace(space, Core.vx_new_string(","), Core.vx_new_string(""));
        final Core.Type_string apos = Core.f_string_from_string_find_replace(comma, Core.vx_new_string("'"), Core.vx_new_string(""));
        final Core.Type_string slash = Core.f_string_from_string_find_replace(apos, Core.vx_new_string("/"), Core.vx_new_string("_"));
        return slash;
      })
    );
    return output;
  }

  /**
   * @function team_from_team_key_value
   * Returns a modified team from a key value.
   * @param  {team} current
   * @param  {string} key
   * @param  {string} value
   * @return {team}
   * (func team<-team-key-value)
   */
  public static interface Func_team_from_team_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_team vx_team_from_team_key_value(final Base.Type_team current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_team_from_team_key_value extends Core.Class_base implements Func_team_from_team_key_value {

    @Override
    public Func_team_from_team_key_value vx_new(Object... vals) {
      Class_team_from_team_key_value output = new Class_team_from_team_key_value();
      return output;
    }

    @Override
    public Func_team_from_team_key_value vx_copy(Object... vals) {
      Class_team_from_team_key_value output = new Class_team_from_team_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "team<-team-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "team", // name
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
    public Func_team_from_team_key_value vx_empty() {return e_team_from_team_key_value;}
    @Override
    public Func_team_from_team_key_value vx_type() {return t_team_from_team_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_team current = Core.f_any_from_any(Base.t_team, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_team_from_team_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_team vx_team_from_team_key_value(final Base.Type_team current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_team_from_team_key_value(current, key, value);
    }

  }

  public static final Func_team_from_team_key_value e_team_from_team_key_value = new Bookloader.Class_team_from_team_key_value();
  public static final Func_team_from_team_key_value t_team_from_team_key_value = new Bookloader.Class_team_from_team_key_value();

  public static Base.Type_team f_team_from_team_key_value(final Base.Type_team current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_team output = Base.e_team;
    output = Core.f_switch(
      Base.t_team,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_team,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function team_from_team_stringmap
   * Returns a team from a propmap.
   * @param  {team} team
   * @param  {stringmap} propmap
   * @return {team}
   * (func team<-team-stringmap)
   */
  public static interface Func_team_from_team_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_team vx_team_from_team_stringmap(final Base.Type_team team, final Core.Type_stringmap propmap);
  }

  public static class Class_team_from_team_stringmap extends Core.Class_base implements Func_team_from_team_stringmap {

    @Override
    public Func_team_from_team_stringmap vx_new(Object... vals) {
      Class_team_from_team_stringmap output = new Class_team_from_team_stringmap();
      return output;
    }

    @Override
    public Func_team_from_team_stringmap vx_copy(Object... vals) {
      Class_team_from_team_stringmap output = new Class_team_from_team_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "team<-team-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "team", // name
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
    public Func_team_from_team_stringmap vx_empty() {return e_team_from_team_stringmap;}
    @Override
    public Func_team_from_team_stringmap vx_type() {return t_team_from_team_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_team team = Core.f_any_from_any(Base.t_team, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_team_from_team_stringmap(team, propmap);
      return output;
    }

    @Override
    public Base.Type_team vx_team_from_team_stringmap(final Base.Type_team team, final Core.Type_stringmap propmap) {
      return Bookloader.f_team_from_team_stringmap(team, propmap);
    }

  }

  public static final Func_team_from_team_stringmap e_team_from_team_stringmap = new Bookloader.Class_team_from_team_stringmap();
  public static final Func_team_from_team_stringmap t_team_from_team_stringmap = new Bookloader.Class_team_from_team_stringmap();

  public static Base.Type_team f_team_from_team_stringmap(final Base.Type_team team, final Core.Type_stringmap propmap) {
    Base.Type_team output = Base.e_team;
    output = Core.f_any_from_map_start_reduce(
      Base.t_team,
      propmap,
      team,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_team current_lmb = Core.f_any_from_any(Base.t_team, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_team_from_team_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function team_from_team_xmlchild
   * Returns a modified team based on a given child xml.
   * @param  {team} team
   * @param  {xml} child
   * @return {team}
   * (func team<-team-xmlchild)
   */
  public static interface Func_team_from_team_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_team vx_team_from_team_xmlchild(final Base.Type_team team, final Xml.Type_xml child);
  }

  public static class Class_team_from_team_xmlchild extends Core.Class_base implements Func_team_from_team_xmlchild {

    @Override
    public Func_team_from_team_xmlchild vx_new(Object... vals) {
      Class_team_from_team_xmlchild output = new Class_team_from_team_xmlchild();
      return output;
    }

    @Override
    public Func_team_from_team_xmlchild vx_copy(Object... vals) {
      Class_team_from_team_xmlchild output = new Class_team_from_team_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "team<-team-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "team", // name
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
    public Func_team_from_team_xmlchild vx_empty() {return e_team_from_team_xmlchild;}
    @Override
    public Func_team_from_team_xmlchild vx_type() {return t_team_from_team_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_team team = Core.f_any_from_any(Base.t_team, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_team_from_team_xmlchild(team, child);
      return output;
    }

    @Override
    public Base.Type_team vx_team_from_team_xmlchild(final Base.Type_team team, final Xml.Type_xml child) {
      return Bookloader.f_team_from_team_xmlchild(team, child);
    }

  }

  public static final Func_team_from_team_xmlchild e_team_from_team_xmlchild = new Bookloader.Class_team_from_team_xmlchild();
  public static final Func_team_from_team_xmlchild t_team_from_team_xmlchild = new Bookloader.Class_team_from_team_xmlchild();

  public static Base.Type_team f_team_from_team_xmlchild(final Base.Type_team team, final Xml.Type_xml child) {
    Base.Type_team output = Base.e_team;
    output = Core.f_let(
      Base.t_team,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_team,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return team;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string("completevictory"),
                  Core.vx_new_string("deploy"),
                  Core.vx_new_string("forces"),
                  Core.vx_new_string("partialvictory")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  team,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  team,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_team,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function team_from_xml
   * Returns a team from a given xml.
   * @param  {xml} xml
   * @return {team}
   * (func team<-xml)
   */
  public static interface Func_team_from_xml extends Core.Func_any_from_any {
    public Base.Type_team vx_team_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_team_from_xml extends Core.Class_base implements Func_team_from_xml {

    @Override
    public Func_team_from_xml vx_new(Object... vals) {
      Class_team_from_xml output = new Class_team_from_xml();
      return output;
    }

    @Override
    public Func_team_from_xml vx_copy(Object... vals) {
      Class_team_from_xml output = new Class_team_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "team<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "team", // name
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
    public Func_team_from_xml vx_empty() {return e_team_from_xml;}
    @Override
    public Func_team_from_xml vx_type() {return t_team_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_team_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_team_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_team vx_team_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_team_from_xml(xml);
    }

  }

  public static final Func_team_from_xml e_team_from_xml = new Bookloader.Class_team_from_xml();
  public static final Func_team_from_xml t_team_from_xml = new Bookloader.Class_team_from_xml();

  public static Base.Type_team f_team_from_xml(final Xml.Type_xml xml) {
    Base.Type_team output = Base.e_team;
    output = Core.f_let(
      Base.t_team,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_team team = Bookloader.f_team_from_team_stringmap(
          Core.f_empty(
            Base.t_team
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_team,
          xml.children(),
          team,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any team_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_team team_lmb = Core.f_any_from_any(Base.t_team, team_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_team_from_team_xmlchild(team_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function terrain_from_terrain_key_value
   * Returns a modified terrain from a key value.
   * @param  {terrain} current
   * @param  {string} key
   * @param  {string} value
   * @return {terrain}
   * (func terrain<-terrain-key-value)
   */
  public static interface Func_terrain_from_terrain_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_terrain vx_terrain_from_terrain_key_value(final Base.Type_terrain current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_terrain_from_terrain_key_value extends Core.Class_base implements Func_terrain_from_terrain_key_value {

    @Override
    public Func_terrain_from_terrain_key_value vx_new(Object... vals) {
      Class_terrain_from_terrain_key_value output = new Class_terrain_from_terrain_key_value();
      return output;
    }

    @Override
    public Func_terrain_from_terrain_key_value vx_copy(Object... vals) {
      Class_terrain_from_terrain_key_value output = new Class_terrain_from_terrain_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "terrain<-terrain-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "terrain", // name
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
    public Func_terrain_from_terrain_key_value vx_empty() {return e_terrain_from_terrain_key_value;}
    @Override
    public Func_terrain_from_terrain_key_value vx_type() {return t_terrain_from_terrain_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_terrain current = Core.f_any_from_any(Base.t_terrain, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_terrain_from_terrain_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_terrain vx_terrain_from_terrain_key_value(final Base.Type_terrain current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_terrain_from_terrain_key_value(current, key, value);
    }

  }

  public static final Func_terrain_from_terrain_key_value e_terrain_from_terrain_key_value = new Bookloader.Class_terrain_from_terrain_key_value();
  public static final Func_terrain_from_terrain_key_value t_terrain_from_terrain_key_value = new Bookloader.Class_terrain_from_terrain_key_value();

  public static Base.Type_terrain f_terrain_from_terrain_key_value(final Base.Type_terrain current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_terrain output = Base.e_terrain;
    output = Core.f_switch(
      Base.t_terrain,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_terrain,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function terrain_from_terrain_stringmap
   * Returns a terrain from a propmap.
   * @param  {terrain} terrain
   * @param  {stringmap} propmap
   * @return {terrain}
   * (func terrain<-terrain-stringmap)
   */
  public static interface Func_terrain_from_terrain_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_terrain vx_terrain_from_terrain_stringmap(final Base.Type_terrain terrain, final Core.Type_stringmap propmap);
  }

  public static class Class_terrain_from_terrain_stringmap extends Core.Class_base implements Func_terrain_from_terrain_stringmap {

    @Override
    public Func_terrain_from_terrain_stringmap vx_new(Object... vals) {
      Class_terrain_from_terrain_stringmap output = new Class_terrain_from_terrain_stringmap();
      return output;
    }

    @Override
    public Func_terrain_from_terrain_stringmap vx_copy(Object... vals) {
      Class_terrain_from_terrain_stringmap output = new Class_terrain_from_terrain_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "terrain<-terrain-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "terrain", // name
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
    public Func_terrain_from_terrain_stringmap vx_empty() {return e_terrain_from_terrain_stringmap;}
    @Override
    public Func_terrain_from_terrain_stringmap vx_type() {return t_terrain_from_terrain_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_terrain terrain = Core.f_any_from_any(Base.t_terrain, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_terrain_from_terrain_stringmap(terrain, propmap);
      return output;
    }

    @Override
    public Base.Type_terrain vx_terrain_from_terrain_stringmap(final Base.Type_terrain terrain, final Core.Type_stringmap propmap) {
      return Bookloader.f_terrain_from_terrain_stringmap(terrain, propmap);
    }

  }

  public static final Func_terrain_from_terrain_stringmap e_terrain_from_terrain_stringmap = new Bookloader.Class_terrain_from_terrain_stringmap();
  public static final Func_terrain_from_terrain_stringmap t_terrain_from_terrain_stringmap = new Bookloader.Class_terrain_from_terrain_stringmap();

  public static Base.Type_terrain f_terrain_from_terrain_stringmap(final Base.Type_terrain terrain, final Core.Type_stringmap propmap) {
    Base.Type_terrain output = Base.e_terrain;
    output = Core.f_any_from_map_start_reduce(
      Base.t_terrain,
      propmap,
      terrain,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_terrain current_lmb = Core.f_any_from_any(Base.t_terrain, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_terrain_from_terrain_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function terrain_from_terrain_xmlchild
   * Returns a modified terrain based on a given child Xml.
   * @param  {terrain} terrain
   * @param  {xml} child
   * @return {terrain}
   * (func terrain<-terrain-xmlchild)
   */
  public static interface Func_terrain_from_terrain_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_terrain vx_terrain_from_terrain_xmlchild(final Base.Type_terrain terrain, final Xml.Type_xml child);
  }

  public static class Class_terrain_from_terrain_xmlchild extends Core.Class_base implements Func_terrain_from_terrain_xmlchild {

    @Override
    public Func_terrain_from_terrain_xmlchild vx_new(Object... vals) {
      Class_terrain_from_terrain_xmlchild output = new Class_terrain_from_terrain_xmlchild();
      return output;
    }

    @Override
    public Func_terrain_from_terrain_xmlchild vx_copy(Object... vals) {
      Class_terrain_from_terrain_xmlchild output = new Class_terrain_from_terrain_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "terrain<-terrain-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "terrain", // name
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
    public Func_terrain_from_terrain_xmlchild vx_empty() {return e_terrain_from_terrain_xmlchild;}
    @Override
    public Func_terrain_from_terrain_xmlchild vx_type() {return t_terrain_from_terrain_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_terrain terrain = Core.f_any_from_any(Base.t_terrain, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_terrain_from_terrain_xmlchild(terrain, child);
      return output;
    }

    @Override
    public Base.Type_terrain vx_terrain_from_terrain_xmlchild(final Base.Type_terrain terrain, final Xml.Type_xml child) {
      return Bookloader.f_terrain_from_terrain_xmlchild(terrain, child);
    }

  }

  public static final Func_terrain_from_terrain_xmlchild e_terrain_from_terrain_xmlchild = new Bookloader.Class_terrain_from_terrain_xmlchild();
  public static final Func_terrain_from_terrain_xmlchild t_terrain_from_terrain_xmlchild = new Bookloader.Class_terrain_from_terrain_xmlchild();

  public static Base.Type_terrain f_terrain_from_terrain_xmlchild(final Base.Type_terrain terrain, final Xml.Type_xml child) {
    Base.Type_terrain output = Base.e_terrain;
    output = Core.f_let(
      Base.t_terrain,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_terrain,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return terrain;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles"),
                  Core.vx_new_string("classification")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  terrain,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  terrain,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_terrain,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function terrain_from_xml
   * Returns a terrain from a given xml.
   * @param  {xml} xml
   * @return {terrain}
   * (func terrain<-xml)
   */
  public static interface Func_terrain_from_xml extends Core.Func_any_from_any {
    public Base.Type_terrain vx_terrain_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_terrain_from_xml extends Core.Class_base implements Func_terrain_from_xml {

    @Override
    public Func_terrain_from_xml vx_new(Object... vals) {
      Class_terrain_from_xml output = new Class_terrain_from_xml();
      return output;
    }

    @Override
    public Func_terrain_from_xml vx_copy(Object... vals) {
      Class_terrain_from_xml output = new Class_terrain_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "terrain<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "terrain", // name
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
    public Func_terrain_from_xml vx_empty() {return e_terrain_from_xml;}
    @Override
    public Func_terrain_from_xml vx_type() {return t_terrain_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_terrain_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_terrain_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_terrain vx_terrain_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_terrain_from_xml(xml);
    }

  }

  public static final Func_terrain_from_xml e_terrain_from_xml = new Bookloader.Class_terrain_from_xml();
  public static final Func_terrain_from_xml t_terrain_from_xml = new Bookloader.Class_terrain_from_xml();

  public static Base.Type_terrain f_terrain_from_xml(final Xml.Type_xml xml) {
    Base.Type_terrain output = Base.e_terrain;
    output = Core.f_let(
      Base.t_terrain,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_terrain terrain = Bookloader.f_terrain_from_terrain_stringmap(
          Core.f_empty(
            Base.t_terrain
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_terrain,
          xml.children(),
          terrain,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any terrain_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_terrain terrain_lmb = Core.f_any_from_any(Base.t_terrain, terrain_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_terrain_from_terrain_xmlchild(terrain_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function unit_from_unit_key_value
   * Returns a modified unit from a key value.
   * @param  {unit} current
   * @param  {string} key
   * @param  {string} value
   * @return {unit}
   * (func unit<-unit-key-value)
   */
  public static interface Func_unit_from_unit_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unit vx_unit_from_unit_key_value(final Base.Type_unit current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_unit_from_unit_key_value extends Core.Class_base implements Func_unit_from_unit_key_value {

    @Override
    public Func_unit_from_unit_key_value vx_new(Object... vals) {
      Class_unit_from_unit_key_value output = new Class_unit_from_unit_key_value();
      return output;
    }

    @Override
    public Func_unit_from_unit_key_value vx_copy(Object... vals) {
      Class_unit_from_unit_key_value output = new Class_unit_from_unit_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unit<-unit-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unit", // name
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
    public Func_unit_from_unit_key_value vx_empty() {return e_unit_from_unit_key_value;}
    @Override
    public Func_unit_from_unit_key_value vx_type() {return t_unit_from_unit_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unit current = Core.f_any_from_any(Base.t_unit, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_unit_from_unit_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_unit vx_unit_from_unit_key_value(final Base.Type_unit current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_unit_from_unit_key_value(current, key, value);
    }

  }

  public static final Func_unit_from_unit_key_value e_unit_from_unit_key_value = new Bookloader.Class_unit_from_unit_key_value();
  public static final Func_unit_from_unit_key_value t_unit_from_unit_key_value = new Bookloader.Class_unit_from_unit_key_value();

  public static Base.Type_unit f_unit_from_unit_key_value(final Base.Type_unit current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_unit output = Base.e_unit;
    output = Core.f_switch(
      Base.t_unit,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("classification"),
              Core.vx_new_string("crew"),
              Core.vx_new_string("body"),
              Core.vx_new_string("height"),
              Core.vx_new_string("length"),
              Core.vx_new_string("mass"),
              Core.vx_new_string("mind"),
              Core.vx_new_string("range"),
              Core.vx_new_string("speed"),
              Core.vx_new_string("speedair"),
              Core.vx_new_string("speedland"),
              Core.vx_new_string("speedspace"),
              Core.vx_new_string("speedwater"),
              Core.vx_new_string("width"),
              Core.vx_new_string("will")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_unit,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function unit_from_unit_stringmap
   * Returns a new unit from a propmap.
   * @param  {unit} unit
   * @param  {stringmap} propmap
   * @return {unit}
   * (func unit<-unit-stringmap)
   */
  public static interface Func_unit_from_unit_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unit vx_unit_from_unit_stringmap(final Base.Type_unit unit, final Core.Type_stringmap propmap);
  }

  public static class Class_unit_from_unit_stringmap extends Core.Class_base implements Func_unit_from_unit_stringmap {

    @Override
    public Func_unit_from_unit_stringmap vx_new(Object... vals) {
      Class_unit_from_unit_stringmap output = new Class_unit_from_unit_stringmap();
      return output;
    }

    @Override
    public Func_unit_from_unit_stringmap vx_copy(Object... vals) {
      Class_unit_from_unit_stringmap output = new Class_unit_from_unit_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unit<-unit-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unit", // name
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
    public Func_unit_from_unit_stringmap vx_empty() {return e_unit_from_unit_stringmap;}
    @Override
    public Func_unit_from_unit_stringmap vx_type() {return t_unit_from_unit_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unit unit = Core.f_any_from_any(Base.t_unit, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unit_from_unit_stringmap(unit, propmap);
      return output;
    }

    @Override
    public Base.Type_unit vx_unit_from_unit_stringmap(final Base.Type_unit unit, final Core.Type_stringmap propmap) {
      return Bookloader.f_unit_from_unit_stringmap(unit, propmap);
    }

  }

  public static final Func_unit_from_unit_stringmap e_unit_from_unit_stringmap = new Bookloader.Class_unit_from_unit_stringmap();
  public static final Func_unit_from_unit_stringmap t_unit_from_unit_stringmap = new Bookloader.Class_unit_from_unit_stringmap();

  public static Base.Type_unit f_unit_from_unit_stringmap(final Base.Type_unit unit, final Core.Type_stringmap propmap) {
    Base.Type_unit output = Base.e_unit;
    output = Core.f_any_from_map_start_reduce(
      Base.t_unit,
      propmap,
      unit,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_unit current_lmb = Core.f_any_from_any(Base.t_unit, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_unit_from_unit_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function unit_from_unit_xmlchild
   * Returns a modified unit based on a given child Xml.
   * @param  {unit} unit
   * @param  {xml} child
   * @return {unit}
   * (func unit<-unit-xmlchild)
   */
  public static interface Func_unit_from_unit_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unit vx_unit_from_unit_xmlchild(final Base.Type_unit unit, final Xml.Type_xml child);
  }

  public static class Class_unit_from_unit_xmlchild extends Core.Class_base implements Func_unit_from_unit_xmlchild {

    @Override
    public Func_unit_from_unit_xmlchild vx_new(Object... vals) {
      Class_unit_from_unit_xmlchild output = new Class_unit_from_unit_xmlchild();
      return output;
    }

    @Override
    public Func_unit_from_unit_xmlchild vx_copy(Object... vals) {
      Class_unit_from_unit_xmlchild output = new Class_unit_from_unit_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unit<-unit-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unit", // name
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
    public Func_unit_from_unit_xmlchild vx_empty() {return e_unit_from_unit_xmlchild;}
    @Override
    public Func_unit_from_unit_xmlchild vx_type() {return t_unit_from_unit_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unit unit = Core.f_any_from_any(Base.t_unit, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unit_from_unit_xmlchild(unit, child);
      return output;
    }

    @Override
    public Base.Type_unit vx_unit_from_unit_xmlchild(final Base.Type_unit unit, final Xml.Type_xml child) {
      return Bookloader.f_unit_from_unit_xmlchild(unit, child);
    }

  }

  public static final Func_unit_from_unit_xmlchild e_unit_from_unit_xmlchild = new Bookloader.Class_unit_from_unit_xmlchild();
  public static final Func_unit_from_unit_xmlchild t_unit_from_unit_xmlchild = new Bookloader.Class_unit_from_unit_xmlchild();

  public static Base.Type_unit f_unit_from_unit_xmlchild(final Base.Type_unit unit, final Xml.Type_xml child) {
    Base.Type_unit output = Base.e_unit;
    output = Core.f_let(
      Base.t_unit,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_unit,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return unit;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unit,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("power"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unit_from_unit_xmlpower(unit, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("skill"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unit_from_unit_xmlskill(unit, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("weakness"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unit_from_unit_xmlweakness(unit, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unit,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_unit,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unit_from_unit_xmlpower
   * Return a unit with new unit added to unitpowermap
   * @param  {unit} unit
   * @param  {xml} xmlpower
   * @return {unit}
   * (func unit<-unit-xmlpower)
   */
  public static interface Func_unit_from_unit_xmlpower extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unit vx_unit_from_unit_xmlpower(final Base.Type_unit unit, final Xml.Type_xml xmlpower);
  }

  public static class Class_unit_from_unit_xmlpower extends Core.Class_base implements Func_unit_from_unit_xmlpower {

    @Override
    public Func_unit_from_unit_xmlpower vx_new(Object... vals) {
      Class_unit_from_unit_xmlpower output = new Class_unit_from_unit_xmlpower();
      return output;
    }

    @Override
    public Func_unit_from_unit_xmlpower vx_copy(Object... vals) {
      Class_unit_from_unit_xmlpower output = new Class_unit_from_unit_xmlpower();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unit<-unit-xmlpower", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unit", // name
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
    public Func_unit_from_unit_xmlpower vx_empty() {return e_unit_from_unit_xmlpower;}
    @Override
    public Func_unit_from_unit_xmlpower vx_type() {return t_unit_from_unit_xmlpower;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unit unit = Core.f_any_from_any(Base.t_unit, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlpower = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unit_from_unit_xmlpower(unit, xmlpower);
      return output;
    }

    @Override
    public Base.Type_unit vx_unit_from_unit_xmlpower(final Base.Type_unit unit, final Xml.Type_xml xmlpower) {
      return Bookloader.f_unit_from_unit_xmlpower(unit, xmlpower);
    }

  }

  public static final Func_unit_from_unit_xmlpower e_unit_from_unit_xmlpower = new Bookloader.Class_unit_from_unit_xmlpower();
  public static final Func_unit_from_unit_xmlpower t_unit_from_unit_xmlpower = new Bookloader.Class_unit_from_unit_xmlpower();

  public static Base.Type_unit f_unit_from_unit_xmlpower(final Base.Type_unit unit, final Xml.Type_xml xmlpower) {
    Base.Type_unit output = Base.e_unit;
    output = Core.f_let(
      Base.t_unit,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unitpower unitpower = Bookloader.f_unitpower_from_xml(xmlpower);
        final Core.Type_string name = unitpower.name();
        final Base.Type_unitpowermap origmap = unit.unitpowermap();
        final Base.Type_unitpowermap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              unitpower
          )
        );
        return Core.f_copy(
          unit,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitpowermap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unit_from_unit_xmlskill
   * Return a unit with new unitskill added to unitskillmap
   * @param  {unit} unit
   * @param  {xml} xmlskill
   * @return {unit}
   * (func unit<-unit-xmlskill)
   */
  public static interface Func_unit_from_unit_xmlskill extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unit vx_unit_from_unit_xmlskill(final Base.Type_unit unit, final Xml.Type_xml xmlskill);
  }

  public static class Class_unit_from_unit_xmlskill extends Core.Class_base implements Func_unit_from_unit_xmlskill {

    @Override
    public Func_unit_from_unit_xmlskill vx_new(Object... vals) {
      Class_unit_from_unit_xmlskill output = new Class_unit_from_unit_xmlskill();
      return output;
    }

    @Override
    public Func_unit_from_unit_xmlskill vx_copy(Object... vals) {
      Class_unit_from_unit_xmlskill output = new Class_unit_from_unit_xmlskill();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unit<-unit-xmlskill", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unit", // name
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
    public Func_unit_from_unit_xmlskill vx_empty() {return e_unit_from_unit_xmlskill;}
    @Override
    public Func_unit_from_unit_xmlskill vx_type() {return t_unit_from_unit_xmlskill;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unit unit = Core.f_any_from_any(Base.t_unit, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlskill = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unit_from_unit_xmlskill(unit, xmlskill);
      return output;
    }

    @Override
    public Base.Type_unit vx_unit_from_unit_xmlskill(final Base.Type_unit unit, final Xml.Type_xml xmlskill) {
      return Bookloader.f_unit_from_unit_xmlskill(unit, xmlskill);
    }

  }

  public static final Func_unit_from_unit_xmlskill e_unit_from_unit_xmlskill = new Bookloader.Class_unit_from_unit_xmlskill();
  public static final Func_unit_from_unit_xmlskill t_unit_from_unit_xmlskill = new Bookloader.Class_unit_from_unit_xmlskill();

  public static Base.Type_unit f_unit_from_unit_xmlskill(final Base.Type_unit unit, final Xml.Type_xml xmlskill) {
    Base.Type_unit output = Base.e_unit;
    output = Core.f_let(
      Base.t_unit,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unitskill unitskill = Bookloader.f_unitskill_from_xml(xmlskill);
        final Core.Type_string name = unitskill.name();
        final Base.Type_unitskillmap origmap = unit.unitskillmap();
        final Base.Type_unitskillmap chgmap = Core.f_copy(
          Base.t_unitskillmap,
          Core.t_anylist.vx_new(
              name,
              unitskill
          )
        );
        return Core.f_copy(
          unit,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitskillmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unit_from_unit_xmlweakness
   * Return a unit with new unitweakness added to unitweaknessmap
   * @param  {unit} unit
   * @param  {xml} xmlweakness
   * @return {unit}
   * (func unit<-unit-xmlweakness)
   */
  public static interface Func_unit_from_unit_xmlweakness extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unit vx_unit_from_unit_xmlweakness(final Base.Type_unit unit, final Xml.Type_xml xmlweakness);
  }

  public static class Class_unit_from_unit_xmlweakness extends Core.Class_base implements Func_unit_from_unit_xmlweakness {

    @Override
    public Func_unit_from_unit_xmlweakness vx_new(Object... vals) {
      Class_unit_from_unit_xmlweakness output = new Class_unit_from_unit_xmlweakness();
      return output;
    }

    @Override
    public Func_unit_from_unit_xmlweakness vx_copy(Object... vals) {
      Class_unit_from_unit_xmlweakness output = new Class_unit_from_unit_xmlweakness();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unit<-unit-xmlweakness", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unit", // name
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
    public Func_unit_from_unit_xmlweakness vx_empty() {return e_unit_from_unit_xmlweakness;}
    @Override
    public Func_unit_from_unit_xmlweakness vx_type() {return t_unit_from_unit_xmlweakness;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unit unit = Core.f_any_from_any(Base.t_unit, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlweakness = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unit_from_unit_xmlweakness(unit, xmlweakness);
      return output;
    }

    @Override
    public Base.Type_unit vx_unit_from_unit_xmlweakness(final Base.Type_unit unit, final Xml.Type_xml xmlweakness) {
      return Bookloader.f_unit_from_unit_xmlweakness(unit, xmlweakness);
    }

  }

  public static final Func_unit_from_unit_xmlweakness e_unit_from_unit_xmlweakness = new Bookloader.Class_unit_from_unit_xmlweakness();
  public static final Func_unit_from_unit_xmlweakness t_unit_from_unit_xmlweakness = new Bookloader.Class_unit_from_unit_xmlweakness();

  public static Base.Type_unit f_unit_from_unit_xmlweakness(final Base.Type_unit unit, final Xml.Type_xml xmlweakness) {
    Base.Type_unit output = Base.e_unit;
    output = Core.f_let(
      Base.t_unit,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unitweakness unitweakness = Bookloader.f_unitweakness_from_xml(xmlweakness);
        final Core.Type_string name = unitweakness.name();
        final Base.Type_unitweaknessmap origmap = unit.unitweaknessmap();
        final Base.Type_unitweaknessmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              unitweakness
          )
        );
        return Core.f_copy(
          unit,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitweaknessmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unit_from_xml
   * Returns a unit from a given xml.
   * @param  {xml} xml
   * @return {unit}
   * (func unit<-xml)
   */
  public static interface Func_unit_from_xml extends Core.Func_any_from_any {
    public Base.Type_unit vx_unit_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_unit_from_xml extends Core.Class_base implements Func_unit_from_xml {

    @Override
    public Func_unit_from_xml vx_new(Object... vals) {
      Class_unit_from_xml output = new Class_unit_from_xml();
      return output;
    }

    @Override
    public Func_unit_from_xml vx_copy(Object... vals) {
      Class_unit_from_xml output = new Class_unit_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unit<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unit", // name
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
    public Func_unit_from_xml vx_empty() {return e_unit_from_xml;}
    @Override
    public Func_unit_from_xml vx_type() {return t_unit_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_unit_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_unit_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_unit vx_unit_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_unit_from_xml(xml);
    }

  }

  public static final Func_unit_from_xml e_unit_from_xml = new Bookloader.Class_unit_from_xml();
  public static final Func_unit_from_xml t_unit_from_xml = new Bookloader.Class_unit_from_xml();

  public static Base.Type_unit f_unit_from_xml(final Xml.Type_xml xml) {
    Base.Type_unit output = Base.e_unit;
    output = Core.f_let(
      Base.t_unit,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_unit unt = Bookloader.f_unit_from_unit_stringmap(
          Core.f_empty(
            Base.t_unit
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_unit,
          xml.children(),
          unt,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unit_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_unit unit_lmb = Core.f_any_from_any(Base.t_unit, unit_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_unit_from_unit_xmlchild(unit_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function unitability_from_unitability_key_value
   * Returns a modified unitability from a key value.
   * @param  {unitability} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitability}
   * (func unitability<-unitability-key-value)
   */
  public static interface Func_unitability_from_unitability_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitability vx_unitability_from_unitability_key_value(final Base.Type_unitability current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_unitability_from_unitability_key_value extends Core.Class_base implements Func_unitability_from_unitability_key_value {

    @Override
    public Func_unitability_from_unitability_key_value vx_new(Object... vals) {
      Class_unitability_from_unitability_key_value output = new Class_unitability_from_unitability_key_value();
      return output;
    }

    @Override
    public Func_unitability_from_unitability_key_value vx_copy(Object... vals) {
      Class_unitability_from_unitability_key_value output = new Class_unitability_from_unitability_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitability<-unitability-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitability", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitability_from_unitability_key_value vx_empty() {return e_unitability_from_unitability_key_value;}
    @Override
    public Func_unitability_from_unitability_key_value vx_type() {return t_unitability_from_unitability_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitability current = Core.f_any_from_any(Base.t_unitability, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_unitability_from_unitability_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_unitability vx_unitability_from_unitability_key_value(final Base.Type_unitability current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_unitability_from_unitability_key_value(current, key, value);
    }

  }

  public static final Func_unitability_from_unitability_key_value e_unitability_from_unitability_key_value = new Bookloader.Class_unitability_from_unitability_key_value();
  public static final Func_unitability_from_unitability_key_value t_unitability_from_unitability_key_value = new Bookloader.Class_unitability_from_unitability_key_value();

  public static Base.Type_unitability f_unitability_from_unitability_key_value(final Base.Type_unitability current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_unitability output = Base.e_unitability;
    output = Core.f_switch(
      Base.t_unitability,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_unitability,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function unitability_from_unitability_stringmap
   * Returns a new unitability from a propmap.
   * @param  {unitability} unitability
   * @param  {stringmap} propmap
   * @return {unitability}
   * (func unitability<-unitability-stringmap)
   */
  public static interface Func_unitability_from_unitability_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitability vx_unitability_from_unitability_stringmap(final Base.Type_unitability unitability, final Core.Type_stringmap propmap);
  }

  public static class Class_unitability_from_unitability_stringmap extends Core.Class_base implements Func_unitability_from_unitability_stringmap {

    @Override
    public Func_unitability_from_unitability_stringmap vx_new(Object... vals) {
      Class_unitability_from_unitability_stringmap output = new Class_unitability_from_unitability_stringmap();
      return output;
    }

    @Override
    public Func_unitability_from_unitability_stringmap vx_copy(Object... vals) {
      Class_unitability_from_unitability_stringmap output = new Class_unitability_from_unitability_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitability<-unitability-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitability", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitability_from_unitability_stringmap vx_empty() {return e_unitability_from_unitability_stringmap;}
    @Override
    public Func_unitability_from_unitability_stringmap vx_type() {return t_unitability_from_unitability_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitability unitability = Core.f_any_from_any(Base.t_unitability, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitability_from_unitability_stringmap(unitability, propmap);
      return output;
    }

    @Override
    public Base.Type_unitability vx_unitability_from_unitability_stringmap(final Base.Type_unitability unitability, final Core.Type_stringmap propmap) {
      return Bookloader.f_unitability_from_unitability_stringmap(unitability, propmap);
    }

  }

  public static final Func_unitability_from_unitability_stringmap e_unitability_from_unitability_stringmap = new Bookloader.Class_unitability_from_unitability_stringmap();
  public static final Func_unitability_from_unitability_stringmap t_unitability_from_unitability_stringmap = new Bookloader.Class_unitability_from_unitability_stringmap();

  public static Base.Type_unitability f_unitability_from_unitability_stringmap(final Base.Type_unitability unitability, final Core.Type_stringmap propmap) {
    Base.Type_unitability output = Base.e_unitability;
    output = Core.f_any_from_map_start_reduce(
      Base.t_unitability,
      propmap,
      unitability,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_unitability current_lmb = Core.f_any_from_any(Base.t_unitability, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_unitability_from_unitability_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function unitability_from_unitability_xmlchild
   * Returns a modified unitability based on a given child xml.
   * @param  {unitability} unitability
   * @param  {xml} child
   * @return {unitability}
   * (func unitability<-unitability-xmlchild)
   */
  public static interface Func_unitability_from_unitability_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitability vx_unitability_from_unitability_xmlchild(final Base.Type_unitability unitability, final Xml.Type_xml child);
  }

  public static class Class_unitability_from_unitability_xmlchild extends Core.Class_base implements Func_unitability_from_unitability_xmlchild {

    @Override
    public Func_unitability_from_unitability_xmlchild vx_new(Object... vals) {
      Class_unitability_from_unitability_xmlchild output = new Class_unitability_from_unitability_xmlchild();
      return output;
    }

    @Override
    public Func_unitability_from_unitability_xmlchild vx_copy(Object... vals) {
      Class_unitability_from_unitability_xmlchild output = new Class_unitability_from_unitability_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitability<-unitability-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitability", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitability_from_unitability_xmlchild vx_empty() {return e_unitability_from_unitability_xmlchild;}
    @Override
    public Func_unitability_from_unitability_xmlchild vx_type() {return t_unitability_from_unitability_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitability unitability = Core.f_any_from_any(Base.t_unitability, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitability_from_unitability_xmlchild(unitability, child);
      return output;
    }

    @Override
    public Base.Type_unitability vx_unitability_from_unitability_xmlchild(final Base.Type_unitability unitability, final Xml.Type_xml child) {
      return Bookloader.f_unitability_from_unitability_xmlchild(unitability, child);
    }

  }

  public static final Func_unitability_from_unitability_xmlchild e_unitability_from_unitability_xmlchild = new Bookloader.Class_unitability_from_unitability_xmlchild();
  public static final Func_unitability_from_unitability_xmlchild t_unitability_from_unitability_xmlchild = new Bookloader.Class_unitability_from_unitability_xmlchild();

  public static Base.Type_unitability f_unitability_from_unitability_xmlchild(final Base.Type_unitability unitability, final Xml.Type_xml child) {
    Base.Type_unitability output = Base.e_unitability;
    output = Core.f_let(
      Base.t_unitability,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_unitability,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return unitability;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitability,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitability,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_unitability,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitability_from_xml
   * Returns a unitability from a given xml.
   * @param  {xml} xml
   * @return {unitability}
   * (func unitability<-xml)
   */
  public static interface Func_unitability_from_xml extends Core.Func_any_from_any {
    public Base.Type_unitability vx_unitability_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_unitability_from_xml extends Core.Class_base implements Func_unitability_from_xml {

    @Override
    public Func_unitability_from_xml vx_new(Object... vals) {
      Class_unitability_from_xml output = new Class_unitability_from_xml();
      return output;
    }

    @Override
    public Func_unitability_from_xml vx_copy(Object... vals) {
      Class_unitability_from_xml output = new Class_unitability_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitability<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitability", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitability_from_xml vx_empty() {return e_unitability_from_xml;}
    @Override
    public Func_unitability_from_xml vx_type() {return t_unitability_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_unitability_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_unitability_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_unitability vx_unitability_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_unitability_from_xml(xml);
    }

  }

  public static final Func_unitability_from_xml e_unitability_from_xml = new Bookloader.Class_unitability_from_xml();
  public static final Func_unitability_from_xml t_unitability_from_xml = new Bookloader.Class_unitability_from_xml();

  public static Base.Type_unitability f_unitability_from_xml(final Xml.Type_xml xml) {
    Base.Type_unitability output = Base.e_unitability;
    output = Core.f_let(
      Base.t_unitability,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_unitability unitability = Bookloader.f_unitability_from_unitability_stringmap(
          Core.f_empty(
            Base.t_unitability
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_unitability,
          xml.children(),
          unitability,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unitability_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_unitability unitability_lmb = Core.f_any_from_any(Base.t_unitability, unitability_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_unitability_from_unitability_xmlchild(unitability_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function unititem_from_unititem_key_value
   * Returns a modified unititem from a key value.
   * @param  {unititem} current
   * @param  {string} key
   * @param  {string} value
   * @return {unititem}
   * (func unititem<-unititem-key-value)
   */
  public static interface Func_unititem_from_unititem_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unititem vx_unititem_from_unititem_key_value(final Base.Type_unititem current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_unititem_from_unititem_key_value extends Core.Class_base implements Func_unititem_from_unititem_key_value {

    @Override
    public Func_unititem_from_unititem_key_value vx_new(Object... vals) {
      Class_unititem_from_unititem_key_value output = new Class_unititem_from_unititem_key_value();
      return output;
    }

    @Override
    public Func_unititem_from_unititem_key_value vx_copy(Object... vals) {
      Class_unititem_from_unititem_key_value output = new Class_unititem_from_unititem_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unititem<-unititem-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unititem", // name
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
    public Func_unititem_from_unititem_key_value vx_empty() {return e_unititem_from_unititem_key_value;}
    @Override
    public Func_unititem_from_unititem_key_value vx_type() {return t_unititem_from_unititem_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unititem current = Core.f_any_from_any(Base.t_unititem, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_unititem_from_unititem_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_unititem vx_unititem_from_unititem_key_value(final Base.Type_unititem current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_unititem_from_unititem_key_value(current, key, value);
    }

  }

  public static final Func_unititem_from_unititem_key_value e_unititem_from_unititem_key_value = new Bookloader.Class_unititem_from_unititem_key_value();
  public static final Func_unititem_from_unititem_key_value t_unititem_from_unititem_key_value = new Bookloader.Class_unititem_from_unititem_key_value();

  public static Base.Type_unititem f_unititem_from_unititem_key_value(final Base.Type_unititem current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_unititem output = Base.e_unititem;
    output = Core.f_switch(
      Base.t_unititem,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("facing"),
              Core.vx_new_string("modifiers"),
              Core.vx_new_string("number"),
              Core.vx_new_string("rounds")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_unititem,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function unititem_from_unititem_stringmap
   * Returns a new unititem from a propmap.
   * @param  {unititem} unititem
   * @param  {stringmap} propmap
   * @return {unititem}
   * (func unititem<-unititem-stringmap)
   */
  public static interface Func_unititem_from_unititem_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unititem vx_unititem_from_unititem_stringmap(final Base.Type_unititem unititem, final Core.Type_stringmap propmap);
  }

  public static class Class_unititem_from_unititem_stringmap extends Core.Class_base implements Func_unititem_from_unititem_stringmap {

    @Override
    public Func_unititem_from_unititem_stringmap vx_new(Object... vals) {
      Class_unititem_from_unititem_stringmap output = new Class_unititem_from_unititem_stringmap();
      return output;
    }

    @Override
    public Func_unititem_from_unititem_stringmap vx_copy(Object... vals) {
      Class_unititem_from_unititem_stringmap output = new Class_unititem_from_unititem_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unititem<-unititem-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unititem", // name
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
    public Func_unititem_from_unititem_stringmap vx_empty() {return e_unititem_from_unititem_stringmap;}
    @Override
    public Func_unititem_from_unititem_stringmap vx_type() {return t_unititem_from_unititem_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unititem unititem = Core.f_any_from_any(Base.t_unititem, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unititem_from_unititem_stringmap(unititem, propmap);
      return output;
    }

    @Override
    public Base.Type_unititem vx_unititem_from_unititem_stringmap(final Base.Type_unititem unititem, final Core.Type_stringmap propmap) {
      return Bookloader.f_unititem_from_unititem_stringmap(unititem, propmap);
    }

  }

  public static final Func_unititem_from_unititem_stringmap e_unititem_from_unititem_stringmap = new Bookloader.Class_unititem_from_unititem_stringmap();
  public static final Func_unititem_from_unititem_stringmap t_unititem_from_unititem_stringmap = new Bookloader.Class_unititem_from_unititem_stringmap();

  public static Base.Type_unititem f_unititem_from_unititem_stringmap(final Base.Type_unititem unititem, final Core.Type_stringmap propmap) {
    Base.Type_unititem output = Base.e_unititem;
    output = Core.f_any_from_map_start_reduce(
      Base.t_unititem,
      propmap,
      unititem,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_unititem current_lmb = Core.f_any_from_any(Base.t_unititem, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_unititem_from_unititem_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function unititem_from_unititem_xmlchild
   * Returns a modified unititem based on a given child xml.
   * @param  {unititem} unititem
   * @param  {xml} child
   * @return {unititem}
   * (func unititem<-unititem-xmlchild)
   */
  public static interface Func_unititem_from_unititem_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unititem vx_unititem_from_unititem_xmlchild(final Base.Type_unititem unititem, final Xml.Type_xml child);
  }

  public static class Class_unititem_from_unititem_xmlchild extends Core.Class_base implements Func_unititem_from_unititem_xmlchild {

    @Override
    public Func_unititem_from_unititem_xmlchild vx_new(Object... vals) {
      Class_unititem_from_unititem_xmlchild output = new Class_unititem_from_unititem_xmlchild();
      return output;
    }

    @Override
    public Func_unititem_from_unititem_xmlchild vx_copy(Object... vals) {
      Class_unititem_from_unititem_xmlchild output = new Class_unititem_from_unititem_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unititem<-unititem-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unititem", // name
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
    public Func_unititem_from_unititem_xmlchild vx_empty() {return e_unititem_from_unititem_xmlchild;}
    @Override
    public Func_unititem_from_unititem_xmlchild vx_type() {return t_unititem_from_unititem_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unititem unititem = Core.f_any_from_any(Base.t_unititem, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unititem_from_unititem_xmlchild(unititem, child);
      return output;
    }

    @Override
    public Base.Type_unititem vx_unititem_from_unititem_xmlchild(final Base.Type_unititem unititem, final Xml.Type_xml child) {
      return Bookloader.f_unititem_from_unititem_xmlchild(unititem, child);
    }

  }

  public static final Func_unititem_from_unititem_xmlchild e_unititem_from_unititem_xmlchild = new Bookloader.Class_unititem_from_unititem_xmlchild();
  public static final Func_unititem_from_unititem_xmlchild t_unititem_from_unititem_xmlchild = new Bookloader.Class_unititem_from_unititem_xmlchild();

  public static Base.Type_unititem f_unititem_from_unititem_xmlchild(final Base.Type_unititem unititem, final Xml.Type_xml child) {
    Base.Type_unititem output = Base.e_unititem;
    output = Core.f_let(
      Base.t_unititem,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_unititem,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return unititem;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unititem,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unititem,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_unititem,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unititem_from_xml
   * Returns a unititem from a given xml.
   * @param  {xml} xml
   * @return {unititem}
   * (func unititem<-xml)
   */
  public static interface Func_unititem_from_xml extends Core.Func_any_from_any {
    public Base.Type_unititem vx_unititem_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_unititem_from_xml extends Core.Class_base implements Func_unititem_from_xml {

    @Override
    public Func_unititem_from_xml vx_new(Object... vals) {
      Class_unititem_from_xml output = new Class_unititem_from_xml();
      return output;
    }

    @Override
    public Func_unititem_from_xml vx_copy(Object... vals) {
      Class_unititem_from_xml output = new Class_unititem_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unititem<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unititem", // name
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
    public Func_unititem_from_xml vx_empty() {return e_unititem_from_xml;}
    @Override
    public Func_unititem_from_xml vx_type() {return t_unititem_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_unititem_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_unititem_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_unititem vx_unititem_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_unititem_from_xml(xml);
    }

  }

  public static final Func_unititem_from_xml e_unititem_from_xml = new Bookloader.Class_unititem_from_xml();
  public static final Func_unititem_from_xml t_unititem_from_xml = new Bookloader.Class_unititem_from_xml();

  public static Base.Type_unititem f_unititem_from_xml(final Xml.Type_xml xml) {
    Base.Type_unititem output = Base.e_unititem;
    output = Core.f_let(
      Base.t_unititem,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Xml.Type_xmllist children = xml.children();
        final Base.Type_unititem unititem = Bookloader.f_unititem_from_unititem_stringmap(
          Core.f_empty(
            Base.t_unititem
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_unititem,
          children,
          unititem,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unititem_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_unititem unititem_lmb = Core.f_any_from_any(Base.t_unititem, unititem_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_unititem_from_unititem_xmlchild(unititem_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function unitpower_from_unitpower_key_value
   * Returns a modified unitpower from a key value.
   * @param  {unitpower} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitpower}
   * (func unitpower<-unitpower-key-value)
   */
  public static interface Func_unitpower_from_unitpower_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitpower vx_unitpower_from_unitpower_key_value(final Base.Type_unitpower current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_unitpower_from_unitpower_key_value extends Core.Class_base implements Func_unitpower_from_unitpower_key_value {

    @Override
    public Func_unitpower_from_unitpower_key_value vx_new(Object... vals) {
      Class_unitpower_from_unitpower_key_value output = new Class_unitpower_from_unitpower_key_value();
      return output;
    }

    @Override
    public Func_unitpower_from_unitpower_key_value vx_copy(Object... vals) {
      Class_unitpower_from_unitpower_key_value output = new Class_unitpower_from_unitpower_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitpower<-unitpower-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitpower", // name
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
    public Func_unitpower_from_unitpower_key_value vx_empty() {return e_unitpower_from_unitpower_key_value;}
    @Override
    public Func_unitpower_from_unitpower_key_value vx_type() {return t_unitpower_from_unitpower_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitpower current = Core.f_any_from_any(Base.t_unitpower, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_unitpower_from_unitpower_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_unitpower vx_unitpower_from_unitpower_key_value(final Base.Type_unitpower current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_unitpower_from_unitpower_key_value(current, key, value);
    }

  }

  public static final Func_unitpower_from_unitpower_key_value e_unitpower_from_unitpower_key_value = new Bookloader.Class_unitpower_from_unitpower_key_value();
  public static final Func_unitpower_from_unitpower_key_value t_unitpower_from_unitpower_key_value = new Bookloader.Class_unitpower_from_unitpower_key_value();

  public static Base.Type_unitpower f_unitpower_from_unitpower_key_value(final Base.Type_unitpower current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_unitpower output = Base.e_unitpower;
    output = Core.f_switch(
      Base.t_unitpower,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("back"),
              Core.vx_new_string("bottom"),
              Core.vx_new_string("front"),
              Core.vx_new_string("level"),
              Core.vx_new_string("over"),
              Core.vx_new_string("side"),
              Core.vx_new_string("strength"),
              Core.vx_new_string("under")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_unitpower,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function unitpower_from_unitpower_stringmap
   * Returns a new unitpower from a propmap.
   * @param  {unitpower} unitpower
   * @param  {stringmap} propmap
   * @return {unitpower}
   * (func unitpower<-unitpower-stringmap)
   */
  public static interface Func_unitpower_from_unitpower_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitpower vx_unitpower_from_unitpower_stringmap(final Base.Type_unitpower unitpower, final Core.Type_stringmap propmap);
  }

  public static class Class_unitpower_from_unitpower_stringmap extends Core.Class_base implements Func_unitpower_from_unitpower_stringmap {

    @Override
    public Func_unitpower_from_unitpower_stringmap vx_new(Object... vals) {
      Class_unitpower_from_unitpower_stringmap output = new Class_unitpower_from_unitpower_stringmap();
      return output;
    }

    @Override
    public Func_unitpower_from_unitpower_stringmap vx_copy(Object... vals) {
      Class_unitpower_from_unitpower_stringmap output = new Class_unitpower_from_unitpower_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitpower<-unitpower-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitpower", // name
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
    public Func_unitpower_from_unitpower_stringmap vx_empty() {return e_unitpower_from_unitpower_stringmap;}
    @Override
    public Func_unitpower_from_unitpower_stringmap vx_type() {return t_unitpower_from_unitpower_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitpower unitpower = Core.f_any_from_any(Base.t_unitpower, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitpower_from_unitpower_stringmap(unitpower, propmap);
      return output;
    }

    @Override
    public Base.Type_unitpower vx_unitpower_from_unitpower_stringmap(final Base.Type_unitpower unitpower, final Core.Type_stringmap propmap) {
      return Bookloader.f_unitpower_from_unitpower_stringmap(unitpower, propmap);
    }

  }

  public static final Func_unitpower_from_unitpower_stringmap e_unitpower_from_unitpower_stringmap = new Bookloader.Class_unitpower_from_unitpower_stringmap();
  public static final Func_unitpower_from_unitpower_stringmap t_unitpower_from_unitpower_stringmap = new Bookloader.Class_unitpower_from_unitpower_stringmap();

  public static Base.Type_unitpower f_unitpower_from_unitpower_stringmap(final Base.Type_unitpower unitpower, final Core.Type_stringmap propmap) {
    Base.Type_unitpower output = Base.e_unitpower;
    output = Core.f_any_from_map_start_reduce(
      Base.t_unitpower,
      propmap,
      unitpower,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_unitpower current_lmb = Core.f_any_from_any(Base.t_unitpower, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_unitpower_from_unitpower_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function unitpower_from_unitpower_xmlability
   * @param  {unitpower} unitpower
   * @param  {xml} xmlability
   * @return {unitpower}
   * (func unitpower<-unitpower-xmlability)
   */
  public static interface Func_unitpower_from_unitpower_xmlability extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlability(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlability);
  }

  public static class Class_unitpower_from_unitpower_xmlability extends Core.Class_base implements Func_unitpower_from_unitpower_xmlability {

    @Override
    public Func_unitpower_from_unitpower_xmlability vx_new(Object... vals) {
      Class_unitpower_from_unitpower_xmlability output = new Class_unitpower_from_unitpower_xmlability();
      return output;
    }

    @Override
    public Func_unitpower_from_unitpower_xmlability vx_copy(Object... vals) {
      Class_unitpower_from_unitpower_xmlability output = new Class_unitpower_from_unitpower_xmlability();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitpower<-unitpower-xmlability", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitpower", // name
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
    public Func_unitpower_from_unitpower_xmlability vx_empty() {return e_unitpower_from_unitpower_xmlability;}
    @Override
    public Func_unitpower_from_unitpower_xmlability vx_type() {return t_unitpower_from_unitpower_xmlability;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitpower unitpower = Core.f_any_from_any(Base.t_unitpower, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlability = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitpower_from_unitpower_xmlability(unitpower, xmlability);
      return output;
    }

    @Override
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlability(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlability) {
      return Bookloader.f_unitpower_from_unitpower_xmlability(unitpower, xmlability);
    }

  }

  public static final Func_unitpower_from_unitpower_xmlability e_unitpower_from_unitpower_xmlability = new Bookloader.Class_unitpower_from_unitpower_xmlability();
  public static final Func_unitpower_from_unitpower_xmlability t_unitpower_from_unitpower_xmlability = new Bookloader.Class_unitpower_from_unitpower_xmlability();

  public static Base.Type_unitpower f_unitpower_from_unitpower_xmlability(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlability) {
    Base.Type_unitpower output = Base.e_unitpower;
    output = Core.f_let(
      Base.t_unitpower,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unitability ability = Bookloader.f_unitability_from_xml(xmlability);
        final Core.Type_string name = ability.name();
        final Base.Type_unitabilitymap origmap = unitpower.unitabilitymap();
        final Base.Type_unitabilitymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              ability
          )
        );
        return Core.f_copy(
          unitpower,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitabilitymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitpower_from_unitpower_xmlchild
   * @param  {unitpower} unitpower
   * @param  {xml} child
   * @return {unitpower}
   * (func unitpower<-unitpower-xmlchild)
   */
  public static interface Func_unitpower_from_unitpower_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlchild(final Base.Type_unitpower unitpower, final Xml.Type_xml child);
  }

  public static class Class_unitpower_from_unitpower_xmlchild extends Core.Class_base implements Func_unitpower_from_unitpower_xmlchild {

    @Override
    public Func_unitpower_from_unitpower_xmlchild vx_new(Object... vals) {
      Class_unitpower_from_unitpower_xmlchild output = new Class_unitpower_from_unitpower_xmlchild();
      return output;
    }

    @Override
    public Func_unitpower_from_unitpower_xmlchild vx_copy(Object... vals) {
      Class_unitpower_from_unitpower_xmlchild output = new Class_unitpower_from_unitpower_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitpower<-unitpower-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitpower", // name
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
    public Func_unitpower_from_unitpower_xmlchild vx_empty() {return e_unitpower_from_unitpower_xmlchild;}
    @Override
    public Func_unitpower_from_unitpower_xmlchild vx_type() {return t_unitpower_from_unitpower_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitpower unitpower = Core.f_any_from_any(Base.t_unitpower, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitpower_from_unitpower_xmlchild(unitpower, child);
      return output;
    }

    @Override
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlchild(final Base.Type_unitpower unitpower, final Xml.Type_xml child) {
      return Bookloader.f_unitpower_from_unitpower_xmlchild(unitpower, child);
    }

  }

  public static final Func_unitpower_from_unitpower_xmlchild e_unitpower_from_unitpower_xmlchild = new Bookloader.Class_unitpower_from_unitpower_xmlchild();
  public static final Func_unitpower_from_unitpower_xmlchild t_unitpower_from_unitpower_xmlchild = new Bookloader.Class_unitpower_from_unitpower_xmlchild();

  public static Base.Type_unitpower f_unitpower_from_unitpower_xmlchild(final Base.Type_unitpower unitpower, final Xml.Type_xml child) {
    Base.Type_unitpower output = Base.e_unitpower;
    output = Core.f_let(
      Base.t_unitpower,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_unitpower,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return unitpower;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitpower,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("ability"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unitpower_from_unitpower_xmlability(unitpower, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("item"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unitpower_from_unitpower_xmlitem(unitpower, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("specialty"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unitpower_from_unitpower_xmlspecialty(unitpower, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitpower,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_unitpower,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitpower_from_unitpower_xmlitem
   * @param  {unitpower} unitpower
   * @param  {xml} xmlitem
   * @return {unitpower}
   * (func unitpower<-unitpower-xmlitem)
   */
  public static interface Func_unitpower_from_unitpower_xmlitem extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlitem(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlitem);
  }

  public static class Class_unitpower_from_unitpower_xmlitem extends Core.Class_base implements Func_unitpower_from_unitpower_xmlitem {

    @Override
    public Func_unitpower_from_unitpower_xmlitem vx_new(Object... vals) {
      Class_unitpower_from_unitpower_xmlitem output = new Class_unitpower_from_unitpower_xmlitem();
      return output;
    }

    @Override
    public Func_unitpower_from_unitpower_xmlitem vx_copy(Object... vals) {
      Class_unitpower_from_unitpower_xmlitem output = new Class_unitpower_from_unitpower_xmlitem();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitpower<-unitpower-xmlitem", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitpower", // name
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
    public Func_unitpower_from_unitpower_xmlitem vx_empty() {return e_unitpower_from_unitpower_xmlitem;}
    @Override
    public Func_unitpower_from_unitpower_xmlitem vx_type() {return t_unitpower_from_unitpower_xmlitem;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitpower unitpower = Core.f_any_from_any(Base.t_unitpower, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlitem = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitpower_from_unitpower_xmlitem(unitpower, xmlitem);
      return output;
    }

    @Override
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlitem(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlitem) {
      return Bookloader.f_unitpower_from_unitpower_xmlitem(unitpower, xmlitem);
    }

  }

  public static final Func_unitpower_from_unitpower_xmlitem e_unitpower_from_unitpower_xmlitem = new Bookloader.Class_unitpower_from_unitpower_xmlitem();
  public static final Func_unitpower_from_unitpower_xmlitem t_unitpower_from_unitpower_xmlitem = new Bookloader.Class_unitpower_from_unitpower_xmlitem();

  public static Base.Type_unitpower f_unitpower_from_unitpower_xmlitem(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlitem) {
    Base.Type_unitpower output = Base.e_unitpower;
    output = Core.f_let(
      Base.t_unitpower,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unititem item = Bookloader.f_unititem_from_xml(xmlitem);
        final Core.Type_string name = item.name();
        final Base.Type_unititemmap origmap = unitpower.unititemmap();
        final Base.Type_unititemmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              item
          )
        );
        return Core.f_copy(
          unitpower,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unititemmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitpower_from_unitpower_xmlspecialty
   * @param  {unitpower} unitpower
   * @param  {xml} xmlspecialty
   * @return {unitpower}
   * (func unitpower<-unitpower-xmlspecialty)
   */
  public static interface Func_unitpower_from_unitpower_xmlspecialty extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlspecialty(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlspecialty);
  }

  public static class Class_unitpower_from_unitpower_xmlspecialty extends Core.Class_base implements Func_unitpower_from_unitpower_xmlspecialty {

    @Override
    public Func_unitpower_from_unitpower_xmlspecialty vx_new(Object... vals) {
      Class_unitpower_from_unitpower_xmlspecialty output = new Class_unitpower_from_unitpower_xmlspecialty();
      return output;
    }

    @Override
    public Func_unitpower_from_unitpower_xmlspecialty vx_copy(Object... vals) {
      Class_unitpower_from_unitpower_xmlspecialty output = new Class_unitpower_from_unitpower_xmlspecialty();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitpower<-unitpower-xmlspecialty", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitpower", // name
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
    public Func_unitpower_from_unitpower_xmlspecialty vx_empty() {return e_unitpower_from_unitpower_xmlspecialty;}
    @Override
    public Func_unitpower_from_unitpower_xmlspecialty vx_type() {return t_unitpower_from_unitpower_xmlspecialty;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitpower unitpower = Core.f_any_from_any(Base.t_unitpower, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlspecialty = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitpower_from_unitpower_xmlspecialty(unitpower, xmlspecialty);
      return output;
    }

    @Override
    public Base.Type_unitpower vx_unitpower_from_unitpower_xmlspecialty(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlspecialty) {
      return Bookloader.f_unitpower_from_unitpower_xmlspecialty(unitpower, xmlspecialty);
    }

  }

  public static final Func_unitpower_from_unitpower_xmlspecialty e_unitpower_from_unitpower_xmlspecialty = new Bookloader.Class_unitpower_from_unitpower_xmlspecialty();
  public static final Func_unitpower_from_unitpower_xmlspecialty t_unitpower_from_unitpower_xmlspecialty = new Bookloader.Class_unitpower_from_unitpower_xmlspecialty();

  public static Base.Type_unitpower f_unitpower_from_unitpower_xmlspecialty(final Base.Type_unitpower unitpower, final Xml.Type_xml xmlspecialty) {
    Base.Type_unitpower output = Base.e_unitpower;
    output = Core.f_let(
      Base.t_unitpower,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unitspecialty specialty = Bookloader.f_unitspecialty_from_xml(xmlspecialty);
        final Core.Type_string name = specialty.name();
        final Base.Type_unitspecialtymap origmap = unitpower.unitspecialtymap();
        final Base.Type_unitspecialtymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              specialty
          )
        );
        return Core.f_copy(
          unitpower,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitspecialtymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitpower_from_xml
   * @param  {xml} xml
   * @return {unitpower}
   * (func unitpower<-xml)
   */
  public static interface Func_unitpower_from_xml extends Core.Func_any_from_any {
    public Base.Type_unitpower vx_unitpower_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_unitpower_from_xml extends Core.Class_base implements Func_unitpower_from_xml {

    @Override
    public Func_unitpower_from_xml vx_new(Object... vals) {
      Class_unitpower_from_xml output = new Class_unitpower_from_xml();
      return output;
    }

    @Override
    public Func_unitpower_from_xml vx_copy(Object... vals) {
      Class_unitpower_from_xml output = new Class_unitpower_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitpower<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitpower", // name
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
    public Func_unitpower_from_xml vx_empty() {return e_unitpower_from_xml;}
    @Override
    public Func_unitpower_from_xml vx_type() {return t_unitpower_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_unitpower_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_unitpower_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_unitpower vx_unitpower_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_unitpower_from_xml(xml);
    }

  }

  public static final Func_unitpower_from_xml e_unitpower_from_xml = new Bookloader.Class_unitpower_from_xml();
  public static final Func_unitpower_from_xml t_unitpower_from_xml = new Bookloader.Class_unitpower_from_xml();

  public static Base.Type_unitpower f_unitpower_from_xml(final Xml.Type_xml xml) {
    Base.Type_unitpower output = Base.e_unitpower;
    output = Core.f_let(
      Base.t_unitpower,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_unitpower unitpower = Bookloader.f_unitpower_from_unitpower_stringmap(
          Core.f_empty(
            Base.t_unitpower
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_unitpower,
          xml.children(),
          unitpower,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unitpower_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_unitpower unitpower_lmb = Core.f_any_from_any(Base.t_unitpower, unitpower_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_unitpower_from_unitpower_xmlchild(unitpower_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function unitskill_from_unitskill_key_value
   * Returns a modified unitskill from a key value.
   * @param  {unitskill} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitskill}
   * (func unitskill<-unitskill-key-value)
   */
  public static interface Func_unitskill_from_unitskill_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitskill vx_unitskill_from_unitskill_key_value(final Base.Type_unitskill current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_unitskill_from_unitskill_key_value extends Core.Class_base implements Func_unitskill_from_unitskill_key_value {

    @Override
    public Func_unitskill_from_unitskill_key_value vx_new(Object... vals) {
      Class_unitskill_from_unitskill_key_value output = new Class_unitskill_from_unitskill_key_value();
      return output;
    }

    @Override
    public Func_unitskill_from_unitskill_key_value vx_copy(Object... vals) {
      Class_unitskill_from_unitskill_key_value output = new Class_unitskill_from_unitskill_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitskill<-unitskill-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitskill", // name
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
    public Func_unitskill_from_unitskill_key_value vx_empty() {return e_unitskill_from_unitskill_key_value;}
    @Override
    public Func_unitskill_from_unitskill_key_value vx_type() {return t_unitskill_from_unitskill_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitskill current = Core.f_any_from_any(Base.t_unitskill, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_unitskill_from_unitskill_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_unitskill vx_unitskill_from_unitskill_key_value(final Base.Type_unitskill current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_unitskill_from_unitskill_key_value(current, key, value);
    }

  }

  public static final Func_unitskill_from_unitskill_key_value e_unitskill_from_unitskill_key_value = new Bookloader.Class_unitskill_from_unitskill_key_value();
  public static final Func_unitskill_from_unitskill_key_value t_unitskill_from_unitskill_key_value = new Bookloader.Class_unitskill_from_unitskill_key_value();

  public static Base.Type_unitskill f_unitskill_from_unitskill_key_value(final Base.Type_unitskill current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_unitskill output = Base.e_unitskill;
    output = Core.f_switch(
      Base.t_unitskill,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image"),
              Core.vx_new_string("back"),
              Core.vx_new_string("bottom"),
              Core.vx_new_string("front"),
              Core.vx_new_string("level"),
              Core.vx_new_string("side"),
              Core.vx_new_string("top")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_unitskill,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function unitskill_from_unitskill_stringmap
   * Returns a new unitskill from a propmap.
   * @param  {unitskill} unitskill
   * @param  {stringmap} propmap
   * @return {unitskill}
   * (func unitskill<-unitskill-stringmap)
   */
  public static interface Func_unitskill_from_unitskill_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitskill vx_unitskill_from_unitskill_stringmap(final Base.Type_unitskill unitskill, final Core.Type_stringmap propmap);
  }

  public static class Class_unitskill_from_unitskill_stringmap extends Core.Class_base implements Func_unitskill_from_unitskill_stringmap {

    @Override
    public Func_unitskill_from_unitskill_stringmap vx_new(Object... vals) {
      Class_unitskill_from_unitskill_stringmap output = new Class_unitskill_from_unitskill_stringmap();
      return output;
    }

    @Override
    public Func_unitskill_from_unitskill_stringmap vx_copy(Object... vals) {
      Class_unitskill_from_unitskill_stringmap output = new Class_unitskill_from_unitskill_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitskill<-unitskill-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitskill", // name
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
    public Func_unitskill_from_unitskill_stringmap vx_empty() {return e_unitskill_from_unitskill_stringmap;}
    @Override
    public Func_unitskill_from_unitskill_stringmap vx_type() {return t_unitskill_from_unitskill_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitskill unitskill = Core.f_any_from_any(Base.t_unitskill, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitskill_from_unitskill_stringmap(unitskill, propmap);
      return output;
    }

    @Override
    public Base.Type_unitskill vx_unitskill_from_unitskill_stringmap(final Base.Type_unitskill unitskill, final Core.Type_stringmap propmap) {
      return Bookloader.f_unitskill_from_unitskill_stringmap(unitskill, propmap);
    }

  }

  public static final Func_unitskill_from_unitskill_stringmap e_unitskill_from_unitskill_stringmap = new Bookloader.Class_unitskill_from_unitskill_stringmap();
  public static final Func_unitskill_from_unitskill_stringmap t_unitskill_from_unitskill_stringmap = new Bookloader.Class_unitskill_from_unitskill_stringmap();

  public static Base.Type_unitskill f_unitskill_from_unitskill_stringmap(final Base.Type_unitskill unitskill, final Core.Type_stringmap propmap) {
    Base.Type_unitskill output = Base.e_unitskill;
    output = Core.f_any_from_map_start_reduce(
      Base.t_unitskill,
      propmap,
      unitskill,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_unitskill current_lmb = Core.f_any_from_any(Base.t_unitskill, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_unitskill_from_unitskill_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function unitskill_from_unitskill_xmlability
   * @param  {unitskill} unitskill
   * @param  {xml} xmlability
   * @return {unitskill}
   * (func unitskill<-unitskill-xmlability)
   */
  public static interface Func_unitskill_from_unitskill_xmlability extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlability(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlability);
  }

  public static class Class_unitskill_from_unitskill_xmlability extends Core.Class_base implements Func_unitskill_from_unitskill_xmlability {

    @Override
    public Func_unitskill_from_unitskill_xmlability vx_new(Object... vals) {
      Class_unitskill_from_unitskill_xmlability output = new Class_unitskill_from_unitskill_xmlability();
      return output;
    }

    @Override
    public Func_unitskill_from_unitskill_xmlability vx_copy(Object... vals) {
      Class_unitskill_from_unitskill_xmlability output = new Class_unitskill_from_unitskill_xmlability();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitskill<-unitskill-xmlability", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitskill", // name
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
    public Func_unitskill_from_unitskill_xmlability vx_empty() {return e_unitskill_from_unitskill_xmlability;}
    @Override
    public Func_unitskill_from_unitskill_xmlability vx_type() {return t_unitskill_from_unitskill_xmlability;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitskill unitskill = Core.f_any_from_any(Base.t_unitskill, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlability = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitskill_from_unitskill_xmlability(unitskill, xmlability);
      return output;
    }

    @Override
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlability(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlability) {
      return Bookloader.f_unitskill_from_unitskill_xmlability(unitskill, xmlability);
    }

  }

  public static final Func_unitskill_from_unitskill_xmlability e_unitskill_from_unitskill_xmlability = new Bookloader.Class_unitskill_from_unitskill_xmlability();
  public static final Func_unitskill_from_unitskill_xmlability t_unitskill_from_unitskill_xmlability = new Bookloader.Class_unitskill_from_unitskill_xmlability();

  public static Base.Type_unitskill f_unitskill_from_unitskill_xmlability(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlability) {
    Base.Type_unitskill output = Base.e_unitskill;
    output = Core.f_let(
      Base.t_unitskill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unitability ability = Bookloader.f_unitability_from_xml(xmlability);
        final Core.Type_string name = ability.name();
        final Base.Type_unitabilitymap origmap = unitskill.unitabilitymap();
        final Base.Type_unitabilitymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              ability
          )
        );
        return Core.f_copy(
          unitskill,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitabilitymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitskill_from_unitskill_xmlchild
   * @param  {unitskill} unitskill
   * @param  {xml} child
   * @return {unitskill}
   * (func unitskill<-unitskill-xmlchild)
   */
  public static interface Func_unitskill_from_unitskill_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlchild(final Base.Type_unitskill unitskill, final Xml.Type_xml child);
  }

  public static class Class_unitskill_from_unitskill_xmlchild extends Core.Class_base implements Func_unitskill_from_unitskill_xmlchild {

    @Override
    public Func_unitskill_from_unitskill_xmlchild vx_new(Object... vals) {
      Class_unitskill_from_unitskill_xmlchild output = new Class_unitskill_from_unitskill_xmlchild();
      return output;
    }

    @Override
    public Func_unitskill_from_unitskill_xmlchild vx_copy(Object... vals) {
      Class_unitskill_from_unitskill_xmlchild output = new Class_unitskill_from_unitskill_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitskill<-unitskill-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitskill", // name
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
    public Func_unitskill_from_unitskill_xmlchild vx_empty() {return e_unitskill_from_unitskill_xmlchild;}
    @Override
    public Func_unitskill_from_unitskill_xmlchild vx_type() {return t_unitskill_from_unitskill_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitskill unitskill = Core.f_any_from_any(Base.t_unitskill, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitskill_from_unitskill_xmlchild(unitskill, child);
      return output;
    }

    @Override
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlchild(final Base.Type_unitskill unitskill, final Xml.Type_xml child) {
      return Bookloader.f_unitskill_from_unitskill_xmlchild(unitskill, child);
    }

  }

  public static final Func_unitskill_from_unitskill_xmlchild e_unitskill_from_unitskill_xmlchild = new Bookloader.Class_unitskill_from_unitskill_xmlchild();
  public static final Func_unitskill_from_unitskill_xmlchild t_unitskill_from_unitskill_xmlchild = new Bookloader.Class_unitskill_from_unitskill_xmlchild();

  public static Base.Type_unitskill f_unitskill_from_unitskill_xmlchild(final Base.Type_unitskill unitskill, final Xml.Type_xml child) {
    Base.Type_unitskill output = Base.e_unitskill;
    output = Core.f_let(
      Base.t_unitskill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_unitskill,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return unitskill;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitskill,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("ability"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unitskill_from_unitskill_xmlability(unitskill, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("item"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unitskill_from_unitskill_xmlitem(unitskill, child);
              })
            ),
            Core.f_case_1(
              Core.vx_new_string("specialty"),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Bookloader.f_unitskill_from_unitskill_xmlspecialty(unitskill, child);
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitskill,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_unitskill,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitskill_from_unitskill_xmlitem
   * @param  {unitskill} unitskill
   * @param  {xml} xmlitem
   * @return {unitskill}
   * (func unitskill<-unitskill-xmlitem)
   */
  public static interface Func_unitskill_from_unitskill_xmlitem extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlitem(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlitem);
  }

  public static class Class_unitskill_from_unitskill_xmlitem extends Core.Class_base implements Func_unitskill_from_unitskill_xmlitem {

    @Override
    public Func_unitskill_from_unitskill_xmlitem vx_new(Object... vals) {
      Class_unitskill_from_unitskill_xmlitem output = new Class_unitskill_from_unitskill_xmlitem();
      return output;
    }

    @Override
    public Func_unitskill_from_unitskill_xmlitem vx_copy(Object... vals) {
      Class_unitskill_from_unitskill_xmlitem output = new Class_unitskill_from_unitskill_xmlitem();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitskill<-unitskill-xmlitem", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitskill", // name
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
    public Func_unitskill_from_unitskill_xmlitem vx_empty() {return e_unitskill_from_unitskill_xmlitem;}
    @Override
    public Func_unitskill_from_unitskill_xmlitem vx_type() {return t_unitskill_from_unitskill_xmlitem;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitskill unitskill = Core.f_any_from_any(Base.t_unitskill, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlitem = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitskill_from_unitskill_xmlitem(unitskill, xmlitem);
      return output;
    }

    @Override
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlitem(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlitem) {
      return Bookloader.f_unitskill_from_unitskill_xmlitem(unitskill, xmlitem);
    }

  }

  public static final Func_unitskill_from_unitskill_xmlitem e_unitskill_from_unitskill_xmlitem = new Bookloader.Class_unitskill_from_unitskill_xmlitem();
  public static final Func_unitskill_from_unitskill_xmlitem t_unitskill_from_unitskill_xmlitem = new Bookloader.Class_unitskill_from_unitskill_xmlitem();

  public static Base.Type_unitskill f_unitskill_from_unitskill_xmlitem(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlitem) {
    Base.Type_unitskill output = Base.e_unitskill;
    output = Core.f_let(
      Base.t_unitskill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unititem item = Bookloader.f_unititem_from_xml(xmlitem);
        final Core.Type_string name = item.name();
        final Base.Type_unititemmap origmap = unitskill.unititemmap();
        final Base.Type_unititemmap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              item
          )
        );
        return Core.f_copy(
          unitskill,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unititemmap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitskill_from_unitskill_xmlspecialty
   * @param  {unitskill} unitskill
   * @param  {xml} xmlspecialty
   * @return {unitskill}
   * (func unitskill<-unitskill-xmlspecialty)
   */
  public static interface Func_unitskill_from_unitskill_xmlspecialty extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlspecialty(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlspecialty);
  }

  public static class Class_unitskill_from_unitskill_xmlspecialty extends Core.Class_base implements Func_unitskill_from_unitskill_xmlspecialty {

    @Override
    public Func_unitskill_from_unitskill_xmlspecialty vx_new(Object... vals) {
      Class_unitskill_from_unitskill_xmlspecialty output = new Class_unitskill_from_unitskill_xmlspecialty();
      return output;
    }

    @Override
    public Func_unitskill_from_unitskill_xmlspecialty vx_copy(Object... vals) {
      Class_unitskill_from_unitskill_xmlspecialty output = new Class_unitskill_from_unitskill_xmlspecialty();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitskill<-unitskill-xmlspecialty", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitskill", // name
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
    public Func_unitskill_from_unitskill_xmlspecialty vx_empty() {return e_unitskill_from_unitskill_xmlspecialty;}
    @Override
    public Func_unitskill_from_unitskill_xmlspecialty vx_type() {return t_unitskill_from_unitskill_xmlspecialty;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitskill unitskill = Core.f_any_from_any(Base.t_unitskill, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml xmlspecialty = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitskill_from_unitskill_xmlspecialty(unitskill, xmlspecialty);
      return output;
    }

    @Override
    public Base.Type_unitskill vx_unitskill_from_unitskill_xmlspecialty(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlspecialty) {
      return Bookloader.f_unitskill_from_unitskill_xmlspecialty(unitskill, xmlspecialty);
    }

  }

  public static final Func_unitskill_from_unitskill_xmlspecialty e_unitskill_from_unitskill_xmlspecialty = new Bookloader.Class_unitskill_from_unitskill_xmlspecialty();
  public static final Func_unitskill_from_unitskill_xmlspecialty t_unitskill_from_unitskill_xmlspecialty = new Bookloader.Class_unitskill_from_unitskill_xmlspecialty();

  public static Base.Type_unitskill f_unitskill_from_unitskill_xmlspecialty(final Base.Type_unitskill unitskill, final Xml.Type_xml xmlspecialty) {
    Base.Type_unitskill output = Base.e_unitskill;
    output = Core.f_let(
      Base.t_unitskill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Base.Type_unitspecialty specialty = Bookloader.f_unitspecialty_from_xml(xmlspecialty);
        final Core.Type_string name = specialty.name();
        final Base.Type_unitspecialtymap origmap = unitskill.unitspecialtymap();
        final Base.Type_unitspecialtymap chgmap = Core.f_copy(
          origmap,
          Core.t_anylist.vx_new(
              name,
              specialty
          )
        );
        return Core.f_copy(
          unitskill,
          Core.t_anylist.vx_new(
            Core.vx_new_string(":unitspecialtymap"),
            chgmap
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitskill_from_xml
   * @param  {xml} xml
   * @return {unitskill}
   * (func unitskill<-xml)
   */
  public static interface Func_unitskill_from_xml extends Core.Func_any_from_any {
    public Base.Type_unitskill vx_unitskill_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_unitskill_from_xml extends Core.Class_base implements Func_unitskill_from_xml {

    @Override
    public Func_unitskill_from_xml vx_new(Object... vals) {
      Class_unitskill_from_xml output = new Class_unitskill_from_xml();
      return output;
    }

    @Override
    public Func_unitskill_from_xml vx_copy(Object... vals) {
      Class_unitskill_from_xml output = new Class_unitskill_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitskill<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitskill", // name
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
    public Func_unitskill_from_xml vx_empty() {return e_unitskill_from_xml;}
    @Override
    public Func_unitskill_from_xml vx_type() {return t_unitskill_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_unitskill_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_unitskill_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_unitskill vx_unitskill_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_unitskill_from_xml(xml);
    }

  }

  public static final Func_unitskill_from_xml e_unitskill_from_xml = new Bookloader.Class_unitskill_from_xml();
  public static final Func_unitskill_from_xml t_unitskill_from_xml = new Bookloader.Class_unitskill_from_xml();

  public static Base.Type_unitskill f_unitskill_from_xml(final Xml.Type_xml xml) {
    Base.Type_unitskill output = Base.e_unitskill;
    output = Core.f_let(
      Base.t_unitskill,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_unitskill unitskill = Bookloader.f_unitskill_from_unitskill_stringmap(
          Core.f_empty(
            Base.t_unitskill
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_unitskill,
          xml.children(),
          unitskill,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unitskill_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_unitskill unitskill_lmb = Core.f_any_from_any(Base.t_unitskill, unitskill_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_unitskill_from_unitskill_xmlchild(unitskill_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function unitspecialty_from_unitspecialty_key_value
   * Returns a modified unitspecialty from a key value.
   * @param  {unitspecialty} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitspecialty}
   * (func unitspecialty<-unitspecialty-key-value)
   */
  public static interface Func_unitspecialty_from_unitspecialty_key_value extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitspecialty vx_unitspecialty_from_unitspecialty_key_value(final Base.Type_unitspecialty current, final Core.Type_string key, final Core.Type_string value);
  }

  public static class Class_unitspecialty_from_unitspecialty_key_value extends Core.Class_base implements Func_unitspecialty_from_unitspecialty_key_value {

    @Override
    public Func_unitspecialty_from_unitspecialty_key_value vx_new(Object... vals) {
      Class_unitspecialty_from_unitspecialty_key_value output = new Class_unitspecialty_from_unitspecialty_key_value();
      return output;
    }

    @Override
    public Func_unitspecialty_from_unitspecialty_key_value vx_copy(Object... vals) {
      Class_unitspecialty_from_unitspecialty_key_value output = new Class_unitspecialty_from_unitspecialty_key_value();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitspecialty<-unitspecialty-key-value", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitspecialty", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitspecialty_from_unitspecialty_key_value vx_empty() {return e_unitspecialty_from_unitspecialty_key_value;}
    @Override
    public Func_unitspecialty_from_unitspecialty_key_value vx_type() {return t_unitspecialty_from_unitspecialty_key_value;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitspecialty current = Core.f_any_from_any(Base.t_unitspecialty, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string key = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(1)));
      Core.Type_string value = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(2)));
      output = Bookloader.f_unitspecialty_from_unitspecialty_key_value(current, key, value);
      return output;
    }

    @Override
    public Base.Type_unitspecialty vx_unitspecialty_from_unitspecialty_key_value(final Base.Type_unitspecialty current, final Core.Type_string key, final Core.Type_string value) {
      return Bookloader.f_unitspecialty_from_unitspecialty_key_value(current, key, value);
    }

  }

  public static final Func_unitspecialty_from_unitspecialty_key_value e_unitspecialty_from_unitspecialty_key_value = new Bookloader.Class_unitspecialty_from_unitspecialty_key_value();
  public static final Func_unitspecialty_from_unitspecialty_key_value t_unitspecialty_from_unitspecialty_key_value = new Bookloader.Class_unitspecialty_from_unitspecialty_key_value();

  public static Base.Type_unitspecialty f_unitspecialty_from_unitspecialty_key_value(final Base.Type_unitspecialty current, final Core.Type_string key, final Core.Type_string value) {
    Base.Type_unitspecialty output = Base.e_unitspecialty;
    output = Core.f_switch(
      Base.t_unitspecialty,
      key,
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_list,
            Core.t_anylist.vx_new(
              Core.vx_new_string("name"),
              Core.vx_new_string("image")
            )
          ),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  key,
                  value
              )
            );
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidproperty"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_unitspecialty,
                        Core.vx_new_string(":prop"),
                        key,
                        Core.vx_new_string(":value"),
                        value
                      )
                    )
                  )
              )
            );
          })
        )
      )
    );
    return output;
  }

  /**
   * @function unitspecialty_from_unitspecialty_stringmap
   * Returns a new unitspecialty from a propmap.
   * @param  {unitspecialty} unitspecialty
   * @param  {stringmap} propmap
   * @return {unitspecialty}
   * (func unitspecialty<-unitspecialty-stringmap)
   */
  public static interface Func_unitspecialty_from_unitspecialty_stringmap extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitspecialty vx_unitspecialty_from_unitspecialty_stringmap(final Base.Type_unitspecialty unitspecialty, final Core.Type_stringmap propmap);
  }

  public static class Class_unitspecialty_from_unitspecialty_stringmap extends Core.Class_base implements Func_unitspecialty_from_unitspecialty_stringmap {

    @Override
    public Func_unitspecialty_from_unitspecialty_stringmap vx_new(Object... vals) {
      Class_unitspecialty_from_unitspecialty_stringmap output = new Class_unitspecialty_from_unitspecialty_stringmap();
      return output;
    }

    @Override
    public Func_unitspecialty_from_unitspecialty_stringmap vx_copy(Object... vals) {
      Class_unitspecialty_from_unitspecialty_stringmap output = new Class_unitspecialty_from_unitspecialty_stringmap();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitspecialty<-unitspecialty-stringmap", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitspecialty", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitspecialty_from_unitspecialty_stringmap vx_empty() {return e_unitspecialty_from_unitspecialty_stringmap;}
    @Override
    public Func_unitspecialty_from_unitspecialty_stringmap vx_type() {return t_unitspecialty_from_unitspecialty_stringmap;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitspecialty unitspecialty = Core.f_any_from_any(Base.t_unitspecialty, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_stringmap propmap = Core.f_any_from_any(Core.t_stringmap, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitspecialty_from_unitspecialty_stringmap(unitspecialty, propmap);
      return output;
    }

    @Override
    public Base.Type_unitspecialty vx_unitspecialty_from_unitspecialty_stringmap(final Base.Type_unitspecialty unitspecialty, final Core.Type_stringmap propmap) {
      return Bookloader.f_unitspecialty_from_unitspecialty_stringmap(unitspecialty, propmap);
    }

  }

  public static final Func_unitspecialty_from_unitspecialty_stringmap e_unitspecialty_from_unitspecialty_stringmap = new Bookloader.Class_unitspecialty_from_unitspecialty_stringmap();
  public static final Func_unitspecialty_from_unitspecialty_stringmap t_unitspecialty_from_unitspecialty_stringmap = new Bookloader.Class_unitspecialty_from_unitspecialty_stringmap();

  public static Base.Type_unitspecialty f_unitspecialty_from_unitspecialty_stringmap(final Base.Type_unitspecialty unitspecialty, final Core.Type_stringmap propmap) {
    Base.Type_unitspecialty output = Base.e_unitspecialty;
    output = Core.f_any_from_map_start_reduce(
      Base.t_unitspecialty,
      propmap,
      unitspecialty,
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_lmb_any, Core.Type_string key_lmb, Core.Type_any value_lmb_any) -> {
        Base.Type_unitspecialty current_lmb = Core.f_any_from_any(Base.t_unitspecialty, current_lmb_any);
        Core.Type_string value_lmb = Core.f_any_from_any(Core.t_string, value_lmb_any);
        Core.Type_any output_1 = Bookloader.f_unitspecialty_from_unitspecialty_key_value(current_lmb, key_lmb, value_lmb);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function unitspecialty_from_unitspecialty_xmlchild
   * Returns a modified unitspecialty based on a given child xml.
   * @param  {unitspecialty} unitspecialty
   * @param  {xml} child
   * @return {unitspecialty}
   * (func unitspecialty<-unitspecialty-xmlchild)
   */
  public static interface Func_unitspecialty_from_unitspecialty_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_unitspecialty vx_unitspecialty_from_unitspecialty_xmlchild(final Base.Type_unitspecialty unitspecialty, final Xml.Type_xml child);
  }

  public static class Class_unitspecialty_from_unitspecialty_xmlchild extends Core.Class_base implements Func_unitspecialty_from_unitspecialty_xmlchild {

    @Override
    public Func_unitspecialty_from_unitspecialty_xmlchild vx_new(Object... vals) {
      Class_unitspecialty_from_unitspecialty_xmlchild output = new Class_unitspecialty_from_unitspecialty_xmlchild();
      return output;
    }

    @Override
    public Func_unitspecialty_from_unitspecialty_xmlchild vx_copy(Object... vals) {
      Class_unitspecialty_from_unitspecialty_xmlchild output = new Class_unitspecialty_from_unitspecialty_xmlchild();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitspecialty<-unitspecialty-xmlchild", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitspecialty", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitspecialty_from_unitspecialty_xmlchild vx_empty() {return e_unitspecialty_from_unitspecialty_xmlchild;}
    @Override
    public Func_unitspecialty_from_unitspecialty_xmlchild vx_type() {return t_unitspecialty_from_unitspecialty_xmlchild;}

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_unitspecialty unitspecialty = Core.f_any_from_any(Base.t_unitspecialty, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_unitspecialty_from_unitspecialty_xmlchild(unitspecialty, child);
      return output;
    }

    @Override
    public Base.Type_unitspecialty vx_unitspecialty_from_unitspecialty_xmlchild(final Base.Type_unitspecialty unitspecialty, final Xml.Type_xml child) {
      return Bookloader.f_unitspecialty_from_unitspecialty_xmlchild(unitspecialty, child);
    }

  }

  public static final Func_unitspecialty_from_unitspecialty_xmlchild e_unitspecialty_from_unitspecialty_xmlchild = new Bookloader.Class_unitspecialty_from_unitspecialty_xmlchild();
  public static final Func_unitspecialty_from_unitspecialty_xmlchild t_unitspecialty_from_unitspecialty_xmlchild = new Bookloader.Class_unitspecialty_from_unitspecialty_xmlchild();

  public static Base.Type_unitspecialty f_unitspecialty_from_unitspecialty_xmlchild(final Base.Type_unitspecialty unitspecialty, final Xml.Type_xml child) {
    Base.Type_unitspecialty output = Base.e_unitspecialty;
    output = Core.f_let(
      Base.t_unitspecialty,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_string tag = child.tag();
        return Core.f_switch(
          Base.t_unitspecialty,
          tag,
          Core.t_thenelselist.vx_new(
            Core.f_case_1(
              Core.vx_new_string(""),
              Core.t_any_from_func.vx_fn_new(() -> {
                return unitspecialty;
              })
            ),
            Core.f_case(
              Core.f_new(
                Core.t_list,
                Core.t_anylist.vx_new(
                  Core.vx_new_string("reference"),
                  Core.vx_new_string("summary"),
                  Core.vx_new_string("titles")
                )
              ),
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitspecialty,
                  Core.t_anylist.vx_new(
                      tag,
                      Xml.f_string_first_from_xml(child)
                  )
                );
              })
            ),
            Core.f_else(
              Core.t_any_from_func.vx_fn_new(() -> {
                return Core.f_copy(
                  unitspecialty,
                  Core.t_anylist.vx_new(
                      Core.f_msg_from_error_1(
                        Core.vx_new_string(":invalidtagfound"),
                        Core.f_new(
                          Core.t_anymap,
                          Core.t_anylist.vx_new(
                            Core.vx_new_string(":type"),
                            Base.t_unitspecialty,
                            Core.vx_new_string(":tag"),
                            tag
                          )
                        )
                      )
                  )
                );
              })
            )
          )
        );
      })
    );
    return output;
  }

  /**
   * @function unitspecialty_from_xml
   * Returns a unitspecialty from a given xml.
   * @param  {xml} xml
   * @return {unitspecialty}
   * (func unitspecialty<-xml)
   */
  public static interface Func_unitspecialty_from_xml extends Core.Func_any_from_any {
    public Base.Type_unitspecialty vx_unitspecialty_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_unitspecialty_from_xml extends Core.Class_base implements Func_unitspecialty_from_xml {

    @Override
    public Func_unitspecialty_from_xml vx_new(Object... vals) {
      Class_unitspecialty_from_xml output = new Class_unitspecialty_from_xml();
      return output;
    }

    @Override
    public Func_unitspecialty_from_xml vx_copy(Object... vals) {
      Class_unitspecialty_from_xml output = new Class_unitspecialty_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitspecialty<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitspecialty", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_unitspecialty_from_xml vx_empty() {return e_unitspecialty_from_xml;}
    @Override
    public Func_unitspecialty_from_xml vx_type() {return t_unitspecialty_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_unitspecialty_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_unitspecialty_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_unitspecialty vx_unitspecialty_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_unitspecialty_from_xml(xml);
    }

  }

  public static final Func_unitspecialty_from_xml e_unitspecialty_from_xml = new Bookloader.Class_unitspecialty_from_xml();
  public static final Func_unitspecialty_from_xml t_unitspecialty_from_xml = new Bookloader.Class_unitspecialty_from_xml();

  public static Base.Type_unitspecialty f_unitspecialty_from_xml(final Xml.Type_xml xml) {
    Base.Type_unitspecialty output = Base.e_unitspecialty;
    output = Core.f_let(
      Base.t_unitspecialty,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_unitspecialty unitspecialty = Bookloader.f_unitspecialty_from_unitspecialty_stringmap(
          Core.f_empty(
            Base.t_unitspecialty
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_unitspecialty,
          xml.children(),
          unitspecialty,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unitspecialty_lmb_any, Core.Type_any child_lmb_any) -> {
            Base.Type_unitspecialty unitspecialty_lmb = Core.f_any_from_any(Base.t_unitspecialty, unitspecialty_lmb_any);
            Xml.Type_xml child_lmb = Core.f_any_from_any(Xml.t_xml, child_lmb_any);
            Core.Type_any output_1 = Bookloader.f_unitspecialty_from_unitspecialty_xmlchild(unitspecialty_lmb, child_lmb);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function unitweakness_from_xml
   * @param  {xml} xml
   * @return {unitweakness}
   * (func unitweakness<-xml)
   */
  public static interface Func_unitweakness_from_xml extends Core.Func_any_from_any {
    public Base.Type_unitweakness vx_unitweakness_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_unitweakness_from_xml extends Core.Class_base implements Func_unitweakness_from_xml {

    @Override
    public Func_unitweakness_from_xml vx_new(Object... vals) {
      Class_unitweakness_from_xml output = new Class_unitweakness_from_xml();
      return output;
    }

    @Override
    public Func_unitweakness_from_xml vx_copy(Object... vals) {
      Class_unitweakness_from_xml output = new Class_unitweakness_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "unitweakness<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "unitweakness", // name
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
    public Func_unitweakness_from_xml vx_empty() {return e_unitweakness_from_xml;}
    @Override
    public Func_unitweakness_from_xml vx_type() {return t_unitweakness_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_unitweakness_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_unitweakness_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_unitweakness vx_unitweakness_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_unitweakness_from_xml(xml);
    }

  }

  public static final Func_unitweakness_from_xml e_unitweakness_from_xml = new Bookloader.Class_unitweakness_from_xml();
  public static final Func_unitweakness_from_xml t_unitweakness_from_xml = new Bookloader.Class_unitweakness_from_xml();

  public static Base.Type_unitweakness f_unitweakness_from_xml(final Xml.Type_xml xml) {
    Base.Type_unitweakness output = Base.e_unitweakness;
    return output;
  }

  /**
   * @function weakness_from_xml
   * @param  {xml} xml
   * @return {weakness}
   * (func weakness<-xml)
   */
  public static interface Func_weakness_from_xml extends Core.Func_any_from_any {
    public Base.Type_weakness vx_weakness_from_xml(final Xml.Type_xml xml);
  }

  public static class Class_weakness_from_xml extends Core.Class_base implements Func_weakness_from_xml {

    @Override
    public Func_weakness_from_xml vx_new(Object... vals) {
      Class_weakness_from_xml output = new Class_weakness_from_xml();
      return output;
    }

    @Override
    public Func_weakness_from_xml vx_copy(Object... vals) {
      Class_weakness_from_xml output = new Class_weakness_from_xml();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "weakness<-xml", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "nx/tactics/base", // pkgname
          "weakness", // name
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
    public Func_weakness_from_xml vx_empty() {return e_weakness_from_xml;}
    @Override
    public Func_weakness_from_xml vx_type() {return t_weakness_from_xml;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_weakness_from_xml(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xml = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_weakness_from_xml(xml);
      return output;
    }

    @Override
    public Base.Type_weakness vx_weakness_from_xml(final Xml.Type_xml xml) {
      return Bookloader.f_weakness_from_xml(xml);
    }

  }

  public static final Func_weakness_from_xml e_weakness_from_xml = new Bookloader.Class_weakness_from_xml();
  public static final Func_weakness_from_xml t_weakness_from_xml = new Bookloader.Class_weakness_from_xml();

  public static Base.Type_weakness f_weakness_from_xml(final Xml.Type_xml xml) {
    Base.Type_weakness output = Base.e_weakness;
    return output;
  }

  /**
   * @function xml_read_from_bookname
   * Returns an xml from a file with bookname.
   * @param  {string} bookname
   * @return {xml}
   * (func xml-read<-bookname)
   */
  public static interface Func_xml_read_from_bookname extends Core.Func_any_from_any_context {
    public Xml.Type_xml vx_xml_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname);
  }

  public static class Class_xml_read_from_bookname extends Core.Class_base implements Func_xml_read_from_bookname {

    @Override
    public Func_xml_read_from_bookname vx_new(Object... vals) {
      Class_xml_read_from_bookname output = new Class_xml_read_from_bookname();
      return output;
    }

    @Override
    public Func_xml_read_from_bookname vx_copy(Object... vals) {
      Class_xml_read_from_bookname output = new Class_xml_read_from_bookname();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "xml-read<-bookname", // name
        0, // idx
        false, // async
        Core.typedef_new(
          "vx/data/xml", // pkgname
          "xml", // name
          ":struct", // extends
          Core.e_typelist, // traits
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
    public Func_xml_read_from_bookname vx_empty() {return e_xml_read_from_bookname;}
    @Override
    public Func_xml_read_from_bookname vx_type() {return t_xml_read_from_bookname;}

    @Override
    public Core.Func_any_from_any_context vx_fn_new(Core.Class_any_from_any_context.IFn fn) {return Core.e_any_from_any_context;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any_context(final T generic_any_1, final Core.Type_context context, final U value) {
      T output = Core.f_empty(generic_any_1);
      Core.Type_string inputval = (Core.Type_string)value;
      Core.Type_any outputval = Bookloader.f_xml_read_from_bookname(context, inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Core.Type_context context = Core.f_any_from_any(Core.t_context, arglist.vx_any(Core.vx_new_int(0)));
      Core.Type_string bookname = Core.f_any_from_any(Core.t_string, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_xml_read_from_bookname(context, bookname);
      return output;
    }

    @Override
    public Xml.Type_xml vx_xml_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname) {
      return Bookloader.f_xml_read_from_bookname(context, bookname);
    }

  }

  public static final Func_xml_read_from_bookname e_xml_read_from_bookname = new Bookloader.Class_xml_read_from_bookname();
  public static final Func_xml_read_from_bookname t_xml_read_from_bookname = new Bookloader.Class_xml_read_from_bookname();

  public static Xml.Type_xml f_xml_read_from_bookname(final Core.Type_context context, final Core.Type_string bookname) {
    Xml.Type_xml output = Xml.e_xml;
    output = Xml.f_xml_read_from_file(
      context,
      Bookloader.f_file_read_from_bookname(bookname)
    );
    return output;
  }


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    mapfunc.put("ability<-ability-key-value", Bookloader.t_ability_from_ability_key_value);
    mapfunc.put("ability<-ability-stringmap", Bookloader.t_ability_from_ability_stringmap);
    mapfunc.put("ability<-ability-xmlchild", Bookloader.t_ability_from_ability_xmlchild);
    mapfunc.put("ability<-xml", Bookloader.t_ability_from_xml);
    mapfunc.put("book-read<-bookname", Bookloader.t_book_read_from_bookname);
    mapfunc.put("book<-book-key-value", Bookloader.t_book_from_book_key_value);
    mapfunc.put("book<-book-stringmap", Bookloader.t_book_from_book_stringmap);
    mapfunc.put("book<-book-xml", Bookloader.t_book_from_book_xml);
    mapfunc.put("book<-book-xmlchapter", Bookloader.t_book_from_book_xmlchapter);
    mapfunc.put("book<-book-xmlchild", Bookloader.t_book_from_book_xmlchild);
    mapfunc.put("book<-xml", Bookloader.t_book_from_xml);
    mapfunc.put("book<-xmldoc", Bookloader.t_book_from_xmldoc);
    mapfunc.put("book<-xmllist", Bookloader.t_book_from_xmllist);
    mapfunc.put("boolean-write<-book", Bookloader.t_boolean_write_from_book);
    mapfunc.put("boolean-write<-booknames", Bookloader.t_boolean_write_from_booknames);
    mapfunc.put("chapter<-chapter-key-value", Bookloader.t_chapter_from_chapter_key_value);
    mapfunc.put("chapter<-chapter-stringmap", Bookloader.t_chapter_from_chapter_stringmap);
    mapfunc.put("chapter<-chapter-xmlchild", Bookloader.t_chapter_from_chapter_xmlchild);
    mapfunc.put("chapter<-chapter-xmlsection", Bookloader.t_chapter_from_chapter_xmlsection);
    mapfunc.put("chapter<-xml", Bookloader.t_chapter_from_xml);
    mapfunc.put("damage<-damage-key-value", Bookloader.t_damage_from_damage_key_value);
    mapfunc.put("damage<-damage-stringmap", Bookloader.t_damage_from_damage_stringmap);
    mapfunc.put("damage<-damage-xmlchild", Bookloader.t_damage_from_damage_xmlchild);
    mapfunc.put("damage<-xml", Bookloader.t_damage_from_xml);
    mapfunc.put("file-read<-bookname", Bookloader.t_file_read_from_bookname);
    mapfunc.put("file-write<-book", Bookloader.t_file_write_from_book);
    mapfunc.put("item<-item-key-value", Bookloader.t_item_from_item_key_value);
    mapfunc.put("item<-item-stringmap", Bookloader.t_item_from_item_stringmap);
    mapfunc.put("item<-item-xmlchild", Bookloader.t_item_from_item_xmlchild);
    mapfunc.put("item<-xml", Bookloader.t_item_from_xml);
    mapfunc.put("location<-location-key-value", Bookloader.t_location_from_location_key_value);
    mapfunc.put("location<-location-stringmap", Bookloader.t_location_from_location_stringmap);
    mapfunc.put("location<-location-xmlchild", Bookloader.t_location_from_location_xmlchild);
    mapfunc.put("location<-xml", Bookloader.t_location_from_xml);
    mapfunc.put("modifier<-modifier-key-value", Bookloader.t_modifier_from_modifier_key_value);
    mapfunc.put("modifier<-modifier-stringmap", Bookloader.t_modifier_from_modifier_stringmap);
    mapfunc.put("modifier<-modifier-xmlchild", Bookloader.t_modifier_from_modifier_xmlchild);
    mapfunc.put("modifier<-xml", Bookloader.t_modifier_from_xml);
    mapfunc.put("power<-power-key-value", Bookloader.t_power_from_power_key_value);
    mapfunc.put("power<-power-stringmap", Bookloader.t_power_from_power_stringmap);
    mapfunc.put("power<-power-xmlability", Bookloader.t_power_from_power_xmlability);
    mapfunc.put("power<-power-xmlchild", Bookloader.t_power_from_power_xmlchild);
    mapfunc.put("power<-power-xmlspecialty", Bookloader.t_power_from_power_xmlspecialty);
    mapfunc.put("power<-xml", Bookloader.t_power_from_xml);
    mapfunc.put("rule<-rule-key-value", Bookloader.t_rule_from_rule_key_value);
    mapfunc.put("rule<-rule-stringmap", Bookloader.t_rule_from_rule_stringmap);
    mapfunc.put("rule<-rule-xmlchild", Bookloader.t_rule_from_rule_xmlchild);
    mapfunc.put("rule<-xml", Bookloader.t_rule_from_xml);
    mapfunc.put("scenario<-scenario-key-value", Bookloader.t_scenario_from_scenario_key_value);
    mapfunc.put("scenario<-scenario-stringmap", Bookloader.t_scenario_from_scenario_stringmap);
    mapfunc.put("scenario<-scenario-xmlchild", Bookloader.t_scenario_from_scenario_xmlchild);
    mapfunc.put("scenario<-scenario-xmlteam", Bookloader.t_scenario_from_scenario_xmlteam);
    mapfunc.put("scenario<-xml", Bookloader.t_scenario_from_xml);
    mapfunc.put("section<-section-key-value", Bookloader.t_section_from_section_key_value);
    mapfunc.put("section<-section-stringmap", Bookloader.t_section_from_section_stringmap);
    mapfunc.put("section<-section-xmlchild", Bookloader.t_section_from_section_xmlchild);
    mapfunc.put("section<-section-xmldamage", Bookloader.t_section_from_section_xmldamage);
    mapfunc.put("section<-section-xmlitem", Bookloader.t_section_from_section_xmlitem);
    mapfunc.put("section<-section-xmllocation", Bookloader.t_section_from_section_xmllocation);
    mapfunc.put("section<-section-xmlmodifier", Bookloader.t_section_from_section_xmlmodifier);
    mapfunc.put("section<-section-xmlpower", Bookloader.t_section_from_section_xmlpower);
    mapfunc.put("section<-section-xmlrule", Bookloader.t_section_from_section_xmlrule);
    mapfunc.put("section<-section-xmlscenario", Bookloader.t_section_from_section_xmlscenario);
    mapfunc.put("section<-section-xmlsection", Bookloader.t_section_from_section_xmlsection);
    mapfunc.put("section<-section-xmlskill", Bookloader.t_section_from_section_xmlskill);
    mapfunc.put("section<-section-xmlterrain", Bookloader.t_section_from_section_xmlterrain);
    mapfunc.put("section<-section-xmlunit", Bookloader.t_section_from_section_xmlunit);
    mapfunc.put("section<-xml", Bookloader.t_section_from_xml);
    mapfunc.put("skill<-skill-key-value", Bookloader.t_skill_from_skill_key_value);
    mapfunc.put("skill<-skill-stringmap", Bookloader.t_skill_from_skill_stringmap);
    mapfunc.put("skill<-skill-xmlability", Bookloader.t_skill_from_skill_xmlability);
    mapfunc.put("skill<-skill-xmlchild", Bookloader.t_skill_from_skill_xmlchild);
    mapfunc.put("skill<-skill-xmlspecialty", Bookloader.t_skill_from_skill_xmlspecialty);
    mapfunc.put("skill<-xml", Bookloader.t_skill_from_xml);
    mapfunc.put("specialty<-specialty-key-value", Bookloader.t_specialty_from_specialty_key_value);
    mapfunc.put("specialty<-specialty-stringmap", Bookloader.t_specialty_from_specialty_stringmap);
    mapfunc.put("specialty<-specialty-xmlchild", Bookloader.t_specialty_from_specialty_xmlchild);
    mapfunc.put("specialty<-xml", Bookloader.t_specialty_from_xml);
    mapfunc.put("string-read<-bookname", Bookloader.t_string_read_from_bookname);
    mapfunc.put("string-vxlisp-header<-chaptermap", Bookloader.t_string_vxlisp_header_from_chaptermap);
    mapfunc.put("string-vxlisp<-book", Bookloader.t_string_vxlisp_from_book);
    mapfunc.put("string-vxlisp<-chapter", Bookloader.t_string_vxlisp_from_chapter);
    mapfunc.put("string-vxlisp<-chaptermap", Bookloader.t_string_vxlisp_from_chaptermap);
    mapfunc.put("string-writename<-string", Bookloader.t_string_writename_from_string);
    mapfunc.put("team<-team-key-value", Bookloader.t_team_from_team_key_value);
    mapfunc.put("team<-team-stringmap", Bookloader.t_team_from_team_stringmap);
    mapfunc.put("team<-team-xmlchild", Bookloader.t_team_from_team_xmlchild);
    mapfunc.put("team<-xml", Bookloader.t_team_from_xml);
    mapfunc.put("terrain<-terrain-key-value", Bookloader.t_terrain_from_terrain_key_value);
    mapfunc.put("terrain<-terrain-stringmap", Bookloader.t_terrain_from_terrain_stringmap);
    mapfunc.put("terrain<-terrain-xmlchild", Bookloader.t_terrain_from_terrain_xmlchild);
    mapfunc.put("terrain<-xml", Bookloader.t_terrain_from_xml);
    mapfunc.put("unit<-unit-key-value", Bookloader.t_unit_from_unit_key_value);
    mapfunc.put("unit<-unit-stringmap", Bookloader.t_unit_from_unit_stringmap);
    mapfunc.put("unit<-unit-xmlchild", Bookloader.t_unit_from_unit_xmlchild);
    mapfunc.put("unit<-unit-xmlpower", Bookloader.t_unit_from_unit_xmlpower);
    mapfunc.put("unit<-unit-xmlskill", Bookloader.t_unit_from_unit_xmlskill);
    mapfunc.put("unit<-unit-xmlweakness", Bookloader.t_unit_from_unit_xmlweakness);
    mapfunc.put("unit<-xml", Bookloader.t_unit_from_xml);
    mapfunc.put("unitability<-unitability-key-value", Bookloader.t_unitability_from_unitability_key_value);
    mapfunc.put("unitability<-unitability-stringmap", Bookloader.t_unitability_from_unitability_stringmap);
    mapfunc.put("unitability<-unitability-xmlchild", Bookloader.t_unitability_from_unitability_xmlchild);
    mapfunc.put("unitability<-xml", Bookloader.t_unitability_from_xml);
    mapfunc.put("unititem<-unititem-key-value", Bookloader.t_unititem_from_unititem_key_value);
    mapfunc.put("unititem<-unititem-stringmap", Bookloader.t_unititem_from_unititem_stringmap);
    mapfunc.put("unititem<-unititem-xmlchild", Bookloader.t_unititem_from_unititem_xmlchild);
    mapfunc.put("unititem<-xml", Bookloader.t_unititem_from_xml);
    mapfunc.put("unitpower<-unitpower-key-value", Bookloader.t_unitpower_from_unitpower_key_value);
    mapfunc.put("unitpower<-unitpower-stringmap", Bookloader.t_unitpower_from_unitpower_stringmap);
    mapfunc.put("unitpower<-unitpower-xmlability", Bookloader.t_unitpower_from_unitpower_xmlability);
    mapfunc.put("unitpower<-unitpower-xmlchild", Bookloader.t_unitpower_from_unitpower_xmlchild);
    mapfunc.put("unitpower<-unitpower-xmlitem", Bookloader.t_unitpower_from_unitpower_xmlitem);
    mapfunc.put("unitpower<-unitpower-xmlspecialty", Bookloader.t_unitpower_from_unitpower_xmlspecialty);
    mapfunc.put("unitpower<-xml", Bookloader.t_unitpower_from_xml);
    mapfunc.put("unitskill<-unitskill-key-value", Bookloader.t_unitskill_from_unitskill_key_value);
    mapfunc.put("unitskill<-unitskill-stringmap", Bookloader.t_unitskill_from_unitskill_stringmap);
    mapfunc.put("unitskill<-unitskill-xmlability", Bookloader.t_unitskill_from_unitskill_xmlability);
    mapfunc.put("unitskill<-unitskill-xmlchild", Bookloader.t_unitskill_from_unitskill_xmlchild);
    mapfunc.put("unitskill<-unitskill-xmlitem", Bookloader.t_unitskill_from_unitskill_xmlitem);
    mapfunc.put("unitskill<-unitskill-xmlspecialty", Bookloader.t_unitskill_from_unitskill_xmlspecialty);
    mapfunc.put("unitskill<-xml", Bookloader.t_unitskill_from_xml);
    mapfunc.put("unitspecialty<-unitspecialty-key-value", Bookloader.t_unitspecialty_from_unitspecialty_key_value);
    mapfunc.put("unitspecialty<-unitspecialty-stringmap", Bookloader.t_unitspecialty_from_unitspecialty_stringmap);
    mapfunc.put("unitspecialty<-unitspecialty-xmlchild", Bookloader.t_unitspecialty_from_unitspecialty_xmlchild);
    mapfunc.put("unitspecialty<-xml", Bookloader.t_unitspecialty_from_xml);
    mapfunc.put("unitweakness<-xml", Bookloader.t_unitweakness_from_xml);
    mapfunc.put("weakness<-xml", Bookloader.t_weakness_from_xml);
    mapfunc.put("xml-read<-bookname", Bookloader.t_xml_read_from_bookname);
    Core.vx_global_package_set("nx/tactics/books/bookloader", maptype, mapconst, mapfunc);
  }

}
