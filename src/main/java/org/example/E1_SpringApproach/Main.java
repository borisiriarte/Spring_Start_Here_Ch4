package org.example.E1_SpringApproach;

import org.example.E1_SpringApproach.model.Comment;
import org.example.E1_SpringApproach.proxies.EmailCommentNtificationProxy;
import org.example.E1_SpringApproach.repositories.DBCommentRepository;
import org.example.E1_SpringApproach.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var comment = new Comment("Boris", "Please, stop asking for help, you were supposed to be professional when you " +
        "landed on this company");

    var commentService = ctx.getBean(CommentService.class);
    commentService.publishComment(comment);
  }
}
