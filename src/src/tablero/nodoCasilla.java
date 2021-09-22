package tablero;

public class nodoCasilla {

    private int index;
    private String tipo;
    private nodoCasilla siguiente;
    private nodoCasilla anterior;

    public nodoCasilla(int index, String tipo, nodoCasilla siguiente, nodoCasilla anterior) {

        this.index = index;
        this.tipo = tipo;
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

    public nodoCasilla getAnt() {
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