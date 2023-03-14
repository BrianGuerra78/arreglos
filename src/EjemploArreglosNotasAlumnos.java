import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumMate = 0, sumHis = 0, sumLeng = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 7; i++) {
            sumMate += claseMatematicas[i];
            sumHis += claseHistoria[i];
            sumLeng += claseLenguaje[i];
        }
        double promedioMatematicas = (sumMate / claseMatematicas.length);
        double promedioHistoria = (sumHis / claseHistoria.length);
        double promedioLengua = (sumLeng / claseLenguaje.length);
        double promTotal = (promedioMatematicas + promedioHistoria + promedioLengua) / 3;
        System.out.println("Promedio clase de Matematicas: " + promedioMatematicas);
        System.out.println("Promedio clase Historia: " + promedioHistoria);
        System.out.println("Promedio clase Lengua: " + promedioLengua);
        System.out.println("Promedio total del curso: " + promTotal);

        System.out.println("Ingrese el identificador del alumno ( de 0 -6):");
        int id = scanner.nextInt();
        double promAlum = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("Promedio del Alumno Nro: " + id + " : " + promAlum);
    }
}
