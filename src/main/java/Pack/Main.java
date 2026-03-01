package Pack;

public class Main {
    public static void main(String[] args) {
     School oSchool = new School("hansth", "psychology");
     oSchool.display();

     School.changeSchoolName("naryana");

     oSchool.display();

     School oSchool2 = new School("op", "gaming");
     oSchool2.display();


}

}

class School{
    static String schoolname = "sri chaitanya";
    String studentName, course;

    School(String studentName, String course){
        this.studentName = studentName;
        this.course = course;
        
    }
    void display(){
        System.out.println("student name: "+studentName);
        System.out.println("course enroll: "+course);
        System.out.println("school name: "+schoolname);
    }

    static String changeSchoolName( String changedname){
       return schoolname = changedname;
    }


}