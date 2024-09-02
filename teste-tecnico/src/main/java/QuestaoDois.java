import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe uma string: ");
        String input = scanner.nextLine();

        int contador = 0;

        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == 'a') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
        }

        scanner.close();
    }
}
