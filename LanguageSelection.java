
package basicjava;

import java.util.Scanner;
public class LanguageSelection {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Enter Language input 1 for bangla, input 2 for hindi, input 3 for urdu : ");
        digit = input.nextInt();
                
        switch(digit)
        {
            case 1:
                System.out.println("Selected language is Bengali");
                break;
            case 2:
                System.out.println("Selected language is hindi");
                break;
            case 3:
                System.out.println("Selected language is urdu");
                break;
            default:
                System.out.println("Selected language is English");     
        
         }
        
    }
    
}
