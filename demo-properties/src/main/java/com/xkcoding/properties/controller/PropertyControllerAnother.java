package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.properties.property.ApplicationPropertyAnother;
import com.xkcoding.properties.property.DeveloperPropertyAnother;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyControllerAnother {

  private final ApplicationPropertyAnother applicationPropertyAnother;
  private final DeveloperPropertyAnother developerPropertyAnother;

  @Autowired
  public PropertyControllerAnother(ApplicationPropertyAnother applicationPropertyAnother, DeveloperPropertyAnother developerPropertyAnother) {
    this.applicationPropertyAnother = applicationPropertyAnother;
    this.developerPropertyAnother = developerPropertyAnother;
  }

  @GetMapping("/propertyAnother")
  public Dict index() {
    return Dict.create().set("applicationPropertyAnother", applicationPropertyAnother).set("developerPropertyAnother", developerPropertyAnother);
  }

}
