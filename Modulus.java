public class Modulus
{
    public static void main(String[] args) 
    {
        System.out.println("Enter value for x:");
        int x = Integer.parseInt(System.console().readLine());

        System.out.println("Enter value for y:");
        double y = Double.parseDouble(System.console().readLine());

        System.out.println("x mod 10 = " + (x % 10));
        System.out.println("y mod 1 = " + (int)(y % 1));
    }
}