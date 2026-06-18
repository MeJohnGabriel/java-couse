import java.util.Arrays;
import java.util.Scanner;
public class Arrayss {
 public static void main(String[] args) {
    /* 
    // STUDY=========ARRAYS========================
    //  String[] fruits  = {"apple", "banana", "coconut", "dryberry"};
    for(int i= 0; i < fruit.length; i++){
          System.out.println(fruit[i]);
         System.out.print(fruit[i] + " ");
     }

    Arrays.sort(fruits);
    Arrays.fill(fruits, "noodles");

    for(String fruit:fruits){
        System.out.println(fruit);
    } 
   */   
    /*
    // STUDY=========ARRAYS(ACCEPTING USERS INPUT)========================
    Scanner scanner = new Scanner(System.in);
    String[] foods;    
    int size;

    System.out.println("How many foods would you like?: ");
    size = scanner.nextInt();
    scanner.nextLine();
    // String[] foods = new String[5];    
    foods = new String[size];

    for(int i = 0; i < foods.length; i++){
        System.out.print("Type in food "+ (i+1) + " :");
        foods[i] = scanner.nextLine();
    }

    for(String f : foods){
        System.out.println(f);
    }

    System.out.println(foods.length);

    scanner.close();
     */
    /*
    // ====STUDY Searching for numbers
    int[] numbers = {1,2,3,4,5,6,8,9};
    int target = 7;
    boolean isFound = false;

    for (int i = 0; i < numbers.length; i++) {
        if (target == numbers[i]) {
            System.out.println("Element" +"("+numbers[i]+")" + " found at index: " + i);
            isFound = true;
            break;
        } 
    }
    if (!isFound) {
        System.out.println("The element was not found is the array.");
    }
    */
    /*
    Scanner scanner = new Scanner(System.in);
    String[] fruits = {"apple", "banan", "orange"};
    System.out.print("Enter a fruit:");
    String target = scanner.nextLine().toLowerCase();

    for (int i = 0; i < fruits.length; i++) {
        if (target.equals(fruits[i])) {
            System.out.println("The fruit " + target + " was found at index:" + i);
        }
    }

    scanner.close();
     */
    // System.out.println(add(1,2,3,4));
    // System.out.println(avg());

    // STUDY---------2D ARRAY------------------------------
    /*String[] fruits = {"apple", "orange", "banana"};
    String[] vegetables = {"onion", "cole", "lettuce"};
    String[] meat = {"chicken", "pork", "beef"};

    String[][] groceries = {fruits,vegetables,meat};
    
    groceries[1][2] = "collete";

    for(String[] foods : groceries){
        for(String food : foods){
            System.out.print(food + " ");
        }
        System.out.println();
   }
    */

   char[][] keypads = {{'1', '2', '3'},{'4','5','6'},{'7','8','9'},{'*','4','#'}};

    for (char[] row : keypads ) {
        for(char keypad : row){
            System.out.print(keypad + " ");
        }   
        System.out.println();
    }


}

/*    
//VARARGS 
static int add(int... numbers){
    int sum = 0;    
    
    for(int number : numbers){
        sum +=number;
    }
    return sum;
 */
    
    /*
    static double avg(double... numbers){
        
        double sum = 0;

        if (numbers.length ==0) {
            return 0;
        }

        for(double n:numbers){
            sum+=n;
        }

        return sum / numbers.length;
    }
         */
}
