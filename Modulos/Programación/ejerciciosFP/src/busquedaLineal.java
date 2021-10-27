import java.util.Scanner;

/*public class busquedaLineal {

    public static boolean busquedaLineal(int array[], int elemento){
        boolean encontrado = false;

        for(int i = 0; i < array.length && !encontrado; i++){
            if(array[i] == elemento){
                encontrado = true;
            }
        }

        return encontrado;
    }

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);

        int[] array = new int[10];

        for(int i = 0;i < array.length; i++){
            array[i] = i + 1;
        }

        boolean estael = busquedaLineal(array,12);

        System.out.println(estael);
    }
}*/



// Búsqueda binaria pero con el nombre cambiado para no camboiar el nombre del archivo
public class busquedaLineal{

    public static boolean busquedaBinaria(int array[], int elemento){

        boolean encontrado = false;
        int inicio = 0;
        int fin = array.length -1;
        int posicion_buscar;

        while ( inicio <= fin && !encontrado){
            posicion_buscar = (inicio + fin) / 2;
            if (array[posicion_buscar] == elemento){
                encontrado = true;
            } else {
                if (elemento > array[posicion_buscar]){
                    inicio = posicion_buscar + 1;
                } else {
                    fin = posicion_buscar -1;
                }
            }
        }
        return encontrado;
    }




    public static void main(String[]args){

        int[] array = new int[10];

        for(int i = 0;i < array.length; i++){
            array[i] = i + 1;
        }

        boolean estael = busquedaBinaria(array,10);

        System.out.println(estael);

    }
}