/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoautobuses;

import proyectoautobuses.pk_Cliente.Cliente;
import proyectoautobuses.pk_Server.Mapa;
import proyectoautobuses.pk_Server.Ubicaciones;

/**
 *
 * @author choungion
 */
public class ProyectoAutobuses 
{
    //Clase main del  proyecto
    public static void main(String[] args) 
    {
        new Mapa().setVisible(true);
        new Cliente().setVisible(true);
        new Ubicaciones();
    }
}
