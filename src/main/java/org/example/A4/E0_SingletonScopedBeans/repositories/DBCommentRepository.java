package org.example.A4.E0_SingletonScopedBeans.repositories;

import org.example.A4.E0_SingletonScopedBeans.model.Comment;
import org.springframework.stereotype.Repository;


public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: " + comment.getText());
  }
}
