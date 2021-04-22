package com.github.gv2011.springrestex;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneBeanImp implements PhoneBean{

  private final PhoneId id;
  private final String type;
  private final String number;

  @JsonCreator
  public PhoneBeanImp(@JsonProperty("id") PhoneId id, @JsonProperty("type") String type, @JsonProperty("number") String number) {
    this.id = id;
    this.type = type;
    this.number = number;
  }

  @Override
  public PhoneId id() {
    return id;
  }

  @Override
  public String number() {
    return number;
  }

  @Override
  public String type() {
    return type;
  }

}
