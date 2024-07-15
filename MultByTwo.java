class MultByTwo 
{
 public static void main(String[] args)
 {
    int i;
    int num;

    System.out.println("Enter a number:");
    num = Integer.parseInt(System.console().readLine());

    for(i=0; i<4; i++) 
    {
        num = num << 1;
        System.out.println(num);
    }
 }
}