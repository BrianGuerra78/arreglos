import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int ultimo;
        for (int i = 0; i < a.length ;i++){
            System.out.print("Ingrese el numero:");
            a[i] = scanner.nextInt();
        }
        System.out.println();
        ultimo = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--){
            a[i+1] = a[i];
        }
        a[0] = ultimo;
        System.out.println("El arreglo final:");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
