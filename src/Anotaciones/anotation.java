package Anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class anotation {

    @Retention(RUNTIME)
    @Target(METHOD)
    public @interface Log{
        //Valores level() default Valores.UNO;
    }


}
/*
public enum Valores{
    UNO,DOS,TRES;
}

 */