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
       /*  SortSeleccion x = new SortSeleccion();
        SortSeleccion claseSortSeleccion =  new SortSeleccion();
        System.out.println("METODO SELECCION");
        System.out.println("*****Arreglo original*********");
        claseSortSeleccion.printArray(numeros);

        System.out.println("*****Orden Ascendente*****");
        claseSortSeleccion.sortAscendente(numeros);
        claseSortSeleccion.printArray(numeros);

        System.out.println("******Orden Descendente*****");
        claseSortSeleccion.sortDescendente(numeros);
        claseSortSeleccion.printArray(numeros);*/

        //METODO INSERCION
        SortInsercion x = new SortInsercion();
        SortInsercion claseSortInsercion = new SortInsercion();
        System.out.println("METODO INSERCION");
        System.out.println("*****Arreglo Original*****");
        claseSortInsercion.printArray(numeros);

        System.out.println("*****Orden Ascendente*****");
        claseSortInsercion.sortAscendente(numeros, false);
        claseSortInsercion.printArray(numeros);
        
        System.out.println("*****Orden Descendente*****");
        claseSortInsercion.sortDescendente(numeros, false);
        claseSortInsercion.printArray(numeros);

        System.out.println();
        System.out.println("Estudidante: Valeria Guaman");

       String[] nombres = {"Pedro,", "Ana,", "Maria,", "Luis", "Juan"};
        System.out.println(" Array de Nombres original");
        claseSortInsercion.printArray(nombres);
        claseSortInsercion.sortByName(nombres, false);
        System.out.println("Ordenado por nombre");
        claseSortInsercion.printArray(nombres);

        System.out.println();
        System.out.println("Estudidante: Valeria Guaman");

        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };

        System.out.println("Array de Personas original:");
        claseSortInsercion.printArrayPersonas(personas);
        System.out.println("Ordenado por edad:");
        claseSortInsercion.sortPersonasByAge(personas);
        claseSortInsercion.printArrayPersonas(personas);

        System.out.println();
        System.out.println("Estudidante: Valeria Guaman");

        System.out.println("Array de Personas original:");
        claseSortInsercion.printArrayPersonas(personas);
        System.out.println("Ordenado por nombre:");
        claseSortInsercion.sortPersonasByName(personas);
        claseSortInsercion.printArrayPersonas(personas);
    }


    }

