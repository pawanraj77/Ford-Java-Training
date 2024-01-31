package calculator;
import java.util.List;

public class Impl implements BasicCalculator{

    @Override
    public int addition(int a, int b)
    {
        return a+b;
    }
    @Override
    public int subtraction(int a, int b)
    {
        return a-b;
    }
    @Override
    public int multiply(int a, int b)
    {
        return a*b;
    }
    @Override
    public int divide(int a, int b) throws ArithmeticException
    {
        return a/b;
    }

}
