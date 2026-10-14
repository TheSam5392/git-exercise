public class Main {
    static String greet() {
        return "Hello";
    }
    public static void main(String[] args) {
        System.out.println(greet());
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
    }
}