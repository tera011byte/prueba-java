package ControlExcepciones;

import java.io.*;

public class MyException {
    public static void main(String[] args) {
        try {
            int a = 4/0;
        }catch (ArithmeticException e ){
            System.out.println("Division entre cero" + e.getMessage());
        }finally {
            System.out.println("Finally");
        }
        System.out.println("no entra a catch");
        try {
            double a = 4/0.0;
        }catch (ArithmeticException e ){
            System.out.println("Division entre cero" + e.getMessage());
        }finally {
            System.out.println("Finally");
        }

        //try con recursos
        try(BufferedReader in = new BufferedReader(new InputStreamReader((System.in))) ){
            System.out.println("Input: ");
            String input = in.readLine();
            System.out.println("Echo: " + input);
        } catch (
                IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }
    //Propagacion de excepciones se usa en el metodo en este caso metodo()
    public void metodo() throws IOException {
        String dir = "\\dir\\t.txt";
        FileReader fr = new FileReader(dir);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

    }
}
