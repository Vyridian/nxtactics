'strict mode'

import vx_core from "../../vx/core.js"
import nx_tactics_base from "../../nx/tactics/base.js"
import nx_tactics_books_bookloader from "../../nx/tactics/books/bookloader.js"
import vx_data_file from "../../vx/data/file.js"
import vx_data_xml from "../../vx/data/xml.js"
import nx_tactics_books_advanced_rules from "../../nx/tactics/books/advanced_rules.js"
import vx_ui_ui from "../../vx/ui/ui.js"
import nx_tactics_uitactics from "../../nx/tactics/uitactics.js"


export default class nx_tactics_apptactics {

  /**
   * @function context_nx
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} ... args
   * @return {context}
   */
  static t_context_nx = {}
  static e_context_nx = {vx_type: nx_tactics_apptactics.t_context_nx}

  // (func context-nx)
  static f_context_nx(...args) {
    let output = vx_core.e_context
    args = vx_core.f_new(vx_core.t_anylist, ...args)
    output = vx_core.f_new(
      vx_core.t_context,
      ":session",
      vx_core.f_new(
        vx_core.t_session,
        ":user",
        vx_core.f_new(
          vx_core.t_user,
          ":security",
          nx_tactics_apptactics.f_security_nx()
        )
      )
    )
    return output
  }

  /**
   * @function main_nx
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} ... args
   * @return {string}
   */
  static t_main_nx = {}
  static e_main_nx = {vx_type: nx_tactics_apptactics.t_main_nx}

  // (func main-nx)
  static f_main_nx(context, ...args) {
    let output = vx_core.e_string
    args = vx_core.f_new(vx_core.t_anylist, ...args)
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const booknames = vx_core.f_new(
          vx_core.t_stringlist,
          "TACTICSBOOK_CORE",
          "TACTICSBOOK_ADVANCED",
          "TACTICSBOOK_ANCIENT",
          "TACTICSBOOK_AOSAIL",
          "TACTICSBOOK_AOSTEAM",
          "TACTICSBOOK_BESTIARY",
          "TACTICSBOOK_CHARS",
          "TACTICSBOOK_COMBAT",
          "TACTICSBOOK_FANTASY",
          "TACTICSBOOK_GEAR",
          "TACTICSBOOK_GIANT",
          "TACTICSBOOK_HIGHTECH",
          "TACTICSBOOK_HORROR",
          "TACTICSBOOK_LANDSEA",
          "TACTICSBOOK_MAGIC",
          "TACTICSBOOK_MEDIEVAL",
          "TACTICSBOOK_MFANTASY",
          "TACTICSBOOK_MODERN",
          "TACTICSBOOK_POWERS",
          "TACTICSBOOK_PREHISTORY",
          "TACTICSBOOK_PULP",
          "TACTICSBOOK_SCIFI",
          "TACTICSBOOK_SKILLS",
          "TACTICSBOOK_SPACE",
          "TACTICSBOOK_SUPER",
          "TACTICSBOOK_WORLDWARS"
        )
        const done = nx_tactics_books_bookloader.f_boolean_write_from_booknames(context, booknames)
        return vx_core.f_string_from_any(done)
      })
    )
    return output
  }

  /**
   * @function security_nx
   * Returns the security for execution.
   * @return {security}
   */
  static t_security_nx = {}
  static e_security_nx = {vx_type: nx_tactics_apptactics.t_security_nx}

  // (func security-nx)
  static f_security_nx() {
    let output = vx_core.e_security
    output = vx_core.f_new(
      vx_core.t_security,
      ":allowfuncs",
      vx_core.f_new(
        vx_core.t_funclist,
        vx_data_file.t_boolean_write_from_file_any,
        vx_data_file.t_boolean_write_from_file_string,
        vx_data_file.t_file_read_from_file,
        vx_data_file.t_string_read_from_file
      )
    )
    return output
  }

  // empty types


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "context-nx": nx_tactics_apptactics.e_context_nx,
      "main-nx": nx_tactics_apptactics.e_main_nx,
      "security-nx": nx_tactics_apptactics.e_security_nx
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "context-nx": nx_tactics_apptactics.t_context_nx,
      "main-nx": nx_tactics_apptactics.t_main_nx,
      "security-nx": nx_tactics_apptactics.t_security_nx
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "nx/tactics/apptactics",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func context-nx)
    nx_tactics_apptactics.t_context_nx['vx_type'] = vx_core.t_type
    nx_tactics_apptactics.t_context_nx['vx_value'] = {
      name          : "context-nx",
      pkgname       : "nx/tactics/apptactics",
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
      fn            : nx_tactics_apptactics.f_context_nx
    }

    // (func main-nx)
    nx_tactics_apptactics.t_main_nx['vx_type'] = vx_core.t_type
    nx_tactics_apptactics.t_main_nx['vx_value'] = {
      name          : "main-nx",
      pkgname       : "nx/tactics/apptactics",
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
      fn            : nx_tactics_apptactics.f_main_nx
    }

    // (func security-nx)
    nx_tactics_apptactics.t_security_nx['vx_type'] = vx_core.t_type
    nx_tactics_apptactics.t_security_nx['vx_value'] = {
      name          : "security-nx",
      pkgname       : "nx/tactics/apptactics",
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
      fn            : nx_tactics_apptactics.f_security_nx
    }

  }
}
