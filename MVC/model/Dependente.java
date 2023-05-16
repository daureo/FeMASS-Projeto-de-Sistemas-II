package model;

public class Dependente {
    private Long cartao_dep;
    private String nom_dep;
    private String parentesco;
    private String email_dep;
    private Socio socio;

    public Long regDep(){
        //Logica de registro de um novo dependente
        return this.cartao_dep;
    }

    public Long getCartao_dep() {
      return this.cartao_dep;
    }
    public void setCartao_dep(Long value) {
      this.cartao_dep = value;
    }

    public String getNom_dep() {
      return this.nom_dep;
    }
    public void setNom_dep(String value) {
      this.nom_dep = value;
    }

    public String getParentesco() {
      return this.parentesco;
    }
    public void setParentesco(String value) {
      this.parentesco = value;
    }

    public String getEmail_dep() {
      return this.email_dep;
    }
    public void setEmail_dep(String value) {
      this.email_dep = value;
    }

    public Socio getSocio() {
      return this.socio;
    }
    public void setSocio(Socio value) {
      this.socio = value;
    }
}
