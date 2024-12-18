abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI*radius*radius;
    }

    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}

class Triangle extends Shape {
    private double s1, s2, s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    double calculateArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    double calculatePerimeter() {
        return s1 + s2 + s3;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   double calculateArea() {
       return length * width;
   }

   double calculatePerimeter() {
       return 2 * (length + width);
   }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("Circle Of Area: " + circle.calculateArea());
        System.out.println("Circle Of Perimeter: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(5,6,7);
        System.out.println("Triangle Of Area: " + triangle.calculateArea());
        System.out.println("Triangle Of Perimeter: " + triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("Rectangle Of Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Of Perimeter: " + rectangle.calculatePerimeter());
    }
}