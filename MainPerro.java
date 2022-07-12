package semana_2;

public class MainPerro {

    public static void main(String[] args) {
        Perro felipe = new Perro(2012, false);

        Integer edadFelipe = felipe.calcularEdad(2022);
        System.out.println("La edad de Felipe es: " + edadFelipe);

        boolean sePierdeFelipe = felipe.sePierdeFacil();
        System.out.println("Felipe se pierde facil? " + sePierdeFelipe);

    }
}
