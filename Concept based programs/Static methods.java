//**** important: static is useful due to its can be share by multiple object 
//static variable and static method can be used to share and update a common college name across multiple student objects
class College {

    static String collegeName = "ABC College";
    String studentName;

    College(String studentName) {
        this.studentName = studentName;
    }

    static void changeCollegeName(String collegeName) {
        College.collegeName = collegeName;
    }

    void display() {
        System.out.println(studentName + " - " + collegeName);
    }

    public static void main(String[] args) {
        College s1 = new College("Ravi");
        College s2 = new College("Anil");

        s1.display();
        s2.display();

        College.changeCollegeName("XYZ College"); /// instead of this you can simply use College.collegeName = "XYZ College";

        s1.display();
        s2.display();
    }
}
