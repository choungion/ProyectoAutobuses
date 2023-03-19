package proyectoautobuses;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.AbstractButton;
import java.awt.Graphics2D;


public class Mapa extends JFrame
{
    //Declaracion de variables
    private JPanel panel;
    private JLabel fondo = new JLabel("", SwingConstants.CENTER);
    Thread bus1, bus2, bus3, bus4, bus5, bus6, bus7, bus8, bus9, bus10;
    
    //Metodo para agregar botones al frame
    public void addBoton(Container c, String titulo, ActionListener oyente)
    {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }
     
    public Mapa()
    {
        init();
    }
    
    public void init()
    {
        //Definicion de caracteristicas del JFrame
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        
        //Se utiliza el JLabel fondo para agregar la imagen del mapa con la ruta
        fondo.setIcon(new ImageIcon(getClass().getResource("Imagenes//Mapa.png")));


        //Creacion del JPanel panel
        panel = new JPanel(null);
        add(panel, BorderLayout.CENTER);
        this.add(fondo);


        //Creacion del JPanel panel_Botones y sus elementos
        JPanel panel_Botones = new JPanel();

        //Creacion del boton iniciar y la accion que ejecuta al ser presionado
        addBoton(panel_Botones, "Iniciar", new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                iniciar();
            }
        });

        //Creacion del boton detener y la accion que ejecuta al ser presionado
        addBoton(panel_Botones, "Detener", new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                detener();
            }
        });

        add(panel_Botones, BorderLayout.SOUTH);

    }
     //Metodo para iniciar los hilos de los autobuses
     public void iniciar()
     {
         Autobus autobus = new Autobus();
         Runnable runna = new HilosAutobus(autobus, panel);
         
         bus1 = new Thread(runna);
         
         bus1.start();
         bus2.start();
         bus3.start();
         bus4.start();
         bus5.start();
         bus6.start();
         bus7.start();
         bus8.start();
         bus9.start();
         bus10.start();
     }

    //Metodo para detener los hilos de los autobuses
    public void detener()
    {
        bus1.stop();
        bus2.stop();
        bus3.stop();
        bus4.stop();
        bus5.stop();
        bus6.stop();
        bus7.stop();
        bus8.stop();
        bus9.stop();
        bus10.stop();
    }
}