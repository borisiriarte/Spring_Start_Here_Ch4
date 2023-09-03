package org.example;

import org.example.model.Comment;
import org.example.proxies.EmailCommentNtificationProxy;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;

public class Main {
  public static void main(String[] args) {
    var commentRepository = new DBCommentRepository();
    var commentNotificationProxy = new EmailCommentNtificationProxy();

    var commentService = new CommentService(commentNotificationProxy, commentRepository);

    var comment = new Comment("Boris", "Please, stop posting that kind of content while working");

    commentService.publishComment(comment);
  }
}
