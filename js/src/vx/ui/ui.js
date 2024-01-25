'strict mode'

import vx_core from "../../vx/core.js"


export default class vx_ui_ui {


  /**
   * type: layout
   * Universal Layout
   */
  static t_layout = {}

  /**
   * type: ui
   * Universal UI Element
   */
  static t_ui = {}

  /**
   * type: uimap
   */
  static t_uimap = {}

  /**
   * type: uistyle
   */
  static t_uistyle = {}
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
   * Constant: layout-navigation
   * {layout}
   */
  static c_layout_navigation = {vx_type: vx_ui_ui.t_layout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'layout-navigation'}}

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
   * @function any_render_from_ui
   * Returns a rendered object from a UI Element.
   * @param  {ui} ui
   * @return {any}
   */
  static t_any_render_from_ui = {}
  static e_any_render_from_ui = {vx_type: vx_ui_ui.t_any_render_from_ui}

  // (func any-render<-ui)
  static f_any_render_from_ui(ui) {
    let output = vx_core.e_any
    return output
  }

  /**
   * @function anymap_render_from_uimap
   * Renders a uimap and returns the map of rendered elements.
   * @param  {uimap} uimap
   * @return {boolean}
   */
  static t_anymap_render_from_uimap = {}
  static e_anymap_render_from_uimap = {vx_type: vx_ui_ui.t_anymap_render_from_uimap}

  // (func anymap-render<-uimap)
  static f_anymap_render_from_uimap(uimap) {
    let output = vx_core.e_boolean
    return output
  }

  // empty types
  static e_layout = {}
  static e_ui = {}
  static e_uimap = {}
  static e_uistyle = {}


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "layout-app": vx_ui_ui.c_layout_app,
      "layout-background": vx_ui_ui.c_layout_background,
      "layout-navigation": vx_ui_ui.c_layout_navigation,
      "layout-split-horizontal": vx_ui_ui.c_layout_split_horizontal,
      "layout-split-vertical": vx_ui_ui.c_layout_split_vertical
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "layout": vx_ui_ui.e_layout,
      "ui": vx_ui_ui.e_ui,
      "uimap": vx_ui_ui.e_uimap,
      "uistyle": vx_ui_ui.e_uistyle,
      "any-render<-ui": vx_ui_ui.e_any_render_from_ui,
      "anymap-render<-uimap": vx_ui_ui.e_anymap_render_from_uimap
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "any-render<-ui": vx_ui_ui.t_any_render_from_ui,
      "anymap-render<-uimap": vx_ui_ui.t_anymap_render_from_uimap
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "layout": vx_ui_ui.t_layout,
      "ui": vx_ui_ui.t_ui,
      "uimap": vx_ui_ui.t_uimap,
      "uistyle": vx_ui_ui.t_uistyle
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
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_layout['vx_type'] = vx_ui_ui.t_layout
    vx_ui_ui.e_layout['vx_value'] = {}

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
        "datamap": {
          "name" : "datamap",
          "type" : vx_core.t_anymap,
          "multi": false
        },
        "rendered": {
          "name" : "rendered",
          "type" : vx_core.t_any,
          "multi": false
        },
        "render-fn": {
          "name" : "render-fn",
          "type" : vx_ui_ui.t_any_render_from_ui,
          "multi": false
        },
        "uimap": {
          "name" : "uimap",
          "type" : vx_ui_ui.t_uimap,
          "multi": false
        },
        "uistyle": {
          "name" : "uistyle",
          "type" : vx_ui_ui.t_uistyle,
          "multi": false
        }
      },
      proplast      : {
        "name" : "uistyle",
        "type" : vx_ui_ui.t_uistyle,
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

    // (type uistyle)
    vx_ui_ui.t_uistyle['vx_type'] = vx_core.t_type
    vx_ui_ui.t_uistyle['vx_value'] = {
      name          : "uistyle",
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
    vx_ui_ui.e_uistyle['vx_type'] = vx_ui_ui.t_uistyle
    vx_ui_ui.e_uistyle['vx_value'] = {}

    // (func any-render<-ui)
    vx_ui_ui.t_any_render_from_ui['vx_type'] = vx_core.t_type
    vx_ui_ui.t_any_render_from_ui['vx_value'] = {
      name          : "any-render<-ui",
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
      fn            : vx_ui_ui.f_any_render_from_ui
    }

    // (func anymap-render<-uimap)
    vx_ui_ui.t_anymap_render_from_uimap['vx_type'] = vx_core.t_type
    vx_ui_ui.t_anymap_render_from_uimap['vx_value'] = {
      name          : "anymap-render<-uimap",
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
      fn            : vx_ui_ui.f_anymap_render_from_uimap
    }

  }
}
