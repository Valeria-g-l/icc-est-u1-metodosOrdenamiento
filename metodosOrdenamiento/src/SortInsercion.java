public class SortInsercion {
    public SortInsercion(){
        System.out.println("Se inicio el metodo Insercion");
    }

    public void sortAscendente(int[] numeros, boolean pasos){
        for(int i = 1; i < numeros.length ; i++ ){
            int j = i - 1;
            int aux = numeros[i];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + "+ aux" + aux);
            }
            while(j >= 0 && numeros[j] > aux){
                if (pasos)
                    System.out.println("Compara aux: " + aux + "con numeros [" + j + "]:" + numeros[j]);
                numeros[j+1] = numeros[j];
                if (pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros[" + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }
                numeros[j + 1] = aux;
                if (pasos){
                    System.out.println("Inserta aux: " + aux + "en la posicion " + (j + 1));
                    System.out.println("Estado Actual");
                    printArray(numeros);
                }
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos){
        for(int i = 1; i < numeros.length ; i++ ){
            int j = i - 1;
            int aux = numeros[i];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + "+ aux" + aux);
            }
            while(j >= 0 && numeros[j] < aux){
                if (pasos)
                    System.out.println("Compara aux: " + aux + "con numeros [" + j + "]:" + numeros[j]);
                numeros[j+1] = numeros[j];
                if (pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros[" + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }
                numeros[j + 1] = aux;
                if (pasos){
                    System.out.println("Inserta aux: " + aux + "en la posicion " + (j + 1));
                    System.out.println("Estado Actual");
                    printArray(numeros);
                }
        }
    }

    public void sortByName(String[] nombres, boolean pasos) {
    for (int i = 1; i < nombres.length; i++) {
        String aux = nombres[i]; 
        int j = i - 1;

        if (pasos) {
            System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
        }

        while (j >= 0 && nombres[j].compareTo(aux) > 0) {
            if (pasos) {
                System.out.println("Compara aux: " + aux + " con nombres[" + j + "]: " + nombres[j]);
            }

            nombres[j + 1] = nombres[j];

            if (pasos) {
                System.out.println("Mueve nombres[" + j + "] a nombres[" + (j + 1) + "]");
                printArray(nombres);
            }

            j--;
        }
        nombres[j + 1] = aux;

        if (pasos) {
            System.out.println("Inserta aux: " + aux + " en la posición " + (j + 1));
            System.out.println("Estado actual:");
            printArray(nombres);
        }
    }
}

    public void sortPersonasByName(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }
       public void sortPersonasByAge(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    public void printArrayPersonas(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getName() + ", Edad: " + p.getAge());
        }
    }

public void printArray(String[] nombres) {
    for (String nombre : nombres) {
        System.out.print(nombre + " ");
    }
    System.out.println(); 
}


     public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            }else
                System.out.print(numeros[i] + " , ");
        }
        System.out.println("]");
    }
    
}
