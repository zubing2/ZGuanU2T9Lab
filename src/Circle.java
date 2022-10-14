public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return ((Math.PI) * Math.pow(radius, 2));
    }

    public double circumference() {
        return ((2 * Math.PI) * radius);
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getInfo() {
        double a = radius;
        double b = area();
        double c = circumference();
        return ("Radius: " + a + "\n" + "Area: " + b + "\n" + "Circumference: " + c);
    }
}
