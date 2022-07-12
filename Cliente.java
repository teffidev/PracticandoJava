package semana_2;

public class Cliente {
    //atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //constructor

    public Cliente (Integer numero, String nombre){
        this.numeroCliente = numero;
        this.nombre = nombre;
    }

    //metodos
    public void incrementarDeuda(Double valor){
        deuda = deuda + valor;
    }

    public void pagarDeuda(){
        //logica
    }

}
