package proyectoautobuses.pk_Server;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.util.Random;

public class Autobus6 extends Thread {
    // Declaracion de variables
    private String nombre;
    private JLabel label;
    private Random rand = new Random();
    private static boolean flag = true;
    private int x, y, i;
    private static String mensaje;
    private int[] coordenadasX = { 244, 250, 252, 264, 279, 291, 311, 313, 323, 334, 346, 353, 360, 365, 366, 376, 383,
            391, 398, 400, 405, 410, 413, 410, 406, 400, 395, 390, 386, 392, 395, 397, 392, 382, 371, 365, 364, 363,
            354, 338, 324, 317, 317, 327, 335, 345, 355, 364, 364, 365, 367, 373, 384, 397, 410, 421, 430, 438, 450,
            467, 473, 474, 475, 476, 476, 477, 478, 479, 489, 499, 509, 518, 527, 535, 541, 546, 551, 559, 570, 581,
            590, 599, 601, 601, 602, 605, 617, 628, 636, 644, 659, 670, 686, 697, 709, 721, 737, 754, 769, 785, 803,
            820, 831, 850, 866, 882, 894, 904, 913, 920, 933, 946, 955, 965, 973, 969, 975, 976, 983, 986, 990, 995,
            1000,
            1005, 1011, 1013, 1009, 1004, 999, 997, 997, 993, 987, 994, 1005, 1016, 1027, 1037, 1047, 1056, 1062, 1064,
            1062, 1059, 1051, 1039, 1027, 1012, 1006, 1005, 1004, 1002, 999, 992, 981, 970, 956, 954, 935, 935, 936,
            938, 942, 946, 946, 946, 946, 944, 954, 958, 952, 944, 940, 941, 948, 951, 951, 949, 943, 939, 934, 925,
            915, 909, 905, 902, 899, 894, 889, 878, 868, 852, 837, 823, 811, 808, 807, 805, 800, 787, 773, 761, 752,
            745, 734, 733, 733, 727, 719, 713, 706, 695, 684, 677, 671, 663, 654, 645, 633, 619, 612, 604, 592, 580,
            563, 547, 534, 521, 509, 494, 476, 459, 441, 428, 415, 401, 387, 373, 359, 347, 337, 326, 312, 303, 296,
            299, 309, 315, 315, 318, 327, 333, 337, 342, 336, 327, 320, 313, 305, 298, 291, 276, 262, 252, 244, 237,
            228, 220, 211, 218, 219, 220, 220, 220, 224, 229, 237, 243, 248, 243, 237, 232, 231, 232, 233, 235, 238,
            240, 242, 244 };
    private int[] coordenadasY = { 497, 485, 476, 480, 487, 482, 500, 516, 522, 529, 534, 527, 520, 512, 504, 493, 491,
            488, 482, 476, 461, 450, 441, 434, 424, 417, 409, 403, 394, 383, 374, 366, 366, 357, 353, 350, 343, 337,
            337, 336, 334, 328, 320, 321, 323, 323, 323, 320, 304, 290, 283, 279, 279, 283, 285, 286, 286, 284, 277,
            277, 269, 258, 248, 239, 230, 220, 208, 199, 199, 200, 201, 203, 205, 211, 219, 226, 233, 239, 242, 244,
            247, 238, 223, 211, 197, 185, 184, 187, 195, 205, 211, 212, 210, 207, 205, 202, 199, 196, 194, 192, 188,
            185, 183, 180, 174, 174, 164, 157, 152, 148, 138, 132, 126, 121, 115, 104, 104, 99, 97, 105, 114, 126, 136,
            148,
            159, 169, 177, 182, 188, 198, 209, 220, 230, 241, 237, 233, 232, 236, 244, 253, 264, 273, 282, 289, 295,
            294, 292, 294, 303, 313, 323, 333, 342, 343, 341, 335, 332, 332, 339, 349, 365, 378, 389, 400, 410, 421,
            431, 440, 450, 465, 475, 484, 491, 500, 508, 519, 533, 546, 562, 572, 584, 594, 604, 612, 621, 629, 637,
            649,
            661, 655, 653, 652, 650, 649, 654, 668, 677, 686, 693, 692, 692, 691, 690, 688, 679, 670, 663, 668, 676,
            684, 689, 687, 680, 674, 666, 661, 659, 658, 658, 659, 668, 670, 667, 658, 659, 662, 664, 666, 668, 668,
            669, 669, 671, 671, 671, 671, 671, 671, 671, 671, 672, 667, 664, 662, 661, 651, 642, 631, 622, 610, 603,
            592, 580, 570, 563, 560, 560, 565, 564, 563, 562, 563, 558, 556, 553, 551, 548, 547, 546, 552, 557, 564,
            571, 578, 582, 579, 579, 583, 588, 583, 579, 573, 565, 557, 549, 539, 530, 519, 512, 497 };

