import imagenfondo.*;


/**

 * Esta clase la que corre la interfaz del programa desde la aparición de una ventana.
 * En esta primer ventana aparecen los botones de Servidor y Cliente.
 * Se debe correr el "Main" y presionar el botón de servidor.
 * Seguidamente, presionar de nuevo correr "Main" y seleccionar el botón de "Cliente"
 */


public class Main {

    public static void main(String[] args){
        /**

         * Este metodo incia la interfaz
         * @param args es el argumento que necesita correr la aplicación y crear la ventana por abrir
         */
        /*JPanel as = new JPanel();
        int i = 3;
        map mapa = new map(as,i);*/
        //selecter selec = new selecter();
        //ImagenFondo fondo = new ImagenFondo();
        //new Index().setVisible(true);
        niveles nivel = new niveles();
        nivel.setnivel(1);

        Index mapa = new Index(nivel.getnivel());
        mapa.setVisible(true);


        /*int cell_width_3 = 580;
        int cell_height_3 = 550;

        int cell_width_4 = 850;
        int cell_height_4 = 750;
        int dimension_x_34 = 0;
        int window_height_34 = 800;

        int cell_width_5 =1000;
        int cell_height_5 = 900;
        int window_height_5 = 950;

        interfaz.set_map mapa = new interfaz.set_map(5,cell_width_5,cell_height_5,window_height_5);*/

    }

}



















