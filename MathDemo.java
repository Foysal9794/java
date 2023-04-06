
package basicjava;


public class MathDemo {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int result = Math.max(x, y);
        System.out.println("Maxiam value is : "+result);
        
        int result1 = Math.min(x, y);
        System.out.println("Minimam value is : "+result1);
        
        int absulate = Math.abs(y);
        System.out.println("Absulate of y : "+ absulate);
        double power = Math.pow(x, y);
        System.out.println("x to the power y = " + power);
        double pi = Math.PI;
        System.out.println("Pi ="+pi);
       
    }
}
