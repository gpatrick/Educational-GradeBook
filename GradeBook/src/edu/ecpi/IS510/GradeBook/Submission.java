package edu.ecpi.IS510.GradeBook;

import java.util.Date;

public class Submission {
	long studentID;
	float grade;
	Date dateSubmitted;
	
	public Submission(long studentID, Date dateSubmitted, float grade){
		this.studentID = studentID;
		this.grade = grade;
		this.dateSubmitted = dateSubmitted;
	}
	
	public Submission(){
		this(0, null, 0);
	}
	
	public long getStudentID(){
		return studentID;
	}
	
	public void setStudentID(long studentID){
		this.studentID = studentID;
	}
	
	public float getGrade(){
		return grade;
	}
	
	public void setGrade(float grade){
		this.grade = grade;
	}
	
	public Date getDateSubmitted(){
		return dateSubmitted;
	}
	
	public void setDateSubmitted(Date dateSubmitted){
		this.dateSubmitted = dateSubmitted;
	}
}
