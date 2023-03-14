import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a, pares, impares;
        a = new int[10];
        int totalPares = 0, totalInpares = 0;
        System.out.println("Introduce 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalInpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalInpares];

        int j = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[j++]= a[i];
            }else {
                impares[k++] = a[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
