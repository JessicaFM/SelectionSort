package ioc.xtec.cat.selectionsort;

/**
* La clase principal per ordenació
*/
public class SelectionSort {

    /**
    * Funció per ordenar un array de enters
    * Va buscant i intercalant amb els valors mes petits
    * fins a final obtenir l'array ordenat
    * @param arr es el array de enters que volem ordenar
    */
   public void sort(int[] arr) {
        // Guardem la mida de l'array d'entrada
        int n = arr.length;

        // Recorrem l'array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Recorre per cercar el valor de index més petit
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercanvi de valors
            // El valor mes petit al minim index
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
    * Funció per cercar un determinat valor d'enter dins d'un array de enters
    * @param arr es el array de enters sobre el que volem realitzar la cerca
    * @param value es el valor a cercar
    * @return si s'ha trobat o no el valor a cercar dins de l'array
    * @throws IllegalArgumentException tipo de excepció per si pasem un array null
    */
    public boolean contains(int[] arr, int value) {
        
        // Si l'array es null sortida amb excepció
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        // Recorrem l'array
        for (int num : arr) {
            // Si trobem el valor a cercar dins de l'array,
            // sortim amb el retorn true
            if (num == value) {
                return true;
            }
        }
        
        // Si arribem fins aqui es que no s'ha trobat el valor dins de l'array
        // retornem per tant false (no conté el valor)
        return false;
    }
    
}
