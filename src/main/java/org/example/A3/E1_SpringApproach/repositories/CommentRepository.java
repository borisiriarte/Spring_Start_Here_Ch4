package org.example.A3.E1_SpringApproach.repositories;

import org.example.A3.E1_SpringApproach.model.Comment;

public interface CommentRepository {
  void storeComment(Comment comment);
}
