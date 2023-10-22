public class Shapes {
    enum Shape {
        CIRCLE(2.0), SQUARE(4.0), TRIANGLE(3.0);

        private double sides;

        Shape(double sides) {
            this.sides = sides;
        }

        public double calculateArea(double sideLength) {
            switch (this) {
                case CIRCLE:
                    return Math.PI * Math.pow(sideLength, 2);
                case SQUARE:
                    return Math.pow(sideLength, 2);
                case TRIANGLE:
                    return (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
                default:
                    return 0.0;
            }
        }

        public double calculatePerimeter(double sideLength) {
            return sideLength * sides;
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            double sideLength = 5.0; // You can change the side length as needed
            double area = shape.calculateArea(sideLength);
            double perimeter = shape.calculatePerimeter(sideLength);

            System.out.println("Shape: " + shape);
            System.out.println("Side Length: " + sideLength);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();
        }
    }
}
