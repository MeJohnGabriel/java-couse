import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {

    // STUDY--------------WHILE LOOPS-----------------------
        // String name =  "";
        // Scanner scanner = new Scanner(System.in);
        
        // // while(name.isEmpty()) {
        // //     System.out.print("Enter your name: ");
        // //     name = scanner.nextLine();
        // // }        
   
        // // System.out.println("Hello, " + name);
        
        // // scanner.close();

        // Scanner scanner = new Scanner(System.in);
        // String response = "";
        
        // while (!response.equals("q")) {
        //     System.out.print("Press the letter 'q' to quit the loop.");
        //     response = scanner.next().toLowerCase(); 
        // }

        // scanner.close();
    
    // STUDY--------------FOR LOOPS-----------------------
    // for(int i = 1; i < 4; i++){
    //     // System.out.println("Messi is the best player in the world!");
    //     System.out.println("Messi scored the " + i + "° goal!");
    // }

    //     for(int i = 5; i > 6; i--){
    //     System.out.println(i + " Pizzas left");
    // }

    //     for(int i = 10; i <= 19; i++){
    //     System.out.println(i + " Calzonis");
    // }

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Howm many times do you want to loop?: ");
    // int max = scanner.nextInt();

    // for(int i = 0; i < max; i++){
    //     System.out.print("You loop has " + i + " iterations.");
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many seconds?: ");
    int start = scanner.nextInt();

    for(int i = start; i > 0; i--){
        System.out.print( i + " seconds left...\n");
        Thread.sleep(1000);
    }    

}
}
