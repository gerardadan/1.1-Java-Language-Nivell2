//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cotxe.model = "Leon";
        //Cotxe.potencia = 120;
        //Cotxe.marca = "Test";
        System.out.println("Class cotxe:");
        System.out.println("Marca -> " + Cotxe.marca);
        System.out.println("Model -> " + Cotxe.model);
        //System.out.println("Potencia -> " + Cotxe.potencia);
        System.out.println();
        Cotxe.frenar();

        Cotxe cotxe1 = new Cotxe("panda", 70);
        System.out.println("Instance of class cotxe1");
        cotxe1.getCarAttributes();
        cotxe1.accelerar();

        Cotxe cotxe2 = new Cotxe("ibiza", 100);
        System.out.println("Instance of class cotxe1");
        cotxe2.getCarAttributes();

        System.out.println("Instance of class cotxe1");
        cotxe1.getCarAttributes();

        System.out.println("Instance of class cotxe2");
        cotxe2.getCarAttributes();
    }
}