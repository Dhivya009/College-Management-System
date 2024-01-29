package com.example.demo;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
@Entity
public class College {
 private String deptName;
 @Id
 private int deptNo;
 private int deptStaffCount;
 
 private int deptLabCount;
 
 

@Override
public String toString() {
	return "College [deptName=" + deptName + ", deptNo=" + deptNo + ", deptStaffCount=" + deptStaffCount
			+ ", deptLabCount=" + deptLabCount + "]";
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public int getDeptStaffCount() {
	return deptStaffCount;
}
public void setDeptStaffCount(int deptStaffCount) {
	this.deptStaffCount = deptStaffCount;
}
public int getDeptLabCount() {
	return deptLabCount;
}
public void setDeptLabCount(int deptLabCount) {
	this.deptLabCount = deptLabCount;
}
}

