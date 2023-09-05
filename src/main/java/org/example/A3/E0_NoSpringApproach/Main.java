package org.example.A3.E0_NoSpringApproach;

import org.example.A3.E0_NoSpringApproach.model.Comment;
import org.example.A3.E0_NoSpringApproach.proxies.EmailCommentNtificationProxy;
import org.example.A3.E0_NoSpringApproach.repositories.DBCommentRepository;
import org.example.A3.E0_NoSpringApproach.services.CommentService;

public class Main {
  public static void main(String[] args) {
    var commentRepository = new DBCommentRepository();
    var commentNotificationProxy = new EmailCommentNtificationProxy();

    var commentService = new CommentService(commentNotificationProxy, commentRepository);

    var comment = new Comment("Boris", "Please, stop posting that kind of content while working");

    commentService.publishComment(comment);
  }
}
