package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
* Representa la clase principal i de entrada de l'aplicació
* Gestiona les dades introduides per l'usuari
*/
public class Main {

/*
* Métode principal de la clase i punt d'entrada
* @params args son els argument de entrada en la linea de comandes per l'usuari
*/
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demana a l'usuari que introduixi la mida de l'array que desitja
        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        // Inicialitzem la clase de array amb la dimenció que ens ha
        // donat l'usuari
        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        
        // Fem un loop per anar demanant el número de element que l'usuari
        // ha introduït
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            // Afegim l'element a l'array de elements
            array[i] = scanner.nextInt();
        }

        // Inicialitzem variables de tipo SelectionSort i ArrayValidator
        // Ambdos clases son clases propies del nostre projecte
        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        // Posem un try per si hi ha algun tipo de error en el procesat
        // de les dades
        try {
            // Validem les dades que ha s'han introduït
            validator.validateArray(array);

            // Mostrem l'array inicials
            System.out.print("Array original:");
            printArray(array);

            // Demanem al usuari quin valor vol cercar en l'array
            System.out.println("Introdueix un valor a buscar a l'array: ");
            
            // Posem el valor del camp a la variable
            int valueToSearch = scanner.nextInt();

            // Busquem el valor a cercar en l'array
            boolean contains = sorter.contains(array, valueToSearch);
            
            // S'ha trobat el valor a buscar
            if (contains) {
                // Si es troba mostrem el missatge per consola
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                // No s'ha trobat el valor :(
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            // Ordenem l'array
            sorter.sort(array);

            // Es mostra l'array ja ordenat
            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            // Hi ha hagut algun error en el proces,
            // mostrem l'error per pantalla
            System.out.println("Error: " + e.getMessage());
        }

        // Tanquem el sistema de lectura de dades
        scanner.close();
    }
    
    /*
    * Funció per mostrar per pantalla el valor de enters
    * Ho mostrarem en forma de string amb una separació de un
    * espai en blanc entre cada valor
    */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Posem una linea al final
        System.out.println();
    }
}
