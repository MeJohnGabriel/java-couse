public class PrintF {
    public static void main(String[] args) {
        // used to format outputs

        //--STUDY %[flags][width][.precision][specifier-character]

        // String name=  "Johny Bravo";
        // char firstLetter = 'J';
        // int age = 30;
        // double height = 60.5;
        // boolean isEmployed = true;


        // System.out.printf("Hello %s\n", name);
        // System.out.printf("Your name starts with a %c\n", firstLetter);
        // System.out.printf("You are %d years old\n", age);
        // System.out.printf("You are %f inches tall\n", height);
        // System.out.printf("Employed %b\n", isEmployed);

        // System.out.printf("%s is %d years old", name, age);

        // --STUDY----FLAGS
        // double price1 = 1000.234;
        // double price2 = 129000.12;
        // double price3 = 111000.10;
        // System.out.printf("%,.2f\n", price1);
        // System.out.printf("%,.1f\n", price2);
        // System.out.printf("%,.1f\n", price3);
        

        // STUDY---WIDTH
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%4d\n", id4);
    }   
}
