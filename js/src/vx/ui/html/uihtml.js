'strict mode'

import vx_core from "../../../vx/core.js"
import vx_ui_ui from "../../../vx/ui/ui.js"


export default class vx_ui_html_uihtml {


  /**
   * type: renderer-html
   * Html specific renderer
   */
  static t_renderer_html = {}
  /**
   * Constant: renderer-app
   * Html App Renderer
   * {renderer-html}
   */
  static c_renderer_app = {vx_type: vx_ui_html_uihtml.t_renderer_html, vx_constdef: {pkgname: 'vx/ui/html/uihtml', name: 'renderer-app'}}

  /**
   * @function render_app_from_ui_orig
   * Returns a rendered object from a UI Element.
   * @param  {ui} ui
   * @param  {ui} orig
   * @return {render}
   */
  static t_render_app_from_ui_orig = {}
  static e_render_app_from_ui_orig = {vx_type: vx_ui_html_uihtml.t_render_app_from_ui_orig}

  // (func render-app<-ui-orig)
  static f_render_app_from_ui_orig(ui, orig) {
    let output = vx_ui_ui.e_render
    return output
  }

  // empty types
  static e_renderer_html = {}


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "renderer-app": vx_ui_html_uihtml.c_renderer_app
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "renderer-html": vx_ui_html_uihtml.e_renderer_html,
      "render-app<-ui-orig": vx_ui_html_uihtml.e_render_app_from_ui_orig
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "render-app<-ui-orig": vx_ui_html_uihtml.t_render_app_from_ui_orig
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "renderer-html": vx_ui_html_uihtml.t_renderer_html
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "vx/ui/html/uihtml",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (type renderer-html)
    vx_ui_html_uihtml.t_renderer_html['vx_type'] = vx_core.t_type
    vx_ui_html_uihtml.t_renderer_html['vx_value'] = {
      name          : "renderer-html",
      pkgname       : "vx/ui/html/uihtml",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [vx_ui_ui.t_renderer],
      properties    : {
        "fn-render": {
          "name" : "fn-render",
          "type" : vx_ui_ui.t_render_from_ui_orig,
          "multi": false
        }
      },
      proplast      : {
        "name" : "fn-render",
        "type" : vx_ui_ui.t_render_from_ui_orig,
        "multi": false
      }
    }
    vx_ui_html_uihtml.e_renderer_html['vx_type'] = vx_ui_html_uihtml.t_renderer_html
    vx_ui_html_uihtml.e_renderer_html['vx_value'] = {}

    // (const renderer-app)
    Object.assign(vx_ui_html_uihtml.c_renderer_app, vx_core.f_new(
      vx_ui_html_uihtml.t_renderer_html,
      ":fn-render",
      vx_ui_html_uihtml.t_render_app_from_ui_orig
    ))

    // (func render-app<-ui-orig)
    vx_ui_html_uihtml.t_render_app_from_ui_orig['vx_type'] = vx_core.t_type
    vx_ui_html_uihtml.t_render_app_from_ui_orig['vx_value'] = {
      name          : "render-app<-ui-orig",
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
      fn            : vx_ui_html_uihtml.f_render_app_from_ui_orig
    }

  }
}
