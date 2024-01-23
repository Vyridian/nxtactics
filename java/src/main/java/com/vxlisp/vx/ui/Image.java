package com.vxlisp.vx.ui;

import java.util.LinkedHashMap;
import java.util.Map;
import com.vxlisp.vx.*;

public final class Image {


  static {
    Map<String, Core.Type_any> maptype = new LinkedHashMap<>();
    Map<String, Core.Type_any> mapconst = new LinkedHashMap<>();
    Map<String, Core.Type_func> mapfunc = new LinkedHashMap<>();
    Core.vx_global_package_set("vx/ui/image", maptype, mapconst, mapfunc);
  }

}
