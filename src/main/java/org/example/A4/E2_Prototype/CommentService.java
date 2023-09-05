package org.example.A4.E2_Prototype;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {
  public CommentService() {
    System.out.println("This has been created or instanciated");
  }
}
