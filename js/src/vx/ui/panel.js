'strict mode'

import vx_core from "../../vx/core.js"


export default class vx_ui_panel {


  /**
   * type: layout
   * Universal Layout
   */
  static t_layout = {}

  /**
   * type: panel
   */
  static t_panel = {}

  /**
   * type: panelmap
   */
  static t_panelmap = {}
  /**
   * Constant: layout-app
   * {layout}
   */
  static c_layout_app = {vx_type: vx_ui_panel.t_layout, vx_constdef: {pkgname: 'vx/ui/panel', name: 'layout-app'}}

  /**
   * Constant: layout-background
   * {layout}
   */
  static c_layout_background = {vx_type: vx_ui_panel.t_layout, vx_constdef: {pkgname: 'vx/ui/panel', name: 'layout-background'}}

  /**
   * Constant: layout-navigation
   * {layout}
   */
  static c_layout_navigation = {vx_type: vx_ui_panel.t_layout, vx_constdef: {pkgname: 'vx/ui/panel', name: 'layout-navigation'}}

  /**
   * Constant: layout-split-horizontal
   * {layout}
   */
  static c_layout_split_horizontal = {vx_type: vx_ui_panel.t_layout, vx_constdef: {pkgname: 'vx/ui/panel', name: 'layout-split-horizontal'}}

  /**
   * Constant: layout-split-vertical
   * {layout}
   */
  static c_layout_split_vertical = {vx_type: vx_ui_panel.t_layout, vx_constdef: {pkgname: 'vx/ui/panel', name: 'layout-split-vertical'}}

  /**
   * @function any_render_from_panel
   * Returns a rendered object from a panel.
   * @param  {panel} panel
   * @return {any}
   */
  static t_any_render_from_panel = {}
  static e_any_render_from_panel = {vx_type: vx_ui_panel.t_any_render_from_panel}

  // (func any-render<-panel)
  static f_any_render_from_panel(panel) {
    let output = vx_core.e_any
    return output
  }

  /**
   * @function boolean_render_from_panelmap
   * Renders a panelmap and returns true if successful.
   * @param  {panelmap} panelmap
   * @return {boolean}
   */
  static t_boolean_render_from_panelmap = {}
  static e_boolean_render_from_panelmap = {vx_type: vx_ui_panel.t_boolean_render_from_panelmap}

  // (func boolean-render<-panelmap)
  static f_boolean_render_from_panelmap(panelmap) {
    let output = vx_core.e_boolean
    return output
  }

  // empty types
  static e_layout = {}
  static e_panel = {}
  static e_panelmap = {}


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "layout-app": vx_ui_panel.c_layout_app,
      "layout-background": vx_ui_panel.c_layout_background,
      "layout-navigation": vx_ui_panel.c_layout_navigation,
      "layout-split-horizontal": vx_ui_panel.c_layout_split_horizontal,
      "layout-split-vertical": vx_ui_panel.c_layout_split_vertical
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "layout": vx_ui_panel.e_layout,
      "panel": vx_ui_panel.e_panel,
      "panelmap": vx_ui_panel.e_panelmap,
      "any-render<-panel": vx_ui_panel.e_any_render_from_panel,
      "boolean-render<-panelmap": vx_ui_panel.e_boolean_render_from_panelmap
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "any-render<-panel": vx_ui_panel.t_any_render_from_panel,
      "boolean-render<-panelmap": vx_ui_panel.t_boolean_render_from_panelmap
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "layout": vx_ui_panel.t_layout,
      "panel": vx_ui_panel.t_panel,
      "panelmap": vx_ui_panel.t_panelmap
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "vx/ui/panel",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (type layout)
    vx_ui_panel.t_layout['vx_type'] = vx_core.t_type
    vx_ui_panel.t_layout['vx_value'] = {
      name          : "layout",
      pkgname       : "vx/ui/panel",
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
    vx_ui_panel.e_layout['vx_type'] = vx_ui_panel.t_layout
    vx_ui_panel.e_layout['vx_value'] = {}

    // (type panel)
    vx_ui_panel.t_panel['vx_type'] = vx_core.t_type
    vx_ui_panel.t_panel['vx_value'] = {
      name          : "panel",
      pkgname       : "vx/ui/panel",
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
          "type" : vx_ui_panel.t_layout,
          "multi": false
        },
        "data": {
          "name" : "data",
          "type" : vx_core.t_any,
          "multi": false
        },
        "rendered": {
          "name" : "rendered",
          "type" : vx_core.t_any,
          "multi": false
        },
        "render-fn": {
          "name" : "render-fn",
          "type" : vx_ui_panel.t_any_render_from_panel,
          "multi": false
        },
        "panelmap": {
          "name" : "panelmap",
          "type" : vx_ui_panel.t_panelmap,
          "multi": false
        }
      },
      proplast      : {
        "name" : "panelmap",
        "type" : vx_ui_panel.t_panelmap,
        "multi": false
      }
    }
    vx_ui_panel.e_panel['vx_type'] = vx_ui_panel.t_panel
    vx_ui_panel.e_panel['vx_value'] = {}

    // (type panelmap)
    vx_ui_panel.t_panelmap['vx_type'] = vx_core.t_type
    vx_ui_panel.t_panelmap['vx_value'] = {
      name          : "panelmap",
      pkgname       : "vx/ui/panel",
      extends       : ":map",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [vx_ui_panel.t_panel],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_panel.e_panelmap['vx_type'] = vx_ui_panel.t_panelmap
    vx_ui_panel.e_panelmap['vx_value'] = {}

    // (func any-render<-panel)
    vx_ui_panel.t_any_render_from_panel['vx_type'] = vx_core.t_type
    vx_ui_panel.t_any_render_from_panel['vx_value'] = {
      name          : "any-render<-panel",
      pkgname       : "vx/ui/panel",
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
      fn            : vx_ui_panel.f_any_render_from_panel
    }

    // (func boolean-render<-panelmap)
    vx_ui_panel.t_boolean_render_from_panelmap['vx_type'] = vx_core.t_type
    vx_ui_panel.t_boolean_render_from_panelmap['vx_value'] = {
      name          : "boolean-render<-panelmap",
      pkgname       : "vx/ui/panel",
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
      fn            : vx_ui_panel.f_boolean_render_from_panelmap
    }

  }
}
