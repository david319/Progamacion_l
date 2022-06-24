package Semana7;
import java.util.ArrayList;

public class Lara_David_ArrayList {

    public static void main(String[] args) {

        System.out.println("Clase ArrayList");
        //Crear un ArrayList
        ArrayList<String> lista1 = new ArrayList<String>();
        System.out.println("Lista 1: " + lista1);

        // Se agregan elementos a la lista
        System.out.println("\nAgregando elementos a la lista 1:");
        lista1.add("Lara"); // Agrega un elemento a la lista
        lista1.add("David"); // Si se utiliza nuevamente se agrega en la posición siguiente
        lista1.add("Alejandro");
        lista1.add("Juan");

        // Clone de la lista1
        ArrayList<String> lista2 = (ArrayList<String>)lista1.clone();
        for (int i = 0; i < lista1.size(); i++) { // Recorre la lista
            System.out.println(lista1.get(i)); // Imprime el elemento(i) de la lista
        }

        // Se eliminan elementos de la lista
        lista1.remove(0); // Elimina el elemento de la posición 0
        lista1.remove("David"); // Elimina el elemento "David" buscando por el valor

        System.out.println("\nElementos de la lista 1 después de eliminar elementos");
        for (int i = 0; i < lista1.size(); i++) { // Recorre la lista
            System.out.println(lista1.get(i)); // Imprime el elemento(i) de la lista
        }

        System.out.println("\nElementos de la lista 2(clone de la lista1) con los elementos eliminados de la lista 1");
        for (int i = 0; i < lista2.size(); i++) { // Recorre la lista
            System.out.println(lista2.get(i)); // Imprime el elemento(i) de la lista
        }

        // Otra forma de imprimir los elementos de la lista
        System.out.println("\nOtra forma de imprimir los elementos de la lista");
        System.out.println("Lista 2: " + lista2);

        // Métodos de ArrayList
        System.out.println("\nOtros métodos de la la clase ArrayList:");
        System.out.println("Tamaño de la lista: " + lista1.size()); // Imprime el tamaño de la lista
        System.out.println("La lista esta vacía: " + lista1.isEmpty()); // Imprime si la lista está vacía o no
        System.out.println("La lista contiene el elemento 'Lara': " + lista1.contains("Lara")); // Imprime si la lista contiene el elemento "Lara"
        System.out.println("Imprimir el elemento en la posición [0] de la lista: " + lista1.get(0)); // Imprime el elemento de la posición 0
        System.out.println("Imprimir el elemento en la posición [1] de la lista: " + lista1.get(1)); // Imprime el elemento de la posición 1
        for (int i = 0; i < lista1.size(); i++) { // Recorre la lista
            System.out.println(lista1.get(i)); // Imprime el elemento(i) de la lista
        }

    }
}
