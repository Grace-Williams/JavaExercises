package section5;

public class AreaCalculator {

    public static double area(double radius) {

        if (radius < 0.0) {
            return -1.0;
        }
        double PI = 3.14159;

        return (radius * radius) * PI;  // double circleArea = (radius * radius) * PI;
    }

    public static double area(double width, double length) {

        if (width < 0.0 || length < 0.0) {
            return -1.0;
        }

        return width * length;  // double rectangleArea = width * length;
    }

    public static void main(String[] args) {

        System.out.println(area(5.0, 4));
    }
}

// Write a method named area with one double parameter named radius
// The method needs to return a double value that represents the area of a circle
// If the parameter radius is negative then return -1.0 to represent an invalid value
// Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the side of a rectangle
// The method needs to return an area of a rectangle
// If either or both parameters is/are negative return -1.0 to indicate an invalid value

// Examples of input/output:
// area(5.0); should return 78.53975
// area(-1); should return -1 since the parameter is negative
// area(5.0, 4.0); should return 20.0
// area(-1.0, 4.0); should return -1 since the first parameter is negative

// TIP: circle area = radius * PI, PI = 3.14159
// rectangle area = x * y
// NOTE: The methods need to be defined as public static
// Do not add a main method


