package demo;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente() {
        this.saldo = 0;
    }
    public CuentaCorriente(CuentaCorriente c) {
        this.saldo = c.getSaldo();
    }
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double monto){
        if(monto < 0)
            throw new RuntimeException("El monto no puede ser negativo");
        this.setSaldo(this.saldo+monto);
    }
    public void egreso(double monto){
        if(monto < 0)
            throw new RuntimeException("El monto no puede ser negativo");
        this.setSaldo(this.saldo-monto);
    }
    public void reintegro(double monto){
        if(monto < 0)
            throw new RuntimeException("El monto no puede ser negativo");
        this.setSaldo(this.saldo+monto);
    }
    public void transferencia(double monto, CuentaCorriente cuentaDestino){
        if(monto < 0)
            throw new RuntimeException("El monto no puede ser negativo");
        this.egreso(monto);
        cuentaDestino.ingreso(monto);
    }


    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
