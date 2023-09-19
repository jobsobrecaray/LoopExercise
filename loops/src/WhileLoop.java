import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        String letter = "";
        int grade = 0;
        // set up your scanner
        Scanner in = new Scanner(System.in);

        // get input

        // while input is not equal to -1
        do {
            System.out.print("Enter a grade: ");
            grade = in.nextInt();
            if (grade<=100 && grade>=95) {
                letter = "A+";
                //System.out.println("A+");
            } else if (grade<=94 && grade>=85) {
                letter = "A";
                //System.out.println("A");
            } else if (grade<=84 && grade>=75) {
                letter = "B";
                //System.out.println("B");
            } else if (grade<=74 && grade>=65) {
                letter = "C";
                //System.out.println("C");
            } else if (grade<=64 && grade>=50) {
                //System.out.println("D");
                letter = "D";
            } else {
                //System.out.println("F");
                letter = "F";
            }
            System.out.println("Your grade is: " + letter);

        } while (grade != -1);
        // Check grade and output appropriate value
    }
}
