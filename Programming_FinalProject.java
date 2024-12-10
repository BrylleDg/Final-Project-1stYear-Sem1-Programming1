import java.util.Scanner;

public class Programming_FinalProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();// let user input their name

        double num1, num2;
        boolean isRunning;
        char ans;
        int operation;
        double total;

        do {
            isRunning = true;

            do {
                System.out.println("===================================================");
                System.out.println("Welcome " + name + "!");
                System.out.println("(1) Addition");
                System.out.println("(2) Subtraction");
                System.out.println("(3) Multiplication");
                System.out.println("(4) Division");
                System.out.print("Please choose an operation: ");

                operation = scan.nextInt();// let user to input operation

                // will select operation base on user input
                switch (operation) {

                    case 1:
                        System.out.println("===================================================");
                        System.out.println("Hello " + name + "!, " + "You have chosen Addition ");
                        break;

                    case 2:
                        System.out.println("===================================================");
                        System.out.println("Hello " + name + "!, " + "You have chosen Subtaction ");
                        break;

                    case 3:
                        System.out.println("===================================================");
                        System.out.println("Hello " + name + "!, " + "You have chosen Multiplication ");
                        break;

                    case 4:
                        System.out.println("===================================================");
                        System.out.println("Hello " + name + "!, " + "You have chosen Division ");
                        break;

                    default:
                        System.out.println("===================================================");
                        System.out.println("Hello " + name + "!, " + "You have chosen an invalid operation.");
                        break;
                }

            } while (operation < 1 || operation > 4); // if user inputs an invalid code, the selection of operation will loop
                                                      

            System.out.println("===================================================");
            System.out.print("Enter first number: ");
            num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scan.nextDouble();

            // will select operation base on user input
            switch (operation) {
                case 1: // add
                    total = num1 + num2;
                    System.out.println("Total: " + total);
                    break;

                case 2: // minus
                    total = num1 - num2;
                    System.out.println("Total: " + total);
                    break;

                case 3: // multiply
                    total = num1 * num2;
                    System.out.println("Total: " + total);
                    break;

                case 4:// divide
                    if (num2 != 0) { // if user did not input 0 in num2
                        total = num1 / num2;
                        System.out.println("Total: " + total);
                        break;
                    } else {
                        System.out.println("Error");// if user input 0 in num2
                    }
            }

            do {

                System.out.println("===================================================");
                System.out.println("Do you want to perform another operation?(y/n): ");

                ans = scan.next().charAt(0);
                if (ans == 'n' || ans == 'N') {
                    // if user input n or N, the program will end
                    isRunning = false;
                } else if (ans == 'y' || ans == 'Y') {
                    // if user input y or Y, the program will loop
                    break;
                } else {
                    // if user input character other than y/Y & n/N
                    System.out.println("Invalid input. Please enter y or n.");
                }
            } while (isRunning);

        } while (isRunning);
        System.out.println("Operation ended.");
        System.exit(0);
        scan.close();

    }
}