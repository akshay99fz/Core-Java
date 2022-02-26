package com.wipro.more;

public class Container {

	String name;
	int experience;
	String company;

	public Container(String name, int experience, String company) {
		super();
		this.name = name;
		this.experience = experience;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
