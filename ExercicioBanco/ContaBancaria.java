public class ContaBancaria {
    private float saldo;
    private EstadoConta estado;

    public ContaBancaria(float depositoInicial){
        setSaldo(depositoInicial);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public EstadoConta getEstado() {
        return estado;
    }

    public void setEstado(EstadoConta estado) {
        this.estado = estado;
    }

}