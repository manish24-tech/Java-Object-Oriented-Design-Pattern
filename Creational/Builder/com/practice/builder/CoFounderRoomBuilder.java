package com.practice.builder;

import com.practice.model.Electronic;
import com.practice.model.Furniture;

/**
 
 * Object Builder : having * entity reference into 1 entity
 *  
 * @author Manish Luste
 *
 */
public class CoFounderRoomBuilder {

	String type;
	Furniture furnitur;
	Electronic electronic;
	
	public CoFounderRoomBuilder() {
		super();
	}

	public CoFounderRoomBuilder(String type) {
		super();
		this.type = type;
	}
	
	public CoFounderRoomBuilder(String type, Furniture furnitur, Electronic electronic) {
		super();
		this.type = type;
		this.furnitur = furnitur;
		this.electronic = electronic;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Furniture getFurnitur() {
		return furnitur;
	}

	public void setFurnitur(Furniture furnitur) {
		this.furnitur = furnitur;
	}

	public Electronic getElectronic() {
		return electronic;
	}

	public void setElectronic(Electronic electronic) {
		this.electronic = electronic;
	}

	@Override
	public String toString() {
		return "CoFounderRoomBuilder [type=" + type + ", furnitur=" + furnitur + ", electronic=" + electronic
				+ ", getType()=" + getType() + ", getFurnitur()=" + getFurnitur() + ", getElectronic()="
				+ getElectronic() + "]";
	}
		
}
