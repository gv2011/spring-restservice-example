package com.github.gv2011.springrestex;

import com.fasterxml.jackson.databind.module.SimpleDeserializers;

class PhoneDeserializers extends SimpleDeserializers {
  
  PhoneDeserializers(){
    addDeserializer(PhoneBean.class, new PhoneDeserializer());
    addDeserializer(PhoneId.class, new PhoneIdDeserializer());
  }

}
