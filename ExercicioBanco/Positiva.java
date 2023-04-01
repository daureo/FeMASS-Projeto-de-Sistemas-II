public class Positiva implements EstadoConta{
    private ContaBancaria conta;


    public Positiva(ContaBancaria conta){
        this.conta = conta;
    }

    public void sacar(float valor){

        if (valor <= this.conta.getSaldo()-100){
            if (this.conta.getSaldo()-valor<0){

                this.conta.setSaldo(this.conta.getSaldo()-valor);
                this.conta.setEstado(new Negativa(this.conta));

            } else {
                this.conta.setSaldo(this.conta.getSaldo()-valor);
            }
        } else {
            System.out.println("Você não pode realizar essa operação!");
        }
    }

    public void depositar(float valor){
        this.conta.setSaldo(this.conta.getSaldo()+valor);
    }
}
