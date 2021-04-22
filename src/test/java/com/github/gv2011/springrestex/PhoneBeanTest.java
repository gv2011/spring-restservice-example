package com.github.gv2011.springrestex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class PhoneBeanTest {

  @Test
  void testSerialize() throws JsonProcessingException {
    assertThat(
      new ObjectMapper().writeValueAsString(new PhoneBeanImp(new PhoneIdImp("01"), "mobile", "675")),
      is("{\"id\":\"01\",\"type\":\"mobile\",\"number\":\"675\"}"));
  }

  @Test
  void testDeserialize() throws JsonProcessingException {
    new ObjectMapper().registerModule(new NameRestServiceApplication().phoneModule())
    .readValue("{\"id\":\"01\",\"type\":\"mobile\",\"number\":\"675\"}", PhoneBean.class);
  }

}
