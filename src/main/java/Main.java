public class Main {
    public static void main(String[] args) {
        Calculator add = new Calculator(9,5);
Calculator substract = new Calculator(10,6);
Calculator mult = new Calculator(2,2);
Calculator divide = new Calculator(9,3);

        System.out.println( add.numbers()+ add.add());
        System.out.println(substract.substract());
        System.out.println(mult.multiply());
        System.out.println(divide.divide());
    }
}
