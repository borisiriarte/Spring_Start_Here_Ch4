package org.example.A5.E3_AlterCallByChangingParametersOrReturnedValue;

import org.example.A5.E3_AlterCallByChangingParametersOrReturnedValue.services.CommentService;
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

    String value = service.publishComment(comment);

    logger.info(value);
  }
}
