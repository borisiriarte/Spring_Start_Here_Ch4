package org.example.A5.E2_AlteringParametersAndReturnValue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.A5.E2_AlteringParametersAndReturnValue.*")
@EnableAspectJAutoProxy
public class ProjectConfig {
  @Bean
  public LoggingAspect aspect() {
    return new LoggingAspect();
  }
}
