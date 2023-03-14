import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        /*String[] productos = new String[7];
        int total = productos.length;
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy S8";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Netbook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Redmi Note 10S";*/
        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy S8","Disco Duro SSD Samsung Externo",
                "Asus Netbook","Macbook Air","Chromecast 4ta generacion","Redmi Note 10S"};
        int total = productos.length;
        Arrays.sort(productos);
        System.out.println("=======Usando For=========");
        for (int i= 0; i < total; i++){
            System.out.println("Para indice "+ i + " : "+productos[i]);
        }
        System.out.println("=========Usando For Inverso========");
        for (int i=0; i <total;i++){
            System.out.println("Para i = " + (total-1-i) + " valor: "+ productos[total-1-i]);
        }
        System.out.println("==============Usando For Inverso 2============");
        for (int i = total-1; i >= 0; i --){
            System.out.println("Para i =" + i + " valor " + productos[i]);
        }
    }
}