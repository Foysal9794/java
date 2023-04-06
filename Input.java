
package basicjava;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
        double phonePrize=2000,InstallmentPerMonth,TotalInstallment;
       
        System.out.print("Enter Total Installment : ");
        TotalInstallment = input.nextDouble();
        
        InstallmentPerMonth = phonePrize / TotalInstallment;
        System.out.printf("Your Monthly Installment is : %.2f\n",InstallmentPerMonth);
        
    }
    
}
