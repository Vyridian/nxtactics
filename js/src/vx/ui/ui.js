'strict mode'

import vx_core from "../../vx/core.js"
import vx_event from "../../vx/event.js"


export default class vx_ui_ui {


  /**
   * type: layout
   * Universal Layout
   */
  static t_layout = {}
  static e_layout = {vx_type: vx_ui_ui.t_layout}

  /**
   * type: point
   * Universal Point
   */
  static t_point = {}
  static e_point = {vx_type: vx_ui_ui.t_point}

  /**
   * type: pointstyle
   * Universal Point Style
   */
  static t_pointstyle = {}
  static e_pointstyle = {vx_type: vx_ui_ui.t_pointstyle}

  /**
   * type: render
   * Universal Rendered UI
   */
  static t_render = {}
  static e_render = {vx_type: vx_ui_ui.t_render}

  /**
   * type: renderer
   * Universal Renderer
   */
  static t_renderer = {}
  static e_renderer = {vx_type: vx_ui_ui.t_renderer}

  /**
   * type: rendermap
   * Map of render
   */
  static t_rendermap = {}
  static e_rendermap = {vx_type: vx_ui_ui.t_rendermap}

  /**
   * type: style
   * Universal Style
   */
  static t_style = {}
  static e_style = {vx_type: vx_ui_ui.t_style}

  /**
   * type: stylelist
   * Universal Stylelist
   */
  static t_stylelist = {}
  static e_stylelist = vx_core.vx_new_list(vx_ui_ui.t_stylelist, [])

  /**
   * type: stylemap
   * Universal Stylemap
   */
  static t_stylemap = {}
  static e_stylemap = {vx_type: vx_ui_ui.t_stylemap}

  /**
   * type: stylesheet
   * Universal Stylesheet
   */
  static t_stylesheet = {}
  static e_stylesheet = {vx_type: vx_ui_ui.t_stylesheet}

  /**
   * type: ui
   * Universal UI Element
   */
  static t_ui = {}
  static e_ui = {vx_type: vx_ui_ui.t_ui}

  /**
   * type: uimap
   */
  static t_uimap = {}
  static e_uimap = {vx_type: vx_ui_ui.t_uimap}
  /**
   * Constant: layout-app
   * {layout}
   */
  static c_layout_app = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-app'}}

  /**
   * Constant: layout-background
   * {layout}
   */
  static c_layout_background = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-background'}}

  /**
   * Constant: layout-combobox
   * {layout}
   */
  static c_layout_combobox = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-combobox'}}

  /**
   * Constant: layout-flow-horizontal
   * {layout}
   */
  static c_layout_flow_horizontal = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-flow-horizontal'}}

  /**
   * Constant: layout-flow-vertical
   * {layout}
   */
  static c_layout_flow_vertical = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-flow-vertical'}}

  /**
   * Constant: layout-image
   * {layout}
   */
  static c_layout_image = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-image'}}

  /**
   * Constant: layout-maxpanel
   * {layout}
   */
  static c_layout_maxpanel = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-maxpanel'}}

  /**
   * Constant: layout-menubar
   * {layout}
   */
  static c_layout_menubar = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-menubar'}}

  /**
   * Constant: layout-menudrawer
   * {layout}
   */
  static c_layout_menudrawer = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-menudrawer'}}

  /**
   * Constant: layout-navbar
   * {layout}
   */
  static c_layout_navbar = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-navbar'}}

  /**
   * Constant: layout-navdrawer
   * {layout}
   */
  static c_layout_navdrawer = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-navdrawer'}}

  /**
   * Constant: layout-panel
   * {layout}
   */
  static c_layout_panel = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-panel'}}

  /**
   * Constant: layout-parallax
   * {layout}
   */
  static c_layout_parallax = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-parallax'}}

  /**
   * Constant: layout-scrollbox
   * {layout}
   */
  static c_layout_scrollbox = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-scrollbox'}}

  /**
   * Constant: layout-scrollbox-horizontal
   * {layout}
   */
  static c_layout_scrollbox_horizontal = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-scrollbox-horizontal'}}

  /**
   * Constant: layout-scrollbox-vertical
   * {layout}
   */
  static c_layout_scrollbox_vertical = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-scrollbox-vertical'}}

