package org.example.A3.E0_NoSpringApproach.proxies;

import org.example.A3.E0_NoSpringApproach.model.Comment;

public class EmailCommentNtificationProxy implements CommentNotificationProxy{
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
