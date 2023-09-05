package org.example.A4.E0_SingletonScopedBeans.repositories;

import org.example.A4.E0_SingletonScopedBeans.model.Comment;

public interface CommentRepository {
  void storeComment(Comment comment);
}
