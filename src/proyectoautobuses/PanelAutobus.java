package proyectoautobuses;

import java.util.ArrayList; 
import javax.swing.JPanel;

public class PanelAutobus extends JPanel
{
    private ArrayList<Autobus> autobuses = new ArrayList<Autobus>();

    public void add(Autobus b)
    {
        autobuses.add(b);
    }
}
