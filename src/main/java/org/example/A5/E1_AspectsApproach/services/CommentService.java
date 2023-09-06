package org.example.A5.E1_AspectsApproach.services;

import org.example.A5.E1_AspectsApproach.Comment;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
  private Logger logger = Logger.getLogger(CommentService.class.getName());

  public void publishComment(@NotNull Comment comment){
    logger.info("Publishing comment: " + comment.getText());
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
