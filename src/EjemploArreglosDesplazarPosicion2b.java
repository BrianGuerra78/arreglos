import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int elemento, posicion, ultimo;
        for (int i = 0; i < a.length ;i++){
            System.out.print("Ingrese el numero:");
            a[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento");
        elemento = scanner.nextInt();

        ultimo = a[a.length-1];
        System.out.println("Posicion donde agregar (0 - 9)");
        posicion = scanner.nextInt();

        ultimo = a[a.length-1];
        for (int i = a.length-2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        b[posicion] = elemento;

        b[b.length-1]=ultimo;
        System.out.println("El arreglo final:");
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
