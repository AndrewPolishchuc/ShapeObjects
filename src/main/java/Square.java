public class Square extends GeometricFigure {
    private double sideLenth;

    public Square(double sideLenth, String colorOfSquare) {
        this.sideLenth = sideLenth;
        color = colorOfSquare;
    }

    public void draw() {
        System.out.println("The square is drawn");
    }

    public double getArea() {
        return sideLenth * sideLenth;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getFigureName() {
        return "квадрат";
    }

    @Override
    public String getSpecialMethod() {
        return "сторона " + String.format("%.2f",getSideLenth());
    }

    public double getSideLenth() {
        return sideLenth;
    }
}
