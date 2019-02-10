import java.util.Scanner;

// Addition Program that displays the sum of two integers
public class Addition {

    //main method begins execution of Java application
    //method has (), method name followed by ()
    public static void main(String[] args) {
        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter a integer");
        number1 = input.nextInt(); //reads first number from user

        System.out.print("Enter a second integer");
        number2 = input.nextInt(); // reads second number from user

        sum = number1 + number2; //add numbers then store total in sum

        System.out.printf("Sum is %d%n", sum); //display sum




    }


}
