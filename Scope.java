class Scope 
{
    public static void main(String[] args) 
    {
        int x;
        System.out.print("Enter the value for x: ");
        x = Integer.parseInt(System.console().readLine());
        if(x == 10) { 
            int y;
            System.out.print("Enter the value for y: ");
            y = Integer.parseInt(System.console().readLine());
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x is " + x);
    }
}