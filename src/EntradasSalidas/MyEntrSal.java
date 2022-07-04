package EntradasSalidas;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MyEntrSal {
    public static void main(String[] args) {
        String dir = "C:\\Users\\w10\\Documents\\Proyects\\HelloWord\\src\\EntradasSalidas\\texto.txt";

        try {
            FileReader fr = new FileReader(dir);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true){
                try {
                    if (!((line= br.readLine())!=null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
/*
        try(BufferedReader in = new BufferedReader(new InputStreamReader((System.in))) ){
            System.out.println("Input: ");
            String input = in.readLine();
            System.out.println("Echo: " + input);
        } catch (
                IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
*/
        //escritura con File
        /*try{
            Path pt = Path.of("C:\\Users\\w10\\Documents\\Proyects\\HelloWord\\src\\EntradasSalidas\\texto.txt");
            Files.writeString(pt,"\nEscrito desde File", StandardCharsets.UTF_8, StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        List<String>data = List.of("Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
        try{
            Path pt1 = Path.of("C:\\Users\\w10\\Documents\\Proyects\\HelloWord\\src\\EntradasSalidas\\texto.txt");
            Files.write(pt1,data, StandardCharsets.UTF_8, StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }*/

        //Leer lineas de un fichero e imprimir las que contengas mas de 10 caracteres
        try {
            FileReader fr = new FileReader(dir);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true){
                try {
                    if (!((line= br.readLine())!=null)) break;
                    if(line.length() > 10) System.out.println(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Path pa = Path.of( "C:\\Users\\w10\\Documents\\Proyects\\HelloWord\\src\\EntradasSalidas\\texto.txt");
        System.out.println("Usando Files");
        try {
            Files.lines(pa).filter(s -> s.length()>10).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path p1 = Path.of("temp\\..\\level\\.\\files\\texto.txt");
        Path p2 = p1.normalize();
        Path p3 = p1.relativize(p2);

        System.out.println("p3: "+p2.toString());
    }

}
