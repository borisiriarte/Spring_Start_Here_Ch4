package org.example.A4.E0_SingletonScopedBeans.services;

import org.example.A4.E0_SingletonScopedBeans.repositories.CommentRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService1 {
  @Autowired
  private CommentRepository1 commentRepository;

  public void setCommentRepository(CommentRepository1 commentRepository) {
    this.commentRepository = commentRepository;
  }

  public CommentRepository1 getCommentRepository() {
    return commentRepository;
  }
}
