import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for (int i=0; i < total-1; i++){
            for (int j =0; j < arreglo.length-1 -i; j++){
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j])< 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]=auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy S8","Disco Duro SSD Samsung Externo",
                "Asus Netbook","Macbook Air","Chromecast 4ta generacion","Redmi Note 10S"};
        int total = productos.length;
        /*int contador = 0;
        for (int i=0; i < total-1; i++){
           for (int j =0; j < total-1 -i; j++){
               if(productos[j+1].compareTo(productos[j])< 0){
                   String auxiliar = productos[j];
                   productos[j]= productos[j+1];
                   productos[j+1]=auxiliar;
               }
               contador++;
           }
        }*/

        //System.out.println("contador = " + contador);
        //Arrays.sort(productos);
        //arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));
        sortBurbuja(productos);
        System.out.println("=======Usando For=========");
        for (int i= 0; i < total; i++){
            System.out.println("Para indice "+ i + " : "+productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
        System.out.println("===========Array Numeros========");
        /*for (int i=0; i < numeros.length-1; i++){
            for (int j =0; j < numeros.length-1 -i; j++){
                if(((Comparable)numeros[j+1]).compareTo(numeros[j])< 0){
                    int auxiliar = numeros[j];
                    numeros[j]= numeros[j+1];
                    numeros[j+1]=auxiliar;
                }
            }
        }*/
        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length;i++){
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }

    }
}