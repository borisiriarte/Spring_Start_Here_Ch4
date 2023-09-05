package org.example.A4.E0_SingletonScopedBeans;

import org.example.A4.E0_SingletonScopedBeans.model.Comment;
import org.example.A4.E0_SingletonScopedBeans.services.CommentService;
import org.example.A4.E0_SingletonScopedBeans.services.CommentService1;
import org.example.A4.E0_SingletonScopedBeans.services.UserService1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var a = ctx.getBean("commentService", CommentService.class);
    var b = ctx.getBean("commentService", CommentService.class);

    boolean e1= a == b;

    System.out.println(e1);

    var s1 = ctx.getBean(CommentService1.class);
    var s2 = ctx.getBean(UserService1.class);

    boolean e2 = s1.getCommentRepository() == s2.getCommentRepository();
    System.out.println(e2);
  }
}
