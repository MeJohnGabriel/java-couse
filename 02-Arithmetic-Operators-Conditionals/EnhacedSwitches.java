import java.util.Scanner;

public class EnhacedSwitches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What day is it?: ");

        String day = scanner.nextLine();

        // switch (day) {
        //     case "Monday" -> System.out.println("It is a week day.");
        //     case "Tuesday" -> System.out.println("It is a week day.");
        //     case "Wednesday" -> System.out.println("It is a week day.");
        //     case "Thursday" -> System.out.println("It is a week day.");
        //     case "Friday" -> System.out.println("It is a week day.");
        //     case "Saturday" -> System.out.println("It is a weekend day.");
        //     case "Sunday" -> System.out.println("It is a weekend day.");
        //     default -> System.out.println(day + " is not a day.");
        // }
    
        switch (day) {
          case "Monday" , "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It is a week day.");
          case "Saturday","Sunday" ->
                System.out.println("It is a weekend day.");
          default -> System.out.println(day + " is not a day.");
        }
    }
}
