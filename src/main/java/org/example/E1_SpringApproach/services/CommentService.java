package org.example.E1_SpringApproach.services;

import org.example.E1_SpringApproach.model.Comment;
import org.example.E1_SpringApproach.proxies.CommentNotificationProxy;
import org.example.E1_SpringApproach.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
  private final CommentNotificationProxy commentNotificationProxy;
  private final CommentRepository commentRepository;

  /*@Autowired*/
  public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
    this.commentNotificationProxy = commentNotificationProxy;
    this.commentRepository = commentRepository;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
