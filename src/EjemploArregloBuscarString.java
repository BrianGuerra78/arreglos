import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[4];

        for (int i = 0; i < a.length; i ++){
            System.out.print("Ingrese un nombre ");
            a[i] = scanner.next();
        }
        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = scanner.next();
        int i = 0;
       /* while (i < a.length && a[i] != num){
            i++;
        }*/
        for(;i < a.length && !a[i].equalsIgnoreCase(nombre); i++){}
        if(i == a.length){
            System.out.println("Numero no encontrado");
        } else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            System.out.println("Encontrado en la posicion : "+ i);
        }
    }
}
