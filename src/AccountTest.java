import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        // create a Scanner object to obtain input from the command line
        Scanner input = new Scanner(System.in);

        // create an Account object and assit it to myAccount
        Account myAccount = new Account();

        //display inital value  of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // prompt for and read name
        System.out.println("Please Enter a name: ");
        String theName = input.nextLine(); // put theName in myAccount
        myAccount.setName(theName); // put theName in myAccount
        System.out.println(); //outputs a blank line

        //display the name stored in object myAccount
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());

    }
}