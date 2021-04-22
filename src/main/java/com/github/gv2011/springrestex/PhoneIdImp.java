package com.github.gv2011.springrestex;

class PhoneIdImp implements PhoneId {

  private final String id;

  PhoneIdImp(String id) {
    this.id = id;
  }
  
  @Override
  public String toString(){
    return id;
  }

}
