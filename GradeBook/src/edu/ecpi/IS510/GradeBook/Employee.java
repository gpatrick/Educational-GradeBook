package edu.ecpi.IS510.GradeBook;

public class Employee extends Person {
	protected long employeeID;
	
	public long getEmployeeID(){
		return employeeID;
	}
	
	public void setEmployeeID(long employeeID){
		this.employeeID = employeeID;
	}
}
