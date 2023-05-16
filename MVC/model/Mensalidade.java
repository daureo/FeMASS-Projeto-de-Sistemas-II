package model;

import java.util.Date;

public class Mensalidade {
    private Date data_mens;
    private Double valor_mens;
    private Date data_pgto_mens;
    private Double juros_mens;
    private Double valor_pago;
    private Boolean quit_mens;

    public String consMens() {
        return "Dados Mensalidade";
    }

    public Double calcJuros(){
        return 2.33;
    }
    
    public int quitarMens(){
        this.quit_mens = !this.quit_mens;
        return 1;
    }

    public Date getData_mens() {
      return this.data_mens;
    }
    public void setData_mens(Date value) {
      this.data_mens = value;
    }

    public Double getValor_mens() {
      return this.valor_mens;
    }
    public void setValor_mens(Double value) {
      this.valor_mens = value;
    }

    public Date getData_pgto_mens() {
      return this.data_pgto_mens;
    }
    public void setData_pgto_mens(Date value) {
      this.data_pgto_mens = value;
    }

    public Double getJuros_mens() {
      return this.juros_mens;
    }
    public void setJuros_mens(Double value) {
      this.juros_mens = value;
    }

    public Double getValor_pago() {
      return this.valor_pago;
    }
    public void setValor_pago(Double value) {
      this.valor_pago = value;
    }
}
