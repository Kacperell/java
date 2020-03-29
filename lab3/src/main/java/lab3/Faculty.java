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
import java.util.ArrayList;
import java.util.List;

public class Faculty  implements EmailRecipient  {

	  private String emailAddress;
	  public String FacultyName;
	  
	  private List<Teacher> teachers = new ArrayList<>();
	  
	  public Faculty(String FacultyName, String emailAddress) {
	        this.FacultyName = FacultyName;
	        this.emailAddress = emailAddress;
	    }

	  
	  @Override
	    public String getEmailAddress() {
	        return emailAddress;
	    }
  
	    
	    public List<Teacher> getTeachers() {
		    return teachers;
		}
	  
	    public void addTeacher(Teacher teacher) {
	    	teachers.add(teacher);
		}
	    
	  
	  
}
