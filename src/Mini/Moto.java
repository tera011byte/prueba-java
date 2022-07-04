package Mini;

public class Moto extends Vehiculo{
    private String marca;

    public Moto(int neumaticos, String motor, int modelo, String marca) {
        super(neumaticos, motor, modelo);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    void metodo(int neumaticos) {
        System.out.println("Soy una moto de la marca: " + this.marca);
    }
}
