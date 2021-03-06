package com.spring.study.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("before")
public class BeforeAspect {
	
	@Before("execution(public * com.spring.study..*Impl.e*(..))")
	public void before(JoinPoint point) {
		String method = point.getSignature().getName() ; 
		Object obj    = point.getTarget() ; 
		System.out.println("[BeforeAspect] >>>>>>>>>>>>>>>>>>>>>>> "+obj+"\t"+method); 
	}
	
}
