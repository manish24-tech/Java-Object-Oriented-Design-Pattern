package com.practice.developers;

import com.practice.factory.Developer;
import com.practice.model.PersonalDetail;
import com.practice.model.TechnicalDetail;

/**
 * This class is responsible to manage business logic which is hidden and in future something is change then this is the only place where changes need to done
 * @author Manish Luste
 *
 */
public class UxDeveloper implements Developer {

	String developerType;
	
	public UxDeveloper() {}
	
	public UxDeveloper(String developerType) {
		if (developerType.isEmpty())
			throw new NullPointerException("Developer Type does not specified!");
		
		this.developerType = developerType;
	}

	@Override
	public void getDeveloperByType() {
		
		PersonalDetail pesonal = new PersonalDetail("Dipak", 29);
		TechnicalDetail technical = new TechnicalDetail("core UX", 2);
		
		System.out.println("UxDeveloper.getDeveloperType() Type : "+developerType);
		System.out.println("=> Personal Detail : \n\t Name : "+pesonal.getName()+" | Age : "+pesonal.getAge());
		System.out.println("=> Technical Detail : \n\t Skill : "+technical.getSkill()+" | Experiance : "+technical.getNoe());
	}

}
