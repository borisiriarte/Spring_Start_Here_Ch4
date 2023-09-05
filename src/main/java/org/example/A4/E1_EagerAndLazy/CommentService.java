package org.example.A4.E1_EagerAndLazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {
  public CommentService() {
    System.out.println("Comment service instance created!");
  }
}
