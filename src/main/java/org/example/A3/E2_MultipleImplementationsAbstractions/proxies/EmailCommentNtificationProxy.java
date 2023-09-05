package org.example.A3.E2_MultipleImplementationsAbstractions.proxies;

import org.example.A3.E2_MultipleImplementationsAbstractions.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNtificationProxy implements CommentNotificationProxy {
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
