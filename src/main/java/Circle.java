public class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("The circle is drawn");
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getFigureName() {
        return "круг";
    }

    @Override
    public String getSpecialMethod() {
        return "с радиусом " + String.format("%.2f",getRadius());
    }

    public double getRadius() {
        return radius;
    }
}
