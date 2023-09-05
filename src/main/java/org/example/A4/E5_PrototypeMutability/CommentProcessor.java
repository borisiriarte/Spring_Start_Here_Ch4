package org.example.A4.E5_PrototypeMutability;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CommentProcessor {
  private Comment comment;
  private CommentRepository commentRepository;

  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }

  public void processComment() {
    System.out.println("Processing this shit");
  }

  public void validateComment() {
    System.out.println("Validating this shit");
  }
}
