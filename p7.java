class Rectangle {
    double height;
    double width;

    // Constructor to initialize the Rectangle object
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(10.5, 5.5);
        System.out.println("Height: " + myRectangle.height);
        System.out.println("Width: " + myRectangle.width);
    }
}
