package org.example.A5.E5_OtherAnnotations;

import org.example.A5.E5_OtherAnnotations.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = ctx.getBean(CommentService.class);

    Comment comment = new Comment();
    comment.setText("Demo content");
    comment.setAuthor("Boris");

    service.publishComment(comment);
    service.deleteComment(comment);
    service.editComment(comment);
  }
}
