package org.example.A3.E0_NoSpringApproach.services;

import org.example.A3.E0_NoSpringApproach.model.Comment;
import org.example.A3.E0_NoSpringApproach.proxies.CommentNotificationProxy;
import org.example.A3.E0_NoSpringApproach.repositories.CommentRepository;

public class CommentService {
  private final CommentNotificationProxy commentNotificationProxy;
  private final CommentRepository commentRepository;

  public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
    this.commentNotificationProxy = commentNotificationProxy;
    this.commentRepository = commentRepository;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
