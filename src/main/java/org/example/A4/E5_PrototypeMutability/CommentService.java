package org.example.A4.E5_PrototypeMutability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
  @Autowired
  private ApplicationContext context;
  public void sendComment(Comment c) {
    CommentProcessor p = context.getBean(CommentProcessor.class);

    p.setComment(c);
    p.processComment();
    p.validateComment();

    c = p.getComment();
  }
}
