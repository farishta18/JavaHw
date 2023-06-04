package class24;

public interface Outputs {
    void display();
}

interface function{
    double adding(double firstNumber, double secondNumber);
    double subtracting(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber, double secondNumber);
}

class main implements Outputs, function{

    @Override
    public void display() {

    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }
}

