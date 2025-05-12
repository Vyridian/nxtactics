'strict mode'

import vx_core from "../../vx/core.js"
import vx_data_file from "../../vx/data/file.js"
import nx_tactics_ui_stylesheet from "../../nx/tactics/ui/stylesheet.js"
import vx_ui_ui from "../../vx/ui/ui.js"
import vx_ui_html_uihtml from "../../vx/ui/html/uihtml.js"
import nx_tactics_ui_uitactics from "../../nx/tactics/ui/uitactics.js"


export default class nx_tactics_apptactics {

  /**
   * @function context_nx
   * Returns the context for execution. Arguments come from the command line.
   * @param  {anylist} ... args
   * @return {context}
   */
  static t_context_nx = {
    vx_type: vx_core.t_type
  }
  static e_context_nx = {
    vx_type: nx_tactics_apptactics.t_context_nx
  }

  // (func context-nx)
  static f_context_nx(...args) {
    let output = vx_core.e_context
    args = vx_core.f_new_from_type(vx_core.t_anylist, ...args)
    output = vx_core.f_new(
      {"any-1": vx_core.t_context},
      ":session",
      vx_core.f_new(
        {"any-1": vx_core.t_session},
        ":user",
        vx_core.f_new(
          {"any-1": vx_core.t_user},
          ":security",
          nx_tactics_apptactics.f_security_nx()
        )
      ),
      ":state",
      vx_core.f_new(
        {"any-1": vx_core.t_state},
        ":statelistenermap",
        vx_core.f_new(
          {"any-1": vx_core.t_statelistenermap},
          ":initialized",
          vx_core.f_new({"any-1": vx_core.t_statelistener}, ":name", "initialized")
        )
      )
    )
    return output
  }

  /**
   * 
   * @async @function main_nx
   * The default function for app main execution. Arguments come from the command line.
   * @param  {anylist} ... args
   * @return {string}
   */
  static t_main_nx = {
    vx_type: vx_core.t_type
  }
  static e_main_nx = {
    vx_type: nx_tactics_apptactics.t_main_nx
  }

  // (func main-nx)
  static async f_main_nx(context, ...args) {
    let output = Promise.resolve(vx_core.e_string)
    args = vx_core.f_new_from_type(vx_core.t_anylist, ...args)
    output = await nx_tactics_apptactics.f_string_render_html(context)
    return output
  }

  /**
   * @function security_nx
   * Returns the security for execution.
   * @return {security}
   */
  static t_security_nx = {
    vx_type: vx_core.t_type
  }
  static e_security_nx = {
    vx_type: nx_tactics_apptactics.t_security_nx
  }

  // (func security-nx)
  static f_security_nx() {
    let output = vx_core.e_security
    output = vx_core.f_new(
      {"any-1": vx_core.t_security},
      ":allowfuncs",
      vx_core.f_new(
        {"any-1": vx_core.t_funclist},
        vx_data_file.t_boolean_write_from_file_any,
        vx_data_file.t_boolean_write_from_file_string,
        vx_data_file.t_file_read_from_file,
        vx_data_file.t_string_read_from_file
      )
    )
    return output
  }

  /**
   * 
   * @async @function string_render_html
   * @return {string}
   */
  static t_string_render_html = {
    vx_type: vx_core.t_type
  }
  static e_string_render_html = {
    vx_type: nx_tactics_apptactics.t_string_render_html
  }

  // (func string-render-html)
  static async f_string_render_html(context) {
    let output = Promise.resolve(vx_core.e_string)
    output = vx_core.f_let(
      {"any-1": vx_core.t_string},
      [],
      vx_core.f_new_from_type(vx_core.t_any_from_func, async () => {
        const ctx = vx_ui_html_uihtml.f_context_write(context)
        const uiengine = vx_core.f_new(
          {"any-1": vx_ui_ui.t_uiengine},
          ":layoutengine",
          vx_ui_html_uihtml.c_layoutenginehtml,
          ":stylesheet",
          nx_tactics_ui_stylesheet.c_stylesheet_app,
          ":ui",
          nx_tactics_ui_uitactics.f_ui_app()
        )
        const uienginerender = vx_ui_ui.f_uiengine_render(context, uiengine)
        return ""
      })
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "context-nx": nx_tactics_apptactics.e_context_nx,
      "main-nx": nx_tactics_apptactics.e_main_nx,
      "security-nx": nx_tactics_apptactics.e_security_nx,
      "string-render-html": nx_tactics_apptactics.e_string_render_html
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "context-nx": nx_tactics_apptactics.t_context_nx,
      "main-nx": nx_tactics_apptactics.t_main_nx,
      "security-nx": nx_tactics_apptactics.t_security_nx,
      "string-render-html": nx_tactics_apptactics.t_string_render_html
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_apptactics.f_context_nx
    }

    // (func main-nx)
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_apptactics.f_main_nx
    }

    // (func security-nx)
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
      traits        : [vx_core.t_func],
      properties    : [],
      proplast      : {},
      fn            : nx_tactics_apptactics.f_security_nx
    }

    // (func string-render-html)
    nx_tactics_apptactics.t_string_render_html['vx_value'] = {
      name          : "string-render-html",
      pkgname       : "nx/tactics/apptactics",
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
      fn            : nx_tactics_apptactics.f_string_render_html
    }

  }
}
