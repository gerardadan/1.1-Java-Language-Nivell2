public class Car
{
    private static String model;
    private final int potencia;
    private static final String marca = "Seat";

    public int getPotencia() {
        return potencia;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static String getMarca() {
        return marca;
    }

    public Car(String model, int potencia)
    {
        Car.model = model;
        this.potencia = potencia;
    }

    public static String curb()
    {
        return "El vehicle està frenant";
    }

    public String accelerate()
    {
        return "El vehicle està accelerant";
    }



}
