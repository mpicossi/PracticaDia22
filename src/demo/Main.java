package demo;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

       /* Fecha f = new Fecha();
        System.out.println(f.toString());
        System.out.println("Es valida la fecha "+Fecha.validaFecha(10,14,2021));*/
        /*CuentaCorriente c = new CuentaCorriente(100.0);
        CuentaCorriente d = new CuentaCorriente(200.0);


        c.ingreso(100.0);
        c.transferencia(100,d);

        System.out.println(c);
        System.out.println(d);*/

        /*Password pFuerte = new PasswordFuerte();
        Password pIntermedia = new PasswordIntermedia();
        Password pSimple = new PasswordSimple();

        pFuerte.setValue("pruebaPass2");
        pIntermedia.setValue("pruebapass2");
        pSimple.setValue("12345678");*/

        FiguraGeometrica[] arr = new FiguraGeometrica[3];

        arr[0] = new Circulo(5.2);
        arr[1] = new Triangulo(67,12.5);
        arr[2] = new Rectangulo(20.2,30.4);

        System.out.println("El area promedio de las figuras es: "+FiguraGeometricaUtil.areaPromedio(arr));

    }

}
