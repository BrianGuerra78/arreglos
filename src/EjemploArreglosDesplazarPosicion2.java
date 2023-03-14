import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int elemento, posicion;
        for (int i = 0; i < a.length-1 ;i++){
            System.out.print("Ingrese el numero:");
            a[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento");
        elemento = a[a.length-1];

        System.out.println("Posicion donde agregar (0 - 9)");
        posicion = scanner.nextInt();
        for (int i = a.length-2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;
        System.out.println("El arreglo final:");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
