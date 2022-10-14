public class RightTriangle {

    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        double a = base;
        double b = height;
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        return Math.sqrt(c);
    }
 }
