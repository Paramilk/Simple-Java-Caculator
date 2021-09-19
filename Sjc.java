import java.util.Scanner;

public class Sjc {
    public static void main(String args[]) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Simple Java Caculator");
        
        System.out.println("Chose an operator: +, -, *(X), /(Divide)");
        final char operator = input.next().charAt(0);

        System.out.println("Chose your first number.");
        final double number1 = input.nextDouble();

        System.out.println("Chose your second number.");
        final double number2 = input.nextDouble();

        switch (operator) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;

            case '*':
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;

            case '/':
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;

            default:
                System.out.println("INVALID OPERATOR!!!!! >:(");
        }
    
        input.close();
    }
}