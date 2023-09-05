package org.example.A3.E1_SpringApproach.services;

import org.example.A3.E1_SpringApproach.model.Comment;
import org.example.A3.E1_SpringApproach.proxies.CommentNotificationProxy;
import org.example.A3.E1_SpringApproach.repositories.CommentRepository;
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
