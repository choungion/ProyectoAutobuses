package proyectoautobuses;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class Mapa extends JFrame
{
    //Declaracion de variables
    private PanelAutobus panel;
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
        this.setSize(1300, 1000);
        this.setLocationRelativeTo(null);

        fondo.setIcon(new ImageIcon(getClass().getResource("Imagenes//Mapa.png")));

        panel = new PanelAutobus();
        add(panel, BorderLayout.CENTER);
        this.add(fondo);

        JPanel panel_Botones = new JPanel();
        addBoton(panel_Botones, "Iniciar", new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                iniciar();
            }
        });

        addBoton(panel_Botones, "Detener", new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
            {
                detener();
            }
        });

        add(panel_Botones, BorderLayout.SOUTH);

    }
    public void iniciar()
    {
        Autobus autobus = new Autobus();
        panel.add(autobus);
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
    public void detener()
    {
        bus1.stop();
    }



}