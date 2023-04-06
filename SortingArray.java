
package pattern;

import java.util.Arrays;



public class SortingArray {
    public static void main(String[] args) {
        int [] number = {5,4,9,7,3,12,6,2};
        Arrays.sort(number);
        
        for (int i = 0; i < 8; i++) {
            System.out.print(" "+number[i]);
        }
           System.out.println(); 
        
           for (int i = 7; i >=0; i--) {
            System.out.print(" "+number[i]);
        }
           System.out.println(); 
        }      
       

}
