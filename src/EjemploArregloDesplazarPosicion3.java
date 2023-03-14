import java.util.Scanner;

public class EjemploArregloDesplazarPosicion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[7];
        int numero, posicion;

        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese un numero a insertar: ");
        numero = scanner.nextInt();

        posicion = 0;
        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = numero;
        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }
    }
}
