import java.util.Scanner;

public class EjemploArregloBuscarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i ++){
            System.out.print("Ingrese un numero ");
            a[i] = scanner.nextInt();
        }
        System.out.println("\r\nIngrese un numero a buscar: ");
        int num = scanner.nextInt();
        int i = 0;
       /* while (i < a.length && a[i] != num){
            i++;
        }*/
        for(;i < a.length && a[i] != num; i++){}
        if(i == a.length){
            System.out.println("Numero no encontrado");
        } else if (a[i] == num) {
            System.out.println("Encontrado en la posicion : "+ i);
        }
    }
}
