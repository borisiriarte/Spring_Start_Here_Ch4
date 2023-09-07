package org.example.A5.E3_AlterCallByChangingParametersOrReturnedValue;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
  @Around("execution(* org.example.A5.E3_AlterCallByChangingParametersOrReturnedValue.services.*.*(..))")
  public Object log(@NotNull ProceedingJoinPoint joinPoint) throws Throwable {
    String methodName = joinPoint.getSignature().getName();
    Object [] arguments = joinPoint.getArgs();

    logger.info("Method: " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute" +
        ".");

    Comment comment = new Comment();
    comment.setText("Another shitty text!!");
    Object [] newArguments = {comment};

    Object returnedByMethod = joinPoint.proceed(newArguments);


    logger.info("Method executed and returned " + returnedByMethod);
    return "FAILED";
  }
}
