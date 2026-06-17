import java.util.Scanner;
public class Strings {
public static void main(String[] args) {
    // STUDY-------SRTRING METHODD
    // String name= "Password";
    
    // int length= name.length();   
    // char letter = name.charAt(0);
    // int index = name.indexOf(" ");
    // int lastIndex = name.lastIndexOf("o");


    // name = name.trim();
    // System.out.println(name);
    // System.out.println(length);
    // System.out.println(index);
    // System.out.println(lastIndex);
    // System.out.println(letter);

    /*    
    if (name.contains(" ")) {
        System.out.println("Your name contains space");
    } else {
        System.out.println("Your name DOESNT contain space");
    }
    */

    // if (name.equalsIgnoreCase("Password")) {
    //     System.out.println("Your name cant be Password");
    // } else {
    //     System.out.println("Hello, " + name);
    // }


    // STUDY-------SUBSTRINGS     
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type your email: ");
    
    String email;
    int index;
    String domain;
    String username;

    email = scanner.nextLine();
    if (email.contains("@")) {
      index = email.indexOf("@");
      username = email.substring(0,index);
      domain = email.substring(index + 1);
   
      System.out.println(email);
      System.out.println(domain);
      System.out.println(username);
    } else{
        System.out.println("Email must contain @");
    }



    scanner.close();
}   
}
