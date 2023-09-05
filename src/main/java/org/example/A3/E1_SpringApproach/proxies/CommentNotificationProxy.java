package org.example.A3.E1_SpringApproach.proxies;

import org.example.A3.E1_SpringApproach.model.Comment;

public interface CommentNotificationProxy {
  void sendComment(Comment comment);
}
