package org.example.E0_NoSpringApproach.proxies;

import org.example.E0_NoSpringApproach.model.Comment;

public class EmailCommentNtificationProxy implements CommentNotificationProxy{
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
