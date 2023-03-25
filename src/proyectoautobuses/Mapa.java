package proyectoautobuses;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.Dimension;
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
    private JLabel imgBus1 = new JLabel();
    Autobus1 bus1;
    
    
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

        
        //Definicion de caracteristicas del JFrame
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        
        
        //Se utiliza el JLabel fondo para agregar la imagen del mapa con la ruta
        fondo.setIcon(new ImageIcon(getClass().getResource("Imagenes//Mapa.png")));
        Dimension sizeFondo = fondo.getPreferredSize();
        fondo.setBounds(0, 0, sizeFondo.width, sizeFondo.height);

        //imgBus1.setLocation(500, 500);

        

        //Creacion del JPanel panel
        panel = new JPanel(null);
        add(panel, BorderLayout.CENTER);
        panel.add(imgBus1);
        


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
         bus1 = new Autobus1("Bus1", imgBus1);
         Autobus1.stopImgMv();
         bus1.start();
         panel.add(fondo);
     }

    //Metodo para detener los hilos de los autobuses
    public void detener()
    {
        bus1.stop();
    }
}