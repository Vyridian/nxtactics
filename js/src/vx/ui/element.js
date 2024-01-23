'strict mode'

import vx_core from "../../vx/core.js"


export default class vx_ui_element {


  /**
   * type: element
   */
  static t_element = {}

  /**
   * type: orientation
   */
  static t_orientation = {}

  /**
   * type: point
   */
  static t_point = {}

  /**
   * type: pointlist
   */
  static t_pointlist = {}

  /**
   * type: style
   */
  static t_style = {}
  // empty types
  static e_element = {}
  static e_orientation = {}
  static e_point = {}
  static e_pointlist = []
  static e_style = {}


  static {
    const constmap = vx_core.vx_new_map(vx_core.t_constmap, {
      
    })
    const emptymap = vx_core.vx_new_map(vx_core.t_map, {
      "element": vx_ui_element.e_element,
      "orientation": vx_ui_element.e_orientation,
      "point": vx_ui_element.e_point,
      "pointlist": vx_ui_element.e_pointlist,
      "style": vx_ui_element.e_style
    })
    const funcmap = vx_core.vx_new_map(vx_core.t_funcmap, {
      
    })
    const typemap = vx_core.vx_new_map(vx_core.t_typemap, {
      "element": vx_ui_element.t_element,
      "orientation": vx_ui_element.t_orientation,
      "point": vx_ui_element.t_point,
      "pointlist": vx_ui_element.t_pointlist,
      "style": vx_ui_element.t_style
    })
    const pkg = vx_core.vx_new_struct(vx_core.t_package, {
      "name": "vx/ui/element",
      "constmap": constmap,
      "emptymap": emptymap,
      "funcmap": funcmap,
      "typemap": typemap
    })
    vx_core.vx_global_package_set(pkg)

    // (type element)
    vx_ui_element.t_element['vx_type'] = vx_core.t_type
    vx_ui_element.t_element['vx_value'] = {
      name          : "element",
      pkgname       : "vx/ui/element",
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
        "style": {
          "name" : "style",
          "type" : vx_ui_element.t_style,
          "multi": false
        }
      },
      proplast      : {
        "name" : "style",
        "type" : vx_ui_element.t_style,
        "multi": false
      }
    }
    vx_ui_element.e_element['vx_type'] = vx_ui_element.t_element
    vx_ui_element.e_element['vx_value'] = {}

    // (type orientation)
    vx_ui_element.t_orientation['vx_type'] = vx_core.t_type
    vx_ui_element.t_orientation['vx_value'] = {
      name          : "orientation",
      pkgname       : "vx/ui/element",
      extends       : ":struct",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {
        "rotate-x": {
          "name" : "rotate-x",
          "type" : vx_core.t_float,
          "multi": false
        },
        "rotate-y": {
          "name" : "rotate-y",
          "type" : vx_core.t_float,
          "multi": false
        },
        "rotate-z": {
          "name" : "rotate-z",
          "type" : vx_core.t_float,
          "multi": false
        }
      },
      proplast      : {
        "name" : "rotate-z",
        "type" : vx_core.t_float,
        "multi": false
      }
    }
    vx_ui_element.e_orientation['vx_type'] = vx_ui_element.t_orientation
    vx_ui_element.e_orientation['vx_value'] = {}

    // (type point)
    vx_ui_element.t_point['vx_type'] = vx_core.t_type
    vx_ui_element.t_point['vx_value'] = {
      name          : "point",
      pkgname       : "vx/ui/element",
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
          "type" : vx_core.t_float,
          "multi": false
        },
        "y": {
          "name" : "y",
          "type" : vx_core.t_float,
          "multi": false
        },
        "z": {
          "name" : "z",
          "type" : vx_core.t_float,
          "multi": false
        }
      },
      proplast      : {
        "name" : "z",
        "type" : vx_core.t_float,
        "multi": false
      }
    }
    vx_ui_element.e_point['vx_type'] = vx_ui_element.t_point
    vx_ui_element.e_point['vx_value'] = {}

    // (type pointlist)
    vx_ui_element.t_pointlist['vx_type'] = vx_core.t_type
    vx_ui_element.t_pointlist['vx_value'] = {
      name          : "pointlist",
      pkgname       : "vx/ui/element",
      extends       : ":list",
      allowfuncs    : [],
      disallowfuncs : [],
      allowtypes    : [vx_ui_element.t_point],
      disallowtypes : [],
      allowvalues   : [],
      disallowvalues: [],
      traits        : [],
      properties    : {},
      proplast      : {}
    }
    vx_ui_element.e_pointlist['vx_type'] = vx_ui_element.t_pointlist

    // (type style)
    vx_ui_element.t_style['vx_type'] = vx_core.t_type
    vx_ui_element.t_style['vx_value'] = {
      name          : "style",
      pkgname       : "vx/ui/element",
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
        "pointlist": {
          "name" : "pointlist",
          "type" : vx_ui_element.t_pointlist,
          "multi": false
        },
        "orientation": {
          "name" : "orientation",
          "type" : vx_ui_element.t_orientation,
          "multi": false
        }
      },
      proplast      : {
        "name" : "orientation",
        "type" : vx_ui_element.t_orientation,
        "multi": false
      }
    }
    vx_ui_element.e_style['vx_type'] = vx_ui_element.t_style
    vx_ui_element.e_style['vx_value'] = {}

  }
}
