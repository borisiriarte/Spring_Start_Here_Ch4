package org.example.A5.E3_AlterCallByChangingParametersOrReturnedValue.services;

import org.example.A5.E3_AlterCallByChangingParametersOrReturnedValue.Comment;
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

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
