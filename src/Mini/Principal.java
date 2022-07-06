package Mini;

public class Principal {
    public static void main(String[] args) {
        Auto maserati = new Auto(4,"12 Ciclindros",2020,"Maserati");
        Moto harley = new Moto(2, "2 Cilindros", 2020, "Harley Davison");

        maserati.metodo(4);
        harley.metodo(2);

        maserati.mensaje();
        harley.mensaje();

        Vehiculo vehi = new Vehiculo(4, "motor", 2000) {
            @Override
            void metodo(int neumaticos) {
                System.out.println("soy clase padre");
            }
        };

        vehi.metodo(4);

        }

    }

