'strict mode'

import vx_core from "../../vx/core.js"


export default class vx_ui_ui {


  /**
   * type: render
   * Universal Rendered UI
   */
  static t_render = {}

  /**
   * type: renderer
   * Universal Renderer
   */
  static t_renderer = {}

  /**
   * type: rendermap
   * Map of render
   */
  static t_rendermap = {}

  /**
   * type: ui
   * Universal UI Element
   */
  static t_ui = {}

  /**
   * type: uilayout
   * Universal Layout
   */
  static t_uilayout = {}

  /**
   * type: uimap
   */
  static t_uimap = {}

  /**
   * type: uistyle
   */
  static t_uistyle = {}
  /**
   * Constant: uilayout-app
   * {uilayout}
   */
  static c_uilayout_app = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-app'}}

  /**
   * Constant: uilayout-background
   * {uilayout}
   */
  static c_uilayout_background = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-background'}}

  /**
   * Constant: uilayout-combobox
   * {uilayout}
   */
  static c_uilayout_combobox = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-combobox'}}

  /**
   * Constant: uilayout-flow-horizontal
   * {uilayout}
   */
  static c_uilayout_flow_horizontal = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-flow-horizontal'}}

  /**
   * Constant: uilayout-flow-vertical
   * {uilayout}
   */
  static c_uilayout_flow_vertical = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-flow-vertical'}}

  /**
   * Constant: uilayout-image
   * {uilayout}
   */
  static c_uilayout_image = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-image'}}

  /**
   * Constant: uilayout-navigation
   * {uilayout}
   */
  static c_uilayout_navigation = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-navigation'}}

  /**
   * Constant: uilayout-panel
   * {uilayout}
   */
  static c_uilayout_panel = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-panel'}}

  /**
   * Constant: uilayout-parallax
   * {uilayout}
   */
  static c_uilayout_parallax = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-parallax'}}

  /**
   * Constant: uilayout-scrollbox
   * {uilayout}
   */
  static c_uilayout_scrollbox = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-scrollbox'}}

  /**
   * Constant: uilayout-scrollbox-horizontal
   * {uilayout}
   */
  static c_uilayout_scrollbox_horizontal = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-scrollbox-horizontal'}}

  /**
   * Constant: uilayout-scrollbox-vertical
   * {uilayout}
   */
  static c_uilayout_scrollbox_vertical = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-scrollbox-vertical'}}

  /**
   * Constant: uilayout-split-horizontal
   * {uilayout}
   */
  static c_uilayout_split_horizontal = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-split-horizontal'}}

  /**
   * Constant: uilayout-split-vertical
   * {uilayout}
   */
  static c_uilayout_split_vertical = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-split-vertical'}}

  /**
   * Constant: uilayout-text
   * {uilayout}
   */
  static c_uilayout_text = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-text'}}

  /**
   * Constant: uilayout-textentry
   * {uilayout}
   */
  static c_uilayout_textentry = {vx_type: vx_ui_ui.t_uilayout, vx_constdef: {pkgname: 'vx/ui/ui', name: 'uilayout-textentry'}}

  /**
   * @function render_from_ui
   * Returns a rendered object from a UI Element.
   * @param  {ui} uichg
   * @return {render}
   */
  static t_render_from_ui = {}
  static e_render_from_ui = {vx_type: vx_ui_ui.t_render_from_ui}

  // (func render<-ui)
  static f_render_from_ui(uichg) {
    let output = vx_ui_ui.e_render
    output = vx_ui_ui.f_render_from_ui_orig(
      uichg,
      vx_core.f_empty(
        vx_ui_ui.t_ui
      )
    )
    return output
  }

  /**
   * @function render_from_ui_orig
   * Returns a rendered object from a UI Element.
   * @param  {ui} uichg
   * @param  {ui} uiorig
   * @return {render}
   */
  static t_render_from_ui_orig = {}
  static e_render_from_ui_orig = {vx_type: vx_ui_ui.t_render_from_ui_orig}

