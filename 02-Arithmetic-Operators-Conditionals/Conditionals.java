import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        // =---------------------------STUDY
        // String name;
        // int age;
        // boolean isStudent;        
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter your name: ");
        // name=  scanner.nextLine();

        // System.out.print("How old are you? :");
        // age = scanner.nextInt();

        // System.out.print("Are you a student(true/false)?: ");
        // isStudent = scanner.nextBoolean();
        
        // // GROUP 1
        // if (name.isEmpty()) {
        //     System.out.println("Please, fill out your name😶‍🌫️");
        // } else {
        //     System.out.println("Hello, "+ name +"!");
        // }

        // // GROUP 2
        // if(age >= 65){
        //   System.out.println("You are a senior🧓");
        // }
        // else if (age >= 18) {
        //     System.out.println("You are an adult🧑");
        // } 
        // else if(age < 0){
        //     System.out.println("You havent been born yet👻");
        // }
        // else if(age == 0){
        //     System.out.println("You are a baby👼");
        // }
        //  else {
        //     System.out.println("You are underage👶");
        // }

        // // GROUP 3
        // if (isStudent) {
        //     System.out.println("You are a student!👨‍🎓");
        // }else {
        //     System.out.println("You are NOT a student.🤵");
        // }
        // scanner.close();
    
    
        // =---------------------------STUDY NESTED IF STATEMENTS

        // boolean isStudent = false;
        // boolean isSenior = false;
        // double price = 9.99;

        // if (isStudent) {
        //     if (isSenior) {
        //         System.out.println("You get a senior discount of 20%");
        //         System.out.println("You get a student discount of 10%");
        //         price *=  0.7;
        //     } else{
        //         System.out.println("You get a student discount of 10%");
        //         price *=  0.9;
        //     }
        // } else {
        //     if (isSenior) {
        //     System.out.println("You get a senior discount of 20%");
        //     price*= 0.8; 
        //     } else {
        //     price*= 1;    
        //     }
        // }
        
        // System.out.printf("The price of your ticket is: $%.2f", price);


        // =---------------------------STUDY LOGICAL OPERATORS
        // && = AND
        // || = OR 
        // ! = NOT

        double temp = 32;
        boolean badWeather = false;

        if (temp >= 30 && !badWeather) {
            System.out.println("The weather is good!");
        } else{
            System.out.println("Neuter");
        }

    }
}
