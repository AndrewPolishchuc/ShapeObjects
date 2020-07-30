public abstract class GeometricFigure {
    public String color;

    public abstract void draw();

    public abstract double getArea();

    public abstract String getColor();

    public abstract String getFigureName();

    public abstract String getSpecialPropertyOfFigure();

    @Override
    public String toString() {
        StringBuilder outputString = new StringBuilder();
        outputString.append("Фигура : ").append(getFigureName())
                .append(", площадь: ").append(String.format("%.2f",getArea())).append(" ед., ")
                .append(getSpecialPropertyOfFigure())
                .append(", цвет: ").append(getColor());
        return outputString.toString();
    }
}
