
package pattern;

import java.util.ArrayList;




public class arrayListDemo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println("Size of array : "+number.size());        
        System.out.println("Element of Array : "+number);
        
        number.set(4, 100);
        System.out.println("Size of array : "+number.size());        
        System.out.println("Element of Array : "+number);
        
        number.remove(2);
        System.out.println("Size of array : "+number.size());        
        System.out.println("Element of Array : "+number);
        
        number.removeAll(number);
        System.out.println("Size of array : "+number.size());        
        System.out.println("Element of Array : "+number);
        
        
    }
                    
      
        
    }
    
    

