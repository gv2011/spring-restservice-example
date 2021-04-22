package com.github.gv2011.springrestex;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameRestServiceController {

	private final AtomicLong counter = new AtomicLong();

  @GetMapping("/names")
  public NameBean names(@RequestParam(value = "name", defaultValue = "Jörg") String name) {
    return new NameBean(counter.incrementAndGet(), name);
  }

  @GetMapping("/phones/{phoneId}")
  public PhoneBean phones(@PathVariable PhoneId phoneId) {
    return new PhoneBeanImp(phoneId, "fax", "+49 1234");
  }
}
