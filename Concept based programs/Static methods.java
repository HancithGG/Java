class College {

    static String collegeName = "ABC College";
    String studentName;

    College(String studentName) {
        this.studentName = studentName;
    }

    static void changeCollegeName(String newName) {
        collegeName = newName;
    }

    void display() {
        System.out.println(studentName + " - " + collegeName);
    }

    public static void main(String[] args) {
        College s1 = new College("Ravi");
        College s2 = new College("Anil");

        s1.display();
        s2.display();

        College.changeCollegeName("XYZ College");

        s1.display();
        s2.display();
    }
}
