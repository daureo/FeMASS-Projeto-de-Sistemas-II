public class Hospedagem {
    private int nroPessoas;
    private EstadoHospedagem estadoHospedagem;

    public int getNroPessoas(){
        return this.nroPessoas;
    }

    public void setNroPessoas(int nroPessoas){
        this.nroPessoas = nroPessoas;
    }

    public EstadoHospedagem getEstadoHospedagem(){
        return this.estadoHospedagem;
    }

    public void setEstadoHospedagem(EstadoHospedagem estado){
        this.estadoHospedagem = estado;
    }
}