  // (func render<-ui-orig)
  static f_render_from_ui_orig(uichg, uiorig) {
    let output = vx_ui_ui.e_render
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_render},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(uichg, uiorig)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return uiorig})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_render},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const renderer = vx_core.f_any_from_struct(
              {"any-1": vx_ui_ui.t_renderer, "struct-2": vx_ui_ui.t_ui},
              vx_ui_ui.t_ui,
              ":renderer"
            )
            const renderchg = vx_core.f_empty(
              vx_ui_ui.t_render
            )
            return renderchg
          })
        )})
      )
    )
    return output
  }

  /**
   * @function rendermap_from_uimap
   * Renders a uimap and returns a rendermap.
   * @param  {uimap} uimap
   * @return {rendermap}
   */
  static t_rendermap_from_uimap = {}
  static e_rendermap_from_uimap = {vx_type: vx_ui_ui.t_rendermap_from_uimap}

  // (func rendermap<-uimap)
  static f_rendermap_from_uimap(uimap) {
    let output = vx_ui_ui.e_rendermap
    return output
  }

  /**
   * @function ui_render_from_ui_orig
   * Returns a rendered object from a UI Element.
   * @param  {ui} uichg
   * @param  {ui} uiorig
   * @return {ui}
   */
  static t_ui_render_from_ui_orig = {}
  static e_ui_render_from_ui_orig = {vx_type: vx_ui_ui.t_ui_render_from_ui_orig}

  // (func ui-render<-ui-orig)
  static f_ui_render_from_ui_orig(uichg, uiorig) {
    let output = vx_ui_ui.e_ui
    output = vx_core.f_if_2(
      {"any-1": vx_ui_ui.t_ui},
      vx_core.f_then(
        vx_core.f_new(vx_core.t_boolean_from_func, () => {return vx_core.f_eqeq(uichg, uiorig)}),
        vx_core.f_new(vx_core.t_any_from_func, () => {return uiorig})
      ),
      vx_core.f_else(
        vx_core.f_new(vx_core.t_any_from_func, () => {return vx_core.f_let(
          {"any-1": vx_ui_ui.t_ui},
          [],
          vx_core.f_new(vx_core.t_any_from_func, () => {
            const rndr = vx_ui_ui.f_render_from_ui_orig(uichg, uiorig)
            return vx_core.f_copy(
              uichg,
              ":render",
              vx_ui_ui.t_render
            )
          })
        )})
      )
    )
    return output
  }

  // empty types
  static e_render = {}
  static e_renderer = {}
  static e_rendermap = {}
  static e_ui = {}
  static e_uilayout = {}
  static e_uimap = {}
  static e_uistyle = {}


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      "uilayout-app": vx_ui_ui.c_uilayout_app,
      "uilayout-background": vx_ui_ui.c_uilayout_background,
      "uilayout-combobox": vx_ui_ui.c_uilayout_combobox,
      "uilayout-flow-horizontal": vx_ui_ui.c_uilayout_flow_horizontal,
      "uilayout-flow-vertical": vx_ui_ui.c_uilayout_flow_vertical,
      "uilayout-image": vx_ui_ui.c_uilayout_image,
      "uilayout-navigation": vx_ui_ui.c_uilayout_navigation,
      "uilayout-panel": vx_ui_ui.c_uilayout_panel,
      "uilayout-parallax": vx_ui_ui.c_uilayout_parallax,
      "uilayout-scrollbox": vx_ui_ui.c_uilayout_scrollbox,
      "uilayout-scrollbox-horizontal": vx_ui_ui.c_uilayout_scrollbox_horizontal,
      "uilayout-scrollbox-vertical": vx_ui_ui.c_uilayout_scrollbox_vertical,
      "uilayout-split-horizontal": vx_ui_ui.c_uilayout_split_horizontal,
      "uilayout-split-vertical": vx_ui_ui.c_uilayout_split_vertical,
      "uilayout-text": vx_ui_ui.c_uilayout_text,
      "uilayout-textentry": vx_ui_ui.c_uilayout_textentry
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "render": vx_ui_ui.e_render,
      "renderer": vx_ui_ui.e_renderer,
      "rendermap": vx_ui_ui.e_rendermap,
      "ui": vx_ui_ui.e_ui,
      "uilayout": vx_ui_ui.e_uilayout,
      "uimap": vx_ui_ui.e_uimap,
      "uistyle": vx_ui_ui.e_uistyle,
      "render<-ui": vx_ui_ui.e_render_from_ui,
      "render<-ui-orig": vx_ui_ui.e_render_from_ui_orig,
      "rendermap<-uimap": vx_ui_ui.e_rendermap_from_uimap,
      "ui-render<-ui-orig": vx_ui_ui.e_ui_render_from_ui_orig
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      "render<-ui": vx_ui_ui.t_render_from_ui,
      "render<-ui-orig": vx_ui_ui.t_render_from_ui_orig,
      "rendermap<-uimap": vx_ui_ui.t_rendermap_from_uimap,
      "ui-render<-ui-orig": vx_ui_ui.t_ui_render_from_ui_orig
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "render": vx_ui_ui.t_render,
      "renderer": vx_ui_ui.t_renderer,
      "rendermap": vx_ui_ui.t_rendermap,
      "ui": vx_ui_ui.t_ui,
      "uilayout": vx_ui_ui.t_uilayout,
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
        "uid": {
          "name" : "uid",
          "type" : vx_core.t_string,
          "multi": false
        },
        "uilayout": {
          "name" : "uilayout",
          "type" : vx_ui_ui.t_uilayout,
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

    // (type uilayout)
    vx_ui_ui.t_uilayout['vx_type'] = vx_core.t_type
    vx_ui_ui.t_uilayout['vx_value'] = {
      name          : "uilayout",
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
    vx_ui_ui.e_uilayout['vx_type'] = vx_ui_ui.t_uilayout
    vx_ui_ui.e_uilayout['vx_value'] = {}

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
      properties    : {},
      proplast      : {}
    }
    vx_ui_ui.e_uistyle['vx_type'] = vx_ui_ui.t_uistyle
    vx_ui_ui.e_uistyle['vx_value'] = {}

    // (func render<-ui)
    vx_ui_ui.t_render_from_ui['vx_type'] = vx_core.t_type
    vx_ui_ui.t_render_from_ui['vx_value'] = {
      name          : "render<-ui",
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
      fn            : vx_ui_ui.f_render_from_ui
    }

    // (func render<-ui-orig)
    vx_ui_ui.t_render_from_ui_orig['vx_type'] = vx_core.t_type
    vx_ui_ui.t_render_from_ui_orig['vx_value'] = {
      name          : "render<-ui-orig",
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
      fn            : vx_ui_ui.f_render_from_ui_orig
    }

    // (func rendermap<-uimap)
    vx_ui_ui.t_rendermap_from_uimap['vx_type'] = vx_core.t_type
    vx_ui_ui.t_rendermap_from_uimap['vx_value'] = {
      name          : "rendermap<-uimap",
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
      fn            : vx_ui_ui.f_rendermap_from_uimap
    }

    // (func ui-render<-ui-orig)
    vx_ui_ui.t_ui_render_from_ui_orig['vx_type'] = vx_core.t_type
    vx_ui_ui.t_ui_render_from_ui_orig['vx_value'] = {
      name          : "ui-render<-ui-orig",
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
      fn            : vx_ui_ui.f_ui_render_from_ui_orig
    }

  }
}
