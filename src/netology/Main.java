package netology;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1,2);
        calc.printlin.accept(a);

        int b = calc.minus.apply(2,1);
        calc.printlin.accept(b);

        int c = calc.devide.apply(a, b);
        calc.printlin.accept(c);

        int d = calc.pow.apply(a);
        calc.printlin.accept(d);

        int e = calc.abs.apply(-a);
        calc.printlin.accept(a + e);

        boolean check =  calc.isPositive.test(e);
        System.out.println(check);

    }
}
