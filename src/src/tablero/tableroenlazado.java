package tablero;

public class tableroenlazado {


    public static nodoCasilla primero;
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

            System.out.println("La posicion " + temp.getindex() + " es un " + temp.gettipo());
            temp = temp.getSig();
        }
        System.out.println("La posicion " + temp.getindex() + " es un " + temp.gettipo());
    }

    public void moverjugador(jugador player, int dado){

        int i = 0;
        nodoCasilla temp = primero;

        while (i!=player.getposition() + dado && i!=size){

            primero = primero.getSig();
        }

        if (i != size){

            player.setposition(i);
            boolean x = posreto(player.getposition());
            if (x){

            }



        }
        else{

        }
    }
    public String obtenerTipo(jugador player){

        int i = player.getposition();
        nodoCasilla temp = primero;

        for (int j = 0; j != i; j++) {

            temp = temp.getSig();

        }
        return temp.gettipo();
    }
//////////////////////
    public static boolean posreto(int posjugador){

        nodoCasilla temp = primero;
        int[] listaretos = new int[36];
        int i = 0;
        while (temp.getSig()!=null){
            if (temp.gettipo() == "reto"){
                listaretos[i] = temp.getindex();


            }
            temp = temp.getSig();
            i++;

        }
        int k = 0;

        while (k < listaretos.length){

            if (listaretos[k] != 0){
                if (posjugador == listaretos[k]){
                    return true;

                }
            }

            System.out.println(listaretos[k]);
            k++;

        }

    return false;
    }

    public String reto(){
        String retofinal = "";
        int reto = (int)(Math.random()*4);
        int a = (int)(Math.random()*50);
        int b = (int)(Math.random()*50);
        System.out.println(reto);
        if (reto == 0){
            String a_str = Integer.toString(a);
            String b_str = Integer.toString(b);
            retofinal = (a_str + " + " + b_str );

        }else if (reto == 1){
            String a_str = Integer.toString(a);
            String b_str = Integer.toString(b);
            retofinal = (a_str + " - " + b_str );

        }else if (reto == 2){
            String a_str = Integer.toString(a);
            String b_str = Integer.toString(b);
            retofinal = (a_str+" x "+b_str);

        }else {
            String a_str = Integer.toString(a);
            String b_str = Integer.toString(b);
            retofinal = (a_str + " / " + b_str);
        }
        return retofinal;

    }
}