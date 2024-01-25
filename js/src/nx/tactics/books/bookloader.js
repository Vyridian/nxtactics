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
  static t_ability_from_ability_key_value = {}
  static e_ability_from_ability_key_value = {vx_type: nx_tactics_books_bookloader.t_ability_from_ability_key_value}

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
  static t_ability_from_ability_stringmap = {}
  static e_ability_from_ability_stringmap = {vx_type: nx_tactics_books_bookloader.t_ability_from_ability_stringmap}

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
   * @param  {ability} abl
   * @param  {xml} child
   * @return {ability}
   */
  static t_ability_from_ability_xmlchild = {}
  static e_ability_from_ability_xmlchild = {vx_type: nx_tactics_books_bookloader.t_ability_from_ability_xmlchild}

  // (func ability<-ability-xmlchild)
  static f_ability_from_ability_xmlchild(abl, child) {
    let output = nx_tactics_base.e_ability
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_ability, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return abl})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "reference",
          "summary",
          "titles"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          abl,
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
          vx_data_xml.f_string_first_from_xml(child)
        )})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          abl,
          vx_core.f_msg_from_error_1(
            ":invalidtagfound",
            vx_core.f_new(
              vx_core.t_anymap,
              ":type",
              nx_tactics_base.t_ability,
              ":tag",
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function ability_from_xml
   * Returns a ability from a given xml.
   * @param  {xml} xml
   * @return {ability}
   */
  static t_ability_from_xml = {}
  static e_ability_from_xml = {vx_type: nx_tactics_books_bookloader.t_ability_from_xml}

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
  static t_book_read_from_bookname = {}
  static e_book_read_from_bookname = {vx_type: nx_tactics_books_bookloader.t_book_read_from_bookname}

  // (func book-read<-bookname)
  static f_book_read_from_bookname(context, bookname) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_book},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const xml = nx_tactics_books_bookloader.f_xml_read_from_bookname(context, bookname)
        return nx_tactics_books_bookloader.f_book_from_xmltop(xml)
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
  static t_book_from_book_key_value = {}
  static e_book_from_book_key_value = {vx_type: nx_tactics_books_bookloader.t_book_from_book_key_value}

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
  static t_book_from_book_stringmap = {}
  static e_book_from_book_stringmap = {vx_type: nx_tactics_books_bookloader.t_book_from_book_stringmap}

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
  static t_book_from_book_xml = {}
  static e_book_from_book_xml = {vx_type: nx_tactics_books_bookloader.t_book_from_book_xml}

  // (func book<-book-xml)
  static f_book_from_book_xml(current, child) {
    let output = nx_tactics_base.e_book
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const tag = vx_core.f_log_1({"any-1": vx_core.t_string}, "vx/core/any<-struct", vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"))
        return vx_core.f_switch(
          {"any-1": nx_tactics_base.t_book, "any-2": vx_core.t_string},
          tag,
          vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
          vx_core.f_case_1("?xml", vx_core.f_new(vx_core.t_any_from_func, () => {return current})),
          vx_core.f_case_1(
            "doc",
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_if_2(
              {"any-1": nx_tactics_base.t_book},
              vx_core.f_then(
                vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_notempty_1(current)}),
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
              ),
              vx_core.f_else(
                vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_book_from_book_xmlchild(current, child)})
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
  static t_book_from_book_xmlchapter = {}
  static e_book_from_book_xmlchapter = {vx_type: nx_tactics_books_bookloader.t_book_from_book_xmlchapter}

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
        const chgmap = vx_core.f_copy(
          nx_tactics_base.t_chaptermap,
          name,
          chapter
        )
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
  static t_book_from_book_xmlchild = {}
  static e_book_from_book_xmlchild = {vx_type: nx_tactics_books_bookloader.t_book_from_book_xmlchild}

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
   * Returns a book from a given xml.
   * @param  {xml} xml
   * @return {book}
   */
  static t_book_from_xml = {}
  static e_book_from_xml = {vx_type: nx_tactics_books_bookloader.t_book_from_xml}

  // (func book<-xml)
  static f_book_from_xml(xml) {
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
  static t_book_from_xmllist = {}
  static e_book_from_xmllist = {vx_type: nx_tactics_books_bookloader.t_book_from_xmllist}

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
   * @function book_from_xmltop
   * Returns a book from a given top level xml.
   * @param  {xml} xmltop
   * @return {book}
   */
  static t_book_from_xmltop = {}
  static e_book_from_xmltop = {vx_type: nx_tactics_books_bookloader.t_book_from_xmltop}

  // (func book<-xmltop)
  static f_book_from_xmltop(xmltop) {
    let output = nx_tactics_base.e_book
    output = nx_tactics_books_bookloader.f_book_from_xmllist(
      vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xmltop, ":children")
    )
    return output
  }

  /**
   * @function boolean_write_from_book
   * Returns boolean after writing book as a file.
   * @param  {book} book
   * @return {boolean}
   */
  static t_boolean_write_from_book = {}
  static e_boolean_write_from_book = {vx_type: nx_tactics_books_bookloader.t_boolean_write_from_book}

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
  static t_boolean_write_from_booknames = {}
  static e_boolean_write_from_booknames = {vx_type: nx_tactics_books_bookloader.t_boolean_write_from_booknames}

  // (func boolean-write<-booknames)
  static f_boolean_write_from_booknames(context, booknames) {
    let output = vx_core.e_boolean
    output = vx_core.f_let(
      {"any-1": vx_core.t_boolean},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const bools = vx_core.f_list_from_list(
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
  static t_chapter_from_chapter_key_value = {}
  static e_chapter_from_chapter_key_value = {vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_key_value}

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
  static t_chapter_from_chapter_stringmap = {}
  static e_chapter_from_chapter_stringmap = {vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_stringmap}

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
  static t_chapter_from_chapter_xmlchild = {}
  static e_chapter_from_chapter_xmlchild = {vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_xmlchild}

  // (func chapter<-chapter-xmlchild)
  static f_chapter_from_chapter_xmlchild(chapter, child) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_chapter, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
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
  static t_chapter_from_chapter_xmlsection = {}
  static e_chapter_from_chapter_xmlsection = {vx_type: nx_tactics_books_bookloader.t_chapter_from_chapter_xmlsection}

  // (func chapter<-chapter-xmlsection)
  static f_chapter_from_chapter_xmlsection(chapter, xmlsection) {
    let output = nx_tactics_base.e_chapter
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_chapter},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const section = nx_tactics_books_bookloader.f_section_from_xml(xmlsection)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, section, ":name")
        const sectionmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_section}, section, ":sectionmap")
        const chgmap = vx_core.f_copy(sectionmap, name, section)
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
  static t_chapter_from_xml = {}
  static e_chapter_from_xml = {vx_type: nx_tactics_books_bookloader.t_chapter_from_xml}

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
   * @function file_read_from_bookname
   * Returns a file from a bookname.
   * @param  {string} bookname
   * @return {file}
   */
  static t_file_read_from_bookname = {}
  static e_file_read_from_bookname = {vx_type: nx_tactics_books_bookloader.t_file_read_from_bookname}

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
  static t_file_write_from_book = {}
  static e_file_write_from_book = {vx_type: nx_tactics_books_bookloader.t_file_write_from_book}

  // (func file-write<-book)
  static f_file_write_from_book(book) {
    let output = vx_data_file.e_file
    output = vx_core.f_let(
      {"any-1": vx_data_file.t_file},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const bookname = nx_tactics_books_bookloader.f_string_writename_from_book(book)
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
   * @function modifier_from_xml
   * @return {modifier}
   */
  static t_modifier_from_xml = {}
  static e_modifier_from_xml = {vx_type: nx_tactics_books_bookloader.t_modifier_from_xml}

  // (func modifier<-xml)
  static f_modifier_from_xml() {
    let output = nx_tactics_base.e_modifier
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
  static t_power_from_power_key_value = {}
  static e_power_from_power_key_value = {vx_type: nx_tactics_books_bookloader.t_power_from_power_key_value}

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
  static t_power_from_power_stringmap = {}
  static e_power_from_power_stringmap = {vx_type: nx_tactics_books_bookloader.t_power_from_power_stringmap}

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
   * @function power_from_power_xmlchild
   * Returns a modified power based on a given child xml.
   * @param  {power} power
   * @param  {xml} child
   * @return {power}
   */
  static t_power_from_power_xmlchild = {}
  static e_power_from_power_xmlchild = {vx_type: nx_tactics_books_bookloader.t_power_from_power_xmlchild}

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
   * @function power_from_xml
   * Returns a power from a given Xml.
   * @param  {xml} xml
   * @return {power}
   */
  static t_power_from_xml = {}
  static e_power_from_xml = {vx_type: nx_tactics_books_bookloader.t_power_from_xml}

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
  static t_rule_from_rule_key_value = {}
  static e_rule_from_rule_key_value = {vx_type: nx_tactics_books_bookloader.t_rule_from_rule_key_value}

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
          "image"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(current, ":name", value)})
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
  static t_rule_from_rule_stringmap = {}
  static e_rule_from_rule_stringmap = {vx_type: nx_tactics_books_bookloader.t_rule_from_rule_stringmap}

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
  static t_rule_from_rule_xmlchild = {}
  static e_rule_from_rule_xmlchild = {vx_type: nx_tactics_books_bookloader.t_rule_from_rule_xmlchild}

  // (func rule<-rule-xmlchild)
  static f_rule_from_rule_xmlchild(rule, child) {
    let output = nx_tactics_base.e_rule
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_rule, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
      vx_core.f_case_1("", vx_core.f_new(vx_core.t_any_from_func, () => {return rule})),
      vx_core.f_case(
        vx_core.f_new(
          vx_core.t_list,
          "reference",
          "summary",
          "titles"
        ),
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_copy(
          rule,
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function rule_from_xml
   * Returns a rule from a given xml.
   * @param  {xml} xml
   * @return {rule}
   */
  static t_rule_from_xml = {}
  static e_rule_from_xml = {vx_type: nx_tactics_books_bookloader.t_rule_from_xml}

  // (func rule<-xml)
  static f_rule_from_xml(xml) {
    let output = nx_tactics_base.e_rule
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_rule, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const rul = nx_tactics_books_bookloader.f_rule_from_rule_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_rule
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_rule, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          rul,
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
  static t_scenario_from_scenario_key_value = {}
  static e_scenario_from_scenario_key_value = {vx_type: nx_tactics_books_bookloader.t_scenario_from_scenario_key_value}

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
  static t_scenario_from_scenario_stringmap = {}
  static e_scenario_from_scenario_stringmap = {vx_type: nx_tactics_books_bookloader.t_scenario_from_scenario_stringmap}

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
  static t_scenario_from_scenario_xmlchild = {}
  static e_scenario_from_scenario_xmlchild = {vx_type: nx_tactics_books_bookloader.t_scenario_from_scenario_xmlchild}

  // (func scenario<-scenario-xmlchild)
  static f_scenario_from_scenario_xmlchild(scenario, child) {
    let output = nx_tactics_base.e_scenario
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_scenario, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
          vx_data_xml.f_string_first_from_xml(child)
        )})
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
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function scenario_from_xml
   * Returns a scenario from a given Xml.
   * @param  {xml} xml
   * @return {scenario}
   */
  static t_scenario_from_xml = {}
  static e_scenario_from_xml = {vx_type: nx_tactics_books_bookloader.t_scenario_from_xml}

  // (func scenario<-xml)
  static f_scenario_from_xml(xml) {
    let output = nx_tactics_base.e_scenario
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_scenario, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const scen = nx_tactics_books_bookloader.f_scenario_from_scenario_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_scenario
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_scenario, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          scen,
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
  static t_section_from_section_key_value = {}
  static e_section_from_section_key_value = {vx_type: nx_tactics_books_bookloader.t_section_from_section_key_value}

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
  static t_section_from_section_stringmap = {}
  static e_section_from_section_stringmap = {vx_type: nx_tactics_books_bookloader.t_section_from_section_stringmap}

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
  static t_section_from_section_xmlchild = {}
  static e_section_from_section_xmlchild = {vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlchild}

  // (func section<-section-xmlchild)
  static f_section_from_section_xmlchild(section, child) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_section, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
          vx_data_xml.f_string_first_from_xml(child)
        )})
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
        "section",
        vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlsection(section, child)})
      ),
      vx_core.f_case_1(
        "skill",
        vx_core.f_new(vx_core.t_any_from_func, () => {return nx_tactics_books_bookloader.f_section_from_section_xmlskill(section, child)})
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
              nx_tactics_base.t_chapter,
              ":tag",
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
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
  static t_section_from_section_xmlpower = {}
  static e_section_from_section_xmlpower = {vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlpower}

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
        const chgmap = vx_core.f_copy(
          origmap,
          name,
          nx_tactics_base.t_skill
        )
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
  static t_section_from_section_xmlrule = {}
  static e_section_from_section_xmlrule = {vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlrule}

  // (func section<-section-xmlrule)
  static f_section_from_section_xmlrule(section, xmlrule) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const rule = nx_tactics_books_bookloader.f_rule_from_xml(xmlrule)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_rule}, rule, ":name")
        const rulemap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_rulemap, "struct-2": nx_tactics_base.t_section}, section, ":rulemap")
        const chgmap = vx_core.f_copy(rulemap, name, rule)
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
  static t_section_from_section_xmlscenario = {}
  static e_section_from_section_xmlscenario = {vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlscenario}

  // (func section<-section-xmlscenario)
  static f_section_from_section_xmlscenario(section, xmlscenario) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const scenario = nx_tactics_books_bookloader.f_scenario_from_xml(xmlscenario)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_scenario}, scenario, ":name")
        const scenariomap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_scenariomap, "struct-2": nx_tactics_base.t_section}, section, ":scenariomap")
        const chgmap = vx_core.f_copy(scenariomap, name, scenario)
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
  static t_section_from_section_xmlsection = {}
  static e_section_from_section_xmlsection = {vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlsection}

  // (func section<-section-xmlsection)
  static f_section_from_section_xmlsection(section, xmlsection) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const subsect = nx_tactics_books_bookloader.f_section_from_xml(xmlsection)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_section}, subsect, ":name")
        const sectionmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_sectionmap, "struct-2": nx_tactics_base.t_section}, section, ":sectionmap")
        const chgmap = vx_core.f_copy(sectionmap, name, subsect)
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
  static t_section_from_section_xmlskill = {}
  static e_section_from_section_xmlskill = {vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlskill}

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
   * @function section_from_section_xmlunit
   * Return a section with new unit added to unitmap
   * @param  {section} section
   * @param  {xml} xmlunit
   * @return {section}
   */
  static t_section_from_section_xmlunit = {}
  static e_section_from_section_xmlunit = {vx_type: nx_tactics_books_bookloader.t_section_from_section_xmlunit}

  // (func section<-section-xmlunit)
  static f_section_from_section_xmlunit(section, xmlunit) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unit = nx_tactics_books_bookloader.f_unit_from_xml(xmlunit)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unit}, unit, ":name")
        const unitmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitmap, "struct-2": nx_tactics_base.t_section}, section, ":unitmap")
        const chgmap = vx_core.f_copy(unitmap, name, unit)
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
  static t_section_from_xml = {}
  static e_section_from_xml = {vx_type: nx_tactics_books_bookloader.t_section_from_xml}

  // (func section<-xml)
  static f_section_from_xml(xml) {
    let output = nx_tactics_base.e_section
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_section, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const sect = nx_tactics_books_bookloader.f_section_from_section_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_section
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_section, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          sect,
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
  static t_skill_from_skill_key_value = {}
  static e_skill_from_skill_key_value = {vx_type: nx_tactics_books_bookloader.t_skill_from_skill_key_value}

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
  static t_skill_from_skill_stringmap = {}
  static e_skill_from_skill_stringmap = {vx_type: nx_tactics_books_bookloader.t_skill_from_skill_stringmap}

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
  static t_skill_from_skill_xmlability = {}
  static e_skill_from_skill_xmlability = {vx_type: nx_tactics_books_bookloader.t_skill_from_skill_xmlability}

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
  static t_skill_from_skill_xmlchild = {}
  static e_skill_from_skill_xmlchild = {vx_type: nx_tactics_books_bookloader.t_skill_from_skill_xmlchild}

  // (func skill<-skill-xmlchild)
  static f_skill_from_skill_xmlchild(skill, child) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_skill, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
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
  static t_skill_from_skill_xmlspecialty = {}
  static e_skill_from_skill_xmlspecialty = {vx_type: nx_tactics_books_bookloader.t_skill_from_skill_xmlspecialty}

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
  static t_skill_from_xml = {}
  static e_skill_from_xml = {vx_type: nx_tactics_books_bookloader.t_skill_from_xml}

  // (func skill<-xml)
  static f_skill_from_xml(xml) {
    let output = nx_tactics_base.e_skill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_skill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const skl = nx_tactics_books_bookloader.f_skill_from_skill_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_skill
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_skill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          skl,
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
  static t_specialty_from_specialty_key_value = {}
  static e_specialty_from_specialty_key_value = {vx_type: nx_tactics_books_bookloader.t_specialty_from_specialty_key_value}

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
  static t_specialty_from_specialty_stringmap = {}
  static e_specialty_from_specialty_stringmap = {vx_type: nx_tactics_books_bookloader.t_specialty_from_specialty_stringmap}

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
  static t_specialty_from_specialty_xmlchild = {}
  static e_specialty_from_specialty_xmlchild = {vx_type: nx_tactics_books_bookloader.t_specialty_from_specialty_xmlchild}

  // (func specialty<-specialty-xmlchild)
  static f_specialty_from_specialty_xmlchild(specialty, child) {
    let output = nx_tactics_base.e_specialty
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_specialty, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function specialty_from_xml
   * Returns a specialty from a given xml.
   * @param  {xml} xml
   * @return {specialty}
   */
  static t_specialty_from_xml = {}
  static e_specialty_from_xml = {vx_type: nx_tactics_books_bookloader.t_specialty_from_xml}

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
  static t_string_read_from_bookname = {}
  static e_string_read_from_bookname = {vx_type: nx_tactics_books_bookloader.t_string_read_from_bookname}

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
   * @function string_vxlisp_from_book
   * Returns a vxlisp string from a book.
   * @param  {book} book
   * @return {string}
   */
  static t_string_vxlisp_from_book = {}
  static e_string_vxlisp_from_book = {vx_type: nx_tactics_books_bookloader.t_string_vxlisp_from_book}

  // (func string-vxlisp<-book)
  static f_string_vxlisp_from_book(book) {
    let output = vx_core.e_string
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const name = nx_tactics_books_bookloader.f_string_writename_from_book(book)
        const text = vx_core.f_string_from_any_indent(
          book,
          1,
          false
        )
        return vx_core.f_new(
          vx_core.t_string,
          "(package nx/tactics/books/",
          name,
          "\n :libs (lib base :path nx/tactics/base))\n\n(func tacticsbook : base/book\n ",
          text,
          ")\n"
        )
      })
    )
    return output
  }

  /**
   * @function string_writename_from_book
   * Returns the write filename from a book
   * @param  {book} book
   * @return {string}
   */
  static t_string_writename_from_book = {}
  static e_string_writename_from_book = {vx_type: nx_tactics_books_bookloader.t_string_writename_from_book}

  // (func string-writename<-book)
  static f_string_writename_from_book(book) {
    let output = vx_core.e_string
    output = vx_core.f_string_from_string_find_replace(
      vx_type.f_string_lowercase(
        vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_book}, book, ":name")
      ),
      " ",
      "_"
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
  static t_unit_from_unit_key_value = {}
  static e_unit_from_unit_key_value = {vx_type: nx_tactics_books_bookloader.t_unit_from_unit_key_value}

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
          "body",
          "height",
          "length",
          "mass",
          "mind",
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
  static t_unit_from_unit_stringmap = {}
  static e_unit_from_unit_stringmap = {vx_type: nx_tactics_books_bookloader.t_unit_from_unit_stringmap}

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
  static t_unit_from_unit_xmlchild = {}
  static e_unit_from_unit_xmlchild = {vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlchild}

  // (func unit<-unit-xmlchild)
  static f_unit_from_unit_xmlchild(unit, child) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unit, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
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
  static t_unit_from_unit_xmlpower = {}
  static e_unit_from_unit_xmlpower = {vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlpower}

  // (func unit<-unit-xmlpower)
  static f_unit_from_unit_xmlpower(unit, xmlpower) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unitpower = nx_tactics_books_bookloader.f_unitpower_from_xml(xmlpower)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitpower}, unitpower, ":name")
        const unitpowermap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitpowermap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitpowermap")
        const chgmap = vx_core.f_copy(unitpowermap, name, unitpower)
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
  static t_unit_from_unit_xmlskill = {}
  static e_unit_from_unit_xmlskill = {vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlskill}

  // (func unit<-unit-xmlskill)
  static f_unit_from_unit_xmlskill(unit, xmlskill) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unitskill = nx_tactics_books_bookloader.f_unitskill_from_xml(xmlskill)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitskill}, unitskill, ":name")
        const unitskillmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitskillmap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitskillmap")
        const chgmap = vx_core.f_copy(unitskillmap, name, unitskill)
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
  static t_unit_from_unit_xmlweakness = {}
  static e_unit_from_unit_xmlweakness = {vx_type: nx_tactics_books_bookloader.t_unit_from_unit_xmlweakness}

  // (func unit<-unit-xmlweakness)
  static f_unit_from_unit_xmlweakness(unit, xmlweakness) {
    let output = nx_tactics_base.e_unit
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unit},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const unitweakness = nx_tactics_books_bookloader.f_unitweakness_from_xml(xmlweakness)
        const name = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": nx_tactics_base.t_unitweakness}, unitweakness, ":name")
        const unitweaknessmap = vx_core.f_any_from_struct({"any-1": nx_tactics_base.t_unitweaknessmap, "struct-2": nx_tactics_base.t_unit}, unit, ":unitweaknessmap")
        const chgmap = vx_core.f_copy(unitweaknessmap, name, unitweakness)
        return vx_core.f_copy(unit, ":unitweaknessmap", chgmap)
      })
    )
    return output
  }

  /**
   * @function unit_from_xml
   * Returns a unit from a given Xml.
   * @param  {xml} xml
   * @return {unit}
   */
  static t_unit_from_xml = {}
  static e_unit_from_xml = {vx_type: nx_tactics_books_bookloader.t_unit_from_xml}

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
   * @function unitpower_from_xml
   * @param  {xml} xml
   * @return {unitpower}
   */
  static t_unitpower_from_xml = {}
  static e_unitpower_from_xml = {vx_type: nx_tactics_books_bookloader.t_unitpower_from_xml}

  // (func unitpower<-xml)
  static f_unitpower_from_xml(xml) {
    let output = nx_tactics_base.e_unitpower
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
  static t_unitskill_from_unitskill_key_value = {}
  static e_unitskill_from_unitskill_key_value = {vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_key_value}

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
  static t_unitskill_from_unitskill_stringmap = {}
  static e_unitskill_from_unitskill_stringmap = {vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_stringmap}

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
   * @function unitskill_from_unitskill_xmlchild
   * @param  {unitskill} unitskill
   * @param  {xml} child
   * @return {unitskill}
   */
  static t_unitskill_from_unitskill_xmlchild = {}
  static e_unitskill_from_unitskill_xmlchild = {vx_type: nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild}

  // (func unitskill<-unitskill-xmlchild)
  static f_unitskill_from_unitskill_xmlchild(unitskill, child) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_switch(
      {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_core.t_string},
      vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
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
          vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag"),
          vx_data_xml.f_string_first_from_xml(child)
        )})
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
              vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_data_xml.t_xml}, child, ":tag")
            )
          )
        )})
      )
    )
    return output
  }

  /**
   * @function unitskill_from_xml
   * @param  {xml} xml
   * @return {unitskill}
   */
  static t_unitskill_from_xml = {}
  static e_unitskill_from_xml = {vx_type: nx_tactics_books_bookloader.t_unitskill_from_xml}

  // (func unitskill<-xml)
  static f_unitskill_from_xml(xml) {
    let output = nx_tactics_base.e_unitskill
    output = vx_core.f_let(
      {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const propmap = vx_core.f_any_from_struct({"any-1": vx_core.t_stringmap, "struct-2": vx_data_xml.t_xml}, xml, ":propmap")
        const untskl = nx_tactics_books_bookloader.f_unitskill_from_unitskill_stringmap(
          vx_core.f_empty(
            nx_tactics_base.t_unitskill
          ),
          propmap
        )
        return vx_core.f_any_from_list_start_reduce(
          {"any-1": nx_tactics_base.t_unitskill, "any-2": vx_data_xml.t_xml, "list-2": vx_data_xml.t_xmllist},
          vx_core.f_any_from_struct({"any-1": vx_data_xml.t_xmllist, "struct-2": vx_data_xml.t_xml}, xml, ":children"),
          untskl,
          vx_core.f_new(vx_core.t_any_from_reduce, nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild)
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
  static t_unitweakness_from_xml = {}
  static e_unitweakness_from_xml = {vx_type: nx_tactics_books_bookloader.t_unitweakness_from_xml}

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
  static t_weakness_from_xml = {}
  static e_weakness_from_xml = {vx_type: nx_tactics_books_bookloader.t_weakness_from_xml}

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
  static t_xml_read_from_bookname = {}
  static e_xml_read_from_bookname = {vx_type: nx_tactics_books_bookloader.t_xml_read_from_bookname}

  // (func xml-read<-bookname)
  static f_xml_read_from_bookname(context, bookname) {
    let output = vx_data_xml.e_xml
    output = vx_data_xml.f_xml_read_from_file(
      context,
      nx_tactics_books_bookloader.f_file_read_from_bookname(bookname)
    )
    return output
  }

  // empty types


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
      "book<-xmllist": nx_tactics_books_bookloader.e_book_from_xmllist,
      "book<-xmltop": nx_tactics_books_bookloader.e_book_from_xmltop,
      "boolean-write<-book": nx_tactics_books_bookloader.e_boolean_write_from_book,
      "boolean-write<-booknames": nx_tactics_books_bookloader.e_boolean_write_from_booknames,
      "chapter<-chapter-key-value": nx_tactics_books_bookloader.e_chapter_from_chapter_key_value,
      "chapter<-chapter-stringmap": nx_tactics_books_bookloader.e_chapter_from_chapter_stringmap,
      "chapter<-chapter-xmlchild": nx_tactics_books_bookloader.e_chapter_from_chapter_xmlchild,
      "chapter<-chapter-xmlsection": nx_tactics_books_bookloader.e_chapter_from_chapter_xmlsection,
      "chapter<-xml": nx_tactics_books_bookloader.e_chapter_from_xml,
      "file-read<-bookname": nx_tactics_books_bookloader.e_file_read_from_bookname,
      "file-write<-book": nx_tactics_books_bookloader.e_file_write_from_book,
      "modifier<-xml": nx_tactics_books_bookloader.e_modifier_from_xml,
      "power<-power-key-value": nx_tactics_books_bookloader.e_power_from_power_key_value,
      "power<-power-stringmap": nx_tactics_books_bookloader.e_power_from_power_stringmap,
      "power<-power-xmlchild": nx_tactics_books_bookloader.e_power_from_power_xmlchild,
      "power<-xml": nx_tactics_books_bookloader.e_power_from_xml,
      "rule<-rule-key-value": nx_tactics_books_bookloader.e_rule_from_rule_key_value,
      "rule<-rule-stringmap": nx_tactics_books_bookloader.e_rule_from_rule_stringmap,
      "rule<-rule-xmlchild": nx_tactics_books_bookloader.e_rule_from_rule_xmlchild,
      "rule<-xml": nx_tactics_books_bookloader.e_rule_from_xml,
      "scenario<-scenario-key-value": nx_tactics_books_bookloader.e_scenario_from_scenario_key_value,
      "scenario<-scenario-stringmap": nx_tactics_books_bookloader.e_scenario_from_scenario_stringmap,
      "scenario<-scenario-xmlchild": nx_tactics_books_bookloader.e_scenario_from_scenario_xmlchild,
      "scenario<-xml": nx_tactics_books_bookloader.e_scenario_from_xml,
      "section<-section-key-value": nx_tactics_books_bookloader.e_section_from_section_key_value,
      "section<-section-stringmap": nx_tactics_books_bookloader.e_section_from_section_stringmap,
      "section<-section-xmlchild": nx_tactics_books_bookloader.e_section_from_section_xmlchild,
      "section<-section-xmlpower": nx_tactics_books_bookloader.e_section_from_section_xmlpower,
      "section<-section-xmlrule": nx_tactics_books_bookloader.e_section_from_section_xmlrule,
      "section<-section-xmlscenario": nx_tactics_books_bookloader.e_section_from_section_xmlscenario,
      "section<-section-xmlsection": nx_tactics_books_bookloader.e_section_from_section_xmlsection,
      "section<-section-xmlskill": nx_tactics_books_bookloader.e_section_from_section_xmlskill,
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
      "string-vxlisp<-book": nx_tactics_books_bookloader.e_string_vxlisp_from_book,
      "string-writename<-book": nx_tactics_books_bookloader.e_string_writename_from_book,
      "unit<-unit-key-value": nx_tactics_books_bookloader.e_unit_from_unit_key_value,
      "unit<-unit-stringmap": nx_tactics_books_bookloader.e_unit_from_unit_stringmap,
      "unit<-unit-xmlchild": nx_tactics_books_bookloader.e_unit_from_unit_xmlchild,
      "unit<-unit-xmlpower": nx_tactics_books_bookloader.e_unit_from_unit_xmlpower,
      "unit<-unit-xmlskill": nx_tactics_books_bookloader.e_unit_from_unit_xmlskill,
      "unit<-unit-xmlweakness": nx_tactics_books_bookloader.e_unit_from_unit_xmlweakness,
      "unit<-xml": nx_tactics_books_bookloader.e_unit_from_xml,
      "unitpower<-xml": nx_tactics_books_bookloader.e_unitpower_from_xml,
      "unitskill<-unitskill-key-value": nx_tactics_books_bookloader.e_unitskill_from_unitskill_key_value,
      "unitskill<-unitskill-stringmap": nx_tactics_books_bookloader.e_unitskill_from_unitskill_stringmap,
      "unitskill<-unitskill-xmlchild": nx_tactics_books_bookloader.e_unitskill_from_unitskill_xmlchild,
      "unitskill<-xml": nx_tactics_books_bookloader.e_unitskill_from_xml,
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
      "book<-xmllist": nx_tactics_books_bookloader.t_book_from_xmllist,
      "book<-xmltop": nx_tactics_books_bookloader.t_book_from_xmltop,
      "boolean-write<-book": nx_tactics_books_bookloader.t_boolean_write_from_book,
      "boolean-write<-booknames": nx_tactics_books_bookloader.t_boolean_write_from_booknames,
      "chapter<-chapter-key-value": nx_tactics_books_bookloader.t_chapter_from_chapter_key_value,
      "chapter<-chapter-stringmap": nx_tactics_books_bookloader.t_chapter_from_chapter_stringmap,
      "chapter<-chapter-xmlchild": nx_tactics_books_bookloader.t_chapter_from_chapter_xmlchild,
      "chapter<-chapter-xmlsection": nx_tactics_books_bookloader.t_chapter_from_chapter_xmlsection,
      "chapter<-xml": nx_tactics_books_bookloader.t_chapter_from_xml,
      "file-read<-bookname": nx_tactics_books_bookloader.t_file_read_from_bookname,
      "file-write<-book": nx_tactics_books_bookloader.t_file_write_from_book,
      "modifier<-xml": nx_tactics_books_bookloader.t_modifier_from_xml,
      "power<-power-key-value": nx_tactics_books_bookloader.t_power_from_power_key_value,
      "power<-power-stringmap": nx_tactics_books_bookloader.t_power_from_power_stringmap,
      "power<-power-xmlchild": nx_tactics_books_bookloader.t_power_from_power_xmlchild,
      "power<-xml": nx_tactics_books_bookloader.t_power_from_xml,
      "rule<-rule-key-value": nx_tactics_books_bookloader.t_rule_from_rule_key_value,
      "rule<-rule-stringmap": nx_tactics_books_bookloader.t_rule_from_rule_stringmap,
      "rule<-rule-xmlchild": nx_tactics_books_bookloader.t_rule_from_rule_xmlchild,
      "rule<-xml": nx_tactics_books_bookloader.t_rule_from_xml,
      "scenario<-scenario-key-value": nx_tactics_books_bookloader.t_scenario_from_scenario_key_value,
      "scenario<-scenario-stringmap": nx_tactics_books_bookloader.t_scenario_from_scenario_stringmap,
      "scenario<-scenario-xmlchild": nx_tactics_books_bookloader.t_scenario_from_scenario_xmlchild,
      "scenario<-xml": nx_tactics_books_bookloader.t_scenario_from_xml,
      "section<-section-key-value": nx_tactics_books_bookloader.t_section_from_section_key_value,
      "section<-section-stringmap": nx_tactics_books_bookloader.t_section_from_section_stringmap,
      "section<-section-xmlchild": nx_tactics_books_bookloader.t_section_from_section_xmlchild,
      "section<-section-xmlpower": nx_tactics_books_bookloader.t_section_from_section_xmlpower,
      "section<-section-xmlrule": nx_tactics_books_bookloader.t_section_from_section_xmlrule,
      "section<-section-xmlscenario": nx_tactics_books_bookloader.t_section_from_section_xmlscenario,
      "section<-section-xmlsection": nx_tactics_books_bookloader.t_section_from_section_xmlsection,
      "section<-section-xmlskill": nx_tactics_books_bookloader.t_section_from_section_xmlskill,
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
      "string-vxlisp<-book": nx_tactics_books_bookloader.t_string_vxlisp_from_book,
      "string-writename<-book": nx_tactics_books_bookloader.t_string_writename_from_book,
      "unit<-unit-key-value": nx_tactics_books_bookloader.t_unit_from_unit_key_value,
      "unit<-unit-stringmap": nx_tactics_books_bookloader.t_unit_from_unit_stringmap,
      "unit<-unit-xmlchild": nx_tactics_books_bookloader.t_unit_from_unit_xmlchild,
      "unit<-unit-xmlpower": nx_tactics_books_bookloader.t_unit_from_unit_xmlpower,
      "unit<-unit-xmlskill": nx_tactics_books_bookloader.t_unit_from_unit_xmlskill,
      "unit<-unit-xmlweakness": nx_tactics_books_bookloader.t_unit_from_unit_xmlweakness,
      "unit<-xml": nx_tactics_books_bookloader.t_unit_from_xml,
      "unitpower<-xml": nx_tactics_books_bookloader.t_unitpower_from_xml,
      "unitskill<-unitskill-key-value": nx_tactics_books_bookloader.t_unitskill_from_unitskill_key_value,
      "unitskill<-unitskill-stringmap": nx_tactics_books_bookloader.t_unitskill_from_unitskill_stringmap,
      "unitskill<-unitskill-xmlchild": nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild,
      "unitskill<-xml": nx_tactics_books_bookloader.t_unitskill_from_xml,
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
    nx_tactics_books_bookloader.t_ability_from_ability_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_ability_from_ability_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_ability_from_ability_xmlchild['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_ability_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_book_read_from_bookname['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_book_from_book_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_book_from_book_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_book_from_book_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_book_from_book_xmlchapter['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_book_from_book_xmlchild['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_book_from_xml['vx_type'] = vx_core.t_type
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

    // (func book<-xmllist)
    nx_tactics_books_bookloader.t_book_from_xmllist['vx_type'] = vx_core.t_type
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

    // (func book<-xmltop)
    nx_tactics_books_bookloader.t_book_from_xmltop['vx_type'] = vx_core.t_type
    nx_tactics_books_bookloader.t_book_from_xmltop['vx_value'] = {
      name          : "book<-xmltop",
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
      fn            : nx_tactics_books_bookloader.f_book_from_xmltop
    }

    // (func boolean-write<-book)
    nx_tactics_books_bookloader.t_boolean_write_from_book['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_boolean_write_from_booknames['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_chapter_from_chapter_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_chapter_from_chapter_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_chapter_from_chapter_xmlchild['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_chapter_from_chapter_xmlsection['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_chapter_from_xml['vx_type'] = vx_core.t_type
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

    // (func file-read<-bookname)
    nx_tactics_books_bookloader.t_file_read_from_bookname['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_file_write_from_book['vx_type'] = vx_core.t_type
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

    // (func modifier<-xml)
    nx_tactics_books_bookloader.t_modifier_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_power_from_power_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_power_from_power_stringmap['vx_type'] = vx_core.t_type
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

    // (func power<-power-xmlchild)
    nx_tactics_books_bookloader.t_power_from_power_xmlchild['vx_type'] = vx_core.t_type
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

    // (func power<-xml)
    nx_tactics_books_bookloader.t_power_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_rule_from_rule_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_rule_from_rule_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_rule_from_rule_xmlchild['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_rule_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_scenario_from_scenario_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_scenario_from_scenario_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_scenario_from_scenario_xmlchild['vx_type'] = vx_core.t_type
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

    // (func scenario<-xml)
    nx_tactics_books_bookloader.t_scenario_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_section_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_section_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_section_xmlchild['vx_type'] = vx_core.t_type
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

    // (func section<-section-xmlpower)
    nx_tactics_books_bookloader.t_section_from_section_xmlpower['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_section_xmlrule['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_section_xmlscenario['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_section_xmlsection['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_section_xmlskill['vx_type'] = vx_core.t_type
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

    // (func section<-section-xmlunit)
    nx_tactics_books_bookloader.t_section_from_section_xmlunit['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_section_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_skill_from_skill_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_skill_from_skill_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_skill_from_skill_xmlability['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_skill_from_skill_xmlchild['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_skill_from_skill_xmlspecialty['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_skill_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_specialty_from_specialty_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_specialty_from_specialty_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_specialty_from_specialty_xmlchild['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_specialty_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_string_read_from_bookname['vx_type'] = vx_core.t_type
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

    // (func string-vxlisp<-book)
    nx_tactics_books_bookloader.t_string_vxlisp_from_book['vx_type'] = vx_core.t_type
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

    // (func string-writename<-book)
    nx_tactics_books_bookloader.t_string_writename_from_book['vx_type'] = vx_core.t_type
    nx_tactics_books_bookloader.t_string_writename_from_book['vx_value'] = {
      name          : "string-writename<-book",
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
      fn            : nx_tactics_books_bookloader.f_string_writename_from_book
    }

    // (func unit<-unit-key-value)
    nx_tactics_books_bookloader.t_unit_from_unit_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unit_from_unit_stringmap['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unit_from_unit_xmlchild['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unit_from_unit_xmlpower['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unit_from_unit_xmlskill['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unit_from_unit_xmlweakness['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unit_from_xml['vx_type'] = vx_core.t_type
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

    // (func unitpower<-xml)
    nx_tactics_books_bookloader.t_unitpower_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_key_value['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_stringmap['vx_type'] = vx_core.t_type
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

    // (func unitskill<-unitskill-xmlchild)
    nx_tactics_books_bookloader.t_unitskill_from_unitskill_xmlchild['vx_type'] = vx_core.t_type
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

    // (func unitskill<-xml)
    nx_tactics_books_bookloader.t_unitskill_from_xml['vx_type'] = vx_core.t_type
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

    // (func unitweakness<-xml)
    nx_tactics_books_bookloader.t_unitweakness_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_weakness_from_xml['vx_type'] = vx_core.t_type
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
    nx_tactics_books_bookloader.t_xml_read_from_bookname['vx_type'] = vx_core.t_type
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
