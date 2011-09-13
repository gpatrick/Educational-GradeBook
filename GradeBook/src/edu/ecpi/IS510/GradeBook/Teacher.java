package edu.ecpi.IS510.GradeBook;

public class Teacher extends Employee {
	protected Course[] courseList;
	protected int courseCount;
	
	public Teacher(){
		courseList = new Course[4];
		courseCount = 0;
	}
	
	public void addCourse(Course course){
		if(course != null && !isFull() && !contains(course)){
			int index = 0;
			while(courseList[index] != null){
				index++;
			}
			courseList[index] = course;
		}
	}
	
	public void removeCourse(Course course){
		//TODO: Implement this method
	}
	
	public Course[] getCourseList(){
		return courseList;
	}
	
	protected boolean isFull(){
		return courseCount >= 4;
	}
	
	protected boolean isEmpty(){
		return courseCount <= 0;
	}
	
	protected boolean contains(Course course){
		boolean found = false;
		int index = 0;
		while(index < 4 && !found){
			if(courseList[index] != null){
				found = (course == courseList[index]);
			}
			index++;
		}
		return found;
	}
}