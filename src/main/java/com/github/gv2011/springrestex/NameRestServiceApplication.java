package com.github.gv2011.springrestex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackageClasses = { NameRestServiceController.class })
public class NameRestServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(NameRestServiceApplication.class, args);
  }

}
