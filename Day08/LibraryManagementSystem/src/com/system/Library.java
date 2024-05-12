package com.system;

public class Library {
	protected String name;
	protected String address;
	
	public Library() {
		this.name = "None";
		this.address = "None";
	}
	
	public Library(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSpecificLibrary(String name) {
		if(this.name.equals(name))
			return "Library [name :"+this.name+" Address: "+this.address+"]";
		else
			return "Library is not available";
	}

}
