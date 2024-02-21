class ThisKeywordDemo {
    int a;
    int b;

    // Constructor with two parameters
    ThisKeywordDemo(int a, int b) {
        this.a = a; // Using 'this' to refer to the instance variable 'a'
        this.b = b; // Using 'this' to refer to the instance variable 'b'
    }

    void display() {
        System.out.println("a = " + this.a + ", b = " + this.b);
    }

    void setValues(int a, int b) {
        this.a = a; // Using 'this' to distinguish between instance variables and parameters
        this.b = b;
    }

    ThisKeywordDemo get() {
        return this; // Returning the current instance
    }

    void print() {
        System.out.println("Inside print method");
    }

    void callPrint() {
        this.print(); // Using 'this' to call another method in the same class
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo(10, 20);
        obj.display();
        obj.setValues(30, 40);
        obj.display();
        ThisKeywordDemo obj2 = obj.get();
        obj2.display();
        obj.callPrint();
    }
}
