package proyectoautobuses.pk_Server;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;


public class Mapa extends JFrame
{
    //Declaracion de variables
    private JPanel panel;
    private JLabel fondo = new JLabel("", SwingConstants.CENTER);
    private JLabel imgBus1 = new JLabel();
    private JLabel imgBus2 = new JLabel();
    private JLabel imgBus3 = new JLabel();
    private JLabel imgBus4 = new JLabel();
    private JLabel imgBus5 = new JLabel();
    private JLabel imgBus6 = new JLabel();
    private JLabel imgBus7 = new JLabel();
    private JLabel imgBus8 = new JLabel();
    private JLabel imgBus9 = new JLabel();
    private JLabel imgBus10 = new JLabel();
    
    Autobus1 bus1;
    Autobus2 bus2;
    Autobus3 bus3;
    Autobus4 bus4;
    Autobus5 bus5;
    Autobus6 bus6;
    Autobus7 bus7;
    Autobus8 bus8;
    Autobus9 bus9;
    Autobus10 bus10;
    
    
     
    public Mapa()
    {
        init();
    }
    
    public void init()
    {
        //Definicion de caracteristicas del JFrame
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(Mapa.EXIT_ON_CLOSE);
        
        //Se utiliza el JLabel fondo para agregar la imagen del mapa con la ruta
        fondo.setIcon(new ImageIcon(getClass().getResource("Imagenes//Mapa.png")));
        Dimension sizeFondo = fondo.getPreferredSize();
        fondo.setBounds(0, 0, sizeFondo.width, sizeFondo.height);

        //Creacion del JPanel panel
        panel = new JPanel(null);
        add(panel, BorderLayout.CENTER);
        panel.add(imgBus1);
        panel.add(imgBus2);
        panel.add(imgBus3);
        panel.add(imgBus4);
        panel.add(imgBus5);
        panel.add(imgBus6);
        panel.add(imgBus7);
        panel.add(imgBus8);
        panel.add(imgBus9);
        panel.add(imgBus10);
        panel.add(fondo);
        
        //Creacion del JPanel panel_Botones y sus elementos
        JPanel panel_Botones = new JPanel();

        //Creacion del boton iniciar y la accion que ejecuta al ser presionado
        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evento) {
                iniciar();
                btnIniciar.setEnabled(false);
            }
            
        });

        //Creacion del boton detener y la accion que ejecuta al ser presionado
        JButton btnDetener = new JButton("Detener");
        btnDetener.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                detener();
                btnIniciar.setEnabled(true);
            }
            
            
        });
        panel_Botones.add(btnIniciar,BorderLayout.WEST);
        panel_Botones.add(btnDetener, BorderLayout.EAST);
        add(panel_Botones, BorderLayout.SOUTH);

    }
     //Metodo para iniciar los hilos de los autobuses
     public void iniciar()
     {
        bus1 = new Autobus1("Bus1", imgBus1);
        bus2 = new Autobus2("Bus2", imgBus2);
        bus3 = new Autobus3("Bus3", imgBus3);
        bus4 = new Autobus4("Bus4", imgBus4);
        bus5 = new Autobus5("Bus5", imgBus5);
        bus6 = new Autobus6("Bus6", imgBus6);
        bus7 = new Autobus7("Bus7", imgBus7);
        bus8 = new Autobus8("Bus8", imgBus8);
        bus9 = new Autobus9("Bus9", imgBus9);
        bus10 = new Autobus10("Bus10", imgBus10);

        Autobus1.stopImgMv();
        Autobus2.stopImgMv();
        Autobus3.stopImgMv();
        Autobus4.stopImgMv();
        Autobus5.stopImgMv();
        Autobus6.stopImgMv();
        Autobus7.stopImgMv();
        Autobus8.stopImgMv();
        Autobus9.stopImgMv();
        Autobus10.stopImgMv();

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