package imagenfondo;

// Manda posicion al cliente y al servidor

public class Mensajero {
    private static Mensajero mensajero;
    private int pos;


    private static class SingletonHolder {
        public static Mensajero mensajero = new Mensajero();
    }

    private Mensajero() {
    }

    public static Mensajero getInstance() {
        return SingletonHolder.mensajero;
    }


    public int getNumber() {
        return this.pos;
    }

    public void setNumber(int pos) {
        this.pos = pos;
    }
}

