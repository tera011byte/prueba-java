package EntradasSalidas;

import java.io.Serializable;

public class Persona implements Serializable {
        private String name;
        private int matricula;
        private transient String password;

    public Persona() {
    }

    public Persona(String name, int matricula, String password) {
        this.name = name;
        this.matricula = matricula;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
