abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        System.out.println("Base of Triangle: "+base);
        System.out.println("Height of Triangle: "+height);
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        System.out.println("Length of Rectangle: "+length);
        System.out.println("Width of Rectangle: "+width);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        System.out.println("Radius of Circle: "+radius);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 5);
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(7);

        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
