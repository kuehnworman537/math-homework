public class MathHomework {
    public static void main(String[] args) {
        // Example of simple mathematical operations
        System.out.println("The area of a rectangle is: " + calculateArea(5.0, 3.0));
        System.out.println("The perimeter of a rectangle is: " + calculatePerimeter(4.0, 6.0));
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     * @return The area of the rectangle.
     */
    private static double calculateArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     * @return The perimeter of the rectangle.
     */
    private static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
