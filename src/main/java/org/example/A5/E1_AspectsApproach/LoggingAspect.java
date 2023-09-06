package org.example.A5.E1_AspectsApproach;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
  @Around("execution(* org.example.A5.E1_AspectsApproach.services.*.*(..))")
  public void log(@NotNull ProceedingJoinPoint joinPoint) throws Throwable {
    logger.info("Method will execute");
    joinPoint.proceed();
    logger.info("Method executed");
  }
}
