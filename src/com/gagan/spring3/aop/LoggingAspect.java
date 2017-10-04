package com.gagan.spring3.aop;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	private Log log = LogFactory.getLog(this.getClass());
	
	/*
	 * Match the join points in all packages, all methods
	 */
	@Pointcut("execution(* *.*(..))")
	public void loggingAllOperation() {}
	
	/*
	 * Match the join points within package com.gagan.spring3 and its sub-packages
	 */
	@Pointcut("execution(* com.gagan.spring3..*(..))")
	public void loggingSpring3PracticeOperation() {}
	
	@Before("loggingSpring3PracticeOperation()")
	public void logBefore(JoinPoint joinPoint) {
		log.info("Begin " 
				+ joinPoint.getKind() 
				+ ": " 
				+ joinPoint.getSignature().getDeclaringTypeName() + " -> " + joinPoint.getSignature().getName()
				+ "(" + Arrays.toString(joinPoint.getArgs()) + ")");
	}

	/*
	 * @After("execution(* *.*(..))") public void logAfter(JoinPoint joinPoint)
	 * { log.info("The method " + joinPoint.getSignature().getName() +
	 * "() ends"); }
	 */

	/*
	 * If you would like to perform logging only when a join point returns, you
	 * should replace the after advice with an after returning advice. Optional
	 * attribute: returning
	 */
	@AfterReturning(pointcut = "loggingSpring3PracticeOperation()", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		log.info("End " 
				+ joinPoint.getKind() 
				+ ": " 
				+ joinPoint.getSignature().getDeclaringTypeName() + " -> " + joinPoint.getSignature().getName()
				+ "(" + result + ")");
	}

	/*
	 * Optional attribute: throwing
	 */
	@AfterThrowing(pointcut = "loggingSpring3PracticeOperation()", throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
		log.error("An exception " 
				+ e 
				+ " has been thrown in " 
				+ joinPoint.getKind() 
				+ ": " 
				+ joinPoint.getSignature().getDeclaringTypeName() + " -> " + joinPoint.getSignature().getName()
				+ "(" + Arrays.toString(joinPoint.getArgs()) + ")");
	}

	/*
	 * It is the most powerful of all the advice types. It gains full control of
	 * a join point, so you can combine all the actions of the preceding advices
	 * into one single advice. You can even control when, and whether, to
	 * proceed with the original join point execution.
	 */
	/*
	 * @Around("execution(* *.*(..))") public Object
	 * logAround(ProceedingJoinPoint joinPoint) throws Throwable {
	 * log.info("The method " + joinPoint.getSignature().getName() +
	 * "() begins with " + Arrays.toString(joinPoint.getArgs())); try { Object
	 * result = joinPoint.proceed(); log.info("The method " +
	 * joinPoint.getSignature().getName() + "() ends with " + result); return
	 * result; } catch (IllegalArgumentException e) {
	 * log.error("Illegal argument " + Arrays.toString(joinPoint.getArgs()) +
	 * " in " + joinPoint.getSignature().getName() + "()"); throw e; } }
	 */
}
