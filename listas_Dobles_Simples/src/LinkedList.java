public class LinkedList {
    int size;
    // Apuntador al primer nodo en una lista simple o al último nodo en una lista doblemente enlazada
    Nodo cabeza;
    // Apuntador al último nodo en una lista simple o al primer nodo en una lista doblemente enlazada
    Nodo cola;
    //añadir nodos ala lista
    public void add(int valor) {
        Nodo newNode = new Nodo();
        newNode.valor = valor;
        // si la Lista esta  vacía
        if (cabeza == null) {
            // El nuevo nodo es el primer nodo en la lista
            cabeza = newNode;
            // El nuevo nodo es el último nodo en una lista doblemente enlazada
            cola = newNode;
            // Si la lista no está vacía
        } else {
            // El último nodo apunta al nuevo nodo
            cola.siguiente = newNode;
            // El nuevo nodo apunta al último nodo en una lista doblemente enlazada
            newNode.Anterior = cola;
            // El nuevo nodo es ahora el último nodo en la lista
            cola = newNode;
        }
        size++;
    }

    //eliminar nodos de la lista
    public void remove(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == valor) {
                // Primer nodo
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.Anterior = null;
                    }
                    // Último nodo
                } else if (actual == cola) {
                    cola = actual.Anterior;
                    cola.siguiente = null;
                    // Nodo intermedio
                } else {
                    actual.Anterior.siguiente = actual.siguiente;
                    actual.siguiente.Anterior = actual.Anterior;
                }
                size--;
                return;
            }
            actual = actual.siguiente;
        }
    }
      // imprimir lista
    public void print() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

}
