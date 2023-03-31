public abstract class Pessoa {
    
    protected String nome;
    protected Double rendaBruta;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaBruta() {
        return this.rendaBruta;
    }

    public void setRendaBruta(Double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }


    public abstract Double calcularIR();

}