package org.example.E0_NoSpringApproach.repositories;

import org.example.E0_NoSpringApproach.model.Comment;

public interface CommentRepository {
  void storeComment(Comment comment);
}
