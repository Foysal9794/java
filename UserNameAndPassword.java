
package basicjava;

import java.util.Scanner;

public class UserNameAndPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password; int count=0;        
        
        while(count==0)
        {
            System.out.print("Enter user name : ");
        username = input.nextLine();
        
        System.out.print("Enter password : ");
        password = input.nextLine();
        
        if(username.equals("Foysal Ahmed") && password.equals("LoveMyFamily")){
            System.out.println("welcome to the system");
            count++;
            break;
        }        
        else
        System.out.println("username/password is incorrect. Please try again");      
                    
    }}
}
