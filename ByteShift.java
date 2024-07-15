class ByteShift
{
 public static void main(String[] args)
 {
    byte a, b;
    int i;

    System.out.println("Enter a value:");
    a = Byte.parseByte(System.console().readLine());

    i = a << 2;
    b = (byte) (a << 2);

    System.out.println("Original value of a: " + a);
    System.out.println("i and b: " + i + " " + b);
 }
}