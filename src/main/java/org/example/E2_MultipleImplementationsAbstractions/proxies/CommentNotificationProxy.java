package org.example.E2_MultipleImplementationsAbstractions.proxies;

import org.example.E2_MultipleImplementationsAbstractions.model.Comment;

public interface CommentNotificationProxy {
  void sendComment(Comment comment);
}
