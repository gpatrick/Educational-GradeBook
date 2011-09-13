/**
 * The Main class is the entry point for the GradeBook program
 *  
 * @author Greg Patrick.
 * @version 0.5
 */

package edu.ecpi.IS510.GradeBook;

import java.util.Date;
import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("IS510", "Object-Oriented Programming");
		Assignment a1 = new Assignment("Homework 1", "Do some stuff", new Date(), 0.3f);
		Submission s1 = new Submission(12345, new Date(), 20);
		Submission s2 = new Submission(54321, new Date(), 80);

		a1.addSubmission(s1);
		a1.addSubmission(s2);
		course.addAssignment(a1);

		System.out.println("Assignment = " + a1.getDueDate() + ". Weight = " + a1.getWeight() + ". Title = " + a1.getTitle() + ". Description = " + a1.getDescription());
		
		Iterator<Submission> submissions = a1.getSubmissions().iterator();
		while(submissions.hasNext()){
			Submission s = submissions.next();
			System.out.println("StudentID = " + s.getStudentID() + ". Date Submitted = " + s.getDateSubmitted() + ". Grade = " + s.getGrade() + ".");
		}
	}
}
