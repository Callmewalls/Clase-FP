/*import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);



        // Rellenar y mostrar array

        /*int aux;
        int[] lista = new int[10];
        
        for(int i = 0; i < lista.length; i++){
            lista[i] = (int) (Math.random()*100);
        }
        System.out.print("{");
        for(int j = 0; j < lista.length; j++){
            System.out.print(" " + lista[j] + ",");
        }
        System.out.println("}");*/
        // Método burbuja
        /*for(int i = 0; i < (lista.length); i++){
            for(int j = 0; j < (lista.length - 1); j++){
                if(lista[j] > lista[j + 1]){
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }*/


        //Método inserción

        /*for(int i = 0; i < (lista.length); i++){
            int pos = i;
            aux = lista[i];

            while((pos > 0) && (lista[pos - 1] > aux)){
                lista[pos] = lista[pos-1];
                pos--;
            }
            lista[pos] = aux;
        }*/

        //Método de selección

        /*for(int i = 0; i < lista.length; i++){
            int min = i;
            for(int j = i + 1; j < lista.length; j++){
                if(lista[j] < lista[min]){
                    min = j;
                }
            }
            aux = lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
        }*/

        //Mostrar array 2
        /*
        System.err.println("ORDENADO");
        System.out.print("{");
        for(int j = 0; j < lista.length; j++){
            System.out.print(" " + lista[j] + ",");
        }
        System.out.println("}");

        tcl.close();

    }
}*/

