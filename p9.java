class StaticDemo {
    static int staticCounter = 0; // static variable
    int instanceCounter = 0; // instance variable

    StaticDemo() {
        staticCounter++;
        instanceCounter++;
    }

    static void displayStaticCounter() { // static method
        System.out.println("Static Counter: " + staticCounter);
    }

    void displayInstanceCounter() { // instance method
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        obj1.displayInstanceCounter(); // Displays 1
        StaticDemo.displayStaticCounter(); // Displays 1

        StaticDemo obj2 = new StaticDemo();
        obj2.displayInstanceCounter(); // Displays 1
        StaticDemo.displayStaticCounter(); // Displays 2

        StaticDemo obj3 = new StaticDemo();
        obj3.displayInstanceCounter(); // Displays 1
        StaticDemo.displayStaticCounter(); // Displays 3
    }
}
