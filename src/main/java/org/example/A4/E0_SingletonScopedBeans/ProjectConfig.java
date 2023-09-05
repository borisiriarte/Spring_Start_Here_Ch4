package org.example.A4.E0_SingletonScopedBeans;




import org.example.A4.E0_SingletonScopedBeans.proxies.EmailCommentNotificationProxy;
import org.example.A4.E0_SingletonScopedBeans.repositories.DBCommentRepository;
import org.example.A4.E0_SingletonScopedBeans.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.A4.E0_SingletonScopedBeans.*")
public class ProjectConfig {
  @Bean
  public CommentService commentService() {
    return new CommentService(emailCommentNotificationProxy(), dbCommentRepository());
  }

  @Bean
  public EmailCommentNotificationProxy emailCommentNotificationProxy() {
    return new EmailCommentNotificationProxy();
  }

  @Bean
  public DBCommentRepository dbCommentRepository() {
    return new DBCommentRepository();
  }


}
