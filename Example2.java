public class Example2 
{
    public static void main(String[] args) 
    {
        int num = 0;
        System.out.println("Enter the number:");
        try
        {
            num = Integer.parseInt(System.console().readLine());
            System.out.println("The value of the num * 2 is");
            System.out.println(num * 2);
        }
        catch (Exception e) 
        {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}