package com.github.gv2011.springrestex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;

import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackageClasses = { NameRestServiceController.class })
public class NameRestServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(NameRestServiceApplication.class, args);
  }
  
  @Bean
  public Module phoneModule() {
      SimpleModule module = new SimpleModule();
      module.setDeserializers(new PhoneDeserializers());
      return module;
  }
  
  @Bean
  public WebMvcConfigurer webConfig(){
    return new WebMvcConfigurer(){
      @Override
      public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new Converter<String,PhoneId>(){
          @Override
          public PhoneId convert(String source) {
            return new PhoneIdImp(source);
          }
        });
      }
    };
  }
  
  @Bean
  public Docket docket(){
    return new Docket(DocumentationType.OAS_30).directModelSubstitute(PhoneId.class, String.class);
  }
}
