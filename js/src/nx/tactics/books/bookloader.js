'strict mode'

import vx_core from "../../../vx/core.js"
import nx_tactics_base from "../../../nx/tactics/base.js"
import vx_data_file from "../../../vx/data/file.js"
import vx_type from "../../../vx/type.js"
import vx_data_xml from "../../../vx/data/xml.js"


export default class nx_tactics_books_bookloader {

  /**
   * @function ability_from_ability_key_value
   * Returns a modified ability from a key value.
   * @param  {ability} current
   * @param  {string} key
   * @param  {string} value
   * @return {ability}
   */
  static t_ability_from_ability_key_value = {
    vx_type: vx_core.t_type
  }
  static e_ability_from_ability_key_value = {
    vx_type: nx_tactics_books_bookloader.t_ability_from_ability_key_value
  }

  // (func ability<-ability-key-value)
  static f_ability_from_ability_key_value(current, key, value) {
    let output = nx_tactics_base.e_ability
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_ability, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_ability,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function ability_from_ability_stringmap
   * Returns a new ability from a propmap.
   * @param  {ability} ability
   * @param  {stringmap} propmap
   * @return {ability}
   */
  static t_ability_from_ability_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_ability_from_ability_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_ability_from_ability_stringmap
  }

  // (func ability<-ability-stringmap)
  static f_ability_from_ability_stringmap(ability, propmap) {
    let output = nx_tactics_base.e_ability
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      ability,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_ability_from_ability_key_value)
    )
    return output
  }

  /**
   * @function ability_from_ability_xmlchild
   * Returns a modified ability based on a given child xml.
   * @param  {ability} ability
   * @param  {xml} child
   * @return {ability}
   */
  static t_ability_from_ability_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_ability_from_ability_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_ability_from_ability_xmlchild
  }

  // (func ability<-ability-xmlchild)
  static f_ability_from_ability_xmlchild(ability, child) {
    let output = nx_tactics_base.e_ability
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_ability, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_ability, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return ability})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              ability,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              ability,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_ability,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function ability_from_xml
   * Returns a ability from a given xml.
   * @param  {xml} xml
   * @return {ability}
   */
  static t_ability_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_ability_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_ability_from_xml
  }

  // (func ability<-xml)
  static f_ability_from_xml(xml) {
    let output = nx_tactics_base.e_ability
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_ability, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const ability = nx_tactics_books_bookloader.f_ability_from_ability_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_ability
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_ability, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          ability,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_ability_from_ability_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function book_read_from_bookname
   * Returns a book by loading the given Xml filename.
   * @param  {string} bookname
   * @return {book}
   */
  static t_book_read_from_bookname = {
    vx_type: vx_core.t_type
  }
  static e_book_read_from_bookname = {
    vx_type: nx_tactics_books_bookloader.t_book_read_from_bookname
  }

  // (func book-read<-bookname)
  static f_book_read_from_bookname(context, bookname) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_book},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const xml = nx_tactics_books_bookloader.f_xml_read_from_bookname(context, bookname)
        return nx_tactics_books_bookloader.f_book_from_xml(xml)
      })
    )
    return output
  }

  /**
   * @function book_from_book_key_value
   * Returns a modified book from a key value.
   * @param  {book} current
   * @param  {string} key
   * @param  {string} value
   * @return {book}
   */
  static t_book_from_book_key_value = {
    vx_type: vx_core.t_type
  }
  static e_book_from_book_key_value = {
    vx_type: nx_tactics_books_bookloader.t_book_from_book_key_value
  }

  // (func book<-book-key-value)
  static f_book_from_book_key_value(current, key, value) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_book,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function book_from_book_stringmap
   * Returns a new book from a propmap.
   * @param  {book} book
   * @param  {stringmap} propmap
   * @return {book}
   */
  static t_book_from_book_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_book_from_book_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_book_from_book_stringmap
  }

  // (func book<-book-stringmap)
  static f_book_from_book_stringmap(book, propmap) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      book,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_book_from_book_key_value)
    )
    return output
  }

  /**
   * @function book_from_book_xml
   * Returns an altered book based on xml child.
   * @param  {book} current
   * @param  {xml} child
   * @return {book}
   */
  static t_book_from_book_xml = {
    vx_type: vx_core.t_type
  }
  static e_book_from_book_xml = {
    vx_type: nx_tactics_books_bookloader.t_book_from_book_xml
  }

  // (func book<-book-xml)
  static f_book_from_book_xml(current, child) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
          vx_core.f_case_1("!--", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
          vx_core.f_case_1("?xml", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
          vx_core.f_case_1(
            "doc",
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_if_2(
              {"any-1": nx_tactics_base.t_book},
              vx_core.f_then(
                vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_is_empty_1(current)}),
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_book_from_xmldoc(child)})
              ),
              vx_core.f_else(
                vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
                  current,
                  vx_core.f_msg_from_error_1(
                    ":duplicatetagfound",
                    vx_core.f_new(
                      vx_core.t_anymap,
                      ":type",
                      nx_tactics_base.t_book,
                      ":tag",
                      tag
                    )
                  )
                )})
              )
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              current,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_book,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function book_from_book_xmlchapter
   * Returns an altered book based on xmlchapter.
   * @param  {book} book
   * @param  {xml} xml
   * @return {book}
   */
  static t_book_from_book_xmlchapter = {
    vx_type: vx_core.t_type
  }
  static e_book_from_book_xmlchapter = {
    vx_type: nx_tactics_books_bookloader.t_book_from_book_xmlchapter
  }

  // (func book<-book-xmlchapter)
  static f_book_from_book_xmlchapter(book, xml) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_book},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const chapter = nx_tactics_books_bookloader.f_chapter_from_xml(xml)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_chapter}, chapter, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_book}, book, ":chaptermap")
        const chgmap = vx_core.f_copy(origmap, name, chapter)
        return vx_core.f_copy(book, ":chaptermap", chgmap)
      })
    )
    return output
  }

  /**
   * @function book_from_book_xmlchild
   * Returns a modified book based on a given child xml.
   * @param  {book} book
   * @param  {xml} child
   * @return {book}
   */
  static t_book_from_book_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_book_from_book_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_book_from_book_xmlchild
  }

  // (func book<-book-xmlchild)
  static f_book_from_book_xmlchild(book, child) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return book})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              book,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "chapter",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_book_from_book_xmlchapter(book, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              book,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_book,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function book_from_xml
   * Returns a book from a given top level xml.
   * @param  {xml} xml
   * @return {book}
   */
  static t_book_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_book_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_book_from_xml
  }

  // (func book<-xml)
  static f_book_from_xml(xml) {
    let output = nx_tactics_base.e_book
    output = nx_tactics_books_bookloader.f_book_from_xmllist(
      vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children")
    )
    return output
  }

  /**
   * @function book_from_xmldoc
   * Returns a book from a given xml.
   * @param  {xml} xml
   * @return {book}
   */
  static t_book_from_xmldoc = {
    vx_type: vx_core.t_type
  }
  static e_book_from_xmldoc = {
    vx_type: nx_tactics_books_bookloader.t_book_from_xmldoc
  }

  // (func book<-xmldoc)
  static f_book_from_xmldoc(xml) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_book, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const children = vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children")
        const book = nx_tactics_books_bookloader.f_book_from_book_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_book
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_book, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          children,
          book,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_book_from_book_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function book_from_xmllist
   * Returns a book from a given xml.
   * @param  {xmllist} xmllist
   * @return {book}
   */
  static t_book_from_xmllist = {
    vx_type: vx_core.t_type
  }
  static e_book_from_xmllist = {
    vx_type: nx_tactics_books_bookloader.t_book_from_xmllist
  }

  // (func book<-xmllist)
  static f_book_from_xmllist(xmllist) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_any_from_list_start_reduce(
      {"any-1": nx_tactics_base.t_book, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      xmllist,
      vx_core.f_empty(
        nx_tactics_base.t_book
      ),
      vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_book_from_book_xml)
    )
    return output
  }

  /**
   * @function boolean_write_from_book
   * Returns boolean after writing book as a file.
   * @param  {book} book
   * @return {boolean}
   */
  static t_boolean_write_from_book = {
    vx_type: vx_core.t_type
  }
  static e_boolean_write_from_book = {
    vx_type: nx_tactics_books_bookloader.t_boolean_write_from_book
  }

  // (func boolean-write<-book)
  static f_boolean_write_from_book(context, book) {
    let output = vx_core.e_boolean
    output = vx_core.f_let(
      {"any-1": vx_core.t_boolean},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const text = nx_tactics_books_bookloader.f_string_vxlisp_from_book(book)
        const file = nx_tactics_books_bookloader.f_file_write_from_book(book)
        return vx_data_file.f_boolean_write_from_file_string(context, file, text)
      })
    )
    return output
  }

  /**
   * @function boolean_write_from_booknames
   * Returns boolean after writing book as a file.
   * @param  {stringlist} booknames
   * @return {boolean}
   */
  static t_boolean_write_from_booknames = {
    vx_type: vx_core.t_type
  }
  static e_boolean_write_from_booknames = {
    vx_type: nx_tactics_books_bookloader.t_boolean_write_from_booknames
  }

  // (func boolean-write<-booknames)
  static f_boolean_write_from_booknames(context, booknames) {
    let output = vx_core.e_boolean
    output = vx_core.f_let(
      {"any-1": vx_core.t_boolean},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const bools = vx_core.f_list_from_list_1(
          {"any-1": vx_core.t_boolean, "any-2": vx_core.t_string, "list-1": vx_core.t_booleanlist, "list-2": vx_core.t_stringlist},
          booknames,
          vx_core.f_new(vx_core.t_any_from_any, (bookname) => 
            vx_core.f_let(
              {"any-1": vx_core.t_boolean},
              [],
              vx_core.f_new(vx_core.t_any_from_func, () => {
                const book = nx_tactics_books_bookloader.f_book_read_from_bookname(context, bookname)
                return nx_tactics_books_bookloader.f_boolean_write_from_book(context, book)
              })
            ))
        )
        return vx_core.f_and_1(bools)
      })
    )
    return output
  }

  /**
   * @function chapter_from_chapter_key_value
   * Returns a modified chapter from a key value.
   * @param  {chapter} current
   * @param  {string} key
   * @param  {string} value
   * @return {chapter}
   */
  static t_chapter_from_chapter_key_value = {
    vx_type: vx_core.t_type
  }
  static e_chapter_from_chapter_key_value = {
    vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_key_value
  }

  // (func chapter<-chapter-key-value)
  static f_chapter_from_chapter_key_value(current, key, value) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_chapter, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_chapter,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function chapter_from_chapter_stringmap
   * Returns a new book from a propmap.
   * @param  {chapter} chapter
   * @param  {stringmap} propmap
   * @return {chapter}
   */
  static t_chapter_from_chapter_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_chapter_from_chapter_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_stringmap
  }

  // (func chapter<-chapter-stringmap)
  static f_chapter_from_chapter_stringmap(chapter, propmap) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      chapter,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_chapter_from_chapter_key_value)
    )
    return output
  }

  /**
   * @function chapter_from_chapter_xmlchild
   * Returns a modified chapter based on a given child Xml.
   * @param  {chapter} chapter
   * @param  {xml} child
   * @return {chapter}
   */
  static t_chapter_from_chapter_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_chapter_from_chapter_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_xmlchild
  }

  // (func chapter<-chapter-xmlchild)
  static f_chapter_from_chapter_xmlchild(chapter, child) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_chapter, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_chapter, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return chapter})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              chapter,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "section",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_chapter_from_chapter_xmlsection(chapter, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              chapter,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_chapter,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function chapter_from_chapter_xmlsection
   * Return a chapter with new section added to sectionmap
   * @param  {chapter} chapter
   * @param  {xml} xmlsection
   * @return {chapter}
   */
  static t_chapter_from_chapter_xmlsection = {
    vx_type: vx_core.t_type
  }
  static e_chapter_from_chapter_xmlsection = {
    vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_xmlsection
  }

  // (func chapter<-chapter-xmlsection)
  static f_chapter_from_chapter_xmlsection(chapter, xmlsection) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_chapter},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const section = nx_tactics_books_bookloader.f_section_from_xml(xmlsection)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_chapter}, chapter, ":sectionmap")
        const chgmap = vx_core.f_copy(origmap, name, section)
        return vx_core.f_copy(chapter, ":sectionmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function chapter_from_xml
   * Returns a chapter from a given Xml.
   * @param  {xml} xml
   * @return {chapter}
   */
  static t_chapter_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_chapter_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_chapter_from_xml
  }

  // (func chapter<-xml)
  static f_chapter_from_xml(xml) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_chapter, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const chap = nx_tactics_books_bookloader.f_chapter_from_chapter_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_chapter
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_chapter, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          chap,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_chapter_from_chapter_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function damage_from_damage_key_value
   * Returns a modified damage from a key value.
   * @param  {damage} current
   * @param  {string} key
   * @param  {string} value
   * @return {damage}
   */
  static t_damage_from_damage_key_value = {
    vx_type: vx_core.t_type
  }
  static e_damage_from_damage_key_value = {
    vx_type: nx_tactics_books_bookloader.t_damage_from_damage_key_value
  }

  // (func damage<-damage-key-value)
  static f_damage_from_damage_key_value(current, key, value) {
    let output = nx_tactics_base.e_damage
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_damage, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "classification"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_damage,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function damage_from_damage_stringmap
   * Returns a damage from a propmap.
   * @param  {damage} damage
   * @param  {stringmap} propmap
   * @return {damage}
   */
  static t_damage_from_damage_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_damage_from_damage_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_damage_from_damage_stringmap
  }

  // (func damage<-damage-stringmap)
  static f_damage_from_damage_stringmap(damage, propmap) {
    let output = nx_tactics_base.e_damage
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      damage,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_damage_from_damage_key_value)
    )
    return output
  }

  /**
   * @function damage_from_damage_xmlchild
   * Returns a modified damage based on a given child Xml.
   * @param  {damage} damage
   * @param  {xml} child
   * @return {damage}
   */
  static t_damage_from_damage_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_damage_from_damage_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_damage_from_damage_xmlchild
  }

  // (func damage<-damage-xmlchild)
  static f_damage_from_damage_xmlchild(damage, child) {
    let output = nx_tactics_base.e_damage
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_damage, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_damage, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return damage})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              damage,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              damage,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_damage,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function damage_from_xml
   * Returns a damage from a given xml.
   * @param  {xml} xml
   * @return {damage}
   */
  static t_damage_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_damage_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_damage_from_xml
  }

  // (func damage<-xml)
  static f_damage_from_xml(xml) {
    let output = nx_tactics_base.e_damage
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_damage, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const damage = nx_tactics_books_bookloader.f_damage_from_damage_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_damage
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_damage, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          damage,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_damage_from_damage_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function file_read_from_bookname
   * Returns a file from a bookname.
   * @param  {string} bookname
   * @return {file}
   */
  static t_file_read_from_bookname = {
    vx_type: vx_core.t_type
  }
  static e_file_read_from_bookname = {
    vx_type: nx_tactics_books_bookloader.t_file_read_from_bookname
  }

  // (func file-read<-bookname)
  static f_file_read_from_bookname(bookname) {
    let output = vx_data_file.e_file
    output = vx_core.f_new(
      vx_data_file.t_file,
      ":path",
      "resources/books",
      ":name",
      vx_core.f_new(
        vx_core.t_string,
        bookname,
        ".xml"
      )
    )
    return output
  }

  /**
   * @function file_write_from_book
   * Returns a file with string from book
   * @param  {book} book
   * @return {file}
   */
  static t_file_write_from_book = {
    vx_type: vx_core.t_type
  }
  static e_file_write_from_book = {
    vx_type: nx_tactics_books_bookloader.t_file_write_from_book
  }

  // (func file-write<-book)
  static f_file_write_from_book(book) {
    let output = vx_data_file.e_file
    output = vx_core.f_let(
      {"any-1": vx_data_file.t_file},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":name")
        const bookname = nx_tactics_books_bookloader.f_string_writename_from_string(name)
        return vx_core.f_new(
          vx_data_file.t_file,
          ":path",
          "resources/books",
          ":name",
          vx_core.f_new(
            vx_core.t_string,
            bookname,
            ".vxlisp"
          )
        )
      })
    )
    return output
  }

  /**
   * @function item_from_item_key_value
   * Returns a modified item from a key value.
   * @param  {item} current
   * @param  {string} key
   * @param  {string} value
   * @return {item}
   */
  static t_item_from_item_key_value = {
    vx_type: vx_core.t_type
  }
  static e_item_from_item_key_value = {
    vx_type: nx_tactics_books_bookloader.t_item_from_item_key_value
  }

  // (func item<-item-key-value)
  static f_item_from_item_key_value(current, key, value) {
    let output = nx_tactics_base.e_item
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_item, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "classification",
          "crew",
          "energy",
          "explosive",
          "height",
          "length",
          "mass",
          "modifiers",
          "muzzlevelocity",
          "range",
          "rof",
          "rounds",
          "speedair",
          "speedland",
          "speedspace",
          "speedwater",
          "width"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_item,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function item_from_item_stringmap
   * Returns a new item from a propmap.
   * @param  {item} item
   * @param  {stringmap} propmap
   * @return {item}
   */
  static t_item_from_item_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_item_from_item_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_item_from_item_stringmap
  }

  // (func item<-item-stringmap)
  static f_item_from_item_stringmap(item, propmap) {
    let output = nx_tactics_base.e_item
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      item,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_item_from_item_key_value)
    )
    return output
  }

  /**
   * @function item_from_item_xmlchild
   * Returns a modified item based on a given child xml.
   * @param  {item} item
   * @param  {xml} child
   * @return {item}
   */
  static t_item_from_item_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_item_from_item_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_item_from_item_xmlchild
  }

  // (func item<-item-xmlchild)
  static f_item_from_item_xmlchild(item, child) {
    let output = nx_tactics_base.e_item
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_item, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_item, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return item})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              item,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              item,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_item,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function item_from_xml
   * Returns a item from a given xml.
   * @param  {xml} xml
   * @return {item}
   */
  static t_item_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_item_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_item_from_xml
  }

  // (func item<-xml)
  static f_item_from_xml(xml) {
    let output = nx_tactics_base.e_item
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_item, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const item = nx_tactics_books_bookloader.f_item_from_item_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_item
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_item, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          item,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_item_from_item_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function location_from_location_key_value
   * Returns a modified location from a key value.
   * @param  {location} current
   * @param  {string} key
   * @param  {string} value
   * @return {location}
   */
  static t_location_from_location_key_value = {
    vx_type: vx_core.t_type
  }
  static e_location_from_location_key_value = {
    vx_type: nx_tactics_books_bookloader.t_location_from_location_key_value
  }

  // (func location<-location-key-value)
  static f_location_from_location_key_value(current, key, value) {
    let output = nx_tactics_base.e_location
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_location, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_location,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function location_from_location_stringmap
   * Returns a location from a propmap.
   * @param  {location} location
   * @param  {stringmap} propmap
   * @return {location}
   */
  static t_location_from_location_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_location_from_location_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_location_from_location_stringmap
  }

  // (func location<-location-stringmap)
  static f_location_from_location_stringmap(location, propmap) {
    let output = nx_tactics_base.e_location
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      location,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_location_from_location_key_value)
    )
    return output
  }

  /**
   * @function location_from_location_xmlchild
   * Returns a modified location based on a given child Xml.
   * @param  {location} location
   * @param  {xml} child
   * @return {location}
   */
  static t_location_from_location_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_location_from_location_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_location_from_location_xmlchild
  }

  // (func location<-location-xmlchild)
  static f_location_from_location_xmlchild(location, child) {
    let output = nx_tactics_base.e_location
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_location, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_location, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return location})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              location,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              location,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_location,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function location_from_xml
   * Returns a location from a given xml.
   * @param  {xml} xml
   * @return {location}
   */
  static t_location_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_location_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_location_from_xml
  }

  // (func location<-xml)
  static f_location_from_xml(xml) {
    let output = nx_tactics_base.e_location
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_location, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const location = nx_tactics_books_bookloader.f_location_from_location_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_location
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_location, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          location,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_location_from_location_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function modifier_from_modifier_key_value
   * Returns a modified modifier from a key value.
   * @param  {modifier} current
   * @param  {string} key
   * @param  {string} value
   * @return {modifier}
   */
  static t_modifier_from_modifier_key_value = {
    vx_type: vx_core.t_type
  }
  static e_modifier_from_modifier_key_value = {
    vx_type: nx_tactics_books_bookloader.t_modifier_from_modifier_key_value
  }

  // (func modifier<-modifier-key-value)
  static f_modifier_from_modifier_key_value(current, key, value) {
    let output = nx_tactics_base.e_modifier
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_modifier, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_modifier,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function modifier_from_modifier_stringmap
   * Returns a modifier from a propmap.
   * @param  {modifier} modifier
   * @param  {stringmap} propmap
   * @return {modifier}
   */
  static t_modifier_from_modifier_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_modifier_from_modifier_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_modifier_from_modifier_stringmap
  }

  // (func modifier<-modifier-stringmap)
  static f_modifier_from_modifier_stringmap(modifier, propmap) {
    let output = nx_tactics_base.e_modifier
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      modifier,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_modifier_from_modifier_key_value)
    )
    return output
  }

  /**
   * @function modifier_from_modifier_xmlchild
   * Returns a modified modifier based on a given child xml.
   * @param  {modifier} modifier
   * @param  {xml} child
   * @return {modifier}
   */
  static t_modifier_from_modifier_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_modifier_from_modifier_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_modifier_from_modifier_xmlchild
  }

  // (func modifier<-modifier-xmlchild)
  static f_modifier_from_modifier_xmlchild(modifier, child) {
    let output = nx_tactics_base.e_modifier
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_modifier, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_modifier, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return modifier})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              modifier,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              modifier,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_modifier,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function modifier_from_xml
   * Returns a modifier from a given xml.
   * @param  {xml} xml
   * @return {modifier}
   */
  static t_modifier_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_modifier_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_modifier_from_xml
  }

  // (func modifier<-xml)
  static f_modifier_from_xml(xml) {
    let output = nx_tactics_base.e_modifier
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_modifier, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const modifier = nx_tactics_books_bookloader.f_modifier_from_modifier_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_modifier
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_modifier, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          modifier,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_modifier_from_modifier_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function power_from_power_key_value
   * Returns a modified power from a key value.
   * @param  {power} current
   * @param  {string} key
   * @param  {string} value
   * @return {power}
   */
  static t_power_from_power_key_value = {
    vx_type: vx_core.t_type
  }
  static e_power_from_power_key_value = {
    vx_type: nx_tactics_books_bookloader.t_power_from_power_key_value
  }

  // (func power<-power-key-value)
  static f_power_from_power_key_value(current, key, value) {
    let output = nx_tactics_base.e_power
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_power, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "stat"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_power,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function power_from_power_stringmap
   * Returns a new power from a propmap.
   * @param  {power} power
   * @param  {stringmap} propmap
   * @return {power}
   */
  static t_power_from_power_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_power_from_power_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_power_from_power_stringmap
  }

  // (func power<-power-stringmap)
  static f_power_from_power_stringmap(power, propmap) {
    let output = nx_tactics_base.e_power
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      power,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_power_from_power_key_value)
    )
    return output
  }

  /**
   * @function power_from_power_xmlability
   * Return a power with new ability added to abilitymap
   * @param  {power} power
   * @param  {xml} xmlability
   * @return {power}
   */
  static t_power_from_power_xmlability = {
    vx_type: vx_core.t_type
  }
  static e_power_from_power_xmlability = {
    vx_type: nx_tactics_books_bookloader.t_power_from_power_xmlability
  }

  // (func power<-power-xmlability)
  static f_power_from_power_xmlability(power, xmlability) {
    let output = nx_tactics_base.e_power
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_power},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const ability = nx_tactics_books_bookloader.f_ability_from_xml(xmlability)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_ability}, ability, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_power}, power, ":abilitymap")
        const chgmap = vx_core.f_copy(origmap, name, ability)
        return vx_core.f_copy(power, ":abilitymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function power_from_power_xmlchild
   * Returns a modified power based on a given child xml.
   * @param  {power} power
   * @param  {xml} child
   * @return {power}
   */
  static t_power_from_power_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_power_from_power_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_power_from_power_xmlchild
  }

  // (func power<-power-xmlchild)
  static f_power_from_power_xmlchild(power, child) {
    let output = nx_tactics_base.e_power
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_power, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_power, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return power})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              power,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "ability",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_power_from_power_xmlability(power, child)})
          ),
          vx_core.f_case_1(
            "specialty",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_power_from_power_xmlspecialty(power, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              power,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_power,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function power_from_power_xmlspecialty
   * Return a power with new specialty added to specialtymap
   * @param  {power} power
   * @param  {xml} xmlspecialty
   * @return {power}
   */
  static t_power_from_power_xmlspecialty = {
    vx_type: vx_core.t_type
  }
  static e_power_from_power_xmlspecialty = {
    vx_type: nx_tactics_books_bookloader.t_power_from_power_xmlspecialty
  }

  // (func power<-power-xmlspecialty)
  static f_power_from_power_xmlspecialty(power, xmlspecialty) {
    let output = nx_tactics_base.e_power
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_power},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const specialty = nx_tactics_books_bookloader.f_specialty_from_xml(xmlspecialty)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_specialty}, specialty, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_power}, power, ":specialtymap")
        const chgmap = vx_core.f_copy(origmap, name, specialty)
        return vx_core.f_copy(power, ":specialtymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function power_from_xml
   * Returns a power from a given Xml.
   * @param  {xml} xml
   * @return {power}
   */
  static t_power_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_power_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_power_from_xml
  }

  // (func power<-xml)
  static f_power_from_xml(xml) {
    let output = nx_tactics_base.e_power
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_power, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const children = vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children")
        const power = nx_tactics_books_bookloader.f_power_from_power_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_power
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_power, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          children,
          power,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_power_from_power_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function rule_from_rule_key_value
   * Returns a modified rule from a key value.
   * @param  {rule} current
   * @param  {string} key
   * @param  {string} value
   * @return {rule}
   */
  static t_rule_from_rule_key_value = {
    vx_type: vx_core.t_type
  }
  static e_rule_from_rule_key_value = {
    vx_type: nx_tactics_books_bookloader.t_rule_from_rule_key_value
  }

  // (func rule<-rule-key-value)
  static f_rule_from_rule_key_value(current, key, value) {
    let output = nx_tactics_base.e_rule
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_rule, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "classification"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_rule,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function rule_from_rule_stringmap
   * Returns a rule from a propmap.
   * @param  {rule} rule
   * @param  {stringmap} propmap
   * @return {rule}
   */
  static t_rule_from_rule_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_rule_from_rule_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_rule_from_rule_stringmap
  }

  // (func rule<-rule-stringmap)
  static f_rule_from_rule_stringmap(rule, propmap) {
    let output = nx_tactics_base.e_rule
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      rule,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_rule_from_rule_key_value)
    )
    return output
  }

  /**
   * @function rule_from_rule_xmlchild
   * Returns a modified rule based on a given child Xml.
   * @param  {rule} rule
   * @param  {xml} child
   * @return {rule}
   */
  static t_rule_from_rule_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_rule_from_rule_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_rule_from_rule_xmlchild
  }

  // (func rule<-rule-xmlchild)
  static f_rule_from_rule_xmlchild(rule, child) {
    let output = nx_tactics_base.e_rule
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_rule, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_rule, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return rule})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles",
              "classification"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              rule,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              rule,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_rule,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function rule_from_xml
   * Returns a rule from a given xml.
   * @param  {xml} xml
   * @return {rule}
   */
  static t_rule_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_rule_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_rule_from_xml
  }

  // (func rule<-xml)
  static f_rule_from_xml(xml) {
    let output = nx_tactics_base.e_rule
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_rule, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const rule = nx_tactics_books_bookloader.f_rule_from_rule_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_rule
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_rule, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          rule,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_rule_from_rule_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function scenario_from_scenario_key_value
   * Returns a modified scenario from a key value.
   * @param  {scenario} current
   * @param  {string} key
   * @param  {string} value
   * @return {scenario}
   */
  static t_scenario_from_scenario_key_value = {
    vx_type: vx_core.t_type
  }
  static e_scenario_from_scenario_key_value = {
    vx_type: nx_tactics_books_bookloader.t_scenario_from_scenario_key_value
  }

  // (func scenario<-scenario-key-value)
  static f_scenario_from_scenario_key_value(current, key, value) {
    let output = nx_tactics_base.e_scenario
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_scenario, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_scenario,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function scenario_from_scenario_stringmap
   * Returns a scenario from a propmap.
   * @param  {scenario} scenario
   * @param  {stringmap} propmap
   * @return {scenario}
   */
  static t_scenario_from_scenario_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_scenario_from_scenario_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_scenario_from_scenario_stringmap
  }

  // (func scenario<-scenario-stringmap)
  static f_scenario_from_scenario_stringmap(scenario, propmap) {
    let output = nx_tactics_base.e_scenario
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      scenario,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_scenario_from_scenario_key_value)
    )
    return output
  }

  /**
   * @function scenario_from_scenario_xmlchild
   * Returns a modified scenario based on a given child Xml.
   * @param  {scenario} scenario
   * @param  {xml} child
   * @return {scenario}
   */
  static t_scenario_from_scenario_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_scenario_from_scenario_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_scenario_from_scenario_xmlchild
  }

  // (func scenario<-scenario-xmlchild)
  static f_scenario_from_scenario_xmlchild(scenario, child) {
    let output = nx_tactics_base.e_scenario
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_scenario, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_scenario, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return scenario})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              scenario,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "team",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_scenario_from_scenario_xmlteam(scenario, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              scenario,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_scenario,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function scenario_from_scenario_xmlteam
   * Return a scenario with new team added to teammap
   * @param  {scenario} scenario
   * @param  {xml} xmlteam
   * @return {scenario}
   */
  static t_scenario_from_scenario_xmlteam = {
    vx_type: vx_core.t_type
  }
  static e_scenario_from_scenario_xmlteam = {
    vx_type: nx_tactics_books_bookloader.t_scenario_from_scenario_xmlteam
  }

  // (func scenario<-scenario-xmlteam)
  static f_scenario_from_scenario_xmlteam(scenario, xmlteam) {
    let output = nx_tactics_base.e_scenario
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_scenario},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const current = nx_tactics_books_bookloader.f_team_from_xml(xmlteam)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_team}, current, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_teammap, "struct-2": nx_tactics_base.t_scenario}, scenario, ":teammap")
        const chgmap = vx_core.f_copy(origmap, name, current)
        return vx_core.f_copy(scenario, ":teammap", chgmap)
      })
    )
    return output
  }

  /**
   * @function scenario_from_xml
   * Returns a scenario from a given xml.
   * @param  {xml} xml
   * @return {scenario}
   */
  static t_scenario_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_scenario_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_scenario_from_xml
  }

  // (func scenario<-xml)
  static f_scenario_from_xml(xml) {
    let output = nx_tactics_base.e_scenario
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_scenario, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const scenario = nx_tactics_books_bookloader.f_scenario_from_scenario_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_scenario
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_scenario, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          scenario,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_scenario_from_scenario_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function section_from_section_key_value
   * Returns a modified section from a key value.
   * @param  {section} current
   * @param  {string} key
   * @param  {string} value
   * @return {section}
   */
  static t_section_from_section_key_value = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_key_value = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_key_value
  }

  // (func section<-section-key-value)
  static f_section_from_section_key_value(current, key, value) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_section, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_section,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function section_from_section_stringmap
   * Returns a new book from a propmap.
   * @param  {section} section
   * @param  {stringmap} propmap
   * @return {section}
   */
  static t_section_from_section_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_stringmap
  }

  // (func section<-section-stringmap)
  static f_section_from_section_stringmap(section, propmap) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      section,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_section_from_section_key_value)
    )
    return output
  }

  /**
   * @function section_from_section_xmlchild
   * Returns a modified section based on a given child Xml.
   * @param  {section} section
   * @param  {xml} child
   * @return {section}
   */
  static t_section_from_section_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlchild
  }

  // (func section<-section-xmlchild)
  static f_section_from_section_xmlchild(section, child) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_section, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return section})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              section,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "damage",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmldamage(section, child)})
          ),
          vx_core.f_case_1(
            "item",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlitem(section, child)})
          ),
          vx_core.f_case_1(
            "modifier",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlmodifier(section, child)})
          ),
          vx_core.f_case_1(
            "place",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmllocation(section, child)})
          ),
          vx_core.f_case_1(
            "power",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlpower(section, child)})
          ),
          vx_core.f_case_1(
            "rule",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlrule(section, child)})
          ),
          vx_core.f_case_1(
            "scenario",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlscenario(section, child)})
          ),
          vx_core.f_case_1(
            "section",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlsection(section, child)})
          ),
          vx_core.f_case_1(
            "skill",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlskill(section, child)})
          ),
          vx_core.f_case_1(
            "terrain",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlterrain(section, child)})
          ),
          vx_core.f_case_1(
            "unit",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlunit(section, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              section,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_section,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmldamage
   * Return a section with new damage added to damagemap
   * @param  {section} section
   * @param  {xml} xmldamage
   * @return {section}
   */
  static t_section_from_section_xmldamage = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmldamage = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmldamage
  }

  // (func section<-section-xmldamage)
  static f_section_from_section_xmldamage(section, xmldamage) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const current = nx_tactics_books_bookloader.f_damage_from_xml(xmldamage)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_damage}, current, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_damagemap, "struct-2": nx_tactics_base.t_section}, section, ":damagemap")
        const chgmap = vx_core.f_copy(origmap, name, current)
        return vx_core.f_copy(section, ":damagemap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlitem
   * Return a section with new item added to itemmap
   * @param  {section} section
   * @param  {xml} xmlitem
   * @return {section}
   */
  static t_section_from_section_xmlitem = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlitem = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlitem
  }

  // (func section<-section-xmlitem)
  static f_section_from_section_xmlitem(section, xmlitem) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const item = nx_tactics_books_bookloader.f_item_from_xml(xmlitem)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_item}, item, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_itemmap, "struct-2": nx_tactics_base.t_section}, section, ":itemmap")
        const chgmap = vx_core.f_copy(origmap, name, item)
        return vx_core.f_copy(section, ":itemmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmllocation
   * Return a section with new location added to locationmap
   * @param  {section} section
   * @param  {xml} xmllocation
   * @return {section}
   */
  static t_section_from_section_xmllocation = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmllocation = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmllocation
  }

  // (func section<-section-xmllocation)
  static f_section_from_section_xmllocation(section, xmllocation) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const location = nx_tactics_books_bookloader.f_location_from_xml(xmllocation)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_location}, location, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_locationmap, "struct-2": nx_tactics_base.t_section}, section, ":locationmap")
        const chgmap = vx_core.f_copy(origmap, name, location)
        return vx_core.f_copy(section, ":locationmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlmodifier
   * Return a section with new modifier added to modifiermap
   * @param  {section} section
   * @param  {xml} xmlmodifier
   * @return {section}
   */
  static t_section_from_section_xmlmodifier = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlmodifier = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlmodifier
  }

  // (func section<-section-xmlmodifier)
  static f_section_from_section_xmlmodifier(section, xmlmodifier) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const modifier = nx_tactics_books_bookloader.f_modifier_from_xml(xmlmodifier)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_modifier}, modifier, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_modifiermap, "struct-2": nx_tactics_base.t_section}, section, ":modifiermap")
        const chgmap = vx_core.f_copy(origmap, name, modifier)
        return vx_core.f_copy(section, ":modifiermap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlpower
   * Return a section with new power added to powermap
   * @param  {section} section
   * @param  {xml} xmlpower
   * @return {section}
   */
  static t_section_from_section_xmlpower = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlpower = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlpower
  }

  // (func section<-section-xmlpower)
  static f_section_from_section_xmlpower(section, xmlpower) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const power = nx_tactics_books_bookloader.f_power_from_xml(xmlpower)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_power}, power, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_powermap, "struct-2": nx_tactics_base.t_section}, section, ":powermap")
        const chgmap = vx_core.f_copy(origmap, name, power)
        return vx_core.f_copy(section, ":powermap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlrule
   * Return a section with new rule added to rulemap
   * @param  {section} section
   * @param  {xml} xmlrule
   * @return {section}
   */
  static t_section_from_section_xmlrule = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlrule = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlrule
  }

  // (func section<-section-xmlrule)
  static f_section_from_section_xmlrule(section, xmlrule) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const rule = nx_tactics_books_bookloader.f_rule_from_xml(xmlrule)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_rule}, rule, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_rulemap, "struct-2": nx_tactics_base.t_section}, section, ":rulemap")
        const chgmap = vx_core.f_copy(origmap, name, rule)
        return vx_core.f_copy(section, ":rulemap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlscenario
   * Return a section with new scenario added to scenariomap
   * @param  {section} section
   * @param  {xml} xmlscenario
   * @return {section}
   */
  static t_section_from_section_xmlscenario = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlscenario = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlscenario
  }

  // (func section<-section-xmlscenario)
  static f_section_from_section_xmlscenario(section, xmlscenario) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const scenario = nx_tactics_books_bookloader.f_scenario_from_xml(xmlscenario)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_scenario}, scenario, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_scenariomap, "struct-2": nx_tactics_base.t_section}, section, ":scenariomap")
        const chgmap = vx_core.f_copy(origmap, name, scenario)
        return vx_core.f_copy(section, ":scenariomap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlsection
   * Return a section with new section added to sectionmap
   * @param  {section} section
   * @param  {xml} xmlsection
   * @return {section}
   */
  static t_section_from_section_xmlsection = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlsection = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlsection
  }

  // (func section<-section-xmlsection)
  static f_section_from_section_xmlsection(section, xmlsection) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const subsect = nx_tactics_books_bookloader.f_section_from_xml(xmlsection)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, subsect, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_section}, section, ":sectionmap")
        const chgmap = vx_core.f_copy(origmap, name, subsect)
        return vx_core.f_copy(section, ":sectionmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlskill
   * Return a section with new skill added to skillmap
   * @param  {section} section
   * @param  {xml} xmlskill
   * @return {section}
   */
  static t_section_from_section_xmlskill = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlskill = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlskill
  }

  // (func section<-section-xmlskill)
  static f_section_from_section_xmlskill(section, xmlskill) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const skill = nx_tactics_books_bookloader.f_skill_from_xml(xmlskill)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_skill}, skill, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_skillmap, "struct-2": nx_tactics_base.t_section}, section, ":skillmap")
        const chgmap = vx_core.f_copy(origmap, name, skill)
        return vx_core.f_copy(section, ":skillmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlterrain
   * Return a section with new terrain added to terrainmap
   * @param  {section} section
   * @param  {xml} xmlterrain
   * @return {section}
   */
  static t_section_from_section_xmlterrain = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlterrain = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlterrain
  }

  // (func section<-section-xmlterrain)
  static f_section_from_section_xmlterrain(section, xmlterrain) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const current = nx_tactics_books_bookloader.f_terrain_from_xml(xmlterrain)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_terrain}, current, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_terrainmap, "struct-2": nx_tactics_base.t_section}, section, ":terrainmap")
        const chgmap = vx_core.f_copy(origmap, name, current)
        return vx_core.f_copy(section, ":terrainmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_section_xmlunit
   * Return a section with new unit added to unitmap
   * @param  {section} section
   * @param  {xml} xmlunit
   * @return {section}
   */
  static t_section_from_section_xmlunit = {
    vx_type: vx_core.t_type
  }
  static e_section_from_section_xmlunit = {
    vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlunit
  }

  // (func section<-section-xmlunit)
  static f_section_from_section_xmlunit(section, xmlunit) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unit = nx_tactics_books_bookloader.f_unit_from_xml(xmlunit)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_section}, section, ":unitmap")
        const chgmap = vx_core.f_copy(origmap, name, unit)
        return vx_core.f_copy(section, ":unitmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function section_from_xml
   * Returns a section from a given Xml.
   * @param  {xml} xml
   * @return {section}
   */
  static t_section_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_section_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_section_from_xml
  }

  // (func section<-xml)
  static f_section_from_xml(xml) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const children = vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children")
        const section = nx_tactics_books_bookloader.f_section_from_section_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_section
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_section, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          children,
          section,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_section_from_section_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function skill_from_skill_key_value
   * Returns a modified skill from a key value.
   * @param  {skill} current
   * @param  {string} key
   * @param  {string} value
   * @return {skill}
   */
  static t_skill_from_skill_key_value = {
    vx_type: vx_core.t_type
  }
  static e_skill_from_skill_key_value = {
    vx_type: nx_tactics_books_bookloader.t_skill_from_skill_key_value
  }

  // (func skill<-skill-key-value)
  static f_skill_from_skill_key_value(current, key, value) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "stat"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_skill,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function skill_from_skill_stringmap
   * Returns a new skill from a propmap.
   * @param  {skill} skill
   * @param  {stringmap} propmap
   * @return {skill}
   */
  static t_skill_from_skill_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_skill_from_skill_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_skill_from_skill_stringmap
  }

  // (func skill<-skill-stringmap)
  static f_skill_from_skill_stringmap(skill, propmap) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      skill,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_skill_from_skill_key_value)
    )
    return output
  }

  /**
   * @function skill_from_skill_xmlability
   * Return a skill with new ability added to abilitymap
   * @param  {skill} skill
   * @param  {xml} xmlability
   * @return {skill}
   */
  static t_skill_from_skill_xmlability = {
    vx_type: vx_core.t_type
  }
  static e_skill_from_skill_xmlability = {
    vx_type: nx_tactics_books_bookloader.t_skill_from_skill_xmlability
  }

  // (func skill<-skill-xmlability)
  static f_skill_from_skill_xmlability(skill, xmlability) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skill},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const ability = nx_tactics_books_bookloader.f_ability_from_xml(xmlability)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_ability}, ability, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_abilitymap, "struct-2": nx_tactics_base.t_skill}, skill, ":abilitymap")
        const chgmap = vx_core.f_copy(origmap, name, ability)
        return vx_core.f_copy(skill, ":abilitymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function skill_from_skill_xmlchild
   * Returns a modified skill based on a given child Xml.
   * @param  {skill} skill
   * @param  {xml} child
   * @return {skill}
   */
  static t_skill_from_skill_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_skill_from_skill_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_skill_from_skill_xmlchild
  }

  // (func skill<-skill-xmlchild)
  static f_skill_from_skill_xmlchild(skill, child) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return skill})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              skill,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "ability",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_skill_from_skill_xmlability(skill, child)})
          ),
          vx_core.f_case_1(
            "specialty",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_skill_from_skill_xmlspecialty(skill, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              skill,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_skill,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function skill_from_skill_xmlspecialty
   * Return a skill with new specialty added to specialtymap
   * @param  {skill} skill
   * @param  {xml} xmlspecialty
   * @return {skill}
   */
  static t_skill_from_skill_xmlspecialty = {
    vx_type: vx_core.t_type
  }
  static e_skill_from_skill_xmlspecialty = {
    vx_type: nx_tactics_books_bookloader.t_skill_from_skill_xmlspecialty
  }

  // (func skill<-skill-xmlspecialty)
  static f_skill_from_skill_xmlspecialty(skill, xmlspecialty) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skill},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const specialty = nx_tactics_books_bookloader.f_specialty_from_xml(xmlspecialty)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_specialty}, specialty, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_specialtymap, "struct-2": nx_tactics_base.t_skill}, skill, ":specialtymap")
        const chgmap = vx_core.f_copy(origmap, name, specialty)
        return vx_core.f_copy(skill, ":specialtymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function skill_from_xml
   * Returns a skill from a given xml.
   * @param  {xml} xml
   * @return {skill}
   */
  static t_skill_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_skill_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_skill_from_xml
  }

  // (func skill<-xml)
  static f_skill_from_xml(xml) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const skill = nx_tactics_books_bookloader.f_skill_from_skill_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_skill
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_skill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          skill,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_skill_from_skill_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function specialty_from_specialty_key_value
   * Returns a modified specialty from a key value.
   * @param  {specialty} current
   * @param  {string} key
   * @param  {string} value
   * @return {specialty}
   */
  static t_specialty_from_specialty_key_value = {
    vx_type: vx_core.t_type
  }
  static e_specialty_from_specialty_key_value = {
    vx_type: nx_tactics_books_bookloader.t_specialty_from_specialty_key_value
  }

  // (func specialty<-specialty-key-value)
  static f_specialty_from_specialty_key_value(current, key, value) {
    let output = nx_tactics_base.e_specialty
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_specialty, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_specialty,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function specialty_from_specialty_stringmap
   * Returns a new specialty from a propmap.
   * @param  {specialty} specialty
   * @param  {stringmap} propmap
   * @return {specialty}
   */
  static t_specialty_from_specialty_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_specialty_from_specialty_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_specialty_from_specialty_stringmap
  }

  // (func specialty<-specialty-stringmap)
  static f_specialty_from_specialty_stringmap(specialty, propmap) {
    let output = nx_tactics_base.e_specialty
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      specialty,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_specialty_from_specialty_key_value)
    )
    return output
  }

  /**
   * @function specialty_from_specialty_xmlchild
   * Returns a modified specialty based on a given child xml.
   * @param  {specialty} specialty
   * @param  {xml} child
   * @return {specialty}
   */
  static t_specialty_from_specialty_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_specialty_from_specialty_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_specialty_from_specialty_xmlchild
  }

  // (func specialty<-specialty-xmlchild)
  static f_specialty_from_specialty_xmlchild(specialty, child) {
    let output = nx_tactics_base.e_specialty
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_specialty, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_specialty, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return specialty})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              specialty,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              specialty,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_specialty,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function specialty_from_xml
   * Returns a specialty from a given xml.
   * @param  {xml} xml
   * @return {specialty}
   */
  static t_specialty_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_specialty_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_specialty_from_xml
  }

  // (func specialty<-xml)
  static f_specialty_from_xml(xml) {
    let output = nx_tactics_base.e_specialty
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_specialty, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const spc = nx_tactics_books_bookloader.f_specialty_from_specialty_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_specialty
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_specialty, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          spc,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_specialty_from_specialty_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function string_read_from_bookname
   * Returns text from a file with bookname.
   * @param  {string} bookname
   * @return {string}
   */
  static t_string_read_from_bookname = {
    vx_type: vx_core.t_type
  }
  static e_string_read_from_bookname = {
    vx_type: nx_tactics_books_bookloader.t_string_read_from_bookname
  }

  // (func string-read<-bookname)
  static f_string_read_from_bookname(context, bookname) {
    let output = vx_core.e_string
    output = vx_data_file.f_string_read_from_file(
      context,
      nx_tactics_books_bookloader.f_file_read_from_bookname(bookname)
    )
    return output
  }

  /**
   * @function string_vxlisp_header_from_chaptermap
   * Returns a vxlisp string from a chaptermap.
   * @param  {chaptermap} chaptermap
   * @return {string}
   */
  static t_string_vxlisp_header_from_chaptermap = {
    vx_type: vx_core.t_type
  }
  static e_string_vxlisp_header_from_chaptermap = {
    vx_type: nx_tactics_books_bookloader.t_string_vxlisp_header_from_chaptermap
  }

  // (func string-vxlisp-header<-chaptermap)
  static f_string_vxlisp_header_from_chaptermap(chaptermap) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const chapters = vx_core.f_list_from_map_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_chapter, "list-1": vx_core.t_stringlist, "map-2": nx_tactics_base.t_chaptermap},
          chaptermap,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, val]) => 
            vx_core.f_new(
              vx_core.t_string,
              vx_core.c_newline,
              "    ",
              vx_core.c_quote,
              key,
              vx_core.c_quote,
              " (chapter_",
              nx_tactics_books_bookloader.f_string_writename_from_string(key),
              ")"
            ))
        )
        return vx_type.f_string_from_stringlist_join(chapters, "")
      })
    )
    return output
  }

  /**
   * @function string_vxlisp_from_book
   * Returns a vxlisp string from a book.
   * @param  {book} book
   * @return {string}
   */
  static t_string_vxlisp_from_book = {
    vx_type: vx_core.t_type
  }
  static e_string_vxlisp_from_book = {
    vx_type: nx_tactics_books_bookloader.t_string_vxlisp_from_book
  }

  // (func string-vxlisp<-book)
  static f_string_vxlisp_from_book(book) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":name")
        const chaptermap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_chaptermap, "struct-2": nx_tactics_base.t_book}, book, ":chaptermap")
        const image = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":image")
        const reference = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":reference")
        const summary = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":summary")
        const titles = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":titles")
        const schaptermap = nx_tactics_books_bookloader.f_string_vxlisp_header_from_chaptermap(chaptermap)
        const schapters = nx_tactics_books_bookloader.f_string_vxlisp_from_chaptermap(chaptermap)
        const simage = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": vx_core.t_string},
          image,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return ""})),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_core.t_string,
              "\n  :image ",
              vx_core.f_string_from_any(image)
            )})
          )
        )
        const sreference = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": vx_core.t_string},
          reference,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return ""})),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_core.t_string,
              "\n  :reference ",
              vx_core.f_string_from_any(reference)
            )})
          )
        )
        const ssummary = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": vx_core.t_string},
          summary,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return ""})),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_core.t_string,
              "\n  :summary ",
              vx_core.f_string_from_any(summary)
            )})
          )
        )
        const stitles = vx_core.f_switch(
          {"any-1": vx_core.t_string, "any-2": vx_core.t_string},
          titles,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return ""})),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_new(
              vx_core.t_string,
              "\n  :titles ",
              vx_core.f_string_from_any(titles)
            )})
          )
        )
        const bookname = nx_tactics_books_bookloader.f_string_writename_from_string(name)
        return vx_core.f_new(
          vx_core.t_string,
          "(package nx/tactics/books/",
          bookname,
          "\n :libs (lib base :path nx/tactics/base))",
          "\n",
          "\n(func tacticsbook : base/book",
          "\n (base/book",
          "\n  :name ",
          vx_core.f_string_from_any(name),
          simage,
          stitles,
          sreference,
          ssummary,
          "\n  :chaptermap",
          "\n   (base/chaptermap",
          schaptermap,
          "\n   ))",
          ")\n",
          schapters
        )
      })
    )
    return output
  }

  /**
   * @function string_vxlisp_from_chapter
   * Returns a vxlisp string from a chapter.
   * @param  {chapter} chapter
   * @return {string}
   */
  static t_string_vxlisp_from_chapter = {
    vx_type: vx_core.t_type
  }
  static e_string_vxlisp_from_chapter = {
    vx_type: nx_tactics_books_bookloader.t_string_vxlisp_from_chapter
  }

  // (func string-vxlisp<-chapter)
  static f_string_vxlisp_from_chapter(chapter) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_chapter}, chapter, ":name")
        const chnm = nx_tactics_books_bookloader.f_string_writename_from_string(name)
        const text = vx_core.f_string_from_any_indent(
          chapter,
          1,
          false
        )
        return vx_core.f_new(
          vx_core.t_string,
          "(func chapter_",
          chnm,
          " : base/chapter\n",
          text,
          ")\n"
        )
      })
    )
    return output
  }

  /**
   * @function string_vxlisp_from_chaptermap
   * Returns a vxlisp string from a chaptermap.
   * @param  {chaptermap} chaptermap
   * @return {string}
   */
  static t_string_vxlisp_from_chaptermap = {
    vx_type: vx_core.t_type
  }
  static e_string_vxlisp_from_chaptermap = {
    vx_type: nx_tactics_books_bookloader.t_string_vxlisp_from_chaptermap
  }

  // (func string-vxlisp<-chaptermap)
  static f_string_vxlisp_from_chaptermap(chaptermap) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const chapters = vx_core.f_list_from_map_1(
          {"any-1": nx_tactics_base.t_chapter, "any-2": nx_tactics_base.t_chapter, "list-1": nx_tactics_base.t_chapterlist, "map-2": nx_tactics_base.t_chaptermap},
          chaptermap,
          vx_core.f_new(vx_core.t_any_from_key_value, ([key, val]) => val)
        )
        const schapters = vx_core.f_list_from_list_1(
          {"any-1": vx_core.t_string, "any-2": nx_tactics_base.t_chapter, "list-1": vx_core.t_stringlist, "list-2": nx_tactics_base.t_chapterlist},
          chapters,
          vx_core.f_new(vx_core.t_any_from_any, (chapt) => 
            vx_core.f_let(
              {"any-1": vx_core.t_string},
              [],
              vx_core.f_new(vx_core.t_any_from_func, () => {
                const name = nx_tactics_base.f_name_from_chapter(chapt)
                const schnm = nx_tactics_books_bookloader.f_string_writename_from_string(name)
                const text = vx_core.f_string_from_any_indent(
                  chapt,
                  1,
                  true
                )
                return vx_core.f_new(
                  vx_core.t_string,
                  "\n(func chapter_",
                  schnm,
                  " : base/chapter\n ",
                  text,
                  ")"
                )
              })
            ))
        )
        return vx_type.f_string_from_stringlist_join(
          schapters,
          vx_core.c_newline
        )
      })
    )
    return output
  }

  /**
   * @function string_writename_from_string
   * Returns the write filename from a book
   * @param  {string} name
   * @return {string}
   */
  static t_string_writename_from_string = {
    vx_type: vx_core.t_type
  }
  static e_string_writename_from_string = {
    vx_type: nx_tactics_books_bookloader.t_string_writename_from_string
  }

  // (func string-writename<-string)
  static f_string_writename_from_string(name) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const lower = vx_type.f_string_lowercase(name)
        const space = vx_core.f_string_from_string_find_replace(lower, " ", "_")
        const comma = vx_core.f_string_from_string_find_replace(space, ",", "")
        const apos = vx_core.f_string_from_string_find_replace(comma, "'", "")
        const slash = vx_core.f_string_from_string_find_replace(apos, "/", "_")
        return slash
      })
    )
    return output
  }

  /**
   * @function team_from_team_key_value
   * Returns a modified team from a key value.
   * @param  {team} current
   * @param  {string} key
   * @param  {string} value
   * @return {team}
   */
  static t_team_from_team_key_value = {
    vx_type: vx_core.t_type
  }
  static e_team_from_team_key_value = {
    vx_type: nx_tactics_books_bookloader.t_team_from_team_key_value
  }

  // (func team<-team-key-value)
  static f_team_from_team_key_value(current, key, value) {
    let output = nx_tactics_base.e_team
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_team, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_team,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function team_from_team_stringmap
   * Returns a team from a propmap.
   * @param  {team} team
   * @param  {stringmap} propmap
   * @return {team}
   */
  static t_team_from_team_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_team_from_team_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_team_from_team_stringmap
  }

  // (func team<-team-stringmap)
  static f_team_from_team_stringmap(team, propmap) {
    let output = nx_tactics_base.e_team
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      team,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_team_from_team_key_value)
    )
    return output
  }

  /**
   * @function team_from_team_xmlchild
   * Returns a modified team based on a given child xml.
   * @param  {team} team
   * @param  {xml} child
   * @return {team}
   */
  static t_team_from_team_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_team_from_team_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_team_from_team_xmlchild
  }

  // (func team<-team-xmlchild)
  static f_team_from_team_xmlchild(team, child) {
    let output = nx_tactics_base.e_team
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_team, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_team, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return team})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles",
              "completevictory",
              "deploy",
              "forces",
              "partialvictory"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              team,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              team,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_team,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function team_from_xml
   * Returns a team from a given xml.
   * @param  {xml} xml
   * @return {team}
   */
  static t_team_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_team_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_team_from_xml
  }

  // (func team<-xml)
  static f_team_from_xml(xml) {
    let output = nx_tactics_base.e_team
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_team, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const team = nx_tactics_books_bookloader.f_team_from_team_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_team
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_team, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          team,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_team_from_team_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function terrain_from_terrain_key_value
   * Returns a modified terrain from a key value.
   * @param  {terrain} current
   * @param  {string} key
   * @param  {string} value
   * @return {terrain}
   */
  static t_terrain_from_terrain_key_value = {
    vx_type: vx_core.t_type
  }
  static e_terrain_from_terrain_key_value = {
    vx_type: nx_tactics_books_bookloader.t_terrain_from_terrain_key_value
  }

  // (func terrain<-terrain-key-value)
  static f_terrain_from_terrain_key_value(current, key, value) {
    let output = nx_tactics_base.e_terrain
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_terrain, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_terrain,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function terrain_from_terrain_stringmap
   * Returns a terrain from a propmap.
   * @param  {terrain} terrain
   * @param  {stringmap} propmap
   * @return {terrain}
   */
  static t_terrain_from_terrain_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_terrain_from_terrain_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_terrain_from_terrain_stringmap
  }

  // (func terrain<-terrain-stringmap)
  static f_terrain_from_terrain_stringmap(terrain, propmap) {
    let output = nx_tactics_base.e_terrain
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      terrain,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_terrain_from_terrain_key_value)
    )
    return output
  }

  /**
   * @function terrain_from_terrain_xmlchild
   * Returns a modified terrain based on a given child Xml.
   * @param  {terrain} terrain
   * @param  {xml} child
   * @return {terrain}
   */
  static t_terrain_from_terrain_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_terrain_from_terrain_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_terrain_from_terrain_xmlchild
  }

  // (func terrain<-terrain-xmlchild)
  static f_terrain_from_terrain_xmlchild(terrain, child) {
    let output = nx_tactics_base.e_terrain
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_terrain, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_terrain, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return terrain})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles",
              "classification"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              terrain,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              terrain,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_terrain,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function terrain_from_xml
   * Returns a terrain from a given xml.
   * @param  {xml} xml
   * @return {terrain}
   */
  static t_terrain_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_terrain_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_terrain_from_xml
  }

  // (func terrain<-xml)
  static f_terrain_from_xml(xml) {
    let output = nx_tactics_base.e_terrain
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_terrain, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const terrain = nx_tactics_books_bookloader.f_terrain_from_terrain_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_terrain
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_terrain, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          terrain,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_terrain_from_terrain_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function unit_from_unit_key_value
   * Returns a modified unit from a key value.
   * @param  {unit} current
   * @param  {string} key
   * @param  {string} value
   * @return {unit}
   */
  static t_unit_from_unit_key_value = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_unit_key_value = {
    vx_type: nx_tactics_books_bookloader.t_unit_from_unit_key_value
  }

  // (func unit<-unit-key-value)
  static f_unit_from_unit_key_value(current, key, value) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unit, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "classification",
          "crew",
          "body",
          "height",
          "length",
          "mass",
          "mind",
          "range",
          "speed",
          "speedair",
          "speedland",
          "speedspace",
          "speedwater",
          "width",
          "will"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_unit,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function unit_from_unit_stringmap
   * Returns a new unit from a propmap.
   * @param  {unit} unit
   * @param  {stringmap} propmap
   * @return {unit}
   */
  static t_unit_from_unit_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_unit_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_unit_from_unit_stringmap
  }

  // (func unit<-unit-stringmap)
  static f_unit_from_unit_stringmap(unit, propmap) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      unit,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_unit_from_unit_key_value)
    )
    return output
  }

  /**
   * @function unit_from_unit_xmlchild
   * Returns a modified unit based on a given child Xml.
   * @param  {unit} unit
   * @param  {xml} child
   * @return {unit}
   */
  static t_unit_from_unit_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_unit_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlchild
  }

  // (func unit<-unit-xmlchild)
  static f_unit_from_unit_xmlchild(unit, child) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_unit, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return unit})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unit,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "power",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unit_from_unit_xmlpower(unit, child)})
          ),
          vx_core.f_case_1(
            "skill",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unit_from_unit_xmlskill(unit, child)})
          ),
          vx_core.f_case_1(
            "weakness",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unit_from_unit_xmlweakness(unit, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unit,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_unit,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function unit_from_unit_xmlpower
   * Return a unit with new unit added to unitpowermap
   * @param  {unit} unit
   * @param  {xml} xmlpower
   * @return {unit}
   */
  static t_unit_from_unit_xmlpower = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_unit_xmlpower = {
    vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlpower
  }

  // (func unit<-unit-xmlpower)
  static f_unit_from_unit_xmlpower(unit, xmlpower) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unitpower = nx_tactics_books_bookloader.f_unitpower_from_xml(xmlpower)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitpowermap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitpowermap")
        const chgmap = vx_core.f_copy(origmap, name, unitpower)
        return vx_core.f_copy(unit, ":unitpowermap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unit_from_unit_xmlskill
   * Return a unit with new unitskill added to unitskillmap
   * @param  {unit} unit
   * @param  {xml} xmlskill
   * @return {unit}
   */
  static t_unit_from_unit_xmlskill = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_unit_xmlskill = {
    vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlskill
  }

  // (func unit<-unit-xmlskill)
  static f_unit_from_unit_xmlskill(unit, xmlskill) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unitskill = nx_tactics_books_bookloader.f_unitskill_from_xml(xmlskill)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitskillmap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitskillmap")
        const chgmap = vx_core.f_copy(
          nx_tactics_base.t_unitskillmap,
          name,
          unitskill
        )
        return vx_core.f_copy(unit, ":unitskillmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unit_from_unit_xmlweakness
   * Return a unit with new unitweakness added to unitweaknessmap
   * @param  {unit} unit
   * @param  {xml} xmlweakness
   * @return {unit}
   */
  static t_unit_from_unit_xmlweakness = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_unit_xmlweakness = {
    vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlweakness
  }

  // (func unit<-unit-xmlweakness)
  static f_unit_from_unit_xmlweakness(unit, xmlweakness) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unitweakness = nx_tactics_books_bookloader.f_unitweakness_from_xml(xmlweakness)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitweakness}, unitweakness, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitweaknessmap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitweaknessmap")
        const chgmap = vx_core.f_copy(origmap, name, unitweakness)
        return vx_core.f_copy(unit, ":unitweaknessmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unit_from_xml
   * Returns a unit from a given xml.
   * @param  {xml} xml
   * @return {unit}
   */
  static t_unit_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_unit_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_unit_from_xml
  }

  // (func unit<-xml)
  static f_unit_from_xml(xml) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const unt = nx_tactics_books_bookloader.f_unit_from_unit_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_unit
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_unit, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          unt,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_unit_from_unit_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function unitability_from_unitability_key_value
   * Returns a modified unitability from a key value.
   * @param  {unitability} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitability}
   */
  static t_unitability_from_unitability_key_value = {
    vx_type: vx_core.t_type
  }
  static e_unitability_from_unitability_key_value = {
    vx_type: nx_tactics_books_bookloader.t_unitability_from_unitability_key_value
  }

  // (func unitability<-unitability-key-value)
  static f_unitability_from_unitability_key_value(current, key, value) {
    let output = nx_tactics_base.e_unitability
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unitability, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_unitability,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function unitability_from_unitability_stringmap
   * Returns a new unitability from a propmap.
   * @param  {unitability} unitability
   * @param  {stringmap} propmap
   * @return {unitability}
   */
  static t_unitability_from_unitability_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_unitability_from_unitability_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_unitability_from_unitability_stringmap
  }

  // (func unitability<-unitability-stringmap)
  static f_unitability_from_unitability_stringmap(unitability, propmap) {
    let output = nx_tactics_base.e_unitability
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      unitability,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_unitability_from_unitability_key_value)
    )
    return output
  }

  /**
   * @function unitability_from_unitability_xmlchild
   * Returns a modified unitability based on a given child xml.
   * @param  {unitability} unitability
   * @param  {xml} child
   * @return {unitability}
   */
  static t_unitability_from_unitability_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_unitability_from_unitability_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_unitability_from_unitability_xmlchild
  }

  // (func unitability<-unitability-xmlchild)
  static f_unitability_from_unitability_xmlchild(unitability, child) {
    let output = nx_tactics_base.e_unitability
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitability, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_unitability, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return unitability})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitability,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitability,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_unitability,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function unitability_from_xml
   * Returns a unitability from a given xml.
   * @param  {xml} xml
   * @return {unitability}
   */
  static t_unitability_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_unitability_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_unitability_from_xml
  }

  // (func unitability<-xml)
  static f_unitability_from_xml(xml) {
    let output = nx_tactics_base.e_unitability
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitability, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const unitability = nx_tactics_books_bookloader.f_unitability_from_unitability_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_unitability
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_unitability, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          unitability,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_unitability_from_unitability_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function unititem_from_unititem_key_value
   * Returns a modified unititem from a key value.
   * @param  {unititem} current
   * @param  {string} key
   * @param  {string} value
   * @return {unititem}
   */
  static t_unititem_from_unititem_key_value = {
    vx_type: vx_core.t_type
  }
  static e_unititem_from_unititem_key_value = {
    vx_type: nx_tactics_books_bookloader.t_unititem_from_unititem_key_value
  }

  // (func unititem<-unititem-key-value)
  static f_unititem_from_unititem_key_value(current, key, value) {
    let output = nx_tactics_base.e_unititem
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unititem, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "facing",
          "modifiers",
          "number",
          "rounds"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_unititem,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function unititem_from_unititem_stringmap
   * Returns a new unititem from a propmap.
   * @param  {unititem} unititem
   * @param  {stringmap} propmap
   * @return {unititem}
   */
  static t_unititem_from_unititem_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_unititem_from_unititem_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_unititem_from_unititem_stringmap
  }

  // (func unititem<-unititem-stringmap)
  static f_unititem_from_unititem_stringmap(unititem, propmap) {
    let output = nx_tactics_base.e_unititem
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      unititem,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_unititem_from_unititem_key_value)
    )
    return output
  }

  /**
   * @function unititem_from_unititem_xmlchild
   * Returns a modified unititem based on a given child xml.
   * @param  {unititem} unititem
   * @param  {xml} child
   * @return {unititem}
   */
  static t_unititem_from_unititem_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_unititem_from_unititem_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_unititem_from_unititem_xmlchild
  }

  // (func unititem<-unititem-xmlchild)
  static f_unititem_from_unititem_xmlchild(unititem, child) {
    let output = nx_tactics_base.e_unititem
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unititem, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_unititem, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return unititem})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unititem,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unititem,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_unititem,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function unititem_from_xml
   * Returns a unititem from a given xml.
   * @param  {xml} xml
   * @return {unititem}
   */
  static t_unititem_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_unititem_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_unititem_from_xml
  }

  // (func unititem<-xml)
  static f_unititem_from_xml(xml) {
    let output = nx_tactics_base.e_unititem
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unititem, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const children = vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children")
        const unititem = nx_tactics_books_bookloader.f_unititem_from_unititem_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_unititem
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_unititem, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          children,
          unititem,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_unititem_from_unititem_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function unitpower_from_unitpower_key_value
   * Returns a modified unitpower from a key value.
   * @param  {unitpower} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitpower}
   */
  static t_unitpower_from_unitpower_key_value = {
    vx_type: vx_core.t_type
  }
  static e_unitpower_from_unitpower_key_value = {
    vx_type: nx_tactics_books_bookloader.t_unitpower_from_unitpower_key_value
  }

  // (func unitpower<-unitpower-key-value)
  static f_unitpower_from_unitpower_key_value(current, key, value) {
    let output = nx_tactics_base.e_unitpower
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unitpower, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "back",
          "bottom",
          "front",
          "level",
          "over",
          "side",
          "strength",
          "under"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_unitpower,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function unitpower_from_unitpower_stringmap
   * Returns a new unitpower from a propmap.
   * @param  {unitpower} unitpower
   * @param  {stringmap} propmap
   * @return {unitpower}
   */
  static t_unitpower_from_unitpower_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_unitpower_from_unitpower_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_unitpower_from_unitpower_stringmap
  }

  // (func unitpower<-unitpower-stringmap)
  static f_unitpower_from_unitpower_stringmap(unitpower, propmap) {
    let output = nx_tactics_base.e_unitpower
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      unitpower,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_unitpower_from_unitpower_key_value)
    )
    return output
  }

  /**
   * @function unitpower_from_unitpower_xmlability
   * @param  {unitpower} unitpower
   * @param  {xml} xmlability
   * @return {unitpower}
   */
  static t_unitpower_from_unitpower_xmlability = {
    vx_type: vx_core.t_type
  }
  static e_unitpower_from_unitpower_xmlability = {
    vx_type: nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlability
  }

  // (func unitpower<-unitpower-xmlability)
  static f_unitpower_from_unitpower_xmlability(unitpower, xmlability) {
    let output = nx_tactics_base.e_unitpower
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitpower},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const ability = nx_tactics_books_bookloader.f_unitability_from_xml(xmlability)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitability}, ability, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitabilitymap, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":unitabilitymap")
        const chgmap = vx_core.f_copy(origmap, name, ability)
        return vx_core.f_copy(unitpower, ":unitabilitymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unitpower_from_unitpower_xmlchild
   * @param  {unitpower} unitpower
   * @param  {xml} child
   * @return {unitpower}
   */
  static t_unitpower_from_unitpower_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_unitpower_from_unitpower_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlchild
  }

  // (func unitpower<-unitpower-xmlchild)
  static f_unitpower_from_unitpower_xmlchild(unitpower, child) {
    let output = nx_tactics_base.e_unitpower
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitpower, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_unitpower, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return unitpower})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitpower,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "ability",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlability(unitpower, child)})
          ),
          vx_core.f_case_1(
            "item",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlitem(unitpower, child)})
          ),
          vx_core.f_case_1(
            "specialty",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlspecialty(unitpower, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitpower,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_unitpower,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function unitpower_from_unitpower_xmlitem
   * @param  {unitpower} unitpower
   * @param  {xml} xmlitem
   * @return {unitpower}
   */
  static t_unitpower_from_unitpower_xmlitem = {
    vx_type: vx_core.t_type
  }
  static e_unitpower_from_unitpower_xmlitem = {
    vx_type: nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlitem
  }

  // (func unitpower<-unitpower-xmlitem)
  static f_unitpower_from_unitpower_xmlitem(unitpower, xmlitem) {
    let output = nx_tactics_base.e_unitpower
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitpower},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const item = nx_tactics_books_bookloader.f_unititem_from_xml(xmlitem)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unititem}, item, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unititemmap, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":unititemmap")
        const chgmap = vx_core.f_copy(origmap, name, item)
        return vx_core.f_copy(unitpower, ":unititemmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unitpower_from_unitpower_xmlspecialty
   * @param  {unitpower} unitpower
   * @param  {xml} xmlspecialty
   * @return {unitpower}
   */
  static t_unitpower_from_unitpower_xmlspecialty = {
    vx_type: vx_core.t_type
  }
  static e_unitpower_from_unitpower_xmlspecialty = {
    vx_type: nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlspecialty
  }

  // (func unitpower<-unitpower-xmlspecialty)
  static f_unitpower_from_unitpower_xmlspecialty(unitpower, xmlspecialty) {
    let output = nx_tactics_base.e_unitpower
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitpower},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const specialty = nx_tactics_books_bookloader.f_unitspecialty_from_xml(xmlspecialty)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitspecialty}, specialty, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitspecialtymap, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":unitspecialtymap")
        const chgmap = vx_core.f_copy(origmap, name, specialty)
        return vx_core.f_copy(unitpower, ":unitspecialtymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unitpower_from_xml
   * @param  {xml} xml
   * @return {unitpower}
   */
  static t_unitpower_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_unitpower_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_unitpower_from_xml
  }

  // (func unitpower<-xml)
  static f_unitpower_from_xml(xml) {
    let output = nx_tactics_base.e_unitpower
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitpower, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const unitpower = nx_tactics_books_bookloader.f_unitpower_from_unitpower_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_unitpower
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_unitpower, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          unitpower,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function unitskill_from_unitskill_key_value
   * Returns a modified unitskill from a key value.
   * @param  {unitskill} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitskill}
   */
  static t_unitskill_from_unitskill_key_value = {
    vx_type: vx_core.t_type
  }
  static e_unitskill_from_unitskill_key_value = {
    vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_key_value
  }

  // (func unitskill<-unitskill-key-value)
  static f_unitskill_from_unitskill_key_value(current, key, value) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image",
          "back",
          "bottom",
          "front",
          "level",
          "side",
          "top"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_unitskill,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function unitskill_from_unitskill_stringmap
   * Returns a new unitskill from a propmap.
   * @param  {unitskill} unitskill
   * @param  {stringmap} propmap
   * @return {unitskill}
   */
  static t_unitskill_from_unitskill_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_unitskill_from_unitskill_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_stringmap
  }

  // (func unitskill<-unitskill-stringmap)
  static f_unitskill_from_unitskill_stringmap(unitskill, propmap) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      unitskill,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_unitskill_from_unitskill_key_value)
    )
    return output
  }

  /**
   * @function unitskill_from_unitskill_xmlability
   * @param  {unitskill} unitskill
   * @param  {xml} xmlability
   * @return {unitskill}
   */
  static t_unitskill_from_unitskill_xmlability = {
    vx_type: vx_core.t_type
  }
  static e_unitskill_from_unitskill_xmlability = {
    vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlability
  }

  // (func unitskill<-unitskill-xmlability)
  static f_unitskill_from_unitskill_xmlability(unitskill, xmlability) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitskill},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unitability = nx_tactics_books_bookloader.f_unitability_from_xml(xmlability)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitability}, unitability, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitabilitymap, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":unitabilitymap")
        const chgmap = vx_core.f_copy(origmap, name, unitability)
        return vx_core.f_copy(unitskill, ":unitabilitymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unitskill_from_unitskill_xmlchild
   * @param  {unitskill} unitskill
   * @param  {xml} child
   * @return {unitskill}
   */
  static t_unitskill_from_unitskill_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_unitskill_from_unitskill_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild
  }

  // (func unitskill<-unitskill-xmlchild)
  static f_unitskill_from_unitskill_xmlchild(unitskill, child) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return unitskill})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitskill,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_case_1(
            "ability",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlability(unitskill, child)})
          ),
          vx_core.f_case_1(
            "item",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlitem(unitskill, child)})
          ),
          vx_core.f_case_1(
            "specialty",
            vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlspecialty(unitskill, child)})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitskill,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_unitskill,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function unitskill_from_unitskill_xmlitem
   * @param  {unitskill} unitskill
   * @param  {xml} xmlitem
   * @return {unitskill}
   */
  static t_unitskill_from_unitskill_xmlitem = {
    vx_type: vx_core.t_type
  }
  static e_unitskill_from_unitskill_xmlitem = {
    vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlitem
  }

  // (func unitskill<-unitskill-xmlitem)
  static f_unitskill_from_unitskill_xmlitem(unitskill, xmlitem) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitskill},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const item = nx_tactics_books_bookloader.f_unititem_from_xml(xmlitem)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unititem}, item, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unititemmap, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":unititemmap")
        const chgmap = vx_core.f_copy(origmap, name, item)
        return vx_core.f_copy(unitskill, ":unititemmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unitskill_from_unitskill_xmlspecialty
   * @param  {unitskill} unitskill
   * @param  {xml} xmlspecialty
   * @return {unitskill}
   */
  static t_unitskill_from_unitskill_xmlspecialty = {
    vx_type: vx_core.t_type
  }
  static e_unitskill_from_unitskill_xmlspecialty = {
    vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlspecialty
  }

  // (func unitskill<-unitskill-xmlspecialty)
  static f_unitskill_from_unitskill_xmlspecialty(unitskill, xmlspecialty) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitskill},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const specialty = nx_tactics_books_bookloader.f_unitspecialty_from_xml(xmlspecialty)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitspecialty}, specialty, ":name")
        const origmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitspecialtymap, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":unitspecialtymap")
        const chgmap = vx_core.f_copy(origmap, name, specialty)
        return vx_core.f_copy(unitskill, ":unitspecialtymap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unitskill_from_xml
   * @param  {xml} xml
   * @return {unitskill}
   */
  static t_unitskill_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_unitskill_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_unitskill_from_xml
  }

  // (func unitskill<-xml)
  static f_unitskill_from_xml(xml) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const unitskill = nx_tactics_books_bookloader.f_unitskill_from_unitskill_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_unitskill
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          unitskill,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function unitspecialty_from_unitspecialty_key_value
   * Returns a modified unitspecialty from a key value.
   * @param  {unitspecialty} current
   * @param  {string} key
   * @param  {string} value
   * @return {unitspecialty}
   */
  static t_unitspecialty_from_unitspecialty_key_value = {
    vx_type: vx_core.t_type
  }
  static e_unitspecialty_from_unitspecialty_key_value = {
    vx_type: nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_key_value
  }

  // (func unitspecialty<-unitspecialty-key-value)
  static f_unitspecialty_from_unitspecialty_key_value(current, key, value) {
    let output = nx_tactics_base.e_unitspecialty
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unitspecialty, "any-2": vx_core.t_string},
      key,
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "name",
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, key, value)})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          current,
          vx_core.f_msg_from_error_1(
            ":invalidproperty",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_unitspecialty,
              ":prop",
              key,
              ":value",
              value
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function unitspecialty_from_unitspecialty_stringmap
   * Returns a new unitspecialty from a propmap.
   * @param  {unitspecialty} unitspecialty
   * @param  {stringmap} propmap
   * @return {unitspecialty}
   */
  static t_unitspecialty_from_unitspecialty_stringmap = {
    vx_type: vx_core.t_type
  }
  static e_unitspecialty_from_unitspecialty_stringmap = {
    vx_type: nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_stringmap
  }

  // (func unitspecialty<-unitspecialty-stringmap)
  static f_unitspecialty_from_unitspecialty_stringmap(unitspecialty, propmap) {
    let output = nx_tactics_base.e_unitspecialty
    output = vx_core.f_any_from_map_start_reduce(
      {"any-1": vx_core.t_string, "map-1": vx_core.t_stringmap},
      propmap,
      unitspecialty,
      vx_core.f_new(vx_core.t_any_from_any_key_value, nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_key_value)
    )
    return output
  }

  /**
   * @function unitspecialty_from_unitspecialty_xmlchild
   * Returns a modified unitspecialty based on a given child xml.
   * @param  {unitspecialty} unitspecialty
   * @param  {xml} child
   * @return {unitspecialty}
   */
  static t_unitspecialty_from_unitspecialty_xmlchild = {
    vx_type: vx_core.t_type
  }
  static e_unitspecialty_from_unitspecialty_xmlchild = {
    vx_type: nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_xmlchild
  }

  // (func unitspecialty<-unitspecialty-xmlchild)
  static f_unitspecialty_from_unitspecialty_xmlchild(unitspecialty, child) {
    let output = nx_tactics_base.e_unitspecialty
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitspecialty, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_unitspecialty, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return unitspecialty})),
          vx_core.f_case(
            vx_core.f_new(
              vx_core.t_list,
              "reference",
              "summary",
              "titles"
            ),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitspecialty,
              tag,
              vx_data_xml.f_string_first_from_xml(child)
            )})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
              unitspecialty,
              vx_core.f_msg_from_error_1(
                ":invalidtagfound",
                vx_core.f_new(
                  vx_core.t_anymap,
                  ":type",
                  nx_tactics_base.t_unitspecialty,
                  ":tag",
                  tag
                )
              )
            )})
          )
        )
      })
    )
    return output
  }

  /**
   * @function unitspecialty_from_xml
   * Returns a unitspecialty from a given xml.
   * @param  {xml} xml
   * @return {unitspecialty}
   */
  static t_unitspecialty_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_unitspecialty_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_unitspecialty_from_xml
  }

  // (func unitspecialty<-xml)
  static f_unitspecialty_from_xml(xml) {
    let output = nx_tactics_base.e_unitspecialty
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitspecialty, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const unitspecialty = nx_tactics_books_bookloader.f_unitspecialty_from_unitspecialty_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_unitspecialty
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_unitspecialty, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          unitspecialty,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_xmlchild)
        )
      })
    )
    return output
  }

  /**
   * @function unitweakness_from_xml
   * @param  {xml} xml
   * @return {unitweakness}
   */
  static t_unitweakness_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_unitweakness_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_unitweakness_from_xml
  }

  // (func unitweakness<-xml)
  static f_unitweakness_from_xml(xml) {
    let output = nx_tactics_base.e_unitweakness
    return output
  }

  /**
   * @function weakness_from_xml
   * @param  {xml} xml
   * @return {weakness}
   */
  static t_weakness_from_xml = {
    vx_type: vx_core.t_type
  }
  static e_weakness_from_xml = {
    vx_type: nx_tactics_books_bookloader.t_weakness_from_xml
  }

  // (func weakness<-xml)
  static f_weakness_from_xml(xml) {
    let output = nx_tactics_base.e_weakness
    return output
  }

  /**
   * @function xml_read_from_bookname
   * Returns an xml from a file with bookname.
   * @param  {string} bookname
   * @return {xml}
   */
  static t_xml_read_from_bookname = {
    vx_type: vx_core.t_type
  }
  static e_xml_read_from_bookname = {
    vx_type: nx_tactics_books_bookloader.t_xml_read_from_bookname
  }

  // (func xml-read<-bookname)
  static f_xml_read_from_bookname(context, bookname) {
    let output = vx_data_xml.e_xml
    output = vx_data_xml.f_xml_read_from_file(
      context,
      nx_tactics_books_bookloader.f_file_read_from_bookname(bookname)
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "ability<-ability-key-value": nx_tactics_books_bookloader.e_ability_from_ability_key_value,
      "ability<-ability-stringmap": nx_tactics_books_bookloader.e_ability_from_ability_stringmap,
      "ability<-ability-xmlchild": nx_tactics_books_bookloader.e_ability_from_ability_xmlchild,
      "ability<-xml": nx_tactics_books_bookloader.e_ability_from_xml,
      "book-read<-bookname": nx_tactics_books_bookloader.e_book_read_from_bookname,
      "book<-book-key-value": nx_tactics_books_bookloader.e_book_from_book_key_value,
      "book<-book-stringmap": nx_tactics_books_bookloader.e_book_from_book_stringmap,
      "book<-book-xml": nx_tactics_books_bookloader.e_book_from_book_xml,
      "book<-book-xmlchapter": nx_tactics_books_bookloader.e_book_from_book_xmlchapter,
      "book<-book-xmlchild": nx_tactics_books_bookloader.e_book_from_book_xmlchild,
      "book<-xml": nx_tactics_books_bookloader.e_book_from_xml,
      "book<-xmldoc": nx_tactics_books_bookloader.e_book_from_xmldoc,
      "book<-xmllist": nx_tactics_books_bookloader.e_book_from_xmllist,
      "boolean-write<-book": nx_tactics_books_bookloader.e_boolean_write_from_book,
      "boolean-write<-booknames": nx_tactics_books_bookloader.e_boolean_write_from_booknames,
      "chapter<-chapter-key-value": nx_tactics_books_bookloader.e_chapter_from_chapter_key_value,
      "chapter<-chapter-stringmap": nx_tactics_books_bookloader.e_chapter_from_chapter_stringmap,
      "chapter<-chapter-xmlchild": nx_tactics_books_bookloader.e_chapter_from_chapter_xmlchild,
      "chapter<-chapter-xmlsection": nx_tactics_books_bookloader.e_chapter_from_chapter_xmlsection,
      "chapter<-xml": nx_tactics_books_bookloader.e_chapter_from_xml,
      "damage<-damage-key-value": nx_tactics_books_bookloader.e_damage_from_damage_key_value,
      "damage<-damage-stringmap": nx_tactics_books_bookloader.e_damage_from_damage_stringmap,
      "damage<-damage-xmlchild": nx_tactics_books_bookloader.e_damage_from_damage_xmlchild,
      "damage<-xml": nx_tactics_books_bookloader.e_damage_from_xml,
      "file-read<-bookname": nx_tactics_books_bookloader.e_file_read_from_bookname,
      "file-write<-book": nx_tactics_books_bookloader.e_file_write_from_book,
      "item<-item-key-value": nx_tactics_books_bookloader.e_item_from_item_key_value,
      "item<-item-stringmap": nx_tactics_books_bookloader.e_item_from_item_stringmap,
      "item<-item-xmlchild": nx_tactics_books_bookloader.e_item_from_item_xmlchild,
      "item<-xml": nx_tactics_books_bookloader.e_item_from_xml,
      "location<-location-key-value": nx_tactics_books_bookloader.e_location_from_location_key_value,
      "location<-location-stringmap": nx_tactics_books_bookloader.e_location_from_location_stringmap,
      "location<-location-xmlchild": nx_tactics_books_bookloader.e_location_from_location_xmlchild,
      "location<-xml": nx_tactics_books_bookloader.e_location_from_xml,
      "modifier<-modifier-key-value": nx_tactics_books_bookloader.e_modifier_from_modifier_key_value,
      "modifier<-modifier-stringmap": nx_tactics_books_bookloader.e_modifier_from_modifier_stringmap,
      "modifier<-modifier-xmlchild": nx_tactics_books_bookloader.e_modifier_from_modifier_xmlchild,
      "modifier<-xml": nx_tactics_books_bookloader.e_modifier_from_xml,
      "power<-power-key-value": nx_tactics_books_bookloader.e_power_from_power_key_value,
      "power<-power-stringmap": nx_tactics_books_bookloader.e_power_from_power_stringmap,
      "power<-power-xmlability": nx_tactics_books_bookloader.e_power_from_power_xmlability,
      "power<-power-xmlchild": nx_tactics_books_bookloader.e_power_from_power_xmlchild,
      "power<-power-xmlspecialty": nx_tactics_books_bookloader.e_power_from_power_xmlspecialty,
      "power<-xml": nx_tactics_books_bookloader.e_power_from_xml,
      "rule<-rule-key-value": nx_tactics_books_bookloader.e_rule_from_rule_key_value,
      "rule<-rule-stringmap": nx_tactics_books_bookloader.e_rule_from_rule_stringmap,
      "rule<-rule-xmlchild": nx_tactics_books_bookloader.e_rule_from_rule_xmlchild,
      "rule<-xml": nx_tactics_books_bookloader.e_rule_from_xml,
      "scenario<-scenario-key-value": nx_tactics_books_bookloader.e_scenario_from_scenario_key_value,
      "scenario<-scenario-stringmap": nx_tactics_books_bookloader.e_scenario_from_scenario_stringmap,
      "scenario<-scenario-xmlchild": nx_tactics_books_bookloader.e_scenario_from_scenario_xmlchild,
      "scenario<-scenario-xmlteam": nx_tactics_books_bookloader.e_scenario_from_scenario_xmlteam,
      "scenario<-xml": nx_tactics_books_bookloader.e_scenario_from_xml,
      "section<-section-key-value": nx_tactics_books_bookloader.e_section_from_section_key_value,
      "section<-section-stringmap": nx_tactics_books_bookloader.e_section_from_section_stringmap,
      "section<-section-xmlchild": nx_tactics_books_bookloader.e_section_from_section_xmlchild,
      "section<-section-xmldamage": nx_tactics_books_bookloader.e_section_from_section_xmldamage,
      "section<-section-xmlitem": nx_tactics_books_bookloader.e_section_from_section_xmlitem,
      "section<-section-xmllocation": nx_tactics_books_bookloader.e_section_from_section_xmllocation,
      "section<-section-xmlmodifier": nx_tactics_books_bookloader.e_section_from_section_xmlmodifier,
      "section<-section-xmlpower": nx_tactics_books_bookloader.e_section_from_section_xmlpower,
      "section<-section-xmlrule": nx_tactics_books_bookloader.e_section_from_section_xmlrule,
      "section<-section-xmlscenario": nx_tactics_books_bookloader.e_section_from_section_xmlscenario,
      "section<-section-xmlsection": nx_tactics_books_bookloader.e_section_from_section_xmlsection,
      "section<-section-xmlskill": nx_tactics_books_bookloader.e_section_from_section_xmlskill,
      "section<-section-xmlterrain": nx_tactics_books_bookloader.e_section_from_section_xmlterrain,
      "section<-section-xmlunit": nx_tactics_books_bookloader.e_section_from_section_xmlunit,
      "section<-xml": nx_tactics_books_bookloader.e_section_from_xml,
      "skill<-skill-key-value": nx_tactics_books_bookloader.e_skill_from_skill_key_value,
      "skill<-skill-stringmap": nx_tactics_books_bookloader.e_skill_from_skill_stringmap,
      "skill<-skill-xmlability": nx_tactics_books_bookloader.e_skill_from_skill_xmlability,
      "skill<-skill-xmlchild": nx_tactics_books_bookloader.e_skill_from_skill_xmlchild,
      "skill<-skill-xmlspecialty": nx_tactics_books_bookloader.e_skill_from_skill_xmlspecialty,
      "skill<-xml": nx_tactics_books_bookloader.e_skill_from_xml,
      "specialty<-specialty-key-value": nx_tactics_books_bookloader.e_specialty_from_specialty_key_value,
      "specialty<-specialty-stringmap": nx_tactics_books_bookloader.e_specialty_from_specialty_stringmap,
      "specialty<-specialty-xmlchild": nx_tactics_books_bookloader.e_specialty_from_specialty_xmlchild,
      "specialty<-xml": nx_tactics_books_bookloader.e_specialty_from_xml,
      "string-read<-bookname": nx_tactics_books_bookloader.e_string_read_from_bookname,
      "string-vxlisp-header<-chaptermap": nx_tactics_books_bookloader.e_string_vxlisp_header_from_chaptermap,
      "string-vxlisp<-book": nx_tactics_books_bookloader.e_string_vxlisp_from_book,
      "string-vxlisp<-chapter": nx_tactics_books_bookloader.e_string_vxlisp_from_chapter,
      "string-vxlisp<-chaptermap": nx_tactics_books_bookloader.e_string_vxlisp_from_chaptermap,
      "string-writename<-string": nx_tactics_books_bookloader.e_string_writename_from_string,
      "team<-team-key-value": nx_tactics_books_bookloader.e_team_from_team_key_value,
      "team<-team-stringmap": nx_tactics_books_bookloader.e_team_from_team_stringmap,
      "team<-team-xmlchild": nx_tactics_books_bookloader.e_team_from_team_xmlchild,
      "team<-xml": nx_tactics_books_bookloader.e_team_from_xml,
      "terrain<-terrain-key-value": nx_tactics_books_bookloader.e_terrain_from_terrain_key_value,
      "terrain<-terrain-stringmap": nx_tactics_books_bookloader.e_terrain_from_terrain_stringmap,
      "terrain<-terrain-xmlchild": nx_tactics_books_bookloader.e_terrain_from_terrain_xmlchild,
      "terrain<-xml": nx_tactics_books_bookloader.e_terrain_from_xml,
      "unit<-unit-key-value": nx_tactics_books_bookloader.e_unit_from_unit_key_value,
      "unit<-unit-stringmap": nx_tactics_books_bookloader.e_unit_from_unit_stringmap,
      "unit<-unit-xmlchild": nx_tactics_books_bookloader.e_unit_from_unit_xmlchild,
      "unit<-unit-xmlpower": nx_tactics_books_bookloader.e_unit_from_unit_xmlpower,
      "unit<-unit-xmlskill": nx_tactics_books_bookloader.e_unit_from_unit_xmlskill,
      "unit<-unit-xmlweakness": nx_tactics_books_bookloader.e_unit_from_unit_xmlweakness,
      "unit<-xml": nx_tactics_books_bookloader.e_unit_from_xml,
      "unitability<-unitability-key-value": nx_tactics_books_bookloader.e_unitability_from_unitability_key_value,
      "unitability<-unitability-stringmap": nx_tactics_books_bookloader.e_unitability_from_unitability_stringmap,
      "unitability<-unitability-xmlchild": nx_tactics_books_bookloader.e_unitability_from_unitability_xmlchild,
      "unitability<-xml": nx_tactics_books_bookloader.e_unitability_from_xml,
      "unititem<-unititem-key-value": nx_tactics_books_bookloader.e_unititem_from_unititem_key_value,
      "unititem<-unititem-stringmap": nx_tactics_books_bookloader.e_unititem_from_unititem_stringmap,
      "unititem<-unititem-xmlchild": nx_tactics_books_bookloader.e_unititem_from_unititem_xmlchild,
      "unititem<-xml": nx_tactics_books_bookloader.e_unititem_from_xml,
      "unitpower<-unitpower-key-value": nx_tactics_books_bookloader.e_unitpower_from_unitpower_key_value,
      "unitpower<-unitpower-stringmap": nx_tactics_books_bookloader.e_unitpower_from_unitpower_stringmap,
      "unitpower<-unitpower-xmlability": nx_tactics_books_bookloader.e_unitpower_from_unitpower_xmlability,
      "unitpower<-unitpower-xmlchild": nx_tactics_books_bookloader.e_unitpower_from_unitpower_xmlchild,
      "unitpower<-unitpower-xmlitem": nx_tactics_books_bookloader.e_unitpower_from_unitpower_xmlitem,
      "unitpower<-unitpower-xmlspecialty": nx_tactics_books_bookloader.e_unitpower_from_unitpower_xmlspecialty,
      "unitpower<-xml": nx_tactics_books_bookloader.e_unitpower_from_xml,
      "unitskill<-unitskill-key-value": nx_tactics_books_bookloader.e_unitskill_from_unitskill_key_value,
      "unitskill<-unitskill-stringmap": nx_tactics_books_bookloader.e_unitskill_from_unitskill_stringmap,
      "unitskill<-unitskill-xmlability": nx_tactics_books_bookloader.e_unitskill_from_unitskill_xmlability,
      "unitskill<-unitskill-xmlchild": nx_tactics_books_bookloader.e_unitskill_from_unitskill_xmlchild,
      "unitskill<-unitskill-xmlitem": nx_tactics_books_bookloader.e_unitskill_from_unitskill_xmlitem,
      "unitskill<-unitskill-xmlspecialty": nx_tactics_books_bookloader.e_unitskill_from_unitskill_xmlspecialty,
      "unitskill<-xml": nx_tactics_books_bookloader.e_unitskill_from_xml,
      "unitspecialty<-unitspecialty-key-value": nx_tactics_books_bookloader.e_unitspecialty_from_unitspecialty_key_value,
      "unitspecialty<-unitspecialty-stringmap": nx_tactics_books_bookloader.e_unitspecialty_from_unitspecialty_stringmap,
      "unitspecialty<-unitspecialty-xmlchild": nx_tactics_books_bookloader.e_unitspecialty_from_unitspecialty_xmlchild,
      "unitspecialty<-xml": nx_tactics_books_bookloader.e_unitspecialty_from_xml,
      "unitweakness<-xml": nx_tactics_books_bookloader.e_unitweakness_from_xml,
      "weakness<-xml": nx_tactics_books_bookloader.e_weakness_from_xml,
      "xml-read<-bookname": nx_tactics_books_bookloader.e_xml_read_from_bookname
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "ability<-ability-key-value": nx_tactics_books_bookloader.t_ability_from_ability_key_value,
      "ability<-ability-stringmap": nx_tactics_books_bookloader.t_ability_from_ability_stringmap,
      "ability<-ability-xmlchild": nx_tactics_books_bookloader.t_ability_from_ability_xmlchild,
      "ability<-xml": nx_tactics_books_bookloader.t_ability_from_xml,
      "book-read<-bookname": nx_tactics_books_bookloader.t_book_read_from_bookname,
      "book<-book-key-value": nx_tactics_books_bookloader.t_book_from_book_key_value,
      "book<-book-stringmap": nx_tactics_books_bookloader.t_book_from_book_stringmap,
      "book<-book-xml": nx_tactics_books_bookloader.t_book_from_book_xml,
      "book<-book-xmlchapter": nx_tactics_books_bookloader.t_book_from_book_xmlchapter,
      "book<-book-xmlchild": nx_tactics_books_bookloader.t_book_from_book_xmlchild,
      "book<-xml": nx_tactics_books_bookloader.t_book_from_xml,
      "book<-xmldoc": nx_tactics_books_bookloader.t_book_from_xmldoc,
      "book<-xmllist": nx_tactics_books_bookloader.t_book_from_xmllist,
      "boolean-write<-book": nx_tactics_books_bookloader.t_boolean_write_from_book,
      "boolean-write<-booknames": nx_tactics_books_bookloader.t_boolean_write_from_booknames,
      "chapter<-chapter-key-value": nx_tactics_books_bookloader.t_chapter_from_chapter_key_value,
      "chapter<-chapter-stringmap": nx_tactics_books_bookloader.t_chapter_from_chapter_stringmap,
      "chapter<-chapter-xmlchild": nx_tactics_books_bookloader.t_chapter_from_chapter_xmlchild,
      "chapter<-chapter-xmlsection": nx_tactics_books_bookloader.t_chapter_from_chapter_xmlsection,
      "chapter<-xml": nx_tactics_books_bookloader.t_chapter_from_xml,
      "damage<-damage-key-value": nx_tactics_books_bookloader.t_damage_from_damage_key_value,
      "damage<-damage-stringmap": nx_tactics_books_bookloader.t_damage_from_damage_stringmap,
      "damage<-damage-xmlchild": nx_tactics_books_bookloader.t_damage_from_damage_xmlchild,
      "damage<-xml": nx_tactics_books_bookloader.t_damage_from_xml,
      "file-read<-bookname": nx_tactics_books_bookloader.t_file_read_from_bookname,
      "file-write<-book": nx_tactics_books_bookloader.t_file_write_from_book,
      "item<-item-key-value": nx_tactics_books_bookloader.t_item_from_item_key_value,
      "item<-item-stringmap": nx_tactics_books_bookloader.t_item_from_item_stringmap,
      "item<-item-xmlchild": nx_tactics_books_bookloader.t_item_from_item_xmlchild,
      "item<-xml": nx_tactics_books_bookloader.t_item_from_xml,
      "location<-location-key-value": nx_tactics_books_bookloader.t_location_from_location_key_value,
      "location<-location-stringmap": nx_tactics_books_bookloader.t_location_from_location_stringmap,
      "location<-location-xmlchild": nx_tactics_books_bookloader.t_location_from_location_xmlchild,
      "location<-xml": nx_tactics_books_bookloader.t_location_from_xml,
      "modifier<-modifier-key-value": nx_tactics_books_bookloader.t_modifier_from_modifier_key_value,
      "modifier<-modifier-stringmap": nx_tactics_books_bookloader.t_modifier_from_modifier_stringmap,
      "modifier<-modifier-xmlchild": nx_tactics_books_bookloader.t_modifier_from_modifier_xmlchild,
      "modifier<-xml": nx_tactics_books_bookloader.t_modifier_from_xml,
      "power<-power-key-value": nx_tactics_books_bookloader.t_power_from_power_key_value,
      "power<-power-stringmap": nx_tactics_books_bookloader.t_power_from_power_stringmap,
      "power<-power-xmlability": nx_tactics_books_bookloader.t_power_from_power_xmlability,
      "power<-power-xmlchild": nx_tactics_books_bookloader.t_power_from_power_xmlchild,
      "power<-power-xmlspecialty": nx_tactics_books_bookloader.t_power_from_power_xmlspecialty,
      "power<-xml": nx_tactics_books_bookloader.t_power_from_xml,
      "rule<-rule-key-value": nx_tactics_books_bookloader.t_rule_from_rule_key_value,
      "rule<-rule-stringmap": nx_tactics_books_bookloader.t_rule_from_rule_stringmap,
      "rule<-rule-xmlchild": nx_tactics_books_bookloader.t_rule_from_rule_xmlchild,
      "rule<-xml": nx_tactics_books_bookloader.t_rule_from_xml,
      "scenario<-scenario-key-value": nx_tactics_books_bookloader.t_scenario_from_scenario_key_value,
      "scenario<-scenario-stringmap": nx_tactics_books_bookloader.t_scenario_from_scenario_stringmap,
      "scenario<-scenario-xmlchild": nx_tactics_books_bookloader.t_scenario_from_scenario_xmlchild,
      "scenario<-scenario-xmlteam": nx_tactics_books_bookloader.t_scenario_from_scenario_xmlteam,
      "scenario<-xml": nx_tactics_books_bookloader.t_scenario_from_xml,
      "section<-section-key-value": nx_tactics_books_bookloader.t_section_from_section_key_value,
      "section<-section-stringmap": nx_tactics_books_bookloader.t_section_from_section_stringmap,
      "section<-section-xmlchild": nx_tactics_books_bookloader.t_section_from_section_xmlchild,
      "section<-section-xmldamage": nx_tactics_books_bookloader.t_section_from_section_xmldamage,
      "section<-section-xmlitem": nx_tactics_books_bookloader.t_section_from_section_xmlitem,
      "section<-section-xmllocation": nx_tactics_books_bookloader.t_section_from_section_xmllocation,
      "section<-section-xmlmodifier": nx_tactics_books_bookloader.t_section_from_section_xmlmodifier,
      "section<-section-xmlpower": nx_tactics_books_bookloader.t_section_from_section_xmlpower,
      "section<-section-xmlrule": nx_tactics_books_bookloader.t_section_from_section_xmlrule,
      "section<-section-xmlscenario": nx_tactics_books_bookloader.t_section_from_section_xmlscenario,
      "section<-section-xmlsection": nx_tactics_books_bookloader.t_section_from_section_xmlsection,
      "section<-section-xmlskill": nx_tactics_books_bookloader.t_section_from_section_xmlskill,
      "section<-section-xmlterrain": nx_tactics_books_bookloader.t_section_from_section_xmlterrain,
      "section<-section-xmlunit": nx_tactics_books_bookloader.t_section_from_section_xmlunit,
      "section<-xml": nx_tactics_books_bookloader.t_section_from_xml,
      "skill<-skill-key-value": nx_tactics_books_bookloader.t_skill_from_skill_key_value,
      "skill<-skill-stringmap": nx_tactics_books_bookloader.t_skill_from_skill_stringmap,
      "skill<-skill-xmlability": nx_tactics_books_bookloader.t_skill_from_skill_xmlability,
      "skill<-skill-xmlchild": nx_tactics_books_bookloader.t_skill_from_skill_xmlchild,
      "skill<-skill-xmlspecialty": nx_tactics_books_bookloader.t_skill_from_skill_xmlspecialty,
      "skill<-xml": nx_tactics_books_bookloader.t_skill_from_xml,
      "specialty<-specialty-key-value": nx_tactics_books_bookloader.t_specialty_from_specialty_key_value,
      "specialty<-specialty-stringmap": nx_tactics_books_bookloader.t_specialty_from_specialty_stringmap,
      "specialty<-specialty-xmlchild": nx_tactics_books_bookloader.t_specialty_from_specialty_xmlchild,
      "specialty<-xml": nx_tactics_books_bookloader.t_specialty_from_xml,
      "string-read<-bookname": nx_tactics_books_bookloader.t_string_read_from_bookname,
      "string-vxlisp-header<-chaptermap": nx_tactics_books_bookloader.t_string_vxlisp_header_from_chaptermap,
      "string-vxlisp<-book": nx_tactics_books_bookloader.t_string_vxlisp_from_book,
      "string-vxlisp<-chapter": nx_tactics_books_bookloader.t_string_vxlisp_from_chapter,
      "string-vxlisp<-chaptermap": nx_tactics_books_bookloader.t_string_vxlisp_from_chaptermap,
      "string-writename<-string": nx_tactics_books_bookloader.t_string_writename_from_string,
      "team<-team-key-value": nx_tactics_books_bookloader.t_team_from_team_key_value,
      "team<-team-stringmap": nx_tactics_books_bookloader.t_team_from_team_stringmap,
      "team<-team-xmlchild": nx_tactics_books_bookloader.t_team_from_team_xmlchild,
      "team<-xml": nx_tactics_books_bookloader.t_team_from_xml,
      "terrain<-terrain-key-value": nx_tactics_books_bookloader.t_terrain_from_terrain_key_value,
      "terrain<-terrain-stringmap": nx_tactics_books_bookloader.t_terrain_from_terrain_stringmap,
      "terrain<-terrain-xmlchild": nx_tactics_books_bookloader.t_terrain_from_terrain_xmlchild,
      "terrain<-xml": nx_tactics_books_bookloader.t_terrain_from_xml,
      "unit<-unit-key-value": nx_tactics_books_bookloader.t_unit_from_unit_key_value,
      "unit<-unit-stringmap": nx_tactics_books_bookloader.t_unit_from_unit_stringmap,
      "unit<-unit-xmlchild": nx_tactics_books_bookloader.t_unit_from_unit_xmlchild,
      "unit<-unit-xmlpower": nx_tactics_books_bookloader.t_unit_from_unit_xmlpower,
      "unit<-unit-xmlskill": nx_tactics_books_bookloader.t_unit_from_unit_xmlskill,
      "unit<-unit-xmlweakness": nx_tactics_books_bookloader.t_unit_from_unit_xmlweakness,
      "unit<-xml": nx_tactics_books_bookloader.t_unit_from_xml,
      "unitability<-unitability-key-value": nx_tactics_books_bookloader.t_unitability_from_unitability_key_value,
      "unitability<-unitability-stringmap": nx_tactics_books_bookloader.t_unitability_from_unitability_stringmap,
      "unitability<-unitability-xmlchild": nx_tactics_books_bookloader.t_unitability_from_unitability_xmlchild,
      "unitability<-xml": nx_tactics_books_bookloader.t_unitability_from_xml,
      "unititem<-unititem-key-value": nx_tactics_books_bookloader.t_unititem_from_unititem_key_value,
      "unititem<-unititem-stringmap": nx_tactics_books_bookloader.t_unititem_from_unititem_stringmap,
      "unititem<-unititem-xmlchild": nx_tactics_books_bookloader.t_unititem_from_unititem_xmlchild,
      "unititem<-xml": nx_tactics_books_bookloader.t_unititem_from_xml,
      "unitpower<-unitpower-key-value": nx_tactics_books_bookloader.t_unitpower_from_unitpower_key_value,
      "unitpower<-unitpower-stringmap": nx_tactics_books_bookloader.t_unitpower_from_unitpower_stringmap,
      "unitpower<-unitpower-xmlability": nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlability,
      "unitpower<-unitpower-xmlchild": nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlchild,
      "unitpower<-unitpower-xmlitem": nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlitem,
      "unitpower<-unitpower-xmlspecialty": nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlspecialty,
      "unitpower<-xml": nx_tactics_books_bookloader.t_unitpower_from_xml,
      "unitskill<-unitskill-key-value": nx_tactics_books_bookloader.t_unitskill_from_unitskill_key_value,
      "unitskill<-unitskill-stringmap": nx_tactics_books_bookloader.t_unitskill_from_unitskill_stringmap,
      "unitskill<-unitskill-xmlability": nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlability,
      "unitskill<-unitskill-xmlchild": nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild,
      "unitskill<-unitskill-xmlitem": nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlitem,
      "unitskill<-unitskill-xmlspecialty": nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlspecialty,
      "unitskill<-xml": nx_tactics_books_bookloader.t_unitskill_from_xml,
      "unitspecialty<-unitspecialty-key-value": nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_key_value,
      "unitspecialty<-unitspecialty-stringmap": nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_stringmap,
      "unitspecialty<-unitspecialty-xmlchild": nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_xmlchild,
      "unitspecialty<-xml": nx_tactics_books_bookloader.t_unitspecialty_from_xml,
      "unitweakness<-xml": nx_tactics_books_bookloader.t_unitweakness_from_xml,
      "weakness<-xml": nx_tactics_books_bookloader.t_weakness_from_xml,
      "xml-read<-bookname": nx_tactics_books_bookloader.t_xml_read_from_bookname
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/books/bookloader",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func ability<-ability-key-value)
    nx_tactics_books_bookloader.t_ability_from_ability_key_value['vx_value'] = {
      name          : "ability<-ability-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_ability_from_ability_key_value
    }

    // (func ability<-ability-stringmap)
    nx_tactics_books_bookloader.t_ability_from_ability_stringmap['vx_value'] = {
      name          : "ability<-ability-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_ability_from_ability_stringmap
    }

    // (func ability<-ability-xmlchild)
    nx_tactics_books_bookloader.t_ability_from_ability_xmlchild['vx_value'] = {
      name          : "ability<-ability-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_ability_from_ability_xmlchild
    }

    // (func ability<-xml)
    nx_tactics_books_bookloader.t_ability_from_xml['vx_value'] = {
      name          : "ability<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_ability_from_xml
    }

    // (func book-read<-bookname)
    nx_tactics_books_bookloader.t_book_read_from_bookname['vx_value'] = {
      name          : "book-read<-bookname",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_read_from_bookname
    }

    // (func book<-book-key-value)
    nx_tactics_books_bookloader.t_book_from_book_key_value['vx_value'] = {
      name          : "book<-book-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_book_key_value
    }

    // (func book<-book-stringmap)
    nx_tactics_books_bookloader.t_book_from_book_stringmap['vx_value'] = {
      name          : "book<-book-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_book_stringmap
    }

    // (func book<-book-xml)
    nx_tactics_books_bookloader.t_book_from_book_xml['vx_value'] = {
      name          : "book<-book-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_book_xml
    }

    // (func book<-book-xmlchapter)
    nx_tactics_books_bookloader.t_book_from_book_xmlchapter['vx_value'] = {
      name          : "book<-book-xmlchapter",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_book_xmlchapter
    }

    // (func book<-book-xmlchild)
    nx_tactics_books_bookloader.t_book_from_book_xmlchild['vx_value'] = {
      name          : "book<-book-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_book_xmlchild
    }

    // (func book<-xml)
    nx_tactics_books_bookloader.t_book_from_xml['vx_value'] = {
      name          : "book<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_xml
    }

    // (func book<-xmldoc)
    nx_tactics_books_bookloader.t_book_from_xmldoc['vx_value'] = {
      name          : "book<-xmldoc",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_xmldoc
    }

    // (func book<-xmllist)
    nx_tactics_books_bookloader.t_book_from_xmllist['vx_value'] = {
      name          : "book<-xmllist",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_book_from_xmllist
    }

    // (func boolean-write<-book)
    nx_tactics_books_bookloader.t_boolean_write_from_book['vx_value'] = {
      name          : "boolean-write<-book",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_boolean_write_from_book
    }

    // (func boolean-write<-booknames)
    nx_tactics_books_bookloader.t_boolean_write_from_booknames['vx_value'] = {
      name          : "boolean-write<-booknames",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_boolean_write_from_booknames
    }

    // (func chapter<-chapter-key-value)
    nx_tactics_books_bookloader.t_chapter_from_chapter_key_value['vx_value'] = {
      name          : "chapter<-chapter-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_chapter_from_chapter_key_value
    }

    // (func chapter<-chapter-stringmap)
    nx_tactics_books_bookloader.t_chapter_from_chapter_stringmap['vx_value'] = {
      name          : "chapter<-chapter-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_chapter_from_chapter_stringmap
    }

    // (func chapter<-chapter-xmlchild)
    nx_tactics_books_bookloader.t_chapter_from_chapter_xmlchild['vx_value'] = {
      name          : "chapter<-chapter-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_chapter_from_chapter_xmlchild
    }

    // (func chapter<-chapter-xmlsection)
    nx_tactics_books_bookloader.t_chapter_from_chapter_xmlsection['vx_value'] = {
      name          : "chapter<-chapter-xmlsection",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_chapter_from_chapter_xmlsection
    }

    // (func chapter<-xml)
    nx_tactics_books_bookloader.t_chapter_from_xml['vx_value'] = {
      name          : "chapter<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_chapter_from_xml
    }

    // (func damage<-damage-key-value)
    nx_tactics_books_bookloader.t_damage_from_damage_key_value['vx_value'] = {
      name          : "damage<-damage-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_damage_from_damage_key_value
    }

    // (func damage<-damage-stringmap)
    nx_tactics_books_bookloader.t_damage_from_damage_stringmap['vx_value'] = {
      name          : "damage<-damage-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_damage_from_damage_stringmap
    }

    // (func damage<-damage-xmlchild)
    nx_tactics_books_bookloader.t_damage_from_damage_xmlchild['vx_value'] = {
      name          : "damage<-damage-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_damage_from_damage_xmlchild
    }

    // (func damage<-xml)
    nx_tactics_books_bookloader.t_damage_from_xml['vx_value'] = {
      name          : "damage<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_damage_from_xml
    }

    // (func file-read<-bookname)
    nx_tactics_books_bookloader.t_file_read_from_bookname['vx_value'] = {
      name          : "file-read<-bookname",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_file_read_from_bookname
    }

    // (func file-write<-book)
    nx_tactics_books_bookloader.t_file_write_from_book['vx_value'] = {
      name          : "file-write<-book",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_file_write_from_book
    }

    // (func item<-item-key-value)
    nx_tactics_books_bookloader.t_item_from_item_key_value['vx_value'] = {
      name          : "item<-item-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_item_from_item_key_value
    }

    // (func item<-item-stringmap)
    nx_tactics_books_bookloader.t_item_from_item_stringmap['vx_value'] = {
      name          : "item<-item-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_item_from_item_stringmap
    }

    // (func item<-item-xmlchild)
    nx_tactics_books_bookloader.t_item_from_item_xmlchild['vx_value'] = {
      name          : "item<-item-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_item_from_item_xmlchild
    }

    // (func item<-xml)
    nx_tactics_books_bookloader.t_item_from_xml['vx_value'] = {
      name          : "item<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_item_from_xml
    }

    // (func location<-location-key-value)
    nx_tactics_books_bookloader.t_location_from_location_key_value['vx_value'] = {
      name          : "location<-location-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_location_from_location_key_value
    }

    // (func location<-location-stringmap)
    nx_tactics_books_bookloader.t_location_from_location_stringmap['vx_value'] = {
      name          : "location<-location-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_location_from_location_stringmap
    }

    // (func location<-location-xmlchild)
    nx_tactics_books_bookloader.t_location_from_location_xmlchild['vx_value'] = {
      name          : "location<-location-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_location_from_location_xmlchild
    }

    // (func location<-xml)
    nx_tactics_books_bookloader.t_location_from_xml['vx_value'] = {
      name          : "location<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_location_from_xml
    }

    // (func modifier<-modifier-key-value)
    nx_tactics_books_bookloader.t_modifier_from_modifier_key_value['vx_value'] = {
      name          : "modifier<-modifier-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_modifier_from_modifier_key_value
    }

    // (func modifier<-modifier-stringmap)
    nx_tactics_books_bookloader.t_modifier_from_modifier_stringmap['vx_value'] = {
      name          : "modifier<-modifier-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_modifier_from_modifier_stringmap
    }

    // (func modifier<-modifier-xmlchild)
    nx_tactics_books_bookloader.t_modifier_from_modifier_xmlchild['vx_value'] = {
      name          : "modifier<-modifier-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_modifier_from_modifier_xmlchild
    }

    // (func modifier<-xml)
    nx_tactics_books_bookloader.t_modifier_from_xml['vx_value'] = {
      name          : "modifier<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_modifier_from_xml
    }

    // (func power<-power-key-value)
    nx_tactics_books_bookloader.t_power_from_power_key_value['vx_value'] = {
      name          : "power<-power-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_power_from_power_key_value
    }

    // (func power<-power-stringmap)
    nx_tactics_books_bookloader.t_power_from_power_stringmap['vx_value'] = {
      name          : "power<-power-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_power_from_power_stringmap
    }

    // (func power<-power-xmlability)
    nx_tactics_books_bookloader.t_power_from_power_xmlability['vx_value'] = {
      name          : "power<-power-xmlability",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_power_from_power_xmlability
    }

    // (func power<-power-xmlchild)
    nx_tactics_books_bookloader.t_power_from_power_xmlchild['vx_value'] = {
      name          : "power<-power-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_power_from_power_xmlchild
    }

    // (func power<-power-xmlspecialty)
    nx_tactics_books_bookloader.t_power_from_power_xmlspecialty['vx_value'] = {
      name          : "power<-power-xmlspecialty",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_power_from_power_xmlspecialty
    }

    // (func power<-xml)
    nx_tactics_books_bookloader.t_power_from_xml['vx_value'] = {
      name          : "power<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_power_from_xml
    }

    // (func rule<-rule-key-value)
    nx_tactics_books_bookloader.t_rule_from_rule_key_value['vx_value'] = {
      name          : "rule<-rule-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_rule_from_rule_key_value
    }

    // (func rule<-rule-stringmap)
    nx_tactics_books_bookloader.t_rule_from_rule_stringmap['vx_value'] = {
      name          : "rule<-rule-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_rule_from_rule_stringmap
    }

    // (func rule<-rule-xmlchild)
    nx_tactics_books_bookloader.t_rule_from_rule_xmlchild['vx_value'] = {
      name          : "rule<-rule-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_rule_from_rule_xmlchild
    }

    // (func rule<-xml)
    nx_tactics_books_bookloader.t_rule_from_xml['vx_value'] = {
      name          : "rule<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_rule_from_xml
    }

    // (func scenario<-scenario-key-value)
    nx_tactics_books_bookloader.t_scenario_from_scenario_key_value['vx_value'] = {
      name          : "scenario<-scenario-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_scenario_from_scenario_key_value
    }

    // (func scenario<-scenario-stringmap)
    nx_tactics_books_bookloader.t_scenario_from_scenario_stringmap['vx_value'] = {
      name          : "scenario<-scenario-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_scenario_from_scenario_stringmap
    }

    // (func scenario<-scenario-xmlchild)
    nx_tactics_books_bookloader.t_scenario_from_scenario_xmlchild['vx_value'] = {
      name          : "scenario<-scenario-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_scenario_from_scenario_xmlchild
    }

    // (func scenario<-scenario-xmlteam)
    nx_tactics_books_bookloader.t_scenario_from_scenario_xmlteam['vx_value'] = {
      name          : "scenario<-scenario-xmlteam",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_scenario_from_scenario_xmlteam
    }

    // (func scenario<-xml)
    nx_tactics_books_bookloader.t_scenario_from_xml['vx_value'] = {
      name          : "scenario<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_scenario_from_xml
    }

    // (func section<-section-key-value)
    nx_tactics_books_bookloader.t_section_from_section_key_value['vx_value'] = {
      name          : "section<-section-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_key_value
    }

    // (func section<-section-stringmap)
    nx_tactics_books_bookloader.t_section_from_section_stringmap['vx_value'] = {
      name          : "section<-section-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_stringmap
    }

    // (func section<-section-xmlchild)
    nx_tactics_books_bookloader.t_section_from_section_xmlchild['vx_value'] = {
      name          : "section<-section-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlchild
    }

    // (func section<-section-xmldamage)
    nx_tactics_books_bookloader.t_section_from_section_xmldamage['vx_value'] = {
      name          : "section<-section-xmldamage",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmldamage
    }

    // (func section<-section-xmlitem)
    nx_tactics_books_bookloader.t_section_from_section_xmlitem['vx_value'] = {
      name          : "section<-section-xmlitem",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlitem
    }

    // (func section<-section-xmllocation)
    nx_tactics_books_bookloader.t_section_from_section_xmllocation['vx_value'] = {
      name          : "section<-section-xmllocation",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmllocation
    }

    // (func section<-section-xmlmodifier)
    nx_tactics_books_bookloader.t_section_from_section_xmlmodifier['vx_value'] = {
      name          : "section<-section-xmlmodifier",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlmodifier
    }

    // (func section<-section-xmlpower)
    nx_tactics_books_bookloader.t_section_from_section_xmlpower['vx_value'] = {
      name          : "section<-section-xmlpower",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlpower
    }

    // (func section<-section-xmlrule)
    nx_tactics_books_bookloader.t_section_from_section_xmlrule['vx_value'] = {
      name          : "section<-section-xmlrule",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlrule
    }

    // (func section<-section-xmlscenario)
    nx_tactics_books_bookloader.t_section_from_section_xmlscenario['vx_value'] = {
      name          : "section<-section-xmlscenario",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlscenario
    }

    // (func section<-section-xmlsection)
    nx_tactics_books_bookloader.t_section_from_section_xmlsection['vx_value'] = {
      name          : "section<-section-xmlsection",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlsection
    }

    // (func section<-section-xmlskill)
    nx_tactics_books_bookloader.t_section_from_section_xmlskill['vx_value'] = {
      name          : "section<-section-xmlskill",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlskill
    }

    // (func section<-section-xmlterrain)
    nx_tactics_books_bookloader.t_section_from_section_xmlterrain['vx_value'] = {
      name          : "section<-section-xmlterrain",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlterrain
    }

    // (func section<-section-xmlunit)
    nx_tactics_books_bookloader.t_section_from_section_xmlunit['vx_value'] = {
      name          : "section<-section-xmlunit",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_section_xmlunit
    }

    // (func section<-xml)
    nx_tactics_books_bookloader.t_section_from_xml['vx_value'] = {
      name          : "section<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_section_from_xml
    }

    // (func skill<-skill-key-value)
    nx_tactics_books_bookloader.t_skill_from_skill_key_value['vx_value'] = {
      name          : "skill<-skill-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_skill_from_skill_key_value
    }

    // (func skill<-skill-stringmap)
    nx_tactics_books_bookloader.t_skill_from_skill_stringmap['vx_value'] = {
      name          : "skill<-skill-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_skill_from_skill_stringmap
    }

    // (func skill<-skill-xmlability)
    nx_tactics_books_bookloader.t_skill_from_skill_xmlability['vx_value'] = {
      name          : "skill<-skill-xmlability",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_skill_from_skill_xmlability
    }

    // (func skill<-skill-xmlchild)
    nx_tactics_books_bookloader.t_skill_from_skill_xmlchild['vx_value'] = {
      name          : "skill<-skill-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_skill_from_skill_xmlchild
    }

    // (func skill<-skill-xmlspecialty)
    nx_tactics_books_bookloader.t_skill_from_skill_xmlspecialty['vx_value'] = {
      name          : "skill<-skill-xmlspecialty",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_skill_from_skill_xmlspecialty
    }

    // (func skill<-xml)
    nx_tactics_books_bookloader.t_skill_from_xml['vx_value'] = {
      name          : "skill<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_skill_from_xml
    }

    // (func specialty<-specialty-key-value)
    nx_tactics_books_bookloader.t_specialty_from_specialty_key_value['vx_value'] = {
      name          : "specialty<-specialty-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_specialty_from_specialty_key_value
    }

    // (func specialty<-specialty-stringmap)
    nx_tactics_books_bookloader.t_specialty_from_specialty_stringmap['vx_value'] = {
      name          : "specialty<-specialty-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_specialty_from_specialty_stringmap
    }

    // (func specialty<-specialty-xmlchild)
    nx_tactics_books_bookloader.t_specialty_from_specialty_xmlchild['vx_value'] = {
      name          : "specialty<-specialty-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_specialty_from_specialty_xmlchild
    }

    // (func specialty<-xml)
    nx_tactics_books_bookloader.t_specialty_from_xml['vx_value'] = {
      name          : "specialty<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_specialty_from_xml
    }

    // (func string-read<-bookname)
    nx_tactics_books_bookloader.t_string_read_from_bookname['vx_value'] = {
      name          : "string-read<-bookname",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_string_read_from_bookname
    }

    // (func string-vxlisp-header<-chaptermap)
    nx_tactics_books_bookloader.t_string_vxlisp_header_from_chaptermap['vx_value'] = {
      name          : "string-vxlisp-header<-chaptermap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_string_vxlisp_header_from_chaptermap
    }

    // (func string-vxlisp<-book)
    nx_tactics_books_bookloader.t_string_vxlisp_from_book['vx_value'] = {
      name          : "string-vxlisp<-book",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_string_vxlisp_from_book
    }

    // (func string-vxlisp<-chapter)
    nx_tactics_books_bookloader.t_string_vxlisp_from_chapter['vx_value'] = {
      name          : "string-vxlisp<-chapter",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_string_vxlisp_from_chapter
    }

    // (func string-vxlisp<-chaptermap)
    nx_tactics_books_bookloader.t_string_vxlisp_from_chaptermap['vx_value'] = {
      name          : "string-vxlisp<-chaptermap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_string_vxlisp_from_chaptermap
    }

    // (func string-writename<-string)
    nx_tactics_books_bookloader.t_string_writename_from_string['vx_value'] = {
      name          : "string-writename<-string",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_string_writename_from_string
    }

    // (func team<-team-key-value)
    nx_tactics_books_bookloader.t_team_from_team_key_value['vx_value'] = {
      name          : "team<-team-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_team_from_team_key_value
    }

    // (func team<-team-stringmap)
    nx_tactics_books_bookloader.t_team_from_team_stringmap['vx_value'] = {
      name          : "team<-team-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_team_from_team_stringmap
    }

    // (func team<-team-xmlchild)
    nx_tactics_books_bookloader.t_team_from_team_xmlchild['vx_value'] = {
      name          : "team<-team-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_team_from_team_xmlchild
    }

    // (func team<-xml)
    nx_tactics_books_bookloader.t_team_from_xml['vx_value'] = {
      name          : "team<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_team_from_xml
    }

    // (func terrain<-terrain-key-value)
    nx_tactics_books_bookloader.t_terrain_from_terrain_key_value['vx_value'] = {
      name          : "terrain<-terrain-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_terrain_from_terrain_key_value
    }

    // (func terrain<-terrain-stringmap)
    nx_tactics_books_bookloader.t_terrain_from_terrain_stringmap['vx_value'] = {
      name          : "terrain<-terrain-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_terrain_from_terrain_stringmap
    }

    // (func terrain<-terrain-xmlchild)
    nx_tactics_books_bookloader.t_terrain_from_terrain_xmlchild['vx_value'] = {
      name          : "terrain<-terrain-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_terrain_from_terrain_xmlchild
    }

    // (func terrain<-xml)
    nx_tactics_books_bookloader.t_terrain_from_xml['vx_value'] = {
      name          : "terrain<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_terrain_from_xml
    }

    // (func unit<-unit-key-value)
    nx_tactics_books_bookloader.t_unit_from_unit_key_value['vx_value'] = {
      name          : "unit<-unit-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unit_from_unit_key_value
    }

    // (func unit<-unit-stringmap)
    nx_tactics_books_bookloader.t_unit_from_unit_stringmap['vx_value'] = {
      name          : "unit<-unit-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unit_from_unit_stringmap
    }

    // (func unit<-unit-xmlchild)
    nx_tactics_books_bookloader.t_unit_from_unit_xmlchild['vx_value'] = {
      name          : "unit<-unit-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unit_from_unit_xmlchild
    }

    // (func unit<-unit-xmlpower)
    nx_tactics_books_bookloader.t_unit_from_unit_xmlpower['vx_value'] = {
      name          : "unit<-unit-xmlpower",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unit_from_unit_xmlpower
    }

    // (func unit<-unit-xmlskill)
    nx_tactics_books_bookloader.t_unit_from_unit_xmlskill['vx_value'] = {
      name          : "unit<-unit-xmlskill",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unit_from_unit_xmlskill
    }

    // (func unit<-unit-xmlweakness)
    nx_tactics_books_bookloader.t_unit_from_unit_xmlweakness['vx_value'] = {
      name          : "unit<-unit-xmlweakness",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unit_from_unit_xmlweakness
    }

    // (func unit<-xml)
    nx_tactics_books_bookloader.t_unit_from_xml['vx_value'] = {
      name          : "unit<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unit_from_xml
    }

    // (func unitability<-unitability-key-value)
    nx_tactics_books_bookloader.t_unitability_from_unitability_key_value['vx_value'] = {
      name          : "unitability<-unitability-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitability_from_unitability_key_value
    }

    // (func unitability<-unitability-stringmap)
    nx_tactics_books_bookloader.t_unitability_from_unitability_stringmap['vx_value'] = {
      name          : "unitability<-unitability-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitability_from_unitability_stringmap
    }

    // (func unitability<-unitability-xmlchild)
    nx_tactics_books_bookloader.t_unitability_from_unitability_xmlchild['vx_value'] = {
      name          : "unitability<-unitability-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitability_from_unitability_xmlchild
    }

    // (func unitability<-xml)
    nx_tactics_books_bookloader.t_unitability_from_xml['vx_value'] = {
      name          : "unitability<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitability_from_xml
    }

    // (func unititem<-unititem-key-value)
    nx_tactics_books_bookloader.t_unititem_from_unititem_key_value['vx_value'] = {
      name          : "unititem<-unititem-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unititem_from_unititem_key_value
    }

    // (func unititem<-unititem-stringmap)
    nx_tactics_books_bookloader.t_unititem_from_unititem_stringmap['vx_value'] = {
      name          : "unititem<-unititem-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unititem_from_unititem_stringmap
    }

    // (func unititem<-unititem-xmlchild)
    nx_tactics_books_bookloader.t_unititem_from_unititem_xmlchild['vx_value'] = {
      name          : "unititem<-unititem-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unititem_from_unititem_xmlchild
    }

    // (func unititem<-xml)
    nx_tactics_books_bookloader.t_unititem_from_xml['vx_value'] = {
      name          : "unititem<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unititem_from_xml
    }

    // (func unitpower<-unitpower-key-value)
    nx_tactics_books_bookloader.t_unitpower_from_unitpower_key_value['vx_value'] = {
      name          : "unitpower<-unitpower-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitpower_from_unitpower_key_value
    }

    // (func unitpower<-unitpower-stringmap)
    nx_tactics_books_bookloader.t_unitpower_from_unitpower_stringmap['vx_value'] = {
      name          : "unitpower<-unitpower-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitpower_from_unitpower_stringmap
    }

    // (func unitpower<-unitpower-xmlability)
    nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlability['vx_value'] = {
      name          : "unitpower<-unitpower-xmlability",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlability
    }

    // (func unitpower<-unitpower-xmlchild)
    nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlchild['vx_value'] = {
      name          : "unitpower<-unitpower-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlchild
    }

    // (func unitpower<-unitpower-xmlitem)
    nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlitem['vx_value'] = {
      name          : "unitpower<-unitpower-xmlitem",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlitem
    }

    // (func unitpower<-unitpower-xmlspecialty)
    nx_tactics_books_bookloader.t_unitpower_from_unitpower_xmlspecialty['vx_value'] = {
      name          : "unitpower<-unitpower-xmlspecialty",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitpower_from_unitpower_xmlspecialty
    }

    // (func unitpower<-xml)
    nx_tactics_books_bookloader.t_unitpower_from_xml['vx_value'] = {
      name          : "unitpower<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitpower_from_xml
    }

    // (func unitskill<-unitskill-key-value)
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_key_value['vx_value'] = {
      name          : "unitskill<-unitskill-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitskill_from_unitskill_key_value
    }

    // (func unitskill<-unitskill-stringmap)
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_stringmap['vx_value'] = {
      name          : "unitskill<-unitskill-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitskill_from_unitskill_stringmap
    }

    // (func unitskill<-unitskill-xmlability)
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlability['vx_value'] = {
      name          : "unitskill<-unitskill-xmlability",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlability
    }

    // (func unitskill<-unitskill-xmlchild)
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild['vx_value'] = {
      name          : "unitskill<-unitskill-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlchild
    }

    // (func unitskill<-unitskill-xmlitem)
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlitem['vx_value'] = {
      name          : "unitskill<-unitskill-xmlitem",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlitem
    }

    // (func unitskill<-unitskill-xmlspecialty)
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlspecialty['vx_value'] = {
      name          : "unitskill<-unitskill-xmlspecialty",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitskill_from_unitskill_xmlspecialty
    }

    // (func unitskill<-xml)
    nx_tactics_books_bookloader.t_unitskill_from_xml['vx_value'] = {
      name          : "unitskill<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitskill_from_xml
    }

    // (func unitspecialty<-unitspecialty-key-value)
    nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_key_value['vx_value'] = {
      name          : "unitspecialty<-unitspecialty-key-value",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitspecialty_from_unitspecialty_key_value
    }

    // (func unitspecialty<-unitspecialty-stringmap)
    nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_stringmap['vx_value'] = {
      name          : "unitspecialty<-unitspecialty-stringmap",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitspecialty_from_unitspecialty_stringmap
    }

    // (func unitspecialty<-unitspecialty-xmlchild)
    nx_tactics_books_bookloader.t_unitspecialty_from_unitspecialty_xmlchild['vx_value'] = {
      name          : "unitspecialty<-unitspecialty-xmlchild",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitspecialty_from_unitspecialty_xmlchild
    }

    // (func unitspecialty<-xml)
    nx_tactics_books_bookloader.t_unitspecialty_from_xml['vx_value'] = {
      name          : "unitspecialty<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitspecialty_from_xml
    }

    // (func unitweakness<-xml)
    nx_tactics_books_bookloader.t_unitweakness_from_xml['vx_value'] = {
      name          : "unitweakness<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_unitweakness_from_xml
    }

    // (func weakness<-xml)
    nx_tactics_books_bookloader.t_weakness_from_xml['vx_value'] = {
      name          : "weakness<-xml",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_weakness_from_xml
    }

    // (func xml-read<-bookname)
    nx_tactics_books_bookloader.t_xml_read_from_bookname['vx_value'] = {
      name          : "xml-read<-bookname",
      pkgname       : "nx/tactics/books/bookloader",
      extends       : ":func",
      idx           : 0,
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_books_bookloader.f_xml_read_from_bookname
    }

  }
}
