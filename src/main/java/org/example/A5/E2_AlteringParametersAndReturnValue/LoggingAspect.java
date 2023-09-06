package org.example.A5.E2_AlteringParametersAndReturnValue;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
  @Around("execution(* org.example.A5.E2_AlteringParametersAndReturnValue.services.*.*(..))")
  public Object log(@NotNull ProceedingJoinPoint joinPoint) throws Throwable {
    String methodName = joinPoint.getSignature().getName();
    Object [] arguments = joinPoint.getArgs();

    logger.info("Method: " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute" +
        ".");
    Object returnedByMethod = joinPoint.proceed();

    logger.info("Method executed and returned " + returnedByMethod);
    return returnedByMethod;
  }
}
