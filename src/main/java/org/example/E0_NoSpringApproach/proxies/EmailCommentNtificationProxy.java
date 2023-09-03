package org.example.proxies;

import org.example.model.Comment;

public class EmailCommentNtificationProxy implements CommentNotificationProxy{
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
