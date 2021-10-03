import gui.selecter;
import tablero.Ventana_Reto;
import tablero.tableroenlazado;

public class Main {

    public static void main(String[] args){

        selecter selec = new selecter();
        //Ventana_Reto reto = new Ventana_Reto();
        //reto.setVisible(true);


        tableroenlazado temp = new tableroenlazado(25);
        temp.generatab();
        temp.imprimir();
        //temp.getarrayretos();


    }

}