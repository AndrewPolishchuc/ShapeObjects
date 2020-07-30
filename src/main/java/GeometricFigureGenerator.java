public class GeometricFigureGenerator {
    public static GeometricFigure generateRandomFigure() {
        int randomNumber = (int) (Math.random() * 4);
        switch (randomNumber) {
            case 0: {
                return new Circle(Math.random() * 100, randomColor());
            }
            case 1: return new Square(Math.random() * 100, randomColor());
            case 2: return new Trapezoid(Math.random() * 100,100 + Math.random() * 100,
                    Math.random() * 100, randomColor());
            default: return new Triangle(Math.random() * 10, Math.random() * 10,
                    Math.random() * 10, randomColor());
        }
    }

    public static GeometricFigure[] generateFigures() {
        int number = (int) (Math.random() * 25); //Creates from zero to seven objects Circle class
        GeometricFigure[] resultArray = new GeometricFigure[number];
        for (int i = 0; i < number; i++) {
            resultArray[i] = generateRandomFigure();
            System.out.println(resultArray[i]);
        }
        return resultArray;
    }

    public static String randomColor() {
        int randomValue = (int)(Math.random() * 100);
        if (0 <= randomValue && randomValue < 25) {
            return "red";
        }
        if (25 <= randomValue && randomValue < 50) {
            return "blue";
        }
        if (50 <= randomValue && randomValue < 75) {
            return "white";
        }
        if (75 <= randomValue && randomValue < 100) {
            return "black";
        }
        return null;
    }
}
