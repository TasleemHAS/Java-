public class BoolTest
{
    public static void main(String args[]) 
    {
        boolean b;
        String input;

        System.out.print("Enter 0 or 1 : ");
        input = System.console().readLine();
        if (input.equals("0")) 
        {
            b = false;
        } 
        else 
        {
            b = true;
        }

        System.out.println("b is " + b);

        System.out.print("Enter 0 or 1 : ");
        input = System.console().readLine();
        if (input.equals("0"))
        {
            b = false;
        } 
        else 
        {
            b = true;
        }

        System.out.println("b is " + b);

        if (b) 
        {
            System.out.println("This is executed.");
        } 
        else 
        {
            System.out.println("This is not executed.");
        }
    }
}