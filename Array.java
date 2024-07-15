class Array
{
    public static void main(String[] args)
    {
        int[] month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;

        System.out.print("Enter the month number (0-11): ");
        int month = Integer.parseInt(System.console().readLine());
        
        if(month >=0  && month <= 11)
        {
            System.out.println("Month " + month + " has " + month_days[month] + " days.");
        } 
        else 
        {
            System.out.println("Invalid month number. Please enter a number between 1 and 11.");
        }
    }
}