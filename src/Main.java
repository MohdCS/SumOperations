import java.util.Scanner;

public class Main {
    public static double v1;
    public static double v2;

    public static void main(String[] args) {
        inputValues();
    }

    public static double addition(double a, double b) {
        return (a + b);
    }

    public static double subtraction(double a, double b) {
        return (a - b);
    }

    public static double multiplication(double a, double b) {
        return (a * b);
    }

    public static double division(double a, double b) {
        return (a / b);
    }

    public static double pow(double a, double b){
        return (Math.pow(a, b));
    }

    public static void operation() {

        try {
            Scanner input = new Scanner(System.in);

            System.out.println("What operation (+, -, *, / or pow) for " + v1 + " and " + v2 + "?\t");
            String operation = input.nextLine();

            switch (operation) {
                case "+" -> {
                    System.out.println(v1 + " + " + v2 + " =\t\t" + addition(v1, v2));
                    ReTry();
                }
                case "-" -> {
                    System.out.println(v1 + " - " + v2 + " =\t\t" + subtraction(v1, v2));
                    ReTry();
                }
                case "*" -> {
                    System.out.println(v1 + " * " + v2 + " =\t\t" + multiplication(v1, v2));
                    ReTry();
                }
                case "/" -> {
                    System.out.println(v1 + " / " + v2 + " =\t\t" + division(v1, v2));
                    ReTry();
                }
                case "pow", "POW", "Pow", "P", "p" -> {
                    System.out.println(v1 + " pow " + v2 + " =\t\t" + pow(v1, v2));
                    ReTry();
                }
                default -> {
                    System.out.println("Invalid choice, try again!");
                    operation();
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid choice, try again!");
            operation();
        }

    }

    public static void inputValues() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter value #1:\t\t");
            v1 = input.nextDouble();

            System.out.print("Enter value #2:\t\t");
            v2 = input.nextDouble();

            operation();

        } catch (Exception e) {
            System.out.println("Invalid input, try again!");
            inputValues();
        }
    }

    public static void ReTry() {
        Scanner input = new Scanner(System.in);
        System.out.print("Try again?\t\t");
        String answer = input.nextLine();

        if (answer.equals("Yes") || answer.equals("yes") || answer.equals("YES") || answer.equals("Y") || answer.equals("y")) {
            inputValues();
        } else if (answer.equals("No") || answer.equals("no") || answer.equals("NO") || answer.equals("N") || answer.equals("n")) {
            System.out.println("Bye!");
            System.exit(1);
        } else {
            System.out.println("Invalid answer, try again!");
            ReTry();
        }
    }
}
