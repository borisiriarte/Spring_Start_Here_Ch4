package org.example.A3.E2_MultipleImplementationsAbstractions.proxies;

import org.example.A3.E2_MultipleImplementationsAbstractions.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary //This is the first approch to solve the problem, spring can now choose which bean to use
//@Primary is a good way to solve this problem, but what about if you had to use both or more of those beans?
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending push notification for comment: " + comment.getText());
  }
}
