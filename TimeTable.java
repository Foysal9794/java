
package basicjava;

import java.util.Scanner;


public class TimeTable {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s_num,e_num;
        System.out.print("Enter first number : ");
        s_num = input.nextInt();
        
        
        
        for (int i = 1; i <=10; i++) {
            
            System.out.println(s_num+" X "+i+" = "+s_num*i);
            
        }
        
        
    }
}
