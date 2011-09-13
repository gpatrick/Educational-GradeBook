package edu.ecpi.IS510.GradeBook;

import java.util.Hashtable;
import java.util.Date;
import java.util.Collection;

public class Assignment {
	protected Hashtable<Long, Submission> submissions;
	protected Date dueDate;
	protected float weight;
	protected String title;
	protected String description;
	
	public Assignment(String title, String description, Date dueDate, float weight){
		submissions = new Hashtable<Long, Submission>();
		this.dueDate = dueDate;
		this.weight = weight;
		this.title = title;
		this.description = description;
	}
	
	public Assignment(Date dueDate, float weight){
		this("", "", dueDate, weight);
	}
	
	public Assignment(){
		this(null, 0.0f);
	}
	
	public void addSubmission(Submission submission){
		submissions.put(submission.getStudentID(), submission);
	}
	
	public Submission getSubmission(long studentID){
		return submissions.get(Long.valueOf(studentID));
	}
	
	public Collection<Submission> getSubmissions(){
		return submissions.values();
	}
	
	public Date getDueDate(){
		return dueDate;
	}
	
	public void setDueDate(Date dueDate){
		this.dueDate = dueDate;
	}
	
	public float getWeight(){
		return weight;
	}
	
	public void setWeight(float weight){
		this.weight = weight;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
}
