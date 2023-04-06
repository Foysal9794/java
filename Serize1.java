
package basicjava;

import java.util.Scanner;


public class Serize1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int StartNumber,EndNumber,sum=0;
        System.out.print("Enter First Number : ");
        StartNumber = input.nextInt();
        
        System.out.print("Enter Last Number : ");
        EndNumber = input.nextInt();
        for (int i = StartNumber; i <=EndNumber; i++) {
            
           if(i % 2 == 0){
           
           System.out.print(i+" ");
           
           sum = sum + i*i;
           
                        
           }
                          
            
        }
         System.out.println("serize sum = " + sum);
        
    }
    
}
