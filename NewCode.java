
package basicjava;

import java.util.Scanner;
public class NewCode {
    
    

    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
        //Declearing Variable:
        int m,n,temp,r,i,count = 0,reverse = 0;
        //Getting Input from User:
        System.out.print("Enter Initial Number: ");  
        m = input.nextInt();

        System.out.print("Enter Ending Number: ");  
        n = input.nextInt();

        for(i = m; i <= n; i++){
            temp = i;

        while (temp != 0) {
            r = temp % 10;
            reverse = reverse * 10+ r;
            temp = temp/10;
        }
        if(i == reverse){
            System.out.print(i+" ");
            count++;
        }
        reverse = 0;
        }
        if(count == 0){
            System.out.print("There is no Palindrome Number Between "+m+" And "+ n);
        }
        }
    }
}

