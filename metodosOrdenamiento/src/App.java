public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 15, 12, 8};

        SortBubble y = new SortBubble();
        SortBubble claseSortBubble = new SortBubble();
        System.out.println("***********Arreglo original**********");
        claseSortBubble.SortBubble();
        claseSortBubble.printArray(numeros);

        System.out.println("Orden Ascendente");
        claseSortBubble.sortAscendente(numeros);
        claseSortBubble.printArray(numeros); 

        System.out.println("Orden Descendente");
        claseSortBubble.sortDescendente(numeros);
        claseSortBubble.printArray(numeros);
    }
}
