import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {


            System.out.println("Enter a whole number to divide.");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by.");
            int y = scanner.nextInt();


            int z = x / y;

            System.out.println("result:  " + z);

        }
        catch (ArithmeticException e) {
            System.out.println("you cant divide by zero man!!!!");
        }

        catch (InputMismatchException e) {

            System.out.println("PUT A NUMBER");

        }

        finally{

            System.out.println("this will always print");
            scanner.close();
        }
    }
}









//exceptions - events that occur during the execution of a program that disrupts the normal flow of instructions
// when we divide by zero in our program, we throw an exception

// put bad code into try, and catch the 'ArithmeticException'
// if someone doesnt put a number - 'InputMismatchException'

// catch (exception e) catches every exception

// finally() block - always executed at and - good to use any open scanners or files