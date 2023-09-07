package org.example.A5.E4_InterceptingAnnotatedMethods.services;

import org.example.A5.E4_InterceptingAnnotatedMethods.Comment;
import org.example.A5.E4_InterceptingAnnotatedMethods.ToLog;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
  private Logger logger = Logger.getLogger(CommentService.class.getName());

  public String publishComment(@NotNull Comment comment){
    logger.info("Publishing comment: " + comment.getText());
    return "SUCCESS";
  }

  @ToLog
  public void deleteComment(@NotNull Comment comment) {
    logger.info("Deleting comment:" + comment.getText());
  }
  public void editComment(@NotNull Comment comment) {
    logger.info("Editing comment:" + comment.getText());
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
