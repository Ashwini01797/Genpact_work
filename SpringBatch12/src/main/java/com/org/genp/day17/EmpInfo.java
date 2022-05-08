package com.org.genp.day17;

public class EmpInfo {
	private int eid;
	private String ename;
	private String empaddr;
	
	public EmpInfo()
	{
		super();
	}
	public EmpInfo(int eid, String ename, String empaddr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.empaddr = empaddr;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}
	@Override
	public String toString() {
		return "EmpInfo [EmpId="+ eid + ",Emp Name=" + ename + ",Emp Address= "+empaddr + "]";
	}
	
	

}
