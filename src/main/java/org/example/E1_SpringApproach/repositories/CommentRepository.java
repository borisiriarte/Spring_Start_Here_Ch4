package org.example.E1_SpringApproach.repositories;

import org.example.E1_SpringApproach.model.Comment;

public interface CommentRepository {
  void storeComment(Comment comment);
}
