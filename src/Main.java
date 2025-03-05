//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car.setModel("Leon");
        //Cotxe.potencia = 120;
        //Cotxe.marca = "Test";
        System.out.println("Class cotxe:");
        System.out.println("Marca -> " + Car.getMarca());
        System.out.println("Model -> " + Car.getModel());
        //System.out.println("Potencia -> " + Cotxe.potencia);
        System.out.println(Car.curb());

        Car cotxe1 = new Car("panda", 70);
        System.out.println("Instance of class cotxe1");
        getCarAttributes(cotxe1);
        System.out.println(cotxe1.accelerate());

        Car cotxe2 = new Car("ibiza", 100);
        System.out.println("Instance of class cotxe1");
        getCarAttributes(cotxe2);

        System.out.println("Instance of class cotxe1");
        getCarAttributes(cotxe1);

        System.out.println("Instance of class cotxe2");
        getCarAttributes(cotxe2);


    }

    public static void getCarAttributes(Car cotxe) {
        System.out.println("Marca -> " + cotxe.getMarca());
        System.out.println("Model -> " + cotxe.getModel());
        System.out.println("Potencia -> " + cotxe.getPotencia());
        System.out.println();
    }
}