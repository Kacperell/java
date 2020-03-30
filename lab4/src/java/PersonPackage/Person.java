package PersonPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kacperel
 */
public class Person {
	 private String firstName;  
    private String emailAddress;
private String lastName;
    public Person(String firstName, String lastName,String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getEmailAddress(){
         return emailAddress;
    }
}
