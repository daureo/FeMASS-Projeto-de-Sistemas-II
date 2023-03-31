public class Andamento implements EstadoHospedagem{
    private SaidaPrevista saidaPrevista;
    private EntradaEfetiva entradaEfetiva;
    private Quarto quarto;

    public void setSaidaPrevista(SaidaPrevista saida){
        this.saidaPrevista = saida;
    }

    public SaidaPrevista getSaidaaPrevista(){
        return this.saidaPrevista;
    }

    public void setEntradaEfetiva(EntradaEfetiva entrada){
        this.entradaEfetiva = entrada;
    }   

    public EntradaEfetiva getEntradaEfetiva(){
        return this.entradaEfetiva;
    }

    public void setQuarto(Quarto quarto){
        this.quarto = quarto;
    }   

    public Quarto getQuarto(){
        return this.quarto;
    }

    public void reservar(){

    } 
    public void checkIn(){
 
    } 
    public void checkOut(){
 
    } 
}
