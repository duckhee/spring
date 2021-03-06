package com.spring.study.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("after")
public class AfterAspect {
	
	@After("execution(public * com.spring.study..*Impl.e*(..))")
	public void after(JoinPoint point) {
		String method = point.getSignature().getName() ; 
		Object obj    = point.getTarget() ; 
		System.out.println("[AfterAspect] >>>>>>>>>>>>>>>>>>>>>>> "+obj+"\t"+method); 
	}
}

