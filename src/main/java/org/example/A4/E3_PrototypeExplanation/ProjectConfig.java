package org.example.A4.E3_PrototypeExplanation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
  @Bean
  @Scope("prototype")
  public CommentService commentService(){
    return new CommentService();
  }
}
