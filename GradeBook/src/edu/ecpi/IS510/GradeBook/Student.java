package edu.ecpi.IS510.GradeBook;

public class Student extends Person{
	protected long studentID;
	
	public long getStudentID(){
		return studentID;
	}
	
	public void setStudentID(long studentID){
		this.studentID = studentID;
	}
}
