package org.example.A5.E1_AspectsApproach;

import org.example.A5.E1_AspectsApproach.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = ctx.getBean(CommentService.class);

    Comment comment = new Comment();
    comment.setText("Demo content");
    comment.setAuthor("Boris");

    service.publishComment(comment);
  }
}
