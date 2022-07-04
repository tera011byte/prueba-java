package Mini;

public abstract class Vehiculo {
    private int neumaticos;
    private String motor;
    private int modelo;

    public Vehiculo(int neumaticos, String motor, int modelo) {
        this.neumaticos = neumaticos;
        this.motor = motor;
        this.modelo = modelo;
    }
    public void mensaje(){
        System.out.println("soy un Vehiculo desde la clase padre");
    }
    abstract void metodo(int neumaticos);

    public int getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(int neumaticos) {
        this.neumaticos = neumaticos;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
