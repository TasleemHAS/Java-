public class Area
 {
    public static void main(String[] args)
 {
        double pi = 3.1416; 
        System.out.print("Enter the radius of the circle: ");
        double r = Double.parseDouble(System.console().readLine());
        double a = pi * Math.pow(r, 2); 
        System.out.println("Area of circle is " + a);
    }
}