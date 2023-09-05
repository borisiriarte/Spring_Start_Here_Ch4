package org.example.A4.E0_SingletonScopedBeans.proxies;

import org.example.A4.E0_SingletonScopedBeans.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
