package org.example.A5.E4_InterceptingAnnotatedMethods;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
  @Around("@annotation(ToLog)")
  public Object log(@NotNull ProceedingJoinPoint joinPoint) throws Throwable {
    String mName = joinPoint.getSignature().getName();
    Object [] arguments = joinPoint.getArgs();

    logger.info("Method: " + mName + " with parameters " + Arrays.asList(arguments) + " will execute" +
        ".");

    Object returnedByMethod = joinPoint.proceed();


    logger.info("Method executed and returned " + returnedByMethod);
    return "FAILED";
  }
}
