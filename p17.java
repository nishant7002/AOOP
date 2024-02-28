class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating...");
    }
}

 class TestMethodOverriding {
    public static void main(String args[]) {
        Animal a = new Animal(); 
        Animal b = new Dog(); 

        a.eat(); 
        b.eat(); 
    }
}
