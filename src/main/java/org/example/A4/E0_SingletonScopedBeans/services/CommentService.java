package org.example.A4.E0_SingletonScopedBeans.services;

import org.example.A4.E0_SingletonScopedBeans.model.Comment;
import org.example.A4.E0_SingletonScopedBeans.proxies.CommentNotificationProxy;
import org.example.A4.E0_SingletonScopedBeans.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
