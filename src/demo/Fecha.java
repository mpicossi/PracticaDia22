package demo;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    private Date fecha;

    public Fecha(Date fecha) {
        this.fecha = fecha;
    }
    public Fecha() {
        this.fecha = GregorianCalendar.getInstance().getTime();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void sumarDia(){

        Calendar gc = GregorianCalendar.getInstance();
        gc.setTime(this.getFecha());
        gc.add(Calendar.DAY_OF_YEAR,1);

        this.setFecha(gc.getTime());

    }
    public static boolean validaFecha(int dia, int mes, int anio){
        Calendar gc = GregorianCalendar.getInstance();
        gc.setLenient(false);
        gc.set(anio,mes,dia);
        try {
            new SimpleDateFormat("dd/MM/yyyy").format(gc.getTime());
            return true;
        } catch (final Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "fecha=" + fecha +
                '}';
    }
}
