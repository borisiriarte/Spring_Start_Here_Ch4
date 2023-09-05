package org.example.A4.E4_Prototype_AutoWiringBehaviour;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var s1 = ctx.getBean(CommentService.class);
    var s2 = ctx.getBean(UserService.class);

    boolean eq = s1.getCommentRepository() == s2.getCommentRepository();

    System.out.println(eq);
  }
}