  /**
   * Constant: layout-split-horizontal
   * {layout}
   */
  static c_layout_split_horizontal = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-split-horizontal'}}

  /**
   * Constant: layout-split-vertical
   * {layout}
   */
  static c_layout_split_vertical = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-split-vertical'}}

  /**
   * Constant: layout-statusbar
   * {layout}
   */
  static c_layout_statusbar = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-statusbar'}}

  /**
   * Constant: layout-statusdrawer
   * {layout}
   */
  static c_layout_statusdrawer = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-statusdrawer'}}

  /**
   * Constant: layout-text
   * {layout}
   */
  static c_layout_text = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-text'}}

  /**
   * Constant: layout-textentry
   * {layout}
   */
  static c_layout_textentry = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-textentry'}}

  /**
   * @function layout_from_style
   * @param  {style} style
   * @return {layout}
   */
  static t_layout_from_style = {
    vx_type: vx_core.t_type
  }
  static e_layout_from_style = {
    vx_type: vx_ui_ui.t_layout_from_style
  }

  // (func layout<-style)
  static f_layout_from_style(style) {
    let output = vx_ui_ui.e_layout
    output = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_layout, "struct-2": vx_ui_ui.t_style}, style, ":layout")
    return output
  }

  /**
   * @function ui_render_from_fn_render_ui_orig_parent
   * @param  {ui_render_from_ui_orig_parent} fn_render
   * @param  {ui} ui
   * @param  {ui} orig
   * @param  {ui} parent
   * @return {render}
   */
  static t_ui_render_from_fn_render_ui_orig_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_render_from_fn_render_ui_orig_parent = {
    vx_type: vx_ui_ui.t_ui_render_from_fn_render_ui_orig_parent
  }

  // (func ui-render<-fn-render-ui-orig-parent)
  static f_ui_render_from_fn_render_ui_orig_parent(fn_render, ui, orig, parent) {
    let output = vx_ui_ui.e_render
    output = vx_core.vx_any_from_func(vx_ui_ui.t_render, fn_render, ui, orig, parent)
    return output
  }

  /**
   * @function ui_render_from_ui
   * @param  {ui} uiarg
   * @return {ui}
   */
  static t_ui_render_from_ui = {
    vx_type: vx_core.t_type
  }
  static e_ui_render_from_ui = {
    vx_type: vx_ui_ui.t_ui_render_from_ui
  }

  // (func ui-render<-ui)
  static f_ui_render_from_ui(uiarg) {
    let output = vx_ui_ui.e_ui
    output = vx_ui_ui.f_ui_render_from_ui_orig_parent(
      uiarg,
      vx_core.f_empty(
        vx_ui_ui.t_ui
      ),
      vx_core.f_empty(
        vx_ui_ui.t_ui
      )
    )
    return output
  }

  /**
   * @function ui_render_from_ui_orig_parent
   * Returns a rendered object from a UI Element.
   * @param  {ui} ui
   * @param  {ui} orig
   * @param  {ui} parent
   * @return {ui}
   */
  static t_ui_render_from_ui_orig_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_render_from_ui_orig_parent = {
    vx_type: vx_ui_ui.t_ui_render_from_ui_orig_parent
  }

  // (func ui-render<-ui-orig-parent)
  static f_ui_render_from_ui_orig_parent(ui, orig, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(ui, orig)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return orig})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const renderer = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_renderer, "struct-2": vx_ui_ui.t_ui}, ui, ":renderer")
            const uiout = vx_ui_ui.f_ui_from_renderer_ui_orig_parent(renderer, ui, orig, parent)
            return uiout
          })
        )})
      )
    )
    return output
  }

  /**
   * @function ui_from_renderer_ui_orig_parent
   * @param  {renderer} renderer
   * @param  {ui} uiarg
   * @param  {ui} uiorig
   * @param  {ui} parent
   * @return {ui}
   */
  static t_ui_from_renderer_ui_orig_parent = {
    vx_type: vx_core.t_type
  }
  static e_ui_from_renderer_ui_orig_parent = {
    vx_type: vx_ui_ui.t_ui_from_renderer_ui_orig_parent
  }

  // (func ui<-renderer-ui-orig-parent)
  static f_ui_from_renderer_ui_orig_parent(renderer, uiarg, uiorig, parent) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_let(
      {"any-1": vx_ui_ui.t_ui, "struct-2": vx_ui_ui.t_renderer},
      [],
      vx_core.f_new(vx_core.t_any_from_func, () => {
        const fn_render = vx_core.f_any_from_struct({"any-1": vx_ui_ui.t_ui_render_from_ui_orig_parent, "struct-2": vx_ui_ui.t_renderer}, renderer, ":fn-render")
        const uichg = vx_core.vx_any_from_func(vx_ui_ui.t_ui, fn_render, uiarg, uiorig, parent)
        return uichg
      })
    )
    return output
  }

  /**
   * @function uimap_render_from_uimap
   * Renders a uimap and returns a rendermap.
   * @param  {uimap} uimap
   * @return {rendermap}
   */
  static t_uimap_render_from_uimap = {
    vx_type: vx_core.t_type
  }
  static e_uimap_render_from_uimap = {
    vx_type: vx_ui_ui.t_uimap_render_from_uimap
  }

  // (func uimap-render<-uimap)
  static f_uimap_render_from_uimap(uimap) {
    let output = vx_ui_ui.e_rendermap
    return output
  }



  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "layout-app": vx_ui_ui.c_layout_app,
      "layout-background": vx_ui_ui.c_layout_background,
      "layout-combobox": vx_ui_ui.c_layout_combobox,
      "layout-flow-horizontal": vx_ui_ui.c_layout_flow_horizontal,
      "layout-flow-vertical": vx_ui_ui.c_layout_flow_vertical,
      "layout-image": vx_ui_ui.c_layout_image,
      "layout-maxpanel": vx_ui_ui.c_layout_maxpanel,
      "layout-menubar": vx_ui_ui.c_layout_menubar,
      "layout-menudrawer": vx_ui_ui.c_layout_menudrawer,
      "layout-navbar": vx_ui_ui.c_layout_navbar,
      "layout-navdrawer": vx_ui_ui.c_layout_navdrawer,
      "layout-panel": vx_ui_ui.c_layout_panel,
      "layout-parallax": vx_ui_ui.c_layout_parallax,
      "layout-scrollbox": vx_ui_ui.c_layout_scrollbox,
      "layout-scrollbox-horizontal": vx_ui_ui.c_layout_scrollbox_horizontal,
      "layout-scrollbox-vertical": vx_ui_ui.c_layout_scrollbox_vertical,
      "layout-split-horizontal": vx_ui_ui.c_layout_split_horizontal,
      "layout-split-vertical": vx_ui_ui.c_layout_split_vertical,
      "layout-statusbar": vx_ui_ui.c_layout_statusbar,
      "layout-statusdrawer": vx_ui_ui.c_layout_statusdrawer,
      "layout-text": vx_ui_ui.c_layout_text,
      "layout-textentry": vx_ui_ui.c_layout_textentry
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "layout": vx_ui_ui.e_layout,
      "point": vx_ui_ui.e_point,
      "pointstyle": vx_ui_ui.e_pointstyle,
      "render": vx_ui_ui.e_render,
      "renderer": vx_ui_ui.e_renderer,
      "rendermap": vx_ui_ui.e_rendermap,
      "style": vx_ui_ui.e_style,
      "stylelist": vx_ui_ui.e_stylelist,
      "stylemap": vx_ui_ui.e_stylemap,
      "stylesheet": vx_ui_ui.e_stylesheet,
      "ui": vx_ui_ui.e_ui,
      "uimap": vx_ui_ui.e_uimap,
      "layout<-style": vx_ui_ui.e_layout_from_style,
      "ui-render<-fn-render-ui-orig-parent": vx_ui_ui.e_ui_render_from_fn_render_ui_orig_parent,
      "ui-render<-ui": vx_ui_ui.e_ui_render_from_ui,
      "ui-render<-ui-orig-parent": vx_ui_ui.e_ui_render_from_ui_orig_parent,
      "ui<-renderer-ui-orig-parent": vx_ui_ui.e_ui_from_renderer_ui_orig_parent,
      "uimap-render<-uimap": vx_ui_ui.e_uimap_render_from_uimap
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "layout<-style": vx_ui_ui.t_layout_from_style,
      "ui-render<-fn-render-ui-orig-parent": vx_ui_ui.t_ui_render_from_fn_render_ui_orig_parent,
      "ui-render<-ui": vx_ui_ui.t_ui_render_from_ui,
      "ui-render<-ui-orig-parent": vx_ui_ui.t_ui_render_from_ui_orig_parent,
      "ui<-renderer-ui-orig-parent": vx_ui_ui.t_ui_from_renderer_ui_orig_parent,
      "uimap-render<-uimap": vx_ui_ui.t_uimap_render_from_uimap
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "layout": vx_ui_ui.t_layout,
      "point": vx_ui_ui.t_point,
      "pointstyle": vx_ui_ui.t_pointstyle,
      "render": vx_ui_ui.t_render,
      "renderer": vx_ui_ui.t_renderer,
      "rendermap": vx_ui_ui.t_rendermap,
      "style": vx_ui_ui.t_style,
      "stylelist": vx_ui_ui.t_stylelist,
      "stylemap": vx_ui_ui.t_stylemap,
      "stylesheet": vx_ui_ui.t_stylesheet,
      "ui": vx_ui_ui.t_ui,
      "uimap": vx_ui_ui.t_uimap
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "vx/ui/ui",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (type layout)
    vx_ui_ui.t_layout['vx_type'] = vx_core.t_type
    vx_ui_ui.t_layout['vx_value'] = {
      name          : "layout",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        }
      },
      proplast      : {
        "name" : "name",
        "type" : vx_core.t_string,
        "multi": false
      }
    }
    vx_ui_ui.e_layout['vx_type'] = vx_ui_ui.t_layout
    vx_ui_ui.e_layout['vx_value'] = {}

    // (type point)
    vx_ui_ui.t_point['vx_type'] = vx_core.t_type
    vx_ui_ui.t_point['vx_value'] = {
      name          : "point",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "x": {
          "name" : "x",
          "type" : vx_core.t_int,
          "multi": false
        },
        "y": {
          "name" : "y",
          "type" : vx_core.t_int,
          "multi": false
        },
        "z": {
          "name" : "z",
          "type" : vx_core.t_int,
          "multi": false
        },
        "t": {
          "name" : "t",
          "type" : vx_core.t_int,
          "multi": false
        },
        "i": {
          "name" : "i",
          "type" : vx_core.t_int,
          "multi": false
        },
        "pointstyle": {
          "name" : "pointstyle",
          "type" : vx_ui_ui.t_pointstyle,
          "multi": false
        }
      },
      proplast      : {
        "name" : "pointstyle",
        "type" : vx_ui_ui.t_pointstyle,
        "multi": false
      }
    }
    vx_ui_ui.e_point['vx_type'] = vx_ui_ui.t_point
    vx_ui_ui.e_point['vx_value'] = {}

    // (type pointstyle)
    vx_ui_ui.t_pointstyle['vx_type'] = vx_core.t_type
    vx_ui_ui.t_pointstyle['vx_value'] = {
      name          : "pointstyle",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_pointstyle['vx_type'] = vx_ui_ui.t_pointstyle
    vx_ui_ui.e_pointstyle['vx_value'] = {}

    // (type render)
    vx_ui_ui.t_render['vx_type'] = vx_core.t_type
    vx_ui_ui.t_render['vx_value'] = {
      name          : "render",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_render['vx_type'] = vx_ui_ui.t_render
    vx_ui_ui.e_render['vx_value'] = {}

    // (type renderer)
    vx_ui_ui.t_renderer['vx_type'] = vx_core.t_type
    vx_ui_ui.t_renderer['vx_value'] = {
      name          : "renderer",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "fn-render": {
          "name" : "fn-render",
          "type" : vx_ui_ui.t_ui_render_from_ui_orig_parent,
          "multi": false
        }
      },
      proplast      : {
        "name" : "fn-render",
        "type" : vx_ui_ui.t_ui_render_from_ui_orig_parent,
        "multi": false
      }
    }
    vx_ui_ui.e_renderer['vx_type'] = vx_ui_ui.t_renderer
    vx_ui_ui.e_renderer['vx_value'] = {}

    // (type rendermap)
    vx_ui_ui.t_rendermap['vx_type'] = vx_core.t_type
    vx_ui_ui.t_rendermap['vx_value'] = {
      name          : "rendermap",
      pkgname       : "vx/ui/ui",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [vx_ui_ui.t_render],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_rendermap['vx_type'] = vx_ui_ui.t_rendermap
    vx_ui_ui.e_rendermap['vx_value'] = {}

    // (type style)
    vx_ui_ui.t_style['vx_type'] = vx_core.t_type
    vx_ui_ui.t_style['vx_value'] = {
      name          : "style",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "name": {
          "name" : "name",
          "type" : vx_core.t_string,
          "multi": false
        },
        "layout": {
          "name" : "layout",
          "type" : vx_ui_ui.t_layout,
          "multi": false
        }
      },
      proplast      : {
        "name" : "layout",
        "type" : vx_ui_ui.t_layout,
        "multi": false
      }
    }
    vx_ui_ui.e_style['vx_type'] = vx_ui_ui.t_style
    vx_ui_ui.e_style['vx_value'] = {}

    // (type stylelist)
    vx_ui_ui.t_stylelist['vx_type'] = vx_core.t_type
    vx_ui_ui.t_stylelist['vx_value'] = {
      name          : "stylelist",
      pkgname       : "vx/ui/ui",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [vx_ui_ui.t_style],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_stylelist['vx_type'] = vx_ui_ui.t_stylelist

    // (type stylemap)
    vx_ui_ui.t_stylemap['vx_type'] = vx_core.t_type
    vx_ui_ui.t_stylemap['vx_value'] = {
      name          : "stylemap",
      pkgname       : "vx/ui/ui",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [vx_ui_ui.t_style],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_stylemap['vx_type'] = vx_ui_ui.t_stylemap
    vx_ui_ui.e_stylemap['vx_value'] = {}

    // (type stylesheet)
    vx_ui_ui.t_stylesheet['vx_type'] = vx_core.t_type
    vx_ui_ui.t_stylesheet['vx_value'] = {
      name          : "stylesheet",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "stylemap": {
          "name" : "stylemap",
          "type" : vx_ui_ui.t_stylemap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "stylemap",
        "type" : vx_ui_ui.t_stylemap,
        "multi": false
      }
    }
    vx_ui_ui.e_stylesheet['vx_type'] = vx_ui_ui.t_stylesheet
    vx_ui_ui.e_stylesheet['vx_value'] = {}

    // (type ui)
    vx_ui_ui.t_ui['vx_type'] = vx_core.t_type
    vx_ui_ui.t_ui['vx_value'] = {
      name          : "ui",
      pkgname       : "vx/ui/ui",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "data": {
          "name" : "data",
          "type" : vx_core.t_any,
          "multi": false
        },
        "eventmap": {
          "name" : "eventmap",
          "type" : vx_event.t_eventmap,
          "multi": false
        },
        "path": {
          "name" : "path",
          "type" : vx_core.t_string,
          "multi": false
        },
        "render": {
          "name" : "render",
          "type" : vx_ui_ui.t_render,
          "multi": false
        },
        "renderer": {
          "name" : "renderer",
          "type" : vx_ui_ui.t_renderer,
          "multi": false
        },
        "style": {
          "name" : "style",
          "type" : vx_ui_ui.t_style,
          "multi": false
        },
        "stylelist": {
          "name" : "stylelist",
          "type" : vx_ui_ui.t_stylelist,
          "multi": false
        },
        "stylesheet": {
          "name" : "stylesheet",
          "type" : vx_ui_ui.t_stylesheet,
          "multi": false
        },
        "uid": {
          "name" : "uid",
          "type" : vx_core.t_string,
          "multi": false
        },
        "uimap": {
          "name" : "uimap",
          "type" : vx_ui_ui.t_uimap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "uimap",
        "type" : vx_ui_ui.t_uimap,
        "multi": false
      }
    }
    vx_ui_ui.e_ui['vx_type'] = vx_ui_ui.t_ui
    vx_ui_ui.e_ui['vx_value'] = {}

    // (type uimap)
    vx_ui_ui.t_uimap['vx_type'] = vx_core.t_type
    vx_ui_ui.t_uimap['vx_value'] = {
      name          : "uimap",
      pkgname       : "vx/ui/ui",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [vx_ui_ui.t_ui],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_uimap['vx_type'] = vx_ui_ui.t_uimap
    vx_ui_ui.e_uimap['vx_value'] = {}

    // (func layout<-style)
    vx_ui_ui.t_layout_from_style['vx_value'] = {
      name          : "layout<-style",
      pkgname       : "vx/ui/ui",
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
      fn            : vx_ui_ui.f_layout_from_style
    }

    // (func ui-render<-fn-render-ui-orig-parent)
    vx_ui_ui.t_ui_render_from_fn_render_ui_orig_parent['vx_value'] = {
      name          : "ui-render<-fn-render-ui-orig-parent",
      pkgname       : "vx/ui/ui",
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
      fn            : vx_ui_ui.f_ui_render_from_fn_render_ui_orig_parent
    }

    // (func ui-render<-ui)
    vx_ui_ui.t_ui_render_from_ui['vx_value'] = {
      name          : "ui-render<-ui",
      pkgname       : "vx/ui/ui",
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
      fn            : vx_ui_ui.f_ui_render_from_ui
    }

    // (func ui-render<-ui-orig-parent)
    vx_ui_ui.t_ui_render_from_ui_orig_parent['vx_value'] = {
      name          : "ui-render<-ui-orig-parent",
      pkgname       : "vx/ui/ui",
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
      fn            : vx_ui_ui.f_ui_render_from_ui_orig_parent
    }

    // (func ui<-renderer-ui-orig-parent)
    vx_ui_ui.t_ui_from_renderer_ui_orig_parent['vx_value'] = {
      name          : "ui<-renderer-ui-orig-parent",
      pkgname       : "vx/ui/ui",
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
      fn            : vx_ui_ui.f_ui_from_renderer_ui_orig_parent
    }

    // (func uimap-render<-uimap)
    vx_ui_ui.t_uimap_render_from_uimap['vx_value'] = {
      name          : "uimap-render<-uimap",
      pkgname       : "vx/ui/ui",
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
      fn            : vx_ui_ui.f_uimap_render_from_uimap
    }

    // (const layout-app)
    Object.assign(vx_ui_ui.c_layout_app, {
      
    })

    // (const layout-background)
    Object.assign(vx_ui_ui.c_layout_background, {
      
    })

    // (const layout-combobox)
    Object.assign(vx_ui_ui.c_layout_combobox, {
      
    })

    // (const layout-flow-horizontal)
    Object.assign(vx_ui_ui.c_layout_flow_horizontal, {
      
    })

    // (const layout-flow-vertical)
    Object.assign(vx_ui_ui.c_layout_flow_vertical, {
      
    })

    // (const layout-image)
    Object.assign(vx_ui_ui.c_layout_image, {
      
    })

    // (const layout-maxpanel)
    Object.assign(vx_ui_ui.c_layout_maxpanel, {
      
    })

    // (const layout-menubar)
    Object.assign(vx_ui_ui.c_layout_menubar, {
      
    })

    // (const layout-menudrawer)
    Object.assign(vx_ui_ui.c_layout_menudrawer, {
      
    })

    // (const layout-navbar)
    Object.assign(vx_ui_ui.c_layout_navbar, {
      
    })

    // (const layout-navdrawer)
    Object.assign(vx_ui_ui.c_layout_navdrawer, {
      
    })

    // (const layout-panel)
    Object.assign(vx_ui_ui.c_layout_panel, {
      
    })

    // (const layout-parallax)
    Object.assign(vx_ui_ui.c_layout_parallax, {
      
    })

    // (const layout-scrollbox)
    Object.assign(vx_ui_ui.c_layout_scrollbox, {
      
    })

    // (const layout-scrollbox-horizontal)
    Object.assign(vx_ui_ui.c_layout_scrollbox_horizontal, {
      
    })

    // (const layout-scrollbox-vertical)
    Object.assign(vx_ui_ui.c_layout_scrollbox_vertical, {
      
    })

    // (const layout-split-horizontal)
    Object.assign(vx_ui_ui.c_layout_split_horizontal, {
      
    })

    // (const layout-split-vertical)
    Object.assign(vx_ui_ui.c_layout_split_vertical, {
      
    })

    // (const layout-statusbar)
    Object.assign(vx_ui_ui.c_layout_statusbar, {
      
    })

    // (const layout-statusdrawer)
    Object.assign(vx_ui_ui.c_layout_statusdrawer, {
      
    })

    // (const layout-text)
    Object.assign(vx_ui_ui.c_layout_text, {
      
    })

    // (const layout-textentry)
    Object.assign(vx_ui_ui.c_layout_textentry, {
      
    })

  }
}
