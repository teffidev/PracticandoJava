package semana_2;

public class Perro {
    //atributos
    private boolean enAdopcion;
    private String raza;
    private Integer anioNacimiento;
    private Double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;


    //constructor
    public Perro(Integer anioNacimiento, boolean tieneChip){
        this.anioNacimiento = anioNacimiento;
        this.tieneChip= tieneChip;
    }

    public Perro(boolean enAdopcion, String raza, Integer anioNacimiento, Double peso,
                 boolean tieneChip, boolean estaLastimado, String nombre) {
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }


    //metodos
    public Integer calcularEdad(Integer anioActual){
        return anioActual - this.anioNacimiento;
    }

    public boolean sePierdeFacil(){
        if (this.tieneChip == true){
            return false;
        }else {
            return true;
        }
    }

    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
