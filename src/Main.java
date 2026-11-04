public class Main {
    static String greet() {
        return "Hello, World";
    }
    public static void main(String[] args) {
        System.out.println(greet());
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.subtract(2, 3));
        System.out.println(calc.multiply(2, 3));
        System.out.println(calc.divide(2, 3));
    }
}