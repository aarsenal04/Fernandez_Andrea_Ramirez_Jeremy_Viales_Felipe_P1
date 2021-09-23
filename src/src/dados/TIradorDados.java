package dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TIradorDados {
    private JButton tiraElDadoButton;
    private JPanel panel1;
    private JTextField textField1;
    private JLabel mostrador;

    public TIradorDados() {

        tiraElDadoButton.addActionListener(new ActionListener() {
            @Override
            // Se genera un action listner para cuando se estripe el boton se ejecute el codigo de los dados
            public void actionPerformed(ActionEvent e) {

                // generar numero de dados con numero aleatoreos
                int dado1 = (int)(Math.random()*5)*1;
                // se generaron los iconos de los dados apartir de las imagenes
                Icon uno = new javax.swing.ImageIcon(getClass().getResource("/dados/uno.png"));
                Icon dos = new javax.swing.ImageIcon(getClass().getResource("/dados/Dos.png"));
                Icon tres = new javax.swing.ImageIcon(getClass().getResource("/dados/tres.png"));
                Icon cuatro = new javax.swing.ImageIcon(getClass().getResource("/dados/cuatro.png"));

                // muestra los dados al tablero.jugador
                switch (dado1){
                    case 1: mostrador.setIcon(uno); break;
                    case 2: mostrador.setIcon(dos); break;
                    case 3: mostrador.setIcon(tres); break;
                    case 4: mostrador.setIcon(cuatro); break;
                }

                int resultado = dado1;
                textField1.setText("Muevete " + resultado + " espacios");
                resultado_dado resultado_dado = new resultado_dado(resultado);


            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TiraDados");
        frame.setContentPane(new TIradorDados().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        try {
            Thread.sleep(3000);
            System.exit(0);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


    }


}
