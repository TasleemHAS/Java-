class OpBitEquals
{
 public static void main(String[] args)
 {
    int a;
    int b;
    int c;

    System.out.println("Enter the value of a:");
    String inputA = System.console().readLine();
    System.out.println("Enter the value of b:");
    String inputB = System.console().readLine();
    System.out.println("Enter the value of c:");
    String inputC = System.console().readLine();

    try 
    {
        a = Integer.parseInt(inputA);
        b = Integer.parseInt(inputB);
        c = Integer.parseInt(inputC);
    } 
    catch (NumberFormatException e) 
    {
        System.out.println("Invalid input. Please enter integer values.");
        return;
    }

    a |= 4;
    b >>= 1;
    c <<= 1;
    a ^= c;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
 }
}