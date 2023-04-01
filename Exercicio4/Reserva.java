import java.util.Date;

public class Reserva implements EstadoHospedagem{
    private Date chegadaPrevista;
    private SaidaPrevista saidaPrevista;
    private TipoQuarto tipoQuarto;

    public void setChegadaPrevista(Date chegada){
        this.chegadaPrevista = chegada;
    }

    public Date getChegadaPrevista(){
        return this.chegadaPrevista;
    }

    public void setSaidaPrevista(SaidaPrevista saida){
        this.saidaPrevista = saida;
    }

    public SaidaPrevista getSaidaaPrevista(){
        return this.saidaPrevista;
    }

    public void setTipoQuarto(TipoQuarto quarto){
        this.tipoQuarto = quarto;
    }

    public TipoQuarto getTipoQuarto(){
        return this.tipoQuarto;
    }

    public void reservar(){
        
    }

}
