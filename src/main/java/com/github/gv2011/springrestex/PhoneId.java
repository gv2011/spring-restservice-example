package com.github.gv2011.springrestex;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;

@ApiModel(reference="string")
public interface PhoneId extends TypedString<PhoneId>{
  
  @JsonValue
  @Override
  String toString();

}
