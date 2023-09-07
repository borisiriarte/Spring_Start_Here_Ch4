package org.example.A5.E6_Chaining;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1) //This annotation tell spring wich one should execute first or which one should go before another
public class SecurityAspect {
  private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

  @Around(value = "@annotation(ToLog)")
  public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
    logger.info("Security Aspect: Calling the intercepted method");

    Object returnedValue = joinPoint.proceed();

    logger.info("Security Aspect: Method executed and returned " + returnedValue);


    return returnedValue;
  }
}
