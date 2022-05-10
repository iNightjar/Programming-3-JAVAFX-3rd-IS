// package medhat;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// import javax.swing.plaf.metal.OceanTheme;

// public class inputMisMatchExceptionDemo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         boolean continueInput = true;
//         try {
//             System.out.println("Enter an integer: ");
//             int number = input.nextInt(); // if user input is char 'a' ?
//             System.out.println("the Number is : " + number);
//             continueInput = false;

//         } catch (InputMismatchException exception) {
         
//             System.out.println("try again. ( "  + "incorrect input: an integer is required )" );
//             input.nextLine(); // Discard input

//         }
//         while (continueInput);
//     }
// }
