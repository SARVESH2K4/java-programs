import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = input.nextfloat();
        System.out.print("Enter second number: ");
        float num2 = input.nextInt();
        float sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
