package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        //Creacion de Stream
        Stream<Integer> num = Stream.of(1,2,3,4,5);

        //Creacion a partir de de un ArrayList
        List<String> al = List.of("one", "two", "Three", "two");
        Stream<String> stAl = al.stream();

        //contar los objetos
        System.out.println(num.count());

        //Stream de elementos unicos no duplicados
        Stream<String> uniq = al.stream().distinct();
        Consumer<String> prin = c -> System.out.println(c);
        uniq.forEach(prin);

        //limit y skip
        List<String> Ex = List.of("one", "two", "Three", "two");
        Stream<String> limEx = Ex.stream();
        Stream<String> skEx = Ex.stream();

        Stream lim = limEx.limit(2);
        System.out.println("Limit");
        lim.forEach(prin);

        Stream sk = skEx.skip(1);
        System.out.println("Skip");
        sk.forEach(prin);

        //alguna coincidencia anyMatch
        //todas las coincidencias allMAtch
        //Ninguna coincidencia noneMatch

        List<String> matc = List.of("osnes", "tswos", "Thsrees", "tswo");
        Stream<String> any = matc.stream();
        Stream<String> all = matc.stream();
        Stream<String> non = matc.stream();

        System.out.println(any.anyMatch(s -> s.endsWith("o")));//True
        System.out.println(all.allMatch(s -> s.contains("T")));//False
        System.out.println(non.noneMatch(s -> s.contains("W")));//True

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hi");
        arr.add("Baby");

        System.out.println(arr.toString());

        //utilizacion de filter
        List<List<String>> datos = Arrays.asList(Arrays.asList("Gema","Maria","Carlos"), Arrays.asList("Laura","Ana","Luis"));
        System.out.println(datos.stream()
                .flatMap(I->I.stream().map(s->s.length()))
                .filter(n->n>4)
                .count());
        List<List<String>> datos2 = Arrays.asList(Arrays.asList("Gema","Maria","Carlos"), Arrays.asList("Laura","Ana","Luis"));

        Stream<String> aplain = datos2.stream().flatMap(I-> I.stream());
        aplain.forEach(prin);

        //dado un array tridimencional mostrar el valor mas alto
        Integer [][] array = {{8,3,5},{2,11,7},{4,1,9,6}};
        System.out.println(Arrays.stream(array)//conevrtimos a stream
                .flatMap(I-> Arrays.stream(I))//Aplanamos a un solo stream
                .mapToInt(n->n)//convertimos a int
                .max()//buscamos el maximo
                .getAsInt());//mostramos el maximo
        //intento kata
        int m = 10;
        ArrayList<String> binary = new ArrayList<>();
        binary.add(Integer.toBinaryString(m));
        String f = Integer.toBinaryString(m);
        char[] df = f.toCharArray();
        int cont = 0;
        for(char c: df){
            if(c == '1') cont++;
        }
        System.out.println(cont);

        //metodo peek regresa un stream identico
        Stream<Integer> nums = Stream.of(20,5,8,3,9);

        Stream<Integer> peek = nums.filter(n-> n%2==0).peek(z-> System.out.println(z));
        Consumer<Integer> printer = c -> System.out.println(c);
        //System.out.println("peek:" );
        //peek.forEach(printer);

        //Ejercicio suma los 3 primeros pares mas pequeños del Stream

        Stream<Integer> example = Stream.of(11,20,5,8,3,9,4,10,2);

        Stream<Integer> pares = example.filter(n-> n%2==0).sorted();
        System.out.println("Suma de los 3 primeros pares");
        System.out.println(pares.limit(3).reduce((a,b)->a+b).get());

        //Referencias a metodos.
        Stream<Persona> per = Stream.of(new Persona(123,"Lucy"),
                                        new Persona(456,"Claudia"));
        //ejemplo usando lambdas
        //Map<Integer,String> mapping = per.collect(Collectors.toMap(p->p.getDni(), p->p.getName()));

        //ejemplo usando referencias a metodos.
        Map<Integer,String> mapRef = per.collect(Collectors.toMap(Persona::getDni, Persona::getName));

        System.out.println(mapRef);

    }
}
