package demo;

public class Fraccion {

    public static float sumar(float a, float b){
        return a+b;
    }
    public static float sumar(float a, int b){
        return sumar(a,(float)b);
    }
    public static float sumar(int a, float b){
        return sumar((float)a,b);
    }
    public static float sumar(int a, int b){
        return sumar((float)a,(float)b);
    }
    public static float multiplicar(float a, float b){
        return a*b;
    }
    public static float multiplicar(float a, int b){
        return multiplicar(a,(float)b);
    }
    public static float multiplicar(int a, float b){
        return multiplicar((float)a,b);
    }
    public static float multiplicar(int a, int b){
        return multiplicar((float)a,(float)b);
    }
    public static float dividir(float a, float b){
        return a/b;
    }
    public static float dividir(float a, int b){
        return dividir(a,(float)b);
    }
    public static float dividir(int a, float b){
        return dividir((float)a,b);
    }
    public static float dividir(int a, int b){
        return dividir((float)a,(float)b);
    }


}
