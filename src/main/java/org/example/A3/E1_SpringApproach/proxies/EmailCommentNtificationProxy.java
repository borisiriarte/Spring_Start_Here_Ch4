package org.example.A3.E1_SpringApproach.proxies;

import org.example.A3.E1_SpringApproach.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNtificationProxy implements CommentNotificationProxy {
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
