package proyectoautobuses.pk_Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ubicaciones implements Runnable {
    // Declaracion de variables
    private static int[] bus1 = new int[2];
    private static int[] bus2 = new int[2];
    private static int[] bus3 = new int[2];
    private static int[] bus4 = new int[2];
    private static int[] bus5 = new int[2];
    private static int[] bus6 = new int[2];
    private static int[] bus7 = new int[2];
    private static int[] bus8 = new int[2];
    private static int[] bus9 = new int[2];
    private static int[] bus10 = new int[2];
    private static String AutobusSelec = "Autobus 1";
    private static String mensaje;
    private static String pasajeros;

    public Ubicaciones() {
        // Inicio del hilo para el socket
        Thread hilo = new Thread(this);
        hilo.start();
    }

    // Set y get para las coordenadas de todos los autobuses
    public static void setBus1(int coordenadasX, int coordenadasY) {
        bus1[0] = coordenadasX;
        bus1[1] = coordenadasY;
    }

    public static void setBus2(int coordenadasX, int coordenadasY) {
        bus2[0] = coordenadasX;
        bus2[1] = coordenadasY;
    }

    public static void setBus3(int coordenadasX, int coordenadasY) {
        bus3[0] = coordenadasX;
        bus3[1] = coordenadasY;
    }

    public void setBus4(int coordenadasX, int coordenadasY) {
        bus4[0] = coordenadasX;
        bus4[1] = coordenadasY;
    }

    public static void setBus5(int coordenadasX, int coordenadasY) {
        bus5[0] = coordenadasX;
        bus5[1] = coordenadasY;
    }

    public static void setBus6(int coordenadasX, int coordenadasY) {
        bus6[0] = coordenadasX;
        bus6[1] = coordenadasY;
    }

    public static void setBus7(int coordenadasX, int coordenadasY) {
        bus7[0] = coordenadasX;
        bus7[1] = coordenadasY;
    }

    public static void setBus8(int coordenadasX, int coordenadasY) {
        bus8[0] = coordenadasX;
        bus8[1] = coordenadasY;
    }

    public static void setBus9(int coordenadasX, int coordenadasY) {
        bus9[0] = coordenadasX;
        bus9[1] = coordenadasY;
    }

    public void setBus10(int coordenadasX, int coordenadasY) {
        bus10[0] = coordenadasX;
        bus10[1] = coordenadasY;
    }

    public int[] getBus1() {
        return bus1;
    }

    public static int[] getBus2() {
        return bus2;
    }

    public static int[] getBus3() {
        return bus3;
    }

    public static int[] getBus4() {
        return bus4;
    }

    public static int[] getBus5() {
        return bus5;
    }

    public static int[] getBus6() {
        return bus6;
    }

    public static int[] getBus7() {
        return bus7;
    }

    public static int[] getBus8() {
        return bus8;
    }

    public static int[] getBus9() {
        return bus9;
    }

    public static int[] getBus10() {
        return bus10;
    }

    // Metodo para la creacion y el comportamiento del socket que recibe la
    // informacion del cliente
    @Override
    public void run() {
        try {
            ServerSocket servidor = new ServerSocket(9999);

            while (true) {
                if (AutobusSelec.equals("Autobus 1")) {
                    mensaje = Autobus1.getMensaje();
                    pasajeros = Autobus1.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 2")) {
                    mensaje = Autobus2.getMensaje();
                    pasajeros = Autobus2.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 3")) {
                    mensaje = Autobus3.getMensaje();
                    pasajeros = Autobus3.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 4")) {
                    mensaje = Autobus4.getMensaje();
                    pasajeros = Autobus4.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 5")) {
                    mensaje = Autobus5.getMensaje();
                    pasajeros = Autobus5.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 6")) {
                    mensaje = Autobus6.getMensaje();
                    pasajeros = Autobus6.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 7")) {
                    mensaje = Autobus7.getMensaje();
                    pasajeros = Autobus7.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 8")) {
                    mensaje = Autobus8.getMensaje();
                    pasajeros = Autobus8.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 9")) {
                    mensaje = Autobus9.getMensaje();
                    pasajeros = Autobus9.getpasaParadas();
                }
                if (AutobusSelec.equals("Autobus 10")) {
                    mensaje = Autobus10.getMensaje();
                    pasajeros = Autobus10.getpasaParadas();
                }
                Socket mi_socket = servidor.accept();

                DataInputStream flujo_entrada = new DataInputStream(mi_socket.getInputStream());
                AutobusSelec = flujo_entrada.readUTF();
                DataOutputStream flujo_salida = new DataOutputStream(mi_socket.getOutputStream());
                flujo_salida.writeUTF("\n" + "El " + AutobusSelec + " llego a la parada " + mensaje + "\n" + pasajeros);
                mi_socket.close();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // Metodo para la creacion y el comportamiento del socket que envia la
    // informacion al cliente
    public static void enviaMensaje() {
        
        try {
            Socket mi_socket = new Socket("localhost", 1111);

            
        } catch (IOException ex) {
            //System.out.println("Error: " + ex.getMessage());
        }
    }
}
