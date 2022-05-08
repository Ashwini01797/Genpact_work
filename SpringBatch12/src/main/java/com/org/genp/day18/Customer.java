package com.org.genp.day18;

public class Customer {
	int custId;
    String name;
    int age;
    public Customer(int custId, String name, int age) {
        super();
        this.custId = custId;
        this.name = name;
        this.age = age;
    }
	public int getCustId() {
		return custId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
