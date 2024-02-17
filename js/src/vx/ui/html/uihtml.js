'strict mode'

import vx_core from "../../../vx/core.js"
import vx_web_html from "../../../vx/web/html.js"
import vx_web_htmldoc from "../../../vx/web/htmldoc.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class vx_ui_html_uihtml {

  /**
   * Constant: renderer-app
   * Html App Renderer
   * {renderer}
   */
  static c_renderer_app = {vx_type: vx_ui_ui.t_renderer, vx_constdef: {pkgname: 'vx/ui/html/uihtml', name: 'renderer-app'}}

  /**
   * Constant: renderer-default
   * Html App Renderer
   * {renderer}
   */
  static c_renderer_default = {vx_type: vx_ui_ui.t_renderer, vx_constdef: {pkgname: 'vx/ui/html/uihtml', name: 'renderer-default'}}

  /**
   * @function divchildlist_from_uimap
   * Returns a divchildlist of empty divs from a uimap
   * @param  {uimap} uimap
   * @return {divchildlist}
   */
  static t_divchildlist_from_uimap = {
    vx_type: vx_core.t_type
  }
  static e_divchildlist_from_uimap = {
    vx_type: vx_ui_html_uihtml.t_divchildlist_from_uimap
  }

  // (func divchildlist<-uimap)
  static f_divchildlist_from_uimap(uimap) {
    let output = vx_web_html.e_divchildlist
    output = vx_core.f_list_from_map(
      {"any-1": vx_web_html.t_divchild, "any-2": vx_ui_ui.t_ui, "list-1": vx_web_html.t_divchildlist, "map-2": vx_ui_ui.t_uimap},
      uimap,
      vx_core.f_new(vx_core.t_any_from_key_value, ([key, value]) => 
        vx_core.f_let(
          {"any-1": vx_web_html.t_div},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const uid = vx_core.f_any_from_map({"any-1": vx_core.t_string, "map-1": vx_ui_ui.t_ui}, value, ":uid")
            return vx_core.f_new(
              vx_web_html.t_div,
              ":id",
              uid
            )
          })
        ))
    )
    return output
  }

  /**
   * @function node_app_from_ui_orig_parent
   * @param  {ui} ui
   * @param  {ui} orig
   * @param  {ui} parent
   * @return {node}
   */
  static t_node_app_from_ui_orig_parent = {
    vx_type: vx_core.t_type
  }
  static e_node_app_from_ui_orig_parent = {
    vx_type: vx_ui_html_uihtml.t_node_app_from_ui_orig_parent
  }

  // (func node-app<-ui-orig-parent)
  static f_node_app_from_ui_orig_parent(ui, orig, parent) {
    let output = vx_web_html.e_node
    output = vx_core.f_empty(
      vx_web_html.t_div
    )
    return output
  }

  /**
   * @function node_render_from_node_uid
   * @param  {node} node
   * @param  {string} uid
   * @return {node}
   */
  static t_node_render_from_node_uid = {
    vx_type: vx_core.t_type
  }
  static e_node_render_from_node_uid = {
    vx_type: vx_ui_html_uihtml.t_node_render_from_node_uid
  }

  // (func node-render<-node-uid)
  static f_node_render_from_node_uid(node, uid) {
    let output = vx_web_html.e_node
    output = vx_core.f_let(
      {"any-1": vx_web_html.t_node},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const htmltext = vx_web_html.f_string_from_node_indent(node, 2)
        const isdone = vx_web_htmldoc.f_boolean_replace_from_id_htmltext(uid, htmltext)
        return node
      })
    )
    return output
  }

  /**
   * @function renderer_from_style
   * Returns a renderer from a given style
   * @param  {style} style
   * @return {renderer}
   */
  static t_renderer_from_style = {
    vx_type: vx_core.t_type
  }
  static e_renderer_from_style = {
    vx_type: vx_ui_html_uihtml.t_renderer_from_style
  }

  // (func renderer<-style)
  static f_renderer_from_style(style) {
    let output = vx_ui_ui.e_renderer
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_renderer},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const layout = vx_ui_ui.f_layout_from_style(style)
        return vx_core.f_if_2(
          {"any-1": vx_ui_ui.t_renderer},
          vx_core.f_then(
            vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(
              layout,
              vx_ui_ui.c_layout_app
            )}),
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_ui_html_uihtml.c_renderer_app})
          ),
          vx_core.f_else(
            vx_core.f_new(vx_core.t_any_from_func, () => {return vx_ui_html_uihtml.c_renderer_default})
          )
        )
      })
    )
    return output
  }

  /**
   * @function ui_render_app_from_ui_orig_parent
   * @param  {ui} ui
   * @param  {ui} orig
   * @param  {ui} parent
   * @return {ui}
   */
  static t_ui_render_app_from_ui_orig_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_render_app_from_ui_orig_parent = {
    vx_type: vx_ui_html_uihtml.t_ui_render_app_from_ui_orig_parent
  }

  // (func ui-render-app<-ui-orig-parent)
  static f_ui_render_app_from_ui_orig_parent(ui, orig, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const uid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, ui, ":uid")
        const uimap = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_uimap, "struct-2": vx_ui_ui.t_ui}, ui, ":uimap")
        const children = vx_ui_html_uihtml.f_divchildlist_from_uimap(uimap)
        const node = vx_core.f_new(
          vx_web_html.t_div,
          ":id",
          uid,
          ":nodes",
          children
        )
        const nodechg = vx_ui_html_uihtml.f_node_render_from_node_uid(node, uid)
        return ui
      })
    )
    return output
  }

  /**
   * @function ui_render_default_from_ui_orig_parent
   * @param  {ui} ui
   * @param  {ui} orig
   * @param  {ui} parent
   * @return {ui}
   */
  static t_ui_render_default_from_ui_orig_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_render_default_from_ui_orig_parent = {
    vx_type: vx_ui_html_uihtml.t_ui_render_default_from_ui_orig_parent
  }

  // (func ui-render-default<-ui-orig-parent)
  static f_ui_render_default_from_ui_orig_parent(ui, orig, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const uid = vx_core.f_any_from_struct({"any-1": vx_core.t_string, "struct-2": vx_ui_ui.t_ui}, ui, ":uid")
        const uimap = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_uimap, "struct-2": vx_ui_ui.t_ui}, ui, ":uimap")
        const children = vx_ui_html_uihtml.f_divchildlist_from_uimap(uimap)
        const node = vx_core.f_new(
          vx_web_html.t_div,
          ":id",
          uid,
          ":nodes",
          children
        )
        const nodechg = vx_ui_html_uihtml.f_node_render_from_node_uid(node, uid)
        return ui
      })
    )
    return output
  }

  /**
   * @function ui_renderer_from_ui
   * Returns a ui with an HTML renderer added to each ui.
   * @param  {ui} ui
   * @return {ui}
   */
  static t_ui_renderer_from_ui = {
    vx_type: vx_core.t_type
  }
  static e_ui_renderer_from_ui = {
    vx_type: vx_ui_html_uihtml.t_ui_renderer_from_ui
  }

  // (func ui-renderer<-ui)
  static f_ui_renderer_from_ui(ui) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const style = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_style, "struct-2": vx_ui_ui.t_ui}, ui, ":style")
        const renderer = vx_ui_html_uihtml.f_renderer_from_style(style)
        const uimap = vx_ui_html_uihtml.f_uimap_renderer_from_uimap(
          vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_uimap, "struct-2": vx_ui_ui.t_ui}, ui, ":uimap")
        )
        return vx_core.f_copy(ui, ":renderer", renderer, ":uimap", uimap)
      })
    )
    return output
  }

  /**
   * @function uimap_renderer_from_uimap
   * Returns a uimap with an HTML renderer added to each ui.
   * @param  {uimap} uimap
   * @return {uimap}
   */
  static t_uimap_renderer_from_uimap = {
    vx_type: vx_core.t_type
  }
  static e_uimap_renderer_from_uimap = {
    vx_type: vx_ui_html_uihtml.t_uimap_renderer_from_uimap
  }

  // (func uimap-renderer<-uimap)
  static f_uimap_renderer_from_uimap(uimap) {
    let output = vx_ui_ui.e_uimap
    output = vx_core.f_map_from_map(
      {"any-1": vx_ui_ui.t_ui, "any-2": vx_ui_ui.t_ui, "map-1": vx_ui_ui.t_uimap, "map-2": vx_ui_ui.t_uimap},
      uimap,
      vx_core.f_new(vx_core.t_any_from_key_value, ([key, ui]) => 
        vx_ui_html_uihtml.f_ui_renderer_from_ui(ui))
    )
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "renderer-app": vx_ui_html_uihtml.c_renderer_app,
      "renderer-default": vx_ui_html_uihtml.c_renderer_default
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "divchildlist<-uimap": vx_ui_html_uihtml.e_divchildlist_from_uimap,
      "node-app<-ui-orig-parent": vx_ui_html_uihtml.e_node_app_from_ui_orig_parent,
      "node-render<-node-uid": vx_ui_html_uihtml.e_node_render_from_node_uid,
      "renderer<-style": vx_ui_html_uihtml.e_renderer_from_style,
      "ui-render-app<-ui-orig-parent": vx_ui_html_uihtml.e_ui_render_app_from_ui_orig_parent,
      "ui-render-default<-ui-orig-parent": vx_ui_html_uihtml.e_ui_render_default_from_ui_orig_parent,
      "ui-renderer<-ui": vx_ui_html_uihtml.e_ui_renderer_from_ui,
      "uimap-renderer<-uimap": vx_ui_html_uihtml.e_uimap_renderer_from_uimap
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "divchildlist<-uimap": vx_ui_html_uihtml.t_divchildlist_from_uimap,
      "node-app<-ui-orig-parent": vx_ui_html_uihtml.t_node_app_from_ui_orig_parent,
      "node-render<-node-uid": vx_ui_html_uihtml.t_node_render_from_node_uid,
      "renderer<-style": vx_ui_html_uihtml.t_renderer_from_style,
      "ui-render-app<-ui-orig-parent": vx_ui_html_uihtml.t_ui_render_app_from_ui_orig_parent,
      "ui-render-default<-ui-orig-parent": vx_ui_html_uihtml.t_ui_render_default_from_ui_orig_parent,
      "ui-renderer<-ui": vx_ui_html_uihtml.t_ui_renderer_from_ui,
      "uimap-renderer<-uimap": vx_ui_html_uihtml.t_uimap_renderer_from_uimap
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "vx/ui/html/uihtml",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (func divchildlist<-uimap)
    vx_ui_html_uihtml.t_divchildlist_from_uimap['vx_value'] = {
      name          : "divchildlist<-uimap",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_divchildlist_from_uimap
    }

    // (func node-app<-ui-orig-parent)
    vx_ui_html_uihtml.t_node_app_from_ui_orig_parent['vx_value'] = {
      name          : "node-app<-ui-orig-parent",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_node_app_from_ui_orig_parent
    }

    // (func node-render<-node-uid)
    vx_ui_html_uihtml.t_node_render_from_node_uid['vx_value'] = {
      name          : "node-render<-node-uid",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_node_render_from_node_uid
    }

    // (func renderer<-style)
    vx_ui_html_uihtml.t_renderer_from_style['vx_value'] = {
      name          : "renderer<-style",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_renderer_from_style
    }

    // (func ui-render-app<-ui-orig-parent)
    vx_ui_html_uihtml.t_ui_render_app_from_ui_orig_parent['vx_value'] = {
      name          : "ui-render-app<-ui-orig-parent",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_ui_render_app_from_ui_orig_parent
    }

    // (func ui-render-default<-ui-orig-parent)
    vx_ui_html_uihtml.t_ui_render_default_from_ui_orig_parent['vx_value'] = {
      name          : "ui-render-default<-ui-orig-parent",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_ui_render_default_from_ui_orig_parent
    }

    // (func ui-renderer<-ui)
    vx_ui_html_uihtml.t_ui_renderer_from_ui['vx_value'] = {
      name          : "ui-renderer<-ui",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_ui_renderer_from_ui
    }

    // (func uimap-renderer<-uimap)
    vx_ui_html_uihtml.t_uimap_renderer_from_uimap['vx_value'] = {
      name          : "uimap-renderer<-uimap",
      pkgname       : "vx/ui/html/uihtml",
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
      fn            : vx_ui_html_uihtml.f_uimap_renderer_from_uimap
    }

    // (const renderer-app)
    Object.assign(vx_ui_html_uihtml.c_renderer_app, vx_core.f_new(
      vx_ui_ui.t_renderer,
      ":fn-render",
      vx_ui_html_uihtml.t_ui_render_app_from_ui_orig_parent
    ))

    // (const renderer-default)
    Object.assign(vx_ui_html_uihtml.c_renderer_default, vx_core.f_new(
      vx_ui_ui.t_renderer,
      ":fn-render",
      vx_ui_html_uihtml.t_ui_render_default_from_ui_orig_parent
    ))

  }
}
