package caculator;

public class Calculator {

    public void addition(Addition addition) {
        addition.setResult(addition.getLeft() + addition.getRight());
    }
    public void subtraction(Subtraction subtraction) {
        subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
    }

}
