package com.xkcoding.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class DeveloperPropertyAnother {

  @Value("${developer.name}")
  private String name;

  @Value("${developer.website}")
  private String website;

  @Value("${developer.qq}")
  private String qq;

  @Value("${developer.phone-number}")
  private String phoneNumber;

}
