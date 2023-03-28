package proyectoautobuses.pk_Server;

public class Ubicaciones 
{
    //Declaracion de variables
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

    
    //Set y get para las coordenadas de todos los autobuses
    public static void setBus1(int coordenadasX, int coordenadasY)
    {
        bus1[0]=coordenadasX;
        bus1[1]=coordenadasY;
    }
    public static void setBus2(int coordenadasX, int coordenadasY)
    {
        bus2[0] = coordenadasX;
        bus2[1] = coordenadasY;
    }
    public static void setBus3(int coordenadasX, int coordenadasY)
    {
        bus3[0] = coordenadasX;
        bus3[1] = coordenadasY;
    }
    public void setBus4(int coordenadasX, int coordenadasY)
    {
        bus4[0] = coordenadasX;
        bus4[1] = coordenadasY;
    }
    public static void setBus5(int coordenadasX, int coordenadasY)
    {
        bus5[0] = coordenadasX;
        bus5[1] = coordenadasY;
    }
    public static void setBus6(int coordenadasX, int coordenadasY)
    {
        bus6[0] = coordenadasX;
        bus6[1] = coordenadasY;
    }
    public static void setBus7(int coordenadasX, int coordenadasY)
    {
        bus7[0] = coordenadasX;
        bus7[1] = coordenadasY;
    }
    public static void setBus8(int coordenadasX, int coordenadasY)
    {
        bus8[0] = coordenadasX;
        bus8[1] = coordenadasY;
    }
    public static void setBus9(int coordenadasX, int coordenadasY)
    {
        bus9[0] = coordenadasX;
        bus9[1] = coordenadasY;
    }
    public void setBus10(int coordenadasX, int coordenadasY)
    {
        bus10[0]=coordenadasX;
        bus10[1]=coordenadasY;
    }

    public int[] getBus1()
    {
        return bus1;
    }
    public static int[] getBus2()
    {
        return bus2;
    }
    public static int[] getBus3()
    {
        return bus3;
    }
    public static int[] getBus4()
    {
        return bus4;
    }
    public static int[] getBus5()
    {
        return bus5;
    }
    public static int[] getBus6()
    {
        return bus6;
    }
    public static int[] getBus7()
    {
        return bus7;
    }
    public static int[] getBus8()
    {
        return bus8;
    }
    public static int[] getBus9()
    {
        return bus9;
    }
    public static int[] getBus10()
    {
        return bus10;
    }
}
