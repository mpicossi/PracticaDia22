package demo;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }
    public Contador() {
        this.valor = 0;
    }
    public Contador(Contador c) {
        this.valor = c.getValor();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar(int numero){
        setValor(this.valor + numero);
    }

    public void decrementar(int numero){
        setValor(this.valor - numero);
    }
}
