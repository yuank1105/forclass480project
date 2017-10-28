
package helper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //user test
        ArrayList<User> users=new ArrayList<>();
     
     
        //test user with id and pwd
        User login_user=null;
        String uid="ak123",pwd="12345";
        for(User user:users){
            if(user.verify(uid, pwd)){
                login_user=user;
                break;
            }
        }
        if(login_user!=null){
            System.out.println("Welcome "+login_user.fname+" "+login_user.lname);
        }else{
            System.out.println("user not found");
        }
        //write user to file
        //first create a user.txt file
        ObjectOutputStream ostream=new ObjectOutputStream(new FileOutputStream("user.txt"));
        ostream.writeObject(users);
       //and same input stream for reading users from file 
       
    }
}
