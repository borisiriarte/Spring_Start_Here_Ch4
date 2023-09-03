package org.example.E1_SpringApproach;

import org.example.E1_SpringApproach.model.Comment;
import org.example.E1_SpringApproach.proxies.EmailCommentNtificationProxy;
import org.example.E1_SpringApproach.repositories.DBCommentRepository;
import org.example.E1_SpringApproach.services.CommentService;

public class Main {
  public static void main(String[] args) {
    var commentRepository = new DBCommentRepository();
    var commentNotificationProxy = new EmailCommentNtificationProxy();

    var commentService = new CommentService(commentNotificationProxy, commentRepository);

    var comment = new Comment("Boris", "Please, stop posting that kind of content while working");

    commentService.publishComment(comment);
  }
}
