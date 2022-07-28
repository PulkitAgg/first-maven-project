package com.pulkit.FirstMavenProject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	@Value("MRF")
	private String brand;

	// when used constructor, we can't used property injection using beans
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return  brand + " Tyre";
	}
	
	
}
