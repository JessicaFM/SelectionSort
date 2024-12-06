package ioc.xtec.cat.selectionsort;

/**
* Clase comuna per validar un array
*/
public class ArrayValidator {

    /**
    * Funció per validar un array de enters
    * @param arr l'array a vaidar
    * @throws IllegalArgumentException per excepcions en la validacio
    */
    public void validateArray(int[] arr) {
        // Si l'array es null
        if (arr == null) {
            // Sortida amb excepció i missatge
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        // Si l'array te mida = 0
        if (arr.length == 0) {
            // Sortida amb excepció i missatge
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }  
}
