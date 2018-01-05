package com.spring.study.aop.service;

import org.springframework.stereotype.Component;

@Component("target")
public class AopCoreImpl implements AopCore {

	@Override
	public String execute(String str) {
		System.out.println("TARGET MESSAGE : "+str);
		return str ;
	}

}
