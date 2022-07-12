package semana_2;

public class MainCupcake {

    public static void main(String[] args) {

        //ESCENARIO 0 = Se contratan 3 cocineros de cupcakes nuevos y se desea saber
        //Cual es el Cupcake de mejor sabor?

        //Cocinero 1: Manolo
        //Cocinero 2: Maria
        //Cocinero 3: Jacinta

        //Cupcake cupcakeManolo = new Cupcake("Chocolate");
        //Cupcake cupcakeMaria = new Cupcake("Chocolate");
        //Cupcake cupcakeJacinta = new Cupcake("Chocolate");


        Cupcake cupCakeDelfi = new Cupcake("chocolate", "chocolatoso", false, "frambuesa");
        System.out.println("El cupcake de Delfi es de: " + cupCakeDelfi.getSabor());

        Cupcake cupCakeJuanito = new Cupcake("vainilla", "vainilloso", true, "chocolate");
        System.out.println("El cupcake de Juanito es de: " + cupCakeJuanito.getSabor());

        Cupcake cupCakeMatu = new Cupcake("chocolate", "chocolatoso", false, "frambuesa");
        System.out.println("El cupcake de Matu es de: " + cupCakeMatu.getSabor());

        //EL objeto no puede llamar esta funcionalidad!
        //La misma CLASE es la que puede llamar este método:
        Cupcake.setPrecio(300);

        System.out.println("El precio del Cupcake de Delfi es: " + cupCakeDelfi.getPrecio());
        System.out.println("El precio del Cupcake de Delfi es: " + cupCakeJuanito.getPrecio());
        System.out.println("El precio del Cupcake de Delfi es: " + cupCakeMatu.getPrecio());

    }
}
