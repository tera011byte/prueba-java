package Mini;

public class Auto extends Vehiculo{
    private String marca;

    public Auto(int neumaticos, String motor, int modelo) {
        super(neumaticos, motor, modelo);
    }

    public Auto(int neumaticos, String motor, int modelo, String marca) {
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
    public void metodo(int neumaticos){
        System.out.println("soy un Auto con " + neumaticos + " de la marca " + this.marca);
    }
}
