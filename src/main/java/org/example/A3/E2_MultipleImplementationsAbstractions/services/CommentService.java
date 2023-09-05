package org.example.A3.E2_MultipleImplementationsAbstractions.services;

import org.example.A3.E2_MultipleImplementationsAbstractions.model.Comment;
import org.example.A3.E2_MultipleImplementationsAbstractions.repositories.CommentRepository;
import org.example.A3.E2_MultipleImplementationsAbstractions.proxies.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*@Component*/
@Service
public class CommentService {
  private final CommentNotificationProxy commentNotificationProxy;
  private final CommentRepository commentRepository;

  /*@Autowired*/
  public CommentService(@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
    this.commentNotificationProxy = commentNotificationProxy;
    this.commentRepository = commentRepository;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
