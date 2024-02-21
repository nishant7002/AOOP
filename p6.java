class Student {
    String enrollmentNo;
    String name;

    // Constructor to initialize the student object
    Student(String enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    // Method to display student details
    void display() {
        System.out.println("Enrollment No: " + this.enrollmentNo + ", Name: " + this.name);
    }

    public static void main(String[] args) {
        // Creating 3 objects of Student class
        Student student1 = new Student("S001", "John Doe");
        Student student2 = new Student("S002", "Jane Doe");
        Student student3 = new Student("S003", "Jim Beam");

        // Displaying student's name
        student1.display();
        student2.display();
        student3.display();
    }
}
