package com.github.gv2011.springrestex;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public interface PhoneBean {
  
  @JsonProperty
  @ApiModelProperty(dataType = "java.lang.String")
  PhoneId id();
  
  @JsonProperty
  String number();
  
  @JsonProperty
  String type();

}
