class FinalKeywordDemo {
    final int MAX_VALUE = 99; // final variable

    void attemptToChangeFinal() {
        // MAX_VALUE = 101; // This line would cause a compilation error because MAX_VALUE is final
    }

    final void display() {
        System.out.println("This is a final method.");
    }

    class SubClass extends FinalKeywordDemo {
        // void display() { // This line would cause a compilation error because display() in FinalKeywordDemo is final
        //     System.out.println("Attempt to override final method.");
        // }
    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo();
        System.out.println("MAX_VALUE: " + obj.MAX_VALUE);
        obj.display();
    }
}
