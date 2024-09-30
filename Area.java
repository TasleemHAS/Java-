public class AreaCalculator {
    private double radius;
    private final double pi = 3.1416;

    public AreaCalculator(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle: ");
        double radius = Double.parseDouble(System.console().readLine());
        AreaCalculator calculator = new AreaCalculator(radius);
        double area = calculator.calculateArea();
        System.out.println("The area of the circle is " + area);
    }
}
