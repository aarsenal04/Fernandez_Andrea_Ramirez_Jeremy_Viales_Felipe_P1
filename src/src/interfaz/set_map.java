package interfaz;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class set_map {


    public set_map(int tamano,int cell_width, int cell_height, int window_height) {
        JFrame marco = new JFrame();
        JPanel panel = new JPanel();
        JTable table = new JTable();


        table.setDefaultRenderer(Object.class, new ImgTabla());
        DefaultTableModel tablemodel = new DefaultTableModel(0, tamano) {
            //Deshabilitar la edicion de las celdas de la tabla
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }
        };
        //Definicion de imagen de celdas
        JLabel icon = new JLabel(new ImageIcon(getClass().getResource("label.png")));
        JLabel icon_2 = new JLabel(new ImageIcon(getClass().getResource("label 2.png")));

        //Agregar celdas dependiendo del nivel
        if (tamano == 3) {
            tablemodel.addRow(new Object[]{icon, icon, icon});
            tablemodel.addRow(new Object[]{icon_2, icon_2, icon_2});
            tablemodel.addRow(new Object[]{icon, icon, icon});
        }
        if (tamano == 4) {
            tablemodel.addRow(new Object[]{icon,icon,icon,icon});
            tablemodel.addRow(new Object[]{icon_2,icon_2,icon_2,icon_2});
            tablemodel.addRow(new Object[]{icon,icon,icon,icon});
            tablemodel.addRow(new Object[]{icon_2,icon_2,icon_2,icon_2});
        } else {
            tablemodel.addRow(new Object[]{icon,icon,icon,icon,icon});
            tablemodel.addRow(new Object[]{icon_2,icon_2,icon_2,icon_2,icon_2});
            tablemodel.addRow(new Object[]{icon,icon,icon,icon,icon});
            tablemodel.addRow(new Object[]{icon_2,icon_2,icon_2,icon_2,icon_2});
            tablemodel.addRow(new Object[]{icon,icon,icon,icon,icon});

        }
        //Dimensiones tabla
        table.setRowHeight(180);
        table.setPreferredSize(new Dimension(cell_width,cell_height));

        //Modelo de la tabla
        table.setModel(tablemodel);

        //Agregar panel 1 al marco
        marco.setContentPane(panel);

        //Dimensiones ventana y color del marco
        marco.setSize(1700, window_height);
        panel.setBackground(Color.white);

        //Agregar tabla al panel 1
        panel.add(table);

        //Hacer visible el marco y el panel 1
        marco.setVisible(true);
        panel.setVisible(true);

    }

}
/*
                mode = 3;
                cell_width = 580;
                cell_height = 550;
                window_height = 800;

                mode = 4;
                cell_width = 850;
                cell_height = 750;
                window_height = 800;

                mode = 5;
                cell_width =1000;
                cell_height = 900;
                window_height = 950;
 */
