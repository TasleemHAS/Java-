class IncDec 
{
 public static void main(String[] args) 
 {
    int a, b, c, d;

    
    System.out.println("Enter value for a:");
    a = Integer.parseInt(System.console().readLine());
 System.out.println("Enter value for b:");
    b= Integer.parseInt(System.console().readLine());

   
    c = ++b;
    d = a++;
    c++;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
 }
}