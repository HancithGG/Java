class Student {

    String name;
    int rollNo;
    String course;

    // Default constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
        course = "Not Assigned";
    }

    // Parameterized constructor
    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void display() {
        System.out.println(name + " - " + rollNo + " - " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 101, "Java");

        s1.display();
        s2.display();
    }
}
