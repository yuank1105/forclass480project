
package helper;

import java.io.Serializable;

public class Voter implements Serializable{//voter class
    //variable declaration
  public String fname,lname,age,gender,SSN,Zipcode;
   public Voter(){};
    public Voter( String SSN,String fname, String lname, String age, String gender,String Zipcode) {
        this.SSN=SSN;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.Zipcode=Zipcode;
    }
   
}
