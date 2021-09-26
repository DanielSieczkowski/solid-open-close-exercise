import caculator.Addition;
import caculator.Calculator;
import caculator.Subtraction;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Addition addition = new Addition(1,2);
        Subtraction subtraction = new Subtraction(1,2);

        calculator.calculate(addition);;
        System.out.println(addition.getResult());
    }
}
