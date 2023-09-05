package org.example.A4.E2_Prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
    var bean1 = ctx.getBean(CommentService.class);
    var bean2 = ctx.getBean(CommentService.class);

    boolean e1 = bean1 == bean2;
    System.out.println(e1);
  }
}
