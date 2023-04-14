/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoautobuses.pk_Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import proyectoautobuses.pk_Server.Mapa;

/**
 *
 * @author choungion
 */
public class Cliente extends javax.swing.JFrame implements Runnable {

    Mapa mapa = new Mapa();

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
        Thread hilo = new Thread(this);
        hilo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuAutobuses = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuAutobuses
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autobus 1", "Autobus 2", "Autobus 3",
                        "Autobus 4", "Autobus 5", "Autobus 6", "Autobus 7", "Autobus 8", "Autobus 9", "Autobus 10" }));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(MenuAutobuses, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(201, 201, 201))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(MenuAutobuses, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run()
    {
        do{
        try {
            Socket mi_Socket = new Socket("localhost", 9999);

            DataOutputStream flujo_salida = new DataOutputStream(mi_Socket.getOutputStream());
            flujo_salida.writeUTF(String.valueOf(MenuAutobuses.getSelectedItem()));
            DataInputStream flujo_entrada = new DataInputStream(mi_Socket.getInputStream());

            String texto = flujo_entrada.readUTF();
            jTextArea.selectAll();
            jTextArea.replaceSelection("");
            jTextArea.append("\n" + texto);
            flujo_salida.close();
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        }
        while(flag =! false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MenuAutobuses;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private boolean flag = true;
    // End of variables declaration//GEN-END:variables
}
