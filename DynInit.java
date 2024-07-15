public class DynInit 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the first number: ");
        double a = Double.parseDouble(System.console().readLine());

        System.out.print("Enter the second number: ");
        double b = Double.parseDouble(System.console().readLine());

     
        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse is " + c);
    }
}