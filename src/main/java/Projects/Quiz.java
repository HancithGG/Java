package Projects;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Welcome to the worlds weirdest quiz :) hehe boi");
        System.out.println("-------------------!-(*-*)-?------------------------------");
        System.out.println("pray god before starting dumbo\n");

        boolean choose = true;
        while (choose == true) {
            System.out.println("1st question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 1
System.out.println("\n1. Who is the holy virgin chad ?\n");
System.out.println("a. Alexander\tb. Sheark\tc. pinnochio\td. Jerry");
System.out.print("choose your choice wisely: ");
char choice = sc.nextLine().charAt(0);
if(choice == 'c'){
    score += 1;
}

System.out.println("\n2nd question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 2
System.out.println("\n2. Who invented the art of sleeping in class?\n");
System.out.println("a. Einstein\tb. My Benchmate\tc. Doraemon\td. The Principal");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'b'){
    score += 1;
}

System.out.println("\n3rd question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 3
System.out.println("\n3. What is the national animal of Wi-Fi?\n");
System.out.println("a. Router\tb. Signal Dog\tc. Password Cat\td. Antenna");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'a'){
    score += 1;
}

System.out.println("\n4th question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 4
System.out.println("\n4. Who is the CEO of Procrastination Inc?\n");
System.out.println("a. Me\tb. My Alarm Clock\tc. Netflix\td. Homework");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'a'){
    score += 1;
}

System.out.println("\n5th question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 5
System.out.println("\n5. What is the capital of Lazytown?\n");
System.out.println("a. Bed\tb. Sofa\tc. Beanbag\td. Pillow");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'd'){
    score += 1;
}

System.out.println("\n6th question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 6
System.out.println("\n6. Who discovered the equation: Pizza > Homework?\n");
System.out.println("a. Archimedes\tb. Hungry Student\tc. Chef Boyardee\td. Garfield");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'b'){
    score += 1;
}

System.out.println("\n7th question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 7
System.out.println("\n7. What is the official language of Memeland?\n");
System.out.println("a. LOL\tb. BRB\tc. XD\td. All of the above");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'd'){
    score += 1;
}

System.out.println("\n8th question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 8
System.out.println("\n8. Who is the undefeated champion of Hide & Seek?\n");
System.out.println("a. My Socks\tb. Remote Control\tc. Homework Sheets\td. All of the above");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'd'){
    score += 1;
}

System.out.println("\n9th question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 9
System.out.println("\n9. What is the currency of Dreamland?\n");
System.out.println("a. Sheep\tb. Zzz\tc. Pajamas\td. Pillows");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'b'){
    score += 1;
}

System.out.println("\n10th question");
System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

// Question 10
System.out.println("\n10. Who is the founder of the International Napping Association?\n");
System.out.println("a. Snorlax\tb. My Dad\tc. Koala\td. Me during lectures");
System.out.print("choose your choice wisely: ");
choice = sc.nextLine().charAt(0);
if(choice == 'a'){
    score += 1;
}


            String comment = "";
            if(score <= 5){
                comment = "fuck the grow up kido";
            }else if(score < 8 ){
                comment = "Okay you worth human life";
            }
            else{
                comment = "you are a badass (mind if i stretch virgins);) ";
            }
            System.out.println("\nfinal score : "+score+"/10");
            System.out.println(comment);
            System.out.println("\nwant to retest?\na. no b. lets fuck it");
            System.out.print("choose: ");
            char select_option = sc.nextLine().charAt(0);
            choose = (select_option == 'a')? false : true;
        }
        


            
    }
}
