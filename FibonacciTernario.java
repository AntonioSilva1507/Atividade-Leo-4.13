public class FibonacciTernario {
    public int calculaFibonacci(int n) {
        return (n <= 1) ? n : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }
    }
}