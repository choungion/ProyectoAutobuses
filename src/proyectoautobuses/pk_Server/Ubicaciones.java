package proyectoautobuses.pk_Server;

public class Ubicaciones 
{
    //Declaracion de variables
    private int[] bus1 = new int[2];
    private int[] bus2 = new int[2];
    private int[] bus3 = new int[2];
    private int[] bus4 = new int[2];
    private int[] bus5 = new int[2];
    private int[] bus6 = new int[2];
    private int[] bus7 = new int[2];
    private int[] bus8 = new int[2];
    private int[] bus9 = new int[2];
    private int[] bus10 = new int[2];

    //Set y get para las coordenadas de todos los autobuses
    public void setBus1(int[] coordenadas)
    {
        bus1 = coordenadas;  
        System.out.println(bus1[0]+","+bus1[1]);
    }
    public void setBus2(int[] coordenadas)
    {
        bus2 = coordenadas;
    }
    public void setBus3(int[] coordenadas)
    {
        bus3 = coordenadas;
    }
    public void setBus4(int[] coordenadas)
    {
        bus4 = coordenadas;
    }
    public void setBus5(int[] coordenadas)
    {
        bus5 = coordenadas;
    }
    public void setBus6(int[] coordenadas)
    {
        bus6 = coordenadas;
    }
    public void setBus7(int[] coordenadas)
    {
        bus7 = coordenadas;
    }
    public void setBus8(int[] coordenadas)
    {
        bus8 = coordenadas;
    }
    public void setBus9(int[] coordenadas)
    {
        bus9 = coordenadas;
    }
    public void setBus10(int[] coordenadas)
    {
        bus10 = coordenadas;
    }

    public int[] getBus1()
    {
        return bus1;
    }
    public int[] getBus2()
    {
        return bus2;
    }
    public int[] getBus3()
    {
        return bus3;
    }
    public int[] getBus4()
    {
        return bus4;
    }
    public int[] getBus5()
    {
        return bus5;
    }
    public int[] getBus6()
    {
        return bus6;
    }
    public int[] getBus7()
    {
        return bus7;
    }
    public int[] getBus8()
    {
        return bus8;
    }
    public int[] getBus9()
    {
        return bus9;
    }
    public int[] getBus10()
    {
        return bus10;
    }
}
