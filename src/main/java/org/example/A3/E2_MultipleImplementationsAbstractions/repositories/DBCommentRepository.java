package org.example.A3.E2_MultipleImplementationsAbstractions.repositories;

import org.example.A3.E2_MultipleImplementationsAbstractions.model.Comment;
import org.springframework.stereotype.Repository;

/*@Component*/
@Repository
public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: " + comment.getText());
  }
}
