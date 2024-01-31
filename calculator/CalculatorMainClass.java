package calculator;

import oops.Calculator;

import java.util.Scanner;

public class CalculatorMainClass {
    private static BasicCalculator calculation = new Impl();
    public static void main(String[] args)
    {
        System.out.println("Choose which operation you want to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.println("Enter operation number");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Enter 1st number");
        int a = s.nextInt();
        System.out.println("Enter 2nd number");
        int b = s.nextInt();

        int result = processInput(input, a, b);
        System.out.println("Result of the operation is: "+ result);
        s.close();
    }

    public static int processInput(String input, int a, int b)
    {
        int result=0;

        switch (input)
        {
            case "1":
                result = calculation.addition(a, b);
                break;
            case "2":
                result = calculation.subtraction(a,b);
                break;
            case "3":
                result = calculation.multiply(a,b);
                break;
            case "4":
                result = calculation.divide(a,b);
        }
        return result;
    }

}
