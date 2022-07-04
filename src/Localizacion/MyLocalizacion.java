package Localizacion;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocalizacion {
    //Locale loc = new Locale("EN");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ResourceBundle rb = ResourceBundle.getBundle("mensajes", new Locale("es"));

        System.out.println("dato1: " + rb.getString("dato1"));
        System.out.println("dato2: " + rb.getString("dato2"));

    }
}
