package org.example.A5.E5_OtherAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.A5.E5_OtherAnnotations.*")
@EnableAspectJAutoProxy
public class ProjectConfig {
  @Bean
  public LoggingAspect aspect() {
    return new LoggingAspect();
  }
}
