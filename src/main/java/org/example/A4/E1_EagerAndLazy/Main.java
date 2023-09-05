package org.example.A4.E1_EagerAndLazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    //This part will show you the @lazy approach
    System.out.println("Before retrieving the CommentService");
    var service = ctx.getBean(CommentService.class);
    System.out.println("After retrieving the CommentService");
  }
}
