public class SortInsercion {
    public SortInsercion(){
        System.out.println("Se inicio el metodo Insercion");
    }

    public void sortAscendente(int[] numeros){
        for(int i = 1; i < numeros.length ; i++ ){
            int j = i - 1;
            int aux = numeros[i];
            
            while(j >= 0 && numeros[j] > aux){
                numeros[j+1] = numeros[j];
                j--;
            }
                numeros[j + 1] = aux;
        }
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
