
package basicjava;

import java.util.Scanner;
public class SumOfDigit {  


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter number : ");
        num = input.nextInt();
        int temp = num;
        while(temp !=0){
            int reminder = temp % 10;
            sum = sum + reminder;
            temp = temp / 10;

        }
        System.out.println("Sum of digit : " + sum);
    }
}

