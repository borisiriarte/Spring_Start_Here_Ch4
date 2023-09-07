package org.example.A5.E5_OtherAnnotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
  @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
  public void log(Object returnedValue) throws Throwable {
    logger.info("Method exacuted and returned: " + returnedValue );
  }
}
