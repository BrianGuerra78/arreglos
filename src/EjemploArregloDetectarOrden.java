import java.util.Scanner;
import java.util.SortedMap;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < a.length; i ++){
            a[i] = scanner.nextInt();
        }
        boolean ascendente = false;
        boolean descendendte = false;
        for (int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                descendendte = true;
            }
            if (a[i] < a[ i+1]){
                ascendente= true;
            }
        }
        if( ascendente== true && descendendte == true){
            System.out.println("Arreglo = desordenado");
        } else if (ascendente == false && descendendte == false) {
            System.out.println("Arreglo = todos son iguales");
        } else if (ascendente == true && descendendte == false) {
            System.out.println("Arreglo = ordenado de forma ascendente");
        } else if (ascendente == false && descendendte == true) {
            System.out.println("Arreglo = ordenado de forma descendente");
        }
    }
}
