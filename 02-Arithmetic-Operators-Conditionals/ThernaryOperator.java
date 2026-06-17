public class ThernaryOperator {
    public static void main(String[] args) {
        int score = 70;

        // if (score >= 70) {
        //     System.out.println("Passed");
        // } else {
        //     System.out.println("Failed");
        // }

        String passOrFail = (score >=70) ? "Passed" : "Failed";
        System.out.println(passOrFail);

        int number = 4;
        String evenOrOdd=  (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
    
        int hours = 13;
        String timeOfDay = (hours > 12) ? "P.M" : "A.M";
        System.out.println(timeOfDay);  
    
        int income = 60000;
        double taxRate= (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate); 
    }

}
