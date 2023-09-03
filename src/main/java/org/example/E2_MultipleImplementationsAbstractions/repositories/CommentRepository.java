package org.example.E2_MultipleImplementationsAbstractions.repositories;

import org.example.E2_MultipleImplementationsAbstractions.model.Comment;

public interface CommentRepository {
  void storeComment(Comment comment);
}
