public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int substract() {
        int substract = a - b;
        return substract;
    }

    public int divide() {
        int divide = a / b;
        return divide;
    }

    public int multiply() {
        int multiply = a * b;
        return multiply;
    }

    public int add() {
        int add = a + b;
        return add;
    }
    public String numbers() {
        String numbers =  a + b +"=";
        return numbers;
    }
}
