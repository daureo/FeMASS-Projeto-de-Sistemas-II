public class Negativa implements EstadoConta{
    
    private ContaBancaria conta;

    public Negativa(ContaBancaria conta){
        this.conta = conta;
    }

    public void sacar(float valor){
        System.out.println("Sacando Negativa");
    }
    public void depositar(float valor){
        System.out.println("Depositando Negativa");
    }
}
