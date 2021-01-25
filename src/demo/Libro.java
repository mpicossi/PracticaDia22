package demo;

public class Libro {
    private String nombre;
    private long isbn;
    private String autor;
    private boolean prestado;

    public Libro() {
        this.nombre = "";
        this.isbn = 0;
        this.autor = "";
    }

    public Libro(String nombre, long isbn, String autor) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public void prestamo(){
        this.setPrestado(true);
    }
    public void devolucion(){
        this.setPrestado(false);
    }
    //Si dejamos el Override y cambiamos el nombre del metodo tostring() nos dara un error ya que no estamos
    // sobre-escribiendo el metodo toString() heredado de Object.
    @Override
    public String toString() {
        return  nombre +", "+ isbn +", "+ autor;
    }
}
