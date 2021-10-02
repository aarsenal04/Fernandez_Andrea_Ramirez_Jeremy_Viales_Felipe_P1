package gui;

import imagenfondo.Index;
import imagenfondo.Index2;
import imagenfondo.Index3;
import imagenfondo.niveles;

import java.io.IOException;

public class puente {
    public puente(int i, String title,int map) throws IOException {

        niveles nivel = new niveles();
        nivel.setnivel(map);
        nivel.set_i(i);

        if (map ==1 ){
            new Index(i).setVisible(true);
        }
        if (map ==2){
            new Index2(i).setVisible(true);
        }
        if (map ==3){
            new Index3(i).setVisible(true);
        }

    }

}
