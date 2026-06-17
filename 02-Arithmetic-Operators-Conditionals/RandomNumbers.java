import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        boolean isHeads;

        // number= random.nextInt(1,6);
        isHeads= random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }        
    }    

}
