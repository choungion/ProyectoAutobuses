package proyectoautobuses;

import java.awt.Component;

public class HilosAutobus implements Runnable
{
    private Autobus autobus;
    
    private Component componente;

    public HilosAutobus (Autobus UnAutobus, Component objComponente)
    {
        this.autobus = UnAutobus;
        this.componente = objComponente;
    }

    public void run()
    {
    
    }
}
