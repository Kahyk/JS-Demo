import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TrocaDeVariaveis t = new TrocaDeVariaveis();
        t.TrocaDeValores();

        Contagem c = new Contagem();
        c.Contar();

        Fibonacci f = new Fibonacci();
        f.sequenciafibonacci();

        Scanner sc = new Scanner(System.in);


        // --- Número Primo ---
        System.out.print("Digite um número para verificar se é primo: ");
        int n = sc.nextInt();
        System.out.println(n + (NumeroPrimo.ehPrimo(n) ? " é primo" : " não é primo"));

        // --- MDC ---
        System.out.print("\nDigite o primeiro número para calcular o MDC: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número para calcular o MDC: ");
        int b = sc.nextInt();
        System.out.println("MDC de " + a + " e " + b + " = " + MaximoDivisorComum.calcularMDC(a, b));

        // --- QuickSort ---
        System.out.print("\nDigite o tamanho do array para ordenar: ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextInt();
        }

        QuickSort.ordenar(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));

        // Fecha o Scanner apenas aqui, no fim de tudo
        sc.close();
    }
}
