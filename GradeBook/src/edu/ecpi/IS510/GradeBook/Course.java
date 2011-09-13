package edu.ecpi.IS510.GradeBook;

import java.util.Vector;
import java.util.Hashtable;

public class Course {
	//TODO: Revisit the cycle between students and courses (potential memory leaks)
	Vector<Student> students;
	Vector<Assignment> assignments;
	Hashtable<Long,Float> finalGrades;
	String courseNumber;
	String title;
	
	public Course(String courseNumber, String title){
		students = new Vector<Student>();
		assignments = new Vector<Assignment>();
		finalGrades = new Hashtable<Long,Float>();
		this.courseNumber = courseNumber;
		this.title = title;		
	}
	
	public Course(){
		this("", "");
	}
	
	public void addStudent(Student student){
		if(!students.contains(student)){
			students.addElement(student);
		}
	}
	
	public void addAssignment(Assignment assignment){
		if(assignment != null){
			assignments.add(assignment);
		}
	}
	
	public void setFinalGrade(Student student, float grade){
		if(student != null){
			finalGrades.put(student.getStudentID(), grade);
		}
	}

	public String getCourseNumber(){
		return courseNumber;
	}
	
	public void setCourseNumber(String courseNumber){
		this.courseNumber = courseNumber;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
}
