package com.org.genp.day18;

public interface CustomerDao {
	public void insert(Customer customer);
    public Customer findByCustomerId(int custId);
}
