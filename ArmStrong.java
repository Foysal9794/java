
package basicjava;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2,sum=0,count=0;
        System.out.print("Enter start number : ");
        number1 = input.nextInt();
        
        System.out.print("Enter end number : ");
        number2 = input.nextInt();
        for (int i = number1; i <=number2; i++) {
            int temp = i;
            while(temp % 10 !=0)
        {
        
        int r = temp % 10;
        sum = sum + r*r*r;
        temp = temp /10;
            
        }
          if(i == sum){
            System.out.print(" " + i);
            count++;}
          sum=0;          
        }  
        System.out.println("\n");
        System.out.println("Total Aromstorng Number is : "+count);
    }
    
}
