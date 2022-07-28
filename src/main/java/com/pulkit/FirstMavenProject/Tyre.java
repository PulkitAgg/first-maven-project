package com.pulkit.FirstMavenProject;

public class Tyre {
	private String brand;

	// when used constructor, we can't used property injection using beans
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

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
