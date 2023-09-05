package org.example.A3.E0_NoSpringApproach.repositories;

import org.example.A3.E0_NoSpringApproach.model.Comment;

public class DBCommentRepository implements CommentRepository{

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: " + comment.getText());
  }
}
