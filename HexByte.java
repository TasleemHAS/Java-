class HexByte
{
 public static void main(String[] args)
 {
    char hex[] = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };
    byte b;

   
    System.out.println("Enter a byte value:");
    try
    {
        b = Byte.parseByte(System.console().readLine());
    }
    catch (NumberFormatException e)
    {
        System.out.println("Invalid input. Please enter a byte value.");
        return;
    }

    System.out.println("Hexadecimal representation of " + b + " is 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
 }
}