
package basicjava;

import java.util.Scanner;


public class palindramNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int StartNumber,EndNumber,sum =0,count=0;
        
        System.out.print("Enter start Number : ");
        StartNumber = input.nextInt();
        
        System.out.print("Enter End Number : ");
        EndNumber = input.nextInt();
        
        for (int i = StartNumber; i<=EndNumber; i++) {
            
            int temp = i;
            while(temp % 10 !=0)
            {
            int reminder = temp % 10 ;
            sum = sum *10 +  reminder ;
            temp = temp /10;
            
            }
             if(i == sum){
                System.out.print( " "+i);
                count++;}
                sum = 0;
        }
        System.out.println("\n");
        System.out.println("Total Palindram Number is : "+ count );
          
        
    }
    
}
