package org.example.A4.E5_PrototypeMutability;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository {
  void storeComment(Comment comment);
}
