class Shape {
    // Overloaded method for calculating area of circle
    void area(float radius) {
        float areaCircle = (float) (Math.PI * radius * radius);
        System.out.println("Area of Circle: " + areaCircle);
    }

    // Overloaded method for calculating area of rectangle
    void area(float length, float width) {
        float areaRectangle = length * width;
        System.out.println("Area of Rectangle: " + areaRectangle);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(5.0f); // Calling method to calculate area of circle
        shape.area(10.0f, 20.0f); // Calling method to calculate area of rectangle
    }
}
