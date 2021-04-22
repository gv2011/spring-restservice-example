package com.github.gv2011.springrestex;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

final class PhoneDeserializer extends JsonDeserializer<PhoneBean> {

  @Override
  public PhoneBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    return ctxt.readValue(p, PhoneBeanImp.class);
  }

}
