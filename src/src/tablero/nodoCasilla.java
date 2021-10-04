package tablero;

public class nodoCasilla {

    private int index;
    private String tipo;
    private nodoCasilla siguiente;
    private nodoCasilla anterior;

    public nodoCasilla(int index, String tipo, nodoCasilla siguiente, nodoCasilla anterior) { //nodo casilla es el nodo de la lista enlazada en la casilla

        this.index = index; //
        this.tipo = tipo; //tipo reto, trampa o tunel
        this.siguiente = siguiente;
        this.anterior = anterior;

    }

    public int getindex() {
        return index;
    }

    public String gettipo() {
        return tipo;
    }

    public nodoCasilla getSig() {
        return siguiente;
    }

    public nodoCasilla getAnterior() {
        return anterior;
    }

    public void setindex(int index) {
        index = index;
    }

    public void settype(int String) {
        tipo = tipo;
    }

    public void setSig(nodoCasilla sig) {
        siguiente = sig;
    }

    public void setAnt(nodoCasilla ant) {
        anterior = ant;

    }
}