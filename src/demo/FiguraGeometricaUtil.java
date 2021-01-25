package demo;

public class FiguraGeometricaUtil {

    public static double areaPromedio(FiguraGeometrica arr[]){
        double areaProm = 0;
        for (FiguraGeometrica f: arr) {
            areaProm+= f.area();
        }
        return  areaProm;
    }
}
