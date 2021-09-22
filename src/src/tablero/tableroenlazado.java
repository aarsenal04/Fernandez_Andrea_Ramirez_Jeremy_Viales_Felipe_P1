package tablero;

public class tableroenlazado {

    private nodoCasilla primero;
    private nodoCasilla ultimo;
    private int numElem;

    public tableroenlazado() {
        this.ultimo = null;
        this.primero = null;
        this.numElem = 0;
    }
    public nodoCasilla getultimo() {
        return ultimo;
    }

    public nodoCasilla getPrimero() {
        return primero;
    }

    public int getnumElem() {
        return numElem;
    }

    public void setprimero(nodoCasilla primero) {
        primero = primero;
    }

    public void setUltimo(nodoCasilla ultimo) {
        ultimo = ultimo;
    }

    public void setNumElem(int numElem) {
        numElem = numElem;
    }
    public void insert (String tipo){

        new nodoCasilla()

    }
}