    // Este metodo le asigna valores a las variables nombre y label
    public Autobus6(String nombre, JLabel label) {
        this.nombre = nombre;
        this.label = label;
    }

    // Este metodo determina el tiempo de parada de cada autobus en las distinas
    // paradas
    private void parada() {
        int min = 500;
        int max = 1300;
        int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        try {
            Thread.sleep(aleatorio);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    // Este metodo determina el comportamineto del hilo
    public void run() {
        // Se le agrega una imagen al label
        label.setIcon(new ImageIcon(getClass().getResource("Imagenes//Autobus6.png")));
        Dimension sizeBus = label.getPreferredSize();
        label.setBounds(150, 100, sizeBus.width, sizeBus.height);
        i = 219;
        
        // Realiza el movimiento del label
        do {
            label.setLocation(coordenadasX[i] - 20, coordenadasY[i] - 20);

            int coordX=coordenadasX[i];
            int coordY=coordenadasY[i];

            Ubicaciones.setBus6(coordX,coordY);
            // Revisa si el autobus se encuentra en la parada Ciudad Deportiva Rafael Ángel
            // Pérez
            if (coordX == 244 && coordY == 497) {
                parada();
                setMensaje("El autobus 1 se encuentra en la parada Ciudad Deportiva Rafael Ángel Pérez");
            }
            // Revisa si el autobus se encuentra en la parada Super Lian, Hatillo
            if (coordX == 264 && coordY == 480) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Plásticos Tosso
            if (coordX == 405 && coordY == 461) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Parqueo De Yamuni, San
            // Francisco
            if (coordX == 338 && coordY == 336) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Colegio María Auxiliadora
            if (coordX == 364 && coordY == 304) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Escuela Juan Rafael Mora
            if (coordX == 450 && coordY == 277) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Hotel Caribbean, Amón
            if (coordX == 599 && coordY == 238) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Parque San Francisco
            if (coordX == 850 && coordY == 180) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Liceo Nocturno José Joaquín
            // Jiménez Nuñez
            if (coordX == 933 && coordY == 138) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Acueductos Y Alcantarillados
            // Guadalupe
            if (coordX == 975 && coordY == 104) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Rotonda De Betania
            if (coordX == 987 && coordY == 230) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Colegio Salesiano Don Bosco
            if (coordX == 954 && coordY == 450) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Escuela República Dominicana
            if (coordX == 894 && coordY == 649) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Abastecedor Los Sauces
            if (coordX == 811 && coordY == 654) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Parque De Monte Azul
            if (coordX == 619 && coordY == 659) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Cevichería Costa Azul
            if (coordX == 592 && coordY == 667) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Taller Gernon
            if (coordX == 326 && coordY == 667) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Plaza América
            if (coordX == 309 && coordY == 642) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Rest. La Fortuna, Hatillo 4
            if (coordX == 276 && coordY == 563) {
                parada();
            }
            // Revisa si el autobus se encuentra en la parada Terminal Hatillo
            if (coordX == 311 && coordY == 500) {
                parada();
            }
            if (i == 285) {

                i = 0;
            } else {
                i++;
            }

            int min = 300;
            int max = 400;
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;

            // Comprueba si esta apunto de adelalntar al autobus de enfrente
            if (coordX == Ubicaciones.getBus5()[0] && coordY == Ubicaciones.getBus5()[1]) {
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(aleatorio);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        } while (flag = !false);

    }

    // Este metodo cambia la variable flag a false para que al detener el hilo se
    // termine la ejecucion del ciclo do while
    public static void stopImgMv() {
        flag = false;
    }

    //Metodos set y get para el mensaje que dara el autobus dependiendo de la parada en la que se encuentre
    public void setMensaje(String MENSAJE) {
        mensaje = MENSAJE;
    }

    public static String getMensaje() {
        return mensaje;
    }
}
