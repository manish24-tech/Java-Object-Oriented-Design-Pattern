package com.practice.fullstack.backend;

import com.practice.fullstack.BackEnd;

/**
 * This is factory implementation class having all the final product information also known as concreat class
 * @author Manish Luste
 *
 */
public class SpringBoot implements BackEnd {

	@Override
	public void getBackEndDescription() {
		System.out.println("SpringBoot.getBackEndDescription()");
	}
}
