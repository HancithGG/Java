package Saved;
public class Demo {
    public static void main(String[] args) {
       System.out.println("Hanshith Etigowni");

       System.out.println("        * ");
       System.out.println("       *** ");
       System.out.println("      *****");
       System.out.println("    *********");
       System.out.println(" ****************");


       for(int j = 0; j<6; j++){
        System.out.println(" ");
        for(int i = 0; i<j; i++){
            System.out.print("*");
         }
        }
        
       int a = 1;
       int b = 2;
       char c = 'c';
       boolean d = true;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c+""+d);
       short by = 130;
       System.out.println(by);

       double pi = 1.34, radius = 5;

       System.out.println("Area of circle: "+(pi*(radius*radius)));

       a = 5;
       b = 6;
       a = a + b;
       b = a - b;
       a = b - a;
       System.out.println(a*-1);
       System.out.println(b);
    }
}
