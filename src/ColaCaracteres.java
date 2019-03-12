public class ColaCaracteres {
    private NodoCaracteres cabeza, fin;
    int numElem;

    ColaCaracteres() {
        cabeza = null;
        fin = null;
        numElem = 0;
    }


    public void encolar(char v) {    // Coloca el elemento v al final de la cola
        NodoCaracteres nuevo;
        nuevo = new NodoCaracteres(v, null);
        if (cabeza != null)
            fin.setSiguiente(nuevo);
        else
            cabeza = nuevo;
        fin = nuevo;
        numElem++;
    }

    public int desencolar() {    //Devuelve el elemento del cabeza de la cola y lo elimina Si la cola está vacía, devuelve como resultado @ y un mensaje de error
        NodoCaracteres nodo;
        char resul = '@';

        if (cabeza == null)
            System.out.println("Error, la cola está vacía");
        else {
            nodo = cabeza;
            cabeza = nodo.getSiguiente();
            resul = nodo.getDato();
            if (cabeza == null)
                fin = null;

            numElem--;
        }
        return resul;
    }

    public boolean colaVacia() {   // Comprueba si la cola está vacía

        return cabeza == null;
    }


    public char primero() {  //Devuelve el elemento del cabeza de la cola Si la cola está vacía, devuelve como resultado @ y un mensaje de error

        char resul = '@';

        if (!this.colaVacia()) {
            resul = cabeza.getDato();
        } else
            System.out.println("Error, la cola está vacía");
        return resul;
    }

    public void escribirCola() {     // Muestra por pantalla el contenido de la cola
        NodoCaracteres aux;
        System.out.println("Contenido de la cola: ");
        aux = cabeza;
        while (aux != null) {
            System.out.print(aux.getDato() + "  ");
            aux = aux.getSiguiente();
        }
    }

    public int numElemCola() {       // Devuelve el número de elementos de la cola

        return numElem;
    }

}