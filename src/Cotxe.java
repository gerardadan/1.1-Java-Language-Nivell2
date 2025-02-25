public class Cotxe 
{
    static String model;
    final int potencia;
    static final String marca = "Seat";

    public Cotxe(String model, int potencia)
    {
        Cotxe.model = model;
        this.potencia = potencia;
    }

    public static void frenar()
    {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar()
    {
        System.out.println("El vehicle està accelerant");
    }

    public void getCarAttributes()
    {
        System.out.println("Marca -> " + marca);
        System.out.println("Model -> " + model);
        System.out.println("Potencia -> " + potencia);
        System.out.println();
    }

}
