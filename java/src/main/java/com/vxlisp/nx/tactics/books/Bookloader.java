package com.vxlisp.nx.tactics.books;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;
import com.vxlisp.nx.tactics.*;
import com.vxlisp.vx.data.*;

public final class Bookloader {

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
        return Bookloader.f_book_from_xmltop(xml);
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
          Core.vx_new_string("name"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("image"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":image"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
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
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_any, Core.Type_string key, Core.Type_any value_any) -> {
        Base.Type_book current = Core.f_any_from_any(Base.t_book, current_any);
        Core.Type_string value = Core.f_any_from_any(Core.t_string, value_any);
        Core.Type_any output_1 = Bookloader.f_book_from_book_key_value(current, key, value);
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
    output = Core.f_switch(
      Base.t_book,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string("xmlcomment"),
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
          Core.vx_new_string(""),
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
                      return Core.f_notempty_1(current);
                    }),
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
                                  Core.vx_new_string("doc")
                                )
                              )
                            )
                        )
                      );
                    })
                  ),
                  Core.f_else(
                    Core.t_any_from_func.vx_fn_new(() -> {
                      return Bookloader.f_book_from_book_xmlchild(current, child);
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
                        child.tag()
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
        final Base.Type_chaptermap chaptermap = book.chaptermap();
        final Base.Type_chaptermap chgmap = Core.f_copy(
          chaptermap,
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
   * Returns a modified book based on a given child Xml.
   * @param  {book} bk
   * @param  {xml} child
   * @return {book}
   * (func book<-book-xmlchild)
   */
  public static interface Func_book_from_book_xmlchild extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_book vx_book_from_book_xmlchild(final Base.Type_book bk, final Xml.Type_xml child);
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
      Base.Type_book bk = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(1)));
      output = Bookloader.f_book_from_book_xmlchild(bk, child);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_book_xmlchild(final Base.Type_book bk, final Xml.Type_xml child) {
      return Bookloader.f_book_from_book_xmlchild(bk, child);
    }

  }

  public static final Func_book_from_book_xmlchild e_book_from_book_xmlchild = new Bookloader.Class_book_from_book_xmlchild();
  public static final Func_book_from_book_xmlchild t_book_from_book_xmlchild = new Bookloader.Class_book_from_book_xmlchild();

  public static Base.Type_book f_book_from_book_xmlchild(final Base.Type_book bk, final Xml.Type_xml child) {
    Base.Type_book output = Base.e_book;
    output = Core.f_switch(
      Base.t_book,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string("reference"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              bk,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":reference"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("summary"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              bk,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("titles"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              bk,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return bk;
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("chapter"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Bookloader.f_book_from_book_xmlchapter(bk, child);
          })
        ),
        Core.f_else(
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              bk,
              Core.t_anylist.vx_new(
                  Core.f_msg_from_error_1(
                    Core.vx_new_string(":invalidtagfound"),
                    Core.f_new(
                      Core.t_anymap,
                      Core.t_anylist.vx_new(
                        Core.vx_new_string(":type"),
                        Base.t_book,
                        Core.vx_new_string(":tag"),
                        child.tag()
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
   * @function book_from_xml
   * Returns a book from a given Xml.
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
    output = Core.f_let(
      Base.t_book,
      Core.t_any_from_func.vx_fn_new(() -> {
        final Core.Type_stringmap propmap = xml.propmap();
        final Base.Type_book booknew = Bookloader.f_book_from_book_stringmap(
          Core.f_empty(
            Base.t_book
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_book,
          xml.children(),
          booknew,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any bk_any, Core.Type_any child_any) -> {
            Base.Type_book bk = Core.f_any_from_any(Base.t_book, bk_any);
            Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
            Core.Type_any output_1 = Bookloader.f_book_from_book_xmlchild(bk, child);
            return output_1;
          })
        );
      })
    );
    return output;
  }

  /**
   * @function book_from_xmllist
   * Returns a book from a given Xml.
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
      Core.t_any_from_reduce.vx_fn_new((Core.Type_any current_any, Core.Type_any child_any) -> {
        Base.Type_book current = Core.f_any_from_any(Base.t_book, current_any);
        Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
        Core.Type_any output_1 = Bookloader.f_book_from_book_xml(current, child);
        return output_1;
      })
    );
    return output;
  }

  /**
   * @function book_from_xmltop
   * Returns a book from a given top level Xml.
   * @param  {xml} xmltop
   * @return {book}
   * (func book<-xmltop)
   */
  public static interface Func_book_from_xmltop extends Core.Func_any_from_any {
    public Base.Type_book vx_book_from_xmltop(final Xml.Type_xml xmltop);
  }

  public static class Class_book_from_xmltop extends Core.Class_base implements Func_book_from_xmltop {

    @Override
    public Func_book_from_xmltop vx_new(Object... vals) {
      Class_book_from_xmltop output = new Class_book_from_xmltop();
      return output;
    }

    @Override
    public Func_book_from_xmltop vx_copy(Object... vals) {
      Class_book_from_xmltop output = new Class_book_from_xmltop();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "book<-xmltop", // name
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
    public Func_book_from_xmltop vx_empty() {return e_book_from_xmltop;}
    @Override
    public Func_book_from_xmltop vx_type() {return t_book_from_xmltop;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Xml.Type_xml inputval = (Xml.Type_xml)value;
      Core.Type_any outputval = Bookloader.f_book_from_xmltop(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Xml.Type_xml xmltop = Core.f_any_from_any(Xml.t_xml, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_book_from_xmltop(xmltop);
      return output;
    }

    @Override
    public Base.Type_book vx_book_from_xmltop(final Xml.Type_xml xmltop) {
      return Bookloader.f_book_from_xmltop(xmltop);
    }

  }

  public static final Func_book_from_xmltop e_book_from_xmltop = new Bookloader.Class_book_from_xmltop();
  public static final Func_book_from_xmltop t_book_from_xmltop = new Bookloader.Class_book_from_xmltop();

  public static Base.Type_book f_book_from_xmltop(final Xml.Type_xml xmltop) {
    Base.Type_book output = Base.e_book;
    output = Bookloader.f_book_from_xmllist(
      xmltop.children()
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
          Core.vx_new_string("name"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("image"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":image"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
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
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_any, Core.Type_string key, Core.Type_any value_any) -> {
        Base.Type_chapter current = Core.f_any_from_any(Base.t_chapter, current_any);
        Core.Type_string value = Core.f_any_from_any(Core.t_string, value_any);
        Core.Type_any output_1 = Bookloader.f_chapter_from_chapter_key_value(current, key, value);
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
    output = Core.f_switch(
      Base.t_chapter,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string("reference"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              chapter,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":reference"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("summary"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              chapter,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("titles"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              chapter,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
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
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return chapter;
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
                        child.tag()
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
        final Base.Type_sectionmap sectionmap = section.sectionmap();
        final Base.Type_sectionmap chgmap = Core.f_copy(
          sectionmap,
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
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any chapter_any, Core.Type_any child_any) -> {
            Base.Type_chapter chapter = Core.f_any_from_any(Base.t_chapter, chapter_any);
            Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
            Core.Type_any output_1 = Bookloader.f_chapter_from_chapter_xmlchild(chapter, child);
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
        final Core.Type_string bookname = Bookloader.f_string_writename_from_book(book);
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
   * @function modifier_from_xml
   * @return {modifier}
   * (func modifier<-xml)
   */
  public static interface Func_modifier_from_xml extends Core.Type_func, Core.Type_replfunc {
    public Base.Type_modifier vx_modifier_from_xml();
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

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      output = Bookloader.f_modifier_from_xml();
      return output;
    }

    @Override
    public Base.Type_modifier vx_modifier_from_xml() {
      return Bookloader.f_modifier_from_xml();
    }

  }

  public static final Func_modifier_from_xml e_modifier_from_xml = new Bookloader.Class_modifier_from_xml();
  public static final Func_modifier_from_xml t_modifier_from_xml = new Bookloader.Class_modifier_from_xml();

  public static Base.Type_modifier f_modifier_from_xml() {
    Base.Type_modifier output = Base.e_modifier;
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
          Core.vx_new_string("name"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("image"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":image"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
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
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_any, Core.Type_string key, Core.Type_any value_any) -> {
        Base.Type_rule current = Core.f_any_from_any(Base.t_rule, current_any);
        Core.Type_string value = Core.f_any_from_any(Core.t_string, value_any);
        Core.Type_any output_1 = Bookloader.f_rule_from_rule_key_value(current, key, value);
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
    output = Core.f_switch(
      Base.t_rule,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string("reference"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              rule,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":reference"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("summary"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              rule,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("titles"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              rule,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return rule;
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
                        child.tag()
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
   * @function rule_from_xml
   * Returns a rule from a given Xml.
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
        final Base.Type_rule rul = Bookloader.f_rule_from_rule_stringmap(
          Core.f_empty(
            Base.t_rule
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_rule,
          xml.children(),
          rul,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any rule_any, Core.Type_any child_any) -> {
            Base.Type_rule rule = Core.f_any_from_any(Base.t_rule, rule_any);
            Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
            Core.Type_any output_1 = Bookloader.f_rule_from_rule_xmlchild(rule, child);
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
          Core.vx_new_string("name"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("image"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":image"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
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
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_any, Core.Type_string key, Core.Type_any value_any) -> {
        Base.Type_scenario current = Core.f_any_from_any(Base.t_scenario, current_any);
        Core.Type_string value = Core.f_any_from_any(Core.t_string, value_any);
        Core.Type_any output_1 = Bookloader.f_scenario_from_scenario_key_value(current, key, value);
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
    output = Core.f_switch(
      Base.t_scenario,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string("reference"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              scenario,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":reference"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("summary"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              scenario,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("titles"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              scenario,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return scenario;
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
                        child.tag()
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
   * @function scenario_from_xml
   * Returns a scenario from a given Xml.
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
        final Base.Type_scenario scen = Bookloader.f_scenario_from_scenario_stringmap(
          Core.f_empty(
            Base.t_scenario
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_scenario,
          xml.children(),
          scen,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any scenario_any, Core.Type_any child_any) -> {
            Base.Type_scenario scenario = Core.f_any_from_any(Base.t_scenario, scenario_any);
            Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
            Core.Type_any output_1 = Bookloader.f_scenario_from_scenario_xmlchild(scenario, child);
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
          Core.vx_new_string("name"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("image"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":image"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return current;
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
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_any, Core.Type_string key, Core.Type_any value_any) -> {
        Base.Type_section current = Core.f_any_from_any(Base.t_section, current_any);
        Core.Type_string value = Core.f_any_from_any(Core.t_string, value_any);
        Core.Type_any output_1 = Bookloader.f_section_from_section_key_value(current, key, value);
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
    output = Core.f_switch(
      Base.t_section,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string("reference"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              section,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":reference"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("summary"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              section,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("titles"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              section,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("rule"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Bookloader.f_section_from_section_xmlrule(section, child);
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("section"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Bookloader.f_section_from_section_xmlsection(section, child);
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("unit"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Bookloader.f_section_from_section_xmlunit(section, child);
          })
        ),
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return section;
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
                        Base.t_chapter,
                        Core.vx_new_string(":tag"),
                        child.tag()
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
        final Base.Type_rulemap rulemap = section.rulemap();
        final Base.Type_rulemap chgmap = Core.f_copy(
          rulemap,
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
        final Base.Type_scenariomap scenariomap = section.scenariomap();
        final Base.Type_scenariomap chgmap = Core.f_copy(
          scenariomap,
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
        final Base.Type_sectionmap sectionmap = section.sectionmap();
        final Base.Type_sectionmap chgmap = Core.f_copy(
          sectionmap,
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
        final Base.Type_unitmap unitmap = section.unitmap();
        final Base.Type_unitmap chgmap = Core.f_copy(
          unitmap,
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
        final Base.Type_section sect = Bookloader.f_section_from_section_stringmap(
          Core.f_empty(
            Base.t_section
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_section,
          xml.children(),
          sect,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any section_any, Core.Type_any child_any) -> {
            Base.Type_section section = Core.f_any_from_any(Base.t_section, section_any);
            Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
            Core.Type_any output_1 = Bookloader.f_section_from_section_xmlchild(section, child);
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
        final Core.Type_string name = Bookloader.f_string_writename_from_book(book);
        final Core.Type_string text = Core.f_string_from_any_indent(
          book,
          Core.vx_new_int(1),
          Core.vx_new_boolean(false)
        );
        return Core.f_new(
          Core.t_string,
          Core.t_anylist.vx_new(
            Core.vx_new_string("(package nx/tactics/books/"),
            name,
            Core.vx_new_string("\n :libs (lib base :path nx/tactics/base))\n\n(func tacticsbook : base/book\n "),
            text,
            Core.vx_new_string(")\n")
          )
        );
      })
    );
    return output;
  }

  /**
   * @function string_writename_from_book
   * Returns the write filename from a book
   * @param  {book} book
   * @return {string}
   * (func string-writename<-book)
   */
  public static interface Func_string_writename_from_book extends Core.Func_any_from_any {
    public Core.Type_string vx_string_writename_from_book(final Base.Type_book book);
  }

  public static class Class_string_writename_from_book extends Core.Class_base implements Func_string_writename_from_book {

    @Override
    public Func_string_writename_from_book vx_new(Object... vals) {
      Class_string_writename_from_book output = new Class_string_writename_from_book();
      return output;
    }

    @Override
    public Func_string_writename_from_book vx_copy(Object... vals) {
      Class_string_writename_from_book output = new Class_string_writename_from_book();
      return output;
    }

    @Override
    public Core.Type_typedef vx_typedef() {return Core.t_func.vx_typedef();}

    @Override
    public Core.Type_funcdef vx_funcdef() {
      return Core.funcdef_new(
        "nx/tactics/books/bookloader", // pkgname
        "string-writename<-book", // name
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
    public Func_string_writename_from_book vx_empty() {return e_string_writename_from_book;}
    @Override
    public Func_string_writename_from_book vx_type() {return t_string_writename_from_book;}

    @Override
    public Core.Func_any_from_any vx_fn_new(Core.Class_any_from_any.IFn fn) {return Core.e_any_from_any;}

    @Override
    public <T extends Core.Type_any, U extends Core.Type_any> T vx_any_from_any(final T generic_any_1, final U value) {
      T output = Core.f_empty(generic_any_1);
      Base.Type_book inputval = (Base.Type_book)value;
      Core.Type_any outputval = Bookloader.f_string_writename_from_book(inputval);
      output = Core.f_any_from_any(generic_any_1, outputval);
      return output;
    }

    public Core.Type_any vx_repl(Core.Type_anylist arglist) {
      Core.Type_any output = Core.e_any;
      Base.Type_book book = Core.f_any_from_any(Base.t_book, arglist.vx_any(Core.vx_new_int(0)));
      output = Bookloader.f_string_writename_from_book(book);
      return output;
    }

    @Override
    public Core.Type_string vx_string_writename_from_book(final Base.Type_book book) {
      return Bookloader.f_string_writename_from_book(book);
    }

  }

  public static final Func_string_writename_from_book e_string_writename_from_book = new Bookloader.Class_string_writename_from_book();
  public static final Func_string_writename_from_book t_string_writename_from_book = new Bookloader.Class_string_writename_from_book();

  public static Core.Type_string f_string_writename_from_book(final Base.Type_book book) {
    Core.Type_string output = Core.e_string;
    output = Core.f_string_from_string_find_replace(
      Type.f_string_lowercase(
        book.name()
      ),
      Core.vx_new_string(" "),
      Core.vx_new_string("_")
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
        Core.f_case_1(
          Core.vx_new_string("name"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("image"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":image"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("body"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":body"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("height"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":height"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("length"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":length"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("mass"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":mass"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("mind"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":mind"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("width"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":width"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("will"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":mind"),
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
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_any, Core.Type_string key, Core.Type_any value_any) -> {
        Base.Type_unit current = Core.f_any_from_any(Base.t_unit, current_any);
        Core.Type_string value = Core.f_any_from_any(Core.t_string, value_any);
        Core.Type_any output_1 = Bookloader.f_unit_from_unit_key_value(current, key, value);
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
    output = Core.f_switch(
      Base.t_unit,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return unit;
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("reference"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              unit,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":reference"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("summary"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              unit,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":summary"),
                  Xml.f_string_first_from_xml(child)
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("titles"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              unit,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":titles"),
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
                        child.tag()
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
        final Base.Type_unitpowermap unitpowermap = unit.unitpowermap();
        final Base.Type_unitpowermap chgmap = Core.f_copy(
          unitpowermap,
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
        final Base.Type_unitskillmap unitskillmap = unit.unitskillmap();
        final Base.Type_unitskillmap chgmap = Core.f_copy(
          unitskillmap,
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
        final Base.Type_unitweaknessmap unitweaknessmap = unit.unitweaknessmap();
        final Base.Type_unitweaknessmap chgmap = Core.f_copy(
          unitweaknessmap,
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
   * Returns a unit from a given Xml.
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
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unit_any, Core.Type_any child_any) -> {
            Base.Type_unit unit = Core.f_any_from_any(Base.t_unit, unit_any);
            Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
            Core.Type_any output_1 = Bookloader.f_unit_from_unit_xmlchild(unit, child);
            return output_1;
          })
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
        Core.f_case_1(
          Core.vx_new_string("name"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":name"),
                  value
              )
            );
          })
        ),
        Core.f_case_1(
          Core.vx_new_string("image"),
          Core.t_any_from_func.vx_fn_new(() -> {
            return Core.f_copy(
              current,
              Core.t_anylist.vx_new(
                  Core.vx_new_string(":image"),
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
      Core.t_any_from_any_key_value.vx_fn_new((Core.Type_any current_any, Core.Type_string key, Core.Type_any value_any) -> {
        Base.Type_unitskill current = Core.f_any_from_any(Base.t_unitskill, current_any);
        Core.Type_string value = Core.f_any_from_any(Core.t_string, value_any);
        Core.Type_any output_1 = Bookloader.f_unitskill_from_unitskill_key_value(current, key, value);
        return output_1;
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
    output = Core.f_switch(
      Base.t_unitskill,
      child.tag(),
      Core.t_thenelselist.vx_new(
        Core.f_case_1(
          Core.vx_new_string(""),
          Core.t_any_from_func.vx_fn_new(() -> {
            return unitskill;
          })
        ),
        Core.f_case(
          Core.f_new(
            Core.t_stringlist,
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
                  child.tag(),
                  Xml.f_string_first_from_xml(child)
              )
            );
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
                        child.tag()
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
        final Base.Type_unitskill untskl = Bookloader.f_unitskill_from_unitskill_stringmap(
          Core.f_empty(
            Base.t_unitskill
          ),
          propmap
        );
        return Core.f_any_from_list_start_reduce(
          Base.t_unitskill,
          xml.children(),
          untskl,
          Core.t_any_from_reduce.vx_fn_new((Core.Type_any unitskill_any, Core.Type_any child_any) -> {
            Base.Type_unitskill unitskill = Core.f_any_from_any(Base.t_unitskill, unitskill_any);
            Xml.Type_xml child = Core.f_any_from_any(Xml.t_xml, child_any);
            Core.Type_any output_1 = Bookloader.f_unitskill_from_unitskill_xmlchild(unitskill, child);
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
    mapfunc.put("book-read<-bookname", Bookloader.t_book_read_from_bookname);
    mapfunc.put("book<-book-key-value", Bookloader.t_book_from_book_key_value);
    mapfunc.put("book<-book-stringmap", Bookloader.t_book_from_book_stringmap);
    mapfunc.put("book<-book-xml", Bookloader.t_book_from_book_xml);
    mapfunc.put("book<-book-xmlchapter", Bookloader.t_book_from_book_xmlchapter);
    mapfunc.put("book<-book-xmlchild", Bookloader.t_book_from_book_xmlchild);
    mapfunc.put("book<-xml", Bookloader.t_book_from_xml);
    mapfunc.put("book<-xmllist", Bookloader.t_book_from_xmllist);
    mapfunc.put("book<-xmltop", Bookloader.t_book_from_xmltop);
    mapfunc.put("boolean-write<-book", Bookloader.t_boolean_write_from_book);
    mapfunc.put("boolean-write<-booknames", Bookloader.t_boolean_write_from_booknames);
    mapfunc.put("chapter<-chapter-key-value", Bookloader.t_chapter_from_chapter_key_value);
    mapfunc.put("chapter<-chapter-stringmap", Bookloader.t_chapter_from_chapter_stringmap);
    mapfunc.put("chapter<-chapter-xmlchild", Bookloader.t_chapter_from_chapter_xmlchild);
    mapfunc.put("chapter<-chapter-xmlsection", Bookloader.t_chapter_from_chapter_xmlsection);
    mapfunc.put("chapter<-xml", Bookloader.t_chapter_from_xml);
    mapfunc.put("file-read<-bookname", Bookloader.t_file_read_from_bookname);
    mapfunc.put("file-write<-book", Bookloader.t_file_write_from_book);
    mapfunc.put("modifier<-xml", Bookloader.t_modifier_from_xml);
    mapfunc.put("rule<-rule-key-value", Bookloader.t_rule_from_rule_key_value);
    mapfunc.put("rule<-rule-stringmap", Bookloader.t_rule_from_rule_stringmap);
    mapfunc.put("rule<-rule-xmlchild", Bookloader.t_rule_from_rule_xmlchild);
    mapfunc.put("rule<-xml", Bookloader.t_rule_from_xml);
    mapfunc.put("scenario<-scenario-key-value", Bookloader.t_scenario_from_scenario_key_value);
    mapfunc.put("scenario<-scenario-stringmap", Bookloader.t_scenario_from_scenario_stringmap);
    mapfunc.put("scenario<-scenario-xmlchild", Bookloader.t_scenario_from_scenario_xmlchild);
    mapfunc.put("scenario<-xml", Bookloader.t_scenario_from_xml);
    mapfunc.put("section<-section-key-value", Bookloader.t_section_from_section_key_value);
    mapfunc.put("section<-section-stringmap", Bookloader.t_section_from_section_stringmap);
    mapfunc.put("section<-section-xmlchild", Bookloader.t_section_from_section_xmlchild);
    mapfunc.put("section<-section-xmlrule", Bookloader.t_section_from_section_xmlrule);
    mapfunc.put("section<-section-xmlscenario", Bookloader.t_section_from_section_xmlscenario);
    mapfunc.put("section<-section-xmlsection", Bookloader.t_section_from_section_xmlsection);
    mapfunc.put("section<-section-xmlunit", Bookloader.t_section_from_section_xmlunit);
    mapfunc.put("section<-xml", Bookloader.t_section_from_xml);
    mapfunc.put("string-read<-bookname", Bookloader.t_string_read_from_bookname);
    mapfunc.put("string-vxlisp<-book", Bookloader.t_string_vxlisp_from_book);
    mapfunc.put("string-writename<-book", Bookloader.t_string_writename_from_book);
    mapfunc.put("unit<-unit-key-value", Bookloader.t_unit_from_unit_key_value);
    mapfunc.put("unit<-unit-stringmap", Bookloader.t_unit_from_unit_stringmap);
    mapfunc.put("unit<-unit-xmlchild", Bookloader.t_unit_from_unit_xmlchild);
    mapfunc.put("unit<-unit-xmlpower", Bookloader.t_unit_from_unit_xmlpower);
    mapfunc.put("unit<-unit-xmlskill", Bookloader.t_unit_from_unit_xmlskill);
    mapfunc.put("unit<-unit-xmlweakness", Bookloader.t_unit_from_unit_xmlweakness);
    mapfunc.put("unit<-xml", Bookloader.t_unit_from_xml);
    mapfunc.put("unitpower<-xml", Bookloader.t_unitpower_from_xml);
    mapfunc.put("unitskill<-unitskill-key-value", Bookloader.t_unitskill_from_unitskill_key_value);
    mapfunc.put("unitskill<-unitskill-stringmap", Bookloader.t_unitskill_from_unitskill_stringmap);
    mapfunc.put("unitskill<-unitskill-xmlchild", Bookloader.t_unitskill_from_unitskill_xmlchild);
    mapfunc.put("unitskill<-xml", Bookloader.t_unitskill_from_xml);
    mapfunc.put("unitweakness<-xml", Bookloader.t_unitweakness_from_xml);
    mapfunc.put("weakness<-xml", Bookloader.t_weakness_from_xml);
    mapfunc.put("xml-read<-bookname", Bookloader.t_xml_read_from_bookname);
    Core.vx_global_package_set("nx/tactics/books/bookloader", maptype, mapconst, mapfunc);
  }

}
