/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author kacperel
 */
import java.util.List;
import java.util.ArrayList;

public  class Student extends Person {
		  public String groupId;	  
		  private List<Double> grades = new ArrayList<>();
		  
		  public Student(String firstName, String lastName,String emailAddress, String groupId) {
			    super(firstName, lastName,emailAddress);
			    this.groupId = groupId;
			}
		  
		  public String getGroupId() {
			    return groupId;
			}

			public void setGroupId(String groupId) {
			    this.groupId = groupId;
			}	 
			
			
			public List<Double> getGrades() {
			    return grades;
			}

			public void addGrade(double grade) {
			    grades.add(grade);
			}
			
			public Double getGradesAverage() {
				 double avarge=0;
				  for (int i = 0; i < grades.size(); i++) {
					  avarge=avarge+grades.get(i);
			        }
				  avarge=avarge/grades.size();
				return avarge;
			}
			
	 }