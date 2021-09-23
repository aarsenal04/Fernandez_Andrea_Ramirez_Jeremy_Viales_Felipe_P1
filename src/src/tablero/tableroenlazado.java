package tablero;

public class tableroenlazado {

    private nodoCasilla primero;
    private nodoCasilla ultimo;
    private int numElem;
    private int size;

    public tableroenlazado(int size) {
        this.ultimo = null;
        this.primero = null;
        this.numElem = 0;
        this.size = size;
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

        nodoCasilla nodo = new nodoCasilla (numElem, tipo, null, null);
        if (primero==null){

            primero = nodo;
            ultimo = nodo;
        }
        else{
            nodoCasilla temp = primero;
            while (temp.getSig()!=null){
                temp = temp.getSig();
            }
            temp.setSig(nodo);
            nodo.setAnt(temp);
        }
        numElem++;
    }
    public void generatab(){

        int numreto = size/2;
        int numtt = numreto ; //trampa

        String[] tipos = {"reto", "trampa", "tunel"};
        insert("Inicio");
        if (size == 25 || size == 9){
            numtt++;
        }
        for (int i = 1; i < size -1; i++) {

            int alazar = (int)(Math.random()*3);
            if (alazar==0){

                if (numreto!=0){
                    insert(tipos[alazar]);
                    numreto--;
                } else {
                    i--;
                }
            } else {
                if (numtt!=0){
                    insert(tipos[alazar]);
                    numtt--;
                } else {
                    i--;
                }
            }

        }
        insert("Final");
    }
    public void imprimir(){

        nodoCasilla temp = primero;

        while (temp.getSig()!=null){
            System.out.println(temp.gettipo());
            System.out.println(temp.getindex());
            temp = temp.getSig();
        }
        System.out.println(temp.gettipo());
        System.out.println(temp.getindex());
    }
}