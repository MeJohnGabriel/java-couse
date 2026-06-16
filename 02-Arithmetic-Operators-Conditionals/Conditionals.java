import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        String name;
        int age;
        boolean isStudent;        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        name=  scanner.nextLine();

        System.out.print("How old are you? :");
        age = scanner.nextInt();

        System.out.print("Are you a student(true/false)?: ");
        isStudent = scanner.nextBoolean();
        
        // GROUP 1
        if (name.isEmpty()) {
            System.out.println("Please, fill out your name😶‍🌫️");
        } else {
            System.out.println("Hello, "+ name +"!");
        }

        // GROUP 2
        if(age >= 65){
          System.out.println("You are a senior🧓");
        }
        else if (age >= 18) {
            System.out.println("You are an adult🧑");
        } 
        else if(age < 0){
            System.out.println("You havent been born yet👻");
        }
        else if(age == 0){
            System.out.println("You are a baby👼");
        }
         else {
            System.out.println("You are underage👶");
        }

        // GROUP 3
        if (isStudent) {
            System.out.println("You are a student!👨‍🎓");
        }else {
            System.out.println("You are NOT a student.🤵");
        }
        scanner.close();
    }
}
