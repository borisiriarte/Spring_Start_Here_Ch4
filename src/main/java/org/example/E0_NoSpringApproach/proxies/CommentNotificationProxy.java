package org.example.E0_NoSpringApproach.proxies;

import org.example.E0_NoSpringApproach.model.Comment;

public interface CommentNotificationProxy {
  void sendComment(Comment comment);
}
