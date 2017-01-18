
package com.reactpackagename;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class RNPackageNameModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNPackageNameModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Nullable
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put("PACKAGE_NAME", reactContext.getPackageName());
    return constants;
  }

  @Override
  public String getName() {
    return "RNPackageName";
  }

}