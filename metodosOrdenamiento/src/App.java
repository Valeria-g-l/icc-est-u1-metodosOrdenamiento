import java.nio.channels.Pipe.SourceChannel;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 15, 12, 8};
        System.out.println("Estudidante: Valeria Guaman");

      /*   SortBubble y = new SortBubble();
        SortBubble claseSortBubble = new SortBubble();
        System.out.println("***********Arreglo original**********");
        claseSortBubble.SortBubble();
        claseSortBubble.printArray(numeros);

        System.out.println("Orden Ascendente");
        claseSortBubble.sortAscendente(numeros);
        claseSortBubble.printArray(numeros); 

        System.out.println("Orden Descendente");
        claseSortBubble.sortDescendente(numeros);
        claseSortBubble.printArray(numeros);*/

        //METODO SELECCION
        SortSeleccion x = new SortSeleccion();
        SortSeleccion claseSortSeleccion =  new SortSeleccion();
        System.out.println("METODO SELECCION");
        System.out.println("*****Arreglo original*********");
        claseSortSeleccion.printArray(numeros);

        System.out.println("*****Orden Ascendente*****");
        claseSortSeleccion.sortAscendente(numeros);
        claseSortSeleccion.printArray(numeros);

        System.out.println("*****Orden Descendente*****");
        claseSortSeleccion.sortDescendente(numeros);
        claseSortSeleccion.printArray(numeros);

    }
}
