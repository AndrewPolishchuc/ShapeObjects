public class Trapezoid extends GeometricFigure {
    private double lengthOfLargerBase;
    private double lesserBaseLength;
    private double trapezoidHeight;

    public Trapezoid(double lengthOfLargerBase, double lesserBaseLength, double trapezoidHeight,
                      String color) {
        this.lengthOfLargerBase = lengthOfLargerBase;
        this.lesserBaseLength = lesserBaseLength;
        this.trapezoidHeight = trapezoidHeight;
        this.color = color;
    }

    public void draw() {
        System.out.println("The trapezoid is drawn");
    }

    public double getArea() {
        return 0.5 * (lesserBaseLength + lengthOfLargerBase) * trapezoidHeight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getFigureName() {
        return "трапеция";
    }

    @Override
    public String getSpecialMethod() {
        return "высота: " + String.format("%.2f",getHeight());
    }

    public double getHeight() {
        return trapezoidHeight;
    }
}
