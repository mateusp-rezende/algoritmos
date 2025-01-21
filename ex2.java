import java.io.IOException;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) throws IOException {

        // Variáveis
        int t, quantidade = 0; // Inicializa quantidade com 0
        int[] a = new int[5]; // Inicializa o array 'a' com tamanho 5

        Scanner scanner = new Scanner(System.in);

        t = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();

            if (a[i] == t) {
                quantidade++;
            }
        }

        System.out.println(quantidade);

        scanner.close(); // Boa prática
    }
}