package com.github.gv2011.springrestex;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class PhoneIdDeserializer extends JsonDeserializer<PhoneId> {

  @Override
  public PhoneId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    return new PhoneIdImp(p.nextTextValue());
  }


}
