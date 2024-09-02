import java.util.Scanner;

public class QuestaoUm {
    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
