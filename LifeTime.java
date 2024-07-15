class LifeTime
{
    public static void main(String[] args) 
    {
        int x;
        System.out.print("Enter the number of iterations: ");
        x = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < x; i++) 
        {
            int y;
            System.out.print("Enter the value for y: ");
            y = Integer.parseInt(System.console().readLine());
            System.out.println("y is: " + y); 
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}