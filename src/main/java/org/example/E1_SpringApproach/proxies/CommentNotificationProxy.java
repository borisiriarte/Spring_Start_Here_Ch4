package org.example.E1_SpringApproach.proxies;

import org.example.E1_SpringApproach.model.Comment;

public interface CommentNotificationProxy {
  void sendComment(Comment comment);
}
