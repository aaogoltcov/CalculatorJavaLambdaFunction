public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        // такая реализация не работает, т.к. calc не предоставляет
        // методы plus, minus, divide - добавил их в Calculator
         int a = calc.plus.apply(1, 2);
         int b = calc.minus.apply(1,1);
         int c = calc.divide.apply(a, b);

        // calc не предоставляет метод println - добавил в Calculator
         calc.println.accept(c);
    }
}