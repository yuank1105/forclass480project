
package helper;

import java.io.Serializable;
import static org.junit.Assert.assertEquals;


public class User implements Serializable{//user class
    //user attributes declaration as a variable
    public String SSN,fname,lname,address,age,gender,username,password,phone;
    
     public User(){};

    public User(String SSN,String fname, String lname, String address, String age, String gender, String username, String password,String phone) {
        this.SSN=SSN;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.username = username;
          this.phone=phone;
        this.password = password;
      
    }
   public boolean verify(String id,String pwd){//method to check the id and password belongs to the user
        
        return id.equals(username)&&pwd.equals(password);
    }
    
    public String verifyUser(String id, String pass){//method to check the id and password belongs to the user
    return id+pass;
    }
}
