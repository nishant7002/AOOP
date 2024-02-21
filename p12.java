class ConstructorOverloadingDemo {
    int num1, num2;
    double num3;

    // Default constructor
    ConstructorOverloadingDemo() {
        num1 = 0;
        num2 = 0;
        num3 = 0.0;
    }

    // Constructor with two parameters
    ConstructorOverloadingDemo(int n1, int n2) {
        num1 = n1;
        num2 = n2;
        num3 = 0.0;
    }

    // Constructor with three parameters
    ConstructorOverloadingDemo(int n1, int n2, double n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    void display() {
        System.out.println("num1: " + num1 + ", num2: " + num2 + ", num3: " + num3);
    }

    public static void main(String[] args) {
        ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo(10, 20);
        ConstructorOverloadingDemo obj3 = new ConstructorOverloadingDemo(10, 20, 30.5);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
