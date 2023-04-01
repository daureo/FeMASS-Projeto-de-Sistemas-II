public class Bloqueada implements EstadoConta{
    
    public void sacar(float valor){
        System.out.println("Sacando Bloqueada");
    }
    public void depositar(float valor){
        System.out.println("Depositando Bloqueada");
    }
}
