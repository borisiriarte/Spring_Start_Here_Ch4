package org.example.A5.E6_Chaining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.A5.E6_Chaining.*")
@EnableAspectJAutoProxy
public class ProjectConfig {
  @Bean
  public LoggingAspect loggingAspect() {
    return new LoggingAspect();
  }

  @Bean
  public SecurityAspect securityAspect() {
    return new SecurityAspect();
  }
}
