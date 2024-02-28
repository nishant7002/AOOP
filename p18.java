class Car {
    int topSpeed;
    String name;

    Car(int topSpeed, String name) {
        this.topSpeed = topSpeed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car name='" + name + "', topSpeed=" + topSpeed  ;
    }

    public static void main(String[] args) {
        Car car1 = new Car(180, "Toyota ");
        Car car2 = new Car(200, "Ford ");
        Car car3 = new Car(220, "Volvo ");
        Car car4 = new Car(240, "Porsche");
        Car car5 = new Car(260, "Ferrari ");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
